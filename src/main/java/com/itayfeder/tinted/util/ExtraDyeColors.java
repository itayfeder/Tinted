package com.itayfeder.tinted.util;

import com.itayfeder.tinted.mixin.DyeColorMixin;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.material.MaterialColor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ExtraDyeColors {

    public static DyeColor CORAL;
    public static DyeColor BEIGE;
    public static DyeColor OLIVE;
    public static DyeColor TURQUOISE;

    public static void InitColors() {
        CORAL = DyeColor.byId(16);
        BEIGE = DyeColor.byId(17);
        OLIVE = DyeColor.byId(18);
        TURQUOISE = DyeColor.byId(19);
    }

}
