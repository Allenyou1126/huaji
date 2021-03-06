package com.github.Allenyou1126.huaji.item;

import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemLoader {
	public static Item Huaji =new ItemHuaji();
	public static Item cookedHuaji = new ItemCookedHuaji();
	public static Item huajiSword = new ItemHuajiSword();
	
	public ItemLoader(FMLPreInitializationEvent event){
		register(cookedHuaji,"cooked_huaji");
		register(Huaji,"huaji");
		register(huajiSword,"huaji_sword");
	}
	@SideOnly(Side.CLIENT)
    public static void registerRenders(){
        registerRender(Huaji);
        registerRender(huajiSword);
        registerRender(cookedHuaji);
    }
	private static void register(Item item, String name){
        GameRegistry.registerItem(item.setRegistryName(name));
    }
	@SideOnly(Side.CLIENT)
    private static void registerRender(Item item){
        ModelResourceLocation model = new ModelResourceLocation(item.getRegistryName(), "inventory");
        ModelLoader.setCustomModelResourceLocation(item, 0, model);
    }
}
