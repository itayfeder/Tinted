package com.itayfeder.tinted.util;

import com.itayfeder.tinted.mixin.DyeColorMixin;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.material.MaterialColor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ExtraDyeColors {

    public static List<DyeColor> MY_NEW_DYES = new ArrayList<>();

    public static DyeColor CORAL;
    public static DyeColor BEIGE;
    public static DyeColor OLIVE;
    public static DyeColor TURQUOISE;
    public static DyeColor AMBER;
    public static DyeColor BUBBLEGUM;
    public static DyeColor BORDEAUX;
    public static DyeColor ENDER;
    public static DyeColor MINT;
    public static DyeColor INDIGO;
    public static DyeColor OCHRE;
    public static DyeColor LAVENDER;
    public static DyeColor CHARTREUSE;

    //public static DyeColor CHROMATIC;

    public static void InitColors() {
        CORAL = DyeColor.byName("coral", DyeColor.WHITE);
        MY_NEW_DYES.add(CORAL);

        BEIGE = DyeColor.byName("beige", DyeColor.WHITE);
        MY_NEW_DYES.add(BEIGE);

        OLIVE = DyeColor.byName("olive", DyeColor.WHITE);
        MY_NEW_DYES.add(OLIVE);

        TURQUOISE = DyeColor.byName("turquoise", DyeColor.WHITE);
        MY_NEW_DYES.add(TURQUOISE);

        AMBER = DyeColor.byName("amber", DyeColor.WHITE);
        MY_NEW_DYES.add(AMBER);

        BUBBLEGUM = DyeColor.byName("bubblegum", DyeColor.WHITE);
        MY_NEW_DYES.add(BUBBLEGUM);

        BORDEAUX = DyeColor.byName("bordeaux", DyeColor.WHITE);
        MY_NEW_DYES.add(BORDEAUX);

        ENDER = DyeColor.byName("ender", DyeColor.WHITE);
        MY_NEW_DYES.add(ENDER);

        MINT = DyeColor.byName("mint", DyeColor.WHITE);
        MY_NEW_DYES.add(MINT);

        INDIGO = DyeColor.byName("indigo", DyeColor.WHITE);
        MY_NEW_DYES.add(INDIGO);

        OCHRE = DyeColor.byName("ochre", DyeColor.WHITE);
        MY_NEW_DYES.add(OCHRE);

        LAVENDER = DyeColor.byName("lavender", DyeColor.WHITE);
        MY_NEW_DYES.add(LAVENDER);

        CHARTREUSE = DyeColor.byName("chartreuse", DyeColor.WHITE);
        MY_NEW_DYES.add(CHARTREUSE);
    }

}
