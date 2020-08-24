package com.example.examplemod.util;
import com.example.examplemod.ExampleMod;
import com.example.examplemod.items.FoodTotem;
import com.example.examplemod.items.PoopItem;

import net.minecraft.item.Item;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import com.example.examplemod.items.ItemBase;
import com.example.examplemod.blocks.RubyBlock;
import com.example.examplemod.blocks.PoopBlock;
import com.example.examplemod.blocks.BlockItemBase;
import com.example.examplemod.items.DirtFood;
import com.example.examplemod.items.DiamondFood;
import com.example.examplemod.items.IronFood;
import com.example.examplemod.items.GoldFood;
import com.example.examplemod.items.RedstoneFood;
import com.example.examplemod.items.EmeraldFood;

public class RegistryHandler{

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, ExampleMod.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, ExampleMod.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
    // Items
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);
    public static final RegistryObject<Item> POOP = ITEMS.register("poop", PoopItem::new);
    public static final RegistryObject<FoodTotem> FOOD_TOTEM = ITEMS.register("food_totem", FoodTotem::new);
    public static final RegistryObject<DirtFood> DIRT_FOOD = ITEMS.register("dirt_food", DirtFood::new);
    public static final RegistryObject<DiamondFood> DIAMOND_FOOD = ITEMS.register("diamond_food", DiamondFood::new);
     public static final RegistryObject<IronFood> IRON_FOOD = ITEMS.register("iron_food", IronFood::new);
     public static final RegistryObject<GoldFood> GOLD_FOOD = ITEMS.register("gold_food", GoldFood::new);
     public static final RegistryObject<RedstoneFood> REDSTONE_FOOD = ITEMS.register("redstone_food", RedstoneFood::new);
     public static final RegistryObject<EmeraldFood> EMERALD_FOOD = ITEMS.register("emerald_food",EmeraldFood::new);
    //public static final RegistryObject<BedrockFood> BEDROCK_FOOD = ITEMS.register("bedrock_food", BedrockFood::new);

    // Blocks
    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", RubyBlock::new);
    public static final RegistryObject<Block> POOP_BLOCK = BLOCKS.register("poop_block", PoopBlock::new);

    // Block Items
    public static final RegistryObject<Item> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block", () -> new BlockItemBase(RUBY_BLOCK.get()));
    public static final RegistryObject<Item> POOP_BLOCK_ITEM = ITEMS.register("poop_block", () -> new BlockItemBase(POOP_BLOCK.get()));

}