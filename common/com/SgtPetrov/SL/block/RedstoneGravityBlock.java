package com.SgtPetrov.SL.block;
/* Blok, který padá jen když má redstone signál a pod sebou místo. 
 * Bude pøed pádem emitovat redstone signál. */

import java.util.Random;
import com.SgtPetrov.SL.lib.Strings;

import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

//TODO Vydává redstone signál, ale vždy minimálnì poslední blok nespadne
public class RedstoneGravityBlock extends GravityBlock {
    
    /** Do blocks fall instantly to where they stop or do they fall over time */
    public static boolean fallInstantly = false;
    public static boolean isPowered = false;

    public RedstoneGravityBlock(int par1) {
        super(par1);
        
        this.setUnlocalizedName(Strings.REDSTONE_GRAVITY_BLOCK_NAME);
    }
    
    /**
     * Ticks the block if it's been scheduled
     */
    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        if (!par1World.isRemote && par1World.isBlockIndirectlyGettingPowered(par2, par3, par4))
        {
            isPowered = true;
            super.tryToFall(par1World, par2, par3, par4);
        } else isPowered = false;
    }
    
    public int isProvidingWeakPower(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
    {
        return isPowered ? 15 : 0;
    }
    
    /**
     * Can this block provide power. Only wire currently seems to have this change based on its state.
     */
    public boolean canProvidePower()
    {
        return true;
    }
    
    /**
     * Determine if this block can make a redstone connection on the side provided,
     * Useful to control which sides are inputs and outputs for redstone wires.
     *
     * Side:
     *  -1: UP
     *   0: NORTH
     *   1: EAST
     *   2: SOUTH
     *   3: WEST
     *
     * @param world The current world
     * @param x X Position
     * @param y Y Position
     * @param z Z Position
     * @param side The side that is trying to make the connection
     * @return True to make the connection
     */
    public boolean canConnectRedstone(IBlockAccess world, int X, int Y, int Z, int direction) {
        return true;
        
    }
    
}
