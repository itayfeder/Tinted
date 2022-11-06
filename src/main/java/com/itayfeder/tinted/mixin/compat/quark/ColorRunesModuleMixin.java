package com.itayfeder.tinted.mixin.compat.quark;

import com.mojang.blaze3d.vertex.PoseStack;
import com.simibubi.create.foundation.utility.Couple;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
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
public abstract class ColorRunesModuleMixin {

    @Shadow public static List<RuneItem> runes;

    @Shadow public static Item rainbow_rune;

    @Shadow public static Item blank_rune;

    @Inject(locals = LocalCapture.CAPTURE_FAILHARD,
            method = "renderType",
            at = @At(value = "HEAD"),
            cancellable = true
    )
    private static void renderTypeInject(List<RenderType> list, Supplier<RenderType> vanilla, CallbackInfoReturnable<RenderType> cir) {
        int color = ColorRunesModule.changeColor();
        cir.setReturnValue(color >= 0 && color <= list.size() ? (RenderType)list.get(color) : (RenderType)vanilla.get());
    }

    @Inject(locals = LocalCapture.CAPTURE_FAILHARD,
            method = "register",
            at = @At(value = "HEAD"),
            cancellable = true
    )
    private void registerInject(CallbackInfo ci) {
        runes = Arrays.stream(DyeColor.values()).map((color) -> {
            return new RuneItem(color.getSerializedName() + "_rune", (ColorRunesModule) (Object) this, color.getId(), true);
        }).toList();
        rainbow_rune = new RuneItem("rainbow_rune", (ColorRunesModule) (Object) this, DyeColor.values().length, true);
        blank_rune = new RuneItem("blank_rune", (ColorRunesModule) (Object) this, DyeColor.values().length + 1, false);
        ci.cancel();
    }
}