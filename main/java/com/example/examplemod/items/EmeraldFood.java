package com.example.examplemod.items;

import com.example.examplemod.ExampleMod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class EmeraldFood extends Item {
    public EmeraldFood() {
        super(new Item.Properties()
                .group(ExampleMod.TAB)
                .food(new Food.Builder()
                    .hunger(4)
                    .saturation(1.2f)
                    .effect(new EffectInstance(Effects.HERO_OF_THE_VILLAGE,300,1),1)
                    .effect(new EffectInstance(Effects.ABSORPTON,10000000,9),1)
                    .build()
            )
        );
    }
}
