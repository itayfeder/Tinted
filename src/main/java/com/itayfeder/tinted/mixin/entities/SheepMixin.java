package com.itayfeder.tinted.mixin.entities;

import com.google.common.collect.Maps;
import com.itayfeder.tinted.TintedMod;
import com.itayfeder.tinted.init.BlockInit;
import com.itayfeder.tinted.util.ExtraDyeColors;
import net.minecraft.Util;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.animal.Sheep;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

import java.util.Map;

@Mixin(Sheep.class)
public abstract class SheepMixin extends Animal {
    @Shadow
    private static final EntityDataAccessor<Byte> DATA_WOOL_ID = SynchedEntityData.defineId(Sheep.class, EntityDataSerializers.BYTE);

    @Shadow
    @Final
    @Mutable
    private static final Map<DyeColor, ItemLike> ITEM_BY_DYE = Util.make(Maps.newEnumMap(DyeColor.class), (p_29841_) -> {
        p_29841_.put(DyeColor.WHITE, Blocks.WHITE_WOOL);
        p_29841_.put(DyeColor.ORANGE, Blocks.ORANGE_WOOL);
        p_29841_.put(DyeColor.MAGENTA, Blocks.MAGENTA_WOOL);
        p_29841_.put(DyeColor.LIGHT_BLUE, Blocks.LIGHT_BLUE_WOOL);
        p_29841_.put(DyeColor.YELLOW, Blocks.YELLOW_WOOL);
        p_29841_.put(DyeColor.LIME, Blocks.LIME_WOOL);
        p_29841_.put(DyeColor.PINK, Blocks.PINK_WOOL);
        p_29841_.put(DyeColor.GRAY, Blocks.GRAY_WOOL);
        p_29841_.put(DyeColor.LIGHT_GRAY, Blocks.LIGHT_GRAY_WOOL);
        p_29841_.put(DyeColor.CYAN, Blocks.CYAN_WOOL);
        p_29841_.put(DyeColor.PURPLE, Blocks.PURPLE_WOOL);
        p_29841_.put(DyeColor.BLUE, Blocks.BLUE_WOOL);
        p_29841_.put(DyeColor.BROWN, Blocks.BROWN_WOOL);
        p_29841_.put(DyeColor.GREEN, Blocks.GREEN_WOOL);
        p_29841_.put(DyeColor.RED, Blocks.RED_WOOL);
        p_29841_.put(DyeColor.BLACK, Blocks.BLACK_WOOL);

        p_29841_.put(ExtraDyeColors.CORAL, BlockInit.CORAL_WOOL.get());
        p_29841_.put(ExtraDyeColors.BEIGE, BlockInit.BEIGE_WOOL.get());
        p_29841_.put(ExtraDyeColors.OLIVE, BlockInit.OLIVE_WOOL.get());
        p_29841_.put(ExtraDyeColors.TURQUOISE, BlockInit.TURQUOISE_WOOL.get());
        p_29841_.put(ExtraDyeColors.AMBER, BlockInit.AMBER_WOOL.get());
        p_29841_.put(ExtraDyeColors.BUBBLEGUM, BlockInit.BUBBLEGUM_WOOL.get());
        p_29841_.put(ExtraDyeColors.BORDEAUX, BlockInit.BORDEAUX_WOOL.get());
        p_29841_.put(ExtraDyeColors.ENDER, BlockInit.ENDER_WOOL.get());
        p_29841_.put(ExtraDyeColors.MINT, BlockInit.MINT_WOOL.get());
        p_29841_.put(ExtraDyeColors.INDIGO, BlockInit.INDIGO_WOOL.get());
        p_29841_.put(ExtraDyeColors.OCHRE, BlockInit.OCHRE_WOOL.get());
        p_29841_.put(ExtraDyeColors.LAVENDER, BlockInit.LAVENDER_WOOL.get());
    });

    @Shadow public abstract boolean isSheared();

    @Shadow public abstract DyeColor getColor();

    protected SheepMixin(EntityType<? extends Animal> p_27557_, Level p_27558_) {
        super(p_27557_, p_27558_);
    }

    @Inject(locals = LocalCapture.CAPTURE_FAILHARD,
            method = "getColor",
            at = @At(shift = At.Shift.BEFORE, value = "RETURN"),
            cancellable = true
    )
    private void getColorInject(CallbackInfoReturnable<DyeColor> cir) {
        cir.setReturnValue(DyeColor.byId(this.entityData.get(DATA_WOOL_ID) & 63));
    }

    @Inject(locals = LocalCapture.CAPTURE_FAILHARD,
            method = "setColor",
            at = @At(value = "HEAD"),
            cancellable = true
    )
    public void setColor(DyeColor p_29856_, CallbackInfo ci) {
        byte b0 = this.entityData.get(DATA_WOOL_ID);
        byte data = (byte)(b0 & 240 | p_29856_.getId() & 63);
        this.entityData.set(DATA_WOOL_ID, data);
        ci.cancel();
    }

    @Inject(locals = LocalCapture.CAPTURE_FAILHARD,
            method = "isSheared",
            at = @At(shift = At.Shift.BEFORE, value = "RETURN"),
            cancellable = true
    )
    private void isShearedInjection(CallbackInfoReturnable<Boolean> cir) {
        int data = (this.entityData.get(DATA_WOOL_ID) & 64);
        cir.setReturnValue(data != 0);
    }

    @Inject(locals = LocalCapture.CAPTURE_FAILHARD,
            method = "setSheared",
            at = @At(value = "HEAD"),
            cancellable = true
    )
    private void setShearedInjection(boolean p_29879_, CallbackInfo ci) {
        byte b0 = this.entityData.get(DATA_WOOL_ID);
        if (p_29879_) {
            this.entityData.set(DATA_WOOL_ID, (byte)(b0 | 64));
            ci.cancel();
        } else {
            this.entityData.set(DATA_WOOL_ID, (byte)(b0 & -(64+1)));
            ci.cancel();
        }
    }

    @Inject(locals = LocalCapture.CAPTURE_FAILHARD,
            method = "getDefaultLootTable",
            at = @At(value = "HEAD"),
            cancellable = true
    )
    private void getDefaultLootTableInject(CallbackInfoReturnable<ResourceLocation> cir) {
        if (this.isSheared()) {
            cir.setReturnValue(EntityType.SHEEP.getDefaultLootTable());
        } else {
            if (this.getColor() == ExtraDyeColors.CORAL) {
                cir.setReturnValue(new ResourceLocation(TintedMod.MODID,"entities/sheep/coral"));
            }
            if (this.getColor() == ExtraDyeColors.BEIGE) {
                cir.setReturnValue(new ResourceLocation(TintedMod.MODID,"entities/sheep/beige"));
            }
            if (this.getColor() == ExtraDyeColors.OLIVE) {
                cir.setReturnValue(new ResourceLocation(TintedMod.MODID,"entities/sheep/olive"));
            }
            if (this.getColor() == ExtraDyeColors.TURQUOISE) {
                cir.setReturnValue(new ResourceLocation(TintedMod.MODID,"entities/sheep/turquoise"));
            }
            if (this.getColor() == ExtraDyeColors.AMBER) {
                cir.setReturnValue(new ResourceLocation(TintedMod.MODID,"entities/sheep/amber"));
            }
            if (this.getColor() == ExtraDyeColors.BUBBLEGUM) {
                cir.setReturnValue(new ResourceLocation(TintedMod.MODID,"entities/sheep/bubblegum"));
            }
            if (this.getColor() == ExtraDyeColors.BORDEAUX) {
                cir.setReturnValue(new ResourceLocation(TintedMod.MODID,"entities/sheep/bordeaux"));
            }
            if (this.getColor() == ExtraDyeColors.ENDER) {
                cir.setReturnValue(new ResourceLocation(TintedMod.MODID,"entities/sheep/ender"));
            }
            if (this.getColor() == ExtraDyeColors.MINT) {
                cir.setReturnValue(new ResourceLocation(TintedMod.MODID,"entities/sheep/mint"));
            }
            if (this.getColor() == ExtraDyeColors.INDIGO) {
                cir.setReturnValue(new ResourceLocation(TintedMod.MODID,"entities/sheep/indigo"));
            }
            if (this.getColor() == ExtraDyeColors.OCHRE) {
                cir.setReturnValue(new ResourceLocation(TintedMod.MODID,"entities/sheep/ochre"));
            }
            if (this.getColor() == ExtraDyeColors.OCHRE) {
                cir.setReturnValue(new ResourceLocation(TintedMod.MODID,"entities/sheep/lavender"));
            }
        }
    }


}
