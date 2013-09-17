package com.SgtPetrov.SL.item;

import net.minecraft.item.ItemStack;

import com.SgtPetrov.SL.block.ModBlocks;
import com.SgtPetrov.SL.lib.Strings;

public class CraftedSmeltedItem extends ItemSL {
    ItemStack firstItemStack = new ItemStack(ModItems.firstItem);
    ItemStack blockPlacerStack = new ItemStack(ModItems.blockPlacer);
    ItemStack gravityBlockStack = new ItemStack(ModBlocks.gravityBlock);

    public CraftedSmeltedItem(int id) {
        super(id);
        this.setUnlocalizedName(Strings.RESOURCE_PREFIX + Strings.CRAFTED_SMELTED_ITEM);
        
        // Normální crafting
        /**/
        // Shapeless crafting
    }

}
