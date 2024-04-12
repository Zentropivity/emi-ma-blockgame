package zentropivity.emimablockgame.vendors;

import java.util.List;

import dev.emi.emi.api.stack.EmiStack;
import net.minecraft.item.Items;
import zentropivity.emimablockgame.item.BlockGameItems;

public class WoolweaverPorfirio extends AbstractVendor {
  public WoolweaverPorfirio() {
    super("woolweaverporfirio", BlockGameItems.BOLT_WOOL);

    recipe("woolbolt", 5, List.of(
        EmiStack.of(Items.WHITE_WOOL, 8),
        EmiStack.of(Items.STICK)),
        BlockGameItems.BOLT_WOOL);

    recipe("thaumaturge/helmet/1", 25, List.of(
        BlockGameItems.ESSENCE_VIBRANT.copy().setAmount(2),
        BlockGameItems.BOLT_WOOL.copy().setAmount(4)),
        BlockGameItems.THAUMATURGE_HELMET_1);
    recipe("thaumaturge/chestplate/1", 25, List.of(
        BlockGameItems.ESSENCE_VIBRANT.copy().setAmount(2),
        BlockGameItems.BOLT_WOOL.copy().setAmount(4)),
        BlockGameItems.THAUMATURGE_CHESTPLATE_1);
    recipe("thaumaturge/leggings/1", 25, List.of(
        BlockGameItems.ESSENCE_VIBRANT.copy().setAmount(2),
        BlockGameItems.BOLT_WOOL.copy().setAmount(4)),
        BlockGameItems.THAUMATURGE_LEGGINGS_1);
    recipe("thaumaturge/boots/1", 25, List.of(
        BlockGameItems.ESSENCE_VIBRANT.copy().setAmount(2),
        BlockGameItems.BOLT_WOOL.copy().setAmount(4)),
        BlockGameItems.THAUMATURGE_BOOTS_1);

    recipe("thaumaturge/helmet/2", 50, List.of(
        BlockGameItems.ESSENCE_VIBRANT.copy().setAmount(4),
        BlockGameItems.BOLT_WOOL.copy().setAmount(8),
        BlockGameItems.THAUMATURGE_HELMET_1),
        BlockGameItems.THAUMATURGE_HELMET_2);
    recipe("thaumaturge/chestplate/2", 50, List.of(
        BlockGameItems.ESSENCE_VIBRANT.copy().setAmount(4),
        BlockGameItems.BOLT_WOOL.copy().setAmount(8),
        BlockGameItems.THAUMATURGE_CHESTPLATE_1),
        BlockGameItems.THAUMATURGE_CHESTPLATE_2);
    recipe("thaumaturge/leggings/2", 50, List.of(
        BlockGameItems.ESSENCE_VIBRANT.copy().setAmount(4),
        BlockGameItems.BOLT_WOOL.copy().setAmount(8),
        BlockGameItems.THAUMATURGE_LEGGINGS_1),
        BlockGameItems.THAUMATURGE_LEGGINGS_2);
    recipe("thaumaturge/boots/2", 50, List.of(
        BlockGameItems.ESSENCE_VIBRANT.copy().setAmount(4),
        BlockGameItems.BOLT_WOOL.copy().setAmount(8),
        BlockGameItems.THAUMATURGE_BOOTS_1),
        BlockGameItems.THAUMATURGE_BOOTS_2);

    recipe("thaumaturge/helmet/3", 100, List.of(
        BlockGameItems.NECRONOMICON,
        BlockGameItems.POTION_HEALING,
        BlockGameItems.ESSENCE_VIBRANT.copy().setAmount(8),
        BlockGameItems.BOLT_WOOL.copy().setAmount(12),
        BlockGameItems.THAUMATURGE_HELMET_2),
        BlockGameItems.THAUMATURGE_HELMET_3);
    recipe("thaumaturge/chestplate/3", 100, List.of(
        BlockGameItems.NECRONOMICON,
        BlockGameItems.POTION_HEALING,
        BlockGameItems.ESSENCE_VIBRANT.copy().setAmount(8),
        BlockGameItems.BOLT_WOOL.copy().setAmount(12),
        BlockGameItems.THAUMATURGE_CHESTPLATE_2),
        BlockGameItems.THAUMATURGE_CHESTPLATE_3);
    recipe("thaumaturge/leggings/3", 100, List.of(
        BlockGameItems.NECRONOMICON,
        BlockGameItems.POTION_HEALING,
        BlockGameItems.ESSENCE_VIBRANT.copy().setAmount(8),
        BlockGameItems.BOLT_WOOL.copy().setAmount(12),
        BlockGameItems.THAUMATURGE_LEGGINGS_2),
        BlockGameItems.THAUMATURGE_LEGGINGS_3);
    recipe("thaumaturge/boots/3", 100, List.of(
        BlockGameItems.NECRONOMICON,
        BlockGameItems.POTION_HEALING,
        BlockGameItems.ESSENCE_VIBRANT.copy().setAmount(8),
        BlockGameItems.BOLT_WOOL.copy().setAmount(12),
        BlockGameItems.THAUMATURGE_BOOTS_2),
        BlockGameItems.THAUMATURGE_BOOTS_3);

    recipe("thaumaturge/helmet/4", 250, List.of(
        BlockGameItems.BACON_BITS.copy().setAmount(64),
        BlockGameItems.POTION_HEALING_GLOWING,
        BlockGameItems.BOLT_WOOL.copy().setAmount(16),
        BlockGameItems.THAUMATURGE_HELMET_3),
        BlockGameItems.THAUMATURGE_HELMET_4);
    recipe("thaumaturge/chestplate/4", 250, List.of(
        BlockGameItems.BACON_BITS.copy().setAmount(64),
        BlockGameItems.POTION_HEALING_GLOWING,
        BlockGameItems.BOLT_WOOL.copy().setAmount(16),
        BlockGameItems.THAUMATURGE_CHESTPLATE_3),
        BlockGameItems.THAUMATURGE_CHESTPLATE_4);
    recipe("thaumaturge/leggings/4", 250, List.of(
        BlockGameItems.BACON_BITS.copy().setAmount(64),
        BlockGameItems.POTION_HEALING_GLOWING,
        BlockGameItems.BOLT_WOOL.copy().setAmount(16),
        BlockGameItems.THAUMATURGE_LEGGINGS_3),
        BlockGameItems.THAUMATURGE_LEGGINGS_4);
    recipe("thaumaturge/boots/4", 250, List.of(
        BlockGameItems.BACON_BITS.copy().setAmount(64),
        BlockGameItems.POTION_HEALING_GLOWING,
        BlockGameItems.BOLT_WOOL.copy().setAmount(16),
        BlockGameItems.THAUMATURGE_BOOTS_3),
        BlockGameItems.THAUMATURGE_BOOTS_4);

    recipe("thaumaturge/helmet/5", 500, List.of(
        BlockGameItems.CURSED_SAND.copy().setAmount(64),
        BlockGameItems.POTION_HEALING_GLOWING.copy().setAmount(2),
        BlockGameItems.BOLT_WOOL.copy().setAmount(20),
        BlockGameItems.THAUMATURGE_HELMET_4),
        BlockGameItems.THAUMATURGE_HELMET_5);
    recipe("thaumaturge/chestplate/5", 500, List.of(
        BlockGameItems.CURSED_SAND.copy().setAmount(64),
        BlockGameItems.POTION_HEALING_GLOWING.copy().setAmount(2),
        BlockGameItems.BOLT_WOOL.copy().setAmount(20),
        BlockGameItems.THAUMATURGE_CHESTPLATE_4),
        BlockGameItems.THAUMATURGE_CHESTPLATE_5);
    recipe("thaumaturge/leggings/5", 500, List.of(
        BlockGameItems.CURSED_SAND.copy().setAmount(64),
        BlockGameItems.POTION_HEALING_GLOWING.copy().setAmount(2),
        BlockGameItems.BOLT_WOOL.copy().setAmount(20),
        BlockGameItems.THAUMATURGE_LEGGINGS_4),
        BlockGameItems.THAUMATURGE_LEGGINGS_5);
    recipe("thaumaturge/boots/5", 500, List.of(
        BlockGameItems.CURSED_SAND.copy().setAmount(64),
        BlockGameItems.POTION_HEALING_GLOWING.copy().setAmount(2),
        BlockGameItems.BOLT_WOOL.copy().setAmount(20),
        BlockGameItems.THAUMATURGE_BOOTS_4),
        BlockGameItems.THAUMATURGE_BOOTS_5);

    recipe("thaumaturge/helmet/6", 1000, List.of(
        BlockGameItems.TAINTED_METAL.copy().setAmount(4),
        BlockGameItems.RIGHTEOUS_SOUL.copy().setAmount(2),
        BlockGameItems.POTION_HEALING_GLOWING.copy().setAmount(3),
        BlockGameItems.BOLT_WOOL.copy().setAmount(24),
        BlockGameItems.HORRID_HELMET,
        BlockGameItems.THAUMATURGE_HELMET_5),
        BlockGameItems.THAUMATURGE_HELMET_6);
    recipe("thaumaturge/chestplate/6", 1000, List.of(
        BlockGameItems.TAINTED_METAL.copy().setAmount(4),
        BlockGameItems.RIGHTEOUS_SOUL.copy().setAmount(2),
        BlockGameItems.POTION_HEALING_GLOWING.copy().setAmount(3),
        BlockGameItems.BOLT_WOOL.copy().setAmount(24),
        BlockGameItems.HORRID_CHESTPLATE,
        BlockGameItems.THAUMATURGE_CHESTPLATE_5),
        BlockGameItems.THAUMATURGE_CHESTPLATE_6);
    recipe("thaumaturge/leggings/6", 1000, List.of(
        BlockGameItems.TAINTED_METAL.copy().setAmount(4),
        BlockGameItems.RIGHTEOUS_SOUL.copy().setAmount(2),
        BlockGameItems.POTION_HEALING_GLOWING.copy().setAmount(3),
        BlockGameItems.BOLT_WOOL.copy().setAmount(24),
        BlockGameItems.HORRID_LEGGINGS,
        BlockGameItems.THAUMATURGE_LEGGINGS_5),
        BlockGameItems.THAUMATURGE_LEGGINGS_6);
    recipe("thaumaturge/boots/6", 1000, List.of(
        BlockGameItems.TAINTED_METAL.copy().setAmount(4),
        BlockGameItems.RIGHTEOUS_SOUL.copy().setAmount(2),
        BlockGameItems.POTION_HEALING_GLOWING.copy().setAmount(3),
        BlockGameItems.BOLT_WOOL.copy().setAmount(24),
        BlockGameItems.HORRID_BOOTS,
        BlockGameItems.THAUMATURGE_BOOTS_5),
        BlockGameItems.THAUMATURGE_BOOTS_6);
  }
}
