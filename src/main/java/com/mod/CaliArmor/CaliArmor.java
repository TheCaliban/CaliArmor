package com.mod.CaliArmor;

import com.mod.CaliArmor.init.ModArmors;
import com.mod.CaliArmor.init.ModItems;
import com.mod.CaliArmor.proxy.CommonProxy;
import com.mod.CaliArmor.utils.References;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = References.MODID, version = References.VERSION, name = References.NAME)
public class CaliArmor 
{
	public static final CreativeTabs armorTab = new CreativeTabs("CaliArmor")
	{
		public Item getTabIconItem() 
		{
			return  ModArmors.stone_chestplate;
		}
	};
	
	@SidedProxy(clientSide = References.CLIENT_PROXY, serverSide = References.SERVER_PROXY)
	public static CommonProxy proxy;
	
	@Mod.Instance(References.MODID)
	public static CaliArmor instance;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent e)
	{
        proxy.preInit();
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent e)
	{
		proxy.Init();
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent e)
	{
		
	}
}