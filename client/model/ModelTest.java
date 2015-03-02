package anonmine.beastmod.client.model;

import java.util.HashMap;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import anonmine.beastmod.client.mca.clientlibrary.MCAModelRenderer;
import anonmine.beastmod.common.entity.testmonster.EntityTest;
import anonmine.beastmod.common.mca.commonlibrary.MCAVersionChecker;
import anonmine.beastmod.common.mca.commonlibrary.animation.AnimationHandler;
import anonmine.beastmod.common.mca.commonlibrary.math.Matrix4f;
import anonmine.beastmod.common.mca.commonlibrary.math.Quaternion;



public class ModelTest extends ModelBase {
	public final int MCA_MIN_REQUESTED_VERSION = 3;
	public HashMap<String, MCAModelRenderer> parts = new HashMap<String, MCAModelRenderer>();

	MCAModelRenderer base;
	MCAModelRenderer second;
	MCAModelRenderer last;

	public ModelTest()
	{
		MCAVersionChecker.checkForLibraryVersion(getClass(), MCA_MIN_REQUESTED_VERSION);

		textureWidth = 16;
		textureHeight = 16;

		base = new MCAModelRenderer(this, "Base", 0, 0);
		base.mirror = false;
		base.addBox(0.0F, 0.0F, 0.0F, 1, 8, 1);
		base.setInitialRotationPoint(0.0F, 0.0F, 0.0F);
		base.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0F, 0.0F, 0.0F, 1.0F)).transpose());
		base.setTextureSize(16, 16);
		parts.put(base.boxName, base);

		second = new MCAModelRenderer(this, "second", 0, 0);
		second.mirror = false;
		second.addBox(0.0F, 0.0F, 0.0F, 1, 8, 1);
		second.setInitialRotationPoint(0.0F, 8.0F, 0.0F);
		second.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.42261827F, 0.0F, 0.0F, 0.90630776F)).transpose());
		second.setTextureSize(16, 16);
		parts.put(second.boxName, second);
		base.addChild(second);

		last = new MCAModelRenderer(this, "last", 0, 0);
		last.mirror = false;
		last.addBox(0.0F, 0.0F, 0.0F, 1, 8, 1);
		last.setInitialRotationPoint(0.0F, 8.0F, 0.0F);
		last.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.25038F, 0.0F, 0.0F, 0.96814764F)).transpose());
		last.setTextureSize(16, 16);
		parts.put(last.boxName, last);
		second.addChild(last);

	}

	@Override
	public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7) 
	{
		EntityTest entity = (EntityTest)par1Entity;

		AnimationHandler.performAnimationInModel(parts, entity);

		//Render every non-child part
		base.render(par7);
	}
	@Override
	public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {}

	public MCAModelRenderer getModelRendererFromName(String name)
	{
		return parts.get(name);
	}
}