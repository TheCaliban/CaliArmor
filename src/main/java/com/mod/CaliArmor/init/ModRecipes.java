package com.mod.CaliArmor.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes
{

	public void registerCraftRecipes() {
		
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.kevlar_plate, 4),new Object[]{" W ","ILI", " I ", 'W', Blocks.WOOL, 'I', Items.IRON_INGOT, 'L', Items.LEATHER});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.volcanite_ingot, 4), new Object[]{" M ", "NLN", " N ", 'M', Blocks.MAGMA, 'N', Items.NETHER_WART, 'L', Items.LEATHER});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.volcanite_ingot, 9), new Object[]{" S ", 'S', ModBlocks.volcanite_block});
		
		GameRegistry.addShapedRecipe(new ItemStack(ModArmors.stone_helmet), new Object[]{"SSS","S S", 'S', Blocks.STONE});
		GameRegistry.addShapedRecipe(new ItemStack(ModArmors.stone_chestplate), new Object[]{"S S","SSS","SSS", 'S', Blocks.STONE});
		GameRegistry.addShapedRecipe(new ItemStack(ModArmors.stone_leggings), new Object[]{"SSS","S S","S S", 'S', Blocks.STONE});
		GameRegistry.addShapedRecipe(new ItemStack(ModArmors.stone_boots), new Object[]{"S S","S S", 'S', Blocks.STONE});

		GameRegistry.addShapedRecipe(new ItemStack(ModArmors.kevlar_helmet), new Object[]{"SSS","S S", 'S', ModItems.kevlar_plate});
		GameRegistry.addShapedRecipe(new ItemStack(ModArmors.kevlar_chestplate), new Object[]{"S S","SSS","SSS", 'S', ModItems.kevlar_plate});
		GameRegistry.addShapedRecipe(new ItemStack(ModArmors.kevlar_leggings), new Object[]{"SSS","S S","S S", 'S', ModItems.kevlar_plate});
		GameRegistry.addShapedRecipe(new ItemStack(ModArmors.kevlar_boots), new Object[]{"S S","S S", 'S', ModItems.kevlar_plate});
		
		GameRegistry.addShapedRecipe(new ItemStack(ModArmors.volcanite_helmet), new Object[]{"SSS","S S", 'S', ModItems.volcanite_ingot});
		GameRegistry.addShapedRecipe(new ItemStack(ModArmors.volcanite_chestplate), new Object[]{"S S","SSS","SSS", 'S', ModItems.volcanite_ingot});
		GameRegistry.addShapedRecipe(new ItemStack(ModArmors.volcanite_leggings), new Object[]{"SSS","S S","S S", 'S', ModItems.volcanite_ingot});
		GameRegistry.addShapedRecipe(new ItemStack(ModArmors.volcanite_boots), new Object[]{"S S","S S", 'S', ModItems.volcanite_ingot});
		
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.volcanite_block), new Object[]{"SSS","SSS","SSS", 'S' ,ModItems.volcanite_ingot});


		
	}

	public void registerFurnaceRecipes() {
		// TODO Auto-generated method stub
		
	}

	public void registerBrewingRecipes() {
		// TODO Auto-generated method stub
		
	}

}
