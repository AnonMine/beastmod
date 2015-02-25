package anonmine.beastmod.common.entity.projectile;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityAtomicBreath extends EntityThrowable{
	
	private int randomTilt;
	

	public EntityAtomicBreath(World world){
		super(world);
		randomTilt = rand.nextInt(360);
	}
	public EntityAtomicBreath(World world,EntityLivingBase entity){
		super(world,entity);
		randomTilt = rand.nextInt(360);
	}
	public EntityAtomicBreath(World world,double x,double y,double z){
		super(world,x,y,z);
		randomTilt = rand.nextInt(360);
	}
	
	public int getRandomTilt()
	{
		return randomTilt;
	}
	public void setRandomTilt(int angle)
	{
		randomTilt = angle;
	}
	
	private void inflictDamage(MovingObjectPosition movingObjectPos){
		movingObjectPos.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), 5);
		movingObjectPos.entityHit.setFire(3);
	}
	
	private void DestroySelf(){
		this.setDead();
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
