package zentropivity.emimablockgame.vendors;

import java.util.List;

import dev.emi.emi.api.stack.EmiStack;
import net.minecraft.item.Items;
import zentropivity.emimablockgame.item.BlockGameItems;

public class OlEggman extends AbstractVendor {
  public OlEggman() {
    super("oleggman", EmiStack.of(Items.TURTLE_EGG));

    sameInRecipes("mothman/cooking", 0, 500, List.of(
        BlockGameItems.TOKEN_EASTER_2024.copy().setAmount(640)),
        List.of(
            BlockGameItems.RECIPE_CHOCOLATE_RABBIT,
            BlockGameItems.RECIPE_HOT_CROSS_BUN,
            BlockGameItems.RECIPE_PAINTED_EGG,
            BlockGameItems.RECIPE_EASTER_LAMB));

    sameInRecipes("mothman/trims", 0, 250, List.of(
        BlockGameItems.TOKEN_EASTER_2024.copy().setAmount(320)),
        List.of(
            EmiStack.of(Items.WAYFINDER_ARMOR_TRIM_SMITHING_TEMPLATE),
            EmiStack.of(Items.EYE_ARMOR_TRIM_SMITHING_TEMPLATE),
            EmiStack.of(Items.SILENCE_ARMOR_TRIM_SMITHING_TEMPLATE),
            EmiStack.of(Items.DUNE_ARMOR_TRIM_SMITHING_TEMPLATE),
            EmiStack.of(Items.SHAPER_ARMOR_TRIM_SMITHING_TEMPLATE)));

    sameInRecipes("mothman/ranger", 0, 250, List.of(
        BlockGameItems.TOKEN_EASTER_2024.copy().setAmount(320)),
        List.of(
            BlockGameItems.EASTER_2024_RANGER_HELMET,
            BlockGameItems.EASTER_2024_RANGER_CHESTPLATE,
            BlockGameItems.EASTER_2024_RANGER_LEGGINGS,
            BlockGameItems.EASTER_2024_RANGER_BOOTS));
    sameInRecipes("mothman/wizard", 0, 250, List.of(
        BlockGameItems.TOKEN_EASTER_2024.copy().setAmount(320)),
        List.of(
            BlockGameItems.EASTER_2024_WIZARD_HELMET,
            BlockGameItems.EASTER_2024_WIZARD_CHESTPLATE,
            BlockGameItems.EASTER_2024_WIZARD_LEGGINGS,
            BlockGameItems.EASTER_2024_WIZARD_BOOTS));
    sameInRecipes("mothman/warrior", 0, 250, List.of(
        BlockGameItems.TOKEN_EASTER_2024.copy().setAmount(320)),
        List.of(
            BlockGameItems.EASTER_2024_WARRIOR_HELMET,
            BlockGameItems.EASTER_2024_WARRIOR_CHESTPLATE,
            BlockGameItems.EASTER_2024_WARRIOR_LEGGINGS,
            BlockGameItems.EASTER_2024_WARRIOR_BOOTS));
    sameInRecipes("mothman/guardian", 0, 250, List.of(
        BlockGameItems.TOKEN_EASTER_2024.copy().setAmount(320)),
        List.of(
            BlockGameItems.EASTER_2024_GUARDIAN_HELMET,
            BlockGameItems.EASTER_2024_GUARDIAN_CHESTPLATE,
            BlockGameItems.EASTER_2024_GUARDIAN_LEGGINGS,
            BlockGameItems.EASTER_2024_GUARDIAN_BOOTS));
    sameInRecipes("mothman/thaumaturge", 0, 250, List.of(
        BlockGameItems.TOKEN_EASTER_2024.copy().setAmount(320)),
        List.of(
            BlockGameItems.EASTER_2024_THAUMATURGE_HELMET,
            BlockGameItems.EASTER_2024_THAUMATURGE_CHESTPLATE,
            BlockGameItems.EASTER_2024_THAUMATURGE_LEGGINGS,
            BlockGameItems.EASTER_2024_THAUMATURGE_BOOTS));
  }
}
