package com.itayfeder.tinted;

import com.itayfeder.tinted.compat.another_furniture.AnotherFurnitureCompat;
import com.itayfeder.tinted.compat.chalk.ChalkCompat;
import com.itayfeder.tinted.compat.cloudstorage.CloudStorageCompat;
import com.itayfeder.tinted.compat.create.CreateCompat;
import com.itayfeder.tinted.compat.domesticationinnovation.DomesticationInnovationCompat;
import com.itayfeder.tinted.compat.farmers_delight.FarmersDelightCompat;
import com.itayfeder.tinted.compat.quark.QuarkCompat;
import com.itayfeder.tinted.data.ColorRecipeProvider;
import com.itayfeder.tinted.data.lootTables.ColorLootTableProvider;
import com.itayfeder.tinted.data.tags.ColorBlockTagProvider;
import com.itayfeder.tinted.data.tags.ColorItemTagProvider;
import com.itayfeder.tinted.init.BlockInit;
import com.itayfeder.tinted.init.ItemInit;
import com.itayfeder.tinted.util.BlockEntityAdder;
import com.itayfeder.tinted.util.ExtraDyeColors;
import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.entity.layers.LlamaDecorLayer;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Mod(TintedMod.MODID)
@Mod.EventBusSubscriber(modid = TintedMod.MODID)
public class TintedMod
{
    public static final String MODID = "tinted";
    public static final Logger LOGGER = LogUtils.getLogger();

    public TintedMod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::dataSetup);

        ExtraDyeColors.InitColors();

        BlockInit.BLOCKS.register(modEventBus);
        ItemInit.ITEMS.register(modEventBus);

        if (ModList.get().isLoaded("another_furniture")) {
            AnotherFurnitureCompat.RegisterRegistries(modEventBus);
        }

        if (ModList.get().isLoaded("farmersdelight")) {
            FarmersDelightCompat.RegisterRegistries(modEventBus);
        }

        if (ModList.get().isLoaded("chalk")) {
            ChalkCompat.RegisterRegistries(modEventBus);
        }

        if (ModList.get().isLoaded("domesticationinnovation")) {
            DomesticationInnovationCompat.RegisterRegistries(modEventBus);
        }



        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        System.out.println("-----------------------------------------------");
        for (DyeColor color : DyeColor.values()) {
            System.out.println(color.toString() + " " + color.getId());
        }
        System.out.println("-----------------------------------------------");

        if (ModList.get().isLoaded("quark")) {
            QuarkCompat.ChangeRuneValues();
        }

        if (ModList.get().isLoaded("create")) {
            CreateCompat.FixDyeHelper();
        }

        if (ModList.get().isLoaded("create")) {
            CreateCompat.FixDyeHelper();
        }

        if (ModList.get().isLoaded("cloudstorage")) {
            CloudStorageCompat.AddWoolToBalloons();
        }

        event.enqueueWork(() -> {
            BlockEntityAdder.AddToBlockEntities();

            if (ModList.get().isLoaded("another_furniture")) {
                AnotherFurnitureCompat.AddToBlockEntities();
            }

            if (ModList.get().isLoaded("farmersdelight")) {
                FarmersDelightCompat.AddToBlockEntities();
            }

            if (ModList.get().isLoaded("domesticationinnovation")) {
                DomesticationInnovationCompat.AddToBlockEntities();
            }
        });
    }

    private void dataSetup(GatherDataEvent event) {
        DataGenerator dataGenerator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        boolean includeServer = event.includeServer();

        ColorBlockTagProvider blockTags = new ColorBlockTagProvider(dataGenerator, existingFileHelper);
        dataGenerator.addProvider(includeServer, blockTags);
        dataGenerator.addProvider(includeServer, new ColorItemTagProvider(dataGenerator, blockTags, existingFileHelper));

        dataGenerator.addProvider(includeServer, new ColorRecipeProvider(dataGenerator));
        dataGenerator.addProvider(includeServer, new ColorLootTableProvider(dataGenerator));
    }
}
