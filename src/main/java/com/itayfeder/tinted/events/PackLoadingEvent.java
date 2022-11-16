package com.itayfeder.tinted.events;

import com.itayfeder.tinted.TintedMod;
import net.minecraft.server.packs.FilePackResources;
import net.minecraft.server.packs.FolderPackResources;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.repository.FolderRepositorySource;
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.server.packs.repository.PackSource;
import net.minecraft.server.packs.repository.RepositorySource;
import net.minecraftforge.event.AddPackFindersEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.ModLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forgespi.language.IModFileInfo;
import net.minecraftforge.resource.PathPackResources;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@Mod.EventBusSubscriber(modid = TintedMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class PackLoadingEvent {
    public static final List<String> COMPATIBLE_MODS = new ArrayList<>() {{
        add("supplementaries");
        add("another_furniture");
        add("create");
        add("quark");
        add("waystones");
        add("chalk");
        add("elevatorid");
        add("farmersdelight");
        add("reliquary");
        add("domesticationinnovation");
        add("snowyspirit");
        add("comforts");
        add("iwannaskate");
    }};

    @SubscribeEvent
    public static void onPackEvent(AddPackFindersEvent event) {
        if (event.getPackType() == PackType.SERVER_DATA) {
            event.addRepositorySource(new ModLoadedPackFinder());
        }
    }

    public static class ModLoadedPackFinder implements RepositorySource {
        @Override
        public void loadPacks(Consumer<Pack> packLoader, Pack.PackConstructor packBuilder) {
            IModFileInfo modFile = ModList.get().getModContainerById(TintedMod.MODID).get().getModInfo().getOwningFile();

            for (String modid : COMPATIBLE_MODS) {
                try {
                    if(ModList.get().isLoaded(modid)){ //If mod is loaded, this is being coded in common code :harold:
                        packLoader.accept(Pack.create(
                                "Tinted Compat: " + modid, false,
                                () -> new PathPackResources("Tintent Compat: " + modid, modFile.getFile().findResource("compat_data_packs/" + modid + "/")),
                                packBuilder, Pack.Position.TOP, PackSource.BUILT_IN
                        ));
                        TintedMod.LOGGER.debug("Tinted Compat for mod loaded successfully: " + modid);

                    }
                } catch (Exception e) {
                    TintedMod.LOGGER.debug("Tinted Compat for mod didn't load: " + modid);

                }

            }

        }
    }
}

