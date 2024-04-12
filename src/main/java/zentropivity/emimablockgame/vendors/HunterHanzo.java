package zentropivity.emimablockgame.vendors;

import java.util.List;

import zentropivity.emimablockgame.item.BlockGameItems;

public class HunterHanzo extends AbstractVendor {
  public HunterHanzo() {
    super("hunterhanzo", BlockGameItems.RAID_CRATE_ROTTEN);

    sameOutRecipes("essence/corrupted", 0, 5, List.of(
        BlockGameItems.LOBSTER_SOUL.copy().setAmount(2),
        BlockGameItems.BACON_BITS.copy().setAmount(64),
        BlockGameItems.CURSED_SAND.copy().setAmount(64),
        BlockGameItems.ANIMATED_BONE.copy().setAmount(8),
        BlockGameItems.ZOMBIE_LEATHER.copy().setAmount(8)),
        BlockGameItems.ESSENCE_CORRUPTED.copy().setAmount(16));

    recipe("raid/sunken", 500, List.of(
        BlockGameItems.ANIMATED_BONE.copy().setAmount(2),
        BlockGameItems.ZOMBIE_LEATHER.copy().setAmount(8)),
        BlockGameItems.RAID_CRATE_SUNKEN);
    recipe("raid/krognars", 1000, List.of(
        BlockGameItems.LOBSTER_SOUL.copy().setAmount(4),
        BlockGameItems.ZOMBIE_LEATHER.copy().setAmount(8)),
        BlockGameItems.RAID_CRATE_KROGNARS);
    recipe("raid/neith", 1500, List.of(
        BlockGameItems.BACON_BITS.copy().setAmount(64),
        BlockGameItems.ZOMBIE_LEATHER.copy().setAmount(8)),
        BlockGameItems.RAID_CRATE_NEITH);
    recipe("raid/rotten", 2000, List.of(
        BlockGameItems.CURSED_SAND.copy().setAmount(64),
        BlockGameItems.ZOMBIE_LEATHER.copy().setAmount(8)),
        BlockGameItems.RAID_CRATE_ROTTEN);
  }
}
