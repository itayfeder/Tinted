package com.itayfeder.tinted.data.tags;

import com.itayfeder.tinted.TintedMod;
import com.itayfeder.tinted.init.BlockInit;
import com.itayfeder.tinted.tags.TintedBlockTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ColorBlockTagProvider extends BlockTagsProvider {
    public ColorBlockTagProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, TintedMod.MODID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        this.tag(BlockTags.WOOL).add(BlockInit.CORAL_WOOL.get(), BlockInit.BEIGE_WOOL.get(), BlockInit.OLIVE_WOOL.get(), BlockInit.TURQUOISE_WOOL.get(), BlockInit.AMBER_WOOL.get(), BlockInit.BUBBLEGUM_WOOL.get(), BlockInit.BORDEAUX_WOOL.get(), BlockInit.ENDER_WOOL.get(), BlockInit.MINT_WOOL.get());
        this.tag(BlockTags.WOOL_CARPETS).add(BlockInit.CORAL_CARPET.get(), BlockInit.BEIGE_CARPET.get(), BlockInit.OLIVE_CARPET.get(), BlockInit.TURQUOISE_CARPET.get(), BlockInit.AMBER_CARPET.get(), BlockInit.BUBBLEGUM_CARPET.get(), BlockInit.BORDEAUX_CARPET.get(), BlockInit.ENDER_CARPET.get(), BlockInit.MINT_CARPET.get());
        this.tag(BlockTags.BANNERS).add(BlockInit.CORAL_BANNER.get(), BlockInit.CORAL_WALL_BANNER.get(),
                BlockInit.BEIGE_BANNER.get(), BlockInit.BEIGE_WALL_BANNER.get(),
                BlockInit.OLIVE_BANNER.get(), BlockInit.OLIVE_WALL_BANNER.get(),
                BlockInit.TURQUOISE_BANNER.get(), BlockInit.TURQUOISE_WALL_BANNER.get(),
                BlockInit.AMBER_BANNER.get(), BlockInit.AMBER_WALL_BANNER.get(),
                BlockInit.BUBBLEGUM_BANNER.get(), BlockInit.BUBBLEGUM_WALL_BANNER.get(),
                BlockInit.BORDEAUX_BANNER.get(), BlockInit.BORDEAUX_WALL_BANNER.get(),
                BlockInit.ENDER_BANNER.get(), BlockInit.ENDER_WALL_BANNER.get(),
                BlockInit.MINT_BANNER.get(), BlockInit.MINT_WALL_BANNER.get());
        //this.tag(BlockTags.IMPERMEABLE).add(BlockInit.CORAL_STAINED_GLASS.get(), BlockInit.BEIGE_STAINED_GLASS.get(), BlockInit.OLIVE_STAINED_GLASS.get());
        this.tag(BlockTags.BEDS).add(BlockInit.CORAL_BED.get(), BlockInit.BEIGE_BED.get(), BlockInit.OLIVE_BED.get(), BlockInit.TURQUOISE_BED.get(), BlockInit.AMBER_BED.get(), BlockInit.BUBBLEGUM_BED.get(), BlockInit.BORDEAUX_BED.get(), BlockInit.ENDER_BED.get(), BlockInit.MINT_BED.get());
        this.tag(BlockTags.SHULKER_BOXES).add(BlockInit.CORAL_SHULKER_BOX.get(), BlockInit.BEIGE_SHULKER_BOX.get(), BlockInit.OLIVE_SHULKER_BOX.get(), BlockInit.TURQUOISE_SHULKER_BOX.get(), BlockInit.AMBER_SHULKER_BOX.get(), BlockInit.BUBBLEGUM_SHULKER_BOX.get(), BlockInit.BORDEAUX_SHULKER_BOX.get(), BlockInit.ENDER_SHULKER_BOX.get(), BlockInit.MINT_SHULKER_BOX.get());
        this.tag(BlockTags.CANDLES).add(BlockInit.CORAL_CANDLE.get(), BlockInit.BEIGE_CANDLE.get(), BlockInit.OLIVE_CANDLE.get(), BlockInit.TURQUOISE_CANDLE.get(), BlockInit.AMBER_CANDLE.get(), BlockInit.BUBBLEGUM_CANDLE.get(), BlockInit.BORDEAUX_CANDLE.get(), BlockInit.ENDER_CANDLE.get(), BlockInit.MINT_CANDLE.get());
        this.tag(BlockTags.CANDLE_CAKES).add(BlockInit.CORAL_CANDLE_CAKE.get(), BlockInit.BEIGE_CANDLE_CAKE.get(), BlockInit.OLIVE_CANDLE_CAKE.get(), BlockInit.TURQUOISE_CANDLE_CAKE.get(), BlockInit.AMBER_CANDLE_CAKE.get(), BlockInit.BUBBLEGUM_CANDLE_CAKE.get(), BlockInit.BORDEAUX_CANDLE_CAKE.get(), BlockInit.ENDER_CANDLE_CAKE.get(), BlockInit.MINT_CANDLE_CAKE.get());
        this.tag(BlockTags.TERRACOTTA).add(BlockInit.CORAL_TERRACOTTA.get(), BlockInit.BEIGE_TERRACOTTA.get(), BlockInit.OLIVE_TERRACOTTA.get(), BlockInit.TURQUOISE_TERRACOTTA.get(), BlockInit.AMBER_TERRACOTTA.get(), BlockInit.BUBBLEGUM_TERRACOTTA.get(), BlockInit.BORDEAUX_TERRACOTTA.get(), BlockInit.ENDER_TERRACOTTA.get(), BlockInit.MINT_TERRACOTTA.get());

        //this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockInit.CORAL_TERRACOTTA.get(), BlockInit.CORAL_CONCRETE.get(), BlockInit.BEIGE_TERRACOTTA.get(), BlockInit.BEIGE_CONCRETE.get(), BlockInit.OLIVE_TERRACOTTA.get(), BlockInit.OLIVE_CONCRETE.get());
        this.tag(BlockTags.MINEABLE_WITH_SHOVEL).add(BlockInit.CORAL_CONCRETE_POWDER.get(), BlockInit.BEIGE_CONCRETE_POWDER.get(), BlockInit.OLIVE_CONCRETE_POWDER.get(), BlockInit.TURQUOISE_CONCRETE_POWDER.get(), BlockInit.AMBER_CONCRETE_POWDER.get(), BlockInit.BUBBLEGUM_CONCRETE_POWDER.get(), BlockInit.BORDEAUX_CONCRETE_POWDER.get(), BlockInit.ENDER_CONCRETE_POWDER.get(), BlockInit.MINT_CONCRETE_POWDER.get());

        //this.tag(Tags.Blocks.GLASS).add(BlockInit.CORAL_STAINED_GLASS.get(), BlockInit.BEIGE_STAINED_GLASS.get(), BlockInit.OLIVE_STAINED_GLASS.get());
        this.tag(Tags.Blocks.STAINED_GLASS).add(BlockInit.CORAL_STAINED_GLASS.get(), BlockInit.BEIGE_STAINED_GLASS.get(), BlockInit.OLIVE_STAINED_GLASS.get(), BlockInit.TURQUOISE_STAINED_GLASS.get(), BlockInit.AMBER_STAINED_GLASS.get(), BlockInit.BUBBLEGUM_STAINED_GLASS.get(), BlockInit.BORDEAUX_STAINED_GLASS.get(), BlockInit.ENDER_STAINED_GLASS.get(), BlockInit.MINT_STAINED_GLASS.get());
        //this.tag(Tags.Blocks.GLASS_PANES).add(BlockInit.CORAL_STAINED_GLASS_PANE.get(), BlockInit.BEIGE_STAINED_GLASS_PANE.get(), BlockInit.OLIVE_STAINED_GLASS_PANE.get());
        this.tag(Tags.Blocks.STAINED_GLASS_PANES).add(BlockInit.CORAL_STAINED_GLASS_PANE.get(), BlockInit.BEIGE_STAINED_GLASS_PANE.get(), BlockInit.OLIVE_STAINED_GLASS_PANE.get(), BlockInit.TURQUOISE_STAINED_GLASS_PANE.get(), BlockInit.AMBER_STAINED_GLASS_PANE.get(), BlockInit.BUBBLEGUM_STAINED_GLASS_PANE.get(), BlockInit.BORDEAUX_STAINED_GLASS_PANE.get(), BlockInit.ENDER_STAINED_GLASS_PANE.get(), BlockInit.MINT_STAINED_GLASS_PANE.get());


        this.tag(TintedBlockTags.CONCRETE).add(
                Blocks.WHITE_CONCRETE, Blocks.ORANGE_CONCRETE, Blocks.MAGENTA_CONCRETE, Blocks.LIGHT_BLUE_CONCRETE,
                Blocks.YELLOW_CONCRETE, Blocks.LIME_CONCRETE, Blocks.PINK_CONCRETE, Blocks.GRAY_CONCRETE,
                Blocks.LIGHT_GRAY_CONCRETE, Blocks.CYAN_CONCRETE, Blocks.PURPLE_CONCRETE, Blocks.BLUE_CONCRETE,
                Blocks.BROWN_CONCRETE, Blocks.GREEN_CONCRETE, Blocks.RED_CONCRETE, Blocks.BLACK_CONCRETE,

                BlockInit.CORAL_CONCRETE.get(), BlockInit.BEIGE_CONCRETE.get(), BlockInit.OLIVE_CONCRETE.get(), BlockInit.TURQUOISE_CONCRETE.get(),
                BlockInit.AMBER_CONCRETE.get(), BlockInit.BUBBLEGUM_CONCRETE.get(), BlockInit.BORDEAUX_CONCRETE.get(), BlockInit.ENDER_CONCRETE.get(),
                BlockInit.MINT_CONCRETE.get());
        this.tag(TintedBlockTags.CONCRETE_POWDER).add(
                Blocks.WHITE_CONCRETE_POWDER, Blocks.ORANGE_CONCRETE_POWDER, Blocks.MAGENTA_CONCRETE_POWDER, Blocks.LIGHT_BLUE_CONCRETE_POWDER,
                Blocks.YELLOW_CONCRETE_POWDER, Blocks.LIME_CONCRETE_POWDER, Blocks.PINK_CONCRETE_POWDER, Blocks.GRAY_CONCRETE_POWDER,
                Blocks.LIGHT_GRAY_CONCRETE_POWDER, Blocks.CYAN_CONCRETE_POWDER, Blocks.PURPLE_CONCRETE_POWDER, Blocks.BLUE_CONCRETE_POWDER,
                Blocks.BROWN_CONCRETE_POWDER, Blocks.GREEN_CONCRETE_POWDER, Blocks.RED_CONCRETE_POWDER, Blocks.BLACK_CONCRETE_POWDER,

                BlockInit.CORAL_CONCRETE_POWDER.get(), BlockInit.BEIGE_CONCRETE_POWDER.get(), BlockInit.OLIVE_CONCRETE_POWDER.get(), BlockInit.TURQUOISE_CONCRETE_POWDER.get(),
                BlockInit.AMBER_CONCRETE_POWDER.get(), BlockInit.BUBBLEGUM_CONCRETE_POWDER.get(), BlockInit.BORDEAUX_CONCRETE_POWDER.get(), BlockInit.ENDER_CONCRETE_POWDER.get(),
                BlockInit.MINT_CONCRETE_POWDER.get());
    }
}
