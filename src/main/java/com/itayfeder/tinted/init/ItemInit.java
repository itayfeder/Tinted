package com.itayfeder.tinted.init;

import com.itayfeder.tinted.TintedMod;
import com.itayfeder.tinted.items.paintbrush.PaintbrushItem;
import com.itayfeder.tinted.util.ExtraDyeColors;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TintedMod.MODID);

    public static final RegistryObject<Item> PAINTBRUSH = ITEMS.register("paintbrush", () -> new PaintbrushItem((new Item.Properties()).stacksTo(1).tab(CreativeModeTab.TAB_TOOLS)));

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

    public static final RegistryObject<Item> TURQUOISE_WOOL = ITEMS.register("turquoise_wool", () -> new BlockItem(BlockInit.TURQUOISE_WOOL.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> TURQUOISE_TERRACOTTA = ITEMS.register("turquoise_terracotta", () -> new BlockItem(BlockInit.TURQUOISE_TERRACOTTA.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> TURQUOISE_STAINED_GLASS = ITEMS.register("turquoise_stained_glass", () -> new BlockItem(BlockInit.TURQUOISE_STAINED_GLASS.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> TURQUOISE_CONCRETE = ITEMS.register("turquoise_concrete", () -> new BlockItem(BlockInit.TURQUOISE_CONCRETE.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> TURQUOISE_CONCRETE_POWDER = ITEMS.register("turquoise_concrete_powder", () -> new BlockItem(BlockInit.TURQUOISE_CONCRETE_POWDER.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> TURQUOISE_CARPET = ITEMS.register("turquoise_carpet", () -> new BlockItem(BlockInit.TURQUOISE_CARPET.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> TURQUOISE_STAINED_GLASS_PANE = ITEMS.register("turquoise_stained_glass_pane", () -> new BlockItem(BlockInit.TURQUOISE_STAINED_GLASS_PANE.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> TURQUOISE_SHULKER_BOX = ITEMS.register("turquoise_shulker_box", () -> new BlockItem(BlockInit.TURQUOISE_SHULKER_BOX.get(), (new Item.Properties()).stacksTo(1).tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> TURQUOISE_BED = ITEMS.register("turquoise_bed", () -> new BedItem(BlockInit.TURQUOISE_BED.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> TURQUOISE_BANNER = ITEMS.register("turquoise_banner", () -> new BannerItem(BlockInit.TURQUOISE_BANNER.get(), BlockInit.TURQUOISE_WALL_BANNER.get(), (new Item.Properties()).stacksTo(16).tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> TURQUOISE_CANDLE = ITEMS.register("turquoise_candle", () -> new BlockItem(BlockInit.TURQUOISE_CANDLE.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> TURQUOISE_DYE = ITEMS.register("turquoise_dye", () -> new DyeItem(ExtraDyeColors.TURQUOISE, (new Item.Properties()).tab(CreativeModeTab.TAB_MATERIALS)));

    public static final RegistryObject<Item> AMBER_WOOL = ITEMS.register("amber_wool", () -> new BlockItem(BlockInit.AMBER_WOOL.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> AMBER_TERRACOTTA = ITEMS.register("amber_terracotta", () -> new BlockItem(BlockInit.AMBER_TERRACOTTA.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> AMBER_STAINED_GLASS = ITEMS.register("amber_stained_glass", () -> new BlockItem(BlockInit.AMBER_STAINED_GLASS.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> AMBER_CONCRETE = ITEMS.register("amber_concrete", () -> new BlockItem(BlockInit.AMBER_CONCRETE.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> AMBER_CONCRETE_POWDER = ITEMS.register("amber_concrete_powder", () -> new BlockItem(BlockInit.AMBER_CONCRETE_POWDER.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> AMBER_CARPET = ITEMS.register("amber_carpet", () -> new BlockItem(BlockInit.AMBER_CARPET.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> AMBER_STAINED_GLASS_PANE = ITEMS.register("amber_stained_glass_pane", () -> new BlockItem(BlockInit.AMBER_STAINED_GLASS_PANE.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> AMBER_SHULKER_BOX = ITEMS.register("amber_shulker_box", () -> new BlockItem(BlockInit.AMBER_SHULKER_BOX.get(), (new Item.Properties()).stacksTo(1).tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> AMBER_BED = ITEMS.register("amber_bed", () -> new BedItem(BlockInit.AMBER_BED.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> AMBER_BANNER = ITEMS.register("amber_banner", () -> new BannerItem(BlockInit.AMBER_BANNER.get(), BlockInit.AMBER_WALL_BANNER.get(), (new Item.Properties()).stacksTo(16).tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> AMBER_CANDLE = ITEMS.register("amber_candle", () -> new BlockItem(BlockInit.AMBER_CANDLE.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> AMBER_DYE = ITEMS.register("amber_dye", () -> new DyeItem(ExtraDyeColors.AMBER, (new Item.Properties()).tab(CreativeModeTab.TAB_MATERIALS)));

    public static final RegistryObject<Item> BUBBLEGUM_WOOL = ITEMS.register("bubblegum_wool", () -> new BlockItem(BlockInit.BUBBLEGUM_WOOL.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> BUBBLEGUM_TERRACOTTA = ITEMS.register("bubblegum_terracotta", () -> new BlockItem(BlockInit.BUBBLEGUM_TERRACOTTA.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> BUBBLEGUM_STAINED_GLASS = ITEMS.register("bubblegum_stained_glass", () -> new BlockItem(BlockInit.BUBBLEGUM_STAINED_GLASS.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> BUBBLEGUM_CONCRETE = ITEMS.register("bubblegum_concrete", () -> new BlockItem(BlockInit.BUBBLEGUM_CONCRETE.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> BUBBLEGUM_CONCRETE_POWDER = ITEMS.register("bubblegum_concrete_powder", () -> new BlockItem(BlockInit.BUBBLEGUM_CONCRETE_POWDER.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> BUBBLEGUM_CARPET = ITEMS.register("bubblegum_carpet", () -> new BlockItem(BlockInit.BUBBLEGUM_CARPET.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> BUBBLEGUM_STAINED_GLASS_PANE = ITEMS.register("bubblegum_stained_glass_pane", () -> new BlockItem(BlockInit.BUBBLEGUM_STAINED_GLASS_PANE.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> BUBBLEGUM_SHULKER_BOX = ITEMS.register("bubblegum_shulker_box", () -> new BlockItem(BlockInit.BUBBLEGUM_SHULKER_BOX.get(), (new Item.Properties()).stacksTo(1).tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> BUBBLEGUM_BED = ITEMS.register("bubblegum_bed", () -> new BedItem(BlockInit.BUBBLEGUM_BED.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> BUBBLEGUM_BANNER = ITEMS.register("bubblegum_banner", () -> new BannerItem(BlockInit.BUBBLEGUM_BANNER.get(), BlockInit.BUBBLEGUM_WALL_BANNER.get(), (new Item.Properties()).stacksTo(16).tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> BUBBLEGUM_CANDLE = ITEMS.register("bubblegum_candle", () -> new BlockItem(BlockInit.BUBBLEGUM_CANDLE.get(), (new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> BUBBLEGUM_DYE = ITEMS.register("bubblegum_dye", () -> new DyeItem(ExtraDyeColors.BUBBLEGUM, (new Item.Properties()).tab(CreativeModeTab.TAB_MATERIALS)));

}
