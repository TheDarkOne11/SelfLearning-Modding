package com.SgtPetrov.SL.block;
import com.SgtPetrov.SL.lib.Strings;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
/* Pøi kliknutí pravým tlaèítkem se zmìní poèasí na nedeštivo a èas se pøesune na 0. */

public class OnBlockClicked extends BlockSL {
    public static int setTime = 0;

    public OnBlockClicked(int id) {
        super(id, Material.cloth);
        
        this.setUnlocalizedName(Strings.ON_BLOCK_CLICKED_NAME);
    }
    
    public boolean onBlockActivated(World world, int par2, int par3, int par4, EntityPlayer entityPlayer, int par6, float par7, float par8, float par9) 
    {
        if(!world.isDaytime()) {
            entityPlayer.addChatMessage(entityPlayer.username + " set time to " + setTime);
            world.setWorldTime(setTime);
        }
        
        if(world.isRaining()) {
            entityPlayer.addChatMessage(entityPlayer.username +" stopped the rain.");
            world.toggleRain();
        }
        return true;
    }
}
