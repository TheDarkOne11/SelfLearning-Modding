package com.SgtPetrov.SL.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

import com.SgtPetrov.SL.lib.Reference;
import com.SgtPetrov.SL.lib.Strings;
import com.SgtPetrov.SL.BaseFile;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
/* Z�kladn� blok, od kter�ho v�echny bloky d�d�. */
public class BlockSL extends Block {
    
    public BlockSL(int par1, Material par2Material) {
        super(par1, par2Material);
        this.setCreativeTab(BaseFile.tabSL);
    }
    
    // Id bloku, kter� m� vypadnout
    public int idDropped(int i, Random ran, int par3) {
        return this.blockID;
        
    }
    // Kolik item� p�i zni�en� vypadne(pro vypadnut� 1 itemu nen� pot�eba)
    public int quantityDropped(Random ran) {
        return 1;
    }
    
    // P�id� bloku texturu
    // Kdy� t��da zd�d� BlockSL, tak sta��, aby si dala stejn� UnlocalizedName jako je jm�no textury.
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        
        blockIcon = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + getUnwrappedUnlocalizedName(this.getUnlocalizedName()));
    }
    
    // Z�sk� unlocalizedName bloku a p�id� mu pot�ebn� �et�zce
    public String getUnlocalizedName() {
        StringBuilder unlocalizedName = new StringBuilder();
        
        unlocalizedName.append("tile.");
        unlocalizedName.append(Strings.RESOURCE_PREFIX);
        unlocalizedName.append(super.getUnlocalizedName().substring(super.getUnlocalizedName().indexOf(".") + 1));
        
        return unlocalizedName.toString();
    }
    
    protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
        
        return unlocalizedName.substring(unlocalizedName.indexOf(":") + 1);
    }
}
