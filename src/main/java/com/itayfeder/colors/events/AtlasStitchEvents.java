package com.itayfeder.colors.events;

import com.google.common.collect.ImmutableList;
import com.itayfeder.colors.ColorsMod;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.resources.model.Material;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.awt.*;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

@Mod.EventBusSubscriber(modid = ColorsMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AtlasStitchEvents {
    @SubscribeEvent
    public static void onStitch(TextureStitchEvent.Pre event) {
        if (event.getAtlas().location().equals(Sheets.SHULKER_SHEET)) {
            Objects.requireNonNull(event);
            event.addSprite(new ResourceLocation("entity/shulker/shulker_" + "coral"));
            event.addSprite(new ResourceLocation("entity/shulker/shulker_" + "beige"));
        }
    }
}
