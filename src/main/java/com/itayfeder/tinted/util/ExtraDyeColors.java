package com.itayfeder.tinted.util;

import com.itayfeder.tinted.mixin.DyeColorMixin;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.material.MaterialColor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ExtraDyeColors {

    public static final List<DyeColor> MY_NEW_DYES = new ArrayList<>();

    public static DyeColor CORAL;
    public static DyeColor BEIGE;
    public static DyeColor OLIVE;
    public static DyeColor TURQUOISE;
    public static DyeColor AMBER;
    public static DyeColor BUBBLEGUM;
    public static DyeColor BORDEAUX;
    public static DyeColor ENDER;
    public static DyeColor MINT;

    //public static DyeColor CHROMATIC;

    public static void InitColors() {
        CORAL = DyeColor.byId(16);
        BEIGE = DyeColor.byId(17);
        OLIVE = DyeColor.byId(18);
        TURQUOISE = DyeColor.byId(19);
        AMBER = DyeColor.byId(20);
        BUBBLEGUM = DyeColor.byId(21);
        BORDEAUX = DyeColor.byId(22);
        ENDER = DyeColor.byId(23);
        MINT = DyeColor.byId(24);
    }

}
