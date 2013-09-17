package com.SgtPetrov.SL.item;

import com.SgtPetrov.SL.BaseFile;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
/* Z�kladn� item, od kter�ho v�echny bloky d�d�. */

public class ItemSL extends Item {
    protected EnumToolMaterial toolMaterial;

    public ItemSL(int id) {
        super(id);
        this.setCreativeTab(BaseFile.tabSL);
    }
    
    public ItemSL(int id, EnumToolMaterial material) {
        this(id);
        this.maxStackSize = 1;
        this.toolMaterial = material;
    }
    
    // P�id� itemu texturu
    // Kdy� t��da zd�d� ItemSL, tak sta��, aby si dala stejn� UnlocalizedName, jako je jm�no textury.
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

}
