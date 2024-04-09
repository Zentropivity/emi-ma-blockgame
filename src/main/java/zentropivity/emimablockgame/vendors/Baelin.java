package zentropivity.emimablockgame.vendors;

import java.util.List;

import dev.emi.emi.api.stack.EmiStack;
import net.minecraft.item.Items;
import zentropivity.emimablockgame.item.BlockGameItems;

public class Baelin extends AbstractVendor {
  public Baelin() {
    super("baelin", BlockGameItems.BRASS_FISHINGPOLE);

    sameOutRecipes("repair/normal/common", 0, 5, List.of(
        EmiStack.of(Items.COD, 64),
        EmiStack.of(Items.SALMON, 64),
        EmiStack.of(Items.TROPICAL_FISH, 64)),
        BlockGameItems.REPAIR_POWDER_COMMON);

    recipe("repair/normal/uncommon", 10,
        EmiStack.of(Items.PUFFERFISH, 32),
        BlockGameItems.REPAIR_POWDER_UNCOMMON);

    recipe("pristine/wood", 0, BlockGameItems.FISH_WOODFISH,
        BlockGameItems.PRISTINE_WOOD.copy().setAmount(4));
    recipe("pristine/stone", 0, BlockGameItems.FISH_STONEFISH,
        BlockGameItems.PRISTINE_STONE.copy().setAmount(4));
    recipe("pristine/hide", 0, BlockGameItems.FISH_BADFISH,
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(4));
    recipe("pristine/salt", 0, BlockGameItems.FISH_SALTFISH,
        BlockGameItems.SALT.copy().setAmount(4));
    recipe("pristine/pepper", 0, BlockGameItems.FISH_PEPPERFISH,
        BlockGameItems.PEPPER.copy().setAmount(4));
    recipe("mushroom/mini", 0, BlockGameItems.FISH_FUNGALFISH,
        BlockGameItems.MINI_MUSHROOM);
    recipe("mushroom/mega", 0, BlockGameItems.FISH_FUNGALFISH,
        BlockGameItems.MEGA_MUSHROOM);
    recipe("essence/vibrant", 0, BlockGameItems.FISH_GLOWFISH,
        BlockGameItems.ESSENCE_VIBRANT.copy().setAmount(2));

    recipe("xptome/fishing", 50, BlockGameItems.SOGGY_BOOK,
        BlockGameItems.SECRETS_FISHING);
  }
}
