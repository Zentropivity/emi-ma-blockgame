package zentropivity.emimablockgame.vendors;

import dev.emi.emi.api.stack.EmiStack;
import net.minecraft.item.Items;
import zentropivity.emimablockgame.item.BlockGameItems;

public class DavidSPumpkins extends AbstractVendor {
  public DavidSPumpkins() {
    super("davidspumpkins", EmiStack.of(Items.PUMPKIN));
  }
}
