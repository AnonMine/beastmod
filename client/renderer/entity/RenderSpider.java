package anonmine.beastmod.client.renderer.entity;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import anonmine.beastmod.Reference;
import anonmine.beastmod.client.model.ModelTarantula;
import anonmine.beastmod.common.entity.giantmonster.EntityTarantula;

public class RenderSpider extends RenderLiving {

	public static final ResourceLocation Tarantula_texture = new ResourceLocation(Reference.MOD_ID + ":textures/entity/tarantula/tarantula.png");
	public static ModelTarantula modelTarantula = new ModelTarantula();	
	public static float modelHeight = 0.4F;
	
	public RenderSpider()
    {
        super(Minecraft.getMinecraft().getRenderManager(), modelTarantula, 1F);
    }
	
	@Override
	public void doRender(Entity _entity, double posX, double posY, double posZ, float var8, float var9) {
		//EntitySpider entity = (EntitySpider) _entity;
				
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
		GL11.glScalef(0.2f, 0.2f, 0.2f);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity var1) {
		return Tarantula_texture;
	}
}