package com.itayfeder.colors.mixin;

import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import net.minecraft.world.item.BannerItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MaterialColor;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.gen.Invoker;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

@Mixin(DyeColor.class)
public abstract class DyeColorMixin {
    @Shadow
    @Final
    @Mutable
    public static DyeColor[] $VALUES;

    private static final DyeColor CORAL = addVariant("CORAL", "coral", 16286585, MaterialColor.COLOR_ORANGE, 16286585, 16286585);
    private static final DyeColor BEIGE = addVariant("BEIGE", "beige", 15062720, MaterialColor.COLOR_YELLOW, 15062720, 15062720);
    private static final DyeColor OLIVE = addVariant("OLIVE", "olive", 9868800, MaterialColor.COLOR_LIGHT_GREEN, 9868800, 9868800);

    @Shadow
    @Final
    @Mutable
    private static final DyeColor[] BY_ID = Arrays.stream($VALUES).sorted(Comparator.comparingInt(DyeColor::getId)).toArray((p_41067_) -> {
        return new DyeColor[p_41067_];
    });

    @Shadow
    @Final
    @Mutable
    private static final Int2ObjectOpenHashMap<DyeColor> BY_FIREWORK_COLOR = new Int2ObjectOpenHashMap<>(Arrays.stream($VALUES).collect(Collectors.toMap((p_41064_) -> {
        return p_41064_.getFireworkColor();
    }, (p_41056_) -> {
        return p_41056_;
    })));

    @Invoker("<init>")
    public static DyeColor invokeInit(String internalName, int internalId, int id, String p_41047_, int p_41048_, MaterialColor p_41049_, int p_41050_, int p_41051_) {
        throw new AssertionError();
    }

    private static DyeColor addVariant(String internalName, String p_41047_, int p_41048_, MaterialColor p_41049_, int p_41050_, int p_41051_) {
        ArrayList<DyeColor> variants = new ArrayList<DyeColor>(Arrays.asList(DyeColorMixin.$VALUES));
        DyeColor color = DyeColorMixin.invokeInit(internalName, variants.get(variants.size() - 1).ordinal() + 1, variants.get(variants.size() - 1).ordinal() + 1, p_41047_, p_41048_, p_41049_, p_41050_, p_41051_);
        variants.add(color);
        DyeColorMixin.$VALUES = variants.toArray(new DyeColor[0]);
        return color;
    }

}
