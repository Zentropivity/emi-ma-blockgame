package zentropivity.emimablockgame.vendors;

import java.util.List;

import dev.emi.emi.api.stack.EmiStack;
import net.minecraft.item.Items;
import zentropivity.emimablockgame.item.BlockGameItems;

public class SpellcrafterSally extends AbstractVendor {
  public SpellcrafterSally() {
    super("spellcraftersally", BlockGameItems.WIZARD_FOCUS_5);

    recipe("wizard/focus/1", 25, List.of(
        BlockGameItems.ESSENCE_FLEETING.copy().setAmount(4),
        EmiStack.of(Items.GLASS, 4)),
        BlockGameItems.WIZARD_FOCUS_1);
    recipe("wizard/focus/2", 50, List.of(
        EmiStack.of(Items.SLIME_BALL, 8),
        EmiStack.of(Items.TINTED_GLASS, 4),
        BlockGameItems.WIZARD_FOCUS_1),
        BlockGameItems.WIZARD_FOCUS_2);
    recipe("wizard/focus/3", 100, List.of(
        BlockGameItems.NECRONOMICON,
        BlockGameItems.ANIMATED_BONE.copy().setAmount(2),
        BlockGameItems.LOBSTER_SOUL.copy().setAmount(3),
        BlockGameItems.WIZARD_FOCUS_2),
        BlockGameItems.WIZARD_FOCUS_3);
    recipe("wizard/focus/4", 250, List.of(
        BlockGameItems.WHIPPING_WINDS,
        BlockGameItems.BACON_BITS.copy().setAmount(64),
        BlockGameItems.WIZARD_FOCUS_3),
        BlockGameItems.WIZARD_FOCUS_4);
    recipe("wizard/focus/5", 500, List.of(
        BlockGameItems.WHIPPING_WINDS.copy().setAmount(2),
        BlockGameItems.CURSED_SAND.copy().setAmount(64),
        BlockGameItems.WIZARD_FOCUS_4),
        BlockGameItems.WIZARD_FOCUS_5);

    recipe("wizard/frostbolt/1", 25, List.of(
        BlockGameItems.BOTTLE_FROST,
        EmiStack.of(Items.BOOK),
        EmiStack.of(Items.AMETHYST_SHARD, 8)),
        BlockGameItems.TOME_FROSTBOLT_1);
    recipe("wizard/firebolt/1", 25, List.of(
        BlockGameItems.BOTTLE_LAVA,
        EmiStack.of(Items.BOOK),
        EmiStack.of(Items.AMETHYST_SHARD, 8)),
        BlockGameItems.TOME_FIREBOLT_1);
    recipe("wizard/pressurewave/1", 25, List.of(
        BlockGameItems.BOTTLE_WIND,
        EmiStack.of(Items.BOOK),
        EmiStack.of(Items.AMETHYST_SHARD, 8)),
        BlockGameItems.TOME_PRESSURE_WAVE_1);
    recipe("wizard/collapsingearth/1", 25, List.of(
        BlockGameItems.BOTTLE_EARTH,
        EmiStack.of(Items.BOOK),
        EmiStack.of(Items.AMETHYST_SHARD, 8)),
        BlockGameItems.TOME_COLLAPSING_EARTH_1);

    recipe("wizard/frostbolt/2", 50, List.of(
        BlockGameItems.BOTTLE_FROST.copy().setAmount(2),
        EmiStack.of(Items.BOOK),
        EmiStack.of(Items.AMETHYST_SHARD, 16),
        BlockGameItems.TOME_FROSTBOLT_1),
        BlockGameItems.TOME_FROSTBOLT_2);
    recipe("wizard/firebolt/2", 50, List.of(
        BlockGameItems.BOTTLE_LAVA.copy().setAmount(2),
        EmiStack.of(Items.BOOK),
        EmiStack.of(Items.AMETHYST_SHARD, 16),
        BlockGameItems.TOME_FIREBOLT_1),
        BlockGameItems.TOME_FIREBOLT_2);
    recipe("wizard/pressurewave/2", 50, List.of(
        BlockGameItems.BOTTLE_WIND.copy().setAmount(2),
        EmiStack.of(Items.BOOK),
        EmiStack.of(Items.AMETHYST_SHARD, 16),
        BlockGameItems.TOME_PRESSURE_WAVE_1),
        BlockGameItems.TOME_PRESSURE_WAVE_2);
    recipe("wizard/collapsingearth/2", 50, List.of(
        BlockGameItems.BOTTLE_EARTH.copy().setAmount(2),
        EmiStack.of(Items.BOOK),
        EmiStack.of(Items.AMETHYST_SHARD, 16),
        BlockGameItems.TOME_COLLAPSING_EARTH_1),
        BlockGameItems.TOME_COLLAPSING_EARTH_2);

    recipe("wizard/frostbolt/3", 100, List.of(
        BlockGameItems.NECRONOMICON,
        BlockGameItems.ESSENCE_DAMP.copy().setAmount(8),
        EmiStack.of(Items.AMETHYST_SHARD, 32),
        BlockGameItems.TOME_FROSTBOLT_2),
        BlockGameItems.TOME_FROSTBOLT_3);
    recipe("wizard/firebolt/3", 100, List.of(
        BlockGameItems.NECRONOMICON,
        BlockGameItems.ESSENCE_FIERY.copy().setAmount(8),
        EmiStack.of(Items.AMETHYST_SHARD, 32),
        BlockGameItems.TOME_FIREBOLT_2),
        BlockGameItems.TOME_FIREBOLT_3);
    recipe("wizard/pressurewave/3", 100, List.of(
        BlockGameItems.NECRONOMICON,
        BlockGameItems.ESSENCE_FLEETING.copy().setAmount(8),
        EmiStack.of(Items.AMETHYST_SHARD, 32),
        BlockGameItems.TOME_PRESSURE_WAVE_2),
        BlockGameItems.TOME_PRESSURE_WAVE_3);
    recipe("wizard/collapsingearth/3", 100, List.of(
        BlockGameItems.NECRONOMICON,
        BlockGameItems.ESSENCE_ROCKY.copy().setAmount(8),
        EmiStack.of(Items.AMETHYST_SHARD, 32),
        BlockGameItems.TOME_COLLAPSING_EARTH_2),
        BlockGameItems.TOME_COLLAPSING_EARTH_3);

    recipe("wizard/frostbolt/4", 250, List.of(
        BlockGameItems.NECRONOMICON,
        BlockGameItems.FROZEN_STAR,
        BlockGameItems.BACON_BITS.copy().setAmount(64),
        EmiStack.of(Items.AMETHYST_SHARD, 48),
        BlockGameItems.TOME_FROSTBOLT_3),
        BlockGameItems.TOME_FROSTBOLT_4);
    recipe("wizard/firebolt/4", 250, List.of(
        BlockGameItems.NECRONOMICON,
        BlockGameItems.LIVING_FIRE,
        BlockGameItems.BACON_BITS.copy().setAmount(64),
        EmiStack.of(Items.AMETHYST_SHARD, 48),
        BlockGameItems.TOME_FIREBOLT_3),
        BlockGameItems.TOME_FIREBOLT_4);
    recipe("wizard/pressurewave/4", 250, List.of(
        BlockGameItems.NECRONOMICON,
        BlockGameItems.WHIPPING_WINDS,
        BlockGameItems.BACON_BITS.copy().setAmount(64),
        EmiStack.of(Items.AMETHYST_SHARD, 48),
        BlockGameItems.TOME_PRESSURE_WAVE_3),
        BlockGameItems.TOME_PRESSURE_WAVE_4);
    recipe("wizard/collapsingearth/4", 250, List.of(
        BlockGameItems.NECRONOMICON,
        BlockGameItems.CRUMBLING_EARTH,
        BlockGameItems.BACON_BITS.copy().setAmount(64),
        EmiStack.of(Items.AMETHYST_SHARD, 64),
        BlockGameItems.TOME_COLLAPSING_EARTH_3),
        BlockGameItems.TOME_COLLAPSING_EARTH_4);

    recipe("wizard/frostbolt/5", 500, List.of(
        BlockGameItems.NECRONOMICON,
        BlockGameItems.FROZEN_STAR.copy().setAmount(2),
        BlockGameItems.CURSED_SAND.copy().setAmount(64),
        EmiStack.of(Items.AMETHYST_SHARD, 64),
        BlockGameItems.TOME_FROSTBOLT_4),
        BlockGameItems.TOME_FROSTBOLT_5);
    recipe("wizard/firebolt/5", 500, List.of(
        BlockGameItems.NECRONOMICON,
        BlockGameItems.LIVING_FIRE.copy().setAmount(2),
        BlockGameItems.CURSED_SAND.copy().setAmount(64),
        EmiStack.of(Items.AMETHYST_SHARD, 64),
        BlockGameItems.TOME_FIREBOLT_4),
        BlockGameItems.TOME_FIREBOLT_5);
    recipe("wizard/pressurewave/5", 500, List.of(
        BlockGameItems.NECRONOMICON,
        BlockGameItems.WHIPPING_WINDS.copy().setAmount(2),
        BlockGameItems.CURSED_SAND.copy().setAmount(64),
        EmiStack.of(Items.AMETHYST_SHARD, 64),
        BlockGameItems.TOME_PRESSURE_WAVE_4),
        BlockGameItems.TOME_PRESSURE_WAVE_5);
    recipe("wizard/collapsingearth/5", 500, List.of(
        BlockGameItems.NECRONOMICON,
        BlockGameItems.CRUMBLING_EARTH.copy().setAmount(2),
        BlockGameItems.CURSED_SAND.copy().setAmount(64),
        EmiStack.of(Items.AMETHYST_SHARD, 64),
        BlockGameItems.TOME_COLLAPSING_EARTH_4),
        BlockGameItems.TOME_COLLAPSING_EARTH_5);

    recipe("wizard/frostbolt/6", 1000, List.of(
        BlockGameItems.NECRONOMICON.copy().setAmount(3),
        BlockGameItems.FROZEN_STAR.copy().setAmount(3),
        BlockGameItems.FROZEN_SOUL.copy().setAmount(4),
        EmiStack.of(Items.AMETHYST_SHARD, 64),
        BlockGameItems.TOME_FROSTBOLT_5),
        BlockGameItems.TOME_FROSTBOLT_6);
    recipe("wizard/firebolt/6", 1000, List.of(
        BlockGameItems.NECRONOMICON.copy().setAmount(3),
        BlockGameItems.LIVING_FIRE.copy().setAmount(3),
        BlockGameItems.BRANDED_SOUL.copy().setAmount(4),
        EmiStack.of(Items.AMETHYST_SHARD, 64),
        BlockGameItems.TOME_FIREBOLT_5),
        BlockGameItems.TOME_FIREBOLT_6);
    recipe("wizard/pressurewave/6", 1000, List.of(
        BlockGameItems.NECRONOMICON.copy().setAmount(3),
        BlockGameItems.WHIPPING_WINDS.copy().setAmount(3),
        BlockGameItems.RIGHTEOUS_SOUL.copy().setAmount(4),
        EmiStack.of(Items.AMETHYST_SHARD, 64),
        BlockGameItems.TOME_PRESSURE_WAVE_5),
        BlockGameItems.TOME_PRESSURE_WAVE_6);
    recipe("wizard/collapsingearth/6", 1000, List.of(
        BlockGameItems.NECRONOMICON.copy().setAmount(3),
        BlockGameItems.CRUMBLING_EARTH.copy().setAmount(3),
        BlockGameItems.CORRUPTED_SOUL.copy().setAmount(4),
        EmiStack.of(Items.AMETHYST_SHARD, 64),
        BlockGameItems.TOME_COLLAPSING_EARTH_5),
        BlockGameItems.TOME_COLLAPSING_EARTH_6);

  }
}
