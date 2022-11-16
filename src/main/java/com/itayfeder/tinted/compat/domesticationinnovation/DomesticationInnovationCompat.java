package com.itayfeder.tinted.compat.domesticationinnovation;




import com.github.alexthe668.domesticationinnovation.DomesticationMod;
import com.github.alexthe668.domesticationinnovation.server.block.DITileEntityRegistry;
import com.github.alexthe668.domesticationinnovation.server.block.PetBedBlock;
import com.github.alexthe668.domesticationinnovation.server.item.DIBlockItem;
import com.github.alexthe668.domesticationinnovation.server.item.DIItemRegistry;
import com.github.alexthe668.domesticationinnovation.server.misc.DICreativeModeTab;
import com.google.common.collect.ImmutableSet;
import com.itayfeder.tinted.util.ExtraDyeColors;
import net.minecraft.core.NonNullList;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class DomesticationInnovationCompat {
    private static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, DomesticationMod.MODID);
    private static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DomesticationMod.MODID);

    public static void RegisterRegistries(IEventBus modEventBus) {
        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);
    }

    public static void AddToBlockEntities() {
        Set<Block> curtainSet = DITileEntityRegistry.PET_BED.get().validBlocks;
        List<Block> curtainList = new ArrayList<>();
        for (Block sbox : curtainSet) {
            curtainList.add(sbox);
        }
        curtainList.add(CORAL_PET_BED.get());

        DITileEntityRegistry.PET_BED.get().validBlocks = ImmutableSet.copyOf(curtainList);
    }

    public static final RegistryObject<Block> CORAL_PET_BED = registerBlockAndItem("pet_bed_coral", () -> new PetBedBlock("coral", ExtraDyeColors.CORAL));
    public static final RegistryObject<Block> BEIGE_PET_BED = registerBlockAndItem("pet_bed_beige", () -> new PetBedBlock("beige", ExtraDyeColors.BEIGE));
    public static final RegistryObject<Block> OLIVE_PET_BED = registerBlockAndItem("pet_bed_olive", () -> new PetBedBlock("olive", ExtraDyeColors.OLIVE));
    public static final RegistryObject<Block> TURQUOISE_PET_BED = registerBlockAndItem("pet_bed_turquoise", () -> new PetBedBlock("turquoise", ExtraDyeColors.TURQUOISE));
    public static final RegistryObject<Block> AMBER_PET_BED = registerBlockAndItem("pet_bed_amber", () -> new PetBedBlock("amber", ExtraDyeColors.AMBER));
    public static final RegistryObject<Block> BUBBLEGUM_PET_BED = registerBlockAndItem("pet_bed_bubblegum", () -> new PetBedBlock("bubblegum", ExtraDyeColors.BUBBLEGUM));
    public static final RegistryObject<Block> BORDEAUX_PET_BED = registerBlockAndItem("pet_bed_bordeaux", () -> new PetBedBlock("bordeaux", ExtraDyeColors.BORDEAUX));
    public static final RegistryObject<Block> ENDER_PET_BED = registerBlockAndItem("pet_bed_ender", () -> new PetBedBlock("ender", ExtraDyeColors.ENDER));
    public static final RegistryObject<Block> MINT_PET_BED = registerBlockAndItem("pet_bed_mint", () -> new PetBedBlock("mint", ExtraDyeColors.MINT));
    public static final RegistryObject<Block> INDIGO_PET_BED = registerBlockAndItem("pet_bed_indigo", () -> new PetBedBlock("indigo", ExtraDyeColors.INDIGO));
    public static final RegistryObject<Block> OCHRE_PET_BED = registerBlockAndItem("pet_bed_ochre", () -> new PetBedBlock("ochre", ExtraDyeColors.OCHRE));
    public static final RegistryObject<Block> LAVENDER_PET_BED = registerBlockAndItem("pet_bed_lavender", () -> new PetBedBlock("lavender", ExtraDyeColors.LAVENDER));
    public static final RegistryObject<Block> CHARTREUSE_PET_BED = registerBlockAndItem("pet_bed_chartreuse", () -> new PetBedBlock("chartreuse", ExtraDyeColors.CHARTREUSE));


    public static RegistryObject<Block> registerBlockAndItem(String name, Supplier<Block> block){
        RegistryObject<Block> blockObj = BLOCKS.register(name, block);
        ITEMS.register(name, () -> new ParentedDIBlockItem(blockObj, new Item.Properties().tab(DICreativeModeTab.INSTANCE), getWhitePetBed()));
        return blockObj;
    }

    private static RegistryObject<Item> getWhitePetBed() {
        for (RegistryObject<Item> object : DIItemRegistry.DEF_REG.getEntries()) {
            if (object.getId().equals(new ResourceLocation(DomesticationMod.MODID, "pet_bed_black"))) {
                return object;
            }
        }
        return null;
    }

    public static class ParentedDIBlockItem extends DIBlockItem {
        private final RegistryObject<Item> parentItem;
        private static final Map<RegistryObject<Item>, List<Item>> itemIndexes = new HashMap<>();

        public ParentedDIBlockItem(RegistryObject<Block> blockSupplier, Properties props, RegistryObject<Item> parentItem) {
            super(blockSupplier, props);
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
