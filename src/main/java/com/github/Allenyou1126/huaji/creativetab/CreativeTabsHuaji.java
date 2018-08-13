package com.github.Allenyou1126.huaji.creativetab;

import com.github.Allenyou1126.huaji.item.ItemLoader;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabsHuaji extends CreativeTabs{
    public CreativeTabsHuaji(){
        super("huaji");
    }

    @Override
    public Item getTabIconItem(){
        return ItemLoader.Huaji;
    }
}