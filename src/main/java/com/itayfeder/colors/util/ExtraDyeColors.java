package com.itayfeder.colors.util;

import com.itayfeder.colors.mixin.DyeColorMixin;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.material.MaterialColor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ExtraDyeColors {

    public static DyeColor CORAL;


    public static void InitColors() {
        CORAL = DyeColor.byId(16);
    }

}
