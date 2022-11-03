package com.itayfeder.tinted.events;

import com.itayfeder.tinted.TintedMod;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Objects;

@Mod.EventBusSubscriber(modid = TintedMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AtlasStitchEvents {
    @SubscribeEvent
    public static void onStitch(TextureStitchEvent.Pre event) {
        if (event.getAtlas().location().equals(Sheets.SHULKER_SHEET)) {
            Objects.requireNonNull(event);
            event.addSprite(new ResourceLocation("entity/shulker/shulker_" + "coral"));
            event.addSprite(new ResourceLocation("entity/shulker/shulker_" + "beige"));
            event.addSprite(new ResourceLocation("entity/shulker/shulker_" + "olive"));
            event.addSprite(new ResourceLocation("entity/shulker/shulker_" + "turquoise"));
            event.addSprite(new ResourceLocation("entity/shulker/shulker_" + "amber"));
        }
    }
}
