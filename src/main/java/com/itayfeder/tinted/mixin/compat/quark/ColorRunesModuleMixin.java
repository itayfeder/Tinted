package com.itayfeder.tinted.mixin.compat.quark;

import com.mojang.blaze3d.vertex.PoseStack;
import com.simibubi.create.foundation.utility.Couple;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;
import vazkii.quark.base.module.ModuleFinder;
import vazkii.quark.base.module.ModuleLoader;
import vazkii.quark.base.module.QuarkModule;
import vazkii.quark.content.tools.item.RuneItem;
import vazkii.quark.content.tools.module.ColorRunesModule;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

@Mixin(value = ColorRunesModule.class, remap = false)
public class ColorRunesModuleMixin {

    @ModifyConstant(method = "renderType", constant = @Constant(intValue=17))
    private static int injected(int value) {
        return DyeColor.values().length;
    }
}