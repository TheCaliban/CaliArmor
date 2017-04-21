package com.mod.CaliArmor.items.armor;

import com.mod.CaliArmor.CaliArmor;
import com.mod.CaliArmor.init.ModArmors;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class Armor extends ItemArmor
{
	int x = 0;
	public Armor(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn)
	{
		super(materialIn, renderIndexIn, equipmentSlotIn);
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
		this.setCreativeTab(CaliArmor.armorTab);
	}
	
	//Bug here on server error when complete armor is worn
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
	{
			if(!world.isRemote)
			{
				if(player.inventory.armorItemInSlot(0) != null)
				{
					player.addPotionEffect(new PotionEffect(Potion.getPotionById(12), 8, 2));
				}
			}
	}
}
