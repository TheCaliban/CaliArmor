package com.mod.CaliArmor.blocks;

import com.mod.CaliArmor.CaliArmor;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BasicBlock extends Block
{
	public BasicBlock(String name, Material material, float hardness, float resistance)
	{
		super(material);
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setCreativeTab(CaliArmor.armorTab);
		this.setLightLevel(1.0f);
	}
}
