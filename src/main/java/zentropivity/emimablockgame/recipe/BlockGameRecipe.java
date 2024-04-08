package zentropivity.emimablockgame.recipe;

import java.util.List;

import org.jetbrains.annotations.Nullable;

import dev.emi.emi.api.recipe.EmiRecipe;
import dev.emi.emi.api.recipe.EmiRecipeCategory;
import dev.emi.emi.api.stack.EmiIngredient;
import dev.emi.emi.api.stack.EmiStack;
import dev.emi.emi.api.widget.WidgetHolder;
import net.minecraft.util.Identifier;
import zentropivity.emimablockgame.EmiMaBlockGamePlugin;

public class BlockGameRecipe implements EmiRecipe {

	@Override
	public EmiRecipeCategory getCategory() {
		return EmiMaBlockGamePlugin.RECIPES_GEORGE;
	}

	@Override
	public @Nullable Identifier getId() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getId'");
	}

	@Override
	public List<EmiIngredient> getInputs() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getInputs'");
	}

	@Override
	public List<EmiStack> getOutputs() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getOutputs'");
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
		//TODO
	}}
