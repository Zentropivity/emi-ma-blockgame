#!/usr/bin/nu

# script to generate NPC recipe categories from the csv data that Nelas sent to me
# if running again, be sure to fix up vanilla recipe names, may need to be added to is_vanilla for the check
# + RUNE_CARVER -> RUNECARVER
# + FISHING_POLE -> FISHINGPOLE

def tr [key: string] {
  let out = {
    MEGA-MUSHROOM: MEGA_MUSHROOM
    MINI-MUSHROOM: MINI_MUSHROOM
  } | get -i $key

  if ($out == null) {
    $key
  } else {
    $out
  }
}

def tr_item_tier [tier: string] {
  {
    WOODEN: 1
    BRASS: 2
    SKYSTEEL: 3
    SHIMMERGLASS: 4
    MAGISTEEL: 5
  } | get -i $tier
}

def tr_armor_tier [tier: string] {
  {
    ASPIRANT: 1
    INITIATE: 2
    JOURNEYMAN: 3
    EXPERT: 4
    MASTER: 5
  } | get -i $tier
}

def tr_armor [name: string] {
  def tr_armor_prof [profession: string] {
    {
      ARCHAEOLOGISTS: ARCHAEOLOGIST
      BOTANISTS: BOTANIST
      MINERS: MINER
      FISHERMANS: FISHERMAN
      LUMBERJACKS: LUMBERJACK
      RUNECARVERS: RUNECARVER
    } | get -i $profession
  }
  def tr_piece [piece: string] {
    {
      CAP: HELMET
      VEST: CHESTPLATE
      PANTS: LEGGINGS
      BOOTS: BOOTS
    } | get -i $piece
  }

  $name | split row "_" | [(tr_armor_prof $in.1), (tr_piece $in.2), (tr_armor_tier $in.0)] | str join '_'
}

def tr_prof [profession: string] {
  {
    ARCHAEOLOGIST: ARCHAEOLOGY
    BOTANIST: HERBALISM
    MINER: MINING
    FISHERMAN: FISHING
    LUMBERJACK: LOGGING
    RUNECARVER: RUNECARVING
  } | get -i $profession
}

def tr_augment [vendor: string, name: string] {
  let v = tr_prof ($vendor | split row "_" | get 0)
  let t = tr_item_tier ($name | split row "_" | get 0)
  $"AUGMENT_($v)_($t)"
}

def is_vanilla [item: string] {
  $item in [
    FLINT, GRAVEL, RED_SAND, SAND, RAW, GLOW_BERRY, SWEET_BERRY,
    SPORE_BLOSSOM, ROSE_BUSH, LILY_OF_THE_VALLEY, FLOWERING_AZALEA_LEAVES, AZALEA_LEAVES,
    DARK_OAK_LEAVES, ACACIA_LEAVES, JUNGLE_LEAVES, BIRCH_LEAVES, SPRUCE_LEAVES, OAK_LEAVES, MANGROVE_LEAVES,
    FLOWERING_AZALEA, AZALEA, DARK_OAK_SAPLING, ACACIA_SAPLING, JUNGLE_SAPLING, BIRCH_SAPLING, SPRUCE_SAPLING, OAK_SAPLING, MANGROVE_SAPLING,
    COPPER_INGOT, IRON_INGOT, LAPIS_LAZULI, GOLD_INGOT, DIAMOND, AMETHYST_BLOCK, SEA_LANTERN, CRYING_OBSIDIAN
  ]
}

def tr_output [vendor: string, item_type: string, item_name: string] {
  if ($item_type == "AUGMENT") {
    {name: (tr_augment $vendor $item_name), vanilla: false}
  } else if ($item_type == "ARMOR") {
    {name: (tr_armor $item_name), vanilla: false}
  } else if ($item_type == "TOOL") {
    {name: $item_name, vanilla: false}
  } else {
    let out = tr $item_name
    {name: $out, vanilla: (is_vanilla $out)}
  }
}

def tr_mat [csv: table, name: string] {
  let row = $csv | where ITEMNAME == $name
  if ($row | is-empty) {
    let out = tr $name
    if (is_vanilla $out) {
      {name: $out, vanilla: true}
    } else {
      {name: $out, vanilla: false}
    }
  } else {
    let row = $row.0
    tr_output $row.VENDOR $row.ITEMTYPE $name
  }
}

def to_emi_stack [item] {
  let vanilla = $item.vanilla
  let count = $item.count | into int
  let name = $item.name
  if $vanilla {
    if $count > 1 {
      $"EmiStack.of\(Items.($name),($count)\)"
    } else {
      $"EmiStack.of\(Items.($name)\)"
    }
  } else {
    if ($count > 1) {
      $"BlockGameItems.($name).copy\(\).setAmount\(($count)\)"
    } else {
      $"BlockGameItems.($name)"
    }
  }
}

# recipe("repair/normal/uncommon", 10,
#     EmiStack.of(Items.PUFFERFISH, 32),
#     BlockGameItems.REPAIR_POWDER_UNCOMMON);

def ser_recipe [rec: any] {
  let id_end = $rec.output.name | split row "_" | last 2 | each {|n| $n | str downcase} | str join '/'
  let id = $"($rec.vendor | split row "_" | first 1 | get 0 | str downcase)/($rec.itemtype)/($id_end)"
  if (($rec.ingredients | length) == 1) {
    let ing = $rec.ingredients.0
    $"recipe\(($id),($rec.coincost),(to_emi_stack $ing),(to_emi_stack $rec.output)\);"
  } else {
    let ings = $rec.ingredients | each {to_emi_stack $in} | str join ',
    '
    $"recipe\(($id),($rec.coincost), List.of\(($ings)\),(to_emi_stack $rec.output)\);"
  }
}

def write_class [cat] {
let vendor = $cat.vendor | split row "_" | each {$in | str downcase | str capitalize} | str join ''
let vendor_id = $vendor | str downcase

$"package zentropivity.emimablockgame.vendors;

import java.util.List;

import dev.emi.emi.api.stack.EmiStack;
import net.minecraft.item.Items;
import zentropivity.emimablockgame.item.BlockGameItems;

public class ($vendor) extends AbstractVendor {
  public ($vendor)\(\) {
    super\(\"($vendor_id)\", BlockGameItems.MAGISTEEL_FISHINGPOLE\);

  ($cat.recipes)
}" | save $"($vendor).java"
}

def main [csv: string] {
  # tr MEGA-MUSHROOM
  # tr_armor JOURNEYMAN_ARCHAEOLOGISTS_BOOTS
  # is_vanilla FLINT
  # tr_augment FISHERMAN_FRANKY WOODEN_CLINOMETER
  let csv = open $csv

  let recipes = $csv | par-each {|row|
  let output = (tr_output $row.VENDOR $row.ITEMTYPE $row.ITEMNAME)
  [[vendor, output, coincost, ingredients, itemtype];[$row.VENDOR,
    {
      name: $output.name,
      vanilla: $output.vanilla,
      count: 1
    },
    $row.COINCOST,
    ($row.MATERIALCOSTAMOUNT | split row " " | enumerate | each {|e|
      let item = ($row.MATERIALCOST | split row " " | get $e.index | tr_mat $csv $in)
      {
        name: $item.name,
        vanilla: $item.vanilla,
        count: $e.item
      }
    }), ($row.ITEMTYPE | str downcase)]]} | flatten
  # $recipes | group-by vendor | transpose vendor recipes
  $recipes | group-by vendor | transpose vendor recipes | select vendor recipes | par-each {|cat|
    [[vendor,recipes];[$cat.vendor, ($cat.recipes | each {|rec| ser_recipe $rec }| str join ',

')]]
  } | each {|cat| write_class $cat}
  # to_emi_stack {name: MINER_CHESTPLATE_3, vanilla: false, count: 1}
# single recipe
# ╭─────────────┬──────────────────────────────────────────╮
# │ vendor      │ RUNECARVER_BROKKR                        │
# │             │ ╭─────────┬─────────────────────╮        │
# │ output      │ │ name    │ RUNECARVER_HELMET_1 │        │
# │             │ │ vanilla │ false               │        │
# │             │ │ count   │ 1                   │        │
# │             │ ╰─────────┴─────────────────────╯        │
# │ coincost    │ 25                                       │
# │             │ ╭───┬────────────────┬─────────┬───────╮ │
# │ ingredients │ │ # │      name      │ vanilla │ count │ │
# │             │ ├───┼────────────────┼─────────┼───────┤ │
# │             │ │ 0 │ PRISTINE_STONE │ false   │ 8     │ │
# │             │ │ 1 │ PRISTINE_HIDE  │ false   │ 8     │ │
# │             │ │ 2 │ GOLD_INGOT     │ true    │ 4     │ │
# │             │ ╰───┴────────────────┴─────────┴───────╯ │
# ╰─────────────┴──────────────────────────────────────────╯
}
