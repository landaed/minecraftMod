package com.example.examplemod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class PoopBlock extends Block {

    public PoopBlock(){
        super(Block.Properties
                .create(Material.DRAGON_EGG)
                .hardnessAndResistance(5.0f,6.0f)
                .sound(SoundType.WET_GRASS)
                .harvestLevel(3)
                .harvestTool(ToolType.SHOVEL));
    }

}
