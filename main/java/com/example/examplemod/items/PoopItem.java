package com.example.examplemod.items;

import com.example.examplemod.ExampleMod;
import net.minecraft.item.Foods;
import net.minecraft.item.Item;

public class PoopItem extends Item {
    public PoopItem() {
        super(new Item.Properties().group(ExampleMod.TAB).food(Foods.APPLE));
    }
}
