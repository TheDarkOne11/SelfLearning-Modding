package com.SgtPetrov.SL.item;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.SgtPetrov.SL.block.ModBlocks;
import com.SgtPetrov.SL.lib.Strings;

/* Item p�i pou�it� polo�� 2x FirstBlock, jeden dol�, druh� p��mo nad n�j.  */
public class BlockPlacer extends ItemSL {

    public BlockPlacer(int id) {
        super(id);
        this.setUnlocalizedName(Strings.RESOURCE_PREFIX + Strings.BLOCK_PLACER);
       
    }
    /**
     * Co se stane po pou�it� itemu.
     * par7 jsou pravd�podobn� metadata.
     */
    public boolean onItemUse(ItemStack itemStack, EntityPlayer player, World world, int x, int y, int z, int par7, float par8, float par9, float par10)
    {
        if(par7 != 1) {
            return false;
        } else {
            // Zji��uje, zda hr�� m��e do koordin�t� x, y, z polo�it blok
            if(player.canPlayerEdit(x, y+1, z, par7, itemStack) && player.canPlayerEdit(x, y+2, z, par7, itemStack)) {
                world.setBlock(x, y+1, z, ModBlocks.firstBlock.blockID);
                world.setBlock(x, y+2, z, ModBlocks.firstBlock.blockID);
                
                // Bloky jeden druh�ho upozorn�, �e se sousedstv� zm�nilo
                world.notifyBlockOfNeighborChange(x, y, z, ModBlocks.firstBlock.blockID);
                world.notifyBlockOfNeighborChange(x, y+1, z, ModBlocks.firstBlock.blockID);
                --itemStack.stackSize;  // Z bal�ku odebere 1 item
                return true;
            } else return false;
        }
    }
}
