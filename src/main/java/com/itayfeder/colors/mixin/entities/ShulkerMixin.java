package com.itayfeder.colors.mixin.entities;

import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.AbstractGolem;
import net.minecraft.world.entity.animal.Sheep;
import net.minecraft.world.entity.monster.Shulker;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin(Shulker.class)
public abstract class ShulkerMixin extends AbstractGolem {
    @Shadow
    protected static final EntityDataAccessor<Byte> DATA_COLOR_ID = SynchedEntityData.defineId(Shulker.class, EntityDataSerializers.BYTE);

    protected ShulkerMixin(EntityType<? extends AbstractGolem> p_27508_, Level p_27509_) {
        super(p_27508_, p_27509_);
    }

    @Inject(locals = LocalCapture.CAPTURE_FAILHARD,
            method = "getColor",
            at = @At(shift = At.Shift.BEFORE, value = "RETURN"),
            cancellable = true
    )
    private void getColorInject(CallbackInfoReturnable<DyeColor> cir) {
        byte b0 = this.entityData.get(DATA_COLOR_ID);
        cir.setReturnValue( b0 != 64 && b0 <= 63 ? DyeColor.byId(b0) : null);
    }

    @Inject(locals = LocalCapture.CAPTURE_FAILHARD,
            method = "defineSynchedData",
            at = @At(shift = At.Shift.BEFORE, value = "TAIL"),
            cancellable = true
    )
    private void defineSynchedDataInject(CallbackInfo ci) {
        this.entityData.set(DATA_COLOR_ID, (byte)64);
    }
}
