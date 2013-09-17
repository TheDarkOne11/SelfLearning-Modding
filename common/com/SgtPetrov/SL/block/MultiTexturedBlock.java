package com.SgtPetrov.SL.block;
import com.SgtPetrov.SL.lib.Reference;
import com.SgtPetrov.SL.lib.Strings;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;

/* Blok, který bude mít jinou texturu po stranách než na vrchu. */
public class MultiTexturedBlock extends BlockSL {
    
    @SideOnly(Side.CLIENT)
    private Icon topTexture;

    public MultiTexturedBlock(int id) {
        super(id, Material.cloth);
        
        this.setUnlocalizedName(Strings.MULTI_TEXTURED_BLOCK_NAME);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        this.topTexture = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase() + ":camoBlock");
        this.blockIcon = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase() + ":firstBlock");
    }
    
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int side, int meta) {
        if(side == 0 || side == 1) return this.topTexture;
        else return this.blockIcon;
    }
}
