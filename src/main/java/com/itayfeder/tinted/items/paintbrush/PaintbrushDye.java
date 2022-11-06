package com.itayfeder.tinted.items.paintbrush;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.HashMap;
import java.util.Map;

public class PaintbrushDye {
    public ResourceLocation replacingTag;
    public Map<String, ResourceLocation> colorToBlock;

    public PaintbrushDye(ResourceLocation replacingTag, Map<String, ResourceLocation> colorToBlock) {
        this.replacingTag = replacingTag;
        this.colorToBlock = colorToBlock;
    }

    @Override
    public String toString() {
        return String.format("PaintbrushDye[replacingTag: %s, colorToBlock: %s]", this.replacingTag.toString(), this.colorToBlock.toString());
    }

    public boolean CanUseRecipe(BlockState block) {
        //ResourceLocation blockLocation = block.getRegistryName();
        TagKey<Block> tag = TagKey.create(Registry.BLOCK_REGISTRY, this.replacingTag);
        return block.is(tag);
    }

    public static PaintbrushDye deserialize(JsonObject json) {
        if (!json.isJsonObject())
            throw new JsonParseException("PaintArrowDye must be a JSON Object");

        JsonObject jsonObject = json.getAsJsonObject();
        String ingrid = GsonHelper.getAsString(jsonObject, "recplaceTag", "test");
        ResourceLocation ingridId = ResourceLocation.tryParse(ingrid);
        if (ingridId == null)
            throw new JsonParseException("recplaceTag is not valid");

        JsonElement coloredElement = json.get("colored");
        if (coloredElement == null)
            throw new JsonParseException("colored is not valid");
        Map<String, ResourceLocation> colorMap = new HashMap<>();
        for(DyeColor color : DyeColor.values()) {
            String location = GsonHelper.getAsString(coloredElement.getAsJsonObject(), color.getName(), null);
            try {
                ResourceLocation locationid = ResourceLocation.tryParse(location);
                if (locationid == null)
                    throw new JsonParseException("colored." + color.getName() + " is not valid");
                colorMap.put(color.getName(), locationid);
            } catch (Exception e) {

            }
        }

        return new PaintbrushDye(ingridId, colorMap);

    }

    public TagKey<Block> getReplacingTag() {
        TagKey<Block> tag = TagKey.create(Registry.BLOCK_REGISTRY, this.replacingTag);
        return tag;
    }

    public Map<DyeColor, Block> getColorToBlock() {
        Map<DyeColor, Block> actualColorToBlock = new HashMap<>();
        for (Map.Entry<String, ResourceLocation> entry : this.colorToBlock.entrySet()) {
            actualColorToBlock.put(DyeColor.byName(entry.getKey(), DyeColor.WHITE), ForgeRegistries.BLOCKS.getValue(entry.getValue()));
        }
        return actualColorToBlock;
    }
}
