package com.itayfeder.tinted.util;

import com.google.common.collect.ImmutableSet;
import com.itayfeder.tinted.init.BlockInit;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BlockEntityAdder {
    public static void AddToBlockEntities() {
        Set<Block> shulkerSet = BlockEntityType.SHULKER_BOX.validBlocks;
        List<Block> shulkerList = new ArrayList<>();
        for (Block sbox : shulkerSet) {
            shulkerList.add(sbox);
        }
        shulkerList.add(BlockInit.CORAL_SHULKER_BOX.get());
        shulkerList.add(BlockInit.BEIGE_SHULKER_BOX.get());
        shulkerList.add(BlockInit.OLIVE_SHULKER_BOX.get());
        shulkerList.add(BlockInit.TURQUOISE_SHULKER_BOX.get());
        shulkerList.add(BlockInit.AMBER_SHULKER_BOX.get());
        shulkerList.add(BlockInit.BUBBLEGUM_SHULKER_BOX.get());
        shulkerList.add(BlockInit.BORDEAUX_SHULKER_BOX.get());
        shulkerList.add(BlockInit.ENDER_SHULKER_BOX.get());
        shulkerList.add(BlockInit.MINT_SHULKER_BOX.get());
        shulkerList.add(BlockInit.INDIGO_SHULKER_BOX.get());
        shulkerList.add(BlockInit.OCHRE_SHULKER_BOX.get());
        shulkerList.add(BlockInit.LAVENDER_SHULKER_BOX.get());
        shulkerList.add(BlockInit.CHARTREUSE_SHULKER_BOX.get());

        BlockEntityType.SHULKER_BOX.validBlocks = ImmutableSet.copyOf(shulkerList);

        Set<Block> bedSet = BlockEntityType.BED.validBlocks;
        List<Block> bedList = new ArrayList<>();
        for (Block bed : bedSet) {
            bedList.add(bed);
        }
        bedList.add(BlockInit.CORAL_BED.get());
        bedList.add(BlockInit.BEIGE_BED.get());
        bedList.add(BlockInit.OLIVE_BED.get());
        bedList.add(BlockInit.TURQUOISE_BED.get());
        bedList.add(BlockInit.AMBER_BED.get());
        bedList.add(BlockInit.BUBBLEGUM_BED.get());
        bedList.add(BlockInit.BORDEAUX_BED.get());
        bedList.add(BlockInit.ENDER_BED.get());
        bedList.add(BlockInit.MINT_BED.get());
        bedList.add(BlockInit.INDIGO_BED.get());
        bedList.add(BlockInit.OCHRE_BED.get());
        bedList.add(BlockInit.LAVENDER_BED.get());
        bedList.add(BlockInit.CHARTREUSE_BED.get());

        BlockEntityType.BED.validBlocks = ImmutableSet.copyOf(bedList);

        Set<Block> bannerSet = BlockEntityType.BANNER.validBlocks;
        List<Block> bannerList = new ArrayList<>();
        for (Block banner : bannerSet) {
            bannerList.add(banner);
        }
        bannerList.add(BlockInit.CORAL_BANNER.get());
        bannerList.add(BlockInit.CORAL_WALL_BANNER.get());
        bannerList.add(BlockInit.BEIGE_BANNER.get());
        bannerList.add(BlockInit.BEIGE_WALL_BANNER.get());
        bannerList.add(BlockInit.OLIVE_BANNER.get());
        bannerList.add(BlockInit.OLIVE_WALL_BANNER.get());
        bannerList.add(BlockInit.TURQUOISE_BANNER.get());
        bannerList.add(BlockInit.TURQUOISE_WALL_BANNER.get());
        bannerList.add(BlockInit.AMBER_BANNER.get());
        bannerList.add(BlockInit.AMBER_WALL_BANNER.get());
        bannerList.add(BlockInit.AMBER_BANNER.get());
        bannerList.add(BlockInit.AMBER_WALL_BANNER.get());
        bannerList.add(BlockInit.BUBBLEGUM_BANNER.get());
        bannerList.add(BlockInit.BUBBLEGUM_WALL_BANNER.get());
        bannerList.add(BlockInit.BORDEAUX_BANNER.get());
        bannerList.add(BlockInit.BORDEAUX_WALL_BANNER.get());
        bannerList.add(BlockInit.ENDER_BANNER.get());
        bannerList.add(BlockInit.ENDER_WALL_BANNER.get());
        bannerList.add(BlockInit.MINT_BANNER.get());
        bannerList.add(BlockInit.MINT_WALL_BANNER.get());
        bannerList.add(BlockInit.INDIGO_BANNER.get());
        bannerList.add(BlockInit.INDIGO_WALL_BANNER.get());
        bannerList.add(BlockInit.OCHRE_BANNER.get());
        bannerList.add(BlockInit.OCHRE_WALL_BANNER.get());
        bannerList.add(BlockInit.LAVENDER_BANNER.get());
        bannerList.add(BlockInit.LAVENDER_WALL_BANNER.get());
        bannerList.add(BlockInit.CHARTREUSE_BANNER.get());
        bannerList.add(BlockInit.CHARTREUSE_WALL_BANNER.get());

        BlockEntityType.BANNER.validBlocks = ImmutableSet.copyOf(bannerList);
    }
}
