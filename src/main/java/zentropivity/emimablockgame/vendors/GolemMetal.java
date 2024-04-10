package zentropivity.emimablockgame.vendors;

import dev.emi.emi.api.stack.EmiStack;
import net.minecraft.item.Items;
import zentropivity.emimablockgame.item.BlockGameItems;

public class GolemMetal extends AbstractVendor {
  public GolemMetal() {
    super("golemmetal", EmiStack.of(Items.IRON_INGOT));
  }
}
