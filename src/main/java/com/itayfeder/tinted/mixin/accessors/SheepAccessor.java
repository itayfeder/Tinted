package com.itayfeder.tinted.mixin.accessors;

import com.mojang.authlib.minecraft.client.MinecraftClient;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.world.entity.animal.Sheep;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.biome.Biome;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.Map;

@Mixin(Sheep.class)
public interface SheepAccessor {
    @Mutable
    @Accessor("COLORARRAY_BY_COLOR")
    public static Map<DyeColor, float[]> getColorarrayByColor() {
        throw new AssertionError();
    }

    @Mutable
    @Accessor("COLORARRAY_BY_COLOR")
    public static void setColorarrayByColor(Map<DyeColor, float[]> values) {
        throw new AssertionError();
    }
}
