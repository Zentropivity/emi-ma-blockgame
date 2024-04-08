package zentropivity.emimablockgame;

import java.util.HashMap;
import java.util.Map;

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

	public static final Map<String, EmiRecipeCategory> ALL = new HashMap<String, EmiRecipeCategory>();

  public static final EmiRecipeCategory
		RECIPES_GEORGE = new EmiRecipeCategory(new Identifier("emimablockgame", "george"), EmiStack.of(Items.STONE_PICKAXE));

  @Override
  public void register(EmiRegistry registry) {
    // Tell EMI to add a tab for your category
    registry.addCategory(RECIPES_GEORGE);

    // Add all the workstations your category uses
		//TODO recipes
    registry.addWorkstation(RECIPES_GEORGE, EmiStack.of(Items.STONE_PICKAXE));

		// registry.addRecipe(new BlockGameRecipe(RECIPES_GEORGE));

		BlockGameItems.addItems(registry);

		LOGGER.info("Emi Ma BlockGame Plugin is ALIVE!");
  }
}
