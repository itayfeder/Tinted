package com.itayfeder.tinted.compat.create;

import com.google.common.collect.ImmutableMap;
import com.itayfeder.tinted.util.ExtraDyeColors;
import com.simibubi.create.foundation.utility.Couple;
import com.simibubi.create.foundation.utility.DyeHelper;
import net.minecraft.world.item.DyeColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.util.ObfuscationReflectionHelper;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Map;


public class CreateCompat {

    public static void AddToHelper() throws Exception {
        /*Map<DyeColor, Couple<Integer>> dyes = (new ImmutableMap.Builder())
                .putAll(DyeHelper.DYE_TABLE)
                .put(ExtraDyeColors.CORAL, Couple.create(16286585, 13728631))
                .put(ExtraDyeColors.BEIGE, Couple.create(15062720, 12367533))
                .put(ExtraDyeColors.OLIVE, Couple.create(9868800, 7170824)).build();

        Field original = DyeHelper.class.getField("DYE_TABLE");
        original.setAccessible(true);
        MODIFIERS.set(original, original.getModifiers() & ~Modifier.FINAL);
        original.set(null, dyes);*/

    }
}
