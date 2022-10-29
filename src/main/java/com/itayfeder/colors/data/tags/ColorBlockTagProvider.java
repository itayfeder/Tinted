package com.itayfeder.colors.data.tags;

import com.itayfeder.colors.ColorsMod;
import com.itayfeder.colors.init.BlockInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ColorBlockTagProvider extends BlockTagsProvider {
    public ColorBlockTagProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, ColorsMod.MODID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        this.tag(BlockTags.WOOL).add(BlockInit.CORAL_WOOL.get());
        this.tag(BlockTags.WOOL_CARPETS).add(BlockInit.CORAL_CARPET.get());
        this.tag(BlockTags.BANNERS).add(BlockInit.CORAL_BANNER.get(), BlockInit.CORAL_WALL_BANNER.get());
        this.tag(BlockTags.IMPERMEABLE).add(BlockInit.CORAL_STAINED_GLASS.get());
        this.tag(BlockTags.BEDS).add(BlockInit.CORAL_BED.get());
        this.tag(BlockTags.SHULKER_BOXES).add(BlockInit.CORAL_SHULKER_BOX.get());
        this.tag(BlockTags.CANDLES).add(BlockInit.CORAL_CANDLE.get());
        this.tag(BlockTags.CANDLE_CAKES).add(BlockInit.CORAL_CANDLE_CAKE.get());
        this.tag(BlockTags.TERRACOTTA).add(BlockInit.CORAL_TERRACOTTA.get());

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockInit.CORAL_TERRACOTTA.get(), BlockInit.CORAL_CONCRETE.get());
        this.tag(BlockTags.MINEABLE_WITH_SHOVEL).add(BlockInit.CORAL_CONCRETE_POWDER.get());

    }
}
