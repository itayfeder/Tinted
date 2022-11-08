package com.itayfeder.tinted.compat.another_furniture;

import com.google.common.collect.ImmutableSet;
import com.itayfeder.tinted.util.ExtraDyeColors;
import com.starfish_studios.another_furniture.AnotherFurniture;
import com.starfish_studios.another_furniture.block.*;
import com.starfish_studios.another_furniture.block.properties.ModBlockStateProperties;
import com.starfish_studios.another_furniture.registry.AFBlockEntityTypes;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.Material;
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
        curtainList.add(TURQUOISE_CURTAIN.get());
        curtainList.add(AMBER_CURTAIN.get());
        curtainList.add(BUBBLEGUM_CURTAIN.get());
        curtainList.add(BORDEAUX_CURTAIN.get());
        curtainList.add(ENDER_CURTAIN.get());
        curtainList.add(MINT_CURTAIN.get());
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
    public static final RegistryObject<Block> TURQUOISE_STOOL = BLOCKS.register("turquoise_stool", () -> {
        return new StoolBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F, 3.0F).sound(SoundType.WOOD));
    });
    public static final Supplier<Block> TURQUOISE_CURTAIN = BLOCKS.register("turquoise_curtain", () -> {
        return new CurtainBlock(ExtraDyeColors.TURQUOISE, BlockBehaviour.Properties.of(Material.WOOL).strength(0.1F).sound(SoundType.WOOL).noOcclusion());
    });
    public static final Supplier<Block> TURQUOISE_LAMP = BLOCKS.register("turquoise_lamp", () -> {
        return new LampBlock(ExtraDyeColors.TURQUOISE, BlockBehaviour.Properties.of(Material.WOOD).lightLevel((blockState) -> {
            return (Boolean)blockState.getValue(BlockStateProperties.LIT) ? (Integer)blockState.getValue(ModBlockStateProperties.LEVEL_1_3) * 5 : 0;
        }).strength(2.0F, 3.0F).sound(SoundType.WOOD));
    });
    public static final Supplier<Block> TURQUOISE_SOFA = BLOCKS.register("turquoise_sofa", () -> {
        return new SofaBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F, 3.0F).sound(SoundType.WOOD));
    });
    public static final Supplier<Block> TURQUOISE_TALL_STOOL = BLOCKS.register("turquoise_tall_stool", () -> {
        return new TallStoolBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F, 3.0F).sound(SoundType.WOOD));
    });
    public static final RegistryObject<Block> AMBER_STOOL = BLOCKS.register("amber_stool", () -> {
        return new StoolBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F, 3.0F).sound(SoundType.WOOD));
    });
    public static final Supplier<Block> AMBER_CURTAIN = BLOCKS.register("amber_curtain", () -> {
        return new CurtainBlock(ExtraDyeColors.AMBER, BlockBehaviour.Properties.of(Material.WOOL).strength(0.1F).sound(SoundType.WOOL).noOcclusion());
    });
    public static final Supplier<Block> AMBER_LAMP = BLOCKS.register("amber_lamp", () -> {
        return new LampBlock(ExtraDyeColors.AMBER, BlockBehaviour.Properties.of(Material.WOOD).lightLevel((blockState) -> {
            return (Boolean)blockState.getValue(BlockStateProperties.LIT) ? (Integer)blockState.getValue(ModBlockStateProperties.LEVEL_1_3) * 5 : 0;
        }).strength(2.0F, 3.0F).sound(SoundType.WOOD));
    });
    public static final Supplier<Block> AMBER_SOFA = BLOCKS.register("amber_sofa", () -> {
        return new SofaBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F, 3.0F).sound(SoundType.WOOD));
    });
    public static final Supplier<Block> AMBER_TALL_STOOL = BLOCKS.register("amber_tall_stool", () -> {
        return new TallStoolBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F, 3.0F).sound(SoundType.WOOD));
    });
    public static final RegistryObject<Block> BUBBLEGUM_STOOL = BLOCKS.register("bubblegum_stool", () -> {
        return new StoolBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F, 3.0F).sound(SoundType.WOOD));
    });
    public static final Supplier<Block> BUBBLEGUM_CURTAIN = BLOCKS.register("bubblegum_curtain", () -> {
        return new CurtainBlock(ExtraDyeColors.BUBBLEGUM, BlockBehaviour.Properties.of(Material.WOOL).strength(0.1F).sound(SoundType.WOOL).noOcclusion());
    });
    public static final Supplier<Block> BUBBLEGUM_LAMP = BLOCKS.register("bubblegum_lamp", () -> {
        return new LampBlock(ExtraDyeColors.BUBBLEGUM, BlockBehaviour.Properties.of(Material.WOOD).lightLevel((blockState) -> {
            return (Boolean)blockState.getValue(BlockStateProperties.LIT) ? (Integer)blockState.getValue(ModBlockStateProperties.LEVEL_1_3) * 5 : 0;
        }).strength(2.0F, 3.0F).sound(SoundType.WOOD));
    });
    public static final Supplier<Block> BUBBLEGUM_SOFA = BLOCKS.register("bubblegum_sofa", () -> {
        return new SofaBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F, 3.0F).sound(SoundType.WOOD));
    });
    public static final Supplier<Block> BUBBLEGUM_TALL_STOOL = BLOCKS.register("bubblegum_tall_stool", () -> {
        return new TallStoolBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F, 3.0F).sound(SoundType.WOOD));
    });
    public static final RegistryObject<Block> BORDEAUX_STOOL = BLOCKS.register("bordeaux_stool", () -> {
        return new StoolBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F, 3.0F).sound(SoundType.WOOD));
    });
    public static final Supplier<Block> BORDEAUX_CURTAIN = BLOCKS.register("bordeaux_curtain", () -> {
        return new CurtainBlock(ExtraDyeColors.BORDEAUX, BlockBehaviour.Properties.of(Material.WOOL).strength(0.1F).sound(SoundType.WOOL).noOcclusion());
    });
    public static final Supplier<Block> BORDEAUX_LAMP = BLOCKS.register("bordeaux_lamp", () -> {
        return new LampBlock(ExtraDyeColors.BORDEAUX, BlockBehaviour.Properties.of(Material.WOOD).lightLevel((blockState) -> {
            return (Boolean)blockState.getValue(BlockStateProperties.LIT) ? (Integer)blockState.getValue(ModBlockStateProperties.LEVEL_1_3) * 5 : 0;
        }).strength(2.0F, 3.0F).sound(SoundType.WOOD));
    });
    public static final Supplier<Block> BORDEAUX_SOFA = BLOCKS.register("bordeaux_sofa", () -> {
        return new SofaBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F, 3.0F).sound(SoundType.WOOD));
    });
    public static final Supplier<Block> BORDEAUX_TALL_STOOL = BLOCKS.register("bordeaux_tall_stool", () -> {
        return new TallStoolBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F, 3.0F).sound(SoundType.WOOD));
    });
    public static final RegistryObject<Block> ENDER_STOOL = BLOCKS.register("ender_stool", () -> {
        return new StoolBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F, 3.0F).sound(SoundType.WOOD));
    });
    public static final Supplier<Block> ENDER_CURTAIN = BLOCKS.register("ender_curtain", () -> {
        return new CurtainBlock(ExtraDyeColors.ENDER, BlockBehaviour.Properties.of(Material.WOOL).strength(0.1F).sound(SoundType.WOOL).noOcclusion());
    });
    public static final Supplier<Block> ENDER_LAMP = BLOCKS.register("ender_lamp", () -> {
        return new LampBlock(ExtraDyeColors.ENDER, BlockBehaviour.Properties.of(Material.WOOD).lightLevel((blockState) -> {
            return (Boolean)blockState.getValue(BlockStateProperties.LIT) ? (Integer)blockState.getValue(ModBlockStateProperties.LEVEL_1_3) * 5 : 0;
        }).strength(2.0F, 3.0F).sound(SoundType.WOOD));
    });
    public static final Supplier<Block> ENDER_SOFA = BLOCKS.register("ender_sofa", () -> {
        return new SofaBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F, 3.0F).sound(SoundType.WOOD));
    });
    public static final Supplier<Block> ENDER_TALL_STOOL = BLOCKS.register("ender_tall_stool", () -> {
        return new TallStoolBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F, 3.0F).sound(SoundType.WOOD));
    });
    public static final RegistryObject<Block> MINT_STOOL = BLOCKS.register("mint_stool", () -> {
        return new StoolBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F, 3.0F).sound(SoundType.WOOD));
    });
    public static final Supplier<Block> MINT_CURTAIN = BLOCKS.register("mint_curtain", () -> {
        return new CurtainBlock(ExtraDyeColors.MINT, BlockBehaviour.Properties.of(Material.WOOL).strength(0.1F).sound(SoundType.WOOL).noOcclusion());
    });
    public static final Supplier<Block> MINT_LAMP = BLOCKS.register("mint_lamp", () -> {
        return new LampBlock(ExtraDyeColors.MINT, BlockBehaviour.Properties.of(Material.WOOD).lightLevel((blockState) -> {
            return (Boolean)blockState.getValue(BlockStateProperties.LIT) ? (Integer)blockState.getValue(ModBlockStateProperties.LEVEL_1_3) * 5 : 0;
        }).strength(2.0F, 3.0F).sound(SoundType.WOOD));
    });
    public static final Supplier<Block> MINT_SOFA = BLOCKS.register("mint_sofa", () -> {
        return new SofaBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F, 3.0F).sound(SoundType.WOOD));
    });
    public static final Supplier<Block> MINT_TALL_STOOL = BLOCKS.register("mint_tall_stool", () -> {
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
    public static final RegistryObject<Item> TURQUOISE_STOOL_ITEM = ITEMS.register("turquoise_stool", () -> new BlockItem(TURQUOISE_STOOL.get(), (new Item.Properties()).tab(AnotherFurniture.TAB)));
    public static final RegistryObject<Item> TURQUOISE_CURTAIN_ITEM = ITEMS.register("turquoise_curtain", () -> new BlockItem(TURQUOISE_CURTAIN.get(), (new Item.Properties()).tab(AnotherFurniture.TAB)));
    public static final RegistryObject<Item> TURQUOISE_LAMP_ITEM = ITEMS.register("turquoise_lamp", () -> new BlockItem(TURQUOISE_LAMP.get(), (new Item.Properties()).tab(AnotherFurniture.TAB)));
    public static final RegistryObject<Item> TURQUOISE_SOFA_ITEM = ITEMS.register("turquoise_sofa", () -> new BlockItem(TURQUOISE_SOFA.get(), (new Item.Properties()).tab(AnotherFurniture.TAB)));
    public static final RegistryObject<Item> TURQUOISE_TALL_STOOL_ITEM = ITEMS.register("turquoise_tall_stool", () -> new BlockItem(TURQUOISE_TALL_STOOL.get(), (new Item.Properties()).tab(AnotherFurniture.TAB)));
    public static final RegistryObject<Item> AMBER_STOOL_ITEM = ITEMS.register("amber_stool", () -> new BlockItem(AMBER_STOOL.get(), (new Item.Properties()).tab(AnotherFurniture.TAB)));
    public static final RegistryObject<Item> AMBER_CURTAIN_ITEM = ITEMS.register("amber_curtain", () -> new BlockItem(AMBER_CURTAIN.get(), (new Item.Properties()).tab(AnotherFurniture.TAB)));
    public static final RegistryObject<Item> AMBER_LAMP_ITEM = ITEMS.register("amber_lamp", () -> new BlockItem(AMBER_LAMP.get(), (new Item.Properties()).tab(AnotherFurniture.TAB)));
    public static final RegistryObject<Item> AMBER_SOFA_ITEM = ITEMS.register("amber_sofa", () -> new BlockItem(AMBER_SOFA.get(), (new Item.Properties()).tab(AnotherFurniture.TAB)));
    public static final RegistryObject<Item> AMBER_TALL_STOOL_ITEM = ITEMS.register("amber_tall_stool", () -> new BlockItem(AMBER_TALL_STOOL.get(), (new Item.Properties()).tab(AnotherFurniture.TAB)));
    public static final RegistryObject<Item> BUBBLEGUM_STOOL_ITEM = ITEMS.register("bubblegum_stool", () -> new BlockItem(BUBBLEGUM_STOOL.get(), (new Item.Properties()).tab(AnotherFurniture.TAB)));
    public static final RegistryObject<Item> BUBBLEGUM_CURTAIN_ITEM = ITEMS.register("bubblegum_curtain", () -> new BlockItem(BUBBLEGUM_CURTAIN.get(), (new Item.Properties()).tab(AnotherFurniture.TAB)));
    public static final RegistryObject<Item> BUBBLEGUM_LAMP_ITEM = ITEMS.register("bubblegum_lamp", () -> new BlockItem(BUBBLEGUM_LAMP.get(), (new Item.Properties()).tab(AnotherFurniture.TAB)));
    public static final RegistryObject<Item> BUBBLEGUM_SOFA_ITEM = ITEMS.register("bubblegum_sofa", () -> new BlockItem(BUBBLEGUM_SOFA.get(), (new Item.Properties()).tab(AnotherFurniture.TAB)));
    public static final RegistryObject<Item> BUBBLEGUM_TALL_STOOL_ITEM = ITEMS.register("bubblegum_tall_stool", () -> new BlockItem(BUBBLEGUM_TALL_STOOL.get(), (new Item.Properties()).tab(AnotherFurniture.TAB)));
    public static final RegistryObject<Item> BORDEAUX_STOOL_ITEM = ITEMS.register("bordeaux_stool", () -> new BlockItem(BORDEAUX_STOOL.get(), (new Item.Properties()).tab(AnotherFurniture.TAB)));
    public static final RegistryObject<Item> BORDEAUX_CURTAIN_ITEM = ITEMS.register("bordeaux_curtain", () -> new BlockItem(BORDEAUX_CURTAIN.get(), (new Item.Properties()).tab(AnotherFurniture.TAB)));
    public static final RegistryObject<Item> BORDEAUX_LAMP_ITEM = ITEMS.register("bordeaux_lamp", () -> new BlockItem(BORDEAUX_LAMP.get(), (new Item.Properties()).tab(AnotherFurniture.TAB)));
    public static final RegistryObject<Item> BORDEAUX_SOFA_ITEM = ITEMS.register("bordeaux_sofa", () -> new BlockItem(BORDEAUX_SOFA.get(), (new Item.Properties()).tab(AnotherFurniture.TAB)));
    public static final RegistryObject<Item> BORDEAUX_TALL_STOOL_ITEM = ITEMS.register("bordeaux_tall_stool", () -> new BlockItem(BORDEAUX_TALL_STOOL.get(), (new Item.Properties()).tab(AnotherFurniture.TAB)));
    public static final RegistryObject<Item> ENDER_STOOL_ITEM = ITEMS.register("ender_stool", () -> new BlockItem(ENDER_STOOL.get(), (new Item.Properties()).tab(AnotherFurniture.TAB)));
    public static final RegistryObject<Item> ENDER_CURTAIN_ITEM = ITEMS.register("ender_curtain", () -> new BlockItem(ENDER_CURTAIN.get(), (new Item.Properties()).tab(AnotherFurniture.TAB)));
    public static final RegistryObject<Item> ENDER_LAMP_ITEM = ITEMS.register("ender_lamp", () -> new BlockItem(ENDER_LAMP.get(), (new Item.Properties()).tab(AnotherFurniture.TAB)));
    public static final RegistryObject<Item> ENDER_SOFA_ITEM = ITEMS.register("ender_sofa", () -> new BlockItem(ENDER_SOFA.get(), (new Item.Properties()).tab(AnotherFurniture.TAB)));
    public static final RegistryObject<Item> ENDER_TALL_STOOL_ITEM = ITEMS.register("ender_tall_stool", () -> new BlockItem(ENDER_TALL_STOOL.get(), (new Item.Properties()).tab(AnotherFurniture.TAB)));
    public static final RegistryObject<Item> MINT_STOOL_ITEM = ITEMS.register("mint_stool", () -> new BlockItem(MINT_STOOL.get(), (new Item.Properties()).tab(AnotherFurniture.TAB)));
    public static final RegistryObject<Item> MINT_CURTAIN_ITEM = ITEMS.register("mint_curtain", () -> new BlockItem(MINT_CURTAIN.get(), (new Item.Properties()).tab(AnotherFurniture.TAB)));
    public static final RegistryObject<Item> MINT_LAMP_ITEM = ITEMS.register("mint_lamp", () -> new BlockItem(MINT_LAMP.get(), (new Item.Properties()).tab(AnotherFurniture.TAB)));
    public static final RegistryObject<Item> MINT_SOFA_ITEM = ITEMS.register("mint_sofa", () -> new BlockItem(MINT_SOFA.get(), (new Item.Properties()).tab(AnotherFurniture.TAB)));
    public static final RegistryObject<Item> MINT_TALL_STOOL_ITEM = ITEMS.register("mint_tall_stool", () -> new BlockItem(MINT_TALL_STOOL.get(), (new Item.Properties()).tab(AnotherFurniture.TAB)));

}
