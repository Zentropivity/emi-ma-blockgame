package zentropivity.emimablockgame.vendors;

import java.util.List;

import dev.emi.emi.api.stack.EmiStack;
import net.minecraft.item.Items;
import zentropivity.emimablockgame.item.BlockGameItems;

public class BlacksmithMarkus extends AbstractVendor {
  public BlacksmithMarkus() {
    super("blacksmithmarkus", BlockGameItems.MAGISTEEL_INGOT);

    sameOutRecipes("weapon/pommel", 0, 5, List.of(List.of(
        BlockGameItems.PRISTINE_STONE,
        BlockGameItems.PRISTINE_WOOD,
        BlockGameItems.PRISTINE_HIDE),
        List.of(
            BlockGameItems.PRISTINE_STONE,
            BlockGameItems.PRISTINE_WOOD,
            BlockGameItems.ZOMBIE_LEATHER)),
        List.of(BlockGameItems.WEAPON_POMMEL));

    recipe("mythril/scrap", 50, List.of(
        EmiStack.of(Items.COAL, 8),
        EmiStack.of(Items.IRON_INGOT),
        BlockGameItems.ESSENCE_FIERY),
        BlockGameItems.MYTHRIL_SCRAP);
    recipe("mythril/ingot", 50, List.of(
        BlockGameItems.MYTHRIL_SCRAP.copy().setAmount(8),
        BlockGameItems.METEOR_SHARD,
        BlockGameItems.PRISTINE_STONE.copy().setAmount(2)),
        BlockGameItems.MYTHRIL_INGOT);

    recipe("steel/scrap", 50, List.of(
        EmiStack.of(Items.COAL, 8),
        EmiStack.of(Items.IRON_INGOT),
        BlockGameItems.ESSENCE_ROCKY),
        BlockGameItems.STEEL_SCRAP);
    recipe("steel/ingot", 50, List.of(
        BlockGameItems.STEEL_SCRAP.copy().setAmount(8),
        BlockGameItems.METEOR_SHARD,
        BlockGameItems.PRISTINE_STONE.copy().setAmount(2)),
        BlockGameItems.STEEL_INGOT);

    recipe("magisteel/ingot", 250, List.of(
        BlockGameItems.GLOWING_MOTE.copy().setAmount(2),
        BlockGameItems.FROZEN_STAR.copy().setAmount(2),
        BlockGameItems.WHIPPING_WINDS.copy().setAmount(2),
        BlockGameItems.CRUMBLING_EARTH.copy().setAmount(2),
        BlockGameItems.LIVING_FIRE.copy().setAmount(2),
        BlockGameItems.MYTHRIL_INGOT,
        BlockGameItems.STEEL_INGOT),
        BlockGameItems.MAGISTEEL_INGOT);

    recipe("compressed/diamond", 50, List.of(
        EmiStack.of(Items.DIAMOND, 5),
        EmiStack.of(Items.PISTON, 4)),
        BlockGameItems.COMPRESSED_DIAMOND);
    recipe("infused/diamond", 100, List.of(
        BlockGameItems.CRUMBLING_EARTH,
        BlockGameItems.COMPRESSED_DIAMOND),
        BlockGameItems.INFUSED_DIAMOND);

    recipe("compressed/crystal", 50, List.of(
        EmiStack.of(Items.AMETHYST_BLOCK, 64),
        EmiStack.of(Items.PISTON, 4)),
        BlockGameItems.COMPRESSED_CRYSTAL);
    recipe("infused/crystal", 100, List.of(
        BlockGameItems.FROZEN_STAR,
        BlockGameItems.COMPRESSED_CRYSTAL),
        BlockGameItems.INFUSED_CRYSTAL);
  }
}
