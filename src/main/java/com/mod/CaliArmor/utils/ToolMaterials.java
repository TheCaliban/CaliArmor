package com.mod.CaliArmor.utils;

import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class ToolMaterials {
	public static final Item.ToolMaterial electricalMat = EnumHelper.addToolMaterial("electricalMat", 0, 150, 1.5f, 1.0f, 1);
	public static final Item.ToolMaterial volcaniteMat = EnumHelper.addToolMaterial("volcaniteMat", 2, 570, 6.5f, 2.5f, 15);
}
