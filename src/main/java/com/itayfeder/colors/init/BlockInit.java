package com.itayfeder.colors.init;

import com.itayfeder.colors.ColorsMod;
import com.itayfeder.colors.util.ExtraDyeColors;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.ShulkerBoxBlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BedPart;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.fml.util.ObfuscationReflectionHelper;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class BlockInit {
    private static BlockBehaviour.StatePredicate blockbehaviour$statepredicate = (p_152653_, p_152654_, p_152655_) -> {
        BlockEntity blockentity = p_152654_.getBlockEntity(p_152655_);
        if (!(blockentity instanceof ShulkerBoxBlockEntity)) {
            return true;
        } else {
            ShulkerBoxBlockEntity shulkerboxblockentity = (ShulkerBoxBlockEntity)blockentity;
            return shulkerboxblockentity.isClosed();
        }
    };

    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ColorsMod.MODID);

    public static final RegistryObject<Block> CORAL_WOOL = BLOCKS.register("coral_wool", () -> new Block(BlockBehaviour.Properties.of(Material.WOOL, MaterialColor.COLOR_ORANGE).strength(0.8F).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> CORAL_TERRACOTTA = BLOCKS.register("coral_terracotta", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_ORANGE).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    public static final RegistryObject<Block> CORAL_STAINED_GLASS = BLOCKS.register("coral_stained_glass", () -> new StainedGlassBlock(ExtraDyeColors.CORAL, BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_ORANGE).strength(0.3F).sound(SoundType.GLASS).noOcclusion().isValidSpawn(BlockInit::never).isRedstoneConductor(BlockInit::never).isSuffocating(BlockInit::never).isViewBlocking(BlockInit::never)));
    public static final RegistryObject<Block> CORAL_CONCRETE = BLOCKS.register("coral_concrete", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(1.8F)));
    public static final RegistryObject<Block> CORAL_CONCRETE_POWDER = BLOCKS.register("coral_concrete_powder", () -> new ConcretePowderBlock(CORAL_CONCRETE.get(), BlockBehaviour.Properties.of(Material.SAND, DyeColor.ORANGE).strength(0.5F).sound(SoundType.SAND)));
    public static final RegistryObject<Block> CORAL_CARPET = BLOCKS.register("coral_carpet", () -> new WoolCarpetBlock(ExtraDyeColors.CORAL, BlockBehaviour.Properties.of(Material.CLOTH_DECORATION, MaterialColor.COLOR_ORANGE).strength(0.1F).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> CORAL_STAINED_GLASS_PANE = BLOCKS.register("coral_stained_glass_pane", () -> new StainedGlassPaneBlock(ExtraDyeColors.CORAL, BlockBehaviour.Properties.of(Material.GLASS).strength(0.3F).sound(SoundType.GLASS).noOcclusion()));
    public static final RegistryObject<Block> CORAL_SHULKER_BOX = BLOCKS.register("coral_shulker_box", () -> new ShulkerBoxBlock(ExtraDyeColors.CORAL, BlockBehaviour.Properties.of(Material.SHULKER_SHELL, MaterialColor.COLOR_ORANGE).strength(2.0F).dynamicShape().noOcclusion().isSuffocating(blockbehaviour$statepredicate).isViewBlocking(blockbehaviour$statepredicate)));
    public static final RegistryObject<Block> CORAL_BED = BLOCKS.register("coral_bed", () -> new BedBlock(ExtraDyeColors.CORAL, BlockBehaviour.Properties.of(Material.WOOL, (p_152613_) -> {
        return p_152613_.getValue(BedBlock.PART) == BedPart.FOOT ? ExtraDyeColors.CORAL.getMaterialColor() : MaterialColor.WOOL;
    }).sound(SoundType.WOOD).strength(0.2F).noOcclusion()));
    public static final RegistryObject<Block> CORAL_BANNER = BLOCKS.register("coral_banner", () -> new BannerBlock(ExtraDyeColors.CORAL, BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CORAL_WALL_BANNER = BLOCKS.register("coral_wall_banner", () -> new WallBannerBlock(ExtraDyeColors.CORAL, BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CORAL_CANDLE = BLOCKS.register("coral_candle", () -> new CandleBlock(BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.COLOR_ORANGE).noOcclusion().strength(0.1F).sound(SoundType.CANDLE).lightLevel(CandleBlock.LIGHT_EMISSION)));
    public static final RegistryObject<Block> CORAL_CANDLE_CAKE = BLOCKS.register("coral_candle_cake", () -> new CandleCakeBlock(CORAL_CANDLE.get(), BlockBehaviour.Properties.copy(Blocks.CANDLE_CAKE)));

    public static final RegistryObject<Block> BEIGE_WOOL = BLOCKS.register("beige_wool", () -> new Block(BlockBehaviour.Properties.of(Material.WOOL, MaterialColor.SAND).strength(0.8F).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> BEIGE_TERRACOTTA = BLOCKS.register("beige_terracotta", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_WHITE).requiresCorrectToolForDrops().strength(1.25F, 4.2F)));
    public static final RegistryObject<Block> BEIGE_STAINED_GLASS = BLOCKS.register("beige_stained_glass", () -> new StainedGlassBlock(ExtraDyeColors.BEIGE, BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.SAND).strength(0.3F).sound(SoundType.GLASS).noOcclusion().isValidSpawn(BlockInit::never).isRedstoneConductor(BlockInit::never).isSuffocating(BlockInit::never).isViewBlocking(BlockInit::never)));
    public static final RegistryObject<Block> BEIGE_CONCRETE = BLOCKS.register("beige_concrete", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(1.8F)));
    public static final RegistryObject<Block> BEIGE_CONCRETE_POWDER = BLOCKS.register("beige_concrete_powder", () -> new ConcretePowderBlock(BEIGE_CONCRETE.get(), BlockBehaviour.Properties.of(Material.SAND, DyeColor.WHITE).strength(0.5F).sound(SoundType.SAND)));
    public static final RegistryObject<Block> BEIGE_CARPET = BLOCKS.register("beige_carpet", () -> new WoolCarpetBlock(ExtraDyeColors.BEIGE, BlockBehaviour.Properties.of(Material.CLOTH_DECORATION, MaterialColor.SAND).strength(0.1F).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> BEIGE_STAINED_GLASS_PANE = BLOCKS.register("beige_stained_glass_pane", () -> new StainedGlassPaneBlock(ExtraDyeColors.BEIGE, BlockBehaviour.Properties.of(Material.GLASS).strength(0.3F).sound(SoundType.GLASS).noOcclusion()));
    public static final RegistryObject<Block> BEIGE_SHULKER_BOX = BLOCKS.register("beige_shulker_box", () -> new ShulkerBoxBlock(ExtraDyeColors.BEIGE, BlockBehaviour.Properties.of(Material.SHULKER_SHELL, MaterialColor.SAND).strength(2.0F).dynamicShape().noOcclusion().isSuffocating(blockbehaviour$statepredicate).isViewBlocking(blockbehaviour$statepredicate)));
    public static final RegistryObject<Block> BEIGE_BED = BLOCKS.register("beige_bed", () -> new BedBlock(ExtraDyeColors.BEIGE, BlockBehaviour.Properties.of(Material.WOOL, (p_152613_) -> {
        return p_152613_.getValue(BedBlock.PART) == BedPart.FOOT ? ExtraDyeColors.BEIGE.getMaterialColor() : MaterialColor.WOOL;
    }).sound(SoundType.WOOD).strength(0.2F).noOcclusion()));
    public static final RegistryObject<Block> BEIGE_BANNER = BLOCKS.register("beige_banner", () -> new BannerBlock(ExtraDyeColors.BEIGE, BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BEIGE_WALL_BANNER = BLOCKS.register("beige_wall_banner", () -> new WallBannerBlock(ExtraDyeColors.BEIGE, BlockBehaviour.Properties.of(Material.WOOD).noCollission().strength(1.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BEIGE_CANDLE = BLOCKS.register("beige_candle", () -> new CandleBlock(BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.SAND).noOcclusion().strength(0.1F).sound(SoundType.CANDLE).lightLevel(CandleBlock.LIGHT_EMISSION)));
    public static final RegistryObject<Block> BEIGE_CANDLE_CAKE = BLOCKS.register("beige_candle_cake", () -> new CandleCakeBlock(BEIGE_CANDLE.get(), BlockBehaviour.Properties.copy(Blocks.CANDLE_CAKE)));


    private static boolean never(BlockState p_50806_, BlockGetter p_50807_, BlockPos p_50808_) {
        return false;
    }

    private static Boolean never(BlockState p_50779_, BlockGetter p_50780_, BlockPos p_50781_, EntityType<?> p_50782_) {
        return (boolean)false;
    }
}
