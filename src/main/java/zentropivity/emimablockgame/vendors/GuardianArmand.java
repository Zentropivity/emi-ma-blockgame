package zentropivity.emimablockgame.vendors;

import java.util.List;

import dev.emi.emi.api.stack.EmiStack;
import net.minecraft.item.Items;
import zentropivity.emimablockgame.item.BlockGameItems;

public class GuardianArmand extends AbstractVendor {
  public GuardianArmand() {
    super("guardianarmand", BlockGameItems.GUARDIAN_SHIELD_5);

    recipe("guardian/helmet/1", 25, List.of(
        BlockGameItems.ESSENCE_ROCKY.copy().setAmount(2),
        BlockGameItems.PRISTINE_WOOD.copy().setAmount(5)), BlockGameItems.GUARDIAN_HELMET_1);
    recipe("guardian/chestplate/1", 25, List.of(
        BlockGameItems.ESSENCE_ROCKY.copy().setAmount(2),
        BlockGameItems.PRISTINE_WOOD.copy().setAmount(5)), BlockGameItems.GUARDIAN_CHESTPLATE_1);
    recipe("guardian/leggings/1", 25, List.of(
        BlockGameItems.ESSENCE_ROCKY.copy().setAmount(2),
        BlockGameItems.PRISTINE_WOOD.copy().setAmount(5)), BlockGameItems.GUARDIAN_LEGGINGS_1);
    recipe("guardian/boots/1", 25, List.of(
        BlockGameItems.ESSENCE_ROCKY.copy().setAmount(2),
        BlockGameItems.PRISTINE_WOOD.copy().setAmount(5)), BlockGameItems.GUARDIAN_BOOTS_1);
    recipe("guardian/shield/1", 25, List.of(
        BlockGameItems.ESSENCE_ROCKY.copy().setAmount(2),
        BlockGameItems.PRISTINE_WOOD.copy().setAmount(7)), BlockGameItems.GUARDIAN_SHIELD_1);
    recipe("guardian/mace/1", 25, List.of(
        BlockGameItems.ESSENCE_ROCKY.copy().setAmount(2),
        BlockGameItems.PRISTINE_WOOD.copy().setAmount(3),
        BlockGameItems.WEAPON_POMMEL),
        BlockGameItems.GUARDIAN_MACE_1);

    recipe("guardian/helmet/2", 50, List.of(
        BlockGameItems.ESSENCE_ROCKY.copy().setAmount(4),
        EmiStack.of(Items.COPPER_INGOT, 10),
        BlockGameItems.GUARDIAN_HELMET_1),
        BlockGameItems.GUARDIAN_HELMET_2);
    recipe("guardian/chestplate/2", 50, List.of(
        BlockGameItems.ESSENCE_ROCKY.copy().setAmount(4),
        EmiStack.of(Items.COPPER_INGOT, 10),
        BlockGameItems.GUARDIAN_CHESTPLATE_1),
        BlockGameItems.GUARDIAN_CHESTPLATE_2);
    recipe("guardian/leggings/2", 50, List.of(
        BlockGameItems.ESSENCE_ROCKY.copy().setAmount(4),
        EmiStack.of(Items.COPPER_INGOT, 10),
        BlockGameItems.GUARDIAN_LEGGINGS_1),
        BlockGameItems.GUARDIAN_LEGGINGS_2);
    recipe("guardian/boots/2", 50, List.of(
        BlockGameItems.ESSENCE_ROCKY.copy().setAmount(4),
        EmiStack.of(Items.COPPER_INGOT, 10),
        BlockGameItems.GUARDIAN_BOOTS_1),
        BlockGameItems.GUARDIAN_BOOTS_2);
    recipe("guardian/shield/2", 50, List.of(
        BlockGameItems.ESSENCE_ROCKY.copy().setAmount(4),
        EmiStack.of(Items.COPPER_INGOT, 7),
        BlockGameItems.GUARDIAN_SHIELD_1),
        BlockGameItems.GUARDIAN_SHIELD_2);
    recipe("guardian/mace/2", 50, List.of(
        BlockGameItems.ESSENCE_ROCKY.copy().setAmount(4),
        EmiStack.of(Items.COPPER_INGOT, 3),
        BlockGameItems.WEAPON_POMMEL,
        BlockGameItems.GUARDIAN_MACE_1),
        BlockGameItems.GUARDIAN_MACE_2);

    recipe("guardian/helmet/3", 100, List.of(
        BlockGameItems.LOBSTER_SOUL.copy().setAmount(3),
        BlockGameItems.STEEL_INGOT,
        BlockGameItems.GUARDIAN_HELMET_2),
        BlockGameItems.GUARDIAN_HELMET_3);
    recipe("guardian/chestplate/3", 100, List.of(
        BlockGameItems.LOBSTER_SOUL.copy().setAmount(3),
        BlockGameItems.STEEL_INGOT,
        BlockGameItems.GUARDIAN_CHESTPLATE_2),
        BlockGameItems.GUARDIAN_CHESTPLATE_3);
    recipe("guardian/leggings/3", 100, List.of(
        BlockGameItems.LOBSTER_SOUL.copy().setAmount(3),
        BlockGameItems.STEEL_INGOT,
        BlockGameItems.GUARDIAN_LEGGINGS_2),
        BlockGameItems.GUARDIAN_LEGGINGS_3);
    recipe("guardian/boots/3", 100, List.of(
        BlockGameItems.LOBSTER_SOUL.copy().setAmount(3),
        BlockGameItems.STEEL_INGOT,
        BlockGameItems.GUARDIAN_BOOTS_2),
        BlockGameItems.GUARDIAN_BOOTS_3);
    recipe("guardian/shield/3", 100, List.of(
        BlockGameItems.NECRONOMICON,
        BlockGameItems.STEEL_INGOT,
        BlockGameItems.GUARDIAN_SHIELD_2),
        BlockGameItems.GUARDIAN_SHIELD_3);
    recipe("guardian/mace/3", 100, List.of(
        BlockGameItems.NECRONOMICON,
        BlockGameItems.STEEL_INGOT,
        BlockGameItems.WEAPON_POMMEL,
        BlockGameItems.GUARDIAN_MACE_2),
        BlockGameItems.GUARDIAN_MACE_3);

    recipe("guardian/helmet/4", 250, List.of(
        BlockGameItems.BACON_BITS.copy().setAmount(64),
        BlockGameItems.INFUSED_DIAMOND,
        BlockGameItems.GUARDIAN_HELMET_3),
        BlockGameItems.GUARDIAN_HELMET_4);
    recipe("guardian/chestplate/4", 250, List.of(
        BlockGameItems.BACON_BITS.copy().setAmount(64),
        BlockGameItems.INFUSED_DIAMOND,
        BlockGameItems.GUARDIAN_CHESTPLATE_3),
        BlockGameItems.GUARDIAN_CHESTPLATE_4);
    recipe("guardian/leggings/4", 250, List.of(
        BlockGameItems.BACON_BITS.copy().setAmount(64),
        BlockGameItems.INFUSED_DIAMOND,
        BlockGameItems.GUARDIAN_LEGGINGS_3),
        BlockGameItems.GUARDIAN_LEGGINGS_4);
    recipe("guardian/boots/4", 250, List.of(
        BlockGameItems.BACON_BITS.copy().setAmount(64),
        BlockGameItems.INFUSED_DIAMOND,
        BlockGameItems.GUARDIAN_BOOTS_3),
        BlockGameItems.GUARDIAN_BOOTS_4);
    recipe("guardian/shield/4", 250, List.of(
        BlockGameItems.BACON_BITS.copy().setAmount(64),
        BlockGameItems.INFUSED_DIAMOND,
        BlockGameItems.GUARDIAN_SHIELD_3),
        BlockGameItems.GUARDIAN_SHIELD_4);
    recipe("guardian/mace/4", 250, List.of(
        BlockGameItems.BACON_BITS.copy().setAmount(64),
        BlockGameItems.INFUSED_DIAMOND,
        BlockGameItems.WEAPON_POMMEL,
        BlockGameItems.GUARDIAN_MACE_3),
        BlockGameItems.GUARDIAN_MACE_4);

    recipe("guardian/helmet/5", 500, List.of(
        BlockGameItems.CURSED_SAND.copy().setAmount(64),
        BlockGameItems.INFUSED_DIAMOND.copy().setAmount(2),
        EmiStack.of(Items.GOLD_INGOT, 8),
        BlockGameItems.GUARDIAN_HELMET_4),
        BlockGameItems.GUARDIAN_HELMET_5);
    recipe("guardian/chestplate/5", 500, List.of(
        BlockGameItems.CURSED_SAND.copy().setAmount(64),
        BlockGameItems.INFUSED_DIAMOND.copy().setAmount(2),
        EmiStack.of(Items.GOLD_INGOT, 8),
        BlockGameItems.GUARDIAN_CHESTPLATE_4),
        BlockGameItems.GUARDIAN_CHESTPLATE_5);
    recipe("guardian/leggings/5", 500, List.of(
        BlockGameItems.CURSED_SAND.copy().setAmount(64),
        BlockGameItems.INFUSED_DIAMOND.copy().setAmount(2),
        EmiStack.of(Items.GOLD_INGOT, 8),
        BlockGameItems.GUARDIAN_LEGGINGS_4),
        BlockGameItems.GUARDIAN_LEGGINGS_5);
    recipe("guardian/boots/5", 500, List.of(
        BlockGameItems.CURSED_SAND.copy().setAmount(64),
        BlockGameItems.INFUSED_DIAMOND.copy().setAmount(2),
        EmiStack.of(Items.GOLD_INGOT, 8),
        BlockGameItems.GUARDIAN_BOOTS_4),
        BlockGameItems.GUARDIAN_BOOTS_5);
    recipe("guardian/shield/5", 500, List.of(
        BlockGameItems.CURSED_SAND.copy().setAmount(64),
        BlockGameItems.INFUSED_DIAMOND.copy().setAmount(2),
        EmiStack.of(Items.GOLD_INGOT, 8),
        BlockGameItems.GUARDIAN_SHIELD_4),
        BlockGameItems.GUARDIAN_SHIELD_5);
    recipe("guardian/mace/5", 500, List.of(
        BlockGameItems.CURSED_SAND.copy().setAmount(64),
        BlockGameItems.INFUSED_DIAMOND.copy().setAmount(2),
        EmiStack.of(Items.GOLD_INGOT, 8),
        BlockGameItems.WEAPON_POMMEL,
        BlockGameItems.GUARDIAN_MACE_4),
        BlockGameItems.GUARDIAN_MACE_5);

    recipe("guardian/helmet/6", 1000, List.of(
        BlockGameItems.TAINTED_METAL.copy().setAmount(4),
        BlockGameItems.INFUSED_DIAMOND.copy().setAmount(3),
        BlockGameItems.RIGHTEOUS_SOUL.copy().setAmount(2),
        BlockGameItems.HORRID_HELMET,
        BlockGameItems.GUARDIAN_HELMET_5),
        BlockGameItems.GUARDIAN_HELMET_6);
    recipe("guardian/chestplate/6", 1000, List.of(
        BlockGameItems.TAINTED_METAL.copy().setAmount(4),
        BlockGameItems.INFUSED_DIAMOND.copy().setAmount(3),
        BlockGameItems.RIGHTEOUS_SOUL.copy().setAmount(2),
        BlockGameItems.HORRID_CHESTPLATE,
        BlockGameItems.GUARDIAN_CHESTPLATE_5),
        BlockGameItems.GUARDIAN_CHESTPLATE_6);
    recipe("guardian/leggings/6", 1000, List.of(
        BlockGameItems.TAINTED_METAL.copy().setAmount(4),
        BlockGameItems.INFUSED_DIAMOND.copy().setAmount(3),
        BlockGameItems.RIGHTEOUS_SOUL.copy().setAmount(2),
        BlockGameItems.HORRID_LEGGINGS,
        BlockGameItems.GUARDIAN_LEGGINGS_5),
        BlockGameItems.GUARDIAN_LEGGINGS_6);
    recipe("guardian/boots/6", 1000, List.of(
        BlockGameItems.TAINTED_METAL.copy().setAmount(4),
        BlockGameItems.INFUSED_DIAMOND.copy().setAmount(3),
        BlockGameItems.RIGHTEOUS_SOUL.copy().setAmount(2),
        BlockGameItems.HORRID_BOOTS,
        BlockGameItems.GUARDIAN_BOOTS_5),
        BlockGameItems.GUARDIAN_BOOTS_6);
  }
}
