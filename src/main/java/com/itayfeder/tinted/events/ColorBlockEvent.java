package com.itayfeder.tinted.events;

import com.itayfeder.tinted.TintedMod;
import com.mojang.blaze3d.platform.NativeImage;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.BlockRenderDispatcher;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.client.resources.model.SimpleBakedModel;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.extensions.IForgeBakedModel;
import net.minecraftforge.client.model.data.ModelData;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(modid = TintedMod.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ColorBlockEvent {
    /*@SubscribeEvent
    public static void onClickBlock(PlayerInteractEvent.RightClickBlock event) {
        if (!event.getLevel().isClientSide) {
            BlockState state = event.getLevel().getBlockState(event.getHitVec().getBlockPos());
            BlockPos pos = event.getHitVec().getBlockPos();
            RandomSource randomsource = RandomSource.create();
            randomsource.setSeed(42L);
            IForgeBakedModel model = Minecraft.getInstance().getBlockRenderer().getBlockModel(state);
            List<BakedQuad> quads = model.getQuads(state, null, randomsource, ModelData.EMPTY, null);
            List<BakedQuad> ups = model.getQuads(state, Direction.UP, randomsource, ModelData.EMPTY, null);
            for (BakedQuad quad : quads) {
                if (quad.getDirection() == Direction.UP) {
                    ups.add(quad);
                }
            }

            if (ups.size() != 0) {
                TextureAtlasSprite sprite = ups.get(0).getSprite();
                Color color = averageColor(sprite.mainImage[0], 0, 0, sprite.getWidth(), sprite.getHeight());
                int i = Minecraft.getInstance().getBlockColors().getColor(state, null, pos, ups.get(0).getTintIndex());
                if (i != -1) {
                    float f = (float)(i >> 16 & 255) / 255.0F;
                    float f1 = (float)(i >> 8 & 255) / 255.0F;
                    float f2 = (float)(i & 255) / 255.0F;
                    color = new Color(f * (float) color.getRed() / 255f, f1 * (float) color.getGreen() / 255f, f2 * (float) color.getBlue() / 255f);
                }


                Minecraft.getInstance().player.sendSystemMessage(
                        Component.literal("This color is: " + rgbToHex(color.getRed(), color.getGreen(), color.getBlue()))
                                .withStyle(Style.EMPTY.withColor(color.getRGB())));
                DyeColor closest = compareToColors(color);
                Minecraft.getInstance().player.sendSystemMessage(
                        Component.literal("It is closest to: " + closest.getSerializedName())
                                .withStyle(Style.EMPTY.withColor(closest.getTextColor())));

            }
        }
    }*/

    public static Color averageColor(NativeImage bi, int x0, int y0, int w,
                                     int h) {
        int x1 = x0 + w;
        int y1 = y0 + h;
        long sumr = 0, sumg = 0, sumb = 0;
        for (int x = x0; x < x1; x++) {
            for (int y = y0; y < y1; y++) {
                Color pixel = new Color(bi.getPixelRGBA(x, y));
                sumr += pixel.getBlue();
                sumg += pixel.getGreen();
                sumb += pixel.getRed();
            }
        }
        int num = w * h;
        return new Color((int) (sumr / num),(int) (sumg / num),(int) (sumb / num), 255);
    }

    public static DyeColor compareToColors(Color a) {
        double shortest = Double.MAX_VALUE;
        DyeColor shortestColor = null;
        for (DyeColor color : DyeColor.values()) {
            Color newColor = new Color(color.textureDiffuseColors[0], color.textureDiffuseColors[1], color.textureDiffuseColors[2]);
            double newDistance = Distance(a, newColor);
            if (newDistance < shortest) {
                shortest = newDistance;
                shortestColor = color;
            }
        }
        return shortestColor;
    }

    public static double Distance(Color a, Color b) {
        return Math.sqrt(Math.pow(a.getRed() - b.getRed(), 2) + Math.pow(a.getGreen() - b.getGreen(), 2) + Math.pow(a.getBlue() - b.getBlue(), 2));
    }

    public static String[] hexMap = "0123456789ABCDEF".split("");

    public static String decToHex(Integer x)
    {
        if(x == 0)
            return "00";

        String result = "";

        while (x != 0)
        {
            Integer modulus = Math.floorMod(x, 16);

            result = hexMap[modulus] + result;

            x /= 16;
        }

        return result.length() == 1 ? '0' + result : result;
    }

    public static String rgbToHex(Integer r, Integer g, Integer b) {
        return '#' + decToHex(r) + decToHex(g) + decToHex(b);
    }
}
