package anonmine.beastmod.common.entity.ai;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.RandomPositionGenerator;
import net.minecraft.util.Vec3;

public class EntityAIWanderDetailed extends EntityAIBase
{
    private EntityCreature entity;
    private double xPosition;
    private double yPosition;
    private double zPosition;
    private int searchAreaWidth;
    private int searchAreaHeight;
    private double speed;
    private int searchingPeriod;
    private boolean forceExecute;
    private static final String __OBFID = "CL_00001608";

    public EntityAIWanderDetailed(EntityCreature entity, double speed)
    {
        this(entity, speed ,30,7, 10);
    }

    public EntityAIWanderDetailed(EntityCreature entity, double speed, int searchingPeriod)
    {
        this(entity,speed,30,7,searchingPeriod);
    }
    public EntityAIWanderDetailed(EntityCreature entity, double speed,int searchAreaWidth, int searchAreaHeight, int searchingPeriod)
    {
        this.entity = entity;
        this.speed = speed;
        this.searchingPeriod = searchingPeriod;
        this.searchAreaWidth = searchAreaWidth;
        this.searchAreaHeight = searchAreaHeight;
        this.setMutexBits(1);
    }

    /**
     * Returns whether the EntityAIBase should begin execution.
     */
    public boolean shouldExecute()
    {
        if (!this.forceExecute)
        {
            if (this.entity.getAge() >= 100)
            {
                return false;
            }

            if (this.entity.getRNG().nextInt(this.searchingPeriod) != 0)
            {
                return false;
            }
        }

        Vec3 vec3 = RandomPositionGenerator.findRandomTarget(this.entity, searchAreaWidth, searchAreaHeight);

        if (vec3 == null)
        {
            return false;
        }
        else
        {
            this.xPosition = vec3.xCoord;
            this.yPosition = vec3.yCoord;
            this.zPosition = vec3.zCoord;
            this.forceExecute = false;
            return true;
        }
    }

    /**
     * Returns whether an in-progress EntityAIBase should continue executing
     */
    public boolean continueExecuting()
    {
        return !this.entity.getNavigator().noPath();
    }

    /**
     * Execute a one shot task or start executing a continuous task
     */
    public void startExecuting()
    {
    	this.entity.getNavigator().tryMoveToXYZ(this.xPosition, this.yPosition, this.zPosition, this.speed);
    }

    public void forceExecute()
    {
        this.forceExecute = true;
    }

    public void setSearchingPeriod(int searchingPeriod)
    {
        this.searchingPeriod = searchingPeriod;
    }
}