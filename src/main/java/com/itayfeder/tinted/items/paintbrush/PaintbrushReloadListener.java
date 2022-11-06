package com.itayfeder.tinted.items.paintbrush;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.gson.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.server.packs.resources.SimpleJsonResourceReloadListener;
import net.minecraft.util.profiling.ProfilerFiller;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Map;
import java.util.Set;

public class PaintbrushReloadListener extends SimpleJsonResourceReloadListener {
    public static final PaintbrushReloadListener INSTANCE;
    public static final Gson GSON = new GsonBuilder().create();
    public final BiMap<ResourceLocation, PaintbrushDye> paintbrushDyes;

    public PaintbrushReloadListener() {
        super(GSON, "paintbrush_dye");
        this.paintbrushDyes = HashBiMap.create();
    }

    static {
        INSTANCE = new PaintbrushReloadListener();
    }

    public Set<PaintbrushDye> getPaintbrushDyes() {
        return paintbrushDyes.values();
    }

    public PaintbrushDye getCurrentDye(BlockState block) {
        for (PaintbrushDye recipe : this.getPaintbrushDyes()) {
            if (recipe.CanUseRecipe(block)) {
                return recipe;
            }
        }
        return null;
    }

    protected void apply(Map<ResourceLocation, JsonElement> objectIn, ResourceManager resourceManagerIn, ProfilerFiller profilerIn) {
        for (Map.Entry<ResourceLocation, JsonElement> entry : objectIn.entrySet()) {
            ResourceLocation name = entry.getKey();
            String[] split = name.getPath().split("/");
            if (split[split.length - 1].startsWith("_"))
                continue;
            JsonObject json = entry.getValue().getAsJsonObject();
            try {
                PaintbrushDye recipe = PaintbrushDye.deserialize(json);
                paintbrushDyes.put(name, recipe);
            } catch (IllegalArgumentException | JsonParseException e) {
                System.out.println(String.format("I got an error!!!: ", e));
            }
        }

        System.out.println(String.format("%s Paintbrush Dyes loaded successfully !", paintbrushDyes.size()));
    }
}
