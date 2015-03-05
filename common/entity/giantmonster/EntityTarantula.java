package anonmine.beastmod.common.entity.giantmonster;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import anonmine.beastmod.common.animations.tarantula.AnimationHandlerTarantula;
import anonmine.beastmod.common.animations.test.AnimationHandlerTest;
import anonmine.beastmod.common.mca.commonlibrary.IMCAnimatedEntity;
import anonmine.beastmod.common.mca.commonlibrary.animation.AnimationHandler;

public class EntityTarantula extends EntitySpider implements IMCAnimatedEntity {
	protected AnimationHandler animHandler = new AnimationHandlerTarantula(this);
	public EntityTarantula(World par1World) {
		super(par1World);
        this.setSize(8F, 4F);
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
}