package com.SgtPetrov.SL.item;

import com.SgtPetrov.SL.BaseFile;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
/* Základní item, od kterého všechny bloky dìdí. */

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
    
    // Pøidá itemu texturu
    // Když tøída zdìdí ItemSL, tak staèí, aby si dala stejné UnlocalizedName, jako je jméno textury.
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

}
