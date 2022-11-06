package com.itayfeder.tinted.data.lootTables;

import com.itayfeder.tinted.init.BlockInit;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.properties.BedPart;
import net.minecraftforge.registries.RegistryObject;

public class ColorBlockLoot extends BlockLoot {
    @Override
    protected void addTables() {
        this.dropSelf(BlockInit.CORAL_WOOL.get());
        this.dropSelf(BlockInit.CORAL_TERRACOTTA.get());
        this.dropSelf(BlockInit.CORAL_CARPET.get());
        this.dropSelf(BlockInit.CORAL_CONCRETE.get());
        this.dropSelf(BlockInit.CORAL_CONCRETE_POWDER.get());
        this.add(BlockInit.CORAL_BED.get(), (p_124201_) -> {
            return createSinglePropConditionTable(p_124201_, BedBlock.PART, BedPart.HEAD);
        });
        this.add(BlockInit.CORAL_CANDLE.get(), BlockLoot::createCandleDrops);
        this.add(BlockInit.CORAL_SHULKER_BOX.get(), BlockLoot::createShulkerBoxDrop);
        this.add(BlockInit.CORAL_BANNER.get(), BlockLoot::createBannerDrop);
        this.add(BlockInit.CORAL_WALL_BANNER.get(), BlockLoot::createBannerDrop);
        this.dropWhenSilkTouch(BlockInit.CORAL_STAINED_GLASS.get());
        this.dropWhenSilkTouch(BlockInit.CORAL_STAINED_GLASS_PANE.get());
        this.add(BlockInit.CORAL_CANDLE_CAKE.get(), createCandleCakeDrops(BlockInit.CORAL_CANDLE.get()));


        this.dropSelf(BlockInit.BEIGE_WOOL.get());
        this.dropSelf(BlockInit.BEIGE_TERRACOTTA.get());
        this.dropSelf(BlockInit.BEIGE_CARPET.get());
        this.dropSelf(BlockInit.BEIGE_CONCRETE.get());
        this.dropSelf(BlockInit.BEIGE_CONCRETE_POWDER.get());
        this.add(BlockInit.BEIGE_BED.get(), (p_124201_) -> {
            return createSinglePropConditionTable(p_124201_, BedBlock.PART, BedPart.HEAD);
        });
        this.add(BlockInit.BEIGE_CANDLE.get(), BlockLoot::createCandleDrops);
        this.add(BlockInit.BEIGE_SHULKER_BOX.get(), BlockLoot::createShulkerBoxDrop);
        this.add(BlockInit.BEIGE_BANNER.get(), BlockLoot::createBannerDrop);
        this.add(BlockInit.BEIGE_WALL_BANNER.get(), BlockLoot::createBannerDrop);
        this.dropWhenSilkTouch(BlockInit.BEIGE_STAINED_GLASS.get());
        this.dropWhenSilkTouch(BlockInit.BEIGE_STAINED_GLASS_PANE.get());
        this.add(BlockInit.BEIGE_CANDLE_CAKE.get(), createCandleCakeDrops(BlockInit.BEIGE_CANDLE.get()));


        this.dropSelf(BlockInit.OLIVE_WOOL.get());
        this.dropSelf(BlockInit.OLIVE_TERRACOTTA.get());
        this.dropSelf(BlockInit.OLIVE_CARPET.get());
        this.dropSelf(BlockInit.OLIVE_CONCRETE.get());
        this.dropSelf(BlockInit.OLIVE_CONCRETE_POWDER.get());
        this.add(BlockInit.OLIVE_BED.get(), (p_124201_) -> {
            return createSinglePropConditionTable(p_124201_, BedBlock.PART, BedPart.HEAD);
        });
        this.add(BlockInit.OLIVE_CANDLE.get(), BlockLoot::createCandleDrops);
        this.add(BlockInit.OLIVE_SHULKER_BOX.get(), BlockLoot::createShulkerBoxDrop);
        this.add(BlockInit.OLIVE_BANNER.get(), BlockLoot::createBannerDrop);
        this.add(BlockInit.OLIVE_WALL_BANNER.get(), BlockLoot::createBannerDrop);
        this.dropWhenSilkTouch(BlockInit.OLIVE_STAINED_GLASS.get());
        this.dropWhenSilkTouch(BlockInit.OLIVE_STAINED_GLASS_PANE.get());
        this.add(BlockInit.OLIVE_CANDLE_CAKE.get(), createCandleCakeDrops(BlockInit.OLIVE_CANDLE.get()));


        this.dropSelf(BlockInit.TURQUOISE_WOOL.get());
        this.dropSelf(BlockInit.TURQUOISE_TERRACOTTA.get());
        this.dropSelf(BlockInit.TURQUOISE_CARPET.get());
        this.dropSelf(BlockInit.TURQUOISE_CONCRETE.get());
        this.dropSelf(BlockInit.TURQUOISE_CONCRETE_POWDER.get());
        this.add(BlockInit.TURQUOISE_BED.get(), (p_124201_) -> {
            return createSinglePropConditionTable(p_124201_, BedBlock.PART, BedPart.HEAD);
        });
        this.add(BlockInit.TURQUOISE_CANDLE.get(), BlockLoot::createCandleDrops);
        this.add(BlockInit.TURQUOISE_SHULKER_BOX.get(), BlockLoot::createShulkerBoxDrop);
        this.add(BlockInit.TURQUOISE_BANNER.get(), BlockLoot::createBannerDrop);
        this.add(BlockInit.TURQUOISE_WALL_BANNER.get(), BlockLoot::createBannerDrop);
        this.dropWhenSilkTouch(BlockInit.TURQUOISE_STAINED_GLASS.get());
        this.dropWhenSilkTouch(BlockInit.TURQUOISE_STAINED_GLASS_PANE.get());
        this.add(BlockInit.TURQUOISE_CANDLE_CAKE.get(), createCandleCakeDrops(BlockInit.TURQUOISE_CANDLE.get()));


        this.dropSelf(BlockInit.AMBER_WOOL.get());
        this.dropSelf(BlockInit.AMBER_TERRACOTTA.get());
        this.dropSelf(BlockInit.AMBER_CARPET.get());
        this.dropSelf(BlockInit.AMBER_CONCRETE.get());
        this.dropSelf(BlockInit.AMBER_CONCRETE_POWDER.get());
        this.add(BlockInit.AMBER_BED.get(), (p_124201_) -> {
            return createSinglePropConditionTable(p_124201_, BedBlock.PART, BedPart.HEAD);
        });
        this.add(BlockInit.AMBER_CANDLE.get(), BlockLoot::createCandleDrops);
        this.add(BlockInit.AMBER_SHULKER_BOX.get(), BlockLoot::createShulkerBoxDrop);
        this.add(BlockInit.AMBER_BANNER.get(), BlockLoot::createBannerDrop);
        this.add(BlockInit.AMBER_WALL_BANNER.get(), BlockLoot::createBannerDrop);
        this.dropWhenSilkTouch(BlockInit.AMBER_STAINED_GLASS.get());
        this.dropWhenSilkTouch(BlockInit.AMBER_STAINED_GLASS_PANE.get());
        this.add(BlockInit.AMBER_CANDLE_CAKE.get(), createCandleCakeDrops(BlockInit.AMBER_CANDLE.get()));


        this.dropSelf(BlockInit.BUBBLEGUM_WOOL.get());
        this.dropSelf(BlockInit.BUBBLEGUM_TERRACOTTA.get());
        this.dropSelf(BlockInit.BUBBLEGUM_CARPET.get());
        this.dropSelf(BlockInit.BUBBLEGUM_CONCRETE.get());
        this.dropSelf(BlockInit.BUBBLEGUM_CONCRETE_POWDER.get());
        this.add(BlockInit.BUBBLEGUM_BED.get(), (p_124201_) -> {
            return createSinglePropConditionTable(p_124201_, BedBlock.PART, BedPart.HEAD);
        });
        this.add(BlockInit.BUBBLEGUM_CANDLE.get(), BlockLoot::createCandleDrops);
        this.add(BlockInit.BUBBLEGUM_SHULKER_BOX.get(), BlockLoot::createShulkerBoxDrop);
        this.add(BlockInit.BUBBLEGUM_BANNER.get(), BlockLoot::createBannerDrop);
        this.add(BlockInit.BUBBLEGUM_WALL_BANNER.get(), BlockLoot::createBannerDrop);
        this.dropWhenSilkTouch(BlockInit.BUBBLEGUM_STAINED_GLASS.get());
        this.dropWhenSilkTouch(BlockInit.BUBBLEGUM_STAINED_GLASS_PANE.get());
        this.add(BlockInit.BUBBLEGUM_CANDLE_CAKE.get(), createCandleCakeDrops(BlockInit.BUBBLEGUM_CANDLE.get()));





    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }

}
