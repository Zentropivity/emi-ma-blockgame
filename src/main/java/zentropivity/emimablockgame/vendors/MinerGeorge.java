package zentropivity.emimablockgame.vendors;

import java.util.List;

import dev.emi.emi.api.stack.EmiStack;
import net.minecraft.item.Items;
import zentropivity.emimablockgame.item.BlockGameItems;

public class MinerGeorge extends AbstractVendor {
  public MinerGeorge() {
    super("minergeorge", BlockGameItems.BRASS_PICKAXE);

    sameOutRecipes("repair/normal/common", 0, 5, List.of(
        EmiStack.of(Items.ANDESITE, 64),
        EmiStack.of(Items.SMOOTH_BASALT, 64),
        EmiStack.of(Items.CALCITE, 64),
        EmiStack.of(Items.DRIPSTONE_BLOCK, 64),
        EmiStack.of(Items.DIORITE, 64),
        EmiStack.of(Items.COBBLED_DEEPSLATE, 64),
        EmiStack.of(Items.TUFF, 64),
        EmiStack.of(Items.GRANITE, 64),
        EmiStack.of(Items.GRANITE, 64),
        BlockGameItems.PRISTINE_STONE.copy().setAmount(16),
        EmiStack.of(Items.SMOOTH_BASALT).setAmount(8)),
        BlockGameItems.REPAIR_POWDER_COMMON);

    sameOutRecipes("repair/arcane/common", 0, 5, List.of(
        EmiStack.of(Items.LAPIS_LAZULI, 8),
        EmiStack.of(Items.AMETHYST_SHARD, 8)),
        BlockGameItems.REPAIR_POWDER_ARCANE_COMMON);

    recipe("repair/arcane/uncommon", 10,
        EmiStack.of(Items.AMETHYST_BLOCK),
        BlockGameItems.REPAIR_POWDER_ARCANE_UNCOMMON);

    recipe("xptome/mining", 50,
        BlockGameItems.EARTHEN_HEART,
        BlockGameItems.SECRETS_MINING);

    recipe("fragile/pickaxe", 1000,
        List.of(
            BlockGameItems.SKYSTEEL_PICKAXE,
            BlockGameItems.BOLT_SILK.copy().setAmount(9),
            BlockGameItems.PRISTINE_WOOD.copy().setAmount(2)),
        BlockGameItems.FRAGILE_PICKAXE);
  }
}
