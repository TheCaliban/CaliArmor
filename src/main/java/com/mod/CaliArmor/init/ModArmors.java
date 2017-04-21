package com.mod.CaliArmor.init;

import java.util.ArrayList;
import static java.util.Arrays.asList;

import com.mod.CaliArmor.items.armor.*;
import com.mod.CaliArmor.utils.ArmorMaterials;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ModArmors
{
	//Armor
	public static ItemArmor stone_helmet, stone_chestplate, stone_leggings, stone_boots;
	public static ItemArmor kevlar_helmet, kevlar_chestplate, kevlar_leggings, kevlar_boots;
	public static ItemArmor volcanite_helmet, volcanite_chestplate, volcanite_leggings, volcanite_boots;
	
	private static Item[] armors;

	public ModArmors()
	{
		initArmor();
	}
	
	public static void initArmor()
	{
		stone_helmet = new Armor("stone_helmet", ArmorMaterials.stoneMat, 2, EntityEquipmentSlot.HEAD);
		stone_chestplate = new Armor("stone_chestplate", ArmorMaterials.stoneMat, 2, EntityEquipmentSlot.CHEST);
		stone_leggings = new Armor("stone_leggings", ArmorMaterials.stoneMat, 2, EntityEquipmentSlot.LEGS);
		stone_boots = new Armor("stone_boots", ArmorMaterials.stoneMat, 2, EntityEquipmentSlot.FEET);
		
		kevlar_helmet = new Armor("kevlar_helmet", ArmorMaterials.kevlarMat, 2, EntityEquipmentSlot.HEAD);
		kevlar_chestplate = new Armor("kevlar_chestplate", ArmorMaterials.kevlarMat, 2, EntityEquipmentSlot.CHEST);
		kevlar_leggings = new Armor("kevlar_leggings", ArmorMaterials.kevlarMat, 2, EntityEquipmentSlot.LEGS);
		kevlar_boots = new Armor("kevlar_boots", ArmorMaterials.kevlarMat, 2, EntityEquipmentSlot.FEET);
		
		volcanite_helmet = new Armor("volcanite_helmet", ArmorMaterials.volcaniteMat, 2, EntityEquipmentSlot.HEAD);
		volcanite_chestplate = new Armor("volcanite_chestplate", ArmorMaterials.volcaniteMat, 2, EntityEquipmentSlot.CHEST);
		volcanite_leggings = new Armor("volcanite_leggings", ArmorMaterials.volcaniteMat, 2, EntityEquipmentSlot.LEGS);
		volcanite_boots = new Armor("volcanite_boots", ArmorMaterials.volcaniteMat, 2, EntityEquipmentSlot.FEET);
		
		armors = new Item[]{stone_helmet, stone_chestplate, stone_leggings, stone_boots, kevlar_helmet, kevlar_chestplate, kevlar_leggings, kevlar_boots, volcanite_helmet, volcanite_chestplate, volcanite_leggings, volcanite_boots};

	}

	//List to initialize ItemArmor and not have to copy/paste
	
	public static Item[] getArmors()
	{
		return armors;
	}
}
