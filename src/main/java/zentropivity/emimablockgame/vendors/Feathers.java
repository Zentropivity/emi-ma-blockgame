package zentropivity.emimablockgame.vendors;

import dev.emi.emi.api.stack.EmiStack;
import net.minecraft.item.Items;
import zentropivity.emimablockgame.item.BlockGameItems;

public class Feathers extends AbstractVendor {
  public Feathers() {
    super("feathers", EmiStack.of(Items.FEATHER));
  }
}
