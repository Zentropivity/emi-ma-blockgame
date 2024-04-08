package zentropivity.emimablockgame.vendors;

import java.util.List;

import dev.emi.emi.api.stack.EmiIngredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import zentropivity.emimablockgame.item.BlockGameItems;
import zentropivity.emimablockgame.recipe.BlockGameRecipe;

public class George extends AbstractVendor {
  public George() {
    super("george", BlockGameItems.BRASS_PICKAXE);

    singleOutputRecipes("repair/normal/common", 0, 5, List.of(
      List.of(EmiIngredient.of(Ingredient.ofStacks(new ItemStack(Items.ANDESITE).copyWithCount(64)))),
      List.of(EmiIngredient.of(Ingredient.ofStacks(new ItemStack(Items.SMOOTH_BASALT).copyWithCount(64)))),
      List.of(EmiIngredient.of(Ingredient.ofStacks(new ItemStack(Items.CALCITE).copyWithCount(64)))),
      List.of(EmiIngredient.of(Ingredient.ofStacks(new ItemStack(Items.DRIPSTONE_BLOCK).copyWithCount(64)))),
      List.of(EmiIngredient.of(Ingredient.ofStacks(new ItemStack(Items.DIORITE).copyWithCount(64)))),
      List.of(EmiIngredient.of(Ingredient.ofStacks(new ItemStack(Items.COBBLED_DEEPSLATE).copyWithCount(64)))),
      List.of(EmiIngredient.of(Ingredient.ofStacks(new ItemStack(Items.TUFF).copyWithCount(64)))),
      List.of(EmiIngredient.of(Ingredient.ofStacks(new ItemStack(Items.GRANITE).copyWithCount(64)))),
      List.of(EmiIngredient.of(Ingredient.ofStacks(BlockGameItems.PRISTINE_STONE.getItemStack().copyWithCount(16)))),
      List.of(EmiIngredient.of(Ingredient.ofStacks(new ItemStack(Items.SMOOTH_BASALT).copyWithCount(8))))
    ), List.of(BlockGameItems.REPAIR_POWDER_COMMON));

    singleOutputRecipes("repair/arcane/common", 0, 5, List.of(
      List.of(EmiIngredient.of(Ingredient.ofStacks(new ItemStack(Items.LAPIS_LAZULI).copyWithCount(8)))),
      List.of(EmiIngredient.of(Ingredient.ofStacks(new ItemStack(Items.AMETHYST_SHARD).copyWithCount(8))))
    ), List.of(BlockGameItems.REPAIR_POWDER_ARCANE_COMMON));

    recipes.add(new BlockGameRecipe(category, "repair/arcane/uncommon/0", 10,
        List.of(
            EmiIngredient.of(Ingredient.ofStacks(new ItemStack(Items.AMETHYST_BLOCK).copyWithCount(16)))),
        List.of(BlockGameItems.REPAIR_POWDER_ARCANE_UNCOMMON)));
    recipes.add(new BlockGameRecipe(category, "mining/xptome", 50,
        List.of(
            EmiIngredient.of(Ingredient.ofStacks(BlockGameItems.EARTHEN_HEART.getItemStack().copy()))),
        List.of(BlockGameItems.SECRETS_MINING)));
    recipes.add(new BlockGameRecipe(category, "fragile/pickaxe", 1000,
        List.of(
            EmiIngredient.of(Ingredient.ofStacks(BlockGameItems.SKYSTEEL_PICKAXE.getItemStack().copy())),
            EmiIngredient.of(Ingredient.ofStacks(BlockGameItems.BOLT_SILK.getItemStack().copyWithCount(9))),
            EmiIngredient.of(Ingredient.ofStacks(BlockGameItems.PRISTINE_WOOD.getItemStack().copyWithCount(2)))
        ),
        List.of(BlockGameItems.FRAGILE_PICKAXE)));
  }
}
