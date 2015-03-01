package anonmine.beastmod.common.entity.giantmonster;

import anonmine.beastmod.common.animations.godzilla.AnimationHandlerGodzilla;
import anonmine.beastmod.common.entity.ai.EntityAIWatchPlayer;
import anonmine.beastmod.common.mca.commonlibrary.IMCAnimatedEntity;
import anonmine.beastmod.common.mca.commonlibrary.animation.AnimationHandler;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.FMLCommonHandler;

public class EntityGodzilla extends EntityCreature implements IMCAnimatedEntity {
	protected AnimationHandler animHandler = new AnimationHandlerGodzilla(this);
	private int atomicCharge;
	private boolean charging;
	//TODO : suppress roaring?

	public EntityGodzilla(World par1World) {
		super(par1World);
		this.setSize(10, 30);
		this.tasks.addTask(0, new EntityAIWatchPlayer(this, 60.0F));
		this.ignoreFrustumCheck = true;
		
		charging = false;
		//TODO : set atomicCharge to 0
		atomicCharge = 100;
	}
	
	public boolean isCharging() {
		return charging;
	}

	public void setCharging(boolean charging) {
		this.charging = charging;
	}

	public int getAtomicCharge(){
		return atomicCharge;
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
            // TODO : CHECK WHERE ANIMATION IN MCA 1.2 IS FUCKED UP!
            if (!this.getAnimationHandler().isAnimationActive("roar")){
        		this.getAnimationHandler().activateAnimation("roar", 0);
        		
        		//Side side = FMLCommonHandler.instance().getEffectiveSide();
        		//System.out.println("The side is " + side);
            }
    }

	@Override
	public void readEntityFromNBT(NBTTagCompound nbttagcompound) {
		super.readEntityFromNBT(nbttagcompound);
	}

	@Override
	public void writeEntityToNBT(NBTTagCompound nbttagcompound) {
		super.writeEntityToNBT(nbttagcompound);
	}
}