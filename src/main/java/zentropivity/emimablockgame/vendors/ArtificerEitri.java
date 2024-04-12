package zentropivity.emimablockgame.vendors;

import java.util.List;

import dev.emi.emi.api.stack.EmiStack;
import net.minecraft.item.Items;
import zentropivity.emimablockgame.item.BlockGameItems;

public class ArtificerEitri extends AbstractVendor {
  public ArtificerEitri() {
    super("artificereitri", BlockGameItems.TURBO_ENCABULATOR);

    recipe("runeeraser", 1000, List.of(), BlockGameItems.RUNE_ERASER);
    recipe("salvagekit", 1000, List.of(), BlockGameItems.SALVAGE_KIT);

    recipe("utility/nightvision", 1000, List.of(
        BlockGameItems.PRISTINE_WOOD,
        BlockGameItems.LIVING_FIRE),
        BlockGameItems.TORCH_EVERBURNING);
    recipe("utility/waterbreathing", 1000, List.of(
        BlockGameItems.FANCY_SHELL,
        BlockGameItems.WHIPPING_WINDS),
        BlockGameItems.SHELL_EVERBUBBLING);
    recipe("utility/dolphinsgrace", 1000, List.of(
        BlockGameItems.FANCY_SHELL,
        BlockGameItems.FROZEN_STAR),
        BlockGameItems.FINS_EVERFLAPPING);
    recipe("utility/falldamage", 1000, List.of(
        BlockGameItems.FANCY_SHELL,
        BlockGameItems.CRUMBLING_EARTH),
        BlockGameItems.BONES_EVERPOWERFUL);

    recipe("utility/watervision", 2500, List.of(
        BlockGameItems.WHIPPING_WINDS.copy().setAmount(5),
        BlockGameItems.LIVING_FIRE.copy().setAmount(5),
        BlockGameItems.TORCH_EVERBURNING,
        BlockGameItems.SHELL_EVERBUBBLING),
        BlockGameItems.SEE_BREATHER);
    recipe("utility/dolphinsfall", 2500, List.of(
        BlockGameItems.FROZEN_STAR.copy().setAmount(5),
        BlockGameItems.CRUMBLING_EARTH.copy().setAmount(5),
        BlockGameItems.FINS_EVERFLAPPING,
        BlockGameItems.BONES_EVERPOWERFUL),
        BlockGameItems.FINNY_BONE);

    recipe("utility/turbo", 5000, List.of(
        BlockGameItems.MAGISTEEL_INGOT.copy().setAmount(5),
        BlockGameItems.SEE_BREATHER,
        BlockGameItems.FINNY_BONE),
        BlockGameItems.TURBO_ENCABULATOR);
  }
}
