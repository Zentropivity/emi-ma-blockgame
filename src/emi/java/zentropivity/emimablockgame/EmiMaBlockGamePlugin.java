package zentropivity.emimablockgame;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dev.emi.emi.api.EmiPlugin;
import dev.emi.emi.api.EmiRegistry;
// import dev.emi.emi.api.stack.EmiStack;

import net.fabricmc.api.ClientModInitializer;

public class EmiMaBlockGamePlugin implements EmiPlugin {
  // public static final Identifier MY_SPRITE_SHEET = new Identifier("mymod", "textures/gui/emi_simplified_textures.png");
  // public static final EmiStack MY_WORKSTATION = EmiStack.of(MyModEmiPlugin.MY_WORKSTATION);
  // public static final EmiRecipeCategory MY_CATEGORY = new EmiRecipeCategory(new Identifier("mymod", "my_workstation"),
  //     MY_WORKSTATION, new EmiTexture(MY_SPRITE_SHEET, 0, 0, 16, 16));
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
  public static final Logger LOGGER = LoggerFactory.getLogger("emi-ma-blockgame");

  @Override
  public void register(EmiRegistry registry) {
    // // Tell EMI to add a tab for your category
    // registry.addCategory(MY_CATEGORY);

    // // Add all the workstations your category uses
    // registry.addWorkstation(MY_CATEGORY, MY_WORKSTATION);
		LOGGER.info("Emi Ma BlockGame Plugin REGISTERED!");
  }
}
