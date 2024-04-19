package zentropivity.emimablockgame.vendors;

import java.util.List;

import dev.emi.emi.api.stack.EmiStack;
import net.minecraft.item.Items;
import zentropivity.emimablockgame.item.BlockGameItems;

public class LumberjackPaul extends AbstractVendor {
  public LumberjackPaul() {
    super("lumberjackpaul", BlockGameItems.BRASS_AXE);

    sameOutRecipes("repair/normal/common", 0, 5, List.of(
        EmiStack.of(Items.OAK_LOG, 64),
        EmiStack.of(Items.SPRUCE_LOG, 64),
        EmiStack.of(Items.BIRCH_LOG, 64),
        EmiStack.of(Items.MANGROVE_LOG, 64),
        EmiStack.of(Items.JUNGLE_LOG, 64),
        EmiStack.of(Items.ACACIA_LOG, 64),
        EmiStack.of(Items.DARK_OAK_LOG, 64),
        BlockGameItems.BARK_OAK.copy().setAmount(8),
        BlockGameItems.BARK_SPRUCE.copy().setAmount(8),
        BlockGameItems.BARK_BIRCH.copy().setAmount(8),
        BlockGameItems.BARK_MANGROVE.copy().setAmount(8),
        BlockGameItems.BARK_JUNGLE.copy().setAmount(8),
        BlockGameItems.BARK_ACACIA.copy().setAmount(8),
        BlockGameItems.BARK_DARK_OAK.copy().setAmount(8),
        BlockGameItems.PRISTINE_WOOD.copy().setAmount(16)),
        BlockGameItems.REPAIR_POWDER_COMMON);

    recipe("xptome/logging", 50, BlockGameItems.PRISTINE_CORE, BlockGameItems.SECRETS_LOGGING);
    recipe("fragile/axe", 1000, List.of(
        EmiStack.of(Items.GLASS, 64),
        BlockGameItems.SKYSTEEL_AXE,
        BlockGameItems.BOLT_SILK.copy().setAmount(9),
        BlockGameItems.PRISTINE_WOOD.copy().setAmount(2)), BlockGameItems.FRAGILE_AXE);
  }
}
