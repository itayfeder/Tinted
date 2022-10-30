package com.itayfeder.colors.util;

import com.google.common.collect.ImmutableSet;
import com.itayfeder.colors.init.BlockInit;
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
        BlockEntityType.SHULKER_BOX.validBlocks = ImmutableSet.copyOf(shulkerList);

        Set<Block> bedSet = BlockEntityType.BED.validBlocks;
        List<Block> bedList = new ArrayList<>();
        for (Block bed : bedSet) {
            bedList.add(bed);
        }
        bedList.add(BlockInit.CORAL_BED.get());
        bedList.add(BlockInit.BEIGE_BED.get());
        bedList.add(BlockInit.OLIVE_BED.get());
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
        BlockEntityType.BANNER.validBlocks = ImmutableSet.copyOf(bannerList);
    }
}
