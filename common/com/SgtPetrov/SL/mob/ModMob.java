package com.SgtPetrov.SL.mob;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;

import com.SgtPetrov.SL.entity.EntityFirstMob;
import com.SgtPetrov.SL.lib.Ids;
import com.SgtPetrov.SL.lib.Strings;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;

public class ModMob {
    
    public static int startEntityId;
    
    // Mob generation
    public static int getUniqueEntityId() {
        do {
            startEntityId++;
        } while(EntityList.getStringFromID(startEntityId) != null);
        return startEntityId;
    }
    
    public static void registerEntityEgg(Class<? extends Entity> entity, int primaryColor, int secondaryColor) {
        int id = getUniqueEntityId();
        EntityList.IDtoClassMapping.put(id, entity);
        EntityList.entityEggs.put(id, new EntityEggInfo(id, primaryColor, secondaryColor));
    }
    
    public static void init() {
        EntityRegistry.registerGlobalEntityID(EntityFirstMob.class, Strings.FIRST_MOB_NAME, Ids.FIRST_MOB_DEFAULT);
        /**
         * Entity, pravdìpodobnost výskytu, min. poèet, max. poèet, typ
         */
        EntityRegistry.addSpawn(EntityFirstMob.class, 10, 2, 4, EnumCreatureType.monster);
        EntityRegistry.findGlobalUniqueEntityId();
        registerEntityEgg(EntityFirstMob.class, 0x3c768c, 0xb50000);
        RenderingRegistry.registerEntityRenderingHandler(EntityFirstMob.class, new RenderFirstMob(new FirstMob(), 0,3F));
    }
}
