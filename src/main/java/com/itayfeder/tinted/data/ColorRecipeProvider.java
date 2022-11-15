package com.itayfeder.tinted.data;

import com.itayfeder.tinted.init.BlockInit;
import com.itayfeder.tinted.init.ItemInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.Item;
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
        ShapelessRecipeBuilder.shapeless(ItemInit.CORAL_DYE.get(), 2).requires(Items.ORANGE_DYE).requires(Items.PINK_DYE).unlockedBy("has_orange_dye", has(Items.ORANGE_DYE)).unlockedBy("has_pink_dye", has(Items.PINK_DYE)).save(p_176532_);
        ShapelessRecipeBuilder.shapeless(ItemInit.BEIGE_DYE.get(), 3).requires(Items.BROWN_DYE).requires(Items.WHITE_DYE, 2).unlockedBy("has_white_dye", has(Items.WHITE_DYE)).unlockedBy("has_brown_dye", has(Items.BROWN_DYE)).save(p_176532_);
        ShapelessRecipeBuilder.shapeless(ItemInit.OLIVE_DYE.get(), 2).requires(Items.GREEN_DYE).requires(Items.LIME_DYE).unlockedBy("has_green_dye", has(Items.GREEN_DYE)).unlockedBy("has_lime_dye", has(Items.LIME_DYE)).save(p_176532_);
        oneToOneConversionRecipe(p_176532_, ItemInit.TURQUOISE_DYE.get(), Blocks.WARPED_FUNGUS, "turquoise_dye");
        ShapelessRecipeBuilder.shapeless(ItemInit.AMBER_DYE.get(), 2).requires(Items.ORANGE_DYE).requires(Items.YELLOW_DYE).unlockedBy("has_orange_dye", has(Items.ORANGE_DYE)).unlockedBy("has_yellow_dye", has(Items.YELLOW_DYE)).save(p_176532_);
        ShapelessRecipeBuilder.shapeless(ItemInit.BUBBLEGUM_DYE.get(), 2).requires(Items.MAGENTA_DYE).requires(Items.RED_DYE).unlockedBy("has_magenta_dye", has(Items.MAGENTA_DYE)).unlockedBy("has_red_dye", has(Items.RED_DYE)).save(p_176532_);
        ShapelessRecipeBuilder.shapeless(ItemInit.BORDEAUX_DYE.get(), 2).requires(Items.BLACK_DYE).requires(Items.RED_DYE).unlockedBy("has_black_dye", has(Items.BLACK_DYE)).unlockedBy("has_red_dye", has(Items.RED_DYE)).save(p_176532_);
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.ENDER_PEARL.asItem()), ItemInit.ENDER_DYE.get(), 1.0F, 200).unlockedBy("has_ender_pearl", has(Items.ENDER_PEARL)).save(p_176532_);
        ShapelessRecipeBuilder.shapeless(ItemInit.MINT_DYE.get(), 2).requires(Items.WHITE_DYE).requires(Items.LIME_DYE).unlockedBy("has_white_dye", has(Items.WHITE_DYE)).unlockedBy("has_lime_dye", has(Items.LIME_DYE)).save(p_176532_);
        ShapelessRecipeBuilder.shapeless(ItemInit.INDIGO_DYE.get(), 2).requires(Items.BLACK_DYE).requires(Items.BLUE_DYE).unlockedBy("has_black_dye", has(Items.BLACK_DYE)).unlockedBy("has_blue_dye", has(Items.BLUE_DYE)).save(p_176532_);
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.OCHRE_FROGLIGHT.asItem()), ItemInit.OCHRE_DYE.get(), 1.0F, 200).unlockedBy("has_ochre_froglight", has(Items.OCHRE_FROGLIGHT)).save(p_176532_);
        ShapelessRecipeBuilder.shapeless(ItemInit.LAVENDER_DYE.get(), 2).requires(Items.WHITE_DYE).requires(Items.PINK_DYE).unlockedBy("has_white_dye", has(Items.WHITE_DYE)).unlockedBy("has_pink_dye", has(Items.PINK_DYE)).save(p_176532_);

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
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockInit.CORAL_TERRACOTTA.get()), BlockInit.CORAL_GLAZED_TERRACOTTA.get().asItem(), 0.1F, 200).unlockedBy("has_" + BlockInit.CORAL_TERRACOTTA.getId().getPath(), has(BlockInit.CORAL_TERRACOTTA.get())).save(p_176532_);

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
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockInit.BEIGE_TERRACOTTA.get()), BlockInit.BEIGE_GLAZED_TERRACOTTA.get().asItem(), 0.1F, 200).unlockedBy("has_" + BlockInit.BEIGE_TERRACOTTA.getId().getPath(), has(BlockInit.BEIGE_TERRACOTTA.get())).save(p_176532_);

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
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockInit.OLIVE_TERRACOTTA.get()), BlockInit.OLIVE_GLAZED_TERRACOTTA.get().asItem(), 0.1F, 200).unlockedBy("has_" + BlockInit.OLIVE_TERRACOTTA.getId().getPath(), has(BlockInit.OLIVE_TERRACOTTA.get())).save(p_176532_);

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
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockInit.TURQUOISE_TERRACOTTA.get()), BlockInit.TURQUOISE_GLAZED_TERRACOTTA.get().asItem(), 0.1F, 200).unlockedBy("has_" + BlockInit.TURQUOISE_TERRACOTTA.getId().getPath(), has(BlockInit.TURQUOISE_TERRACOTTA.get())).save(p_176532_);

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
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockInit.AMBER_TERRACOTTA.get()), BlockInit.AMBER_GLAZED_TERRACOTTA.get().asItem(), 0.1F, 200).unlockedBy("has_" + BlockInit.AMBER_TERRACOTTA.getId().getPath(), has(BlockInit.AMBER_TERRACOTTA.get())).save(p_176532_);

        coloredWoolFromWhiteWoolAndDye(p_176532_, BlockInit.BUBBLEGUM_WOOL.get(), ItemInit.BUBBLEGUM_DYE.get());
        carpet(p_176532_, BlockInit.BUBBLEGUM_CARPET.get(), BlockInit.BUBBLEGUM_WOOL.get());
        coloredCarpetFromWhiteCarpetAndDye(p_176532_, BlockInit.BUBBLEGUM_CARPET.get(), ItemInit.BUBBLEGUM_DYE.get());
        bedFromPlanksAndWool(p_176532_, ItemInit.BUBBLEGUM_BED.get(), BlockInit.BUBBLEGUM_WOOL.get());
        bedFromWhiteBedAndDye(p_176532_, ItemInit.BUBBLEGUM_BED.get(), ItemInit.BUBBLEGUM_DYE.get());
        banner(p_176532_, ItemInit.BUBBLEGUM_BANNER.get(), BlockInit.BUBBLEGUM_WOOL.get());
        stainedGlassFromGlassAndDye(p_176532_, BlockInit.BUBBLEGUM_STAINED_GLASS.get(), ItemInit.BUBBLEGUM_DYE.get());
        stainedGlassPaneFromStainedGlass(p_176532_, BlockInit.BUBBLEGUM_STAINED_GLASS_PANE.get(), BlockInit.BUBBLEGUM_STAINED_GLASS.get());
        stainedGlassPaneFromGlassPaneAndDye(p_176532_, BlockInit.BUBBLEGUM_STAINED_GLASS_PANE.get(), ItemInit.BUBBLEGUM_DYE.get());
        coloredTerracottaFromTerracottaAndDye(p_176532_, BlockInit.BUBBLEGUM_TERRACOTTA.get(), ItemInit.BUBBLEGUM_DYE.get());
        concretePowder(p_176532_, BlockInit.BUBBLEGUM_CONCRETE_POWDER.get(), ItemInit.BUBBLEGUM_DYE.get());
        candle(p_176532_, BlockInit.BUBBLEGUM_CANDLE.get(), ItemInit.BUBBLEGUM_DYE.get());
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockInit.BUBBLEGUM_TERRACOTTA.get()), BlockInit.BUBBLEGUM_GLAZED_TERRACOTTA.get().asItem(), 0.1F, 200).unlockedBy("has_" + BlockInit.BUBBLEGUM_TERRACOTTA.getId().getPath(), has(BlockInit.BUBBLEGUM_TERRACOTTA.get())).save(p_176532_);

        coloredWoolFromWhiteWoolAndDye(p_176532_, BlockInit.BORDEAUX_WOOL.get(), ItemInit.BORDEAUX_DYE.get());
        carpet(p_176532_, BlockInit.BORDEAUX_CARPET.get(), BlockInit.BORDEAUX_WOOL.get());
        coloredCarpetFromWhiteCarpetAndDye(p_176532_, BlockInit.BORDEAUX_CARPET.get(), ItemInit.BORDEAUX_DYE.get());
        bedFromPlanksAndWool(p_176532_, ItemInit.BORDEAUX_BED.get(), BlockInit.BORDEAUX_WOOL.get());
        bedFromWhiteBedAndDye(p_176532_, ItemInit.BORDEAUX_BED.get(), ItemInit.BORDEAUX_DYE.get());
        banner(p_176532_, ItemInit.BORDEAUX_BANNER.get(), BlockInit.BORDEAUX_WOOL.get());
        stainedGlassFromGlassAndDye(p_176532_, BlockInit.BORDEAUX_STAINED_GLASS.get(), ItemInit.BORDEAUX_DYE.get());
        stainedGlassPaneFromStainedGlass(p_176532_, BlockInit.BORDEAUX_STAINED_GLASS_PANE.get(), BlockInit.BORDEAUX_STAINED_GLASS.get());
        stainedGlassPaneFromGlassPaneAndDye(p_176532_, BlockInit.BORDEAUX_STAINED_GLASS_PANE.get(), ItemInit.BORDEAUX_DYE.get());
        coloredTerracottaFromTerracottaAndDye(p_176532_, BlockInit.BORDEAUX_TERRACOTTA.get(), ItemInit.BORDEAUX_DYE.get());
        concretePowder(p_176532_, BlockInit.BORDEAUX_CONCRETE_POWDER.get(), ItemInit.BORDEAUX_DYE.get());
        candle(p_176532_, BlockInit.BORDEAUX_CANDLE.get(), ItemInit.BORDEAUX_DYE.get());
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockInit.BORDEAUX_TERRACOTTA.get()), BlockInit.BORDEAUX_GLAZED_TERRACOTTA.get().asItem(), 0.1F, 200).unlockedBy("has_" + BlockInit.BORDEAUX_TERRACOTTA.getId().getPath(), has(BlockInit.BORDEAUX_TERRACOTTA.get())).save(p_176532_);

        coloredWoolFromWhiteWoolAndDye(p_176532_, BlockInit.ENDER_WOOL.get(), ItemInit.ENDER_DYE.get());
        carpet(p_176532_, BlockInit.ENDER_CARPET.get(), BlockInit.ENDER_WOOL.get());
        coloredCarpetFromWhiteCarpetAndDye(p_176532_, BlockInit.ENDER_CARPET.get(), ItemInit.ENDER_DYE.get());
        bedFromPlanksAndWool(p_176532_, ItemInit.ENDER_BED.get(), BlockInit.ENDER_WOOL.get());
        bedFromWhiteBedAndDye(p_176532_, ItemInit.ENDER_BED.get(), ItemInit.ENDER_DYE.get());
        banner(p_176532_, ItemInit.ENDER_BANNER.get(), BlockInit.ENDER_WOOL.get());
        stainedGlassFromGlassAndDye(p_176532_, BlockInit.ENDER_STAINED_GLASS.get(), ItemInit.ENDER_DYE.get());
        stainedGlassPaneFromStainedGlass(p_176532_, BlockInit.ENDER_STAINED_GLASS_PANE.get(), BlockInit.ENDER_STAINED_GLASS.get());
        stainedGlassPaneFromGlassPaneAndDye(p_176532_, BlockInit.ENDER_STAINED_GLASS_PANE.get(), ItemInit.ENDER_DYE.get());
        coloredTerracottaFromTerracottaAndDye(p_176532_, BlockInit.ENDER_TERRACOTTA.get(), ItemInit.ENDER_DYE.get());
        concretePowder(p_176532_, BlockInit.ENDER_CONCRETE_POWDER.get(), ItemInit.ENDER_DYE.get());
        candle(p_176532_, BlockInit.ENDER_CANDLE.get(), ItemInit.ENDER_DYE.get());
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockInit.ENDER_TERRACOTTA.get()), BlockInit.ENDER_GLAZED_TERRACOTTA.get().asItem(), 0.1F, 200).unlockedBy("has_" + BlockInit.ENDER_TERRACOTTA.getId().getPath(), has(BlockInit.ENDER_TERRACOTTA.get())).save(p_176532_);

        coloredWoolFromWhiteWoolAndDye(p_176532_, BlockInit.MINT_WOOL.get(), ItemInit.MINT_DYE.get());
        carpet(p_176532_, BlockInit.MINT_CARPET.get(), BlockInit.MINT_WOOL.get());
        coloredCarpetFromWhiteCarpetAndDye(p_176532_, BlockInit.MINT_CARPET.get(), ItemInit.MINT_DYE.get());
        bedFromPlanksAndWool(p_176532_, ItemInit.MINT_BED.get(), BlockInit.MINT_WOOL.get());
        bedFromWhiteBedAndDye(p_176532_, ItemInit.MINT_BED.get(), ItemInit.MINT_DYE.get());
        banner(p_176532_, ItemInit.MINT_BANNER.get(), BlockInit.MINT_WOOL.get());
        stainedGlassFromGlassAndDye(p_176532_, BlockInit.MINT_STAINED_GLASS.get(), ItemInit.MINT_DYE.get());
        stainedGlassPaneFromStainedGlass(p_176532_, BlockInit.MINT_STAINED_GLASS_PANE.get(), BlockInit.MINT_STAINED_GLASS.get());
        stainedGlassPaneFromGlassPaneAndDye(p_176532_, BlockInit.MINT_STAINED_GLASS_PANE.get(), ItemInit.MINT_DYE.get());
        coloredTerracottaFromTerracottaAndDye(p_176532_, BlockInit.MINT_TERRACOTTA.get(), ItemInit.MINT_DYE.get());
        concretePowder(p_176532_, BlockInit.MINT_CONCRETE_POWDER.get(), ItemInit.MINT_DYE.get());
        candle(p_176532_, BlockInit.MINT_CANDLE.get(), ItemInit.MINT_DYE.get());
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockInit.MINT_TERRACOTTA.get()), BlockInit.MINT_GLAZED_TERRACOTTA.get().asItem(), 0.1F, 200).unlockedBy("has_" + BlockInit.MINT_TERRACOTTA.getId().getPath(), has(BlockInit.MINT_TERRACOTTA.get())).save(p_176532_);

        coloredWoolFromWhiteWoolAndDye(p_176532_, BlockInit.INDIGO_WOOL.get(), ItemInit.INDIGO_DYE.get());
        carpet(p_176532_, BlockInit.INDIGO_CARPET.get(), BlockInit.INDIGO_WOOL.get());
        coloredCarpetFromWhiteCarpetAndDye(p_176532_, BlockInit.INDIGO_CARPET.get(), ItemInit.INDIGO_DYE.get());
        bedFromPlanksAndWool(p_176532_, ItemInit.INDIGO_BED.get(), BlockInit.INDIGO_WOOL.get());
        bedFromWhiteBedAndDye(p_176532_, ItemInit.INDIGO_BED.get(), ItemInit.INDIGO_DYE.get());
        banner(p_176532_, ItemInit.INDIGO_BANNER.get(), BlockInit.INDIGO_WOOL.get());
        stainedGlassFromGlassAndDye(p_176532_, BlockInit.INDIGO_STAINED_GLASS.get(), ItemInit.INDIGO_DYE.get());
        stainedGlassPaneFromStainedGlass(p_176532_, BlockInit.INDIGO_STAINED_GLASS_PANE.get(), BlockInit.INDIGO_STAINED_GLASS.get());
        stainedGlassPaneFromGlassPaneAndDye(p_176532_, BlockInit.INDIGO_STAINED_GLASS_PANE.get(), ItemInit.INDIGO_DYE.get());
        coloredTerracottaFromTerracottaAndDye(p_176532_, BlockInit.INDIGO_TERRACOTTA.get(), ItemInit.INDIGO_DYE.get());
        concretePowder(p_176532_, BlockInit.INDIGO_CONCRETE_POWDER.get(), ItemInit.INDIGO_DYE.get());
        candle(p_176532_, BlockInit.INDIGO_CANDLE.get(), ItemInit.INDIGO_DYE.get());
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockInit.INDIGO_TERRACOTTA.get()), BlockInit.INDIGO_GLAZED_TERRACOTTA.get().asItem(), 0.1F, 200).unlockedBy("has_" + BlockInit.INDIGO_TERRACOTTA.getId().getPath(), has(BlockInit.INDIGO_TERRACOTTA.get())).save(p_176532_);

        coloredWoolFromWhiteWoolAndDye(p_176532_, BlockInit.OCHRE_WOOL.get(), ItemInit.OCHRE_DYE.get());
        carpet(p_176532_, BlockInit.OCHRE_CARPET.get(), BlockInit.OCHRE_WOOL.get());
        coloredCarpetFromWhiteCarpetAndDye(p_176532_, BlockInit.OCHRE_CARPET.get(), ItemInit.OCHRE_DYE.get());
        bedFromPlanksAndWool(p_176532_, ItemInit.OCHRE_BED.get(), BlockInit.OCHRE_WOOL.get());
        bedFromWhiteBedAndDye(p_176532_, ItemInit.OCHRE_BED.get(), ItemInit.OCHRE_DYE.get());
        banner(p_176532_, ItemInit.OCHRE_BANNER.get(), BlockInit.OCHRE_WOOL.get());
        stainedGlassFromGlassAndDye(p_176532_, BlockInit.OCHRE_STAINED_GLASS.get(), ItemInit.OCHRE_DYE.get());
        stainedGlassPaneFromStainedGlass(p_176532_, BlockInit.OCHRE_STAINED_GLASS_PANE.get(), BlockInit.OCHRE_STAINED_GLASS.get());
        stainedGlassPaneFromGlassPaneAndDye(p_176532_, BlockInit.OCHRE_STAINED_GLASS_PANE.get(), ItemInit.OCHRE_DYE.get());
        coloredTerracottaFromTerracottaAndDye(p_176532_, BlockInit.OCHRE_TERRACOTTA.get(), ItemInit.OCHRE_DYE.get());
        concretePowder(p_176532_, BlockInit.OCHRE_CONCRETE_POWDER.get(), ItemInit.OCHRE_DYE.get());
        candle(p_176532_, BlockInit.OCHRE_CANDLE.get(), ItemInit.OCHRE_DYE.get());
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockInit.OCHRE_TERRACOTTA.get()), BlockInit.OCHRE_GLAZED_TERRACOTTA.get().asItem(), 0.1F, 200).unlockedBy("has_" + BlockInit.OCHRE_TERRACOTTA.getId().getPath(), has(BlockInit.OCHRE_TERRACOTTA.get())).save(p_176532_);

        coloredWoolFromWhiteWoolAndDye(p_176532_, BlockInit.LAVENDER_WOOL.get(), ItemInit.LAVENDER_DYE.get());
        carpet(p_176532_, BlockInit.LAVENDER_CARPET.get(), BlockInit.LAVENDER_WOOL.get());
        coloredCarpetFromWhiteCarpetAndDye(p_176532_, BlockInit.LAVENDER_CARPET.get(), ItemInit.LAVENDER_DYE.get());
        bedFromPlanksAndWool(p_176532_, ItemInit.LAVENDER_BED.get(), BlockInit.LAVENDER_WOOL.get());
        bedFromWhiteBedAndDye(p_176532_, ItemInit.LAVENDER_BED.get(), ItemInit.LAVENDER_DYE.get());
        banner(p_176532_, ItemInit.LAVENDER_BANNER.get(), BlockInit.LAVENDER_WOOL.get());
        stainedGlassFromGlassAndDye(p_176532_, BlockInit.LAVENDER_STAINED_GLASS.get(), ItemInit.LAVENDER_DYE.get());
        stainedGlassPaneFromStainedGlass(p_176532_, BlockInit.LAVENDER_STAINED_GLASS_PANE.get(), BlockInit.LAVENDER_STAINED_GLASS.get());
        stainedGlassPaneFromGlassPaneAndDye(p_176532_, BlockInit.LAVENDER_STAINED_GLASS_PANE.get(), ItemInit.LAVENDER_DYE.get());
        coloredTerracottaFromTerracottaAndDye(p_176532_, BlockInit.LAVENDER_TERRACOTTA.get(), ItemInit.LAVENDER_DYE.get());
        concretePowder(p_176532_, BlockInit.LAVENDER_CONCRETE_POWDER.get(), ItemInit.LAVENDER_DYE.get());
        candle(p_176532_, BlockInit.LAVENDER_CANDLE.get(), ItemInit.LAVENDER_DYE.get());
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockInit.LAVENDER_TERRACOTTA.get()), BlockInit.LAVENDER_GLAZED_TERRACOTTA.get().asItem(), 0.1F, 200).unlockedBy("has_" + BlockInit.LAVENDER_TERRACOTTA.getId().getPath(), has(BlockInit.LAVENDER_TERRACOTTA.get())).save(p_176532_);

    }
}
