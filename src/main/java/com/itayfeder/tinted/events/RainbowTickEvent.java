package com.itayfeder.tinted.events;

import com.itayfeder.tinted.TintedMod;
import com.itayfeder.tinted.compat.another_furniture.AnotherFurnitureCompat;
import com.itayfeder.tinted.compat.create.CreateCompat;
import com.itayfeder.tinted.mixin.accessors.SheepAccessor;
import com.itayfeder.tinted.util.ExtraDyeColors;
import net.minecraft.client.Minecraft;
import net.minecraft.util.profiling.jfr.event.WorldLoadFinishedEvent;
import net.minecraft.world.entity.animal.Sheep;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;

import java.awt.*;
import java.util.Map;

@Mod.EventBusSubscriber(modid = TintedMod.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class RainbowTickEvent {
    public static float CHROMATIC_NUM = 345;
    public static boolean START_ROLL = false;

    @SubscribeEvent
    public static void onStitch(TickEvent.RenderTickEvent event) {
        if (!START_ROLL) {
            CHROMATIC_NUM = 0;
        }
        if (START_ROLL) {
            Color newColor = new Color(Color.HSBtoRGB(CHROMATIC_NUM / 360f, 0.8f,0.8f));
            Color darkerColor = new Color(Color.HSBtoRGB(CHROMATIC_NUM / 360f, 0.7f,0.7f));
            CHROMATIC_NUM = (CHROMATIC_NUM + (1/6f)) % 360;
            /*Map<DyeColor, float[]> sheepColorValues = SheepAccessor.getColorarrayByColor();
            sheepColorValues.put(ExtraDyeColors.CHROMATIC, new float[] {newColor.getRed() / 255f, newColor.getGreen() / 255f, newColor.getBlue() / 255f});
            SheepAccessor.setColorarrayByColor(sheepColorValues);
            ExtraDyeColors.CHROMATIC.textureDiffuseColors = new float[] {newColor.getRed() / 255f, newColor.getGreen() / 255f, newColor.getBlue() / 255f};
            if (ModList.get().isLoaded("create")) {
                CreateCompat.ChangeNixieTubeColor(newColor, darkerColor);
            }*/

        }
    }


    @SubscribeEvent
    public static void onEnterWorld(PlayerEvent.PlayerLoggedInEvent event) {
        START_ROLL = true;

    }
}
