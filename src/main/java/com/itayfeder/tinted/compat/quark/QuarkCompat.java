package com.itayfeder.tinted.compat.quark;

import com.itayfeder.tinted.mixin.compat.quark.RuneItemAccessor;
import net.minecraft.world.item.DyeColor;
import vazkii.quark.content.tools.module.ColorRunesModule;

public class QuarkCompat {

    public static void ChangeRuneValues() {
        ((RuneItemAccessor)ColorRunesModule.rainbow_rune).setColor(DyeColor.values().length);
        ((RuneItemAccessor)ColorRunesModule.blank_rune).setColor(DyeColor.values().length+1);
    }
}
