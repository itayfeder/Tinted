package com.itayfeder.tinted.mixin.compat.iwannaskate;

import com.github.alexthe668.iwannaskate.server.item.SkateboardWheels;
import net.minecraft.world.level.material.MaterialColor;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.gen.Invoker;

import java.util.ArrayList;
import java.util.Arrays;

@Mixin(SkateboardWheels.class)
public class SkateboardWheelsMixin {
    @Shadow
    @Final
    @Mutable
    public static SkateboardWheels[] $VALUES;

    private static final SkateboardWheels CORAL = addVariant("CORAL");
    private static final SkateboardWheels BEIGE = addVariant("BEIGE");
    private static final SkateboardWheels OLIVE = addVariant("OLIVE");
    private static final SkateboardWheels TURQUOISE = addVariant("TURQUOISE");
    private static final SkateboardWheels AMBER = addVariant("AMBER");
    private static final SkateboardWheels BUBBLEGUM = addVariant("BUBBLEGUM");
    private static final SkateboardWheels BORDEAUX = addVariant("BORDEAUX");
    private static final SkateboardWheels ENDER = addVariant("ENDER");
    private static final SkateboardWheels MINT = addVariant("MINT");
    private static final SkateboardWheels INDIGO = addVariant("INDIGO");
    private static final SkateboardWheels OCHRE = addVariant("OCHRE");
    private static final SkateboardWheels LAVENDER = addVariant("LAVENDER");
    private static final SkateboardWheels CHARTREUSE = addVariant("CHARTREUSE");

    @Invoker("<init>")
    public static SkateboardWheels invokeInit(String internalName, int internalId) {
        throw new AssertionError();
    }

    private static SkateboardWheels addVariant(String internalName) {
        ArrayList<SkateboardWheels> variants = new ArrayList<SkateboardWheels>(Arrays.asList(SkateboardWheelsMixin.$VALUES));
        SkateboardWheels color = SkateboardWheelsMixin.invokeInit(internalName, variants.get(variants.size() - 1).ordinal() + 1);
        variants.add(color);
        SkateboardWheelsMixin.$VALUES = variants.toArray(new SkateboardWheels[0]);
        return color;
    }
}
