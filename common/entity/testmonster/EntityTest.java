package anonmine.beastmod.common.entity.testmonster;

import net.minecraft.entity.EntityCreature;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import anonmine.beastmod.common.animations.test.AnimationHandlerTest;
import anonmine.beastmod.common.mca.commonlibrary.IMCAnimatedEntity;
import anonmine.beastmod.common.mca.commonlibrary.animation.AnimationHandler;

public class EntityTest extends EntityCreature implements IMCAnimatedEntity {
	protected AnimationHandler animHandler = new AnimationHandlerTest(this);
	public EntityTest(World par1World) {
		super(par1World);
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
		if (!animHandler.isAnimationActive("still")){
			animHandler.activateAnimation("still", 0);
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