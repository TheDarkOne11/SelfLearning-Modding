package com.SgtPetrov.SL.item;

import com.SgtPetrov.SL.lib.Strings;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class KnifeACB90 extends ItemSL {
    private float weaponDamage;

    public KnifeACB90(int id) {
        super(id, EnumToolMaterial.IRON);
        
        this.setUnlocalizedName(Strings.RESOURCE_PREFIX + Strings.KNIFE_ACB90);
        this.setMaxDamage(toolMaterial.getMaxUses());
        this.weaponDamage = 4 + toolMaterial.getDamageVsEntity();
    }
    
    public boolean hitEntity(ItemStack par1ItemStack, EntityLiving par2EntityLiving, EntityLiving par3EntityLiving)
    {
        par1ItemStack.damageItem(1, par3EntityLiving);
        return true;
    }
    
    public boolean onBlockDestroyed(ItemStack par1ItemStack, World par2World, int par3, int par4, int par5, int par6, EntityLiving par7EntityLiving)
    {
        if ((double)Block.blocksList[par3].getBlockHardness(par2World, par4, par5, par6) != 0.0D)
        {
            par1ItemStack.damageItem(2, par7EntityLiving);
        }

        return true;
    }
    
    /**
     * Returns the damage against a given entity.
     */
    public float getDamageVsEntity(Entity par1Entity)
    {
        return this.weaponDamage;
    }

}
