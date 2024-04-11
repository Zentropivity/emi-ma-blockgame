package zentropivity.emimablockgame.vendors;

import java.util.List;

import dev.emi.emi.api.stack.EmiStack;
import net.minecraft.item.Items;
import zentropivity.emimablockgame.item.BlockGameItems;

public class AlchemistNina extends AbstractVendor {
  public AlchemistNina() {
    super("alchemistnina", BlockGameItems.NECRONOMICON);

    recipe("bottle/lava", 50, List.of(
        BlockGameItems.ESSENCE_FIERY.copy().setAmount(3),
        EmiStack.of(Items.GLASS_BOTTLE)),
        BlockGameItems.BOTTLE_LAVA);
    recipe("bottle/dirt", 50, List.of(
        BlockGameItems.ESSENCE_ROCKY.copy().setAmount(3),
        EmiStack.of(Items.GLASS_BOTTLE)),
        BlockGameItems.BOTTLE_EARTH);
    recipe("bottle/gusts", 50, List.of(
        BlockGameItems.ESSENCE_FLEETING.copy().setAmount(3),
        EmiStack.of(Items.GLASS_BOTTLE)),
        BlockGameItems.BOTTLE_WIND);
    recipe("bottle/frost", 50, List.of(
        BlockGameItems.ESSENCE_DAMP.copy().setAmount(3),
        EmiStack.of(Items.GLASS_BOTTLE)),
        BlockGameItems.BOTTLE_FROST);

    recipe("amethyst/farm", 1000, List.of(
      BlockGameItems.GLOWING_MOTE.copy().setAmount(16),
      BlockGameItems.LIVING_FIRE.copy().setAmount(4),
      BlockGameItems.CRUMBLING_EARTH.copy().setAmount(4),
      BlockGameItems.WHIPPING_WINDS.copy().setAmount(4),
      BlockGameItems.FROZEN_STAR.copy().setAmount(4),
      BlockGameItems.NECRONOMICON.copy().setAmount(4),
      BlockGameItems.COMPRESSED_CRYSTAL.copy().setAmount(4)
    ),
      BlockGameItems.REPLICATING_AMETHYST.copy().setAmount(4));

    recipe("necronomicon", 50, List.of(
        BlockGameItems.LOBSTER_SOUL.copy().setAmount(2),
        BlockGameItems.ANIMATED_BONE.copy().setAmount(3),
        BlockGameItems.ZOMBIE_LEATHER.copy().setAmount(16)),
        BlockGameItems.NECRONOMICON);

    recipe("animated/bone", 5, List.of(
        EmiStack.of(Items.BONE),
        EmiStack.of(Items.LAPIS_LAZULI, 2),
        EmiStack.of(Items.REDSTONE, 2)),
        BlockGameItems.ANIMATED_BONE);

    recipe("stack/fiery", 25,
        BlockGameItems.ESSENCE_FIERY.copy().setAmount(64),
        BlockGameItems.LIVING_FIRE);
    recipe("stack/rocky", 25,
        BlockGameItems.ESSENCE_ROCKY.copy().setAmount(64),
        BlockGameItems.CRUMBLING_EARTH);
    recipe("stack/fleeting", 25,
        BlockGameItems.ESSENCE_FLEETING.copy().setAmount(64),
        BlockGameItems.WHIPPING_WINDS);
    recipe("stack/damp", 25,
        BlockGameItems.ESSENCE_DAMP.copy().setAmount(64),
        BlockGameItems.FROZEN_STAR);
    recipe("stack/vibrant", 25,
        BlockGameItems.ESSENCE_VIBRANT.copy().setAmount(64),
        BlockGameItems.GLOWING_MOTE);
    recipe("stack/corrupted", 25,
        BlockGameItems.ESSENCE_CORRUPTED.copy().setAmount(64),
        BlockGameItems.CORRUPTED_SHARD);

    recipe("blackstone", 0, List.of(
        EmiStack.of(Items.BLACK_DYE),
        EmiStack.of(Items.STONE)),
        EmiStack.of(Items.BLACKSTONE));
  }
}
