package com.itayfeder.colors;

import com.google.common.collect.ImmutableSet;
import com.itayfeder.colors.data.ColorRecipeProvider;
import com.itayfeder.colors.data.lootTables.ColorLootTableProvider;
import com.itayfeder.colors.data.tags.ColorBlockTagProvider;
import com.itayfeder.colors.data.tags.ColorItemTagProvider;
import com.itayfeder.colors.init.BlockInit;
import com.itayfeder.colors.init.ItemInit;
import com.itayfeder.colors.util.ExtraDyeColors;
import com.mojang.logging.LogUtils;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.util.ObfuscationReflectionHelper;
import org.slf4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Mod(ColorsMod.MODID)
@Mod.EventBusSubscriber(modid = ColorsMod.MODID)
public class ColorsMod
{
    public static final String MODID = "colors";
    private static final Logger LOGGER = LogUtils.getLogger();

    public ColorsMod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::dataSetup);

        ExtraDyeColors.InitColors();

        BlockInit.BLOCKS.register(modEventBus);
        ItemInit.ITEMS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        System.out.println("-----------------------------------------------");
        for (DyeColor color : DyeColor.values()) {
            System.out.println(color.toString() + " " + color.getId());
        }
        System.out.println("-----------------------------------------------");

        event.enqueueWork(() -> {
            Set<Block> shulkerSet = BlockEntityType.SHULKER_BOX.validBlocks;
            List<Block> shulkerList = new ArrayList<>();
            for (Block sbox : shulkerSet) {
                shulkerList.add(sbox);
            }
            shulkerList.add(BlockInit.CORAL_SHULKER_BOX.get());
            BlockEntityType.SHULKER_BOX.validBlocks = ImmutableSet.copyOf(shulkerList);

            Set<Block> bedSet = BlockEntityType.BED.validBlocks;
            List<Block> bedList = new ArrayList<>();
            for (Block bed : bedSet) {
                bedList.add(bed);
            }
            bedList.add(BlockInit.CORAL_BED.get());
            BlockEntityType.BED.validBlocks = ImmutableSet.copyOf(bedList);

            Set<Block> bannerSet = BlockEntityType.BANNER.validBlocks;
            List<Block> bannerList = new ArrayList<>();
            for (Block banner : bannerSet) {
                bannerList.add(banner);
            }
            bannerList.add(BlockInit.CORAL_BANNER.get());
            bannerList.add(BlockInit.CORAL_WALL_BANNER.get());
            BlockEntityType.BANNER.validBlocks = ImmutableSet.copyOf(bannerList);
        });
    }

    private void dataSetup(GatherDataEvent event) {
        DataGenerator dataGenerator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        if (event.includeServer()) {
            ColorBlockTagProvider blockTags = new ColorBlockTagProvider(dataGenerator, existingFileHelper);
            dataGenerator.addProvider(true, blockTags);
            dataGenerator.addProvider(true, new ColorItemTagProvider(dataGenerator, blockTags, existingFileHelper));

            dataGenerator.addProvider(true, new ColorRecipeProvider(dataGenerator));
            dataGenerator.addProvider(true, new ColorLootTableProvider(dataGenerator));
        }
    }
}
