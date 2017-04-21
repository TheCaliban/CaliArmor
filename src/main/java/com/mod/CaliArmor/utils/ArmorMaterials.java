package com.mod.CaliArmor.utils;

import net.minecraft.item.ItemArmor;
import net.minecraft.init.SoundEvents;
import net.minecraftforge.common.util.EnumHelper;

public class ArmorMaterials 
{
	public static final ItemArmor.ArmorMaterial stoneMat = EnumHelper.addArmorMaterial("stoneMat", References.MODID + ":stoneArmor", 300, new int[]{2, 4, 3, 2}, 5, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0);
	public static final ItemArmor.ArmorMaterial kevlarMat = EnumHelper.addArmorMaterial("kevlarMat", References.MODID + ":kevlarArmor", 300, new int[]{2, 4, 3, 2}, 5, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0);
	public static final ItemArmor.ArmorMaterial volcaniteMat = EnumHelper.addArmorMaterial("volcaniteMat", References.MODID + ":volcaniteArmor", 300, new int[]{2, 4, 3, 2}, 5, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0);

}
