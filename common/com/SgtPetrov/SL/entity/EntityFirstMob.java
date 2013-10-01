package com.SgtPetrov.SL.entity;

import com.SgtPetrov.SL.lib.Ids;

import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityFirstMob extends EntityMob {
    private static float speed = 0.4F;
    
    public EntityFirstMob(World par1World) {
        super(par1World);
        this.experienceValue = 10;
        
        // Umìlá inteligence moba tzn. umí-li plavat, na co útoèí
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(0, new EntityAIAttackOnCollide(this, EntityZombie.class, 0.5D, false));
        this.tasks.addTask(1, new EntityAIWander(this, 0.5D));
        this.tasks.addTask(2, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(3, new EntityAILookIdle(this));
        this.targetTasks.addTask(4, new EntityAIHurtByTarget(this, true));
        this.targetTasks.addTask(5, new EntityAINearestAttackableTarget(this, EntityZombie.class, 0, true));
    }
    
    protected boolean isAIEnabled() {
        return true;
    }
    
    // Rychlost moba
    public void setAIMoveSpeed(float par1) {
        super.setAIMoveSpeed(speed);
        this.setMoveForward(speed);
    }
    
    // Napø. díky tomuto zaène Zombie hoøet
    public void onLivingUpdate() {
        super.onLivingUpdate();
    }
    
    // Zombie == 10
    public int getMaxHealth() {
        return 15;
    }
    
    protected int getDropItemId() {
        return Ids.FIRST_BLOCK_DEFAULT;
    }
    
    protected void dropRareDrop(int par1) {
        int quantity = 2;
        switch (this.rand.nextInt(3)) {
            case 0:
                this.dropItem(Ids.MULTI_TEXTURED_BLOCK_DEFAULT, quantity);
            break;
        }
    }
    
    public EnumCreatureAttribute getCreatureAttribute() {
        return EnumCreatureAttribute.UNDEAD;
    }
    
    protected String getHurtSound() {
        return "mob.irongolem.hurt";
    }
    
    protected String getDeathSound() {
        return "mob.irongolem.death";
    }
    
    protected void playStepSound(int par1, int par2, int par3, int par4) {
        this.playSound("mog.irongolem.step", 0.15F, 1.0F);
    }
   
}
