package com.SgtPetrov.SL.creativeTab;

import com.SgtPetrov.SL.block.ModBlocks;
import com.SgtPetrov.SL.lib.Strings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTabSL extends CreativeTabs {

    public CreativeTabSL(int id) {
        super(id, Strings.CREATIVE_TAB);
    }
    
    public ItemStack getIconItemStack() {
        return new ItemStack(ModBlocks.firstBlock);
        
    }
}
