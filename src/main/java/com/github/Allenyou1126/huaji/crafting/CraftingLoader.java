package com.github.Allenyou1126.huaji.crafting;

import com.github.Allenyou1126.huaji.block.BlockLoader;
import com.github.Allenyou1126.huaji.item.ItemLoader;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingLoader {
	public CraftingLoader(){
        registerRecipe();
        registerSmelting();
        registerFuel();
    }

    private static void registerRecipe(){
    	GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.huajiSword), new Object[]{
    			"#", "#", "*", '#', ItemLoader.Huaji, '*', Items.stick
    	});
    }

    private static void registerSmelting(){
    	GameRegistry.addSmelting(BlockLoader.huajiOre, new ItemStack(ItemLoader.Huaji), 0.5F);
    	GameRegistry.addSmelting(ItemLoader.Huaji, new ItemStack(ItemLoader.cookedHuaji), 0.5F);
    }

    private static void registerFuel(){

    }
}
