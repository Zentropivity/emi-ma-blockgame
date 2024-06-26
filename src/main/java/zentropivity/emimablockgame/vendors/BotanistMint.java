package zentropivity.emimablockgame.vendors;

import java.util.List;

import dev.emi.emi.api.stack.EmiStack;
import net.minecraft.item.Items;
import zentropivity.emimablockgame.item.BlockGameItems;

public class BotanistMint extends AbstractVendor {
  public BotanistMint() {
    super("botanistmint", BlockGameItems.BRASS_HOE);

    sameOutRecipes("repair/normal/uncommon", 0, 10, List.of(
        BlockGameItems.GOLDEN_WHEAT.copy().setAmount(8),
        BlockGameItems.GOLDEN_POTATO.copy().setAmount(8),
        BlockGameItems.FAT_CARROT.copy().setAmount(8)),
        BlockGameItems.REPAIR_POWDER_UNCOMMON);

    sameOutRecipes("repair/normal/rare", 0, 50, List.of(
        BlockGameItems.SENTIENT_WHEAT.copy().setAmount(4),
        BlockGameItems.SENTIENT_POTATO.copy().setAmount(4)),
        BlockGameItems.REPAIR_POWDER_RARE);

    recipe("xptome/herbalism", 50, BlockGameItems.EARTHEN_HEART, BlockGameItems.SECRETS_HERBALISM);
    recipe("fragile/hoe", 1000, List.of(
        EmiStack.of(Items.GLASS, 64),
        BlockGameItems.SKYSTEEL_HOE,
        BlockGameItems.BOLT_SILK.copy().setAmount(9),
        BlockGameItems.PRISTINE_WOOD.copy().setAmount(2)),
        BlockGameItems.FRAGILE_HOE);
  }
}
