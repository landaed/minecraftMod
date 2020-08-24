package com.example.examplemod.items;

import com.example.examplemod.ExampleMod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class GoldFood extends Item {
    public GoldFood() {
        super(new Item.Properties()
                .group(ExampleMod.TAB)
                .food(new Food.Builder()
                    .hunger(4)
                    .saturation(1.2f)
                    .effect(new EffectInstance(Effects.HEALTH_BOOST,1000000,10000),1)
                    .effect(new EffectInstance(Effects.INSTANT_HEALTH,10000,10000000),1)
                    .build()
            )
        );
    }
}
