package com.itayfeder.tinted.compat.create;

import com.itayfeder.tinted.mixin.compat.create.DyeHelperMixin;
import com.itayfeder.tinted.util.ExtraDyeColors;
import com.simibubi.create.foundation.utility.Couple;
import com.simibubi.create.foundation.utility.DyeHelper;

import java.awt.*;

public class CreateCompat {
    public static void ChangeNixieTubeColor(Color bright, Color dark) {
        //DyeHelper.DYE_TABLE.put(ExtraDyeColors.CHROMATIC, Couple.create(colourToNumber(bright), colourToNumber(dark)));
    }


    public static int colourToNumber(Color color) {
        return (color.getRed() << 16) + (color.getGreen() << 8) + (color.getBlue());
    }
}
