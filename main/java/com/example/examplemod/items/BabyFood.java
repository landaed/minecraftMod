package com.example.examplemod.items;

import com.example.examplemod.ExampleMod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class BabyFood extends Item {
    public BabyFood() {
        super(new Item.Properties()
                .group(ExampleMod.TAB)
                .food(new Food.Builder()
                    .hunger(10)
                    .saturation(1.2f)
                    .effect(new EffectInstance(Effects.LEVITATION,1000,1),1)
                    .effect(new EffectInstance(Effects.MINING_FATIGUE,1000,3),1)
                    .effect(new EffectInstance(Effects.SLOWNESS),1000,3),1)
                    .effect(new EffectInstance(Effects.WEAKNESS),1000,3),1)
                    .build()
            )
        );
    }
}
