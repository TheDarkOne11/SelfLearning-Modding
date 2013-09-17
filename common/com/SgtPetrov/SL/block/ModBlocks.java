package com.SgtPetrov.SL.block;

import com.SgtPetrov.SL.lib.Ids;
import com.SgtPetrov.SL.lib.Strings;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;

public class ModBlocks {
    /* Mod block instances */
    public static Block firstBlock;
    public static Block gravityBlock;
    public static Block redstoneGravityBlock;
    public static Block multiTexturedBlock;

    public static void init() {

        firstBlock = new FirstBlock(Ids.FIRST_BLOCK_DEFAULT);
        gravityBlock = new GravityBlock(Ids.GRAVITY_BLOCK_DEFAULT);
        redstoneGravityBlock = new RedstoneGravityBlock(Ids.REDSTONE_GRAVITY_BLOCK_DEFAULT);
        multiTexturedBlock = new MultiTexturedBlock(Ids.MULTI_TEXTURED_BLOCK_DEFAULT);
        
        // Game Registry
        GameRegistry.registerBlock(firstBlock, Strings.FIRST_BLOCK_NAME);
        GameRegistry.registerBlock(gravityBlock, Strings.GRAVITY_BLOCK_NAME);
        GameRegistry.registerBlock(redstoneGravityBlock, Strings.REDSTONE_GRAVITY_BLOCK_NAME);
        GameRegistry.registerBlock(multiTexturedBlock, Strings.MULTI_TEXTURED_BLOCK_NAME);
        
        // TMP Language Registry
        LanguageRegistry.addName(firstBlock, "First Block");
        LanguageRegistry.addName(gravityBlock, "Gravity Block");
        LanguageRegistry.addName(redstoneGravityBlock, "Redstone Gravity Block");
        LanguageRegistry.addName(multiTexturedBlock, "Multi Textured Block");
        
    }
}
