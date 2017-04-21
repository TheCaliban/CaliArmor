package com.mod.CaliArmor.items.tools;

import com.mod.CaliArmor.CaliArmor;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item.ToolMaterial;

public class Pickaxe extends ItemPickaxe
{

	public Pickaxe(String name, ToolMaterial material) {
		super(material);
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
		this.setCreativeTab(CaliArmor.armorTab);
	}

}
