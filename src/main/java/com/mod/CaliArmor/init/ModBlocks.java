package com.mod.CaliArmor.init;

import java.util.ArrayList;

import com.mod.CaliArmor.CaliArmor;
import com.mod.CaliArmor.blocks.BasicBlock;
import com.mod.CaliArmor.utils.ArmorMaterials;
import com.mod.CaliArmor.utils.References;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks
{
	public static Block volcanite_block;

	public static void init()
	{
		volcanite_block = new BasicBlock("volcanite_block", Material.IRON, 2.0f, 10.0f);
		//volcanite_block = new Block(Material.IRON).setRegistryName("volcanite_block").setUnlocalizedName("volcanite_block").setLightLevel(1.0f).setCreativeTab(CaliArmor.armorTab);
	}
	
	public static void registerBlocks()
	{
		registerBlock(volcanite_block);
	}
	
	public static void registerRenderBlocks()
	{
		registerRenderBlock(volcanite_block, 0);
	}
	
	public static void registerItemBlocks()
	{
		registerItemBlock(volcanite_block);
	}
	
	//Methode private
	
	
	private static void registerBlock(Block block)
	{
		GameRegistry.register(block);
	}
	
	private static void registerRenderBlock(Block block, int meta)
	{
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), meta, new ModelResourceLocation(new ResourceLocation(References.MODID, block.getUnlocalizedName().substring(5)), "inventory"));
	}
	
	private static void registerItemBlock(Block block)
	{
		ItemBlock ib = new ItemBlock(block);
		ib.setRegistryName(block.getRegistryName());
		GameRegistry.register(ib);
				
	}
}
