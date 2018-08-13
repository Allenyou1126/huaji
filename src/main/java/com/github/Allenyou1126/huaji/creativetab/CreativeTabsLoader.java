package com.github.Allenyou1126.huaji.creativetab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CreativeTabsLoader{
    public static CreativeTabs tabHuaji;

    public CreativeTabsLoader(FMLPreInitializationEvent event){
        tabHuaji = new CreativeTabsHuaji();
    }
}