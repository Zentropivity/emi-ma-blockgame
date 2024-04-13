package zentropivity.emimablockgame.vendors;

import java.util.LinkedList;
import java.util.List;

import dev.emi.emi.api.EmiRegistry;
import dev.emi.emi.api.recipe.EmiRecipe;
import dev.emi.emi.api.recipe.EmiRecipeCategory;
import dev.emi.emi.api.render.EmiRenderable;
import dev.emi.emi.api.stack.EmiIngredient;
import dev.emi.emi.api.stack.EmiStack;
import net.minecraft.util.Identifier;
import zentropivity.emimablockgame.recipe.BlockGameRecipe;

public class AbstractVendor {
  public final EmiRecipeCategory category;

  protected final List<EmiRecipe> recipes = new LinkedList<EmiRecipe>();
  protected final String id;

  protected AbstractVendor(String ID, EmiRenderable categoryItem) {
    id = ID;
    category = new EmiRecipeCategory(new Identifier("emimablockgame", ID), categoryItem);
  }

  // list in, list out
  protected void recipe(String idBase, int gold, List<EmiIngredient> input, List<EmiStack> output) {
    final String recipeId = id + "/" + idBase;
    recipes.add(new BlockGameRecipe(category, recipeId, gold, input, output));
  }

  // single in, list out
  protected void recipe(String idBase, int gold, EmiIngredient input, List<EmiStack> output) {
    recipe(idBase, gold, List.of(input), output);
  }
  // list in, single out
  protected void recipe(String idBase, int gold, List<EmiIngredient> input, EmiStack output) {
    recipe(idBase, gold, input, List.of(output));
  }
  // single in, single out
  protected void recipe(String idBase, int gold, EmiIngredient input, EmiStack output) {
    recipe(idBase, gold, List.of(input), output.getEmiStacks());
  }

  // same output, different inputs (listed)
  protected void sameOutRecipes(String idBase, int fromIndex, int gold, List<List<EmiIngredient>> inputs,
      List<EmiStack> output) {
    for (int i = 0; i < inputs.size() - 1; ++i) {
      final String recipeId = idBase + "/" + (fromIndex + i);
      recipe(recipeId, gold, inputs.get(i), output);
    }
  }
  // same output, different inputs (single)
  protected void sameOutRecipes(String idBase, int fromIndex, int gold, List<EmiIngredient> inputs,
      EmiStack output) {
    int[] idx = { 0 };
    inputs.forEach(input -> {
      final int i = idx[0]++;
      final String recipeId = idBase + "/" + (fromIndex + i);
      recipe(recipeId, gold, inputs.get(i), output);
    });
  }

  // same input, different outputs (listed)
  protected void sameInRecipes(String idBase, int fromIndex, int gold, List<EmiIngredient> input,
      List<EmiStack> outputs) {
    for (int i = 0; i < outputs.size(); ++i) {
      final String recipeId = idBase + "/" + (fromIndex + i);
      recipe(recipeId, gold, input, outputs.get(i));
    }
  }
  // same input, different outputs (single)
  protected void sameInRecipes(String idBase, int fromIndex, int gold, EmiIngredient input,
      List<EmiStack> outputs) {
    for (int i = 0; i < outputs.size(); ++i) {
      final String recipeId = idBase + "/" + (fromIndex + i);
      recipe(recipeId, gold, input, outputs.get(i));
    }
  }

  public void init(EmiRegistry registry) {
    registry.addCategory(category);

    recipes.forEach((r) -> {
      registry.addRecipe(r);
    });
  }
}
