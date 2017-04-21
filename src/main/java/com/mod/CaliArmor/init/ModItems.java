package com.mod.CaliArmor.init;

import java.util.ArrayList;

import com.mod.CaliArmor.CaliArmor;
import com.mod.CaliArmor.items.armor.*;
import com.mod.CaliArmor.items.tools.*;
import com.mod.CaliArmor.utils.*;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems
{
	/*
	
	public static Item stone_helmet, stone_chestplate, stone_leggings, stone_boots;
	public static Item kevlar_helmet, kevlar_chestplate, kevlar_leggings, kevlar_boots;
	public static Item volcanite_helmet, volcanite_chestplate, volcanite_leggings, volcanite_boots;
	
	*/
	
	public static Item volcanite_ingot;
	public static Item kevlar_plate;
	public static Item volcanite_pickaxe, volcanite_axe, volcanite_shovel, volcanite_hoe, volcanite_sword;
	
	private static ArrayList<Item> items;
	
	public static void initItems()
	{
		
		new ModArmors();
		
		//Initializing material
		
		volcanite_ingot = new Item().setRegistryName("volcanite_ingot").setUnlocalizedName("volcanite_ingot").setCreativeTab(CaliArmor.armorTab);
		kevlar_plate = new Item().setRegistryName("kevlar_plate").setUnlocalizedName("kevlar_plate").setCreativeTab(CaliArmor.armorTab);
		
		//Initializing tool
		
		volcanite_pickaxe = new Pickaxe("volcanite_pickaxe", ToolMaterials.volcaniteMat);
		volcanite_axe = new Axe("volcanite_axe", ToolMaterials.volcaniteMat);
		volcanite_shovel = new Shovel("volcanite_shovel", ToolMaterials.volcaniteMat);
		volcanite_sword = new Sword("volcanite_sword", ToolMaterials.volcaniteMat);
		volcanite_hoe = new Hoe("volcanite_hoe", ToolMaterials.volcaniteMat);
		
		//Add all item in array list to register easier
		
		items = new ArrayList<Item>();
		items.add(volcanite_ingot);
		items.add(kevlar_plate);
		items.add(volcanite_axe);
		items.add(volcanite_pickaxe);
		items.add(volcanite_shovel);
		items.add(volcanite_sword);
		items.add(volcanite_hoe);
		
		for (Item armor : ModArmors.getArmors())
		{
			items.add(armor);
		}
	}
	
	public static void registerItems()
	{
		for(Item item : items)
		{
			registerItem(item);
		}
	}
	
	@SideOnly(Side.CLIENT)
	public static void registerRenders()
	{
		for(Item item : items)
		{
			registerRender(item, 0);
		}
	}
	
	private static void registerItem(Item item)
	{
		GameRegistry.register(item);
	}
	
	private static void registerRender(Item item, int meta)
	{
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(new ResourceLocation(References.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
	}
}
