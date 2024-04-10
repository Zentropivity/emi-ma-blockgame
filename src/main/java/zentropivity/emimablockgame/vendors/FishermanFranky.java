package zentropivity.emimablockgame.vendors;

import java.util.List;

import dev.emi.emi.api.stack.EmiStack;
import net.minecraft.item.Items;
import zentropivity.emimablockgame.item.BlockGameItems;

public class FishermanFranky extends AbstractVendor {
  public FishermanFranky() {
    super("fishermanfranky", BlockGameItems.MAGISTEEL_FISHINGPOLE);

    recipe("fisherman/armor/helmet/1", 25, List.of(EmiStack.of(Items.PUFFERFISH, 8),
        EmiStack.of(Items.TROPICAL_FISH, 16),
        EmiStack.of(Items.SALMON, 32),
        EmiStack.of(Items.COD, 32)), BlockGameItems.FISHERMAN_HELMET_1);

    recipe("fisherman/armor/chestplate/1", 25, List.of(EmiStack.of(Items.PUFFERFISH, 8),
        EmiStack.of(Items.TROPICAL_FISH, 16),
        EmiStack.of(Items.SALMON, 32),
        EmiStack.of(Items.COD, 32)), BlockGameItems.FISHERMAN_CHESTPLATE_1);

    recipe("fisherman/armor/leggings/1", 25, List.of(EmiStack.of(Items.PUFFERFISH, 8),
        EmiStack.of(Items.TROPICAL_FISH, 16),
        EmiStack.of(Items.SALMON, 32),
        EmiStack.of(Items.COD, 32)), BlockGameItems.FISHERMAN_LEGGINGS_1);

    recipe("fisherman/armor/boots/1", 25, List.of(EmiStack.of(Items.PUFFERFISH, 8),
        EmiStack.of(Items.TROPICAL_FISH, 16),
        EmiStack.of(Items.SALMON, 32),
        EmiStack.of(Items.COD, 32)), BlockGameItems.FISHERMAN_BOOTS_1);

    recipe("fisherman/armor/helmet/2", 50, List.of(BlockGameItems.FISHERMAN_HELMET_1,
        BlockGameItems.FISH_BLUESFISH,
        BlockGameItems.ESSENCE_DAMP.copy().setAmount(8),
        BlockGameItems.FISH_WOODFISH.copy().setAmount(4),
        BlockGameItems.FISH_STONEFISH.copy().setAmount(4)), BlockGameItems.FISHERMAN_HELMET_2);

    recipe("fisherman/armor/chestplate/2", 50, List.of(BlockGameItems.FISHERMAN_CHESTPLATE_1,
        BlockGameItems.FISH_BLUESFISH,
        BlockGameItems.ESSENCE_DAMP.copy().setAmount(8),
        BlockGameItems.FISH_WOODFISH.copy().setAmount(4),
        BlockGameItems.FISH_STONEFISH.copy().setAmount(4)), BlockGameItems.FISHERMAN_CHESTPLATE_2);

    recipe("fisherman/armor/leggings/2", 50, List.of(BlockGameItems.FISHERMAN_LEGGINGS_1,
        BlockGameItems.FISH_BLUESFISH,
        BlockGameItems.ESSENCE_DAMP.copy().setAmount(8),
        BlockGameItems.FISH_WOODFISH.copy().setAmount(4),
        BlockGameItems.FISH_STONEFISH.copy().setAmount(4)), BlockGameItems.FISHERMAN_LEGGINGS_2);

    recipe("fisherman/armor/boots/2", 50, List.of(BlockGameItems.FISHERMAN_BOOTS_1,
        BlockGameItems.FISH_BLUESFISH,
        BlockGameItems.ESSENCE_DAMP.copy().setAmount(8),
        BlockGameItems.FISH_WOODFISH.copy().setAmount(4),
        BlockGameItems.FISH_STONEFISH.copy().setAmount(4)), BlockGameItems.FISHERMAN_BOOTS_2);

    recipe("fisherman/armor/helmet/3", 100, List.of(BlockGameItems.FISHERMAN_HELMET_2,
        BlockGameItems.FROZEN_STAR.copy().setAmount(2),
        BlockGameItems.FISH_PEPPERFISH.copy().setAmount(16),
        BlockGameItems.FISH_BAMBOOZLE.copy().setAmount(8)), BlockGameItems.FISHERMAN_HELMET_3);

    recipe("fisherman/armor/chestplate/3", 100, List.of(BlockGameItems.FISHERMAN_CHESTPLATE_2,
        BlockGameItems.FROZEN_STAR.copy().setAmount(2),
        BlockGameItems.FISH_PEPPERFISH.copy().setAmount(16),
        BlockGameItems.FISH_BAMBOOZLE.copy().setAmount(8)), BlockGameItems.FISHERMAN_CHESTPLATE_3);

    recipe("fisherman/armor/leggings/3", 100, List.of(BlockGameItems.FISHERMAN_LEGGINGS_2,
        BlockGameItems.FROZEN_STAR.copy().setAmount(2),
        BlockGameItems.FISH_PEPPERFISH.copy().setAmount(16),
        BlockGameItems.FISH_BAMBOOZLE.copy().setAmount(8)), BlockGameItems.FISHERMAN_LEGGINGS_3);

    recipe("fisherman/armor/boots/3", 100, List.of(BlockGameItems.FISHERMAN_BOOTS_2,
        BlockGameItems.FROZEN_STAR.copy().setAmount(2),
        BlockGameItems.FISH_PEPPERFISH.copy().setAmount(16),
        BlockGameItems.FISH_BAMBOOZLE.copy().setAmount(8)), BlockGameItems.FISHERMAN_BOOTS_3);

    recipe("fisherman/armor/helmet/4", 250, List.of(BlockGameItems.FISHERMAN_HELMET_3,
        BlockGameItems.FROZEN_STAR.copy().setAmount(4),
        BlockGameItems.FISH_BADFISH.copy().setAmount(16),
        BlockGameItems.FISH_SALTFISH.copy().setAmount(16),
        BlockGameItems.FISH_DRYFISH.copy().setAmount(16)), BlockGameItems.FISHERMAN_HELMET_4);

    recipe("fisherman/armor/chestplate/4", 250, List.of(BlockGameItems.FISHERMAN_CHESTPLATE_3,
        BlockGameItems.FROZEN_STAR.copy().setAmount(4),
        BlockGameItems.FISH_BADFISH.copy().setAmount(16),
        BlockGameItems.FISH_SALTFISH.copy().setAmount(16),
        BlockGameItems.FISH_DRYFISH.copy().setAmount(16)), BlockGameItems.FISHERMAN_CHESTPLATE_4);

    recipe("fisherman/armor/leggings/4", 250, List.of(BlockGameItems.FISHERMAN_LEGGINGS_3,
        BlockGameItems.FROZEN_STAR.copy().setAmount(4),
        BlockGameItems.FISH_BADFISH.copy().setAmount(16),
        BlockGameItems.FISH_SALTFISH.copy().setAmount(16),
        BlockGameItems.FISH_DRYFISH.copy().setAmount(16)), BlockGameItems.FISHERMAN_LEGGINGS_4);

    recipe("fisherman/armor/boots/4", 250, List.of(BlockGameItems.FISHERMAN_BOOTS_3,
        BlockGameItems.FROZEN_STAR.copy().setAmount(4),
        BlockGameItems.FISH_BADFISH.copy().setAmount(16),
        BlockGameItems.FISH_SALTFISH.copy().setAmount(16),
        BlockGameItems.FISH_DRYFISH.copy().setAmount(16)), BlockGameItems.FISHERMAN_BOOTS_4);

    recipe("fisherman/armor/helmet/5", 500, List.of(BlockGameItems.FISHERMAN_HELMET_4,
        BlockGameItems.FISH_FUNGALFISH.copy().setAmount(64),
        BlockGameItems.FROZEN_STAR.copy().setAmount(6)), BlockGameItems.FISHERMAN_HELMET_5);

    recipe("fisherman/armor/chestplate/5", 500, List.of(BlockGameItems.FISHERMAN_CHESTPLATE_4,
        BlockGameItems.FISH_FUNGALFISH.copy().setAmount(64),
        BlockGameItems.FROZEN_STAR.copy().setAmount(6)), BlockGameItems.FISHERMAN_CHESTPLATE_5);

    recipe("fisherman/armor/leggings/5", 500, List.of(BlockGameItems.FISHERMAN_LEGGINGS_4,
        BlockGameItems.FISH_FUNGALFISH.copy().setAmount(64),
        BlockGameItems.FROZEN_STAR.copy().setAmount(6)), BlockGameItems.FISHERMAN_LEGGINGS_5);

    recipe("fisherman/armor/boots/5", 500, List.of(BlockGameItems.FISHERMAN_BOOTS_4,
        BlockGameItems.FISH_FUNGALFISH.copy().setAmount(64),
        BlockGameItems.FROZEN_STAR.copy().setAmount(6)), BlockGameItems.FISHERMAN_BOOTS_5);

    recipe("fisherman/tool/strong/fishingpole", 5, List.of(EmiStack.of(Items.STICK, 2),
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(3),
        BlockGameItems.PRISTINE_WOOD.copy().setAmount(3),
        EmiStack.of(Items.STRING, 2)), BlockGameItems.STRONG_FISHINGPOLE);

    recipe("fisherman/tool/brass/fishingpole", 25, List.of(BlockGameItems.STRONG_FISHINGPOLE,
        BlockGameItems.ESSENCE_DAMP.copy().setAmount(4),
        EmiStack.of(Items.COPPER_INGOT, 6),
        BlockGameItems.PRISTINE_STONE.copy().setAmount(6),
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(3),
        BlockGameItems.PRISTINE_WOOD.copy().setAmount(3)), BlockGameItems.BRASS_FISHINGPOLE);

    recipe("fisherman/tool/skysteel/fishingpole", 250, List.of(BlockGameItems.BRASS_FISHINGPOLE,
        BlockGameItems.ESSENCE_DAMP.copy().setAmount(16),
        BlockGameItems.MYTHRIL_INGOT,
        BlockGameItems.STEEL_INGOT,
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(3),
        BlockGameItems.PRISTINE_WOOD.copy().setAmount(3)), BlockGameItems.SKYSTEEL_FISHINGPOLE);

    recipe("fisherman/tool/shimmerglass/fishingpole", 500, List.of(BlockGameItems.SKYSTEEL_FISHINGPOLE,
        BlockGameItems.COMPRESSED_CRYSTAL.copy().setAmount(2),
        BlockGameItems.COMPRESSED_DIAMOND.copy().setAmount(2),
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(3),
        BlockGameItems.PRISTINE_WOOD.copy().setAmount(3)), BlockGameItems.SHIMMERGLASS_FISHINGPOLE);

    recipe("fisherman/tool/magisteel/fishingpole", 1000, List.of(BlockGameItems.SHIMMERGLASS_FISHINGPOLE,
        BlockGameItems.MAGISTEEL_INGOT.copy().setAmount(2),
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(3),
        BlockGameItems.PRISTINE_WOOD.copy().setAmount(3)), BlockGameItems.MAGISTEEL_FISHINGPOLE);

    recipe("fisherman/augment/fishing/1", 5, List.of(BlockGameItems.PRISTINE_HIDE.copy().setAmount(2),
        BlockGameItems.PRISTINE_WOOD.copy().setAmount(2)), BlockGameItems.AUGMENT_FISHING_1);

    recipe("fisherman/augment/fishing/2", 25, List.of(BlockGameItems.AUGMENT_FISHING_1,
        BlockGameItems.ESSENCE_DAMP.copy().setAmount(2),
        EmiStack.of(Items.COPPER_INGOT, 3),
        BlockGameItems.PRISTINE_STONE.copy().setAmount(3),
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(2),
        BlockGameItems.PRISTINE_WOOD.copy().setAmount(2)), BlockGameItems.AUGMENT_FISHING_2);

    recipe("fisherman/augment/fishing/3", 250, List.of(BlockGameItems.AUGMENT_FISHING_2,
        BlockGameItems.ESSENCE_DAMP.copy().setAmount(8),
        BlockGameItems.MYTHRIL_INGOT,
        BlockGameItems.STEEL_INGOT,
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(2),
        BlockGameItems.PRISTINE_WOOD.copy().setAmount(2)), BlockGameItems.AUGMENT_FISHING_3);

    recipe("fisherman/augment/fishing/4", 500, List.of(BlockGameItems.AUGMENT_FISHING_3,
        BlockGameItems.COMPRESSED_CRYSTAL,
        BlockGameItems.COMPRESSED_DIAMOND,
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(2),
        BlockGameItems.PRISTINE_WOOD.copy().setAmount(2)), BlockGameItems.AUGMENT_FISHING_4);

    recipe("fisherman/augment/fishing/5", 1000, List.of(BlockGameItems.AUGMENT_FISHING_4,
        BlockGameItems.MAGISTEEL_INGOT,
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(2),
        BlockGameItems.PRISTINE_WOOD.copy().setAmount(2)), BlockGameItems.AUGMENT_FISHING_5);
  }
}
