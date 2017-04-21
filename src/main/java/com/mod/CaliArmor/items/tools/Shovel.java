package com.mod.CaliArmor.items.tools;

import com.mod.CaliArmor.CaliArmor;

import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;

public class Shovel extends ItemSpade
{

	public Shovel(String name, ToolMaterial material) {
		super(material);
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
		this.setCreativeTab(CaliArmor.armorTab);
	}
}
