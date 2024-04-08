package zentropivity.emimablockgame.recipe;

import java.util.LinkedList;
import java.util.List;

import org.jetbrains.annotations.Nullable;

import dev.emi.emi.api.recipe.EmiRecipe;
import dev.emi.emi.api.recipe.EmiRecipeCategory;
import dev.emi.emi.api.stack.EmiIngredient;
import dev.emi.emi.api.stack.EmiStack;
import dev.emi.emi.api.widget.WidgetHolder;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Identifier;
import zentropivity.emimablockgame.item.BlockGameItems;

public class BlockGameRecipe implements EmiRecipe {
  private final EmiRecipeCategory category;
  private final Identifier id;
  private final List<EmiIngredient> input;
  private final List<EmiStack> output;

  public BlockGameRecipe(EmiRecipeCategory category, String id, int gold, List<EmiIngredient> input, List<EmiStack> output) {
    this.category = category;
    this.id = new Identifier("emimablockgame", id);
    this.input = new LinkedList<EmiIngredient>(input);
    this.input.add(EmiIngredient.of(Ingredient.ofStacks(BlockGameItems.GOLD_COIN.getItemStack().copyWithCount(gold))));
    this.output = output;
  }

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
    return 134;
  }

  @Override
  public int getDisplayHeight() {
    return 64;
  }

  @Override
  public void addWidgets(WidgetHolder widgets) {
    // 4 border
    final int border = 1;
    final int gap = 1;

    // normally 18x18 slots, large is 26x26
    int size = 18;

    for (int i = 0; i < input.size(); i++) {
      int x = i % 5;
      int y = i / 5;
      widgets.addSlot(input.get(i), border + x * (size + gap), border + y * (size + gap));
    }

    if (output.size() == 1) {
      size = 26;
      widgets.addSlot(output.get(0), 134 - border - size, border).large(true);
    } else {
      //NOTE this fails at > 3 outputs
      for (int i = 0; i < output.size(); i++) {
        widgets.addSlot(output.get(i), 134 - border - size, border + (size + gap) * i);
      }
    }
  }
}
