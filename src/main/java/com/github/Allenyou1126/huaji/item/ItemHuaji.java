package com.github.Allenyou1126.huaji.item;

import com.github.Allenyou1126.huaji.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;

public class ItemHuaji extends Item {
	public ItemHuaji(){
		super();
		this.setCreativeTab(CreativeTabsLoader.tabHuaji);
		this.setUnlocalizedName("huaji");
	}
}
