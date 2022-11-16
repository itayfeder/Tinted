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
        this.dropSelf(BlockInit.CORAL_GLAZED_TERRACOTTA.get());


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
        this.dropSelf(BlockInit.BEIGE_GLAZED_TERRACOTTA.get());


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
        this.dropSelf(BlockInit.OLIVE_GLAZED_TERRACOTTA.get());


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
        this.dropSelf(BlockInit.TURQUOISE_GLAZED_TERRACOTTA.get());


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
        this.dropSelf(BlockInit.AMBER_GLAZED_TERRACOTTA.get());


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
        this.dropSelf(BlockInit.BUBBLEGUM_GLAZED_TERRACOTTA.get());


        this.dropSelf(BlockInit.BORDEAUX_WOOL.get());
        this.dropSelf(BlockInit.BORDEAUX_TERRACOTTA.get());
        this.dropSelf(BlockInit.BORDEAUX_CARPET.get());
        this.dropSelf(BlockInit.BORDEAUX_CONCRETE.get());
        this.dropSelf(BlockInit.BORDEAUX_CONCRETE_POWDER.get());
        this.add(BlockInit.BORDEAUX_BED.get(), (p_124201_) -> {
            return createSinglePropConditionTable(p_124201_, BedBlock.PART, BedPart.HEAD);
        });
        this.add(BlockInit.BORDEAUX_CANDLE.get(), BlockLoot::createCandleDrops);
        this.add(BlockInit.BORDEAUX_SHULKER_BOX.get(), BlockLoot::createShulkerBoxDrop);
        this.add(BlockInit.BORDEAUX_BANNER.get(), BlockLoot::createBannerDrop);
        this.add(BlockInit.BORDEAUX_WALL_BANNER.get(), BlockLoot::createBannerDrop);
        this.dropWhenSilkTouch(BlockInit.BORDEAUX_STAINED_GLASS.get());
        this.dropWhenSilkTouch(BlockInit.BORDEAUX_STAINED_GLASS_PANE.get());
        this.add(BlockInit.BORDEAUX_CANDLE_CAKE.get(), createCandleCakeDrops(BlockInit.BORDEAUX_CANDLE.get()));
        this.dropSelf(BlockInit.BORDEAUX_GLAZED_TERRACOTTA.get());


        this.dropSelf(BlockInit.ENDER_WOOL.get());
        this.dropSelf(BlockInit.ENDER_TERRACOTTA.get());
        this.dropSelf(BlockInit.ENDER_CARPET.get());
        this.dropSelf(BlockInit.ENDER_CONCRETE.get());
        this.dropSelf(BlockInit.ENDER_CONCRETE_POWDER.get());
        this.add(BlockInit.ENDER_BED.get(), (p_124201_) -> {
            return createSinglePropConditionTable(p_124201_, BedBlock.PART, BedPart.HEAD);
        });
        this.add(BlockInit.ENDER_CANDLE.get(), BlockLoot::createCandleDrops);
        this.add(BlockInit.ENDER_SHULKER_BOX.get(), BlockLoot::createShulkerBoxDrop);
        this.add(BlockInit.ENDER_BANNER.get(), BlockLoot::createBannerDrop);
        this.add(BlockInit.ENDER_WALL_BANNER.get(), BlockLoot::createBannerDrop);
        this.dropWhenSilkTouch(BlockInit.ENDER_STAINED_GLASS.get());
        this.dropWhenSilkTouch(BlockInit.ENDER_STAINED_GLASS_PANE.get());
        this.add(BlockInit.ENDER_CANDLE_CAKE.get(), createCandleCakeDrops(BlockInit.ENDER_CANDLE.get()));
        this.dropSelf(BlockInit.ENDER_GLAZED_TERRACOTTA.get());


        this.dropSelf(BlockInit.MINT_WOOL.get());
        this.dropSelf(BlockInit.MINT_TERRACOTTA.get());
        this.dropSelf(BlockInit.MINT_CARPET.get());
        this.dropSelf(BlockInit.MINT_CONCRETE.get());
        this.dropSelf(BlockInit.MINT_CONCRETE_POWDER.get());
        this.add(BlockInit.MINT_BED.get(), (p_124201_) -> {
            return createSinglePropConditionTable(p_124201_, BedBlock.PART, BedPart.HEAD);
        });
        this.add(BlockInit.MINT_CANDLE.get(), BlockLoot::createCandleDrops);
        this.add(BlockInit.MINT_SHULKER_BOX.get(), BlockLoot::createShulkerBoxDrop);
        this.add(BlockInit.MINT_BANNER.get(), BlockLoot::createBannerDrop);
        this.add(BlockInit.MINT_WALL_BANNER.get(), BlockLoot::createBannerDrop);
        this.dropWhenSilkTouch(BlockInit.MINT_STAINED_GLASS.get());
        this.dropWhenSilkTouch(BlockInit.MINT_STAINED_GLASS_PANE.get());
        this.add(BlockInit.MINT_CANDLE_CAKE.get(), createCandleCakeDrops(BlockInit.MINT_CANDLE.get()));
        this.dropSelf(BlockInit.MINT_GLAZED_TERRACOTTA.get());


        this.dropSelf(BlockInit.INDIGO_WOOL.get());
        this.dropSelf(BlockInit.INDIGO_TERRACOTTA.get());
        this.dropSelf(BlockInit.INDIGO_CARPET.get());
        this.dropSelf(BlockInit.INDIGO_CONCRETE.get());
        this.dropSelf(BlockInit.INDIGO_CONCRETE_POWDER.get());
        this.add(BlockInit.INDIGO_BED.get(), (p_124201_) -> {
            return createSinglePropConditionTable(p_124201_, BedBlock.PART, BedPart.HEAD);
        });
        this.add(BlockInit.INDIGO_CANDLE.get(), BlockLoot::createCandleDrops);
        this.add(BlockInit.INDIGO_SHULKER_BOX.get(), BlockLoot::createShulkerBoxDrop);
        this.add(BlockInit.INDIGO_BANNER.get(), BlockLoot::createBannerDrop);
        this.add(BlockInit.INDIGO_WALL_BANNER.get(), BlockLoot::createBannerDrop);
        this.dropWhenSilkTouch(BlockInit.INDIGO_STAINED_GLASS.get());
        this.dropWhenSilkTouch(BlockInit.INDIGO_STAINED_GLASS_PANE.get());
        this.add(BlockInit.INDIGO_CANDLE_CAKE.get(), createCandleCakeDrops(BlockInit.INDIGO_CANDLE.get()));
        this.dropSelf(BlockInit.INDIGO_GLAZED_TERRACOTTA.get());


        this.dropSelf(BlockInit.OCHRE_WOOL.get());
        this.dropSelf(BlockInit.OCHRE_TERRACOTTA.get());
        this.dropSelf(BlockInit.OCHRE_CARPET.get());
        this.dropSelf(BlockInit.OCHRE_CONCRETE.get());
        this.dropSelf(BlockInit.OCHRE_CONCRETE_POWDER.get());
        this.add(BlockInit.OCHRE_BED.get(), (p_124201_) -> {
            return createSinglePropConditionTable(p_124201_, BedBlock.PART, BedPart.HEAD);
        });
        this.add(BlockInit.OCHRE_CANDLE.get(), BlockLoot::createCandleDrops);
        this.add(BlockInit.OCHRE_SHULKER_BOX.get(), BlockLoot::createShulkerBoxDrop);
        this.add(BlockInit.OCHRE_BANNER.get(), BlockLoot::createBannerDrop);
        this.add(BlockInit.OCHRE_WALL_BANNER.get(), BlockLoot::createBannerDrop);
        this.dropWhenSilkTouch(BlockInit.OCHRE_STAINED_GLASS.get());
        this.dropWhenSilkTouch(BlockInit.OCHRE_STAINED_GLASS_PANE.get());
        this.add(BlockInit.OCHRE_CANDLE_CAKE.get(), createCandleCakeDrops(BlockInit.OCHRE_CANDLE.get()));
        this.dropSelf(BlockInit.OCHRE_GLAZED_TERRACOTTA.get());


        this.dropSelf(BlockInit.LAVENDER_WOOL.get());
        this.dropSelf(BlockInit.LAVENDER_TERRACOTTA.get());
        this.dropSelf(BlockInit.LAVENDER_CARPET.get());
        this.dropSelf(BlockInit.LAVENDER_CONCRETE.get());
        this.dropSelf(BlockInit.LAVENDER_CONCRETE_POWDER.get());
        this.add(BlockInit.LAVENDER_BED.get(), (p_124201_) -> {
            return createSinglePropConditionTable(p_124201_, BedBlock.PART, BedPart.HEAD);
        });
        this.add(BlockInit.LAVENDER_CANDLE.get(), BlockLoot::createCandleDrops);
        this.add(BlockInit.LAVENDER_SHULKER_BOX.get(), BlockLoot::createShulkerBoxDrop);
        this.add(BlockInit.LAVENDER_BANNER.get(), BlockLoot::createBannerDrop);
        this.add(BlockInit.LAVENDER_WALL_BANNER.get(), BlockLoot::createBannerDrop);
        this.dropWhenSilkTouch(BlockInit.LAVENDER_STAINED_GLASS.get());
        this.dropWhenSilkTouch(BlockInit.LAVENDER_STAINED_GLASS_PANE.get());
        this.add(BlockInit.LAVENDER_CANDLE_CAKE.get(), createCandleCakeDrops(BlockInit.LAVENDER_CANDLE.get()));
        this.dropSelf(BlockInit.LAVENDER_GLAZED_TERRACOTTA.get());


        this.dropSelf(BlockInit.CHARTREUSE_WOOL.get());
        this.dropSelf(BlockInit.CHARTREUSE_TERRACOTTA.get());
        this.dropSelf(BlockInit.CHARTREUSE_CARPET.get());
        this.dropSelf(BlockInit.CHARTREUSE_CONCRETE.get());
        this.dropSelf(BlockInit.CHARTREUSE_CONCRETE_POWDER.get());
        this.add(BlockInit.CHARTREUSE_BED.get(), (p_124201_) -> {
            return createSinglePropConditionTable(p_124201_, BedBlock.PART, BedPart.HEAD);
        });
        this.add(BlockInit.CHARTREUSE_CANDLE.get(), BlockLoot::createCandleDrops);
        this.add(BlockInit.CHARTREUSE_SHULKER_BOX.get(), BlockLoot::createShulkerBoxDrop);
        this.add(BlockInit.CHARTREUSE_BANNER.get(), BlockLoot::createBannerDrop);
        this.add(BlockInit.CHARTREUSE_WALL_BANNER.get(), BlockLoot::createBannerDrop);
        this.dropWhenSilkTouch(BlockInit.CHARTREUSE_STAINED_GLASS.get());
        this.dropWhenSilkTouch(BlockInit.CHARTREUSE_STAINED_GLASS_PANE.get());
        this.add(BlockInit.CHARTREUSE_CANDLE_CAKE.get(), createCandleCakeDrops(BlockInit.CHARTREUSE_CANDLE.get()));
        this.dropSelf(BlockInit.CHARTREUSE_GLAZED_TERRACOTTA.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }

}
