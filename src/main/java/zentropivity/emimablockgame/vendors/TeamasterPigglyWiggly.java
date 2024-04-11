package zentropivity.emimablockgame.vendors;

import java.util.List;

import dev.emi.emi.api.stack.EmiStack;
import net.minecraft.item.Items;
import zentropivity.emimablockgame.item.BlockGameItems;

public class TeamasterPigglyWiggly extends AbstractVendor {
  public TeamasterPigglyWiggly() {
    super("teamasterpigglywiggly", BlockGameItems.SMOOTHIE_STAR);

    recipe("tea/quickstep", 5, List.of(
        EmiStack.of(Items.LILY_OF_THE_VALLEY, 8),
        EmiStack.of(Items.OXEYE_DAISY, 8),
        EmiStack.of(Items.AZURE_BLUET, 8),
        EmiStack.of(Items.CORNFLOWER, 8),
        BlockGameItems.TOUGH_ROOTS,
        BlockGameItems.BOTTLE_WATER_CLEAN),
        BlockGameItems.TEA_QUICKSTEP);
    recipe("tea/stomach", 5, List.of(
        EmiStack.of(Items.DANDELION, 8),
        EmiStack.of(Items.ROSE_BUSH, 8),
        EmiStack.of(Items.ALLIUM, 8),
        BlockGameItems.TOUGH_ROOTS,
        BlockGameItems.BOTTLE_WATER_CLEAN),
        BlockGameItems.TEA_STOMACH);
    recipe("tea/burning", 5, List.of(
        EmiStack.of(Items.CRIMSON_ROOTS, 8),
        EmiStack.of(Items.CRIMSON_FUNGUS, 8),
        EmiStack.of(Items.SPORE_BLOSSOM),
        BlockGameItems.TOUGH_ROOTS,
        BlockGameItems.BOTTLE_WATER_CLEAN),
        BlockGameItems.TEA_BURNING);
    recipe("tea/invisible", 5, List.of(
        EmiStack.of(Items.WARPED_ROOTS, 8),
        EmiStack.of(Items.WARPED_FUNGUS, 8),
        EmiStack.of(Items.SPORE_BLOSSOM),
        BlockGameItems.TOUGH_ROOTS,
        BlockGameItems.BOTTLE_WATER_CLEAN),
        BlockGameItems.TEA_INVISIBLE);
    recipe("tea/stoneskin", 5, List.of(
        EmiStack.of(Items.PEONY, 8),
        EmiStack.of(Items.POPPY, 8),
        EmiStack.of(Items.BLUE_ORCHID, 8),
        EmiStack.of(Items.PINK_TULIP, 8),
        EmiStack.of(Items.WHITE_TULIP, 8),
        EmiStack.of(Items.ORANGE_TULIP, 8),
        EmiStack.of(Items.RED_TULIP, 8),
        BlockGameItems.BOTTLE_WATER_CLEAN),
        BlockGameItems.TEA_STONESKIN);

    recipe("jam/sweetberry", 5, List.of(
        EmiStack.of(Items.SWEET_BERRIES, 10),
        EmiStack.of(Items.SUGAR, 10),
        BlockGameItems.BOTTLE_WATER_CLEAN),
        BlockGameItems.JAM_SWEETBERRY);
    recipe("jam/glowberry", 5, List.of(
        EmiStack.of(Items.GLOW_BERRIES, 10),
        EmiStack.of(Items.SUGAR, 10),
        BlockGameItems.BOTTLE_WATER_CLEAN),
        BlockGameItems.JAM_GLOWBERRY);

    recipe("broth/bone", 5, List.of(
        EmiStack.of(Items.BONE),
        BlockGameItems.BOTTLE_WATER_CLEAN),
        BlockGameItems.BROTH_BONE);
    recipe("broth/boneanimated", 5, List.of(
        BlockGameItems.ANIMATED_BONE,
        BlockGameItems.BOTTLE_WATER_CLEAN),
        BlockGameItems.BROTH_BONE_ANIMATED);

    recipe("gravy/base", 5, List.of(
        BlockGameItems.BROTH_BONE,
        BlockGameItems.FLOUR),
        BlockGameItems.GRAVY);
    recipe("groovy/base", 5, List.of(
        BlockGameItems.BROTH_BONE_ANIMATED,
        BlockGameItems.FLOUR),
        BlockGameItems.GROOVY);
    recipe("gravy/golden", 5, List.of(
        BlockGameItems.BROTH_BONE,
        BlockGameItems.GOLDEN_FLOUR),
        BlockGameItems.GRAVY_GOLDEN);
    recipe("groovy/golden", 5, List.of(
        BlockGameItems.BROTH_BONE_ANIMATED,
        BlockGameItems.GOLDEN_FLOUR),
        BlockGameItems.GROOVY_GOLDEN);
    recipe("gravy/sentient", 5, List.of(
        BlockGameItems.BROTH_BONE,
        BlockGameItems.SENTIENT_FLOUR),
        BlockGameItems.GRAVY_SENTIENT);
    recipe("groovy/sentient", 5, List.of(
        BlockGameItems.BROTH_BONE_ANIMATED,
        BlockGameItems.SENTIENT_FLOUR),
        BlockGameItems.GROOVY_SENTIENT);

    recipe("extract/lilac", 5, List.of(
        BlockGameItems.PETAL_LILAC,
        EmiStack.of(Items.SUGAR, 3),
        BlockGameItems.BOTTLE_WATER_CLEAN),
        BlockGameItems.EXTRACT_LILAC);
    recipe("extract/peony", 5, List.of(
        BlockGameItems.PETAL_PEONY,
        EmiStack.of(Items.SUGAR, 3),
        BlockGameItems.BOTTLE_WATER_CLEAN),
        BlockGameItems.EXTRACT_PEONY);
    recipe("extract/rose", 5, List.of(
        BlockGameItems.PETAL_ROSE,
        EmiStack.of(Items.SUGAR, 3),
        BlockGameItems.BOTTLE_WATER_CLEAN),
        BlockGameItems.EXTRACT_ROSE);
    recipe("extract/sunflower", 5, List.of(
        BlockGameItems.PETAL_SUNFLOWER,
        EmiStack.of(Items.SUGAR, 3),
        BlockGameItems.BOTTLE_WATER_CLEAN),
        BlockGameItems.EXTRACT_SUNFLOWER);

    recipe("starsmoothie", 5, List.of(
        EmiStack.of(Items.SUGAR, 3),
        EmiStack.of(Items.RED_MUSHROOM),
        BlockGameItems.ESSENCE_VIBRANT.copy().setAmount(4),
        BlockGameItems.ESSENCE_DAMP.copy().setAmount(4),
        BlockGameItems.ESSENCE_FLEETING.copy().setAmount(4),
        BlockGameItems.ESSENCE_ROCKY.copy().setAmount(4),
        BlockGameItems.ESSENCE_FIERY.copy().setAmount(4),
        BlockGameItems.EXTRACT_LILAC,
        BlockGameItems.EXTRACT_PEONY,
        BlockGameItems.EXTRACT_ROSE,
        BlockGameItems.EXTRACT_SUNFLOWER),
        BlockGameItems.SMOOTHIE_STAR);
  }
}
