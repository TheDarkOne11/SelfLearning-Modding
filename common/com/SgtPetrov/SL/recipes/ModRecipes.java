package com.SgtPetrov.SL.recipes;

import net.minecraft.item.ItemStack;

import com.SgtPetrov.SL.block.ModBlocks;
import com.SgtPetrov.SL.item.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModRecipes {
    
    
    public static void init() {
        // Shapeless crafting
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.craftedSmeltedItem, 2), new Object[] {
            new ItemStack(ModItems.firstItem, 2), new ItemStack(ModItems.knifeACB90)});
        
        // Shaped crafting
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.craftedSmeltedItem, 18), new Object[] {
            "F F", // Crafting table
            "   ", 
            "GBG", 
            // Co jednotlivé znaèky znamenají
            'F', new ItemStack(ModItems.firstItem), 'G', new ItemStack(ModBlocks.gravityBlock), 'B', new ItemStack(ModItems.blockPlacer)
     });
        
        // Smelting
        GameRegistry.addSmelting(ModItems.firstItem.itemID, new ItemStack(ModItems.craftedSmeltedItem, 5), 0.5F);
    }
}
