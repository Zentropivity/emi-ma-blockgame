package zentropivity.emimablockgame.vendors;

import java.util.List;

import dev.emi.emi.api.stack.EmiStack;
import net.minecraft.item.Items;
import zentropivity.emimablockgame.item.BlockGameItems;

public class SilkweaverWendy extends AbstractVendor {
  public SilkweaverWendy() {
    super("silkweaverwendy", BlockGameItems.BOLT_SILK);

    recipe("silkbolt", 5, List.of(
        EmiStack.of(Items.STRING, 8),
        EmiStack.of(Items.STICK)),
        BlockGameItems.BOLT_SILK);

    recipe("wizard/helmet/1", 25, List.of(
        BlockGameItems.ESSENCE_FLEETING.copy().setAmount(2),
        BlockGameItems.BOLT_SILK.copy().setAmount(4)),
        BlockGameItems.WIZARD_HELMET_1);
    recipe("wizard/chestplate/1", 25, List.of(
        BlockGameItems.ESSENCE_FLEETING.copy().setAmount(2),
        BlockGameItems.BOLT_SILK.copy().setAmount(4)),
        BlockGameItems.WIZARD_CHESTPLATE_1);
    recipe("wizard/leggings/1", 25, List.of(
        BlockGameItems.ESSENCE_FLEETING.copy().setAmount(2),
        BlockGameItems.BOLT_SILK.copy().setAmount(4)),
        BlockGameItems.WIZARD_LEGGINGS_1);
    recipe("wizard/boots/1", 25, List.of(
        BlockGameItems.ESSENCE_FLEETING.copy().setAmount(2),
        BlockGameItems.BOLT_SILK.copy().setAmount(4)),
        BlockGameItems.WIZARD_BOOTS_1);

    recipe("wizard/helmet/2", 50, List.of(
        BlockGameItems.ESSENCE_FLEETING.copy().setAmount(4),
        BlockGameItems.BOLT_SILK.copy().setAmount(8),
        BlockGameItems.WIZARD_HELMET_1),
        BlockGameItems.WIZARD_HELMET_2);
    recipe("wizard/chestplate/2", 50, List.of(
        BlockGameItems.ESSENCE_FLEETING.copy().setAmount(4),
        BlockGameItems.BOLT_SILK.copy().setAmount(8),
        BlockGameItems.WIZARD_CHESTPLATE_1),
        BlockGameItems.WIZARD_CHESTPLATE_2);
    recipe("wizard/leggings/2", 50, List.of(
        BlockGameItems.ESSENCE_FLEETING.copy().setAmount(4),
        BlockGameItems.BOLT_SILK.copy().setAmount(8),
        BlockGameItems.WIZARD_LEGGINGS_1),
        BlockGameItems.WIZARD_LEGGINGS_2);
    recipe("wizard/boots/2", 50, List.of(
        BlockGameItems.ESSENCE_FLEETING.copy().setAmount(4),
        BlockGameItems.BOLT_SILK.copy().setAmount(8),
        BlockGameItems.WIZARD_BOOTS_1),
        BlockGameItems.WIZARD_BOOTS_2);

    recipe("wizard/helmet/3", 100, List.of(
        BlockGameItems.NECRONOMICON,
        BlockGameItems.ESSENCE_FLEETING.copy().setAmount(8),
        BlockGameItems.BOLT_SILK.copy().setAmount(12),
        BlockGameItems.WIZARD_HELMET_2),
        BlockGameItems.WIZARD_HELMET_3);
    recipe("wizard/chestplate/3", 100, List.of(
        BlockGameItems.NECRONOMICON,
        BlockGameItems.ESSENCE_FLEETING.copy().setAmount(8),
        BlockGameItems.BOLT_SILK.copy().setAmount(12),
        BlockGameItems.WIZARD_CHESTPLATE_2),
        BlockGameItems.WIZARD_CHESTPLATE_3);
    recipe("wizard/leggings/3", 100, List.of(
        BlockGameItems.NECRONOMICON,
        BlockGameItems.ESSENCE_FLEETING.copy().setAmount(8),
        BlockGameItems.BOLT_SILK.copy().setAmount(12),
        BlockGameItems.WIZARD_LEGGINGS_2),
        BlockGameItems.WIZARD_LEGGINGS_3);
    recipe("wizard/boots/3", 100, List.of(
        BlockGameItems.NECRONOMICON,
        BlockGameItems.ESSENCE_FLEETING.copy().setAmount(8),
        BlockGameItems.BOLT_SILK.copy().setAmount(12),
        BlockGameItems.WIZARD_BOOTS_2),
        BlockGameItems.WIZARD_BOOTS_3);

    recipe("wizard/helmet/4", 250, List.of(
        BlockGameItems.BACON_BITS.copy().setAmount(64),
        BlockGameItems.WHIPPING_WINDS,
        BlockGameItems.BOLT_SILK.copy().setAmount(16),
        BlockGameItems.WIZARD_HELMET_3),
        BlockGameItems.WIZARD_HELMET_4);
    recipe("wizard/chestplate/4", 250, List.of(
        BlockGameItems.BACON_BITS.copy().setAmount(64),
        BlockGameItems.WHIPPING_WINDS,
        BlockGameItems.BOLT_SILK.copy().setAmount(16),
        BlockGameItems.WIZARD_CHESTPLATE_3),
        BlockGameItems.WIZARD_CHESTPLATE_4);
    recipe("wizard/leggings/4", 250, List.of(
        BlockGameItems.BACON_BITS.copy().setAmount(64),
        BlockGameItems.WHIPPING_WINDS,
        BlockGameItems.BOLT_SILK.copy().setAmount(16),
        BlockGameItems.WIZARD_LEGGINGS_3),
        BlockGameItems.WIZARD_LEGGINGS_4);
    recipe("wizard/boots/4", 250, List.of(
        BlockGameItems.BACON_BITS.copy().setAmount(64),
        BlockGameItems.WHIPPING_WINDS,
        BlockGameItems.BOLT_SILK.copy().setAmount(16),
        BlockGameItems.WIZARD_BOOTS_3),
        BlockGameItems.WIZARD_BOOTS_4);

    recipe("wizard/helmet/5", 500, List.of(
        BlockGameItems.CURSED_SAND.copy().setAmount(64),
        BlockGameItems.WHIPPING_WINDS.copy().setAmount(2),
        BlockGameItems.BOLT_SILK.copy().setAmount(20),
        BlockGameItems.WIZARD_HELMET_4),
        BlockGameItems.WIZARD_HELMET_5);
    recipe("wizard/chestplate/5", 500, List.of(
        BlockGameItems.CURSED_SAND.copy().setAmount(64),
        BlockGameItems.WHIPPING_WINDS.copy().setAmount(2),
        BlockGameItems.BOLT_SILK.copy().setAmount(20),
        BlockGameItems.WIZARD_CHESTPLATE_4),
        BlockGameItems.WIZARD_CHESTPLATE_5);
    recipe("wizard/leggings/5", 500, List.of(
        BlockGameItems.CURSED_SAND.copy().setAmount(64),
        BlockGameItems.WHIPPING_WINDS.copy().setAmount(2),
        BlockGameItems.BOLT_SILK.copy().setAmount(20),
        BlockGameItems.WIZARD_LEGGINGS_4),
        BlockGameItems.WIZARD_LEGGINGS_5);
    recipe("wizard/boots/5", 500, List.of(
        BlockGameItems.CURSED_SAND.copy().setAmount(64),
        BlockGameItems.WHIPPING_WINDS.copy().setAmount(2),
        BlockGameItems.BOLT_SILK.copy().setAmount(20),
        BlockGameItems.WIZARD_BOOTS_4),
        BlockGameItems.WIZARD_BOOTS_5);

    recipe("wizard/helmet/6", 1000, List.of(
        BlockGameItems.TAINTED_METAL.copy().setAmount(4),
        BlockGameItems.WHIPPING_WINDS.copy().setAmount(3),
        BlockGameItems.BOLT_SILK.copy().setAmount(24),
        BlockGameItems.HORRID_HELMET,
        BlockGameItems.WIZARD_HELMET_5),
        BlockGameItems.WIZARD_HELMET_6);
    recipe("wizard/chestplate/6", 1000, List.of(
        BlockGameItems.TAINTED_METAL.copy().setAmount(4),
        BlockGameItems.WHIPPING_WINDS.copy().setAmount(3),
        BlockGameItems.BOLT_SILK.copy().setAmount(24),
        BlockGameItems.HORRID_CHESTPLATE,
        BlockGameItems.WIZARD_CHESTPLATE_5),
        BlockGameItems.WIZARD_CHESTPLATE_6);
    recipe("wizard/leggings/6", 1000, List.of(
        BlockGameItems.TAINTED_METAL.copy().setAmount(4),
        BlockGameItems.WHIPPING_WINDS.copy().setAmount(3),
        BlockGameItems.BOLT_SILK.copy().setAmount(24),
        BlockGameItems.HORRID_LEGGINGS,
        BlockGameItems.WIZARD_LEGGINGS_5),
        BlockGameItems.WIZARD_LEGGINGS_6);
    recipe("wizard/boots/6", 1000, List.of(
        BlockGameItems.TAINTED_METAL.copy().setAmount(4),
        BlockGameItems.WHIPPING_WINDS.copy().setAmount(3),
        BlockGameItems.BOLT_SILK.copy().setAmount(24),
        BlockGameItems.HORRID_BOOTS,
        BlockGameItems.WIZARD_BOOTS_5),
        BlockGameItems.WIZARD_BOOTS_6);
  }
}
