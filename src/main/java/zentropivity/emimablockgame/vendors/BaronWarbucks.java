package zentropivity.emimablockgame.vendors;

import java.util.List;

import zentropivity.emimablockgame.item.BlockGameItems;

public class BaronWarbucks extends AbstractVendor {
  public BaronWarbucks() {
    super("baronwarbucks", BlockGameItems.RUNE_MURDER_5);

    recipe("flag/surrender", 10, List.of(),
        BlockGameItems.WAR_BANNER_SURRENDER);
    recipe("war_bond", 0, BlockGameItems.WAR_SUPPLIES,
        BlockGameItems.WAR_BOND);
    recipe("flag/siege", 10, List.of(),
        BlockGameItems.WAR_BANNER_SIEGE);

    recipe("scroll/divineintervention", 1000, BlockGameItems.WAR_SUPPLIES.copy().setAmount(32),
        BlockGameItems.WARSCROLL_DIVINE_INTERVENTION);
    recipe("scroll/explodingfowl", 1000, BlockGameItems.WAR_SUPPLIES.copy().setAmount(32),
        BlockGameItems.WARSCROLL_EXPLODING_FOWL);
    recipe("scroll/blackhole", 1000, BlockGameItems.WAR_SUPPLIES.copy().setAmount(32),
        BlockGameItems.WARSCROLL_BLACK_HOLE);
    recipe("scroll/overload", 1000, BlockGameItems.WAR_SUPPLIES.copy().setAmount(32),
        BlockGameItems.WARSCROLL_OVERLOAD);
    recipe("scroll/meteor", 1000, BlockGameItems.WAR_SUPPLIES.copy().setAmount(32),
        BlockGameItems.WARSCROLL_METEOR);

    recipe("rune/murder/1", 200, BlockGameItems.WAR_SUPPLIES.copy().setAmount(12),
        BlockGameItems.RUNE_MURDER_1);
    recipe("rune/murder/2", 400, BlockGameItems.WAR_SUPPLIES.copy().setAmount(24),
        BlockGameItems.RUNE_MURDER_2);
    recipe("rune/murder/3", 600, BlockGameItems.WAR_SUPPLIES.copy().setAmount(32),
        BlockGameItems.RUNE_MURDER_3);
    recipe("rune/murder/4", 800, BlockGameItems.WAR_SUPPLIES.copy().setAmount(48),
        BlockGameItems.RUNE_MURDER_4);
    recipe("rune/murder/5", 1000, BlockGameItems.WAR_SUPPLIES.copy().setAmount(60),
        BlockGameItems.RUNE_MURDER_5);
  }
}
