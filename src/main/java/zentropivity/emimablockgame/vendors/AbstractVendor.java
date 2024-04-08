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

  protected AbstractVendor(String ID, EmiRenderable item) {
    id = ID;
    category = new EmiRecipeCategory(new Identifier("emimablockgame", ID), item);
  }

  protected void singleOutputRecipes(String idBase, int fromIndex, int gold, List<List<EmiIngredient>> lists, List<EmiStack> output) {
    for (int i = 0; i < lists.size() - 1; ++i) {
      recipes.add(new BlockGameRecipe(category, id + "/" + idBase + "/" + (fromIndex + i), gold, lists.get(i), output));
    }
  }

  public void init(EmiRegistry registry) {
    registry.addCategory(category);

    recipes.forEach((r) -> {
      registry.addRecipe(r);
    });
  }
}
