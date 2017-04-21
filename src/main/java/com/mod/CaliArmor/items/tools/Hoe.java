package com.mod.CaliArmor.items.tools;

import com.mod.CaliArmor.CaliArmor;

import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item.ToolMaterial;

public class Hoe extends ItemHoe
{

	public Hoe(String name, ToolMaterial material) {
		super(material);
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
		this.setCreativeTab(CaliArmor.armorTab);
	}

}
