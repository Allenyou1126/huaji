package com.github.Allenyou1126.huaji;
import com.github.Allenyou1126.huaji.common.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Huaji.MODID, name = Huaji.NAME, version = Huaji.VERSION, acceptedMinecraftVersions = "1.8.9")
public class Huaji{
    public static final String MODID = "huaji";
    public static final String NAME = "Huaji Mod";
    public static final String VERSION = "1.0.0";

    @Instance(Huaji.MODID)
    public static Huaji instance;
    
    @SidedProxy(clientSide = "com.github.Allenyou1126.huaji.client.ClientProxy", serverSide = "com.github.Allenyou1126.huaji.common.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event){
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
        proxy.postInit(event);
    }
}