package com.mod.CaliArmor.proxy;

import com.mod.CaliArmor.init.ModBlocks;
import com.mod.CaliArmor.init.ModItems;

public class ClientProxy extends CommonProxy
{
	@Override
	public void preInit()
	{
		super.preInit();
        ModItems.registerRenders();
        
        ModBlocks.registerRenderBlocks();
        
	}
	@Override
	public void Init()
	{
		super.Init();
	}
}