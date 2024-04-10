package zentropivity.emimablockgame.vendors;

import java.util.List;

import dev.emi.emi.api.stack.EmiStack;
import net.minecraft.item.Items;
import zentropivity.emimablockgame.item.BlockGameItems;

public class ArchaeologistIndy extends AbstractVendor {
  public ArchaeologistIndy() {
    super("archaeologistindy", BlockGameItems.MAGISTEEL_SHOVEL);

    recipe("archaeologist/armor/helmet/1", 25, List.of(BlockGameItems.RAW_GINGER.copy().setAmount(4),
        BlockGameItems.TOUGH_ROOTS.copy().setAmount(4),
        EmiStack.of(Items.DIRT, 64)), BlockGameItems.ARCHAEOLOGIST_HELMET_1);

    recipe("archaeologist/armor/chestplate/1", 25, List.of(BlockGameItems.RAW_GINGER.copy().setAmount(4),
        BlockGameItems.TOUGH_ROOTS.copy().setAmount(4),
        EmiStack.of(Items.DIRT, 64)), BlockGameItems.ARCHAEOLOGIST_CHESTPLATE_1);

    recipe("archaeologist/armor/leggings/1", 25, List.of(BlockGameItems.RAW_GINGER.copy().setAmount(4),
        BlockGameItems.TOUGH_ROOTS.copy().setAmount(4),
        EmiStack.of(Items.DIRT, 64)), BlockGameItems.ARCHAEOLOGIST_LEGGINGS_1);

    recipe("archaeologist/armor/boots/1", 25, List.of(BlockGameItems.RAW_GINGER.copy().setAmount(4),
        BlockGameItems.TOUGH_ROOTS.copy().setAmount(4),
        EmiStack.of(Items.DIRT, 64)), BlockGameItems.ARCHAEOLOGIST_BOOTS_1);

    recipe("archaeologist/armor/helmet/2", 50, List.of(BlockGameItems.ARCHAEOLOGIST_HELMET_1,
        BlockGameItems.ESSENCE_ROCKY.copy().setAmount(8),
        EmiStack.of(Items.FLINT, 8),
        EmiStack.of(Items.GRAVEL, 64)), BlockGameItems.ARCHAEOLOGIST_HELMET_2);

    recipe("archaeologist/armor/chestplate/2", 50, List.of(BlockGameItems.ARCHAEOLOGIST_CHESTPLATE_1,
        BlockGameItems.ESSENCE_ROCKY.copy().setAmount(8),
        EmiStack.of(Items.FLINT, 8),
        EmiStack.of(Items.GRAVEL, 64)), BlockGameItems.ARCHAEOLOGIST_CHESTPLATE_2);

    recipe("archaeologist/armor/leggings/2", 50, List.of(BlockGameItems.ARCHAEOLOGIST_LEGGINGS_1,
        BlockGameItems.ESSENCE_ROCKY.copy().setAmount(8),
        EmiStack.of(Items.FLINT, 8),
        EmiStack.of(Items.GRAVEL, 64)), BlockGameItems.ARCHAEOLOGIST_LEGGINGS_2);

    recipe("archaeologist/armor/boots/2", 50, List.of(BlockGameItems.ARCHAEOLOGIST_BOOTS_1,
        BlockGameItems.ESSENCE_ROCKY.copy().setAmount(8),
        EmiStack.of(Items.FLINT, 8),
        EmiStack.of(Items.GRAVEL, 64)), BlockGameItems.ARCHAEOLOGIST_BOOTS_2);

    recipe("archaeologist/armor/helmet/3", 100, List.of(BlockGameItems.ARCHAEOLOGIST_HELMET_2,
        BlockGameItems.CRUMBLING_EARTH.copy().setAmount(2),
        BlockGameItems.FANCY_SHELL.copy().setAmount(2),
        BlockGameItems.PRETTY_SHELL.copy().setAmount(8),
        BlockGameItems.COMMON_SHELL.copy().setAmount(32),
        BlockGameItems.SALT.copy().setAmount(12),
        EmiStack.of(Items.SAND, 64)), BlockGameItems.ARCHAEOLOGIST_HELMET_3);

    recipe("archaeologist/armor/chestplate/3", 100, List.of(BlockGameItems.ARCHAEOLOGIST_CHESTPLATE_2,
        BlockGameItems.CRUMBLING_EARTH.copy().setAmount(2),
        BlockGameItems.FANCY_SHELL.copy().setAmount(2),
        BlockGameItems.PRETTY_SHELL.copy().setAmount(8),
        BlockGameItems.COMMON_SHELL.copy().setAmount(32),
        BlockGameItems.SALT.copy().setAmount(12),
        EmiStack.of(Items.SAND, 64)), BlockGameItems.ARCHAEOLOGIST_CHESTPLATE_3);

    recipe("archaeologist/armor/leggings/3", 100, List.of(BlockGameItems.ARCHAEOLOGIST_LEGGINGS_2,
        BlockGameItems.CRUMBLING_EARTH.copy().setAmount(2),
        BlockGameItems.FANCY_SHELL.copy().setAmount(2),
        BlockGameItems.PRETTY_SHELL.copy().setAmount(8),
        BlockGameItems.COMMON_SHELL.copy().setAmount(32),
        BlockGameItems.SALT.copy().setAmount(12),
        EmiStack.of(Items.SAND, 64)), BlockGameItems.ARCHAEOLOGIST_LEGGINGS_3);

    recipe("archaeologist/armor/boots/3", 100, List.of(BlockGameItems.ARCHAEOLOGIST_BOOTS_2,
        BlockGameItems.CRUMBLING_EARTH.copy().setAmount(2),
        BlockGameItems.FANCY_SHELL.copy().setAmount(2),
        BlockGameItems.PRETTY_SHELL.copy().setAmount(8),
        BlockGameItems.COMMON_SHELL.copy().setAmount(32),
        BlockGameItems.SALT.copy().setAmount(12),
        EmiStack.of(Items.SAND, 64)), BlockGameItems.ARCHAEOLOGIST_BOOTS_3);

    recipe("archaeologist/armor/helmet/4", 250, List.of(BlockGameItems.ARCHAEOLOGIST_HELMET_3,
        BlockGameItems.ANCIENT_POTTERY,
        BlockGameItems.CRUMBLING_EARTH.copy().setAmount(4),
        BlockGameItems.COAGULATED_MASS.copy().setAmount(5),
        EmiStack.of(Items.RED_SAND, 64)), BlockGameItems.ARCHAEOLOGIST_HELMET_4);

    recipe("archaeologist/armor/chestplate/4", 250, List.of(BlockGameItems.ARCHAEOLOGIST_CHESTPLATE_3,
        BlockGameItems.ANCIENT_POTTERY,
        BlockGameItems.CRUMBLING_EARTH.copy().setAmount(4),
        BlockGameItems.COAGULATED_MASS.copy().setAmount(5),
        EmiStack.of(Items.RED_SAND, 64)), BlockGameItems.ARCHAEOLOGIST_CHESTPLATE_4);

    recipe("archaeologist/armor/leggings/4", 250, List.of(BlockGameItems.ARCHAEOLOGIST_LEGGINGS_3,
        BlockGameItems.ANCIENT_POTTERY,
        BlockGameItems.CRUMBLING_EARTH.copy().setAmount(4),
        BlockGameItems.COAGULATED_MASS.copy().setAmount(5),
        EmiStack.of(Items.RED_SAND, 64)), BlockGameItems.ARCHAEOLOGIST_LEGGINGS_4);

    recipe("archaeologist/armor/boots/4", 250, List.of(BlockGameItems.ARCHAEOLOGIST_BOOTS_3,
        BlockGameItems.ANCIENT_POTTERY,
        BlockGameItems.CRUMBLING_EARTH.copy().setAmount(4),
        BlockGameItems.COAGULATED_MASS.copy().setAmount(5),
        EmiStack.of(Items.RED_SAND, 64)), BlockGameItems.ARCHAEOLOGIST_BOOTS_4);

    recipe("archaeologist/armor/helmet/5", 500, List.of(BlockGameItems.ARCHAEOLOGIST_HELMET_4,
        BlockGameItems.ANCIENT_POTTERY.copy().setAmount(2),
        BlockGameItems.CRUMBLING_EARTH.copy().setAmount(6),
        BlockGameItems.MEGA_MUSHROOM.copy().setAmount(24),
        BlockGameItems.MINI_MUSHROOM.copy().setAmount(24),
        EmiStack.of(Items.MYCELIUM, 12)), BlockGameItems.ARCHAEOLOGIST_HELMET_5);

    recipe("archaeologist/armor/chestplate/5", 500, List.of(BlockGameItems.ARCHAEOLOGIST_CHESTPLATE_4,
        BlockGameItems.ANCIENT_POTTERY.copy().setAmount(2),
        BlockGameItems.CRUMBLING_EARTH.copy().setAmount(6),
        BlockGameItems.MEGA_MUSHROOM.copy().setAmount(24),
        BlockGameItems.MINI_MUSHROOM.copy().setAmount(24),
        EmiStack.of(Items.MYCELIUM, 12)), BlockGameItems.ARCHAEOLOGIST_CHESTPLATE_5);

    recipe("archaeologist/armor/leggings/5", 500, List.of(BlockGameItems.ARCHAEOLOGIST_LEGGINGS_4,
        BlockGameItems.ANCIENT_POTTERY.copy().setAmount(2),
        BlockGameItems.CRUMBLING_EARTH.copy().setAmount(6),
        BlockGameItems.MEGA_MUSHROOM.copy().setAmount(24),
        BlockGameItems.MINI_MUSHROOM.copy().setAmount(24),
        EmiStack.of(Items.MYCELIUM, 12)), BlockGameItems.ARCHAEOLOGIST_LEGGINGS_5);

    recipe("archaeologist/armor/boots/5", 500, List.of(BlockGameItems.ARCHAEOLOGIST_BOOTS_4,
        BlockGameItems.ANCIENT_POTTERY.copy().setAmount(2),
        BlockGameItems.CRUMBLING_EARTH.copy().setAmount(6),
        BlockGameItems.MEGA_MUSHROOM.copy().setAmount(24),
        BlockGameItems.MINI_MUSHROOM.copy().setAmount(24),
        EmiStack.of(Items.MYCELIUM, 12)), BlockGameItems.ARCHAEOLOGIST_BOOTS_5);

    recipe("archaeologist/tool/wooden/shovel", 5, List.of(BlockGameItems.PRISTINE_HIDE.copy().setAmount(3),
        EmiStack.of(Items.STICK, 2),
        BlockGameItems.PRISTINE_WOOD.copy().setAmount(3)), BlockGameItems.WOODEN_SHOVEL);

    recipe("archaeologist/tool/brass/shovel", 25, List.of(BlockGameItems.WOODEN_SHOVEL,
        BlockGameItems.ESSENCE_ROCKY.copy().setAmount(4),
        EmiStack.of(Items.COPPER_INGOT, 6),
        BlockGameItems.PRISTINE_STONE.copy().setAmount(6),
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(3),
        BlockGameItems.PRISTINE_WOOD.copy().setAmount(3)), BlockGameItems.BRASS_SHOVEL);

    recipe("archaeologist/tool/skysteel/shovel", 250, List.of(BlockGameItems.BRASS_SHOVEL,
        BlockGameItems.ESSENCE_ROCKY.copy().setAmount(16),
        BlockGameItems.MYTHRIL_INGOT,
        BlockGameItems.STEEL_INGOT,
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(3),
        BlockGameItems.PRISTINE_WOOD.copy().setAmount(3)), BlockGameItems.SKYSTEEL_SHOVEL);

    recipe("archaeologist/tool/shimmerglass/shovel", 500, List.of(BlockGameItems.SKYSTEEL_SHOVEL,
        BlockGameItems.COMPRESSED_CRYSTAL.copy().setAmount(2),
        BlockGameItems.COMPRESSED_DIAMOND.copy().setAmount(2),
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(3),
        BlockGameItems.PRISTINE_WOOD.copy().setAmount(3)), BlockGameItems.SHIMMERGLASS_SHOVEL);

    recipe("archaeologist/tool/magisteel/shovel", 1000, List.of(BlockGameItems.SHIMMERGLASS_SHOVEL,
        BlockGameItems.MAGISTEEL_INGOT.copy().setAmount(2),
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(3),
        BlockGameItems.PRISTINE_WOOD.copy().setAmount(3)), BlockGameItems.MAGISTEEL_SHOVEL);

    recipe("archaeologist/augment/archaeology/1", 5, List.of(BlockGameItems.PRISTINE_HIDE.copy().setAmount(2),
        BlockGameItems.PRISTINE_WOOD.copy().setAmount(2)), BlockGameItems.AUGMENT_ARCHAEOLOGY_1);

    recipe("archaeologist/augment/archaeology/2", 25, List.of(BlockGameItems.AUGMENT_ARCHAEOLOGY_1,
        BlockGameItems.ESSENCE_ROCKY.copy().setAmount(2),
        EmiStack.of(Items.COPPER_INGOT, 3),
        BlockGameItems.PRISTINE_STONE.copy().setAmount(3),
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(2),
        BlockGameItems.PRISTINE_WOOD.copy().setAmount(2)), BlockGameItems.AUGMENT_ARCHAEOLOGY_2);

    recipe("archaeologist/augment/archaeology/3", 250, List.of(BlockGameItems.AUGMENT_ARCHAEOLOGY_2,
        BlockGameItems.ESSENCE_ROCKY.copy().setAmount(8),
        BlockGameItems.MYTHRIL_INGOT,
        BlockGameItems.STEEL_INGOT,
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(2),
        BlockGameItems.PRISTINE_WOOD.copy().setAmount(2)), BlockGameItems.AUGMENT_ARCHAEOLOGY_3);

    recipe("archaeologist/augment/archaeology/4", 500, List.of(BlockGameItems.AUGMENT_ARCHAEOLOGY_3,
        BlockGameItems.COMPRESSED_CRYSTAL,
        BlockGameItems.COMPRESSED_DIAMOND,
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(2),
        BlockGameItems.PRISTINE_WOOD.copy().setAmount(2)), BlockGameItems.AUGMENT_ARCHAEOLOGY_4);

    recipe("archaeologist/augment/archaeology/5", 1000, List.of(BlockGameItems.AUGMENT_ARCHAEOLOGY_4,
        BlockGameItems.MAGISTEEL_INGOT,
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(2),
        BlockGameItems.PRISTINE_WOOD.copy().setAmount(2)), BlockGameItems.AUGMENT_ARCHAEOLOGY_5);
  }
}
