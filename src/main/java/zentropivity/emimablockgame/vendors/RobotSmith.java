package zentropivity.emimablockgame.vendors;

import java.util.List;

import zentropivity.emimablockgame.item.BlockGameItems;

public class RobotSmith extends AbstractVendor {
  public RobotSmith() {
    super("robotsmith", BlockGameItems.REPAIR_POWDER_EPIC);

    sameOutRecipes("repair/normal/common", 0, 5, List.of(
        BlockGameItems.ESSENCE_FIERY.copy().setAmount(2),
        BlockGameItems.ESSENCE_ROCKY.copy().setAmount(2),
        BlockGameItems.ESSENCE_FLEETING.copy().setAmount(2),
        BlockGameItems.ESSENCE_DAMP.copy().setAmount(2),
        BlockGameItems.ESSENCE_VIBRANT.copy().setAmount(2),
        BlockGameItems.ESSENCE_CORRUPTED.copy().setAmount(8)),
        BlockGameItems.REPAIR_POWDER_COMMON);
    sameOutRecipes("repair/normal/uncommon", 0, 10, List.of(
        BlockGameItems.ESSENCE_FIERY.copy().setAmount(4),
        BlockGameItems.ESSENCE_ROCKY.copy().setAmount(4),
        BlockGameItems.ESSENCE_FLEETING.copy().setAmount(4),
        BlockGameItems.ESSENCE_DAMP.copy().setAmount(4),
        BlockGameItems.ESSENCE_VIBRANT.copy().setAmount(4),
        BlockGameItems.ESSENCE_CORRUPTED.copy().setAmount(16)),
        BlockGameItems.REPAIR_POWDER_UNCOMMON);
    sameOutRecipes("repair/normal/rare", 0, 40, List.of(
        BlockGameItems.ESSENCE_FIERY.copy().setAmount(16),
        BlockGameItems.ESSENCE_ROCKY.copy().setAmount(16),
        BlockGameItems.ESSENCE_FLEETING.copy().setAmount(16),
        BlockGameItems.ESSENCE_DAMP.copy().setAmount(16),
        BlockGameItems.ESSENCE_VIBRANT.copy().setAmount(16),
        BlockGameItems.ESSENCE_CORRUPTED.copy().setAmount(64)),
        BlockGameItems.REPAIR_POWDER_RARE);
    sameOutRecipes("repair/normal/epic", 0, 80, List.of(
        BlockGameItems.ESSENCE_FIERY.copy().setAmount(32),
        BlockGameItems.ESSENCE_ROCKY.copy().setAmount(32),
        BlockGameItems.ESSENCE_FLEETING.copy().setAmount(32),
        BlockGameItems.ESSENCE_DAMP.copy().setAmount(32),
        BlockGameItems.ESSENCE_VIBRANT.copy().setAmount(32),
        BlockGameItems.ESSENCE_CORRUPTED.copy().setAmount(128)),
        BlockGameItems.REPAIR_POWDER_EPIC);

    sameOutRecipes("repair/arcane/common", 0, 5, List.of(
        BlockGameItems.ESSENCE_FIERY.copy().setAmount(2),
        BlockGameItems.ESSENCE_ROCKY.copy().setAmount(2),
        BlockGameItems.ESSENCE_FLEETING.copy().setAmount(2),
        BlockGameItems.ESSENCE_DAMP.copy().setAmount(2),
        BlockGameItems.ESSENCE_VIBRANT.copy().setAmount(2),
        BlockGameItems.ESSENCE_CORRUPTED.copy().setAmount(8)),
        BlockGameItems.REPAIR_POWDER_ARCANE_COMMON);
    sameOutRecipes("repair/arcane/uncommon", 0, 10, List.of(
        BlockGameItems.ESSENCE_FIERY.copy().setAmount(4),
        BlockGameItems.ESSENCE_ROCKY.copy().setAmount(4),
        BlockGameItems.ESSENCE_FLEETING.copy().setAmount(4),
        BlockGameItems.ESSENCE_DAMP.copy().setAmount(4),
        BlockGameItems.ESSENCE_VIBRANT.copy().setAmount(4),
        BlockGameItems.ESSENCE_CORRUPTED.copy().setAmount(16)),
        BlockGameItems.REPAIR_POWDER_ARCANE_UNCOMMON);
    sameOutRecipes("repair/arcane/rare", 0, 40, List.of(
        BlockGameItems.ESSENCE_FIERY.copy().setAmount(16),
        BlockGameItems.ESSENCE_ROCKY.copy().setAmount(16),
        BlockGameItems.ESSENCE_FLEETING.copy().setAmount(16),
        BlockGameItems.ESSENCE_DAMP.copy().setAmount(16),
        BlockGameItems.ESSENCE_VIBRANT.copy().setAmount(16),
        BlockGameItems.ESSENCE_CORRUPTED.copy().setAmount(64)),
        BlockGameItems.REPAIR_POWDER_ARCANE_RARE);
    sameOutRecipes("repair/arcane/epic", 0, 80, List.of(
        BlockGameItems.ESSENCE_FIERY.copy().setAmount(32),
        BlockGameItems.ESSENCE_ROCKY.copy().setAmount(32),
        BlockGameItems.ESSENCE_FLEETING.copy().setAmount(32),
        BlockGameItems.ESSENCE_DAMP.copy().setAmount(32),
        BlockGameItems.ESSENCE_VIBRANT.copy().setAmount(32),
        BlockGameItems.ESSENCE_CORRUPTED.copy().setAmount(128)),
        BlockGameItems.REPAIR_POWDER_ARCANE_EPIC);

    recipe("unstack/fiery", 25, BlockGameItems.LIVING_FIRE,
        BlockGameItems.ESSENCE_FIERY.copy().setAmount(64));
    recipe("unstack/rocky", 25, BlockGameItems.CRUMBLING_EARTH,
        BlockGameItems.ESSENCE_ROCKY.copy().setAmount(64));
    recipe("unstack/fleeting", 25, BlockGameItems.WHIPPING_WINDS,
        BlockGameItems.ESSENCE_FLEETING.copy().setAmount(64));
    recipe("unstack/damp", 25, BlockGameItems.FROZEN_STAR,
        BlockGameItems.ESSENCE_DAMP.copy().setAmount(64));
    recipe("unstack/vibrant", 25, BlockGameItems.GLOWING_MOTE,
        BlockGameItems.ESSENCE_VIBRANT.copy().setAmount(64));
    recipe("unstack/corrupted", 25, BlockGameItems.CORRUPTED_SHARD,
        BlockGameItems.ESSENCE_CORRUPTED.copy().setAmount(64));
  }
}
