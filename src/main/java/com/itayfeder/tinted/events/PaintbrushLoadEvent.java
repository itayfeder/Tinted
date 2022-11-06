package com.itayfeder.tinted.events;

import com.itayfeder.tinted.TintedMod;
import com.itayfeder.tinted.items.paintbrush.PaintbrushReloadListener;
import net.minecraftforge.event.AddReloadListenerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = TintedMod.MODID)
public class PaintbrushLoadEvent {
    @SubscribeEvent
    public static void onServerAboutToStart(AddReloadListenerEvent event) {
        event.addListener(PaintbrushReloadListener.INSTANCE);
    }
}
