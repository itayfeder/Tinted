package com.itayfeder.tinted.data.tags;

import com.itayfeder.tinted.TintedMod;
import com.itayfeder.tinted.init.ItemInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;

public class ColorItemTagProvider extends ItemTagsProvider {
    public ColorItemTagProvider(DataGenerator p_126530_, BlockTagsProvider p_126531_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_126530_, p_126531_, TintedMod.MODID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        this.copy(BlockTags.WOOL, ItemTags.WOOL);
        this.copy(BlockTags.WOOL_CARPETS, ItemTags.WOOL_CARPETS);
        this.copy(BlockTags.BEDS, ItemTags.BEDS);
        this.copy(BlockTags.CANDLES, ItemTags.CANDLES);
        this.copy(BlockTags.TERRACOTTA, ItemTags.TERRACOTTA);

        this.tag(ItemTags.BANNERS).add(ItemInit.CORAL_BANNER.get(), ItemInit.BEIGE_BANNER.get(), ItemInit.OLIVE_BANNER.get());

        this.tag(Tags.Items.DYES).add(ItemInit.CORAL_DYE.get(), ItemInit.BEIGE_DYE.get(), ItemInit.OLIVE_DYE.get());
    }
}
