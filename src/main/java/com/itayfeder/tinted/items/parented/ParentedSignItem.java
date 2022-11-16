package com.itayfeder.tinted.items.parented;

import net.minecraft.core.NonNullList;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SignItem;
import net.minecraft.world.level.block.Block;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ParentedSignItem extends SignItem {
    private final Item parentItem;
    private static final Map<Item, List<Item>> itemIndexes = new HashMap<>();

    public ParentedSignItem(Properties p_43126_, Block p_43127_, Block p_43128_, Item parentItem) {
        super(p_43126_, p_43127_, p_43128_);
        this.parentItem = parentItem;
        if (!itemIndexes.keySet().contains(parentItem))
            itemIndexes.put(parentItem, new ArrayList<>());
        itemIndexes.get(parentItem).add(this);
    }

    @Override
    public void fillItemCategory(CreativeModeTab group, NonNullList<ItemStack> items) {
        if (this.allowedIn(group)) {
            List<Item> groupItems = items.stream().map(ItemStack::getItem).collect(Collectors.toList());

            if (this.allowedIn(group) && groupItems.contains(this.parentItem)) {
                items.add(groupItems.indexOf(this.parentItem) + 1 + itemIndexes.get(parentItem).indexOf(this), new ItemStack(this));

            }
        }

    }
}
