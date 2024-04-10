package zentropivity.emimablockgame.vendors;

import java.util.List;

import dev.emi.emi.api.stack.EmiStack;
import net.minecraft.item.Items;
import zentropivity.emimablockgame.item.BlockGameItems;

public class LumberjackLarry extends AbstractVendor {
  public LumberjackLarry() {
    super("lumberjacklarry", BlockGameItems.MAGISTEEL_AXE);

    recipe("lumberjack/armor/helmet/1", 25, List.of(BlockGameItems.PRISTINE_WOOD.copy().setAmount(8),
        EmiStack.of(Items.OAK_SAPLING, 32),
        EmiStack.of(Items.APPLE, 4)), BlockGameItems.LUMBERJACK_HELMET_1);

    recipe("lumberjack/armor/chestplate/1", 25, List.of(BlockGameItems.PRISTINE_WOOD.copy().setAmount(8),
        EmiStack.of(Items.OAK_SAPLING, 32),
        EmiStack.of(Items.APPLE, 4)), BlockGameItems.LUMBERJACK_CHESTPLATE_1);

    recipe("lumberjack/armor/leggings/1", 25, List.of(BlockGameItems.PRISTINE_WOOD.copy().setAmount(8),
        EmiStack.of(Items.OAK_SAPLING, 32),
        EmiStack.of(Items.APPLE, 4)), BlockGameItems.LUMBERJACK_LEGGINGS_1);

    recipe("lumberjack/armor/boots/1", 25, List.of(BlockGameItems.PRISTINE_WOOD.copy().setAmount(8),
        EmiStack.of(Items.OAK_SAPLING, 32),
        EmiStack.of(Items.APPLE, 4)), BlockGameItems.LUMBERJACK_BOOTS_1);

    recipe("lumberjack/armor/helmet/2", 50, List.of(BlockGameItems.LUMBERJACK_HELMET_1,
        BlockGameItems.ESSENCE_FLEETING.copy().setAmount(8),
        EmiStack.of(Items.SPRUCE_SAPLING, 64)), BlockGameItems.LUMBERJACK_HELMET_2);

    recipe("lumberjack/armor/chestplate/2", 50, List.of(BlockGameItems.LUMBERJACK_CHESTPLATE_1,
        BlockGameItems.ESSENCE_FLEETING.copy().setAmount(8),
        EmiStack.of(Items.SPRUCE_SAPLING, 64)), BlockGameItems.LUMBERJACK_CHESTPLATE_2);

    recipe("lumberjack/armor/leggings/2", 50, List.of(BlockGameItems.LUMBERJACK_LEGGINGS_1,
        BlockGameItems.ESSENCE_FLEETING.copy().setAmount(8),
        EmiStack.of(Items.SPRUCE_SAPLING, 64)), BlockGameItems.LUMBERJACK_LEGGINGS_2);

    recipe("lumberjack/armor/boots/2", 50, List.of(BlockGameItems.LUMBERJACK_BOOTS_1,
        BlockGameItems.ESSENCE_FLEETING.copy().setAmount(8),
        EmiStack.of(Items.SPRUCE_SAPLING, 64)), BlockGameItems.LUMBERJACK_BOOTS_2);

    recipe("lumberjack/armor/helmet/3", 100, List.of(BlockGameItems.LUMBERJACK_HELMET_2,
        BlockGameItems.WHIPPING_WIND.copy().setAmount(2),
        EmiStack.of(Items.DARK_OAK_SAPLING, 64)), BlockGameItems.LUMBERJACK_HELMET_3);

    recipe("lumberjack/armor/chestplate/3", 100, List.of(BlockGameItems.LUMBERJACK_CHESTPLATE_2,
        BlockGameItems.WHIPPING_WIND.copy().setAmount(2),
        EmiStack.of(Items.DARK_OAK_SAPLING, 64)), BlockGameItems.LUMBERJACK_CHESTPLATE_3);

    recipe("lumberjack/armor/leggings/3", 100, List.of(BlockGameItems.LUMBERJACK_LEGGINGS_2,
        BlockGameItems.WHIPPING_WIND.copy().setAmount(2),
        EmiStack.of(Items.DARK_OAK_SAPLING, 64)), BlockGameItems.LUMBERJACK_LEGGINGS_3);

    recipe("lumberjack/armor/boots/3", 100, List.of(BlockGameItems.LUMBERJACK_BOOTS_2,
        BlockGameItems.WHIPPING_WIND.copy().setAmount(2),
        EmiStack.of(Items.DARK_OAK_SAPLING, 64)), BlockGameItems.LUMBERJACK_BOOTS_3);

    recipe("lumberjack/armor/helmet/4", 250, List.of(BlockGameItems.LUMBERJACK_HELMET_3,
        BlockGameItems.PRISTINE_CORE,
        BlockGameItems.WHIPPING_WIND.copy().setAmount(4),
        EmiStack.of(Items.ACACIA_SAPLING, 64),
        EmiStack.of(Items.JUNGLE_SAPLING, 64),
        EmiStack.of(Items.BIRCH_SAPLING, 64)), BlockGameItems.LUMBERJACK_HELMET_4);

    recipe("lumberjack/armor/chestplate/4", 250, List.of(BlockGameItems.LUMBERJACK_CHESTPLATE_3,
        BlockGameItems.PRISTINE_CORE,
        BlockGameItems.WHIPPING_WIND.copy().setAmount(4),
        EmiStack.of(Items.ACACIA_SAPLING, 64),
        EmiStack.of(Items.JUNGLE_SAPLING, 64),
        EmiStack.of(Items.BIRCH_SAPLING, 64)), BlockGameItems.LUMBERJACK_CHESTPLATE_4);

    recipe("lumberjack/armor/leggings/4", 250, List.of(BlockGameItems.LUMBERJACK_LEGGINGS_3,
        BlockGameItems.PRISTINE_CORE,
        BlockGameItems.WHIPPING_WIND.copy().setAmount(4),
        EmiStack.of(Items.ACACIA_SAPLING, 64),
        EmiStack.of(Items.JUNGLE_SAPLING, 64),
        EmiStack.of(Items.BIRCH_SAPLING, 64)), BlockGameItems.LUMBERJACK_LEGGINGS_4);

    recipe("lumberjack/armor/boots/4", 250, List.of(BlockGameItems.LUMBERJACK_BOOTS_3,
        BlockGameItems.PRISTINE_CORE,
        BlockGameItems.WHIPPING_WIND.copy().setAmount(4),
        EmiStack.of(Items.ACACIA_SAPLING, 64),
        EmiStack.of(Items.JUNGLE_SAPLING, 64),
        EmiStack.of(Items.BIRCH_SAPLING, 64)), BlockGameItems.LUMBERJACK_BOOTS_4);

    recipe("lumberjack/armor/helmet/5", 500, List.of(BlockGameItems.LUMBERJACK_HELMET_4,
        BlockGameItems.PRISTINE_CORE.copy().setAmount(2),
        BlockGameItems.WHIPPING_WIND.copy().setAmount(6),
        EmiStack.of(Items.FLOWERING_AZALEA_LEAVES, 16),
        EmiStack.of(Items.AZALEA_LEAVES, 16),
        EmiStack.of(Items.DARK_OAK_LEAVES, 16),
        EmiStack.of(Items.ACACIA_LEAVES, 16),
        EmiStack.of(Items.JUNGLE_LEAVES, 16),
        EmiStack.of(Items.BIRCH_LEAVES, 16),
        EmiStack.of(Items.SPRUCE_LEAVES, 16),
        EmiStack.of(Items.OAK_LEAVES, 16)), BlockGameItems.LUMBERJACK_HELMET_5);

    recipe("lumberjack/armor/chestplate/5", 500, List.of(BlockGameItems.LUMBERJACK_CHESTPLATE_4,
        BlockGameItems.PRISTINE_CORE.copy().setAmount(2),
        BlockGameItems.WHIPPING_WIND.copy().setAmount(6),
        EmiStack.of(Items.FLOWERING_AZALEA_LEAVES, 16),
        EmiStack.of(Items.AZALEA_LEAVES, 16),
        EmiStack.of(Items.DARK_OAK_LEAVES, 16),
        EmiStack.of(Items.ACACIA_LEAVES, 16),
        EmiStack.of(Items.JUNGLE_LEAVES, 16),
        EmiStack.of(Items.BIRCH_LEAVES, 16),
        EmiStack.of(Items.SPRUCE_LEAVES, 16),
        EmiStack.of(Items.OAK_LEAVES, 16)), BlockGameItems.LUMBERJACK_CHESTPLATE_5);

    recipe("lumberjack/armor/leggings/5", 500, List.of(BlockGameItems.LUMBERJACK_LEGGINGS_4,
        BlockGameItems.PRISTINE_CORE.copy().setAmount(2),
        BlockGameItems.WHIPPING_WIND.copy().setAmount(6),
        EmiStack.of(Items.FLOWERING_AZALEA_LEAVES, 16),
        EmiStack.of(Items.AZALEA_LEAVES, 16),
        EmiStack.of(Items.DARK_OAK_LEAVES, 16),
        EmiStack.of(Items.ACACIA_LEAVES, 16),
        EmiStack.of(Items.JUNGLE_LEAVES, 16),
        EmiStack.of(Items.BIRCH_LEAVES, 16),
        EmiStack.of(Items.SPRUCE_LEAVES, 16),
        EmiStack.of(Items.OAK_LEAVES, 16)), BlockGameItems.LUMBERJACK_LEGGINGS_5);

    recipe("lumberjack/armor/boots/5", 500, List.of(BlockGameItems.LUMBERJACK_BOOTS_4,
        BlockGameItems.PRISTINE_CORE.copy().setAmount(2),
        BlockGameItems.WHIPPING_WIND.copy().setAmount(6),
        EmiStack.of(Items.FLOWERING_AZALEA_LEAVES, 16),
        EmiStack.of(Items.AZALEA_LEAVES, 16),
        EmiStack.of(Items.DARK_OAK_LEAVES, 16),
        EmiStack.of(Items.ACACIA_LEAVES, 16),
        EmiStack.of(Items.JUNGLE_LEAVES, 16),
        EmiStack.of(Items.BIRCH_LEAVES, 16),
        EmiStack.of(Items.SPRUCE_LEAVES, 16),
        EmiStack.of(Items.OAK_LEAVES, 16)), BlockGameItems.LUMBERJACK_BOOTS_5);

    recipe("lumberjack/tool/wooden/axe", 5, List.of(BlockGameItems.PRISTINE_HIDE.copy().setAmount(3),
        EmiStack.of(Items.STICK, 2),
        BlockGameItems.PRISTINE_WOOD.copy().setAmount(3)), BlockGameItems.WOODEN_AXE);

    recipe("lumberjack/tool/brass/axe", 25, List.of(BlockGameItems.WOODEN_AXE,
        BlockGameItems.ESSENCE_FLEETING.copy().setAmount(4),
        EmiStack.of(Items.COPPER_INGOT, 6),
        BlockGameItems.PRISTINE_STONE.copy().setAmount(6),
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(3),
        BlockGameItems.PRISTINE_WOOD.copy().setAmount(3)), BlockGameItems.BRASS_AXE);

    recipe("lumberjack/tool/skysteel/axe", 250, List.of(BlockGameItems.BRASS_AXE,
        BlockGameItems.ESSENCE_FLEETING.copy().setAmount(16),
        BlockGameItems.MYTHRIL_INGOT,
        BlockGameItems.STEEL_INGOT,
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(3),
        BlockGameItems.PRISTINE_WOOD.copy().setAmount(3)), BlockGameItems.SKYSTEEL_AXE);

    recipe("lumberjack/tool/shimmerglass/axe", 500, List.of(BlockGameItems.SKYSTEEL_AXE,
        BlockGameItems.COMPRESSED_CRYSTAL.copy().setAmount(2),
        BlockGameItems.COMPRESSED_DIAMOND.copy().setAmount(2),
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(3),
        BlockGameItems.PRISTINE_WOOD.copy().setAmount(3)), BlockGameItems.SHIMMERGLASS_AXE);

    recipe("lumberjack/tool/magisteel/axe", 1000, List.of(BlockGameItems.SHIMMERGLASS_AXE,
        BlockGameItems.MAGISTEEL_INGOT.copy().setAmount(2),
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(3),
        BlockGameItems.PRISTINE_WOOD.copy().setAmount(3)), BlockGameItems.MAGISTEEL_AXE);

    recipe("lumberjack/augment/logging/1", 5, List.of(BlockGameItems.PRISTINE_HIDE.copy().setAmount(2),
        BlockGameItems.PRISTINE_WOOD.copy().setAmount(2)), BlockGameItems.AUGMENT_LOGGING_1);

    recipe("lumberjack/augment/logging/2", 25, List.of(BlockGameItems.AUGMENT_LOGGING_1,
        BlockGameItems.ESSENCE_FLEETING.copy().setAmount(2),
        EmiStack.of(Items.COPPER_INGOT, 3),
        BlockGameItems.PRISTINE_STONE.copy().setAmount(3),
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(2),
        BlockGameItems.PRISTINE_WOOD.copy().setAmount(2)), BlockGameItems.AUGMENT_LOGGING_2);

    recipe("lumberjack/augment/logging/3", 250, List.of(BlockGameItems.AUGMENT_LOGGING_2,
        BlockGameItems.ESSENCE_FLEETING.copy().setAmount(8),
        BlockGameItems.MYTHRIL_INGOT,
        BlockGameItems.STEEL_INGOT,
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(2),
        BlockGameItems.PRISTINE_WOOD.copy().setAmount(2)), BlockGameItems.AUGMENT_LOGGING_3);

    recipe("lumberjack/augment/logging/4", 500, List.of(BlockGameItems.AUGMENT_LOGGING_3,
        BlockGameItems.COMPRESSED_CRYSTAL,
        BlockGameItems.COMPRESSED_DIAMOND,
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(2),
        BlockGameItems.PRISTINE_WOOD.copy().setAmount(2)), BlockGameItems.AUGMENT_LOGGING_4);

    recipe("lumberjack/augment/logging/5", 1000, List.of(BlockGameItems.AUGMENT_LOGGING_4,
        BlockGameItems.MAGISTEEL_INGOT,
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(2),
        BlockGameItems.PRISTINE_WOOD.copy().setAmount(2)), BlockGameItems.AUGMENT_LOGGING_5);
  }
}
