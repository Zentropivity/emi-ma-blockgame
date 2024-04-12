package zentropivity.emimablockgame.vendors;

import java.util.List;

import dev.emi.emi.api.stack.EmiStack;
import net.minecraft.item.Items;
import zentropivity.emimablockgame.item.BlockGameItems;

public class ThaumaturgeGregory extends AbstractVendor {
  public ThaumaturgeGregory() {
    super("thaumaturgegregory", BlockGameItems.THAUMATURGE_IMPLEMENT_5);

    recipe("thaumaturge/implement/1", 25, List.of(
        BlockGameItems.ESSENCE_VIBRANT.copy().setAmount(2),
        EmiStack.of(Items.IRON_INGOT)),
        BlockGameItems.THAUMATURGE_IMPLEMENT_1);
    recipe("thaumaturge/implement/2", 50, List.of(
        EmiStack.of(Items.LANTERN),
        BlockGameItems.ESSENCE_VIBRANT.copy().setAmount(4),
        BlockGameItems.THAUMATURGE_IMPLEMENT_1),
        BlockGameItems.THAUMATURGE_IMPLEMENT_2);
    recipe("thaumaturge/implement/3", 100, List.of(
        BlockGameItems.POTION_HEALING.copy().setAmount(2),
        BlockGameItems.THAUMATURGE_IMPLEMENT_2),
        BlockGameItems.THAUMATURGE_IMPLEMENT_3);
    recipe("thaumaturge/implement/4", 250, List.of(
        EmiStack.of(Items.SOUL_LANTERN),
        BlockGameItems.WHIPPING_WINDS,
        BlockGameItems.POTION_HEALING_GLOWING.copy().setAmount(2),
        BlockGameItems.BACON_BITS.copy().setAmount(64),
        BlockGameItems.THAUMATURGE_IMPLEMENT_3),
        BlockGameItems.THAUMATURGE_IMPLEMENT_4);
    recipe("thaumaturge/implement/5", 500, List.of(
        BlockGameItems.POTION_HEALING_GLOWING.copy().setAmount(3),
        BlockGameItems.CURSED_SAND.copy().setAmount(64),
        BlockGameItems.THAUMATURGE_IMPLEMENT_4),
        BlockGameItems.THAUMATURGE_IMPLEMENT_5);

    recipe("thaumaturge/lifedrain/1", 25, List.of(
        BlockGameItems.ANIMATED_BONE.copy().setAmount(2),
        BlockGameItems.ESSENCE_VIBRANT.copy().setAmount(3),
        EmiStack.of(Items.BOOK),
        EmiStack.of(Items.AMETHYST_SHARD, 8)),
        BlockGameItems.TOME_LIFE_DRAIN_1);
    recipe("thaumaturge/flashheal/1", 25, List.of(
        BlockGameItems.POTION_LAPIS,
        BlockGameItems.POTION_REDSTONE,
        EmiStack.of(Items.BOOK),
        EmiStack.of(Items.AMETHYST_SHARD, 8)),
        BlockGameItems.TOME_FLASH_HEAL_1);
    recipe("thaumaturge/regeneration/1", 25, List.of(
        BlockGameItems.POTION_LAPIS,
        BlockGameItems.POTION_REDSTONE,
        EmiStack.of(Items.BOOK),
        EmiStack.of(Items.AMETHYST_SHARD, 8)),
        BlockGameItems.TOME_REGENERATION_1);
    recipe("thaumaturge/ringofmercy/1", 25, List.of(
        BlockGameItems.POTION_LAPIS,
        BlockGameItems.POTION_REDSTONE,
        EmiStack.of(Items.BOOK),
        EmiStack.of(Items.AMETHYST_SHARD, 8)),
        BlockGameItems.TOME_RING_OF_MERCY_1);
    recipe("thaumaturge/corruption/1", 25, List.of(
        BlockGameItems.ANIMATED_BONE.copy().setAmount(2),
        BlockGameItems.ESSENCE_VIBRANT.copy().setAmount(3),
        EmiStack.of(Items.BOOK),
        EmiStack.of(Items.AMETHYST_SHARD, 8)),
        BlockGameItems.TOME_CORRUPTION_1);

    recipe("thaumaturge/lifedrain/2", 50, List.of(
        BlockGameItems.ZOMBIE_LEATHER.copy().setAmount(2),
        BlockGameItems.ANIMATED_BONE.copy().setAmount(4),
        BlockGameItems.ESSENCE_VIBRANT.copy().setAmount(6),
        EmiStack.of(Items.BOOK),
        EmiStack.of(Items.AMETHYST_SHARD, 16),
        BlockGameItems.TOME_LIFE_DRAIN_1),
        BlockGameItems.TOME_LIFE_DRAIN_2);
    recipe("thaumaturge/flashheal/2", 50, List.of(
        BlockGameItems.POTION_LAPIS.copy().setAmount(2),
        BlockGameItems.POTION_REDSTONE.copy().setAmount(2),
        EmiStack.of(Items.BOOK),
        EmiStack.of(Items.AMETHYST_SHARD, 16),
        BlockGameItems.TOME_FLASH_HEAL_1),
        BlockGameItems.TOME_FLASH_HEAL_2);
    recipe("thaumaturge/regeneration/2", 50, List.of(
        BlockGameItems.POTION_LAPIS.copy().setAmount(2),
        BlockGameItems.POTION_REDSTONE.copy().setAmount(2),
        EmiStack.of(Items.BOOK),
        EmiStack.of(Items.AMETHYST_SHARD, 16),
        BlockGameItems.TOME_REGENERATION_1),
        BlockGameItems.TOME_REGENERATION_2);
    recipe("thaumaturge/ringofmercy/2", 50, List.of(
        BlockGameItems.POTION_LAPIS.copy().setAmount(2),
        BlockGameItems.POTION_REDSTONE.copy().setAmount(2),
        EmiStack.of(Items.BOOK),
        EmiStack.of(Items.AMETHYST_SHARD, 16),
        BlockGameItems.TOME_RING_OF_MERCY_1),
        BlockGameItems.TOME_RING_OF_MERCY_2);
    recipe("thaumaturge/corruption/2", 50, List.of(
        BlockGameItems.ZOMBIE_LEATHER.copy().setAmount(2),
        BlockGameItems.ANIMATED_BONE.copy().setAmount(4),
        BlockGameItems.ESSENCE_VIBRANT.copy().setAmount(6),
        EmiStack.of(Items.BOOK),
        EmiStack.of(Items.AMETHYST_SHARD, 16),
        BlockGameItems.TOME_CORRUPTION_1),
        BlockGameItems.TOME_CORRUPTION_2);

    recipe("thaumaturge/lifedrain/3", 100, List.of(
        BlockGameItems.ESSENCE_VIBRANT.copy().setAmount(8),
        BlockGameItems.NECRONOMICON,
        EmiStack.of(Items.AMETHYST_SHARD, 32),
        BlockGameItems.TOME_LIFE_DRAIN_2),
        BlockGameItems.TOME_LIFE_DRAIN_3);
    recipe("thaumaturge/flashheal/3", 100, List.of(
        BlockGameItems.POTION_HEALING,
        BlockGameItems.NECRONOMICON,
        EmiStack.of(Items.AMETHYST_SHARD, 32),
        BlockGameItems.TOME_FLASH_HEAL_2),
        BlockGameItems.TOME_FLASH_HEAL_3);
    recipe("thaumaturge/regeneration/3", 100, List.of(
        BlockGameItems.POTION_HEALING,
        BlockGameItems.NECRONOMICON,
        EmiStack.of(Items.AMETHYST_SHARD, 32),
        BlockGameItems.TOME_REGENERATION_2),
        BlockGameItems.TOME_REGENERATION_3);
    recipe("thaumaturge/ringofmercy/3", 100, List.of(
        BlockGameItems.POTION_HEALING,
        BlockGameItems.NECRONOMICON,
        EmiStack.of(Items.AMETHYST_SHARD, 32),
        BlockGameItems.TOME_RING_OF_MERCY_2),
        BlockGameItems.TOME_RING_OF_MERCY_3);
    recipe("thaumaturge/corruption/3", 100, List.of(
        BlockGameItems.ESSENCE_VIBRANT.copy().setAmount(8),
        BlockGameItems.NECRONOMICON,
        EmiStack.of(Items.AMETHYST_SHARD, 32),
        BlockGameItems.TOME_CORRUPTION_2),
        BlockGameItems.TOME_CORRUPTION_3);

    recipe("thaumaturge/lifedrain/4", 250, List.of(
        BlockGameItems.COAGULATED_MASS,
        BlockGameItems.NECRONOMICON,
        BlockGameItems.BACON_BITS.copy().setAmount(64),
        EmiStack.of(Items.AMETHYST_SHARD, 48),
        BlockGameItems.TOME_LIFE_DRAIN_3),
        BlockGameItems.TOME_LIFE_DRAIN_4);
    recipe("thaumaturge/flashheal/4", 250, List.of(
        BlockGameItems.POTION_HEALING_GLOWING.copy().setAmount(2),
        BlockGameItems.NECRONOMICON,
        BlockGameItems.BACON_BITS.copy().setAmount(64),
        EmiStack.of(Items.AMETHYST_SHARD, 48),
        BlockGameItems.TOME_FLASH_HEAL_3),
        BlockGameItems.TOME_FLASH_HEAL_4);
    recipe("thaumaturge/regeneration/4", 250, List.of(
        BlockGameItems.POTION_HEALING_GLOWING.copy().setAmount(2),
        BlockGameItems.NECRONOMICON,
        BlockGameItems.BACON_BITS.copy().setAmount(64),
        EmiStack.of(Items.AMETHYST_SHARD, 48),
        BlockGameItems.TOME_REGENERATION_3),
        BlockGameItems.TOME_REGENERATION_4);
    recipe("thaumaturge/ringofmercy/4", 250, List.of(
        BlockGameItems.POTION_HEALING_GLOWING.copy().setAmount(2),
        BlockGameItems.NECRONOMICON,
        BlockGameItems.BACON_BITS.copy().setAmount(64),
        EmiStack.of(Items.AMETHYST_SHARD, 48),
        BlockGameItems.TOME_RING_OF_MERCY_3),
        BlockGameItems.TOME_RING_OF_MERCY_4);
    recipe("thaumaturge/corruption/4", 250, List.of(
        BlockGameItems.COAGULATED_MASS,
        BlockGameItems.NECRONOMICON,
        BlockGameItems.BACON_BITS.copy().setAmount(64),
        EmiStack.of(Items.AMETHYST_SHARD, 48),
        BlockGameItems.TOME_CORRUPTION_3),
        BlockGameItems.TOME_CORRUPTION_4);

    recipe("thaumaturge/lifedrain/5", 500, List.of(
        BlockGameItems.COAGULATED_MASS.copy().setAmount(3),
        BlockGameItems.NECRONOMICON,
        BlockGameItems.CURSED_SAND.copy().setAmount(64),
        EmiStack.of(Items.AMETHYST_SHARD, 64),
        BlockGameItems.TOME_LIFE_DRAIN_4),
        BlockGameItems.TOME_LIFE_DRAIN_5);
    recipe("thaumaturge/flashheal/5", 500, List.of(
        BlockGameItems.POTION_HEALING_GLOWING.copy().setAmount(3),
        BlockGameItems.NECRONOMICON,
        BlockGameItems.CURSED_SAND.copy().setAmount(64),
        EmiStack.of(Items.AMETHYST_SHARD, 64),
        BlockGameItems.TOME_FLASH_HEAL_4),
        BlockGameItems.TOME_FLASH_HEAL_5);
    recipe("thaumaturge/regeneration/5", 500, List.of(
        BlockGameItems.POTION_HEALING_GLOWING.copy().setAmount(3),
        BlockGameItems.NECRONOMICON,
        BlockGameItems.CURSED_SAND.copy().setAmount(64),
        EmiStack.of(Items.AMETHYST_SHARD, 64),
        BlockGameItems.TOME_REGENERATION_4),
        BlockGameItems.TOME_REGENERATION_5);
    recipe("thaumaturge/ringofmercy/5", 500, List.of(
        BlockGameItems.POTION_HEALING_GLOWING.copy().setAmount(3),
        BlockGameItems.NECRONOMICON,
        BlockGameItems.CURSED_SAND.copy().setAmount(64),
        EmiStack.of(Items.AMETHYST_SHARD, 64),
        BlockGameItems.TOME_RING_OF_MERCY_4),
        BlockGameItems.TOME_RING_OF_MERCY_5);
    recipe("thaumaturge/corruption/5", 500, List.of(
        BlockGameItems.COAGULATED_MASS.copy().setAmount(3),
        BlockGameItems.NECRONOMICON,
        BlockGameItems.CURSED_SAND.copy().setAmount(64),
        EmiStack.of(Items.AMETHYST_SHARD, 64),
        BlockGameItems.TOME_CORRUPTION_4),
        BlockGameItems.TOME_CORRUPTION_5);

    recipe("thaumaturge/lifedrain/6", 1000, List.of(
        BlockGameItems.CORRUPTED_SOUL.copy().setAmount(4),
        BlockGameItems.COAGULATED_MASS.copy().setAmount(5),
        BlockGameItems.NECRONOMICON,
        EmiStack.of(Items.AMETHYST_SHARD, 64),
        BlockGameItems.TOME_LIFE_DRAIN_4),
        BlockGameItems.TOME_LIFE_DRAIN_5);
    recipe("thaumaturge/flashheal/6", 1000, List.of(
        BlockGameItems.RIGHTEOUS_SOUL.copy().setAmount(4),
        BlockGameItems.POTION_HEALING_GLOWING.copy().setAmount(5),
        BlockGameItems.NECRONOMICON,
        EmiStack.of(Items.AMETHYST_SHARD, 64),
        BlockGameItems.TOME_FLASH_HEAL_4),
        BlockGameItems.TOME_FLASH_HEAL_5);
    recipe("thaumaturge/regeneration/6", 1000, List.of(
        BlockGameItems.RIGHTEOUS_SOUL.copy().setAmount(4),
        BlockGameItems.POTION_HEALING_GLOWING.copy().setAmount(5),
        BlockGameItems.NECRONOMICON,
        EmiStack.of(Items.AMETHYST_SHARD, 64),
        BlockGameItems.TOME_REGENERATION_4),
        BlockGameItems.TOME_REGENERATION_5);
    recipe("thaumaturge/ringofmercy/6", 1000, List.of(
        BlockGameItems.RIGHTEOUS_SOUL.copy().setAmount(4),
        BlockGameItems.POTION_HEALING_GLOWING.copy().setAmount(5),
        BlockGameItems.NECRONOMICON,
        EmiStack.of(Items.AMETHYST_SHARD, 64),
        BlockGameItems.TOME_RING_OF_MERCY_4),
        BlockGameItems.TOME_RING_OF_MERCY_5);
    recipe("thaumaturge/corruption/6", 1000, List.of(
        BlockGameItems.CORRUPTED_SOUL.copy().setAmount(4),
        BlockGameItems.COAGULATED_MASS.copy().setAmount(5),
        BlockGameItems.NECRONOMICON,
        EmiStack.of(Items.AMETHYST_SHARD, 64),
        BlockGameItems.TOME_CORRUPTION_4),
        BlockGameItems.TOME_CORRUPTION_5);

  }
}
