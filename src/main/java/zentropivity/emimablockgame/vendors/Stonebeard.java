package zentropivity.emimablockgame.vendors;

import java.util.List;

import dev.emi.emi.api.stack.EmiStack;
import net.minecraft.item.Items;
import zentropivity.emimablockgame.item.BlockGameItems;

public class Stonebeard extends AbstractVendor {
  public Stonebeard() {
    super("stonebeard", BlockGameItems.RUNE_ERASER);

    // runes
    recipe("rune/serenity/1", 100, List.of(
        BlockGameItems.PRISTINE_STONE.copy().setAmount(2),
        BlockGameItems.ESSENCE_ROCKY.copy().setAmount(6)),
        BlockGameItems.RUNE_SERENITY_1);
    recipe("rune/serenity/2", 200, List.of(
        BlockGameItems.PRISTINE_STONE.copy().setAmount(4),
        BlockGameItems.ESSENCE_ROCKY.copy().setAmount(12)),
        BlockGameItems.RUNE_SERENITY_2);
    recipe("rune/serenity/3", 300, List.of(
        BlockGameItems.PRISTINE_STONE.copy().setAmount(6),
        BlockGameItems.ESSENCE_ROCKY.copy().setAmount(18)),
        BlockGameItems.RUNE_SERENITY_3);
    recipe("rune/serenity/4", 400, List.of(
        BlockGameItems.PRISTINE_STONE.copy().setAmount(8),
        BlockGameItems.ESSENCE_ROCKY.copy().setAmount(24)),
        BlockGameItems.RUNE_SERENITY_4);
    recipe("rune/serenity/5", 500, List.of(
        BlockGameItems.PRISTINE_STONE.copy().setAmount(10),
        BlockGameItems.ESSENCE_ROCKY.copy().setAmount(30)),
        BlockGameItems.RUNE_SERENITY_5);

    recipe("rune/violence/1", 100, List.of(
        BlockGameItems.PRISTINE_STONE.copy().setAmount(2),
        BlockGameItems.ESSENCE_FIERY.copy().setAmount(6)),
        BlockGameItems.RUNE_VIOLENCE_1);
    recipe("rune/violence/2", 200, List.of(
        BlockGameItems.PRISTINE_STONE.copy().setAmount(4),
        BlockGameItems.ESSENCE_FIERY.copy().setAmount(12)),
        BlockGameItems.RUNE_VIOLENCE_2);
    recipe("rune/violence/3", 300, List.of(
        BlockGameItems.PRISTINE_STONE.copy().setAmount(6),
        BlockGameItems.ESSENCE_FIERY.copy().setAmount(18)),
        BlockGameItems.RUNE_VIOLENCE_3);
    recipe("rune/violence/4", 400, List.of(
        BlockGameItems.PRISTINE_STONE.copy().setAmount(8),
        BlockGameItems.ESSENCE_FIERY.copy().setAmount(24)),
        BlockGameItems.RUNE_VIOLENCE_4);
    recipe("rune/violence/5", 500, List.of(
        BlockGameItems.PRISTINE_STONE.copy().setAmount(10),
        BlockGameItems.ESSENCE_FIERY.copy().setAmount(30)),
        BlockGameItems.RUNE_VIOLENCE_5);
    
    recipe("rune/clarity/1", 100, List.of(
        BlockGameItems.PRISTINE_STONE.copy().setAmount(2),
        BlockGameItems.ESSENCE_FLEETING.copy().setAmount(6)),
        BlockGameItems.RUNE_CLARITY_1);
    recipe("rune/clarity/2", 200, List.of(
        BlockGameItems.PRISTINE_STONE.copy().setAmount(4),
        BlockGameItems.ESSENCE_FLEETING.copy().setAmount(12)),
        BlockGameItems.RUNE_CLARITY_2);
    recipe("rune/clarity/3", 300, List.of(
        BlockGameItems.PRISTINE_STONE.copy().setAmount(6),
        BlockGameItems.ESSENCE_FLEETING.copy().setAmount(18)),
        BlockGameItems.RUNE_CLARITY_3);
    recipe("rune/clarity/4", 400, List.of(
        BlockGameItems.PRISTINE_STONE.copy().setAmount(8),
        BlockGameItems.ESSENCE_FLEETING.copy().setAmount(24)),
        BlockGameItems.RUNE_CLARITY_4);
    recipe("rune/clarity/5", 500, List.of(
        BlockGameItems.PRISTINE_STONE.copy().setAmount(10),
        BlockGameItems.ESSENCE_FLEETING.copy().setAmount(30)),
        BlockGameItems.RUNE_CLARITY_5);

    recipe("rune/muddled/1", 100, List.of(
        BlockGameItems.PRISTINE_STONE.copy().setAmount(2),
        BlockGameItems.ESSENCE_DAMP.copy().setAmount(6)),
        BlockGameItems.RUNE_MUDDLED_1);
    recipe("rune/muddled/2", 200, List.of(
        BlockGameItems.PRISTINE_STONE.copy().setAmount(4),
        BlockGameItems.ESSENCE_DAMP.copy().setAmount(12)),
        BlockGameItems.RUNE_MUDDLED_2);
    recipe("rune/muddled/3", 300, List.of(
        BlockGameItems.PRISTINE_STONE.copy().setAmount(6),
        BlockGameItems.ESSENCE_DAMP.copy().setAmount(18)),
        BlockGameItems.RUNE_MUDDLED_3);
    recipe("rune/muddled/4", 400, List.of(
        BlockGameItems.PRISTINE_STONE.copy().setAmount(8),
        BlockGameItems.ESSENCE_DAMP.copy().setAmount(24)),
        BlockGameItems.RUNE_MUDDLED_4);
    recipe("rune/muddled/5", 500, List.of(
        BlockGameItems.PRISTINE_STONE.copy().setAmount(10),
        BlockGameItems.ESSENCE_DAMP.copy().setAmount(30)),
        BlockGameItems.RUNE_MUDDLED_5);

    // keys
    recipe("key/runestone/inert", 0, List.of(
        BlockGameItems.MAGISTEEL_INGOT,
        BlockGameItems.SALT.copy().setAmount(16)),
        BlockGameItems.RUNESTONE_INERT);
    recipe("key/incantation/father", 100, List.of(
        EmiStack.of(Items.PAPER),
        EmiStack.of(Items.GLOW_INK_SAC, 8)),
        BlockGameItems.INCANTATION_FIRST_FATHER);
    recipe("key/incantation/son", 100, List.of(
        EmiStack.of(Items.PAPER),
        EmiStack.of(Items.GLOW_INK_SAC, 8)),
        BlockGameItems.INCANTATION_FIRST_SON);
    recipe("key/runestone/father", 1000, List.of(
        BlockGameItems.RUNESTONE_INERT,
        BlockGameItems.INCANTATION_FIRST_FATHER),
        BlockGameItems.RUNESTONE_FIRST_FATHER);
    recipe("key/runestone/son", 1000, List.of(
        BlockGameItems.RUNESTONE_INERT,
        BlockGameItems.INCANTATION_FIRST_SON),
        BlockGameItems.RUNESTONE_FIRST_SON);
  }
}
