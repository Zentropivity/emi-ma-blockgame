#!/usr/bin/nu

# script to generate BlockGame item definitions from PenguinTheFluffy's resource pack that uses Chime
# run in .../assets/minecraft/overrides/item

let ll = ls | get name | filter {$in =~ '^.*\.json$'}

let ll = $ll | par-each { |it| [[mc_item, bg_items]; [ ($it | parse '{item}.json' | $in.item | str upcase ), (open $it | $in.overrides | get predicate | each { $in | get -i nbt | get -i MMOITEMS_ITEM_ID }) ]] } | flatten

# so we have [mc_item, bg_items] table
# -> turn them into [bg_item, mc_item]

let ll = $ll | each {|it| $it | get bg_items | each { [[bg_item, mc_item]; [$in, $it.mc_item.0]]} | flatten | uniq-by bg_item }

let ll = $ll | flatten

#NOTE SEE_BREATHER is duplicate
# echo ($ll | uniq-by -c bg_item | where count > 1)
# echo ($ll | where bg_item == SEE_BREATHER)

let ll = $ll | uniq-by bg_item | sort-by bg_item
#NOTE 908 unique items
# diff this every regeneration
# echo $ll
$ll | to tsv | save -f items_cache.tsv

# generate java code
let start = "  public static final EmiStack"
let code = ($start ++ ($ll | par-each {|it| $"    ($it.bg_item) = createItem\(Items.($it.mc_item), \"($it.bg_item)\", \"(
  $it.bg_item | str downcase | split row "_" | each {$in | str capitalize} | str join ' '
)\"\),"}) ++ ";")

$code | to text | save -f code_gen.java

#NOTE generation may not be perfect
#FIXME manually
# - SEE_BREATHER is SEA_PICKLE (not PUFFERFISH)
#
# Some item ids cannot be keys, so fix:
# - ROTTEN_MAW_COMPASS
# - KROGNARS_BASTION_COMPASS
# - SUNKEN_CELLS_COMPASS
# - FILTER
