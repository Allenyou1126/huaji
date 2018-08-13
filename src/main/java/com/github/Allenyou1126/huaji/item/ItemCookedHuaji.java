package com.github.Allenyou1126.huaji.item;

import com.github.Allenyou1126.huaji.creativetab.CreativeTabsLoader;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemCookedHuaji extends ItemFood {
	public ItemCookedHuaji(){
        super(5, 1.0F, false);
        this.setAlwaysEdible();
        this.setUnlocalizedName("cookedHuaji");
        this.setCreativeTab(CreativeTabsLoader.tabHuaji);
    }
	@Override
    public void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player){
        if (!worldIn.isRemote){
            player.addPotionEffect(new PotionEffect(Potion.saturation.id, 200, 1));
            player.addExperience(10);
            player.addPotionEffect(new PotionEffect(Potion.absorption.id, 200, 1));
            player.addExperience(10);
        }
        super.onFoodEaten(stack, worldIn, player);
    }
}
