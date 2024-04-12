package zentropivity.emimablockgame.vendors;

import java.util.List;

import dev.emi.emi.api.stack.EmiStack;
import net.minecraft.item.Items;
import zentropivity.emimablockgame.item.BlockGameItems;

public class LeatherworkerSeymour extends AbstractVendor {
  public LeatherworkerSeymour() {
    super("leatherworkerseymour", BlockGameItems.PRISTINE_HIDE);

    recipe("pristine/hide", 5,
        BlockGameItems.LEATHER_SCRAPS.copy().setAmount(8),
        BlockGameItems.PRISTINE_HIDE);
    recipe("repair/normal/common", 5,
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(16),
        BlockGameItems.REPAIR_POWDER_COMMON);
    recipe("saddle", 50, List.of(
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(8),
        EmiStack.of(Items.SLIME_BALL)),
        BlockGameItems.LEATHER_SADDLE);
    recipe("satchel", 50,
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(16),
        BlockGameItems.SATCHEL);

    recipe("ranger/helmet/1", 25, List.of(
        BlockGameItems.ESSENCE_DAMP.copy().setAmount(2),
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(4)),
        BlockGameItems.RANGER_HELMET_1);
    recipe("ranger/chestplate/1", 25, List.of(
        BlockGameItems.ESSENCE_DAMP.copy().setAmount(2),
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(4)),
        BlockGameItems.RANGER_CHESTPLATE_1);
    recipe("ranger/leggings/1", 25, List.of(
        BlockGameItems.ESSENCE_DAMP.copy().setAmount(2),
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(4)),
        BlockGameItems.RANGER_LEGGINGS_1);
    recipe("ranger/boots/1", 25, List.of(
        BlockGameItems.ESSENCE_DAMP.copy().setAmount(2),
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(4)),
        BlockGameItems.RANGER_BOOTS_1);

    recipe("ranger/helmet/2", 50, List.of(
        BlockGameItems.ESSENCE_DAMP.copy().setAmount(4),
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(8),
        BlockGameItems.RANGER_HELMET_1),
        BlockGameItems.RANGER_HELMET_2);
    recipe("ranger/chestplate/2", 50, List.of(
        BlockGameItems.ESSENCE_DAMP.copy().setAmount(4),
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(8),
        BlockGameItems.RANGER_CHESTPLATE_1),
        BlockGameItems.RANGER_CHESTPLATE_2);
    recipe("ranger/leggings/2", 50, List.of(
        BlockGameItems.ESSENCE_DAMP.copy().setAmount(4),
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(8),
        BlockGameItems.RANGER_LEGGINGS_1),
        BlockGameItems.RANGER_LEGGINGS_2);
    recipe("ranger/boots/2", 50, List.of(
        BlockGameItems.ESSENCE_DAMP.copy().setAmount(4),
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(8),
        BlockGameItems.RANGER_BOOTS_1),
        BlockGameItems.RANGER_BOOTS_2);

    recipe("ranger/helmet/3", 100, List.of(
        BlockGameItems.NECRONOMICON,
        BlockGameItems.ESSENCE_DAMP.copy().setAmount(8),
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(12),
        BlockGameItems.RANGER_HELMET_2),
        BlockGameItems.RANGER_HELMET_3);
    recipe("ranger/chestplate/3", 100, List.of(
        BlockGameItems.NECRONOMICON,
        BlockGameItems.ESSENCE_DAMP.copy().setAmount(8),
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(12),
        BlockGameItems.RANGER_CHESTPLATE_2),
        BlockGameItems.RANGER_CHESTPLATE_3);
    recipe("ranger/leggings/3", 100, List.of(
        BlockGameItems.NECRONOMICON,
        BlockGameItems.ESSENCE_DAMP.copy().setAmount(8),
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(12),
        BlockGameItems.RANGER_LEGGINGS_2),
        BlockGameItems.RANGER_LEGGINGS_3);
    recipe("ranger/boots/3", 100, List.of(
        BlockGameItems.NECRONOMICON,
        BlockGameItems.ESSENCE_DAMP.copy().setAmount(8),
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(12),
        BlockGameItems.RANGER_BOOTS_2),
        BlockGameItems.RANGER_BOOTS_3);

    recipe("ranger/helmet/4", 250, List.of(
        BlockGameItems.BACON_BITS.copy().setAmount(64),
        BlockGameItems.INFUSED_CRYSTAL,
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(16),
        BlockGameItems.RANGER_HELMET_3),
        BlockGameItems.RANGER_HELMET_4);
    recipe("ranger/chestplate/4", 250, List.of(
        BlockGameItems.BACON_BITS.copy().setAmount(64),
        BlockGameItems.INFUSED_CRYSTAL,
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(16),
        BlockGameItems.RANGER_CHESTPLATE_3),
        BlockGameItems.RANGER_CHESTPLATE_4);
    recipe("ranger/leggings/4", 250, List.of(
        BlockGameItems.BACON_BITS.copy().setAmount(64),
        BlockGameItems.INFUSED_CRYSTAL,
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(16),
        BlockGameItems.RANGER_LEGGINGS_3),
        BlockGameItems.RANGER_LEGGINGS_4);
    recipe("ranger/boots/4", 250, List.of(
        BlockGameItems.BACON_BITS.copy().setAmount(64),
        BlockGameItems.INFUSED_CRYSTAL,
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(16),
        BlockGameItems.RANGER_BOOTS_3),
        BlockGameItems.RANGER_BOOTS_4);

    recipe("ranger/helmet/5", 500, List.of(
        BlockGameItems.CURSED_SAND.copy().setAmount(64),
        BlockGameItems.INFUSED_CRYSTAL.copy().setAmount(2),
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(20),
        BlockGameItems.RANGER_HELMET_4),
        BlockGameItems.RANGER_HELMET_5);
    recipe("ranger/chestplate/5", 500, List.of(
        BlockGameItems.CURSED_SAND.copy().setAmount(64),
        BlockGameItems.INFUSED_CRYSTAL.copy().setAmount(2),
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(20),
        BlockGameItems.RANGER_CHESTPLATE_4),
        BlockGameItems.RANGER_CHESTPLATE_5);
    recipe("ranger/leggings/5", 500, List.of(
        BlockGameItems.CURSED_SAND.copy().setAmount(64),
        BlockGameItems.INFUSED_CRYSTAL.copy().setAmount(2),
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(20),
        BlockGameItems.RANGER_LEGGINGS_4),
        BlockGameItems.RANGER_LEGGINGS_5);
    recipe("ranger/boots/5", 500, List.of(
        BlockGameItems.CURSED_SAND.copy().setAmount(64),
        BlockGameItems.INFUSED_CRYSTAL.copy().setAmount(2),
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(20),
        BlockGameItems.RANGER_BOOTS_4),
        BlockGameItems.RANGER_BOOTS_5);

    recipe("ranger/helmet/6", 1000, List.of(
        BlockGameItems.TAINTED_METAL.copy().setAmount(4),
        BlockGameItems.INFUSED_CRYSTAL.copy().setAmount(3),
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(24),
        BlockGameItems.HORRID_HELMET,
        BlockGameItems.RANGER_HELMET_5),
        BlockGameItems.RANGER_HELMET_6);
    recipe("ranger/chestplate/6", 1000, List.of(
        BlockGameItems.TAINTED_METAL.copy().setAmount(4),
        BlockGameItems.INFUSED_CRYSTAL.copy().setAmount(3),
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(24),
        BlockGameItems.HORRID_CHESTPLATE,
        BlockGameItems.RANGER_CHESTPLATE_5),
        BlockGameItems.RANGER_CHESTPLATE_6);
    recipe("ranger/leggings/6", 1000, List.of(
        BlockGameItems.TAINTED_METAL.copy().setAmount(4),
        BlockGameItems.INFUSED_CRYSTAL.copy().setAmount(3),
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(24),
        BlockGameItems.HORRID_LEGGINGS,
        BlockGameItems.RANGER_LEGGINGS_5),
        BlockGameItems.RANGER_LEGGINGS_6);
    recipe("ranger/boots/6", 1000, List.of(
        BlockGameItems.TAINTED_METAL.copy().setAmount(4),
        BlockGameItems.INFUSED_CRYSTAL.copy().setAmount(3),
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(24),
        BlockGameItems.HORRID_BOOTS,
        BlockGameItems.RANGER_BOOTS_5),
        BlockGameItems.RANGER_BOOTS_6);
  }
}
