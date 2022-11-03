package com.itayfeder.tinted.mixin.client;

import com.google.common.collect.ImmutableList;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.resources.model.Material;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;

import java.util.List;
import java.util.stream.Stream;

@Mixin(Sheets.class)
public class SheetsMixin {
    @Shadow
    @Final
    @Mutable
    public static final List<Material> SHULKER_TEXTURE_LOCATION = Stream.of("white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black", "coral", "beige", "olive", "turquoise", "amber").map((p_110784_) -> {
        return new Material(Sheets.SHULKER_SHEET, new ResourceLocation("entity/shulker/shulker_" + p_110784_));
    }).collect(ImmutableList.toImmutableList());

}
