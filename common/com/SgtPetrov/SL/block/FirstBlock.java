package com.SgtPetrov.SL.block;

import com.SgtPetrov.SL.lib.Strings;
import net.minecraft.block.material.Material;

public class FirstBlock extends BlockSL {

    public FirstBlock(int id) {
        super(id, Material.cloth);
        
        this.setUnlocalizedName(Strings.FIRST_BLOCK_NAME);
    }
}
