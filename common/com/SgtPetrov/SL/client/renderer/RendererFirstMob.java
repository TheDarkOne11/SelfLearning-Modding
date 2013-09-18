package com.SgtPetrov.SL.client.renderer;

import com.SgtPetrov.SL.client.model.ModelFirstMob;
import com.SgtPetrov.SL.entity.EntityFirstMob;
import com.SgtPetrov.SL.lib.Strings;
import com.SgtPetrov.SL.lib.Textures;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RendererFirstMob extends RenderLiving {
    
    protected ModelFirstMob model;
    
    public RendererFirstMob(ModelBase par1ModelBase, float par2) {
        super(par1ModelBase, par2);
        
        model = ((ModelFirstMob)mainModel);
    }
    
    public void renderFirstMob(EntityFirstMob par1Entity, double par2, double par4, double par6, float par8, float par9) {
        super.doRenderLiving(par1Entity, par2, par4, par6, par8, par9);
    }
    
    public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9) {
        this.renderFirstMob((EntityFirstMob)par1EntityLiving, par6, par6, par6, par9, par9);
    }

    public void doRender(Entity entity, double d0, double d1, double d2, float f, float f1) {
        renderFirstMob((EntityFirstMob) entity, d0, d1, d2, f, f1);
    }
    
    /* Jaký obrázek má mobovi dát */
    protected ResourceLocation func_110775_a(Entity entity) {
        return new ResourceLocation(Strings.RESOURCE_PREFIX + Textures.FIRST_MOB);
    }

}
