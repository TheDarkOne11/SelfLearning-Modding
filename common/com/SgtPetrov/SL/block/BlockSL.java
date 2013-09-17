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
/* Základní blok, od kterého všechny bloky dìdí. */
public class BlockSL extends Block {
    
    public BlockSL(int par1, Material par2Material) {
        super(par1, par2Material);
        this.setCreativeTab(BaseFile.tabSL);
    }
    
    // Id bloku, který má vypadnout
    public int idDropped(int i, Random ran, int par3) {
        return this.blockID;
        
    }
    // Kolik itemù pøi znièení vypadne(pro vypadnutí 1 itemu není potøeba)
    public int quantityDropped(Random ran) {
        return 1;
    }
    
    // Pøidá bloku texturu
    // Když tøída zdìdí BlockSL, tak staèí, aby si dala stejné UnlocalizedName jako je jméno textury.
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        
        blockIcon = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + getUnwrappedUnlocalizedName(this.getUnlocalizedName()));
    }
    
    // Získá unlocalizedName bloku a pøidá mu potøebné øetìzce
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
