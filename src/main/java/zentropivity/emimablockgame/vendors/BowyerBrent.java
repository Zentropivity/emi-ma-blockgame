package zentropivity.emimablockgame.vendors;

import java.util.List;

import dev.emi.emi.api.stack.EmiStack;
import net.minecraft.item.Items;
import zentropivity.emimablockgame.item.BlockGameItems;

public class BowyerBrent extends AbstractVendor {
  public BowyerBrent() {
    super("bowyerbrent", BlockGameItems.RANGER_BOW_5);

    recipe("ranger/bow/1", 25, List.of(
        EmiStack.of(Items.STRING, 3),
        BlockGameItems.ESSENCE_DAMP.copy().setAmount(2),
        BlockGameItems.PRISTINE_WOOD.copy().setAmount(3),
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(2)),
        BlockGameItems.RANGER_BOW_1);
    recipe("ranger/bow/2", 50, List.of(
        EmiStack.of(Items.POISONOUS_POTATO, 8),
        BlockGameItems.BOLT_SILK.copy().setAmount(3),
        BlockGameItems.ESSENCE_DAMP.copy().setAmount(4),
        BlockGameItems.PRISTINE_WOOD.copy().setAmount(3),
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(4),
        BlockGameItems.ANIMATED_BONE.copy().setAmount(3),
        BlockGameItems.RANGER_BOW_1),
        BlockGameItems.RANGER_BOW_2);
    recipe("ranger/bow/3", 100, List.of(
        BlockGameItems.BOLT_SILK.copy().setAmount(3),
        BlockGameItems.ESSENCE_DAMP.copy().setAmount(8),
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(6),
        BlockGameItems.POTION_HAUNTED,
        BlockGameItems.NECRONOMICON,
        BlockGameItems.RANGER_BOW_2),
        BlockGameItems.RANGER_BOW_3);
    recipe("ranger/bow/4", 250, List.of(
        BlockGameItems.BOLT_SILK.copy().setAmount(3),
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(8),
        BlockGameItems.BACON_BITS.copy().setAmount(64),
        BlockGameItems.INFUSED_CRYSTAL,
        BlockGameItems.RANGER_BOW_3),
        BlockGameItems.RANGER_BOW_4);
    recipe("ranger/bow/5", 500, List.of(
        BlockGameItems.BOLT_SILK.copy().setAmount(3),
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(10),
        BlockGameItems.CURSED_SAND.copy().setAmount(64),
        BlockGameItems.INFUSED_CRYSTAL.copy().setAmount(2),
        BlockGameItems.RANGER_BOW_4),
        BlockGameItems.RANGER_BOW_5);

    recipe("ranger/quiver/flint", 25,
        EmiStack.of(Items.ARROW, 64),
        BlockGameItems.RANGER_QUIVER_FLINT);
    recipe("ranger/quiver/serrated", 50, List.of(
        BlockGameItems.PRISTINE_STONE.copy().setAmount(8),
        BlockGameItems.RANGER_QUIVER_FLINT),
        BlockGameItems.RANGER_QUIVER_SERRATED);

    recipe("ranger/quiver/poison", 100, List.of(
        EmiStack.of(Items.SLIME_BALL, 16),
        EmiStack.of(Items.POISONOUS_POTATO, 16),
        BlockGameItems.ESSENCE_DAMP.copy().setAmount(16),
        BlockGameItems.RANGER_QUIVER_SERRATED),
        BlockGameItems.RANGER_QUIVER_POISON);
    recipe("ranger/quiver/rotten", 100, List.of(
        EmiStack.of(Items.ROTTEN_FLESH, 16),
        BlockGameItems.ESSENCE_ROCKY.copy().setAmount(16),
        BlockGameItems.COAGULATED_MASS,
        BlockGameItems.RANGER_QUIVER_SERRATED),
        BlockGameItems.RANGER_QUIVER_ROTTEN);
    recipe("ranger/quiver/tacky", 100, List.of(
        BlockGameItems.ESSENCE_DAMP.copy().setAmount(16),
        BlockGameItems.BACON_BITS.copy().setAmount(16),
        EmiStack.of(Items.HONEY_BLOCK, 4),
        BlockGameItems.RANGER_QUIVER_SERRATED),
        BlockGameItems.RANGER_QUIVER_TACKY);
    recipe("ranger/quiver/burning", 100, List.of(
        EmiStack.of(Items.SLIME_BALL, 16),
        BlockGameItems.ESSENCE_FIERY.copy().setAmount(16),
        BlockGameItems.CURSED_SAND.copy().setAmount(16),
        BlockGameItems.RANGER_QUIVER_SERRATED),
        BlockGameItems.RANGER_QUIVER_BURNING);

    recipe("ranger/quiver/venom", 500, List.of(
        EmiStack.of(Items.SLIME_BALL, 64),
        EmiStack.of(Items.POISONOUS_POTATO, 64),
        BlockGameItems.INFUSED_CRYSTAL,
        BlockGameItems.RANGER_QUIVER_POISON),
        BlockGameItems.RANGER_QUIVER_VENOM);
    recipe("ranger/quiver/horrifying", 500, List.of(
        EmiStack.of(Items.ROTTEN_FLESH, 64),
        BlockGameItems.CRUMBLING_EARTH,
        BlockGameItems.COAGULATED_MASS.copy().setAmount(3),
        BlockGameItems.RANGER_QUIVER_ROTTEN),
        BlockGameItems.RANGER_QUIVER_HORRIFYING);
    recipe("ranger/quiver/sticky", 500, List.of(
        BlockGameItems.INFUSED_CRYSTAL,
        BlockGameItems.BACON_BITS.copy().setAmount(64),
        EmiStack.of(Items.HONEY_BLOCK, 8),
        BlockGameItems.RANGER_QUIVER_TACKY),
        BlockGameItems.RANGER_QUIVER_STICKY);
    recipe("ranger/quiver/satet", 500, List.of(
        BlockGameItems.LIVING_FIRE,
        BlockGameItems.CURSED_SAND.copy().setAmount(64),
        BlockGameItems.RANGER_QUIVER_BURNING),
        BlockGameItems.RANGER_QUIVER_SATET);
  }
}
