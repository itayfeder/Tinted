package com.itayfeder.tinted.events;

import com.itayfeder.tinted.TintedMod;
import com.itayfeder.tinted.init.ItemInit;
import com.itayfeder.tinted.items.paintbrush.PaintbrushItem;
import net.minecraft.client.color.item.ItemColors;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.DyeableLeatherItem;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = TintedMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ColorEvents {
    @SubscribeEvent
    public static void registerColorHandlers(RegisterColorHandlersEvent.Item event) {

        registerItemColorHandlers(event.getItemColors());
    }

    private static void registerItemColorHandlers(final ItemColors itemColors) {
        itemColors.register((p_getColor_1_, p_getColor_2_) -> {
            return p_getColor_2_ <= 0 ? -1 : DyeColor.byId(PaintbrushItem.getColor(p_getColor_1_)).getFireworkColor();
        }, ItemInit.PAINTBRUSH.get());
    }
}
