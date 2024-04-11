package zentropivity.emimablockgame.vendors;

import java.util.List;

import dev.emi.emi.api.stack.EmiStack;
import net.minecraft.item.Items;
import zentropivity.emimablockgame.item.BlockGameItems;

public class ChefKen extends AbstractVendor {
  public ChefKen() {
    super("chefken", BlockGameItems.BUTTER_FRIED_PUFFERFISH);

    recipe("wellseasoned/beef", 10, List.of(
        BlockGameItems.PEPPER,
        BlockGameItems.SALT,
        BlockGameItems.BUTTER,
        EmiStack.of(Items.BEEF)),
        BlockGameItems.WELL_SEASONED_BEEF);
    recipe("wellseasoned/chicken", 10, List.of(
        BlockGameItems.PEPPER,
        BlockGameItems.SALT,
        BlockGameItems.BUTTER,
        EmiStack.of(Items.CHICKEN)),
        BlockGameItems.WELL_SEASONED_CHICKEN);
    recipe("wellseasoned/cod", 10, List.of(
        BlockGameItems.PEPPER,
        BlockGameItems.SALT,
        BlockGameItems.BUTTER,
        EmiStack.of(Items.COD)),
        BlockGameItems.WELL_SEASONED_COD);
    recipe("wellseasoned/mutton", 10, List.of(
        BlockGameItems.PEPPER,
        BlockGameItems.SALT,
        BlockGameItems.BUTTER,
        EmiStack.of(Items.MUTTON)),
        BlockGameItems.WELL_SEASONED_MUTTON);
    recipe("wellseasoned/porkchop", 10, List.of(
        BlockGameItems.PEPPER,
        BlockGameItems.SALT,
        BlockGameItems.BUTTER,
        EmiStack.of(Items.PORKCHOP)),
        BlockGameItems.WELL_SEASONED_PORKCHOP);
    recipe("wellseasoned/rabbit", 10, List.of(
        BlockGameItems.PEPPER,
        BlockGameItems.SALT,
        BlockGameItems.BUTTER,
        EmiStack.of(Items.RABBIT)),
        BlockGameItems.WELL_SEASONED_RABBIT);
    recipe("wellseasoned/salmon", 10, List.of(
        BlockGameItems.PEPPER,
        BlockGameItems.SALT,
        BlockGameItems.BUTTER,
        EmiStack.of(Items.SALMON)),
        BlockGameItems.WELL_SEASONED_SALMON);
    recipe("wellseasoned/tropicalfish", 10, List.of(
        BlockGameItems.PEPPER,
        BlockGameItems.SALT,
        BlockGameItems.BUTTER,
        EmiStack.of(Items.TROPICAL_FISH)),
        BlockGameItems.WELL_SEASONED_TROPICAL_FISH);
    recipe("wellseasoned/pufferfish", 10, List.of(
        BlockGameItems.PEPPER,
        BlockGameItems.SALT,
        BlockGameItems.BUTTER,
        EmiStack.of(Items.PUFFERFISH)),
        BlockGameItems.WELL_SEASONED_PUFFERFISH);

    recipe("butterfried/beef", 50, List.of(
        BlockGameItems.ESSENCE_FIERY,
        BlockGameItems.GOLDEN_FLOUR,
        BlockGameItems.PEPPER,
        BlockGameItems.SALT,
        BlockGameItems.BUTTER.copy().setAmount(3),
        EmiStack.of(Items.BEEF)),
        BlockGameItems.BUTTER_FRIED_BEEF);
    recipe("butterfried/chicken", 50, List.of(
        BlockGameItems.ESSENCE_FIERY,
        BlockGameItems.GOLDEN_FLOUR,
        BlockGameItems.PEPPER,
        BlockGameItems.SALT,
        BlockGameItems.BUTTER.copy().setAmount(3),
        EmiStack.of(Items.CHICKEN)),
        BlockGameItems.BUTTER_FRIED_CHICKEN);
    recipe("butterfried/cod", 50, List.of(
        BlockGameItems.ESSENCE_FIERY,
        BlockGameItems.GOLDEN_FLOUR,
        BlockGameItems.PEPPER,
        BlockGameItems.SALT,
        BlockGameItems.BUTTER.copy().setAmount(3),
        EmiStack.of(Items.COD)),
        BlockGameItems.BUTTER_FRIED_COD);
    recipe("butterfried/mutton", 50, List.of(
        BlockGameItems.ESSENCE_FIERY,
        BlockGameItems.GOLDEN_FLOUR,
        BlockGameItems.PEPPER,
        BlockGameItems.SALT,
        BlockGameItems.BUTTER.copy().setAmount(3),
        EmiStack.of(Items.MUTTON)),
        BlockGameItems.BUTTER_FRIED_MUTTON);
    recipe("butterfried/porkchop", 50, List.of(
        BlockGameItems.ESSENCE_FIERY,
        BlockGameItems.GOLDEN_FLOUR,
        BlockGameItems.PEPPER,
        BlockGameItems.SALT,
        BlockGameItems.BUTTER.copy().setAmount(3),
        EmiStack.of(Items.PORKCHOP)),
        BlockGameItems.BUTTER_FRIED_PORKCHOP);
    recipe("butterfried/rabbit", 50, List.of(
        BlockGameItems.ESSENCE_FIERY,
        BlockGameItems.GOLDEN_FLOUR,
        BlockGameItems.PEPPER,
        BlockGameItems.SALT,
        BlockGameItems.BUTTER.copy().setAmount(3),
        EmiStack.of(Items.RABBIT)),
        BlockGameItems.BUTTER_FRIED_RABBIT);
    recipe("butterfried/salmon", 50, List.of(
        BlockGameItems.ESSENCE_FIERY,
        BlockGameItems.GOLDEN_FLOUR,
        BlockGameItems.PEPPER,
        BlockGameItems.SALT,
        BlockGameItems.BUTTER.copy().setAmount(3),
        EmiStack.of(Items.SALMON)),
        BlockGameItems.BUTTER_FRIED_SALMON);
    recipe("butterfried/tropicalfish", 50, List.of(
        BlockGameItems.ESSENCE_FIERY,
        BlockGameItems.GOLDEN_FLOUR,
        BlockGameItems.PEPPER,
        BlockGameItems.SALT,
        BlockGameItems.BUTTER.copy().setAmount(3),
        EmiStack.of(Items.TROPICAL_FISH)),
        BlockGameItems.BUTTER_FRIED_TROPICAL_FISH);
    recipe("butterfried/pufferfish", 50, List.of(
        BlockGameItems.ESSENCE_FIERY,
        BlockGameItems.GOLDEN_FLOUR,
        BlockGameItems.PEPPER,
        BlockGameItems.SALT,
        BlockGameItems.BUTTER.copy().setAmount(3),
        EmiStack.of(Items.PUFFERFISH)),
        BlockGameItems.BUTTER_FRIED_PUFFERFISH);

    recipe("pie/pumpkin", 5, List.of(
        EmiStack.of(Items.PUMPKIN),
        EmiStack.of(Items.SUGAR, 3),
        BlockGameItems.SALT,
        BlockGameItems.FLOUR.copy().setAmount(3)),
        BlockGameItems.PIE_PUMPKIN);
    recipe("pie/sweetberries", 5, List.of(
        EmiStack.of(Items.SWEET_BERRIES, 4),
        EmiStack.of(Items.SUGAR, 3),
        BlockGameItems.SALT,
        BlockGameItems.FLOUR.copy().setAmount(3)),
        BlockGameItems.PIE_SWEETBERRY);
    recipe("pie/glowberries", 5, List.of(
        EmiStack.of(Items.GLOW_BERRIES, 4),
        EmiStack.of(Items.SUGAR, 3),
        BlockGameItems.SALT,
        BlockGameItems.FLOUR.copy().setAmount(3)),
        BlockGameItems.PIE_GLOWBERRY);
    recipe("pie/stargazy", 5, List.of(
        EmiStack.of(Items.COD, 8),
        EmiStack.of(Items.SUGAR),
        BlockGameItems.SALT,
        BlockGameItems.FLOUR.copy().setAmount(3)),
        BlockGameItems.PIE_STARGAZY);

    recipe("krognars/baconandeggs", 5, List.of(
        EmiStack.of(Items.EGG, 5),
        BlockGameItems.BUTTER,
        BlockGameItems.PEPPER,
        BlockGameItems.SALT,
        BlockGameItems.BACON_BITS.copy().setAmount(10)),
        BlockGameItems.BACON_AND_EGGS);
  }
}
