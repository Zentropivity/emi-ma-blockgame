package zentropivity.emimablockgame.vendors;

import java.util.LinkedList;
import java.util.List;

import dev.emi.emi.api.EmiRegistry;
import dev.emi.emi.api.recipe.EmiRecipe;
import dev.emi.emi.api.recipe.EmiRecipeCategory;
import dev.emi.emi.api.render.EmiRenderable;
import dev.emi.emi.api.stack.EmiIngredient;
import dev.emi.emi.api.stack.EmiStack;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
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

  protected void recipe(String idBase, int gold, List<EmiIngredient> input, List<EmiStack> output) {
    final String recipeId = id + "/" + idBase;
    recipes.add(new BlockGameRecipe(category, recipeId, gold, input, output));
  }

  protected void recipe(String idBase, int gold, EmiIngredient input, List<EmiStack> output) {
    recipe(idBase, gold, List.of(input), output);
  }
  protected void recipe(String idBase, int gold, List<EmiIngredient> input, EmiStack output) {
    recipe(idBase, gold, input, List.of(output));
  }
  protected void recipe(String idBase, int gold, EmiIngredient input, EmiStack output) {
    recipe(idBase, gold, List.of(input), output.getEmiStacks());
  }

  // itemstacks from vanilla for convenience
  // NOTE this is the same as first for some reason...
  // protected void recipe(String idBase, int gold, List<ItemStack> input,
  // List<EmiStack> output) {}

  protected void recipe(String idBase, int gold, ItemStack input, EmiStack output) {
    recipe(idBase, gold, EmiStack.of(input), output);
  }
  protected void recipe(String idBase, int gold, Item input, EmiStack output) {
    recipe(idBase, gold, EmiStack.of(input), output);
  }

  protected void recipe(String idBase, int gold, ItemStack input, List<EmiStack> output) {
    recipe(idBase, gold, EmiStack.of(input), output);
  }

  protected void sameOutRecipes(String idBase, int fromIndex, int gold, List<List<EmiIngredient>> lists,
      List<EmiStack> output) {
    for (int i = 0; i < lists.size() - 1; ++i) {
      final String recipeId = idBase + "/" + (fromIndex + i);
      recipe(recipeId, gold, lists.get(i), output);
    }
  }

  // NOTE same as above because java is dumb
  // protected void sameOutRecipes(String idBase, int fromIndex, int gold,
  // List<EmiIngredient> input, List<EmiStack> output) {}

  // single input
  protected void sameOutRecipes(String idBase, int fromIndex, int gold, List<EmiIngredient> input,
      EmiStack output) {
    for (int i = 0; i < input.size() - 1; ++i) {
      // final String recipeId = id + "/" + idBase + "/" + (fromIndex + i);
      // recipes.add(new BlockGameRecipe(category, recipeId, gold,
      // List.of(input.get(i)), output.getEmiStacks()));
      final String recipeId = idBase + "/" + (fromIndex + i);
      recipe(recipeId, gold, input.get(i), output);
    }
  }

  public void init(EmiRegistry registry) {
    registry.addCategory(category);

    recipes.forEach((r) -> {
      registry.addRecipe(r);
    });
  }
}
