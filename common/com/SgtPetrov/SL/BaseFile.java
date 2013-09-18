package com.SgtPetrov.SL;

import net.minecraft.creativetab.CreativeTabs;
import com.SgtPetrov.SL.block.ModBlocks;
import com.SgtPetrov.SL.client.model.ModMob;
import com.SgtPetrov.SL.creativeTab.CreativeTabSL;
import com.SgtPetrov.SL.item.ModItems;
import com.SgtPetrov.SL.lib.Reference;
import com.SgtPetrov.SL.lib.Strings;
import com.SgtPetrov.SL.recipes.ModRecipes;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod (modid = Reference.MOD_ID, 
name = Reference.MOD_NAME, 
version = Reference.VERSION)

public class BaseFile {
    
    public static CreativeTabs tabSL = new CreativeTabSL(CreativeTabs.getNextID());
    
    @PreInit
    public void preInit(FMLPreInitializationEvent event) {
        
    }
    
    @Init
    public void init(FMLInitializationEvent event) {
        ModBlocks.init();
        
        ModItems.init();
        
        ModRecipes.init();
        
        ModMob.init();
        
        LanguageRegistry.instance().addStringLocalization("itemGroup." + Strings.CREATIVE_TAB, "Self Learning");
    }
    
    @PostInit
    public void postInit(FMLPostInitializationEvent event) {
        
    }
}
