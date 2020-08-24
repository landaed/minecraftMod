package com.example.examplemod.items;

import com.example.examplemod.ExampleMod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class DiamondFood extends Item {
    public DiamondFood() {
        super(new Item.Properties()
                .group(ExampleMod.TAB)
                .food(new Food.Builder()
                        .hunger(20)
                        .saturation(45f)
                        .effect(new EffectInstance(Effects.LUCK,100000000,4),1)
                        .effect(new EffectInstance(Effects.HEALTH_BOOST,100000000,100),1)
                        .effect(new EffectInstance(Effects.INSTANT_HEALTH,100000000,100),1)
                        .build()
                )
        );
    }
}
