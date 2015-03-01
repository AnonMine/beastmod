package anonmine.beastmod.common.entity.projectile;

import anonmine.beastmod.common.entity.giantmonster.EntityGodzilla;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAITasks.EntityAITaskEntry;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.eventhandler.Event;

public class EntityAtomicBreath extends EntityThrowable{
	
	private int randomTilt;
	private int duration;
	

	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getRandomTilt()
	{
		return randomTilt;
	}
	public void setRandomTilt(int angle)
	{
		randomTilt = angle;
	}
	public EntityAtomicBreath(World world){
		super(world);
		randomTilt = rand.nextInt(360);
		duration = 60;
	}
	public EntityAtomicBreath(World world,EntityLivingBase entity){
		super(world,entity);
		randomTilt = rand.nextInt(360);
		duration = 60;
	}
	public EntityAtomicBreath(World world,double x,double y,double z){
		super(world,x,y,z);
		randomTilt = rand.nextInt(360);
		duration = 60;
	}
	
	
	private void inflictDamage(MovingObjectPosition movingObjectPos){
		movingObjectPos.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), 1);
		//movingObjectPos.entityHit.setFire(3);
		if (movingObjectPos.entityHit instanceof EntityLiving)
			lobotomized((EntityLiving)movingObjectPos.entityHit);
			
		
	}
	private void lobotomized(EntityLiving e)
	{
		e.tasks.taskEntries.clear();
		e.targetTasks.taskEntries.clear();
		System.out.print("LOBOTOMIZED");
	}
	private void DestroySelf(){
		this.setDead();
	}
	@Override
	public void onUpdate(){
		if (this.ticksExisted > duration){
			DestroySelf();
		} else
			super.onUpdate();
	}
	
	@Override
	public float getGravityVelocity(){
		return 0.0F;
		
	}
	@Override
	protected void onImpact(MovingObjectPosition movingObjectPos) {
		
		if (movingObjectPos.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK){
			
			Block block = this.worldObj.getBlockState(movingObjectPos.getBlockPos()).getBlock();
			
			if (block != Blocks.bedrock && block != Blocks.obsidian){
				
				BlockPos blockPos = movingObjectPos.getBlockPos();
				//IBlockState blockstate = this.worldObj.getBlockState(blockPos);
				//TileEntity te = this.worldObj.getTileEntity(blockPos);
				
				this.worldObj.destroyBlock(blockPos, false);
				DestroySelf();
				
			} else {
				DestroySelf();
			}
		}
		else {
			
			if (movingObjectPos.entityHit != null){
				this.inflictDamage(movingObjectPos);
				DestroySelf();
			}
			
		}

		
	}
	
	
	
	

}
