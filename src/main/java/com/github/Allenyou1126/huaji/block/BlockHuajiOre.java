package com.github.Allenyou1126.huaji.block;

import com.github.Allenyou1126.huaji.creativetab.CreativeTabsLoader;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockHuajiOre extends Block{
	public BlockHuajiOre(){
        super(Material.rock);
        this.setHarvestLevel("pickaxe",3 );
        this.setUnlocalizedName("huajiOre");
        this.setCreativeTab(CreativeTabsLoader.tabHuaji);
        this.setHardness(5.0F);
        this.setStepSound(soundTypeStone);
    }
}
