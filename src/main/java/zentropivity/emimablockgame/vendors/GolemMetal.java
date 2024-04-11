package zentropivity.emimablockgame.vendors;

import dev.emi.emi.api.stack.EmiStack;
import net.minecraft.item.Items;
import zentropivity.emimablockgame.item.BlockGameItems;

public class GolemMetal extends AbstractVendor {
  public GolemMetal() {
    super("golemmetal", EmiStack.of(Items.IRON_INGOT));

    recipe("coin/copper/1",0, EmiStack.of(Items.COPPER_INGOT), BlockGameItems.GOLD_COIN);
    recipe("coin/copper/10",0, EmiStack.of(Items.COPPER_INGOT, 10), BlockGameItems.PLATINUM_COIN);

    recipe("coin/iron/1",0, EmiStack.of(Items.IRON_INGOT), BlockGameItems.GOLD_COIN.copy().setAmount(2));
    recipe("coin/iron/10",0, EmiStack.of(Items.IRON_INGOT, 10), BlockGameItems.PLATINUM_COIN.copy().setAmount(2));

    recipe("coin/gold/1",0, EmiStack.of(Items.GOLD_INGOT), BlockGameItems.GOLD_COIN.copy().setAmount(3));
    recipe("coin/gold/10",0, EmiStack.of(Items.GOLD_INGOT, 10), BlockGameItems.PLATINUM_COIN.copy().setAmount(3));
  }
}
