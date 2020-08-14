package com.example.examplemod.items;

import com.example.examplemod.ExampleMod;
import net.minecraft.item.Item;

public class ItemBase extends Item {

    public ItemBase() {
        super(new Item.Properties().group(ExampleMod.TAB));
    }
}
