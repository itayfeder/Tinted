package com.itayfeder.tinted.events;

import com.itayfeder.tinted.TintedMod;
import com.itayfeder.tinted.util.ExtraDyeColors;
import net.minecraft.world.entity.animal.Sheep;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.awt.*;

//@Mod.EventBusSubscriber(modid = TintedMod.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class RainbowTickEvent {
    /*private static int CHROMATIC_NUM = 0;

    @SubscribeEvent
    public static void onStitch(TickEvent.RenderTickEvent event) {
        Color newColor = new Color(Color.HSBtoRGB(CHROMATIC_NUM / 360f, 1,1));
        CHROMATIC_NUM = (CHROMATIC_NUM + 1) % 360;
        ExtraDyeColors.CHROMATIC.textureDiffuseColors = new float[] {newColor.getRed() / 255f, newColor.getGreen() / 255f, newColor.getBlue() / 255f};
        Sheep.COLORARRAY_BY_COLOR.put(ExtraDyeColors.CHROMATIC, new float[] {newColor.getRed() / 255f, newColor.getGreen() / 255f, newColor.getBlue() / 255f});
    }*/
}
