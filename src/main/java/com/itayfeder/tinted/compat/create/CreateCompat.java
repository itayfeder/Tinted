package com.itayfeder.tinted.compat.create;

import com.itayfeder.tinted.mixin.compat.create.DyeHelperAccessor;
import com.itayfeder.tinted.util.ExtraDyeColors;
import com.simibubi.create.foundation.utility.Couple;
import net.minecraft.world.item.DyeColor;

import java.util.HashMap;
import java.util.Map;

public class CreateCompat {
    public static void FixDyeHelper() {
        Map<DyeColor, Couple<Integer>> newColors = new HashMap<>();
        for (Map.Entry<DyeColor, Couple<Integer>> entry : DyeHelperAccessor.getColor().entrySet()) {
            newColors.put(entry.getKey(), entry.getValue());
        }

        newColors.put(ExtraDyeColors.CORAL, Couple.create(16286585, 13728631));
        newColors.put(ExtraDyeColors.BEIGE, Couple.create(15062720, 12367533));
        newColors.put(ExtraDyeColors.OLIVE, Couple.create(9868800, 7170824));
        newColors.put(ExtraDyeColors.TURQUOISE, Couple.create(4251856, 4437930));
        newColors.put(ExtraDyeColors.AMBER, Couple.create(15836416, 13208336));
        newColors.put(ExtraDyeColors.BUBBLEGUM, Couple.create(15021722, 12204937));
        newColors.put(ExtraDyeColors.BORDEAUX, Couple.create(7799592, 4982817));
        newColors.put(ExtraDyeColors.ENDER, Couple.create(2777685, 1783086));
        newColors.put(ExtraDyeColors.MINT, Couple.create(8574640, 7645325));
        newColors.put(ExtraDyeColors.INDIGO, Couple.create(4915330, 3016276));
        newColors.put(ExtraDyeColors.OCHRE, Couple.create(12815920, 10055218));
        newColors.put(ExtraDyeColors.LAVENDER, Couple.create(14790910, 12428241));
        newColors.put(ExtraDyeColors.CHARTREUSE, Couple.create(13757769, 11845963));

        DyeHelperAccessor.setColor(newColors);
    }
}
