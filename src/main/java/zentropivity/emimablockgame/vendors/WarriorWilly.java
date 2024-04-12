package zentropivity.emimablockgame.vendors;

import java.util.List;

import dev.emi.emi.api.stack.EmiStack;
import net.minecraft.item.Items;
import zentropivity.emimablockgame.item.BlockGameItems;

public class WarriorWilly extends AbstractVendor {
  public WarriorWilly() {
    super("warriorwilly", BlockGameItems.WARRIOR_TOTEM_5);

    recipe("warrior/helmet/1", 25, List.of(
        BlockGameItems.ESSENCE_FIERY.copy().setAmount(2),
        EmiStack.of(Items.CACTUS, 5)), BlockGameItems.WARRIOR_HELMET_1);
    recipe("warrior/chestplate/1", 25, List.of(
        BlockGameItems.ESSENCE_FIERY.copy().setAmount(2),
        EmiStack.of(Items.CACTUS, 5)), BlockGameItems.WARRIOR_CHESTPLATE_1);
    recipe("warrior/leggings/1", 25, List.of(
        BlockGameItems.ESSENCE_FIERY.copy().setAmount(2),
        EmiStack.of(Items.CACTUS, 5)), BlockGameItems.WARRIOR_LEGGINGS_1);
    recipe("warrior/boots/1", 25, List.of(
        BlockGameItems.ESSENCE_FIERY.copy().setAmount(2),
        EmiStack.of(Items.CACTUS, 5)), BlockGameItems.WARRIOR_BOOTS_1);
    recipe("warrior/totem/1", 25, List.of(
        BlockGameItems.ESSENCE_FIERY.copy().setAmount(2),
        EmiStack.of(Items.CACTUS, 4)), BlockGameItems.WARRIOR_TOTEM_1);
    recipe("warrior/sword/1", 25, List.of(
        BlockGameItems.ESSENCE_FIERY.copy().setAmount(2),
        EmiStack.of(Items.CACTUS, 2),
        BlockGameItems.WEAPON_POMMEL),
        BlockGameItems.WARRIOR_SWORD_1);

    recipe("warrior/helmet/2", 50, List.of(
        BlockGameItems.ESSENCE_FIERY.copy().setAmount(4),
        BlockGameItems.PRISTINE_STONE.copy().setAmount(10),
        BlockGameItems.WARRIOR_HELMET_1),
        BlockGameItems.WARRIOR_HELMET_2);
    recipe("warrior/chestplate/2", 50, List.of(
        BlockGameItems.ESSENCE_FIERY.copy().setAmount(4),
        BlockGameItems.PRISTINE_STONE.copy().setAmount(10),
        BlockGameItems.WARRIOR_CHESTPLATE_1),
        BlockGameItems.WARRIOR_CHESTPLATE_2);
    recipe("warrior/leggings/2", 50, List.of(
        BlockGameItems.ESSENCE_FIERY.copy().setAmount(4),
        BlockGameItems.PRISTINE_STONE.copy().setAmount(10),
        BlockGameItems.WARRIOR_LEGGINGS_1),
        BlockGameItems.WARRIOR_LEGGINGS_2);
    recipe("warrior/boots/2", 50, List.of(
        BlockGameItems.ESSENCE_FIERY.copy().setAmount(4),
        BlockGameItems.PRISTINE_STONE.copy().setAmount(10),
        BlockGameItems.WARRIOR_BOOTS_1),
        BlockGameItems.WARRIOR_BOOTS_2);
    recipe("warrior/totem/2", 50, List.of(
        BlockGameItems.ESSENCE_FIERY.copy().setAmount(4),
        BlockGameItems.PRISTINE_STONE.copy().setAmount(4),
        BlockGameItems.WARRIOR_TOTEM_1),
        BlockGameItems.WARRIOR_TOTEM_2);
    recipe("warrior/sword/2", 50, List.of(
        BlockGameItems.ESSENCE_FIERY.copy().setAmount(4),
        BlockGameItems.PRISTINE_STONE.copy().setAmount(2),
        BlockGameItems.WEAPON_POMMEL,
        BlockGameItems.WARRIOR_SWORD_1),
        BlockGameItems.WARRIOR_SWORD_2);

    recipe("warrior/helmet/3", 100, List.of(
        BlockGameItems.LOBSTER_SOUL.copy().setAmount(3),
        BlockGameItems.MYTHRIL_INGOT,
        BlockGameItems.WARRIOR_HELMET_2),
        BlockGameItems.WARRIOR_HELMET_3);
    recipe("warrior/chestplate/3", 100, List.of(
        BlockGameItems.LOBSTER_SOUL.copy().setAmount(3),
        BlockGameItems.MYTHRIL_INGOT,
        BlockGameItems.WARRIOR_CHESTPLATE_2),
        BlockGameItems.WARRIOR_CHESTPLATE_3);
    recipe("warrior/leggings/3", 100, List.of(
        BlockGameItems.LOBSTER_SOUL.copy().setAmount(3),
        BlockGameItems.MYTHRIL_INGOT,
        BlockGameItems.WARRIOR_LEGGINGS_2),
        BlockGameItems.WARRIOR_LEGGINGS_3);
    recipe("warrior/boots/3", 100, List.of(
        BlockGameItems.LOBSTER_SOUL.copy().setAmount(3),
        BlockGameItems.MYTHRIL_INGOT,
        BlockGameItems.WARRIOR_BOOTS_2),
        BlockGameItems.WARRIOR_BOOTS_3);
    recipe("warrior/totem/3", 100, List.of(
        BlockGameItems.NECRONOMICON,
        BlockGameItems.LOBSTER_SOUL.copy().setAmount(3),
        BlockGameItems.MYTHRIL_INGOT,
        BlockGameItems.WARRIOR_TOTEM_2),
        BlockGameItems.WARRIOR_TOTEM_3);
    recipe("warrior/sword/3", 100, List.of(
        BlockGameItems.NECRONOMICON,
        BlockGameItems.MYTHRIL_INGOT,
        BlockGameItems.WEAPON_POMMEL,
        BlockGameItems.WARRIOR_SWORD_2),
        BlockGameItems.WARRIOR_SWORD_3);

    recipe("warrior/helmet/4", 250, List.of(
        BlockGameItems.BACON_BITS.copy().setAmount(64),
        BlockGameItems.LIVING_FIRE,
        BlockGameItems.WARRIOR_HELMET_3),
        BlockGameItems.WARRIOR_HELMET_4);
    recipe("warrior/chestplate/4", 250, List.of(
        BlockGameItems.BACON_BITS.copy().setAmount(64),
        BlockGameItems.LIVING_FIRE,
        BlockGameItems.WARRIOR_CHESTPLATE_3),
        BlockGameItems.WARRIOR_CHESTPLATE_4);
    recipe("warrior/leggings/4", 250, List.of(
        BlockGameItems.BACON_BITS.copy().setAmount(64),
        BlockGameItems.LIVING_FIRE,
        BlockGameItems.WARRIOR_LEGGINGS_3),
        BlockGameItems.WARRIOR_LEGGINGS_4);
    recipe("warrior/boots/4", 250, List.of(
        BlockGameItems.BACON_BITS.copy().setAmount(64),
        BlockGameItems.LIVING_FIRE,
        BlockGameItems.WARRIOR_BOOTS_3),
        BlockGameItems.WARRIOR_BOOTS_4);
    recipe("warrior/totem/4", 250, List.of(
        BlockGameItems.BACON_BITS.copy().setAmount(64),
        BlockGameItems.LIVING_FIRE,
        BlockGameItems.WARRIOR_TOTEM_3),
        BlockGameItems.WARRIOR_TOTEM_4);
    recipe("warrior/sword/4", 250, List.of(
        BlockGameItems.BACON_BITS.copy().setAmount(64),
        BlockGameItems.LIVING_FIRE,
        BlockGameItems.WEAPON_POMMEL,
        BlockGameItems.WARRIOR_SWORD_3),
        BlockGameItems.WARRIOR_SWORD_4);

    recipe("warrior/helmet/5", 500, List.of(
        BlockGameItems.CURSED_SAND.copy().setAmount(64),
        BlockGameItems.LIVING_FIRE.copy().setAmount(2),
        EmiStack.of(Items.GOLD_INGOT, 8),
        BlockGameItems.WARRIOR_HELMET_4),
        BlockGameItems.WARRIOR_HELMET_5);
    recipe("warrior/chestplate/5", 500, List.of(
        BlockGameItems.CURSED_SAND.copy().setAmount(64),
        BlockGameItems.LIVING_FIRE.copy().setAmount(2),
        EmiStack.of(Items.GOLD_INGOT, 8),
        BlockGameItems.WARRIOR_CHESTPLATE_4),
        BlockGameItems.WARRIOR_CHESTPLATE_5);
    recipe("warrior/leggings/5", 500, List.of(
        BlockGameItems.CURSED_SAND.copy().setAmount(64),
        BlockGameItems.LIVING_FIRE.copy().setAmount(2),
        EmiStack.of(Items.GOLD_INGOT, 8),
        BlockGameItems.WARRIOR_LEGGINGS_4),
        BlockGameItems.WARRIOR_LEGGINGS_5);
    recipe("warrior/boots/5", 500, List.of(
        BlockGameItems.CURSED_SAND.copy().setAmount(64),
        BlockGameItems.LIVING_FIRE.copy().setAmount(2),
        EmiStack.of(Items.GOLD_INGOT, 8),
        BlockGameItems.WARRIOR_BOOTS_4),
        BlockGameItems.WARRIOR_BOOTS_5);
    recipe("warrior/totem/5", 500, List.of(
        BlockGameItems.CURSED_SAND.copy().setAmount(64),
        BlockGameItems.LIVING_FIRE.copy().setAmount(2),
        EmiStack.of(Items.GOLD_INGOT, 8),
        BlockGameItems.WARRIOR_TOTEM_4),
        BlockGameItems.WARRIOR_TOTEM_5);
    recipe("warrior/sword/5", 500, List.of(
        BlockGameItems.CURSED_SAND.copy().setAmount(64),
        BlockGameItems.LIVING_FIRE.copy().setAmount(2),
        EmiStack.of(Items.GOLD_INGOT, 8),
        BlockGameItems.WEAPON_POMMEL,
        BlockGameItems.WARRIOR_SWORD_4),
        BlockGameItems.WARRIOR_SWORD_5);

    recipe("warrior/helmet/6", 1000, List.of(
        BlockGameItems.TAINTED_METAL.copy().setAmount(4),
        BlockGameItems.LIVING_FIRE.copy().setAmount(3),
        BlockGameItems.CORRUPTED_SOUL.copy().setAmount(2),
        BlockGameItems.HORRID_HELMET,
        BlockGameItems.WARRIOR_HELMET_5),
        BlockGameItems.WARRIOR_HELMET_6);
    recipe("warrior/chestplate/6", 1000, List.of(
        BlockGameItems.TAINTED_METAL.copy().setAmount(4),
        BlockGameItems.LIVING_FIRE.copy().setAmount(3),
        BlockGameItems.CORRUPTED_SOUL.copy().setAmount(2),
        BlockGameItems.HORRID_CHESTPLATE,
        BlockGameItems.WARRIOR_CHESTPLATE_5),
        BlockGameItems.WARRIOR_CHESTPLATE_6);
    recipe("warrior/leggings/6", 1000, List.of(
        BlockGameItems.TAINTED_METAL.copy().setAmount(4),
        BlockGameItems.LIVING_FIRE.copy().setAmount(3),
        BlockGameItems.CORRUPTED_SOUL.copy().setAmount(2),
        BlockGameItems.HORRID_LEGGINGS,
        BlockGameItems.WARRIOR_LEGGINGS_5),
        BlockGameItems.WARRIOR_LEGGINGS_6);
    recipe("warrior/boots/6", 1000, List.of(
        BlockGameItems.TAINTED_METAL.copy().setAmount(4),
        BlockGameItems.LIVING_FIRE.copy().setAmount(3),
        BlockGameItems.CORRUPTED_SOUL.copy().setAmount(2),
        BlockGameItems.HORRID_BOOTS,
        BlockGameItems.WARRIOR_BOOTS_5),
        BlockGameItems.WARRIOR_BOOTS_6);
  }
}
