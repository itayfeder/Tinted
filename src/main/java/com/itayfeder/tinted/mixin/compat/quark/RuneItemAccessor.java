package com.itayfeder.tinted.mixin.compat.quark;

import net.minecraft.world.entity.animal.Sheep;
import net.minecraft.world.item.DyeColor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;
import vazkii.quark.content.tools.item.RuneItem;

import java.util.Map;

@Mixin(RuneItem.class)
public interface RuneItemAccessor {
    @Mutable
    @Accessor("color")
    public int getColor();

    @Mutable
    @Accessor("color")
    public void setColor(int value);
}
