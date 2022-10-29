package com.itayfeder.colors.mixin;

import com.itayfeder.colors.init.BlockInit;
import com.itayfeder.colors.util.ExtraDyeColors;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ShulkerBoxBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin(ShulkerBoxBlock.class)
public class ShulkerBoxBlockMixin {

    @Inject(locals = LocalCapture.CAPTURE_FAILHARD,
            method = "getBlockByColor",
            at = @At(value = "HEAD")
    )
    private static void getBlockByColorInject(DyeColor p_56191_, CallbackInfoReturnable<Block> cir) {
        if (p_56191_ == null) {
            cir.setReturnValue(Blocks.SHULKER_BOX);
        } else {
            if (p_56191_ == ExtraDyeColors.CORAL) {
                cir.setReturnValue(BlockInit.CORAL_SHULKER_BOX.get());
            }
        }
    }
}
