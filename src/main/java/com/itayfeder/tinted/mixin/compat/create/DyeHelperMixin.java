package com.itayfeder.tinted.mixin.compat.create;

import com.google.common.collect.ImmutableMap;
import com.itayfeder.tinted.util.ExtraDyeColors;
import com.simibubi.create.foundation.utility.Couple;
import com.simibubi.create.foundation.utility.DyeHelper;
import net.minecraft.world.item.DyeColor;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;

@Mixin(DyeHelper.class)
public abstract class DyeHelperMixin {

    @Shadow
    @Final
    @Mutable
    public static final Map<DyeColor, Couple<Integer>> DYE_TABLE;


    static {
        DYE_TABLE = (new ImmutableMap.Builder())
                .put(DyeColor.BLACK, Couple.create(4538427, 2170911))
                .put(DyeColor.RED, Couple.create(11614519, 6498103))
                .put(DyeColor.GREEN, Couple.create(2132550, 1925189))
                .put(DyeColor.BROWN, Couple.create(11306332, 6837054))
                .put(DyeColor.BLUE, Couple.create(5476833, 5262224))
                .put(DyeColor.GRAY, Couple.create(6121071, 3224888))
                .put(DyeColor.LIGHT_GRAY, Couple.create(9803419, 7368816))
                .put(DyeColor.PURPLE, Couple.create(10441902, 6501996))
                .put(DyeColor.CYAN, Couple.create(4107188, 3962994))
                .put(DyeColor.PINK, Couple.create(14002379, 12086165))
                .put(DyeColor.LIME, Couple.create(10739541, 5222767))
                .put(DyeColor.YELLOW, Couple.create(15128406, 15313961))
                .put(DyeColor.LIGHT_BLUE, Couple.create(6934226, 5278373))
                .put(DyeColor.ORANGE, Couple.create(15635014, 14240039))
                .put(DyeColor.MAGENTA, Couple.create(15753904, 12600456))
                .put(DyeColor.WHITE, Couple.create(15592165, 12302000))

                .put(ExtraDyeColors.CORAL, Couple.create(16286585, 13728631))
                .put(ExtraDyeColors.BEIGE, Couple.create(15062720, 12367533))
                .put(ExtraDyeColors.OLIVE, Couple.create(9868800, 7170824))
                .put(ExtraDyeColors.TURQUOISE, Couple.create(4251856, 4437930))
                .put(ExtraDyeColors.AMBER, Couple.create(15836416, 13208336))
                .put(ExtraDyeColors.BUBBLEGUM, Couple.create(15021722, 12204937))
                .put(ExtraDyeColors.BORDEAUX, Couple.create(7799592, 4982817))
                .put(ExtraDyeColors.ENDER, Couple.create(2777685, 1783086)).build();
    }
}
