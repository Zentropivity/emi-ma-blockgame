package zentropivity.emimablockgame.vendors;

import java.util.List;

import dev.emi.emi.api.stack.EmiStack;
import net.minecraft.item.Items;
import zentropivity.emimablockgame.item.BlockGameItems;

public class RunecarverBrokkr extends AbstractVendor {
  public RunecarverBrokkr() {
    super("runecarverbrokkr", BlockGameItems.RUNE_CLARITY_5);

    recipe("runecarver/armor/helmet/1", 25, List.of(BlockGameItems.PRISTINE_STONE.copy().setAmount(8),
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(8),
        EmiStack.of(Items.GOLD_INGOT, 4)), BlockGameItems.RUNECARVER_HELMET_1);

    recipe("runecarver/armor/chestplate/1", 25, List.of(BlockGameItems.PRISTINE_STONE.copy().setAmount(8),
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(8),
        EmiStack.of(Items.GOLD_INGOT, 4)), BlockGameItems.RUNECARVER_CHESTPLATE_1);

    recipe("runecarver/armor/leggings/1", 25, List.of(BlockGameItems.PRISTINE_STONE.copy().setAmount(8),
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(8),
        EmiStack.of(Items.GOLD_INGOT, 4)), BlockGameItems.RUNECARVER_LEGGINGS_1);

    recipe("runecarver/armor/boots/1", 25, List.of(BlockGameItems.PRISTINE_STONE.copy().setAmount(8),
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(8),
        EmiStack.of(Items.GOLD_INGOT, 4)), BlockGameItems.RUNECARVER_BOOTS_1);

    recipe("runecarver/armor/helmet/2", 50, List.of(BlockGameItems.RUNECARVER_HELMET_1,
        BlockGameItems.ESSENCE_CORRUPTED.copy().setAmount(8),
        BlockGameItems.ESSENCE_VIBRANT.copy().setAmount(8),
        BlockGameItems.ESSENCE_DAMP.copy().setAmount(8),
        BlockGameItems.ESSENCE_FLEETING.copy().setAmount(8),
        BlockGameItems.ESSENCE_ROCKY.copy().setAmount(8),
        BlockGameItems.ESSENCE_FIERY.copy().setAmount(8),
        BlockGameItems.PRISTINE_STONE.copy().setAmount(16),
        EmiStack.of(Items.GOLD_INGOT, 8)), BlockGameItems.RUNECARVER_HELMET_2);

    recipe("runecarver/armor/chestplate/2", 50, List.of(BlockGameItems.RUNECARVER_CHESTPLATE_1,
        BlockGameItems.ESSENCE_CORRUPTED.copy().setAmount(8),
        BlockGameItems.ESSENCE_VIBRANT.copy().setAmount(8),
        BlockGameItems.ESSENCE_DAMP.copy().setAmount(8),
        BlockGameItems.ESSENCE_FLEETING.copy().setAmount(8),
        BlockGameItems.ESSENCE_ROCKY.copy().setAmount(8),
        BlockGameItems.ESSENCE_FIERY.copy().setAmount(8),
        BlockGameItems.PRISTINE_STONE.copy().setAmount(16),
        EmiStack.of(Items.GOLD_INGOT, 8)), BlockGameItems.RUNECARVER_CHESTPLATE_2);

    recipe("runecarver/armor/leggings/2", 50, List.of(BlockGameItems.RUNECARVER_LEGGINGS_1,
        BlockGameItems.ESSENCE_CORRUPTED.copy().setAmount(8),
        BlockGameItems.ESSENCE_VIBRANT.copy().setAmount(8),
        BlockGameItems.ESSENCE_DAMP.copy().setAmount(8),
        BlockGameItems.ESSENCE_FLEETING.copy().setAmount(8),
        BlockGameItems.ESSENCE_ROCKY.copy().setAmount(8),
        BlockGameItems.ESSENCE_FIERY.copy().setAmount(8),
        BlockGameItems.PRISTINE_STONE.copy().setAmount(16),
        EmiStack.of(Items.GOLD_INGOT, 8)), BlockGameItems.RUNECARVER_LEGGINGS_2);

    recipe("runecarver/armor/boots/2", 50, List.of(BlockGameItems.RUNECARVER_BOOTS_1,
        BlockGameItems.ESSENCE_CORRUPTED.copy().setAmount(8),
        BlockGameItems.ESSENCE_VIBRANT.copy().setAmount(8),
        BlockGameItems.ESSENCE_DAMP.copy().setAmount(8),
        BlockGameItems.ESSENCE_FLEETING.copy().setAmount(8),
        BlockGameItems.ESSENCE_ROCKY.copy().setAmount(8),
        BlockGameItems.ESSENCE_FIERY.copy().setAmount(8),
        BlockGameItems.PRISTINE_STONE.copy().setAmount(16),
        EmiStack.of(Items.GOLD_INGOT, 8)), BlockGameItems.RUNECARVER_BOOTS_2);

    recipe("runecarver/armor/helmet/3", 100, List.of(BlockGameItems.RUNECARVER_HELMET_2,
        BlockGameItems.CORRUPTED_SHARD.copy().setAmount(2),
        BlockGameItems.GLOWING_MOTE.copy().setAmount(2),
        BlockGameItems.FROZEN_STAR.copy().setAmount(2),
        BlockGameItems.WHIPPING_WINDS.copy().setAmount(2),
        BlockGameItems.CRUMBLING_EARTH.copy().setAmount(2),
        BlockGameItems.LIVING_FIRE.copy().setAmount(2),
        BlockGameItems.PRISTINE_STONE.copy().setAmount(32),
        EmiStack.of(Items.GOLD_INGOT, 16)), BlockGameItems.RUNECARVER_HELMET_3);

    recipe("runecarver/armor/chestplate/3", 100, List.of(BlockGameItems.RUNECARVER_CHESTPLATE_2,
        BlockGameItems.CORRUPTED_SHARD.copy().setAmount(2),
        BlockGameItems.GLOWING_MOTE.copy().setAmount(2),
        BlockGameItems.FROZEN_STAR.copy().setAmount(2),
        BlockGameItems.WHIPPING_WINDS.copy().setAmount(2),
        BlockGameItems.CRUMBLING_EARTH.copy().setAmount(2),
        BlockGameItems.LIVING_FIRE.copy().setAmount(2),
        BlockGameItems.PRISTINE_STONE.copy().setAmount(32),
        EmiStack.of(Items.GOLD_INGOT, 16)), BlockGameItems.RUNECARVER_CHESTPLATE_3);

    recipe("runecarver/armor/leggings/3", 100, List.of(BlockGameItems.RUNECARVER_LEGGINGS_2,
        BlockGameItems.CORRUPTED_SHARD.copy().setAmount(2),
        BlockGameItems.GLOWING_MOTE.copy().setAmount(2),
        BlockGameItems.FROZEN_STAR.copy().setAmount(2),
        BlockGameItems.WHIPPING_WINDS.copy().setAmount(2),
        BlockGameItems.CRUMBLING_EARTH.copy().setAmount(2),
        BlockGameItems.LIVING_FIRE.copy().setAmount(2),
        BlockGameItems.PRISTINE_STONE.copy().setAmount(32),
        EmiStack.of(Items.GOLD_INGOT, 16)), BlockGameItems.RUNECARVER_LEGGINGS_3);

    recipe("runecarver/armor/boots/3", 100, List.of(BlockGameItems.RUNECARVER_BOOTS_2,
        BlockGameItems.CORRUPTED_SHARD.copy().setAmount(2),
        BlockGameItems.GLOWING_MOTE.copy().setAmount(2),
        BlockGameItems.FROZEN_STAR.copy().setAmount(2),
        BlockGameItems.WHIPPING_WINDS.copy().setAmount(2),
        BlockGameItems.CRUMBLING_EARTH.copy().setAmount(2),
        BlockGameItems.LIVING_FIRE.copy().setAmount(2),
        BlockGameItems.PRISTINE_STONE.copy().setAmount(32),
        EmiStack.of(Items.GOLD_INGOT, 16)), BlockGameItems.RUNECARVER_BOOTS_3);

    recipe("runecarver/armor/helmet/4", 250, List.of(BlockGameItems.RUNECARVER_HELMET_3,
        BlockGameItems.CORRUPTED_SHARD.copy().setAmount(4),
        BlockGameItems.GLOWING_MOTE.copy().setAmount(4),
        BlockGameItems.FROZEN_STAR.copy().setAmount(4),
        BlockGameItems.WHIPPING_WINDS.copy().setAmount(4),
        BlockGameItems.CRUMBLING_EARTH.copy().setAmount(4),
        BlockGameItems.LIVING_FIRE.copy().setAmount(4),
        BlockGameItems.PRISTINE_STONE.copy().setAmount(48),
        EmiStack.of(Items.GOLD_INGOT, 32)), BlockGameItems.RUNECARVER_HELMET_4);

    recipe("runecarver/armor/chestplate/4", 250, List.of(BlockGameItems.RUNECARVER_CHESTPLATE_3,
        BlockGameItems.CORRUPTED_SHARD.copy().setAmount(4),
        BlockGameItems.GLOWING_MOTE.copy().setAmount(4),
        BlockGameItems.FROZEN_STAR.copy().setAmount(4),
        BlockGameItems.WHIPPING_WINDS.copy().setAmount(4),
        BlockGameItems.CRUMBLING_EARTH.copy().setAmount(4),
        BlockGameItems.LIVING_FIRE.copy().setAmount(4),
        BlockGameItems.PRISTINE_STONE.copy().setAmount(48),
        EmiStack.of(Items.GOLD_INGOT, 32)), BlockGameItems.RUNECARVER_CHESTPLATE_4);

    recipe("runecarver/armor/leggings/4", 250, List.of(BlockGameItems.RUNECARVER_LEGGINGS_3,
        BlockGameItems.CORRUPTED_SHARD.copy().setAmount(4),
        BlockGameItems.GLOWING_MOTE.copy().setAmount(4),
        BlockGameItems.FROZEN_STAR.copy().setAmount(4),
        BlockGameItems.WHIPPING_WINDS.copy().setAmount(4),
        BlockGameItems.CRUMBLING_EARTH.copy().setAmount(4),
        BlockGameItems.LIVING_FIRE.copy().setAmount(4),
        BlockGameItems.PRISTINE_STONE.copy().setAmount(48),
        EmiStack.of(Items.GOLD_INGOT, 32)), BlockGameItems.RUNECARVER_LEGGINGS_4);

    recipe("runecarver/armor/boots/4", 250, List.of(BlockGameItems.RUNECARVER_BOOTS_3,
        BlockGameItems.CORRUPTED_SHARD.copy().setAmount(4),
        BlockGameItems.GLOWING_MOTE.copy().setAmount(4),
        BlockGameItems.FROZEN_STAR.copy().setAmount(4),
        BlockGameItems.WHIPPING_WINDS.copy().setAmount(4),
        BlockGameItems.CRUMBLING_EARTH.copy().setAmount(4),
        BlockGameItems.LIVING_FIRE.copy().setAmount(4),
        BlockGameItems.PRISTINE_STONE.copy().setAmount(48),
        EmiStack.of(Items.GOLD_INGOT, 32)), BlockGameItems.RUNECARVER_BOOTS_4);

    recipe("runecarver/armor/helmet/5", 500, List.of(BlockGameItems.RUNECARVER_HELMET_4,
        BlockGameItems.CORRUPTED_SHARD.copy().setAmount(6),
        BlockGameItems.GLOWING_MOTE.copy().setAmount(6),
        BlockGameItems.FROZEN_STAR.copy().setAmount(6),
        BlockGameItems.WHIPPING_WINDS.copy().setAmount(6),
        BlockGameItems.CRUMBLING_EARTH.copy().setAmount(6),
        BlockGameItems.LIVING_FIRE.copy().setAmount(6),
        BlockGameItems.PRISTINE_STONE.copy().setAmount(64),
        EmiStack.of(Items.GOLD_INGOT, 64)), BlockGameItems.RUNECARVER_HELMET_5);

    recipe("runecarver/armor/chestplate/5", 500, List.of(BlockGameItems.RUNECARVER_CHESTPLATE_4,
        BlockGameItems.CORRUPTED_SHARD.copy().setAmount(6),
        BlockGameItems.GLOWING_MOTE.copy().setAmount(6),
        BlockGameItems.FROZEN_STAR.copy().setAmount(6),
        BlockGameItems.WHIPPING_WINDS.copy().setAmount(6),
        BlockGameItems.CRUMBLING_EARTH.copy().setAmount(6),
        BlockGameItems.LIVING_FIRE.copy().setAmount(6),
        BlockGameItems.PRISTINE_STONE.copy().setAmount(64),
        EmiStack.of(Items.GOLD_INGOT, 64)), BlockGameItems.RUNECARVER_CHESTPLATE_5);

    recipe("runecarver/armor/leggings/5", 500, List.of(BlockGameItems.RUNECARVER_LEGGINGS_4,
        BlockGameItems.CORRUPTED_SHARD.copy().setAmount(6),
        BlockGameItems.GLOWING_MOTE.copy().setAmount(6),
        BlockGameItems.FROZEN_STAR.copy().setAmount(6),
        BlockGameItems.WHIPPING_WINDS.copy().setAmount(6),
        BlockGameItems.CRUMBLING_EARTH.copy().setAmount(6),
        BlockGameItems.LIVING_FIRE.copy().setAmount(6),
        BlockGameItems.PRISTINE_STONE.copy().setAmount(64),
        EmiStack.of(Items.GOLD_INGOT, 64)), BlockGameItems.RUNECARVER_LEGGINGS_5);

    recipe("runecarver/armor/boots/5", 500, List.of(BlockGameItems.RUNECARVER_BOOTS_4,
        BlockGameItems.CORRUPTED_SHARD.copy().setAmount(6),
        BlockGameItems.GLOWING_MOTE.copy().setAmount(6),
        BlockGameItems.FROZEN_STAR.copy().setAmount(6),
        BlockGameItems.WHIPPING_WINDS.copy().setAmount(6),
        BlockGameItems.CRUMBLING_EARTH.copy().setAmount(6),
        BlockGameItems.LIVING_FIRE.copy().setAmount(6),
        BlockGameItems.PRISTINE_STONE.copy().setAmount(64),
        EmiStack.of(Items.GOLD_INGOT, 64)), BlockGameItems.RUNECARVER_BOOTS_5);
  }
}
