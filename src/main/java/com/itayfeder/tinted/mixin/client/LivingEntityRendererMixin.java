package com.itayfeder.tinted.mixin.client;

import com.itayfeder.tinted.events.RainbowTickEvent;
import com.itayfeder.tinted.util.ExtraDyeColors;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.Shulker;
import net.minecraft.world.item.DyeColor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

import javax.annotation.Nullable;
import java.awt.*;

@Mixin(LivingEntityRenderer.class)
public abstract class LivingEntityRendererMixin<T extends LivingEntity, M extends EntityModel<T>> extends EntityRenderer<T> implements RenderLayerParent<T, M> {

    @Shadow
    @Nullable
    protected abstract RenderType getRenderType(T p_115322_, boolean p_115323_, boolean p_115324_, boolean p_115325_);

    @Shadow
    protected abstract float getWhiteOverlayProgress(T p_115334_, float p_115335_);

    @Shadow
    protected M model;

    protected LivingEntityRendererMixin(EntityRendererProvider.Context p_174008_) {
        super(p_174008_);
    }

    @Inject(locals = LocalCapture.CAPTURE_FAILHARD,
            method = "render(Lnet/minecraft/world/entity/LivingEntity;FFLcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/MultiBufferSource;I)V",
            at = @At(shift = At.Shift.BEFORE, value = "INVOKE", target = "Lnet/minecraft/client/renderer/entity/LivingEntityRenderer;getRenderType(Lnet/minecraft/world/entity/LivingEntity;ZZZ)Lnet/minecraft/client/renderer/RenderType;"),
            cancellable = true
    )
    private void getColorInject(T p_115308_, float p_115309_, float p_115310_, PoseStack p_115311_, MultiBufferSource p_115312_, int p_115313_, CallbackInfo ci, boolean shouldSit, float f, float f1, float f2, float f6, float f7, float f8, float f5, Minecraft minecraft, boolean flag, boolean flag1, boolean flag2) {
        /*if (p_115308_ instanceof Shulker) {
            Shulker shulker = (Shulker) p_115308_;
            if (shulker.getColor() == ExtraDyeColors.CHROMATIC) {
                RenderType rendertype = this.getRenderType(p_115308_, flag, flag1, flag2);
                if (rendertype != null) {
                    VertexConsumer vertexconsumer = p_115312_.getBuffer(rendertype);
                    int i = LivingEntityRenderer.getOverlayCoords(p_115308_, this.getWhiteOverlayProgress(p_115308_, p_115310_));
                    Color newColor = new Color(Color.HSBtoRGB(RainbowTickEvent.CHROMATIC_NUM / 360f, 0.8f,0.8f));
                    this.model.renderToBuffer(p_115311_, vertexconsumer, p_115313_, i, newColor.getRed() / 255f, newColor.getGreen() / 255f, newColor.getBlue() / 255f, flag1 ? 0.15F : 1.0F);
                }
                flag = false;
                flag1 = false;
                flag2 = false;
            }
        }*/
    }

    @ModifyVariable(method = "render(Lnet/minecraft/world/entity/LivingEntity;FFLcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/MultiBufferSource;I)V",
            at = @At(value = "STORE"),
            ordinal = 0
    )
    private RenderType flag0Inject(RenderType value, T p_115308_, float p_115309_, float p_115310_, PoseStack p_115311_, MultiBufferSource p_115312_, int p_115313_) {
        /*if (p_115308_ instanceof Shulker) {
            Shulker shulker = (Shulker) p_115308_;
            if (shulker.getColor() == ExtraDyeColors.CHROMATIC) {
                return null;
            }
        }*/
        return value;
    }
}
