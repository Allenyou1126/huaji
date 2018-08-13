package com.github.Allenyou1126.huaji.client;

import com.github.Allenyou1126.huaji.block.BlockLoader;
import com.github.Allenyou1126.huaji.item.ItemLoader;

public class ItemRenderLoader {
	 public ItemRenderLoader(){
		 ItemLoader.registerRenders();
		 BlockLoader.registerRenders();
	 }
}
