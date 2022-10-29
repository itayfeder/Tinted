package com.itayfeder.colors.data;

import com.itayfeder.colors.init.BlockInit;
import com.itayfeder.colors.init.ItemInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;

import java.util.function.Consumer;

public class ColorRecipeProvider extends RecipeProvider {
    public ColorRecipeProvider(DataGenerator p_125973_) {
        super(p_125973_);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> p_176532_) {
        coloredWoolFromWhiteWoolAndDye(p_176532_, BlockInit.CORAL_WOOL.get(), ItemInit.CORAL_DYE.get());
        carpet(p_176532_, BlockInit.CORAL_CARPET.get(), BlockInit.CORAL_WOOL.get());
        coloredCarpetFromWhiteCarpetAndDye(p_176532_, BlockInit.CORAL_CARPET.get(), ItemInit.CORAL_DYE.get());
        bedFromPlanksAndWool(p_176532_, ItemInit.CORAL_BED.get(), BlockInit.CORAL_WOOL.get());
        bedFromWhiteBedAndDye(p_176532_, ItemInit.CORAL_BED.get(), ItemInit.CORAL_DYE.get());
        banner(p_176532_, ItemInit.CORAL_BANNER.get(), BlockInit.CORAL_WOOL.get());
        stainedGlassFromGlassAndDye(p_176532_, BlockInit.CORAL_STAINED_GLASS.get(), ItemInit.CORAL_DYE.get());
        stainedGlassPaneFromStainedGlass(p_176532_, BlockInit.CORAL_STAINED_GLASS_PANE.get(), BlockInit.CORAL_STAINED_GLASS.get());
        stainedGlassPaneFromGlassPaneAndDye(p_176532_, BlockInit.CORAL_STAINED_GLASS_PANE.get(), ItemInit.CORAL_DYE.get());
        coloredTerracottaFromTerracottaAndDye(p_176532_, BlockInit.CORAL_TERRACOTTA.get(), ItemInit.CORAL_DYE.get());
        concretePowder(p_176532_, BlockInit.CORAL_CONCRETE_POWDER.get(), ItemInit.CORAL_DYE.get());
        candle(p_176532_, BlockInit.CORAL_CANDLE.get(), ItemInit.CORAL_DYE.get());

    }
}
