package com.itayfeder.tinted.data.tags;

import com.itayfeder.tinted.TintedMod;
import com.itayfeder.tinted.init.BlockInit;
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

        this.tag(ItemTags.BANNERS).add(ItemInit.CORAL_BANNER.get(), ItemInit.BEIGE_BANNER.get(), ItemInit.OLIVE_BANNER.get(), ItemInit.TURQUOISE_BANNER.get(),
                ItemInit.AMBER_BANNER.get(), ItemInit.BUBBLEGUM_BANNER.get(), ItemInit.BORDEAUX_BANNER.get(), ItemInit.ENDER_BANNER.get(),
                ItemInit.MINT_BANNER.get(), ItemInit.INDIGO_BANNER.get(), ItemInit.OCHRE_BANNER.get(), ItemInit.LAVENDER_BANNER.get(),
                ItemInit.CHARTREUSE_BANNER.get());

        this.tag(Tags.Items.DYES).add(ItemInit.CORAL_DYE.get(), ItemInit.BEIGE_DYE.get(), ItemInit.OLIVE_DYE.get(), ItemInit.TURQUOISE_DYE.get(),
                ItemInit.AMBER_DYE.get(), ItemInit.BUBBLEGUM_DYE.get(), ItemInit.BORDEAUX_DYE.get(), ItemInit.ENDER_DYE.get(),
                ItemInit.MINT_DYE.get(), ItemInit.INDIGO_DYE.get(), ItemInit.OCHRE_DYE.get(), ItemInit.LAVENDER_DYE.get(),
                ItemInit.CHARTREUSE_DYE.get());
    }
}
