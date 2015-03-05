package anonmine.beastmod.common.entity.giantmonster;

import java.util.Random;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILeapAtTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.world.World;
import anonmine.beastmod.common.animations.tarantula.AnimationHandlerTarantula;
import anonmine.beastmod.common.animations.test.AnimationHandlerTest;
import anonmine.beastmod.common.entity.ai.EntityAIWanderDetailed;
import anonmine.beastmod.common.mca.commonlibrary.IMCAnimatedEntity;
import anonmine.beastmod.common.mca.commonlibrary.animation.AnimationHandler;

public class EntityTarantula extends EntitySpider implements IMCAnimatedEntity {
	protected AnimationHandler animHandler = new AnimationHandlerTarantula(this);
	public EntityTarantula(World par1World) {
		super(par1World);
        this.setSize(6F, 3F);
        this.tasks.taskEntries.clear();
        this.targetTasks.taskEntries.clear();
        
        this.tasks.addTask(1, new EntityAISwimming(this));
        // this task make mob flee creeper when he is about to explode
        this.tasks.addTask(2, this.field_175455_a);
        // TODO : check this one
        this.tasks.addTask(3, new EntityAILeapAtTarget(this, 1.7F));
        this.tasks.addTask(4, new EntityTarantula.AISpiderAttack(EntityPlayer.class));
        this.tasks.addTask(4, new EntityTarantula.AISpiderAttack(EntityIronGolem.class));
        this.tasks.addTask(5, new EntityAIWanderDetailed(this, 0.8D, 30 , 7 , 10 ));
        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(6, new EntityAILookIdle(this));
        
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false, new Class[0]));
        this.targetTasks.addTask(2, new EntityTarantula.AISpiderTarget(EntityPlayer.class));
        this.targetTasks.addTask(3, new EntityTarantula.AISpiderTarget(EntityIronGolem.class));
        
        
	}
	
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(100.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.30000001192092896D);
    }

	
	
	public boolean canBePushed(){
		return false;
		
	}
    public float getEyeHeight()
    {
        return 2.4F;
    }
	@Override
	protected void entityInit() {
		super.entityInit();
	}

	@Override
	public AnimationHandler getAnimationHandler() {
		return animHandler;
	}

	@Override
	public void onUpdate()
	{
		super.onUpdate();
	}

	@Override
	public void readEntityFromNBT(NBTTagCompound nbttagcompound) {
		super.readEntityFromNBT(nbttagcompound);
	}

	@Override
	public void writeEntityToNBT(NBTTagCompound nbttagcompound) {
		super.writeEntityToNBT(nbttagcompound);
	}
	
	
	class AISpiderAttack extends EntityAIAttackOnCollide
    {
        private static final String __OBFID = "CL_00002197";

        public AISpiderAttack(Class p_i45819_2_)
        {
            super(EntityTarantula.this, p_i45819_2_, 1.0D, true);
        }

        /**
         * Returns whether an in-progress EntityAIBase should continue executing
         */
        public boolean continueExecuting()
        {
            float f = this.attacker.getBrightness(1.0F);

            if (f >= 0.5F && this.attacker.getRNG().nextInt(100) == 0)
            {
                this.attacker.setAttackTarget((EntityLivingBase)null);
                return false;
            }
            else
            {
                return super.continueExecuting();
            }
        }

        protected double func_179512_a(EntityLivingBase p_179512_1_)
        {
            return (double)(4.0F + p_179512_1_.width);
        }
    }

    class AISpiderTarget extends EntityAINearestAttackableTarget
    {
        private static final String __OBFID = "CL_00002196";

        public AISpiderTarget(Class p_i45818_2_)
        {
            super(EntityTarantula.this, p_i45818_2_, true);
        }

        /**
         * Returns whether the EntityAIBase should begin execution.
         */
        public boolean shouldExecute()
        {
            float f = this.taskOwner.getBrightness(1.0F);
            return f >= 0.5F ? false : super.shouldExecute();
        }
    }

    public static class GroupData implements IEntityLivingData
        {
            public int field_111105_a;
            private static final String __OBFID = "CL_00001700";

            public void func_111104_a(Random p_111104_1_)
            {
                int i = p_111104_1_.nextInt(5);

                if (i <= 1)
                {
                    this.field_111105_a = Potion.moveSpeed.id;
                }
                else if (i <= 2)
                {
                    this.field_111105_a = Potion.damageBoost.id;
                }
                else if (i <= 3)
                {
                    this.field_111105_a = Potion.regeneration.id;
                }
                else if (i <= 4)
                {
                    this.field_111105_a = Potion.invisibility.id;
                }
            }
        }
}