package com.grismarpickles.lozitemsmobs.items;

import com.grismarpickles.lozitemsmobs.LoZItemsMobs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item
{

    public ItemBase()
    {
        super(new Item.Properties().tab(LoZItemsMobs.TAB));
    }
}
