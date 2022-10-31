package com.itayfeder.tinted.init;

import com.itayfeder.tinted.TintedMod;
import com.itayfeder.tinted.util.ExtraDyeColors;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TintedMod.MODID);

    public static final RegistryObject<Item> CORAL_WOOL = ITEMS.register("coral_wool", () -> new BlockItem(BlockInit.CORAL_WOOL.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> CORAL_TERRACOTTA = ITEMS.register("coral_terracotta", () -> new BlockItem(BlockInit.CORAL_TERRACOTTA.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> CORAL_STAINED_GLASS = ITEMS.register("coral_stained_glass", () -> new BlockItem(BlockInit.CORAL_STAINED_GLASS.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> CORAL_CONCRETE = ITEMS.register("coral_concrete", () -> new BlockItem(BlockInit.CORAL_CONCRETE.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> CORAL_CONCRETE_POWDER = ITEMS.register("coral_concrete_powder", () -> new BlockItem(BlockInit.CORAL_CONCRETE_POWDER.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> CORAL_CARPET = ITEMS.register("coral_carpet", () -> new BlockItem(BlockInit.CORAL_CARPET.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> CORAL_STAINED_GLASS_PANE = ITEMS.register("coral_stained_glass_pane", () -> new BlockItem(BlockInit.CORAL_STAINED_GLASS_PANE.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> CORAL_SHULKER_BOX = ITEMS.register("coral_shulker_box", () -> new BlockItem(BlockInit.CORAL_SHULKER_BOX.get(), (new Item.Properties()).stacksTo(1).tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> CORAL_BED = ITEMS.register("coral_bed", () -> new BedItem(BlockInit.CORAL_BED.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> CORAL_BANNER = ITEMS.register("coral_banner", () -> new BannerItem(BlockInit.CORAL_BANNER.get(), BlockInit.CORAL_WALL_BANNER.get(), (new Item.Properties()).stacksTo(16).tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> CORAL_CANDLE = ITEMS.register("coral_candle", () -> new BlockItem(BlockInit.CORAL_CANDLE.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> CORAL_DYE = ITEMS.register("coral_dye", () -> new DyeItem(ExtraDyeColors.CORAL, (new Item.Properties()).tab(CreativeModeTab.TAB_MATERIALS)));

    public static final RegistryObject<Item> BEIGE_WOOL = ITEMS.register("beige_wool", () -> new BlockItem(BlockInit.BEIGE_WOOL.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> BEIGE_TERRACOTTA = ITEMS.register("beige_terracotta", () -> new BlockItem(BlockInit.BEIGE_TERRACOTTA.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> BEIGE_STAINED_GLASS = ITEMS.register("beige_stained_glass", () -> new BlockItem(BlockInit.BEIGE_STAINED_GLASS.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> BEIGE_CONCRETE = ITEMS.register("beige_concrete", () -> new BlockItem(BlockInit.BEIGE_CONCRETE.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> BEIGE_CONCRETE_POWDER = ITEMS.register("beige_concrete_powder", () -> new BlockItem(BlockInit.BEIGE_CONCRETE_POWDER.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> BEIGE_CARPET = ITEMS.register("beige_carpet", () -> new BlockItem(BlockInit.BEIGE_CARPET.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> BEIGE_STAINED_GLASS_PANE = ITEMS.register("beige_stained_glass_pane", () -> new BlockItem(BlockInit.BEIGE_STAINED_GLASS_PANE.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> BEIGE_SHULKER_BOX = ITEMS.register("beige_shulker_box", () -> new BlockItem(BlockInit.BEIGE_SHULKER_BOX.get(), (new Item.Properties()).stacksTo(1).tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> BEIGE_BED = ITEMS.register("beige_bed", () -> new BedItem(BlockInit.BEIGE_BED.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> BEIGE_BANNER = ITEMS.register("beige_banner", () -> new BannerItem(BlockInit.BEIGE_BANNER.get(), BlockInit.BEIGE_WALL_BANNER.get(), (new Item.Properties()).stacksTo(16).tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> BEIGE_CANDLE = ITEMS.register("beige_candle", () -> new BlockItem(BlockInit.BEIGE_CANDLE.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> BEIGE_DYE = ITEMS.register("beige_dye", () -> new DyeItem(ExtraDyeColors.BEIGE, (new Item.Properties()).tab(CreativeModeTab.TAB_MATERIALS)));

    public static final RegistryObject<Item> OLIVE_WOOL = ITEMS.register("olive_wool", () -> new BlockItem(BlockInit.OLIVE_WOOL.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> OLIVE_TERRACOTTA = ITEMS.register("olive_terracotta", () -> new BlockItem(BlockInit.OLIVE_TERRACOTTA.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> OLIVE_STAINED_GLASS = ITEMS.register("olive_stained_glass", () -> new BlockItem(BlockInit.OLIVE_STAINED_GLASS.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> OLIVE_CONCRETE = ITEMS.register("olive_concrete", () -> new BlockItem(BlockInit.OLIVE_CONCRETE.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> OLIVE_CONCRETE_POWDER = ITEMS.register("olive_concrete_powder", () -> new BlockItem(BlockInit.OLIVE_CONCRETE_POWDER.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> OLIVE_CARPET = ITEMS.register("olive_carpet", () -> new BlockItem(BlockInit.OLIVE_CARPET.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> OLIVE_STAINED_GLASS_PANE = ITEMS.register("olive_stained_glass_pane", () -> new BlockItem(BlockInit.OLIVE_STAINED_GLASS_PANE.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> OLIVE_SHULKER_BOX = ITEMS.register("olive_shulker_box", () -> new BlockItem(BlockInit.OLIVE_SHULKER_BOX.get(), (new Item.Properties()).stacksTo(1).tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> OLIVE_BED = ITEMS.register("olive_bed", () -> new BedItem(BlockInit.OLIVE_BED.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> OLIVE_BANNER = ITEMS.register("olive_banner", () -> new BannerItem(BlockInit.OLIVE_BANNER.get(), BlockInit.OLIVE_WALL_BANNER.get(), (new Item.Properties()).stacksTo(16).tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> OLIVE_CANDLE = ITEMS.register("olive_candle", () -> new BlockItem(BlockInit.OLIVE_CANDLE.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> OLIVE_DYE = ITEMS.register("olive_dye", () -> new DyeItem(ExtraDyeColors.OLIVE, (new Item.Properties()).tab(CreativeModeTab.TAB_MATERIALS)));

}
