package com.github.Allenyou1126.huaji.block;

import net.minecraft.block.Block;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockLoader {
	public static Block huajiOre = new BlockHuajiOre();

    public BlockLoader(FMLPreInitializationEvent event){
        register(huajiOre, "huaji_ore");
    }
    @SideOnly(Side.CLIENT)
    public static void registerRenders(){
        registerRender(huajiOre);
    }
    private static void registerRender(Block block) {
    	ModelResourceLocation model = new ModelResourceLocation(block.getRegistryName(), "inventory");
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, model);
		
	}
	private static void register(Block block, String name){
        GameRegistry.registerBlock(block.setRegistryName(name));
    }
}
