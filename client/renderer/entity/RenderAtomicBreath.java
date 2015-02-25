package anonmine.beastmod.client.renderer.entity;

import org.lwjgl.opengl.GL11;

import anonmine.beastmod.Reference;
import anonmine.beastmod.common.entity.projectile.EntityAtomicBreath;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderAtomicBreath extends Render {

	public RenderAtomicBreath(RenderManager renderMan){
		super(renderMan);
	}
	
	private static final ResourceLocation atomicBreathTexture = new ResourceLocation(Reference.MOD_ID + ":textures/entity/atomic_breath.png");
	
	protected ResourceLocation getEntityTexture(EntityAtomicBreath atomicBreath){
		return atomicBreathTexture;
		
	}
	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return this.getEntityTexture( (EntityAtomicBreath)entity );
	}
	

	public void doRender(Entity entity, double transx, double transy, double transz, float param5, float dir){
		this.doRender((EntityAtomicBreath)entity, transx, transy, transz, param5, dir);
	}
	public void doRender(EntityAtomicBreath atomicBreath, double transx, double transy, double transz, float param5, float dir){
		
		this.bindEntityTexture(atomicBreath);
		
		GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
		GlStateManager.pushMatrix();
		
		
		GlStateManager.translate(transx, transy, transz);
		GlStateManager.rotate(atomicBreath.prevRotationYaw + (atomicBreath.rotationYaw - atomicBreath.prevRotationYaw) * dir - 90.0F, 0.0F	, 1.0F, 0.0F);
		GlStateManager.rotate(atomicBreath.getRandomTilt(), 1.0F, 0.0F, 0.0F);
		
		Tessellator tes = Tessellator.getInstance();
		WorldRenderer worldRenderer = tes.getWorldRenderer();
		
		GlStateManager.enableRescaleNormal();
		
		float scale = 1.05F;
		
		GlStateManager.scale(scale, scale, scale);
		
		GL11.glNormal3f(0.0F, 0.0F, scale);
		
		worldRenderer.startDrawingQuads();
		worldRenderer.addVertexWithUV(-2.0D, -2.0D, 0.0D, 0.0D, 0.0D);
		worldRenderer.addVertexWithUV(2.0D, -2.0D, 0.0D, 1.0D, 0.0D);
		worldRenderer.addVertexWithUV(2.0D, 2.0D, 0.0D, 1.0D, 1.0D);
		worldRenderer.addVertexWithUV(-2.0D, 2.0D, 0.0D, 0.0D, 1.0D);
		tes.draw();
		
		GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);

		worldRenderer.startDrawingQuads();
		worldRenderer.addVertexWithUV(-2.0D, -2.0D, 0.0D, 0.0D, 0.0D);
		worldRenderer.addVertexWithUV(2.0D, -2.0D, 0.0D, 1.0D, 0.0D);
		worldRenderer.addVertexWithUV(2.0D, 2.0D, 0.0D, 1.0D, 1.0D);
		worldRenderer.addVertexWithUV(-2.0D, 2.0D, 0.0D, 0.0D, 1.0D);
		tes.draw();
		
		GlStateManager.disableRescaleNormal();
		GlStateManager.popMatrix();
		
		super.doRender(atomicBreath, transx, transy, transz, param5, dir);
		
	}
	
	

}
