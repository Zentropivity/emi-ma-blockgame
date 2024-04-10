package zentropivity.emimablockgame.vendors;

import java.util.List;

import zentropivity.emimablockgame.item.BlockGameItems;

public class BotanistMint extends AbstractVendor {
  public BotanistMint() {
    super("botanistmint", BlockGameItems.BRASS_HOE);

    sameOutRecipes("repair/normal/uncommon", 0, 10, List.of(
        BlockGameItems.GOLDEN_WHEAT.copy().setAmount(8),
        BlockGameItems.GOLDEN_POTATO.copy().setAmount(8),
        BlockGameItems.FAT_CARROT.copy().setAmount(8)),
        BlockGameItems.REPAIR_POWDER_COMMON);

    sameOutRecipes("repair/normal/uncommon", 0, 50, List.of(
        BlockGameItems.SENTIENT_WHEAT.copy().setAmount(4),
        BlockGameItems.SENTIENT_POTATO.copy().setAmount(4)),
        BlockGameItems.REPAIR_POWDER_COMMON);

    recipe("repair/arcane/rare", 50, BlockGameItems.COAGULATED_MASS.copy().setAmount(4),
        BlockGameItems.REPAIR_POWDER_ARCANE_RARE);

    recipe("xptome/herbalism", 50, BlockGameItems.EARTHEN_HEART, BlockGameItems.SECRETS_HERBALISM);
    recipe("fragile/hoe", 1000, List.of(
        BlockGameItems.SKYSTEEL_HOE,
        BlockGameItems.BOLT_SILK.copy().setAmount(9),
        BlockGameItems.PRISTINE_WOOD.copy().setAmount(2)),
        BlockGameItems.FRAGILE_HOE);
  }
}
