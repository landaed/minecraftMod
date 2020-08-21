package com.example.examplemod.items;

import com.example.examplemod.ExampleMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class FoodTotem extends Item {
    public FoodTotem() {
        super(new Item.Properties().group(ExampleMod.TAB).defaultMaxDamage(40).maxStackSize(1));
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack) {
        ItemStack stack = itemStack.copy();
        stack.setDamage(stack.getDamage()-10);
        return stack;
    }

    @Override
    public boolean hasContainerItem(ItemStack stack) {
        return true;
    }
}
