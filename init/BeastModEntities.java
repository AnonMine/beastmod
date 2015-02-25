package anonmine.beastmod.init;

import anonmine.beastmod.BeastMod;
import anonmine.beastmod.client.renderer.entity.RenderAtomicBreath;
import anonmine.beastmod.common.entity.projectile.EntityAtomicBreath;
import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class BeastModEntities {

	public static void init(){
		
	}
	public static void register(){
		
		createEntity(EntityAtomicBreath.class,"AtomicBreath");
		
	}
	private static void createEntity(Class entityClass,String entityName){
		int randomId = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
		EntityRegistry.registerModEntity(entityClass, entityName, randomId, BeastMod.modInstance, 64, 10, true);
	
	}
	public static void registerRenders(){
		
		RenderingRegistry.registerEntityRenderingHandler(EntityAtomicBreath.class, new RenderAtomicBreath(Minecraft.getMinecraft().getRenderManager()));
		
	}
	
}
