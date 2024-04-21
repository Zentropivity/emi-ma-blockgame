package zentropivity.emimablockgame.vendors;

import java.util.List;

import dev.emi.emi.api.stack.EmiStack;
import net.minecraft.item.Items;
import zentropivity.emimablockgame.item.BlockGameItems;

public class ChefSue extends AbstractVendor {
  public ChefSue() {
    super("chefsue", BlockGameItems.EASTER_LAMB);

    recipe("potatoesandgravy/base", 5, List.of(
        EmiStack.of(Items.POTATO, 3),
        BlockGameItems.GRAVY), BlockGameItems.POTATOES_AND_GRAVY);
    recipe("potatoesandgravy/animated", 5, List.of(
        EmiStack.of(Items.POTATO, 3),
        BlockGameItems.GROOVY), BlockGameItems.POTATOES_AND_GROOVY);
    recipe("potatoesandgravy/base/golden", 5, List.of(
        BlockGameItems.GOLDEN_POTATO.copy().setAmount(3),
        BlockGameItems.GRAVY_GOLDEN), BlockGameItems.GOLDEN_POTATOES_AND_GOLDEN_GRAVY);
    recipe("potatoesandgravy/animated/golden", 5, List.of(
        BlockGameItems.GOLDEN_POTATO.copy().setAmount(3),
        BlockGameItems.GROOVY_GOLDEN), BlockGameItems.GOLDEN_POTATOES_AND_GOLDEN_GROOVY);
    recipe("potatoesandgravy/base/sentient", 5, List.of(
        BlockGameItems.SENTIENT_POTATO.copy().setAmount(3),
        BlockGameItems.GRAVY_SENTIENT), BlockGameItems.SENTIENT_POTATOES_AND_SENTIENT_GRAVY);
    recipe("potatoesandgravy/animated/sentient", 5, List.of(
        BlockGameItems.SENTIENT_POTATO.copy().setAmount(3),
        BlockGameItems.GROOVY_SENTIENT), BlockGameItems.SENTIENT_POTATOES_AND_SENTIENT_GROOVY);

    recipe("bread/wholewart", 5, List.of(
        BlockGameItems.WHOLE_WART,
        EmiStack.of(Items.BREAD)), BlockGameItems.WHOLE_WART_BREAD);

    recipe("tastymelonpop", 5, List.of(
        BlockGameItems.TASTY_MELON_SLICE.copy().setAmount(4),
        BlockGameItems.ESSENCE_DAMP,
        EmiStack.of(Items.SUGAR, 4)), BlockGameItems.TASTY_MELON_POP.copy().setAmount(4));

    recipe("jammybuttertoast", 5, List.of(
        BlockGameItems.BUTTER.copy().setAmount(3),
        BlockGameItems.JAM_SWEETBERRY,
        BlockGameItems.JAM_GLOWBERRY,
        BlockGameItems.GOLDEN_BREAD), BlockGameItems.JAMMY_BUTTER_TOAST);

    recipe("easter/chocorabbit", 5, List.of(
        EmiStack.of(Items.SUGAR, 5),
        EmiStack.of(Items.COCOA_BEANS, 10),
        EmiStack.of(Items.RABBIT_FOOT, 2)), BlockGameItems.CHOCOLATE_RABBIT);
    recipe("easter/hotcrossbun", 5, List.of(
        EmiStack.of(Items.SUGAR, 5),
        EmiStack.of(Items.SWEET_BERRIES, 3),
        EmiStack.of(Items.GLOW_BERRIES, 3),
        BlockGameItems.DOUGH), BlockGameItems.HOT_CROSS_BUN);
    recipe("easter/egg", 5, List.of(
        EmiStack.of(Items.BROWN_DYE),
        EmiStack.of(Items.BLACK_DYE),
        EmiStack.of(Items.WHITE_DYE),
        EmiStack.of(Items.LIGHT_BLUE_DYE),
        EmiStack.of(Items.ORANGE_DYE),
        EmiStack.of(Items.EGG)),
        BlockGameItems.PAINTED_EGG);
    recipe("easter/lamb", 5, List.of(
        BlockGameItems.PEPPER,
        BlockGameItems.SALT,
        BlockGameItems.BUTTER,
        EmiStack.of(Items.MUTTON)),
        BlockGameItems.EASTER_LAMB);
  }
}
