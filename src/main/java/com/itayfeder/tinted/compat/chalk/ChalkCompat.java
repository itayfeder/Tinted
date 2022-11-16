package com.itayfeder.tinted.compat.chalk;



import com.itayfeder.tinted.util.ExtraDyeColors;
import io.github.mortuusars.chalk.Chalk;
import io.github.mortuusars.chalk.blocks.ChalkMarkBlock;
import io.github.mortuusars.chalk.items.ChalkItem;
import io.github.mortuusars.chalk.render.ChalkColors;
import io.github.mortuusars.chalk.setup.ModBlocks;
import io.github.mortuusars.chalk.setup.ModItems;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ChalkCompat {
    private static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Chalk.MOD_ID);
    private static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Chalk.MOD_ID);

    public static void RegisterRegistries(IEventBus modEventBus) {
        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);
    }

    //BLOCKS
    public static final RegistryObject<ChalkMarkBlock> CORAL_CHALK_MARK_BLOCK = createColoredMark("coral_chalk_mark", ExtraDyeColors.CORAL, ExtraDyeColors.CORAL.getMaterialColor());
    public static final RegistryObject<ChalkMarkBlock> BEIGE_CHALK_MARK_BLOCK = createColoredMark("beige_chalk_mark", ExtraDyeColors.BEIGE, ExtraDyeColors.BEIGE.getMaterialColor());
    public static final RegistryObject<ChalkMarkBlock> OLIVE_CHALK_MARK_BLOCK = createColoredMark("olive_chalk_mark", ExtraDyeColors.OLIVE, ExtraDyeColors.OLIVE.getMaterialColor());
    public static final RegistryObject<ChalkMarkBlock> TURQUOISE_CHALK_MARK_BLOCK = createColoredMark("turquoise_chalk_mark", ExtraDyeColors.TURQUOISE, ExtraDyeColors.TURQUOISE.getMaterialColor());
    public static final RegistryObject<ChalkMarkBlock> AMBER_CHALK_MARK_BLOCK = createColoredMark("amber_chalk_mark", ExtraDyeColors.AMBER, ExtraDyeColors.AMBER.getMaterialColor());
    public static final RegistryObject<ChalkMarkBlock> BUBBLEGUM_CHALK_MARK_BLOCK = createColoredMark("bubblegum_chalk_mark", ExtraDyeColors.BUBBLEGUM, ExtraDyeColors.BUBBLEGUM.getMaterialColor());
    public static final RegistryObject<ChalkMarkBlock> BORDEAUX_CHALK_MARK_BLOCK = createColoredMark("bordeaux_chalk_mark", ExtraDyeColors.BORDEAUX, ExtraDyeColors.BORDEAUX.getMaterialColor());
    public static final RegistryObject<ChalkMarkBlock> ENDER_CHALK_MARK_BLOCK = createColoredMark("ender_chalk_mark", ExtraDyeColors.ENDER, ExtraDyeColors.ENDER.getMaterialColor());
    public static final RegistryObject<ChalkMarkBlock> MINT_CHALK_MARK_BLOCK = createColoredMark("mint_chalk_mark", ExtraDyeColors.MINT, ExtraDyeColors.MINT.getMaterialColor());
    public static final RegistryObject<ChalkMarkBlock> INDIGO_CHALK_MARK_BLOCK = createColoredMark("indigo_chalk_mark", ExtraDyeColors.INDIGO, ExtraDyeColors.INDIGO.getMaterialColor());
    public static final RegistryObject<ChalkMarkBlock> OCHRE_CHALK_MARK_BLOCK = createColoredMark("ochre_chalk_mark", ExtraDyeColors.OCHRE, ExtraDyeColors.OCHRE.getMaterialColor());
    public static final RegistryObject<ChalkMarkBlock> LAVENDER_CHALK_MARK_BLOCK = createColoredMark("lavender_chalk_mark", ExtraDyeColors.LAVENDER, ExtraDyeColors.LAVENDER.getMaterialColor());
    public static final RegistryObject<ChalkMarkBlock> CHARTREUSE_CHALK_MARK_BLOCK = createColoredMark("chartreuse_chalk_mark", ExtraDyeColors.CHARTREUSE, ExtraDyeColors.CHARTREUSE.getMaterialColor());

    //ITEMS
    public static RegistryObject<ChalkItem> CORAL_CHALK = registerTintedColoredChalk(ExtraDyeColors.CORAL);
    public static RegistryObject<ChalkItem> BEIGE_CHALK = registerTintedColoredChalk(ExtraDyeColors.BEIGE);
    public static RegistryObject<ChalkItem> OLIVE_CHALK = registerTintedColoredChalk(ExtraDyeColors.OLIVE);
    public static RegistryObject<ChalkItem> TURQUOISE_CHALK = registerTintedColoredChalk(ExtraDyeColors.TURQUOISE);
    public static RegistryObject<ChalkItem> AMBER_CHALK = registerTintedColoredChalk(ExtraDyeColors.AMBER);
    public static RegistryObject<ChalkItem> BUBBLEGUM_CHALK = registerTintedColoredChalk(ExtraDyeColors.BUBBLEGUM);
    public static RegistryObject<ChalkItem> BORDEAUX_CHALK = registerTintedColoredChalk(ExtraDyeColors.BORDEAUX);
    public static RegistryObject<ChalkItem> ENDER_CHALK = registerTintedColoredChalk(ExtraDyeColors.ENDER);
    public static RegistryObject<ChalkItem> MINT_CHALK = registerTintedColoredChalk(ExtraDyeColors.MINT);
    public static RegistryObject<ChalkItem> INDIGO_CHALK = registerTintedColoredChalk(ExtraDyeColors.INDIGO);
    public static RegistryObject<ChalkItem> OCHRE_CHALK = registerTintedColoredChalk(ExtraDyeColors.OCHRE);
    public static RegistryObject<ChalkItem> LAVENDER_CHALK = registerTintedColoredChalk(ExtraDyeColors.LAVENDER);
    public static RegistryObject<ChalkItem> CHARTREUSE_CHALK = registerTintedColoredChalk(ExtraDyeColors.CHARTREUSE);


    private static RegistryObject<ChalkItem> registerTintedColoredChalk(DyeColor dyeColor){
        if (ExtraDyeColors.MY_NEW_DYES.contains(dyeColor)) {
            String registryName = dyeColor.toString() + "_chalk";
            RegistryObject<ChalkItem> item = ITEMS.register(registryName, () -> new ChalkItem(dyeColor, new Item.Properties()));
            ModItems.CHALKS.put(registryName, item);
            Color color = new Color(dyeColor.getTextureDiffuseColors()[0], dyeColor.getTextureDiffuseColors()[1], dyeColor.getTextureDiffuseColors()[2]);
            ChalkColors.Colors.put(dyeColor, color.getRGB());
            return item;
        }
        return null;
    }

    private static RegistryObject<ChalkMarkBlock> createColoredMark(String registryName, DyeColor dyeColor, MaterialColor materialColor){
        RegistryObject<ChalkMarkBlock> registeredBlock = BLOCKS.register(registryName,
                () -> new ChalkMarkBlock(dyeColor, BlockBehaviour.Properties.of(Material.REPLACEABLE_FIREPROOF_PLANT, materialColor)
                        .instabreak()
                        .noOcclusion()
                        .noCollission()
                        .sound(SoundType.GRAVEL)));
        ModBlocks.MARKS.put(registryName, registeredBlock);
        return registeredBlock;
    }

    public static class ParentedChalkItem extends ChalkItem {
        private final RegistryObject<ChalkItem> parentItem;
        private static final Map<RegistryObject<ChalkItem>, List<Item>> itemIndexes = new HashMap<>();

        public ParentedChalkItem(DyeColor dyeColor, Properties properties, RegistryObject<ChalkItem> parentItem) {
            super(dyeColor, properties);
            this.parentItem = parentItem;
            if (!itemIndexes.keySet().contains(parentItem))
                itemIndexes.put(parentItem, new ArrayList<>());
            itemIndexes.get(parentItem).add(this);
        }

        /*@Override
        public void fillItemCategory(CreativeModeTab group, NonNullList<ItemStack> items) {
            if (this.allowedIn(group)) {
                List<Item> groupItems = items.stream().map(ItemStack::getItem).collect(Collectors.toList());

                if (this.allowedIn(group) && groupItems.contains(this.parentItem.get())) {
                    items.add(groupItems.indexOf(this.parentItem.get()) + 1 + itemIndexes.get(parentItem).indexOf(this), new ItemStack(this));

                }
            }

        }*/
    }

}
