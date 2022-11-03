package com.itayfeder.tinted.data;

import com.itayfeder.tinted.init.BlockInit;
import com.itayfeder.tinted.init.ItemInit;
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

        coloredWoolFromWhiteWoolAndDye(p_176532_, BlockInit.BEIGE_WOOL.get(), ItemInit.BEIGE_DYE.get());
        carpet(p_176532_, BlockInit.BEIGE_CARPET.get(), BlockInit.BEIGE_WOOL.get());
        coloredCarpetFromWhiteCarpetAndDye(p_176532_, BlockInit.BEIGE_CARPET.get(), ItemInit.BEIGE_DYE.get());
        bedFromPlanksAndWool(p_176532_, ItemInit.BEIGE_BED.get(), BlockInit.BEIGE_WOOL.get());
        bedFromWhiteBedAndDye(p_176532_, ItemInit.BEIGE_BED.get(), ItemInit.BEIGE_DYE.get());
        banner(p_176532_, ItemInit.BEIGE_BANNER.get(), BlockInit.BEIGE_WOOL.get());
        stainedGlassFromGlassAndDye(p_176532_, BlockInit.BEIGE_STAINED_GLASS.get(), ItemInit.BEIGE_DYE.get());
        stainedGlassPaneFromStainedGlass(p_176532_, BlockInit.BEIGE_STAINED_GLASS_PANE.get(), BlockInit.BEIGE_STAINED_GLASS.get());
        stainedGlassPaneFromGlassPaneAndDye(p_176532_, BlockInit.BEIGE_STAINED_GLASS_PANE.get(), ItemInit.BEIGE_DYE.get());
        coloredTerracottaFromTerracottaAndDye(p_176532_, BlockInit.BEIGE_TERRACOTTA.get(), ItemInit.BEIGE_DYE.get());
        concretePowder(p_176532_, BlockInit.BEIGE_CONCRETE_POWDER.get(), ItemInit.BEIGE_DYE.get());
        candle(p_176532_, BlockInit.BEIGE_CANDLE.get(), ItemInit.BEIGE_DYE.get());

        coloredWoolFromWhiteWoolAndDye(p_176532_, BlockInit.OLIVE_WOOL.get(), ItemInit.OLIVE_DYE.get());
        carpet(p_176532_, BlockInit.OLIVE_CARPET.get(), BlockInit.OLIVE_WOOL.get());
        coloredCarpetFromWhiteCarpetAndDye(p_176532_, BlockInit.OLIVE_CARPET.get(), ItemInit.OLIVE_DYE.get());
        bedFromPlanksAndWool(p_176532_, ItemInit.OLIVE_BED.get(), BlockInit.OLIVE_WOOL.get());
        bedFromWhiteBedAndDye(p_176532_, ItemInit.OLIVE_BED.get(), ItemInit.OLIVE_DYE.get());
        banner(p_176532_, ItemInit.OLIVE_BANNER.get(), BlockInit.OLIVE_WOOL.get());
        stainedGlassFromGlassAndDye(p_176532_, BlockInit.OLIVE_STAINED_GLASS.get(), ItemInit.OLIVE_DYE.get());
        stainedGlassPaneFromStainedGlass(p_176532_, BlockInit.OLIVE_STAINED_GLASS_PANE.get(), BlockInit.OLIVE_STAINED_GLASS.get());
        stainedGlassPaneFromGlassPaneAndDye(p_176532_, BlockInit.OLIVE_STAINED_GLASS_PANE.get(), ItemInit.OLIVE_DYE.get());
        coloredTerracottaFromTerracottaAndDye(p_176532_, BlockInit.OLIVE_TERRACOTTA.get(), ItemInit.OLIVE_DYE.get());
        concretePowder(p_176532_, BlockInit.OLIVE_CONCRETE_POWDER.get(), ItemInit.OLIVE_DYE.get());
        candle(p_176532_, BlockInit.OLIVE_CANDLE.get(), ItemInit.OLIVE_DYE.get());

        coloredWoolFromWhiteWoolAndDye(p_176532_, BlockInit.TURQUOISE_WOOL.get(), ItemInit.TURQUOISE_DYE.get());
        carpet(p_176532_, BlockInit.TURQUOISE_CARPET.get(), BlockInit.TURQUOISE_WOOL.get());
        coloredCarpetFromWhiteCarpetAndDye(p_176532_, BlockInit.TURQUOISE_CARPET.get(), ItemInit.TURQUOISE_DYE.get());
        bedFromPlanksAndWool(p_176532_, ItemInit.TURQUOISE_BED.get(), BlockInit.TURQUOISE_WOOL.get());
        bedFromWhiteBedAndDye(p_176532_, ItemInit.TURQUOISE_BED.get(), ItemInit.TURQUOISE_DYE.get());
        banner(p_176532_, ItemInit.TURQUOISE_BANNER.get(), BlockInit.TURQUOISE_WOOL.get());
        stainedGlassFromGlassAndDye(p_176532_, BlockInit.TURQUOISE_STAINED_GLASS.get(), ItemInit.TURQUOISE_DYE.get());
        stainedGlassPaneFromStainedGlass(p_176532_, BlockInit.TURQUOISE_STAINED_GLASS_PANE.get(), BlockInit.TURQUOISE_STAINED_GLASS.get());
        stainedGlassPaneFromGlassPaneAndDye(p_176532_, BlockInit.TURQUOISE_STAINED_GLASS_PANE.get(), ItemInit.TURQUOISE_DYE.get());
        coloredTerracottaFromTerracottaAndDye(p_176532_, BlockInit.TURQUOISE_TERRACOTTA.get(), ItemInit.TURQUOISE_DYE.get());
        concretePowder(p_176532_, BlockInit.TURQUOISE_CONCRETE_POWDER.get(), ItemInit.TURQUOISE_DYE.get());
        candle(p_176532_, BlockInit.TURQUOISE_CANDLE.get(), ItemInit.TURQUOISE_DYE.get());

        coloredWoolFromWhiteWoolAndDye(p_176532_, BlockInit.AMBER_WOOL.get(), ItemInit.AMBER_DYE.get());
        carpet(p_176532_, BlockInit.AMBER_CARPET.get(), BlockInit.AMBER_WOOL.get());
        coloredCarpetFromWhiteCarpetAndDye(p_176532_, BlockInit.AMBER_CARPET.get(), ItemInit.AMBER_DYE.get());
        bedFromPlanksAndWool(p_176532_, ItemInit.AMBER_BED.get(), BlockInit.AMBER_WOOL.get());
        bedFromWhiteBedAndDye(p_176532_, ItemInit.AMBER_BED.get(), ItemInit.AMBER_DYE.get());
        banner(p_176532_, ItemInit.AMBER_BANNER.get(), BlockInit.AMBER_WOOL.get());
        stainedGlassFromGlassAndDye(p_176532_, BlockInit.AMBER_STAINED_GLASS.get(), ItemInit.AMBER_DYE.get());
        stainedGlassPaneFromStainedGlass(p_176532_, BlockInit.AMBER_STAINED_GLASS_PANE.get(), BlockInit.AMBER_STAINED_GLASS.get());
        stainedGlassPaneFromGlassPaneAndDye(p_176532_, BlockInit.AMBER_STAINED_GLASS_PANE.get(), ItemInit.AMBER_DYE.get());
        coloredTerracottaFromTerracottaAndDye(p_176532_, BlockInit.AMBER_TERRACOTTA.get(), ItemInit.AMBER_DYE.get());
        concretePowder(p_176532_, BlockInit.AMBER_CONCRETE_POWDER.get(), ItemInit.AMBER_DYE.get());
        candle(p_176532_, BlockInit.AMBER_CANDLE.get(), ItemInit.AMBER_DYE.get());
    }
}
