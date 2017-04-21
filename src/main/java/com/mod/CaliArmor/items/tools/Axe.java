package com.mod.CaliArmor.items.tools;

import com.mod.CaliArmor.CaliArmor;

import net.minecraft.item.ItemPickaxe;

public class Axe extends ItemPickaxe 
{

	public Axe(String name, ToolMaterial material) {
		super(material);
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
		this.setCreativeTab(CaliArmor.armorTab);
	}

}
