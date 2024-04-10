package zentropivity.emimablockgame;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import zentropivity.emimablockgame.item.BlockGameItems;
import zentropivity.emimablockgame.vendors.AbstractVendor;
import zentropivity.emimablockgame.vendors.ArchaeologistIndy;
import zentropivity.emimablockgame.vendors.FishermanBaelin;
import zentropivity.emimablockgame.vendors.FishermanFranky;
import zentropivity.emimablockgame.vendors.LumberjackLarry;
import zentropivity.emimablockgame.vendors.BaronWarbucks;
import zentropivity.emimablockgame.vendors.BotanistHesha;
import zentropivity.emimablockgame.vendors.MinerGeorge;
import zentropivity.emimablockgame.vendors.MinerSteve;
import zentropivity.emimablockgame.vendors.RunecarverBrokkr;
import zentropivity.emimablockgame.vendors.MayorMcCheese;
import zentropivity.emimablockgame.vendors.BotanistMint;
import zentropivity.emimablockgame.vendors.ArchaeologistMortimer;
import zentropivity.emimablockgame.vendors.LumberjackPaul;
import zentropivity.emimablockgame.vendors.SooieCasa;
import zentropivity.emimablockgame.vendors.RunecarverStonebeard;
import dev.emi.emi.api.EmiPlugin;
import dev.emi.emi.api.EmiRegistry;

public class EmiMaBlockGamePlugin implements EmiPlugin {
  // This logger is used to write text to the console and the log file.
  // It is considered best practice to use your mod id as the logger's name.
  // That way, it's clear which mod wrote info, warnings, and errors.
  public static final Logger LOGGER = LoggerFactory.getLogger("emi-ma-blockgame");

  public final List<AbstractVendor> ALLVENDORS = List.of(
    // Origin hall
    new MinerGeorge(),
    new LumberjackPaul(),
    new ArchaeologistMortimer(),
    new FishermanBaelin(),
    new BotanistMint(),
    new RunecarverStonebeard(),
    new SooieCasa(),
    new BaronWarbucks(),
    new MayorMcCheese(),
    // profession crafters
    new MinerSteve(),
    new LumberjackLarry(),
    new ArchaeologistIndy(),
    new FishermanFranky(),
    new BotanistHesha(),
    new RunecarverBrokkr()
  );

  @Override
  public void register(EmiRegistry registry) {
    BlockGameItems.addItems(registry);

    ALLVENDORS.forEach((v) -> v.init(registry));

    LOGGER.info("Emi Ma BlockGame Plugin is ALIVE!");
  }
}
