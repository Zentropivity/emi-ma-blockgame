package zentropivity.emimablockgame.vendors;

import zentropivity.emimablockgame.item.BlockGameItems;

public class MayorMcCheese extends AbstractVendor {
  public MayorMcCheese() {
    super("mayormccheese", BlockGameItems.TOKEN_ORIGIN_DAILY);

    recipe("quest/fishing/cod", 0, BlockGameItems.TOKEN_ORIGIN_DAILY,
        BlockGameItems.STARTER_FISHERMAN_COD);
    recipe("quest/fishing/salmon", 0, BlockGameItems.TOKEN_ORIGIN_DAILY,
        BlockGameItems.STARTER_FISHERMAN_SALMON);
    recipe("quest/fishing/tropicalfish", 0, BlockGameItems.TOKEN_ORIGIN_DAILY,
        BlockGameItems.STARTER_FISHERMAN_TROPICAL);
    recipe("quest/fishing/pufferfish", 0, BlockGameItems.TOKEN_ORIGIN_DAILY,
        BlockGameItems.STARTER_FISHERMAN_PUFFER);

    recipe("quest/mining/copper", 0, BlockGameItems.TOKEN_ORIGIN_DAILY,
        BlockGameItems.STARTER_MINER_COPPER);
    recipe("quest/mining/amethyst", 0, BlockGameItems.TOKEN_ORIGIN_DAILY,
        BlockGameItems.STARTER_MINER_GEODE);
    recipe("quest/mining/iron", 0, BlockGameItems.TOKEN_ORIGIN_DAILY,
        BlockGameItems.STARTER_MINER_IRON);
    recipe("quest/mining/lapislazuli", 0, BlockGameItems.TOKEN_ORIGIN_DAILY,
        BlockGameItems.STARTER_MINER_LAPIS);
    recipe("quest/mining/redstone", 0, BlockGameItems.TOKEN_ORIGIN_DAILY,
        BlockGameItems.STARTER_MINER_REDSTONE);

    recipe("quest/archaeology/salt", 0, BlockGameItems.TOKEN_ORIGIN_DAILY,
        BlockGameItems.STARTER_ARCHAEOLOGIST_SALT);
    recipe("quest/archaeology/sandstone", 0, BlockGameItems.TOKEN_ORIGIN_DAILY,
        BlockGameItems.STARTER_ARCHAEOLOGIST_CHISELED);
    recipe("quest/archaeology/commonshells", 0, BlockGameItems.TOKEN_ORIGIN_DAILY,
        BlockGameItems.STARTER_ARCHAEOLOGIST_COMMONSHELL);
    recipe("quest/archaeology/prettyshells", 0, BlockGameItems.TOKEN_ORIGIN_DAILY,
        BlockGameItems.STARTER_ARCHAEOLOGIST_PRETTYSHELL);
    recipe("quest/archaeology/fancyshells", 0, BlockGameItems.TOKEN_ORIGIN_DAILY,
        BlockGameItems.STARTER_ARCHAEOLOGIST_FANCYSHELL);

    recipe("quest/herbalism/wheat", 0, BlockGameItems.TOKEN_ORIGIN_DAILY,
        BlockGameItems.STARTER_BOTANIST_WHEAT);
    recipe("quest/herbalism/beetroots", 0, BlockGameItems.TOKEN_ORIGIN_DAILY,
        BlockGameItems.STARTER_BOTANIST_BEETROOT);
    recipe("quest/herbalism/carrots", 0, BlockGameItems.TOKEN_ORIGIN_DAILY,
        BlockGameItems.STARTER_BOTANIST_CARROT);
    recipe("quest/herbalism/potatoes", 0, BlockGameItems.TOKEN_ORIGIN_DAILY,
        BlockGameItems.STARTER_BOTANIST_POTATO);
    recipe("quest/herbalism/pepper", 0, BlockGameItems.TOKEN_ORIGIN_DAILY,
        BlockGameItems.STARTER_BOTANIST_PEPPER);

    recipe("quest/logging/oak", 0, BlockGameItems.TOKEN_ORIGIN_DAILY,
        BlockGameItems.STARTER_LUMBERJACK_OAK);
    recipe("quest/logging/spruce", 0, BlockGameItems.TOKEN_ORIGIN_DAILY,
        BlockGameItems.STARTER_LUMBERJACK_SPRUCE);
    recipe("quest/logging/birch", 0, BlockGameItems.TOKEN_ORIGIN_DAILY,
        BlockGameItems.STARTER_LUMBERJACK_BIRCH);
    recipe("quest/logging/jungle", 0, BlockGameItems.TOKEN_ORIGIN_DAILY,
        BlockGameItems.STARTER_LUMBERJACK_JUNGLE);
    recipe("quest/logging/acacia", 0, BlockGameItems.TOKEN_ORIGIN_DAILY,
        BlockGameItems.STARTER_LUMBERJACK_ACACIA);
    recipe("quest/logging/darkoak", 0, BlockGameItems.TOKEN_ORIGIN_DAILY,
        BlockGameItems.STARTER_LUMBERJACK_DARKOAK);
    recipe("quest/logging/mangrove", 0, BlockGameItems.TOKEN_ORIGIN_DAILY,
        BlockGameItems.STARTER_LUMBERJACK_MANGROVE);
    recipe("quest/logging/cherry", 0, BlockGameItems.TOKEN_ORIGIN_DAILY,
        BlockGameItems.STARTER_LUMBERJACK_CHERRY);

    recipe("quest/runecarving/violence", 0, BlockGameItems.TOKEN_ORIGIN_DAILY,
        BlockGameItems.STARTER_RUNECARVER_VIOLENCE);
    recipe("quest/runecarving/serenity", 0, BlockGameItems.TOKEN_ORIGIN_DAILY,
        BlockGameItems.STARTER_RUNECARVER_SERENITY);
    recipe("quest/runecarving/clarity", 0, BlockGameItems.TOKEN_ORIGIN_DAILY,
        BlockGameItems.STARTER_RUNECARVER_CLARITY);
    recipe("quest/runecarving/muddled", 0, BlockGameItems.TOKEN_ORIGIN_DAILY,
        BlockGameItems.STARTER_RUNECARVER_MUDDLED);
  }
}
