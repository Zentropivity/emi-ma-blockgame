package zentropivity.emimablockgame.recipe;

import java.util.LinkedList;
import java.util.List;

import org.jetbrains.annotations.Nullable;

import dev.emi.emi.api.recipe.EmiRecipe;
import dev.emi.emi.api.recipe.EmiRecipeCategory;
import dev.emi.emi.api.stack.EmiIngredient;
import dev.emi.emi.api.stack.EmiStack;
import dev.emi.emi.api.widget.WidgetHolder;
import net.minecraft.util.Identifier;
import zentropivity.emimablockgame.item.BlockGameItems;

public class BlockGameRecipe implements EmiRecipe {
  private final EmiRecipeCategory category;
  private final Identifier id;
  private final List<EmiIngredient> input;
  private final List<EmiStack> output;

  public BlockGameRecipe(EmiRecipeCategory category, String id, int gold, List<EmiIngredient> input,
      List<EmiStack> output) {
    this.category = category;
    this.id = new Identifier("emimablockgame", id);
    this.input = new LinkedList<EmiIngredient>(input);
    if (gold > 0) {
      this.input.add(BlockGameItems.GOLD_COIN.copy().setAmount(gold));
    }
    this.output = output;
  }

  // widget layout variables
  public static final int BORDER = 1;
  public static final int GAP = 1;
  // magic number, EMI likes it
  public static final int WIDTH = 134;

  // normal slots are 18x18
  public static final int INPUT_SIZE = 18;
  // large slots are 26x26
  public static final int OUTPUT_SIZE = 26;
  public static final int INPUT_COLUMNS = (WIDTH - OUTPUT_SIZE - 2 * BORDER) / (INPUT_SIZE + GAP);

  @Override
  public EmiRecipeCategory getCategory() {
    return this.category;
  }

  @Override
  public @Nullable Identifier getId() {
    return this.id;
  }

  @Override
  public List<EmiIngredient> getInputs() {
    return this.input;
  }

  @Override
  public List<EmiStack> getOutputs() {
    return this.output;
  }

  @Override
  public int getDisplayWidth() {
    return WIDTH;
  }

  @Override
  public int getDisplayHeight() {
    final int input_rows = (int) Math.ceil((double) input.size() / (double) INPUT_COLUMNS);
    return Math.max(
        input_rows * 18 + (input_rows - 1) * GAP + 2 * BORDER,
        output.size() * 26 + 2 * BORDER);
  }

  @Override
  public void addWidgets(WidgetHolder widgets) {
    // add inputs
    for (int i = 0; i < input.size(); i++) {
      int x = i % INPUT_COLUMNS;
      int y = i / INPUT_COLUMNS;
      widgets.addSlot(input.get(i), BORDER + x * (INPUT_SIZE + GAP), BORDER + y * (INPUT_SIZE + GAP));
    }

    // add outputs
    if (output.size() == 1) {
      widgets.addSlot(output.get(0), 134 - BORDER - OUTPUT_SIZE, BORDER).large(true).recipeContext(this);
    } else {
      for (int i = 0; i < output.size(); i++) {
        widgets.addSlot(output.get(i), 134 - BORDER - OUTPUT_SIZE, BORDER + (OUTPUT_SIZE + GAP) * i)
            .recipeContext(this);
      }
    }
  }
}
