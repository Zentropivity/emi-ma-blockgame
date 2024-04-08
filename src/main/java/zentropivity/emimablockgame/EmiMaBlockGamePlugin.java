package zentropivity.emimablockgame;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import zentropivity.emimablockgame.item.BlockGameItems;
import zentropivity.emimablockgame.vendors.AbstractVendor;
import zentropivity.emimablockgame.vendors.George;
import dev.emi.emi.api.EmiPlugin;
import dev.emi.emi.api.EmiRegistry;

public class EmiMaBlockGamePlugin implements EmiPlugin {
  // This logger is used to write text to the console and the log file.
  // It is considered best practice to use your mod id as the logger's name.
  // That way, it's clear which mod wrote info, warnings, and errors.
  public static final Logger LOGGER = LoggerFactory.getLogger("emi-ma-blockgame");

  public final List<AbstractVendor> ALLVENDORS = List.of(new George());

  @Override
  public void register(EmiRegistry registry) {
    BlockGameItems.addItems(registry);

    // NOTE removing recipes containing our slightly customised items would remove
    // vanilla recipes too
    // BlockGameItems.cleanRecipes(registry);

    ALLVENDORS.forEach((v) -> v.init(registry));

    LOGGER.info("Emi Ma BlockGame Plugin is ALIVE!");
  }
}
