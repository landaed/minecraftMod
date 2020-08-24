package com.example.examplemod.items;

import com.example.examplemod.ExampleMod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class IronFood extends Item {
    public IronFood() {
        super(new Item.Properties()
                .group(ExampleMod.TAB)
                .food(new Food.Builder()
                    .hunger(8)
                    .saturation(35f)
                    .effect(new EffectInstance(Effects.FIRE_RESISTANCE,10000,3),1)
                    .build()
            )
        );
    }
}
