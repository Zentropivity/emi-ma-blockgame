package zentropivity.emimablockgame.vendors;

import java.util.List;

import dev.emi.emi.api.stack.EmiStack;
import net.minecraft.item.Items;
import zentropivity.emimablockgame.item.BlockGameItems;

public class BotanistHesha extends AbstractVendor {
  public BotanistHesha() {
    super("botanisthesha", BlockGameItems.MAGISTEEL_HOE);

    recipe("botanist/armor/helmet/1", 25, List.of(EmiStack.of(Items.POTATO, 64),
        EmiStack.of(Items.CARROT, 64),
        EmiStack.of(Items.BEETROOT, 64)), BlockGameItems.BOTANIST_HELMET_1);

    recipe("botanist/armor/chestplate/1", 25, List.of(EmiStack.of(Items.POTATO, 64),
        EmiStack.of(Items.CARROT, 64),
        EmiStack.of(Items.BEETROOT, 64)), BlockGameItems.BOTANIST_CHESTPLATE_1);

    recipe("botanist/armor/leggings/1", 25, List.of(EmiStack.of(Items.POTATO, 64),
        EmiStack.of(Items.CARROT, 64),
        EmiStack.of(Items.BEETROOT, 64)), BlockGameItems.BOTANIST_LEGGINGS_1);

    recipe("botanist/armor/boots/1", 25, List.of(EmiStack.of(Items.POTATO, 64),
        EmiStack.of(Items.CARROT, 64),
        EmiStack.of(Items.BEETROOT, 64)), BlockGameItems.BOTANIST_BOOTS_1);

    recipe("botanist/armor/helmet/2", 50, List.of(BlockGameItems.BOTANIST_HELMET_1,
        BlockGameItems.ESSENCE_VIBRANT.copy().setAmount(8),
        BlockGameItems.TASTY_MELON_SLICE.copy().setAmount(64),
        EmiStack.of(Items.SWEET_BERRIES, 32),
        EmiStack.of(Items.GLOW_BERRIES, 32),
        EmiStack.of(Items.PUMPKIN, 16)), BlockGameItems.BOTANIST_HELMET_2);

    recipe("botanist/armor/chestplate/2", 50, List.of(BlockGameItems.BOTANIST_CHESTPLATE_1,
        BlockGameItems.ESSENCE_VIBRANT.copy().setAmount(8),
        BlockGameItems.TASTY_MELON_SLICE.copy().setAmount(64),
        EmiStack.of(Items.SWEET_BERRIES, 32),
        EmiStack.of(Items.GLOW_BERRIES, 32),
        EmiStack.of(Items.PUMPKIN, 16)), BlockGameItems.BOTANIST_CHESTPLATE_2);

    recipe("botanist/armor/leggings/2", 50, List.of(BlockGameItems.BOTANIST_LEGGINGS_1,
        BlockGameItems.ESSENCE_VIBRANT.copy().setAmount(8),
        BlockGameItems.TASTY_MELON_SLICE.copy().setAmount(64),
        EmiStack.of(Items.SWEET_BERRIES, 32),
        EmiStack.of(Items.GLOW_BERRIES, 32),
        EmiStack.of(Items.PUMPKIN, 16)), BlockGameItems.BOTANIST_LEGGINGS_2);

    recipe("botanist/armor/boots/2", 50, List.of(BlockGameItems.BOTANIST_BOOTS_1,
        BlockGameItems.ESSENCE_VIBRANT.copy().setAmount(8),
        BlockGameItems.TASTY_MELON_SLICE.copy().setAmount(64),
        EmiStack.of(Items.SWEET_BERRIES, 32),
        EmiStack.of(Items.GLOW_BERRIES, 32),
        EmiStack.of(Items.PUMPKIN, 16)), BlockGameItems.BOTANIST_BOOTS_2);

    recipe("botanist/armor/helmet/3", 100, List.of(BlockGameItems.BOTANIST_HELMET_2,
        BlockGameItems.GLOWING_MOTE.copy().setAmount(2),
        BlockGameItems.FAT_CARROT.copy().setAmount(16),
        BlockGameItems.GOLDEN_POTATO.copy().setAmount(16),
        BlockGameItems.GOLDEN_BEETROOT.copy().setAmount(16)), BlockGameItems.BOTANIST_HELMET_3);

    recipe("botanist/armor/chestplate/3", 100, List.of(BlockGameItems.BOTANIST_CHESTPLATE_2,
        BlockGameItems.GLOWING_MOTE.copy().setAmount(2),
        BlockGameItems.FAT_CARROT.copy().setAmount(16),
        BlockGameItems.GOLDEN_POTATO.copy().setAmount(16),
        BlockGameItems.GOLDEN_BEETROOT.copy().setAmount(16)), BlockGameItems.BOTANIST_CHESTPLATE_3);

    recipe("botanist/armor/leggings/3", 100, List.of(BlockGameItems.BOTANIST_LEGGINGS_2,
        BlockGameItems.GLOWING_MOTE.copy().setAmount(2),
        BlockGameItems.FAT_CARROT.copy().setAmount(16),
        BlockGameItems.GOLDEN_POTATO.copy().setAmount(16),
        BlockGameItems.GOLDEN_BEETROOT.copy().setAmount(16)), BlockGameItems.BOTANIST_LEGGINGS_3);

    recipe("botanist/armor/boots/3", 100, List.of(BlockGameItems.BOTANIST_BOOTS_2,
        BlockGameItems.GLOWING_MOTE.copy().setAmount(2),
        BlockGameItems.FAT_CARROT.copy().setAmount(16),
        BlockGameItems.GOLDEN_POTATO.copy().setAmount(16),
        BlockGameItems.GOLDEN_BEETROOT.copy().setAmount(16)), BlockGameItems.BOTANIST_BOOTS_3);

    recipe("botanist/armor/helmet/4", 250, List.of(BlockGameItems.BOTANIST_HELMET_3,
        BlockGameItems.PERFECT_SPECIMEN,
        BlockGameItems.GLOWING_MOTE.copy().setAmount(4),
        BlockGameItems.TEA_STONESKIN,
        BlockGameItems.TEA_STOMACH,
        BlockGameItems.TEA_QUICKSTEP), BlockGameItems.BOTANIST_HELMET_4);

    recipe("botanist/armor/chestplate/4", 250, List.of(BlockGameItems.BOTANIST_CHESTPLATE_3,
        BlockGameItems.PERFECT_SPECIMEN,
        BlockGameItems.GLOWING_MOTE.copy().setAmount(4),
        BlockGameItems.TEA_STONESKIN,
        BlockGameItems.TEA_STOMACH,
        BlockGameItems.TEA_QUICKSTEP), BlockGameItems.BOTANIST_CHESTPLATE_4);

    recipe("botanist/armor/leggings/4", 250, List.of(BlockGameItems.BOTANIST_LEGGINGS_3,
        BlockGameItems.PERFECT_SPECIMEN,
        BlockGameItems.GLOWING_MOTE.copy().setAmount(4),
        BlockGameItems.TEA_STONESKIN,
        BlockGameItems.TEA_STOMACH,
        BlockGameItems.TEA_QUICKSTEP), BlockGameItems.BOTANIST_LEGGINGS_4);

    recipe("botanist/armor/boots/4", 250, List.of(BlockGameItems.BOTANIST_BOOTS_3,
        BlockGameItems.PERFECT_SPECIMEN,
        BlockGameItems.GLOWING_MOTE.copy().setAmount(4),
        BlockGameItems.TEA_STONESKIN,
        BlockGameItems.TEA_STOMACH,
        BlockGameItems.TEA_QUICKSTEP), BlockGameItems.BOTANIST_BOOTS_4);

    recipe("botanist/armor/helmet/5", 500, List.of(BlockGameItems.BOTANIST_HELMET_4,
        BlockGameItems.PERFECT_SPECIMEN.copy().setAmount(2),
        BlockGameItems.GLOWING_MOTE.copy().setAmount(6),
        BlockGameItems.SENTIENT_WHEAT.copy().setAmount(4),
        EmiStack.of(Items.SPORE_BLOSSOM, 4),
        EmiStack.of(Items.ROSE_BUSH, 32),
        EmiStack.of(Items.LILY_OF_THE_VALLEY, 32),
        EmiStack.of(Items.SUNFLOWER, 32),
        EmiStack.of(Items.BLUE_ORCHID, 32),
        EmiStack.of(Items.ALLIUM, 32)), BlockGameItems.BOTANIST_HELMET_5);

    recipe("botanist/armor/chestplate/5", 500, List.of(BlockGameItems.BOTANIST_CHESTPLATE_4,
        BlockGameItems.PERFECT_SPECIMEN.copy().setAmount(2),
        BlockGameItems.GLOWING_MOTE.copy().setAmount(6),
        BlockGameItems.SENTIENT_WHEAT.copy().setAmount(4),
        EmiStack.of(Items.SPORE_BLOSSOM, 4),
        EmiStack.of(Items.ROSE_BUSH, 32),
        EmiStack.of(Items.LILY_OF_THE_VALLEY, 32),
        EmiStack.of(Items.SUNFLOWER, 32),
        EmiStack.of(Items.BLUE_ORCHID, 32),
        EmiStack.of(Items.ALLIUM, 32)), BlockGameItems.BOTANIST_CHESTPLATE_5);

    recipe("botanist/armor/leggings/5", 500, List.of(BlockGameItems.BOTANIST_LEGGINGS_4,
        BlockGameItems.PERFECT_SPECIMEN.copy().setAmount(2),
        BlockGameItems.GLOWING_MOTE.copy().setAmount(6),
        BlockGameItems.SENTIENT_WHEAT.copy().setAmount(4),
        EmiStack.of(Items.SPORE_BLOSSOM, 4),
        EmiStack.of(Items.ROSE_BUSH, 32),
        EmiStack.of(Items.LILY_OF_THE_VALLEY, 32),
        EmiStack.of(Items.SUNFLOWER, 32),
        EmiStack.of(Items.BLUE_ORCHID, 32),
        EmiStack.of(Items.ALLIUM, 32)), BlockGameItems.BOTANIST_LEGGINGS_5);

    recipe("botanist/armor/boots/5", 500, List.of(BlockGameItems.BOTANIST_BOOTS_4,
        BlockGameItems.PERFECT_SPECIMEN.copy().setAmount(2),
        BlockGameItems.GLOWING_MOTE.copy().setAmount(6),
        BlockGameItems.SENTIENT_WHEAT.copy().setAmount(4),
        EmiStack.of(Items.SPORE_BLOSSOM, 4),
        EmiStack.of(Items.ROSE_BUSH, 32),
        EmiStack.of(Items.LILY_OF_THE_VALLEY, 32),
        EmiStack.of(Items.SUNFLOWER, 32),
        EmiStack.of(Items.BLUE_ORCHID, 32),
        EmiStack.of(Items.ALLIUM, 32)), BlockGameItems.BOTANIST_BOOTS_5);

    recipe("botanist/tool/wooden/hoe", 5, List.of(BlockGameItems.PRISTINE_HIDE.copy().setAmount(3),
        EmiStack.of(Items.STICK, 2),
        BlockGameItems.PRISTINE_WOOD.copy().setAmount(3)), BlockGameItems.WOODEN_HOE);

    recipe("botanist/tool/brass/hoe", 25, List.of(BlockGameItems.WOODEN_HOE,
        BlockGameItems.ESSENCE_VIBRANT.copy().setAmount(4),
        EmiStack.of(Items.COPPER_INGOT, 6),
        BlockGameItems.PRISTINE_STONE.copy().setAmount(6),
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(3),
        BlockGameItems.PRISTINE_WOOD.copy().setAmount(3)), BlockGameItems.BRASS_HOE);

    recipe("botanist/tool/skysteel/hoe", 250, List.of(BlockGameItems.BRASS_HOE,
        BlockGameItems.ESSENCE_VIBRANT.copy().setAmount(16),
        BlockGameItems.MYTHRIL_INGOT,
        BlockGameItems.STEEL_INGOT,
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(3),
        BlockGameItems.PRISTINE_WOOD.copy().setAmount(3)), BlockGameItems.SKYSTEEL_HOE);

    recipe("botanist/tool/shimmerglass/hoe", 500, List.of(BlockGameItems.SKYSTEEL_HOE,
        BlockGameItems.COMPRESSED_CRYSTAL.copy().setAmount(2),
        BlockGameItems.COMPRESSED_DIAMOND.copy().setAmount(2),
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(3),
        BlockGameItems.PRISTINE_WOOD.copy().setAmount(3)), BlockGameItems.SHIMMERGLASS_HOE);

    recipe("botanist/tool/magisteel/hoe", 1000, List.of(BlockGameItems.SHIMMERGLASS_HOE,
        BlockGameItems.MAGISTEEL_INGOT.copy().setAmount(2),
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(3),
        BlockGameItems.PRISTINE_WOOD.copy().setAmount(3)), BlockGameItems.MAGISTEEL_HOE);

    recipe("botanist/augment/herbalism/1", 5, List.of(BlockGameItems.PRISTINE_HIDE.copy().setAmount(2),
        BlockGameItems.PRISTINE_WOOD.copy().setAmount(2)), BlockGameItems.AUGMENT_HERBALISM_1);

    recipe("botanist/augment/herbalism/2", 25, List.of(BlockGameItems.AUGMENT_HERBALISM_1,
        BlockGameItems.ESSENCE_VIBRANT.copy().setAmount(2),
        EmiStack.of(Items.COPPER_INGOT, 3),
        BlockGameItems.PRISTINE_STONE.copy().setAmount(3),
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(2),
        BlockGameItems.PRISTINE_WOOD.copy().setAmount(2)), BlockGameItems.AUGMENT_HERBALISM_2);

    recipe("botanist/augment/herbalism/3", 250, List.of(BlockGameItems.AUGMENT_HERBALISM_2,
        BlockGameItems.ESSENCE_VIBRANT.copy().setAmount(8),
        BlockGameItems.MYTHRIL_INGOT,
        BlockGameItems.STEEL_INGOT,
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(2),
        BlockGameItems.PRISTINE_WOOD.copy().setAmount(2)), BlockGameItems.AUGMENT_HERBALISM_3);

    recipe("botanist/augment/herbalism/4", 500, List.of(BlockGameItems.AUGMENT_HERBALISM_3,
        BlockGameItems.COMPRESSED_CRYSTAL,
        BlockGameItems.COMPRESSED_DIAMOND,
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(2),
        BlockGameItems.PRISTINE_WOOD.copy().setAmount(2)), BlockGameItems.AUGMENT_HERBALISM_4);

    recipe("botanist/augment/herbalism/5", 1000, List.of(BlockGameItems.AUGMENT_HERBALISM_4,
        BlockGameItems.MAGISTEEL_INGOT,
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(2),
        BlockGameItems.PRISTINE_WOOD.copy().setAmount(2)), BlockGameItems.AUGMENT_HERBALISM_5);
  }
}
