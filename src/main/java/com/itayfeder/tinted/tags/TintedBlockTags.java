package com.itayfeder.tinted.tags;

import com.itayfeder.tinted.TintedMod;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class TintedBlockTags {
    public static final TagKey<Block> CONCRETE = blockTag("concrete");
    public static final TagKey<Block> CONCRETE_POWDER = blockTag("concrete_powder");

    private static TagKey<Block> blockTag(String name) {
        return TagKey.create(Registry.BLOCK_REGISTRY, new ResourceLocation(TintedMod.MODID, name));
    }
}
