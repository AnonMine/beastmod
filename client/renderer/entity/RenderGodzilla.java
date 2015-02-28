package anonmine.beastmod.client.renderer.entity;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import anonmine.beastmod.Reference;
import anonmine.beastmod.client.model.ModelGodzilla;
import anonmine.beastmod.client.renderer.entity.layers.LayerGodzillaAtomicCharge;
import anonmine.beastmod.common.entity.giantmonster.EntityGodzilla;

public class RenderGodzilla extends RenderLiving {

	public static final ResourceLocation godzilla_texture = new ResourceLocation(Reference.MOD_ID + ":textures/entity/godzilla/godzilla.png");
	public static ModelGodzilla modelGodzilla = new ModelGodzilla();	
	public static float modelHeight = 2F;
	
	public RenderGodzilla(float shadowSize)
    {
        super(Minecraft.getMinecraft().getRenderManager(), modelGodzilla, shadowSize);
        this.addLayer(new LayerGodzillaAtomicCharge(this));
    }
	
	@Override
	public void doRender(Entity _entity, double posX, double posY, double posZ, float var8, float var9) {
		EntityGodzilla entity = (EntityGodzilla) _entity;
				
		GL11.glPushMatrix();
		GL11.glDisable(GL11.GL_CULL_FACE);
		super.doRender(_entity, posX, posY, posZ, var8, var9);
		GL11.glEnable(GL11.GL_CULL_FACE);
		GL11.glPopMatrix();
	}
	
	@Override
	protected void preRenderCallback(EntityLivingBase entityliving, float f)
	{
		GL11.glRotatef(180F, 0, 1F, 0F);
		GL11.glRotatef(180F, 0, 0, 1F);
		GL11.glTranslatef(0, modelHeight, 0);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity var1) {
		return godzilla_texture;
	}
}