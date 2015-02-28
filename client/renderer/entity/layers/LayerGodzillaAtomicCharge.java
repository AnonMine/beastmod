package anonmine.beastmod.client.renderer.entity.layers;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import anonmine.beastmod.Reference;
import anonmine.beastmod.client.model.ModelGodzilla;
import anonmine.beastmod.client.renderer.entity.RenderGodzilla;
import anonmine.beastmod.common.entity.giantmonster.EntityGodzilla;

@SideOnly(Side.CLIENT)
public class LayerGodzillaAtomicCharge implements LayerRenderer
{
    private static final ResourceLocation TEXTURE = new ResourceLocation(Reference.MOD_ID + ":textures/entity/godzilla/godzilla_atomic_charge.png");
    private final RenderGodzilla godzillaRender;
    private final ModelGodzilla godzillaModel = new ModelGodzilla();
    private static final String __OBFID = "CL_00002414";

    public LayerGodzillaAtomicCharge(RenderGodzilla p_i46113_1_)
    {
        this.godzillaRender = p_i46113_1_;
    }

    public void doRenderLayer(EntityGodzilla entityGodzilla, float p_177155_2_, float p_177155_3_, float p_177155_4_, float p_177155_5_, float p_177155_6_, float p_177155_7_, float p_177155_8_)
    {
    	if (entityGodzilla.getAtomicCharge()>10){
    		
	        this.godzillaRender.bindTexture(TEXTURE);
	
	        //GlStateManager.enableBlend();
	        GlStateManager.color(1.0F, 1.0F, 1.0F,1.0F);
	        GlStateManager.disableLighting();
	        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240F, 240F);
	        //GlStateManager.blendFunc(1, 1);
	        
	        
	        this.godzillaModel.setModelAttributes(this.godzillaRender.getMainModel());
	        this.godzillaModel.render(entityGodzilla, p_177155_2_, p_177155_3_, p_177155_5_, p_177155_6_, p_177155_7_, p_177155_8_);
	        
	
	        GlStateManager.enableLighting();
	        //GlStateManager.disableBlend();
    	}
    }

    public boolean shouldCombineTextures()
    {
        return false;
    }

    public void doRenderLayer(EntityLivingBase p_177141_1_, float p_177141_2_, float p_177141_3_, float p_177141_4_, float p_177141_5_, float p_177141_6_, float p_177141_7_, float p_177141_8_)
    {
        this.doRenderLayer((EntityGodzilla)p_177141_1_, p_177141_2_, p_177141_3_, p_177141_4_, p_177141_5_, p_177141_6_, p_177141_7_, p_177141_8_);
    }
}