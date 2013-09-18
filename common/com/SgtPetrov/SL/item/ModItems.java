package com.SgtPetrov.SL.item;

import com.SgtPetrov.SL.lib.Ids;
import com.SgtPetrov.SL.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.Item;
/* Inicializuje itemy */

public class ModItems {
    
    public static Item firstItem;
    public static Item knifeACB90;
    public static Item blockPlacer;
    public static Item craftedSmeltedItem;
    public static Item armorSLHelmet;
    public static Item armorSLChestplate;
    public static Item armorSLLeggins;
    public static Item armorSLBoots;

    public static void init() {
        
        firstItem = new FirstItem(Ids.FIRST_ITEM_DEFAULT);
        knifeACB90 = new KnifeACB90(Ids.KNIFE_ACB90_DEFAULT);
        blockPlacer = new BlockPlacer(Ids.BLOCK_PLACER_DEFAULT);
        craftedSmeltedItem = new CraftedSmeltedItem(Ids.CRAFTED_SMELTED_ITEM_DEFAULT);
        armorSLHelmet = new ArmorSL(Ids.ARMOR_SL_SET_IDS[0], EnumArmorMaterial.DIAMOND, 0, 0);
        armorSLChestplate = new ArmorSL(Ids.ARMOR_SL_SET_IDS[1], EnumArmorMaterial.DIAMOND, 0, 1);
        armorSLLeggins = new ArmorSL(Ids.ARMOR_SL_SET_IDS[2], EnumArmorMaterial.DIAMOND, 0, 2);
        armorSLBoots = new ArmorSL(Ids.ARMOR_SL_SET_IDS[3], EnumArmorMaterial.DIAMOND, 0, 3);

        // GameRegistry
        GameRegistry.registerItem(firstItem, Strings.FIRST_ITEM_NAME);
        GameRegistry.registerItem(knifeACB90, Strings.KNIFE_ACB90);
        GameRegistry.registerItem(blockPlacer, Strings.BLOCK_PLACER);
        GameRegistry.registerItem(craftedSmeltedItem, Strings.CRAFTED_SMELTED_ITEM);
        GameRegistry.registerItem(armorSLHelmet, armorSLHelmet.getUnlocalizedName());
        GameRegistry.registerItem(armorSLChestplate, armorSLChestplate.getUnlocalizedName());
        GameRegistry.registerItem(armorSLLeggins, armorSLLeggins.getUnlocalizedName());
        GameRegistry.registerItem(armorSLBoots, armorSLBoots.getUnlocalizedName());

        // Language Registry
        LanguageRegistry.addName(firstItem, "First Item");
        LanguageRegistry.addName(knifeACB90, "ACB90");
        LanguageRegistry.addName(blockPlacer, "Block Placer");
        LanguageRegistry.addName(craftedSmeltedItem, "Crafted/Smelted Item");
        LanguageRegistry.addName(armorSLHelmet, "ArmorSL Helmet");
        LanguageRegistry.addName(armorSLChestplate, "ArmorSL Chestplate");
        LanguageRegistry.addName(armorSLLeggins, "ArmorSL Leggins");
        LanguageRegistry.addName(armorSLBoots, "ArmorSL Boots");

    }
}
