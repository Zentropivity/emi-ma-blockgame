package zentropivity.emimablockgame.vendors;

import java.util.List;

import dev.emi.emi.api.stack.EmiStack;
import net.minecraft.item.Items;
import zentropivity.emimablockgame.item.BlockGameItems;

public class MinerSteve extends AbstractVendor {
  public MinerSteve() {
    super("minersteve", BlockGameItems.MAGISTEEL_PICKAXE);

    recipe("miner/armor/helmet/1", 25, List.of(BlockGameItems.PRISTINE_STONE.copy().setAmount(8),
        EmiStack.of(Items.COBBLESTONE, 64)), BlockGameItems.MINER_HELMET_1);

    recipe("miner/armor/chestplate/1", 25, List.of(BlockGameItems.PRISTINE_STONE.copy().setAmount(8),
        EmiStack.of(Items.COBBLESTONE, 64)), BlockGameItems.MINER_CHESTPLATE_1);

    recipe("miner/armor/leggings/1", 25, List.of(BlockGameItems.PRISTINE_STONE.copy().setAmount(8),
        EmiStack.of(Items.COBBLESTONE, 64)), BlockGameItems.MINER_LEGGINGS_1);

    recipe("miner/armor/boots/1", 25, List.of(BlockGameItems.PRISTINE_STONE.copy().setAmount(8),
        EmiStack.of(Items.COBBLESTONE, 64)), BlockGameItems.MINER_BOOTS_1);

    recipe("miner/armor/helmet/2", 50, List.of(BlockGameItems.MINER_HELMET_1,
        BlockGameItems.ESSENCE_FIERY.copy().setAmount(8),
        EmiStack.of(Items.LAPIS_LAZULI, 16),
        EmiStack.of(Items.IRON_INGOT, 32)), BlockGameItems.MINER_HELMET_2);

    recipe("miner/armor/chestplate/2", 50, List.of(BlockGameItems.MINER_CHESTPLATE_1,
        BlockGameItems.ESSENCE_FIERY.copy().setAmount(8),
        EmiStack.of(Items.LAPIS_LAZULI, 16),
        EmiStack.of(Items.IRON_INGOT, 32)), BlockGameItems.MINER_CHESTPLATE_2);

    recipe("miner/armor/leggings/2", 50, List.of(BlockGameItems.MINER_LEGGINGS_1,
        BlockGameItems.ESSENCE_FIERY.copy().setAmount(8),
        EmiStack.of(Items.LAPIS_LAZULI, 16),
        EmiStack.of(Items.IRON_INGOT, 32)), BlockGameItems.MINER_LEGGINGS_2);

    recipe("miner/armor/boots/2", 50, List.of(BlockGameItems.MINER_BOOTS_1,
        BlockGameItems.ESSENCE_FIERY.copy().setAmount(8),
        EmiStack.of(Items.LAPIS_LAZULI, 16),
        EmiStack.of(Items.IRON_INGOT, 32)), BlockGameItems.MINER_BOOTS_2);

    recipe("miner/armor/helmet/3", 100, List.of(BlockGameItems.MINER_HELMET_2,
        BlockGameItems.LIVING_FIRE.copy().setAmount(2),
        EmiStack.of(Items.REDSTONE, 16),
        EmiStack.of(Items.GOLD_INGOT, 16),
        EmiStack.of(Items.DIAMOND, 16)), BlockGameItems.MINER_HELMET_3);

    recipe("miner/armor/chestplate/3", 100, List.of(BlockGameItems.MINER_CHESTPLATE_2,
        BlockGameItems.LIVING_FIRE.copy().setAmount(2),
        EmiStack.of(Items.REDSTONE, 16),
        EmiStack.of(Items.GOLD_INGOT, 16),
        EmiStack.of(Items.DIAMOND, 16)), BlockGameItems.MINER_CHESTPLATE_3);

    recipe("miner/armor/leggings/3", 100, List.of(BlockGameItems.MINER_LEGGINGS_2,
        BlockGameItems.LIVING_FIRE.copy().setAmount(2),
        EmiStack.of(Items.REDSTONE, 16),
        EmiStack.of(Items.GOLD_INGOT, 16),
        EmiStack.of(Items.DIAMOND, 16)), BlockGameItems.MINER_LEGGINGS_3);

    recipe("miner/armor/boots/3", 100, List.of(BlockGameItems.MINER_BOOTS_2,
        BlockGameItems.LIVING_FIRE.copy().setAmount(2),
        EmiStack.of(Items.REDSTONE, 16),
        EmiStack.of(Items.GOLD_INGOT, 16),
        EmiStack.of(Items.DIAMOND, 16)), BlockGameItems.MINER_BOOTS_3);

    recipe("miner/armor/helmet/4", 250, List.of(BlockGameItems.MINER_HELMET_3,
        BlockGameItems.EARTHEN_HEART,
        BlockGameItems.LIVING_FIRE.copy().setAmount(4),
        EmiStack.of(Items.AMETHYST_BLOCK, 64),
        EmiStack.of(Items.CRYING_OBSIDIAN, 4)), BlockGameItems.MINER_HELMET_4);

    recipe("miner/armor/chestplate/4", 250, List.of(BlockGameItems.MINER_CHESTPLATE_3,
        BlockGameItems.EARTHEN_HEART,
        BlockGameItems.LIVING_FIRE.copy().setAmount(4),
        EmiStack.of(Items.AMETHYST_BLOCK, 64),
        EmiStack.of(Items.CRYING_OBSIDIAN, 4)), BlockGameItems.MINER_CHESTPLATE_4);

    recipe("miner/armor/leggings/4", 250, List.of(BlockGameItems.MINER_LEGGINGS_3,
        BlockGameItems.EARTHEN_HEART,
        BlockGameItems.LIVING_FIRE.copy().setAmount(4),
        EmiStack.of(Items.AMETHYST_BLOCK, 64),
        EmiStack.of(Items.CRYING_OBSIDIAN, 4)), BlockGameItems.MINER_LEGGINGS_4);

    recipe("miner/armor/boots/4", 250, List.of(BlockGameItems.MINER_BOOTS_3,
        BlockGameItems.EARTHEN_HEART,
        BlockGameItems.LIVING_FIRE.copy().setAmount(4),
        EmiStack.of(Items.AMETHYST_BLOCK, 64),
        EmiStack.of(Items.CRYING_OBSIDIAN, 4)), BlockGameItems.MINER_BOOTS_4);

    recipe("miner/armor/helmet/5", 500, List.of(BlockGameItems.MINER_HELMET_4,
        BlockGameItems.EARTHEN_HEART.copy().setAmount(2),
        BlockGameItems.LIVING_FIRE.copy().setAmount(6),
        EmiStack.of(Items.EMERALD_ORE, 4),
        EmiStack.of(Items.SEA_LANTERN, 8)), BlockGameItems.MINER_HELMET_5);

    recipe("miner/armor/chestplate/5", 500, List.of(BlockGameItems.MINER_CHESTPLATE_4,
        BlockGameItems.EARTHEN_HEART.copy().setAmount(2),
        BlockGameItems.LIVING_FIRE.copy().setAmount(6),
        EmiStack.of(Items.EMERALD_ORE, 4),
        EmiStack.of(Items.SEA_LANTERN, 8)), BlockGameItems.MINER_CHESTPLATE_5);

    recipe("miner/armor/leggings/5", 500, List.of(BlockGameItems.MINER_LEGGINGS_4,
        BlockGameItems.EARTHEN_HEART.copy().setAmount(2),
        BlockGameItems.LIVING_FIRE.copy().setAmount(6),
        EmiStack.of(Items.EMERALD_ORE, 4),
        EmiStack.of(Items.SEA_LANTERN, 8)), BlockGameItems.MINER_LEGGINGS_5);

    recipe("miner/armor/boots/5", 500, List.of(BlockGameItems.MINER_BOOTS_4,
        BlockGameItems.EARTHEN_HEART.copy().setAmount(2),
        BlockGameItems.LIVING_FIRE.copy().setAmount(6),
        EmiStack.of(Items.EMERALD_ORE, 4),
        EmiStack.of(Items.SEA_LANTERN, 8)), BlockGameItems.MINER_BOOTS_5);

    recipe("miner/tool/wooden/pickaxe", 5, List.of(BlockGameItems.PRISTINE_HIDE.copy().setAmount(3),
        EmiStack.of(Items.STICK, 2),
        BlockGameItems.PRISTINE_WOOD.copy().setAmount(3)), BlockGameItems.WOODEN_PICKAXE);

    recipe("miner/tool/brass/pickaxe", 25, List.of(BlockGameItems.WOODEN_PICKAXE,
        BlockGameItems.ESSENCE_FIERY.copy().setAmount(4),
        EmiStack.of(Items.COPPER_INGOT, 6),
        BlockGameItems.PRISTINE_STONE.copy().setAmount(6),
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(3),
        BlockGameItems.PRISTINE_WOOD.copy().setAmount(3)), BlockGameItems.BRASS_PICKAXE);

    recipe("miner/tool/skysteel/pickaxe", 250, List.of(BlockGameItems.BRASS_PICKAXE,
        BlockGameItems.ESSENCE_FIERY.copy().setAmount(16),
        BlockGameItems.MYTHRIL_INGOT,
        BlockGameItems.STEEL_INGOT,
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(3),
        BlockGameItems.PRISTINE_WOOD.copy().setAmount(3)), BlockGameItems.SKYSTEEL_PICKAXE);

    recipe("miner/tool/shimmerglass/pickaxe", 500, List.of(BlockGameItems.SKYSTEEL_PICKAXE,
        BlockGameItems.COMPRESSED_CRYSTAL.copy().setAmount(2),
        BlockGameItems.COMPRESSED_DIAMOND.copy().setAmount(2),
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(3),
        BlockGameItems.PRISTINE_WOOD.copy().setAmount(3)), BlockGameItems.SHIMMERGLASS_PICKAXE);

    recipe("miner/tool/magisteel/pickaxe", 1000, List.of(BlockGameItems.SHIMMERGLASS_PICKAXE,
        BlockGameItems.MAGISTEEL_INGOT.copy().setAmount(2),
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(3),
        BlockGameItems.PRISTINE_WOOD.copy().setAmount(3)), BlockGameItems.MAGISTEEL_PICKAXE);

    recipe("miner/augment/mining/1", 5, List.of(BlockGameItems.PRISTINE_HIDE.copy().setAmount(2),
        BlockGameItems.PRISTINE_WOOD.copy().setAmount(2)), BlockGameItems.AUGMENT_MINING_1);

    recipe("miner/augment/mining/2", 25, List.of(BlockGameItems.AUGMENT_MINING_1,
        BlockGameItems.ESSENCE_FIERY.copy().setAmount(2),
        EmiStack.of(Items.COPPER_INGOT, 3),
        BlockGameItems.PRISTINE_STONE.copy().setAmount(3),
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(2),
        BlockGameItems.PRISTINE_WOOD.copy().setAmount(2)), BlockGameItems.AUGMENT_MINING_2);

    recipe("miner/augment/mining/3", 250, List.of(BlockGameItems.AUGMENT_MINING_2,
        BlockGameItems.ESSENCE_FIERY.copy().setAmount(8),
        BlockGameItems.MYTHRIL_INGOT,
        BlockGameItems.STEEL_INGOT,
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(2),
        BlockGameItems.PRISTINE_WOOD.copy().setAmount(2)), BlockGameItems.AUGMENT_MINING_3);

    recipe("miner/augment/mining/4", 500, List.of(BlockGameItems.AUGMENT_MINING_3,
        BlockGameItems.COMPRESSED_CRYSTAL,
        BlockGameItems.COMPRESSED_DIAMOND,
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(2),
        BlockGameItems.PRISTINE_WOOD.copy().setAmount(2)), BlockGameItems.AUGMENT_MINING_4);

    recipe("miner/augment/mining/5", 1000, List.of(BlockGameItems.AUGMENT_MINING_4,
        BlockGameItems.MAGISTEEL_INGOT,
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(2),
        BlockGameItems.PRISTINE_WOOD.copy().setAmount(2)), BlockGameItems.AUGMENT_MINING_5);
  }
}
