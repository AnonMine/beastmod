package anonmine.beastmod.common.entity.ai;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.player.EntityPlayer;

public class EntityAIWatchPlayer extends EntityAIBase
{
    protected EntityLiving theWatcher;
    protected Entity closestEntity;
    protected float maxDistanceForPlayer;
    private int lookTime;
    private float field_75331_e;
    protected Class watchedClass;
    private static final String __OBFID = "CL_00001592";

    public EntityAIWatchPlayer(EntityLiving p_i1631_1_, float p_i1631_3_)
    {
        this.theWatcher = p_i1631_1_;
        this.watchedClass =  EntityPlayer.class;
        this.maxDistanceForPlayer = p_i1631_3_;
        this.field_75331_e = 0.02F;
        this.setMutexBits(2);
    }

    public EntityAIWatchPlayer(EntityLiving p_i1632_1_, float p_i1632_3_, float p_i1632_4_)
    {
        this.theWatcher = p_i1632_1_;
        this.watchedClass =  EntityPlayer.class;
        this.maxDistanceForPlayer = p_i1632_3_;
        this.field_75331_e = p_i1632_4_;
        this.setMutexBits(2);
    }

    public boolean shouldExecute()
    {
        this.closestEntity = this.theWatcher.worldObj.getClosestPlayerToEntity(this.theWatcher, (double)this.maxDistanceForPlayer);
        return this.closestEntity != null;
    }

    public boolean continueExecuting()
    {
        return !this.closestEntity.isEntityAlive() ? false : (this.theWatcher.getDistanceSqToEntity(this.closestEntity) > (double)(this.maxDistanceForPlayer * this.maxDistanceForPlayer) ? false : this.lookTime > 0);
    }

    public void startExecuting()
    {
        this.lookTime = 40 + this.theWatcher.getRNG().nextInt(40);
    }

    public void resetTask()
    {
        this.closestEntity = null;
    }

    public void updateTask()
    {
        this.theWatcher.getLookHelper().setLookPosition(this.closestEntity.posX, this.closestEntity.posY + (double)this.closestEntity.getEyeHeight(), this.closestEntity.posZ, 10.0F, (float)this.theWatcher.getVerticalFaceSpeed());
        --this.lookTime;
    }
}