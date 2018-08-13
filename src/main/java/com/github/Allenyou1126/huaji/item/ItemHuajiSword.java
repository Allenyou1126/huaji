package com.github.Allenyou1126.huaji.item;

import com.github.Allenyou1126.huaji.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ItemHuajiSword extends ItemSword{
	 public static final Item.ToolMaterial HUAJI = EnumHelper.addToolMaterial("HUAJI", 3, 2333, 16.0F, 50.0F, 10);
	 public ItemHuajiSword(){
		 super(HUAJI);
		 this.setUnlocalizedName("huajiSword");
		 this.setCreativeTab(CreativeTabsLoader.tabHuaji);
	 }
}
