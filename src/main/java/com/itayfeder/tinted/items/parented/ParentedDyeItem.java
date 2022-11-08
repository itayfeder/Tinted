package com.itayfeder.tinted.items.parented;

import net.minecraft.core.NonNullList;
import net.minecraft.world.item.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ParentedDyeItem extends DyeItem {
    private final Item parentItem;
    private static final Map<Item, List<Item>> itemIndexes = new HashMap<>();

    public ParentedDyeItem(DyeColor p_41080_, Properties p_41081_, Item parentItem) {
        super(p_41080_, p_41081_);
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
