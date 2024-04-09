package zentropivity.emimablockgame.vendors;

import java.util.List;

import dev.emi.emi.api.stack.EmiStack;
import net.minecraft.item.Items;
import zentropivity.emimablockgame.item.BlockGameItems;

public class Mortimer extends AbstractVendor {
  public Mortimer() {
    super("mortimer", BlockGameItems.BRASS_SHOVEL);

    sameOutRecipes("repair/normal/common", 0, 5, List.of(
        EmiStack.of(Items.DIRT, 64),
        EmiStack.of(Items.SANDSTONE, 64),
        EmiStack.of(Items.CLAY, 64),
        EmiStack.of(Items.SAND, 64),
        EmiStack.of(Items.GRAVEL, 64),
        EmiStack.of(Items.RED_SAND, 64),
        EmiStack.of(Items.SOUL_SAND, 64),
        EmiStack.of(Items.SOUL_SOIL, 64),
        BlockGameItems.COMMON_SHELL.copy().setAmount(16)),
        BlockGameItems.REPAIR_POWDER_COMMON);

    recipe("repair/normal/uncommon", 10, BlockGameItems.PRETTY_SHELL.copy().setAmount(8),
        BlockGameItems.REPAIR_POWDER_UNCOMMON);
    recipe("repair/normal/rare", 50, BlockGameItems.FANCY_SHELL.copy().setAmount(4),
        BlockGameItems.REPAIR_POWDER_RARE);

    recipe("repair/arcane/rare", 50, BlockGameItems.COAGULATED_MASS.copy().setAmount(4),
        BlockGameItems.REPAIR_POWDER_ARCANE_RARE);

    recipe("xptome/archaeology", 50, BlockGameItems.EARTHEN_HEART, BlockGameItems.SECRETS_ARCHAEOLOGY);
    recipe("fragile/shovel", 1000, List.of(
        BlockGameItems.SKYSTEEL_SHOVEL,
        BlockGameItems.BOLT_SILK.copy().setAmount(9),
        BlockGameItems.PRISTINE_WOOD.copy().setAmount(2)),
        BlockGameItems.FRAGILE_SHOVEL);
  }
}
