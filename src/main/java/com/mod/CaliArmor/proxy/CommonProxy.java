package com.mod.CaliArmor.proxy;

import com.mod.CaliArmor.init.*;

public class CommonProxy
{
	public void preInit()
	{
        ModItems.initItems();
        ModItems.registerItems();
        
        ModBlocks.init();
        ModBlocks.registerBlocks();
        ModBlocks.registerItemBlocks();
        
	}
	public void Init()
	{
		new ModRecipes().registerCraftRecipes();
		new ModRecipes().registerFurnaceRecipes();
		new ModRecipes().registerBrewingRecipes();
	}
}
