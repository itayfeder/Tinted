package com.itayfeder.colors.compat.another_furniture;

import com.google.common.collect.ImmutableSet;
import com.itayfeder.colors.ColorsMod;
import com.itayfeder.colors.init.BlockInit;
import com.itayfeder.colors.init.ItemInit;
import com.itayfeder.colors.util.ExtraDyeColors;
import com.starfish_studios.another_furniture.AnotherFurniture;
import com.starfish_studios.another_furniture.block.*;
import com.starfish_studios.another_furniture.block.properties.ModBlockStateProperties;
import com.starfish_studios.another_furniture.registry.AFBlockEntityTypes;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

public class AnotherFurnitureCompat {

    private static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, AnotherFurniture.MOD_ID);
    private static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AnotherFurniture.MOD_ID);

    public static void RegisterRegistries(IEventBus modEventBus) {
        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);
    }

    public static void AddToBlockEntities() {
        Set<Block> curtainSet = AFBlockEntityTypes.CURTAIN.get().validBlocks;
        List<Block> curtainList = new ArrayList<>();
        for (Block sbox : curtainSet) {
            curtainList.add(sbox);
        }
        curtainList.add(CORAL_CURTAIN.get());
        curtainList.add(BEIGE_CURTAIN.get());
        curtainList.add(OLIVE_CURTAIN.get());
        AFBlockEntityTypes.CURTAIN.get().validBlocks = ImmutableSet.copyOf(curtainList);
    }

    //BLOCKS
    public static final RegistryObject<Block> CORAL_STOOL = BLOCKS.register("coral_stool", () -> {
        return new StoolBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F, 3.0F).sound(SoundType.WOOD));
    });
    public static final Supplier<Block> CORAL_CURTAIN = BLOCKS.register("coral_curtain", () -> {
        return new CurtainBlock(ExtraDyeColors.CORAL, BlockBehaviour.Properties.of(Material.WOOL).strength(0.1F).sound(SoundType.WOOL).noOcclusion());
    });
    public static final Supplier<Block> CORAL_LAMP = BLOCKS.register("coral_lamp", () -> {
        return new LampBlock(ExtraDyeColors.CORAL, BlockBehaviour.Properties.of(Material.WOOD).lightLevel((blockState) -> {
            return (Boolean)blockState.getValue(BlockStateProperties.LIT) ? (Integer)blockState.getValue(ModBlockStateProperties.LEVEL_1_3) * 5 : 0;
        }).strength(2.0F, 3.0F).sound(SoundType.WOOD));
    });
    public static final Supplier<Block> CORAL_SOFA = BLOCKS.register("coral_sofa", () -> {
        return new SofaBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F, 3.0F).sound(SoundType.WOOD));
    });
    public static final Supplier<Block> CORAL_TALL_STOOL = BLOCKS.register("coral_tall_stool", () -> {
        return new TallStoolBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F, 3.0F).sound(SoundType.WOOD));
    });
    public static final RegistryObject<Block> BEIGE_STOOL = BLOCKS.register("beige_stool", () -> {
        return new StoolBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F, 3.0F).sound(SoundType.WOOD));
    });
    public static final Supplier<Block> BEIGE_CURTAIN = BLOCKS.register("beige_curtain", () -> {
        return new CurtainBlock(ExtraDyeColors.BEIGE, BlockBehaviour.Properties.of(Material.WOOL).strength(0.1F).sound(SoundType.WOOL).noOcclusion());
    });
    public static final Supplier<Block> BEIGE_LAMP = BLOCKS.register("beige_lamp", () -> {
        return new LampBlock(ExtraDyeColors.BEIGE, BlockBehaviour.Properties.of(Material.WOOD).lightLevel((blockState) -> {
            return (Boolean)blockState.getValue(BlockStateProperties.LIT) ? (Integer)blockState.getValue(ModBlockStateProperties.LEVEL_1_3) * 5 : 0;
        }).strength(2.0F, 3.0F).sound(SoundType.WOOD));
    });
    public static final Supplier<Block> BEIGE_SOFA = BLOCKS.register("beige_sofa", () -> {
        return new SofaBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F, 3.0F).sound(SoundType.WOOD));
    });
    public static final Supplier<Block> BEIGE_TALL_STOOL = BLOCKS.register("beige_tall_stool", () -> {
        return new TallStoolBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F, 3.0F).sound(SoundType.WOOD));
    });
    public static final RegistryObject<Block> OLIVE_STOOL = BLOCKS.register("olive_stool", () -> {
        return new StoolBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F, 3.0F).sound(SoundType.WOOD));
    });
    public static final Supplier<Block> OLIVE_CURTAIN = BLOCKS.register("olive_curtain", () -> {
        return new CurtainBlock(ExtraDyeColors.OLIVE, BlockBehaviour.Properties.of(Material.WOOL).strength(0.1F).sound(SoundType.WOOL).noOcclusion());
    });
    public static final Supplier<Block> OLIVE_LAMP = BLOCKS.register("olive_lamp", () -> {
        return new LampBlock(ExtraDyeColors.OLIVE, BlockBehaviour.Properties.of(Material.WOOD).lightLevel((blockState) -> {
            return (Boolean)blockState.getValue(BlockStateProperties.LIT) ? (Integer)blockState.getValue(ModBlockStateProperties.LEVEL_1_3) * 5 : 0;
        }).strength(2.0F, 3.0F).sound(SoundType.WOOD));
    });
    public static final Supplier<Block> OLIVE_SOFA = BLOCKS.register("olive_sofa", () -> {
        return new SofaBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F, 3.0F).sound(SoundType.WOOD));
    });
    public static final Supplier<Block> OLIVE_TALL_STOOL = BLOCKS.register("olive_tall_stool", () -> {
        return new TallStoolBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F, 3.0F).sound(SoundType.WOOD));
    });


    //ITEMS
    public static final RegistryObject<Item> CORAL_STOOL_ITEM = ITEMS.register("coral_stool", () -> new BlockItem(CORAL_STOOL.get(), (new Item.Properties()).tab(AnotherFurniture.TAB)));
    public static final RegistryObject<Item> CORAL_CURTAIN_ITEM = ITEMS.register("coral_curtain", () -> new BlockItem(CORAL_CURTAIN.get(), (new Item.Properties()).tab(AnotherFurniture.TAB)));
    public static final RegistryObject<Item> CORAL_LAMP_ITEM = ITEMS.register("coral_lamp", () -> new BlockItem(CORAL_LAMP.get(), (new Item.Properties()).tab(AnotherFurniture.TAB)));
    public static final RegistryObject<Item> CORAL_SOFA_ITEM = ITEMS.register("coral_sofa", () -> new BlockItem(CORAL_SOFA.get(), (new Item.Properties()).tab(AnotherFurniture.TAB)));
    public static final RegistryObject<Item> CORAL_TALL_STOOL_ITEM = ITEMS.register("coral_tall_stool", () -> new BlockItem(CORAL_TALL_STOOL.get(), (new Item.Properties()).tab(AnotherFurniture.TAB)));
    public static final RegistryObject<Item> BEIGE_STOOL_ITEM = ITEMS.register("beige_stool", () -> new BlockItem(BEIGE_STOOL.get(), (new Item.Properties()).tab(AnotherFurniture.TAB)));
    public static final RegistryObject<Item> BEIGE_CURTAIN_ITEM = ITEMS.register("beige_curtain", () -> new BlockItem(BEIGE_CURTAIN.get(), (new Item.Properties()).tab(AnotherFurniture.TAB)));
    public static final RegistryObject<Item> BEIGE_LAMP_ITEM = ITEMS.register("beige_lamp", () -> new BlockItem(BEIGE_LAMP.get(), (new Item.Properties()).tab(AnotherFurniture.TAB)));
    public static final RegistryObject<Item> BEIGE_SOFA_ITEM = ITEMS.register("beige_sofa", () -> new BlockItem(BEIGE_SOFA.get(), (new Item.Properties()).tab(AnotherFurniture.TAB)));
    public static final RegistryObject<Item> BEIGE_TALL_STOOL_ITEM = ITEMS.register("beige_tall_stool", () -> new BlockItem(BEIGE_TALL_STOOL.get(), (new Item.Properties()).tab(AnotherFurniture.TAB)));
    public static final RegistryObject<Item> OLIVE_STOOL_ITEM = ITEMS.register("olive_stool", () -> new BlockItem(OLIVE_STOOL.get(), (new Item.Properties()).tab(AnotherFurniture.TAB)));
    public static final RegistryObject<Item> OLIVE_CURTAIN_ITEM = ITEMS.register("olive_curtain", () -> new BlockItem(OLIVE_CURTAIN.get(), (new Item.Properties()).tab(AnotherFurniture.TAB)));
    public static final RegistryObject<Item> OLIVE_LAMP_ITEM = ITEMS.register("olive_lamp", () -> new BlockItem(OLIVE_LAMP.get(), (new Item.Properties()).tab(AnotherFurniture.TAB)));
    public static final RegistryObject<Item> OLIVE_SOFA_ITEM = ITEMS.register("olive_sofa", () -> new BlockItem(OLIVE_SOFA.get(), (new Item.Properties()).tab(AnotherFurniture.TAB)));
    public static final RegistryObject<Item> OLIVE_TALL_STOOL_ITEM = ITEMS.register("olive_tall_stool", () -> new BlockItem(OLIVE_TALL_STOOL.get(), (new Item.Properties()).tab(AnotherFurniture.TAB)));

}
