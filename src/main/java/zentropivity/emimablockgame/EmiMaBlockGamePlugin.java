package zentropivity.emimablockgame;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import zentropivity.emimablockgame.item.BlockGameItems;
import zentropivity.emimablockgame.recipe.BlockGameRecipe;
import dev.emi.emi.api.EmiPlugin;
import dev.emi.emi.api.EmiRegistry;
import dev.emi.emi.api.recipe.EmiRecipe;
import dev.emi.emi.api.recipe.EmiRecipeCategory;
import dev.emi.emi.api.stack.EmiStack;

public class EmiMaBlockGamePlugin implements EmiPlugin {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
  public static final Logger LOGGER = LoggerFactory.getLogger("emi-ma-blockgame");

  public static final EmiRecipeCategory BLOCKGAME_RECIPES
            = new EmiRecipeCategory(new Identifier("emimablockgame", "blockgame_recipes"), EmiStack.of(Items.AXOLOTL_BUCKET));

  public static final EmiStack FOOD_RECIPES = EmiStack.of(Items.AXOLOTL_BUCKET);

	public static final BlockGameItems ITEMS = new BlockGameItems();

  @Override
  public void register(EmiRegistry registry) {
    // Tell EMI to add a tab for your category
    registry.addCategory(BLOCKGAME_RECIPES);

    // Add all the workstations your category uses
		//TODO recipes
    registry.addWorkstation(BLOCKGAME_RECIPES, FOOD_RECIPES);
		// registry.addRecipe(new BlockGameRecipe());

		ITEMS.addItems(registry);

		LOGGER.info("Emi Ma BlockGame Plugin is ALIVE!");
  }
}
