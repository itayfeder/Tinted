package com.itayfeder.tinted.mixin.compat.cloudstorage;

import com.github.alexthe668.cloudstorage.world.SkyTempleBlockProcessor;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.Map;

@Mixin(SkyTempleBlockProcessor.class)
public interface SkyTempleBlockProcessorAccessor {
    @Mutable
    @Accessor("DYE_TO_BLOCK")
    public static Map<DyeColor, Block> getColor() {
        throw new AssertionError();
    }

    @Mutable
    @Accessor("DYE_TO_BLOCK")
    public static void setColor(Map<DyeColor, Block> value) {
        throw new AssertionError();
    }
}
