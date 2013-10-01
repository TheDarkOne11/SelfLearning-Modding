package com.SgtPetrov.SL.item;
import com.SgtPetrov.SL.BaseFile;
import com.SgtPetrov.SL.lib.Ids;
import com.SgtPetrov.SL.lib.Strings;
import com.SgtPetrov.SL.lib.Textures;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
/* Tato metoda popisuje celý set armoru. */

public class ArmorSL extends ItemArmor {
    
    /**
     * @param id
     * @param par2EnumArmorMaterial
     * @param par3
     * @param type(0 == Helmet, 1 == Chestplate, 2 == Leggins, 3 == Boots)
     */
    public ArmorSL(int id, EnumArmorMaterial par2EnumArmorMaterial, int par3,int type) {
        super(id, par2EnumArmorMaterial, par3, type);
        
        this.setCreativeTab(BaseFile.tabSL);
        this.setUnlocalizedName(Strings.ARMOR_SL_SET_NAMES[type]);
    }
    
    /**
     * Textura Armoru pøi obleèení.
     * Textura od LEGGINS je uložena v armorSL_layer_2
     * Textury ostatních èástí jsou uloženy v armorSL_layer_1
     */
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer) {
        
        if(this.getUnlocalizedName().indexOf(Strings.ARMOR_SL_SET_NAMES[2]) > 0) {
            return Strings.RESOURCE_PREFIX + Textures.ARMOR_SL_LAYER_2;
        }
        
        return Strings.RESOURCE_PREFIX + Textures.ARMOR_SL_LAYER_1;
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        itemIcon = iconRegister.registerIcon(Strings.RESOURCE_PREFIX + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
    }

}
