package com.itayfeder.tinted.compat.cloudstorage;

import com.itayfeder.tinted.init.BlockInit;
import com.itayfeder.tinted.mixin.compat.cloudstorage.SkyTempleBlockProcessorAccessor;
import com.itayfeder.tinted.util.ExtraDyeColors;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;

import java.util.HashMap;
import java.util.Map;

public class CloudStorageCompat {
    public static void AddWoolToBalloons() {
        Map<DyeColor, Block> newColors = new HashMap<>();
        for (Map.Entry<DyeColor, Block> entry : SkyTempleBlockProcessorAccessor.getColor().entrySet()) {
            newColors.put(entry.getKey(), entry.getValue());
        }

        newColors.put(ExtraDyeColors.CORAL, BlockInit.CORAL_WOOL.get());
        newColors.put(ExtraDyeColors.BEIGE, BlockInit.BEIGE_WOOL.get());
        newColors.put(ExtraDyeColors.OLIVE, BlockInit.OLIVE_WOOL.get());
        newColors.put(ExtraDyeColors.TURQUOISE, BlockInit.TURQUOISE_WOOL.get());
        newColors.put(ExtraDyeColors.AMBER, BlockInit.AMBER_WOOL.get());
        newColors.put(ExtraDyeColors.BUBBLEGUM, BlockInit.BUBBLEGUM_WOOL.get());
        newColors.put(ExtraDyeColors.BORDEAUX, BlockInit.BORDEAUX_WOOL.get());
        newColors.put(ExtraDyeColors.ENDER, BlockInit.ENDER_WOOL.get());
        newColors.put(ExtraDyeColors.MINT, BlockInit.MINT_WOOL.get());
        newColors.put(ExtraDyeColors.INDIGO, BlockInit.INDIGO_WOOL.get());
        newColors.put(ExtraDyeColors.OCHRE, BlockInit.OCHRE_WOOL.get());
        newColors.put(ExtraDyeColors.LAVENDER, BlockInit.LAVENDER_WOOL.get());
        newColors.put(ExtraDyeColors.CHARTREUSE, BlockInit.CHARTREUSE_WOOL.get());

        SkyTempleBlockProcessorAccessor.setColor(newColors);

    }
}
