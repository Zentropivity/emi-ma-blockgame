package zentropivity.emimablockgame.vendors;

import java.util.List;

import zentropivity.emimablockgame.item.BlockGameItems;

public class RobotForge extends AbstractVendor {
  public RobotForge() {
    super("robotforge", BlockGameItems.ONION_BOOTS);

    recipe("onion/helmet", 5, List.of(),
        BlockGameItems.ONION_HELMET);
    recipe("onion/chestplate", 5, List.of(),
        BlockGameItems.ONION_CHESTPLATE);
    recipe("onion/leggings", 5, List.of(),
        BlockGameItems.ONION_LEGGINGS);
    recipe("onion/boots", 5, List.of(),
        BlockGameItems.ONION_BOOTS);

    recipe("onion/pickaxe", 5, List.of(),
        BlockGameItems.ONION_PICKAXE);
    recipe("onion/sword", 5, List.of(),
        BlockGameItems.ONION_SWORD);
    recipe("onion/shield", 5, List.of(),
        BlockGameItems.ONION_SHIELD);
  }
}
