package com.itayfeder.tinted.compat.farmers_delight;


import com.google.common.collect.ImmutableSet;
import com.itayfeder.tinted.util.ExtraDyeColors;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SignItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import vectorwing.farmersdelight.FarmersDelight;
import vectorwing.farmersdelight.common.block.StandingCanvasSignBlock;
import vectorwing.farmersdelight.common.block.WallCanvasSignBlock;
import vectorwing.farmersdelight.common.registry.ModBlockEntityTypes;
import vectorwing.farmersdelight.common.registry.ModItems;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class FarmersDelightCompat {
    private static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, FarmersDelight.MODID);
    private static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FarmersDelight.MODID);

    public static void RegisterRegistries(IEventBus modEventBus) {
        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);
    }

    public static void AddToBlockEntities() {
        Set<Block> curtainSet = ModBlockEntityTypes.CANVAS_SIGN.get().validBlocks;
        List<Block> curtainList = new ArrayList<>();
        for (Block sbox : curtainSet) {
            curtainList.add(sbox);
        }
        curtainList.add(CORAL_CANVAS_SIGN.get());
        curtainList.add(CORAL_CANVAS_WALL_SIGN.get());
        curtainList.add(BEIGE_CANVAS_SIGN.get());
        curtainList.add(BEIGE_CANVAS_WALL_SIGN.get());
        curtainList.add(OLIVE_CANVAS_SIGN.get());
        curtainList.add(OLIVE_CANVAS_WALL_SIGN.get());
        curtainList.add(TURQUOISE_CANVAS_SIGN.get());
        curtainList.add(TURQUOISE_CANVAS_WALL_SIGN.get());
        curtainList.add(AMBER_CANVAS_SIGN.get());
        curtainList.add(AMBER_CANVAS_WALL_SIGN.get());
        curtainList.add(AMBER_CANVAS_SIGN.get());
        curtainList.add(AMBER_CANVAS_WALL_SIGN.get());
        curtainList.add(BUBBLEGUM_CANVAS_SIGN.get());
        curtainList.add(BUBBLEGUM_CANVAS_WALL_SIGN.get());
        curtainList.add(BORDEAUX_CANVAS_SIGN.get());
        curtainList.add(BORDEAUX_CANVAS_WALL_SIGN.get());
        curtainList.add(ENDER_CANVAS_SIGN.get());
        curtainList.add(ENDER_CANVAS_WALL_SIGN.get());
        curtainList.add(MINT_CANVAS_SIGN.get());
        curtainList.add(MINT_CANVAS_WALL_SIGN.get());
        curtainList.add(INDIGO_CANVAS_SIGN.get());
        curtainList.add(INDIGO_CANVAS_WALL_SIGN.get());
        curtainList.add(OCHRE_CANVAS_SIGN.get());
        curtainList.add(OCHRE_CANVAS_WALL_SIGN.get());
        curtainList.add(LAVENDER_CANVAS_SIGN.get());
        curtainList.add(LAVENDER_CANVAS_WALL_SIGN.get());

        ModBlockEntityTypes.CANVAS_SIGN.get().validBlocks = ImmutableSet.copyOf(curtainList);

    }


    //BLOCKS
    public static final RegistryObject<Block> CORAL_CANVAS_SIGN = BLOCKS.register("coral_canvas_sign",
            () -> new StandingCanvasSignBlock(ExtraDyeColors.CORAL));
    public static final RegistryObject<Block> CORAL_CANVAS_WALL_SIGN = BLOCKS.register("coral_canvas_wall_sign",
            () -> new WallCanvasSignBlock(Block.Properties.copy(Blocks.OAK_SIGN).lootFrom(CORAL_CANVAS_SIGN), ExtraDyeColors.CORAL));
    public static final RegistryObject<Block> BEIGE_CANVAS_SIGN = BLOCKS.register("beige_canvas_sign",
            () -> new StandingCanvasSignBlock(ExtraDyeColors.BEIGE));
    public static final RegistryObject<Block> BEIGE_CANVAS_WALL_SIGN = BLOCKS.register("beige_canvas_wall_sign",
            () -> new WallCanvasSignBlock(Block.Properties.copy(Blocks.OAK_SIGN).lootFrom(BEIGE_CANVAS_SIGN), ExtraDyeColors.BEIGE));
    public static final RegistryObject<Block> OLIVE_CANVAS_SIGN = BLOCKS.register("olive_canvas_sign",
            () -> new StandingCanvasSignBlock(ExtraDyeColors.OLIVE));
    public static final RegistryObject<Block> OLIVE_CANVAS_WALL_SIGN = BLOCKS.register("olive_canvas_wall_sign",
            () -> new WallCanvasSignBlock(Block.Properties.copy(Blocks.OAK_SIGN).lootFrom(BEIGE_CANVAS_SIGN), ExtraDyeColors.OLIVE));
    public static final RegistryObject<Block> TURQUOISE_CANVAS_SIGN = BLOCKS.register("turquoise_canvas_sign",
            () -> new StandingCanvasSignBlock(ExtraDyeColors.TURQUOISE));
    public static final RegistryObject<Block> TURQUOISE_CANVAS_WALL_SIGN = BLOCKS.register("turquoise_canvas_wall_sign",
            () -> new WallCanvasSignBlock(Block.Properties.copy(Blocks.OAK_SIGN).lootFrom(BEIGE_CANVAS_SIGN), ExtraDyeColors.TURQUOISE));
    public static final RegistryObject<Block> AMBER_CANVAS_SIGN =  BLOCKS.register("amber_canvas_sign",
            () -> new StandingCanvasSignBlock(ExtraDyeColors.AMBER));
    public static final RegistryObject<Block> AMBER_CANVAS_WALL_SIGN = BLOCKS.register("amber_canvas_wall_sign",
            () -> new WallCanvasSignBlock(Block.Properties.copy(Blocks.OAK_SIGN).lootFrom(AMBER_CANVAS_SIGN), ExtraDyeColors.AMBER));
    public static final RegistryObject<Block> BUBBLEGUM_CANVAS_SIGN = BLOCKS.register("bubblegum_canvas_sign",
            () -> new StandingCanvasSignBlock(ExtraDyeColors.BUBBLEGUM));
    public static final RegistryObject<Block> BUBBLEGUM_CANVAS_WALL_SIGN = BLOCKS.register("bubblegum_canvas_wall_sign",
            () -> new WallCanvasSignBlock(Block.Properties.copy(Blocks.OAK_SIGN).lootFrom(BUBBLEGUM_CANVAS_SIGN), ExtraDyeColors.BUBBLEGUM));
    public static final RegistryObject<Block> BORDEAUX_CANVAS_SIGN = BLOCKS.register("bordeaux_canvas_sign",
            () -> new StandingCanvasSignBlock(ExtraDyeColors.BORDEAUX));
    public static final RegistryObject<Block> BORDEAUX_CANVAS_WALL_SIGN = BLOCKS.register("bordeaux_canvas_wall_sign",
            () -> new WallCanvasSignBlock(Block.Properties.copy(Blocks.OAK_SIGN).lootFrom(BORDEAUX_CANVAS_SIGN), ExtraDyeColors.BORDEAUX));
    public static final RegistryObject<Block> ENDER_CANVAS_SIGN = BLOCKS.register("ender_canvas_sign",
            () -> new StandingCanvasSignBlock(ExtraDyeColors.ENDER));
    public static final RegistryObject<Block> ENDER_CANVAS_WALL_SIGN = BLOCKS.register("ender_canvas_wall_sign",
            () -> new WallCanvasSignBlock(Block.Properties.copy(Blocks.OAK_SIGN).lootFrom(ENDER_CANVAS_SIGN), ExtraDyeColors.ENDER));
    public static final RegistryObject<Block> MINT_CANVAS_SIGN = BLOCKS.register("mint_canvas_sign",
            () -> new StandingCanvasSignBlock(ExtraDyeColors.MINT));
    public static final RegistryObject<Block> MINT_CANVAS_WALL_SIGN = BLOCKS.register("mint_canvas_wall_sign",
            () -> new WallCanvasSignBlock(Block.Properties.copy(Blocks.OAK_SIGN).lootFrom(MINT_CANVAS_SIGN), ExtraDyeColors.MINT));
    public static final RegistryObject<Block> INDIGO_CANVAS_SIGN = BLOCKS.register("indigo_canvas_sign",
            () -> new StandingCanvasSignBlock(ExtraDyeColors.INDIGO));
    public static final RegistryObject<Block> INDIGO_CANVAS_WALL_SIGN = BLOCKS.register("indigo_canvas_wall_sign",
            () -> new WallCanvasSignBlock(Block.Properties.copy(Blocks.OAK_SIGN).lootFrom(INDIGO_CANVAS_SIGN), ExtraDyeColors.INDIGO));
    public static final RegistryObject<Block> OCHRE_CANVAS_SIGN = BLOCKS.register("ochre_canvas_sign",
            () -> new StandingCanvasSignBlock(ExtraDyeColors.OCHRE));
    public static final RegistryObject<Block> OCHRE_CANVAS_WALL_SIGN = BLOCKS.register("ochre_canvas_wall_sign",
            () -> new WallCanvasSignBlock(Block.Properties.copy(Blocks.OAK_SIGN).lootFrom(OCHRE_CANVAS_SIGN), ExtraDyeColors.OCHRE));
    public static final RegistryObject<Block> LAVENDER_CANVAS_SIGN = BLOCKS.register("lavender_canvas_sign",
            () -> new StandingCanvasSignBlock(ExtraDyeColors.LAVENDER));
    public static final RegistryObject<Block> LAVENDER_CANVAS_WALL_SIGN = BLOCKS.register("lavender_canvas_wall_sign",
            () -> new WallCanvasSignBlock(Block.Properties.copy(Blocks.OAK_SIGN).lootFrom(LAVENDER_CANVAS_SIGN), ExtraDyeColors.LAVENDER));


    //ITEMS
    public static final RegistryObject<Item> CORAL_CANVAS_SIGN_ITEM = ITEMS.register("coral_canvas_sign",
            () -> new SignItem(new Item.Properties().tab(FarmersDelight.CREATIVE_TAB), CORAL_CANVAS_SIGN.get(), CORAL_CANVAS_WALL_SIGN.get()));
    public static final RegistryObject<Item> BEIGE_CANVAS_SIGN_ITEM = ITEMS.register("beige_canvas_sign",
            () -> new SignItem(new Item.Properties().tab(FarmersDelight.CREATIVE_TAB), BEIGE_CANVAS_SIGN.get(), BEIGE_CANVAS_WALL_SIGN.get()));
    public static final RegistryObject<Item> OLIVE_CANVAS_SIGN_ITEM = ITEMS.register("olive_canvas_sign",
            () -> new SignItem(new Item.Properties().tab(FarmersDelight.CREATIVE_TAB), OLIVE_CANVAS_SIGN.get(), OLIVE_CANVAS_WALL_SIGN.get()));
    public static final RegistryObject<Item> TURQUOISE_CANVAS_SIGN_ITEM = ITEMS.register("turquoise_canvas_sign",
            () -> new SignItem(new Item.Properties().tab(FarmersDelight.CREATIVE_TAB), TURQUOISE_CANVAS_SIGN.get(), TURQUOISE_CANVAS_WALL_SIGN.get()));
    public static final RegistryObject<Item> AMBER_CANVAS_SIGN_ITEM = ITEMS.register("amber_canvas_sign",
            () -> new SignItem(new Item.Properties().tab(FarmersDelight.CREATIVE_TAB), AMBER_CANVAS_SIGN.get(), AMBER_CANVAS_WALL_SIGN.get()));
    public static final RegistryObject<Item> BUBBLEGUM_CANVAS_SIGN_ITEM = ITEMS.register("bubblegum_canvas_sign",
            () -> new SignItem(new Item.Properties().tab(FarmersDelight.CREATIVE_TAB), BUBBLEGUM_CANVAS_SIGN.get(), BUBBLEGUM_CANVAS_WALL_SIGN.get()));
    public static final RegistryObject<Item> BORDEAUX_CANVAS_SIGN_ITEM = ITEMS.register("bordeaux_canvas_sign",
            () -> new SignItem(new Item.Properties().tab(FarmersDelight.CREATIVE_TAB), BORDEAUX_CANVAS_SIGN.get(), BORDEAUX_CANVAS_WALL_SIGN.get()));
    public static final RegistryObject<Item> ENDER_CANVAS_SIGN_ITEM = ITEMS.register("ender_canvas_sign",
            () -> new SignItem(new Item.Properties().tab(FarmersDelight.CREATIVE_TAB), ENDER_CANVAS_SIGN.get(), ENDER_CANVAS_WALL_SIGN.get()));
    public static final RegistryObject<Item> MINT_CANVAS_SIGN_ITEM = ITEMS.register("mint_canvas_sign",
            () -> new SignItem(new Item.Properties().tab(FarmersDelight.CREATIVE_TAB), MINT_CANVAS_SIGN.get(), MINT_CANVAS_WALL_SIGN.get()));
    public static final RegistryObject<Item> INDIGO_CANVAS_SIGN_ITEM = ITEMS.register("indigo_canvas_sign",
            () -> new SignItem(new Item.Properties().tab(FarmersDelight.CREATIVE_TAB), INDIGO_CANVAS_SIGN.get(), INDIGO_CANVAS_WALL_SIGN.get()));
    public static final RegistryObject<Item> OCHRE_CANVAS_SIGN_ITEM = ITEMS.register("ochre_canvas_sign",
            () -> new SignItem(new Item.Properties().tab(FarmersDelight.CREATIVE_TAB), OCHRE_CANVAS_SIGN.get(), OCHRE_CANVAS_WALL_SIGN.get()));
    public static final RegistryObject<Item> LAVENDER_CANVAS_SIGN_ITEM = ITEMS.register("lavender_canvas_sign",
            () -> new SignItem(new Item.Properties().tab(FarmersDelight.CREATIVE_TAB), LAVENDER_CANVAS_SIGN.get(), LAVENDER_CANVAS_WALL_SIGN.get()));

}
