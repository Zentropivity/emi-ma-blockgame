package zentropivity.emimablockgame.vendors;

import java.util.List;

import dev.emi.emi.api.stack.EmiStack;
import net.minecraft.item.Items;
import zentropivity.emimablockgame.item.BlockGameItems;

public class PotionsellerJustin extends AbstractVendor {
  public PotionsellerJustin() {
    super("potionsellerjustin", BlockGameItems.POTION_HEALING_GLOWING);

    recipe("potion/redstone", 10, List.of(
        EmiStack.of(Items.REDSTONE, 10),
        BlockGameItems.ESSENCE_VIBRANT,
        BlockGameItems.BOTTLE_WATER_CLEAN),
        BlockGameItems.POTION_REDSTONE);
    recipe("potion/lapis", 10, List.of(
        EmiStack.of(Items.LAPIS_LAZULI, 10),
        BlockGameItems.ESSENCE_VIBRANT,
        BlockGameItems.BOTTLE_WATER_CLEAN),
        BlockGameItems.POTION_LAPIS);
    recipe("potion/haunted", 10, List.of(
        BlockGameItems.LOBSTER_SOUL.copy().setAmount(3),
        BlockGameItems.ESSENCE_VIBRANT,
        BlockGameItems.BOTTLE_WATER_CLEAN),
        BlockGameItems.POTION_HAUNTED);

    recipe("potion/healing", 25, List.of(
        BlockGameItems.POTION_REDSTONE,
        BlockGameItems.POTION_LAPIS,
        BlockGameItems.POTION_HAUNTED,
        BlockGameItems.ESSENCE_VIBRANT.copy().setAmount(2)),
        BlockGameItems.POTION_HEALING);
    recipe("potion/healingglowing", 50, List.of(
        BlockGameItems.POTION_HEALING,
        BlockGameItems.GLOWING_MOTE),
        BlockGameItems.POTION_HEALING_GLOWING);
  }
}
