package com.mod.CaliArmor.items.tools;

import com.mod.CaliArmor.CaliArmor;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;

public class Sword extends ItemSword
{
	
	public Sword(String name, ToolMaterial material) {
		super(material);
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
		this.setCreativeTab(CaliArmor.armorTab);
	}
}
