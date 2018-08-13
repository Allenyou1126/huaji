package com.github.Allenyou1126.huaji.common;
import com.github.Allenyou1126.huaji.block.BlockLoader;
import com.github.Allenyou1126.huaji.crafting.CraftingLoader;
import com.github.Allenyou1126.huaji.creativetab.CreativeTabsLoader;
import com.github.Allenyou1126.huaji.item.ItemLoader;
import com.github.Allenyou1126.huaji.worldgen.WorldGeneratorLoader;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
public class CommonProxy {
	public void preInit(FMLPreInitializationEvent event){
		new CreativeTabsLoader(event);
		new ItemLoader(event);
		new BlockLoader(event);
    }

    public void init(FMLInitializationEvent event){
    	new CraftingLoader();
    	new WorldGeneratorLoader();
    }

    public void postInit(FMLPostInitializationEvent event){
    	
    }
}
