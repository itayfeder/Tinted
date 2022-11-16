package com.itayfeder.tinted.mixin.compat.create;

import com.simibubi.create.foundation.utility.Couple;
import com.simibubi.create.foundation.utility.DyeHelper;
import net.minecraft.world.item.DyeColor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.Map;

@Mixin(DyeHelper.class)
public interface DyeHelperAccessor {
    @Mutable
    @Accessor("DYE_TABLE")
    public static Map<DyeColor, Couple<Integer>> getColor() {
        throw new AssertionError();
    }

    @Mutable
    @Accessor("DYE_TABLE")
    public static void setColor(Map<DyeColor, Couple<Integer>> value) {
        throw new AssertionError();
    }
}
