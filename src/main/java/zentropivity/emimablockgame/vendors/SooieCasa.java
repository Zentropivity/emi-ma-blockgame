package zentropivity.emimablockgame.vendors;

import java.util.List;

import zentropivity.emimablockgame.item.BlockGameItems;

public class SooieCasa extends AbstractVendor {
  public SooieCasa() {
    super("sooiecasa", BlockGameItems.WRIT_EXPANSION);

    recipe("expansion/corrupted", 500, BlockGameItems.CORRUPTED_SHARD.copy().setAmount(5),
        BlockGameItems.WRIT_EXPANSION);
    recipe("expansion/pristine", 500, List.of(
        BlockGameItems.PRISTINE_HIDE.copy().setAmount(64),
        BlockGameItems.PRISTINE_STONE.copy().setAmount(64),
        BlockGameItems.PRISTINE_WOOD.copy().setAmount(64)),
        BlockGameItems.WRIT_EXPANSION);
  }
}
