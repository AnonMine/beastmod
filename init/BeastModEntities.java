package anonmine.beastmod.init;

import anonmine.beastmod.BeastMod;
import anonmine.beastmod.client.renderer.entity.RenderAtomicBreath;
import anonmine.beastmod.client.renderer.entity.RenderGodzilla;
import anonmine.beastmod.common.entity.giantmonster.EntityGodzilla;
import anonmine.beastmod.common.entity.projectile.EntityAtomicBreath;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.Item;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class BeastModEntities {

	public static void init(){
		
	}
	public static void register(){
		
		createEntity(EntityAtomicBreath.class,"AtomicBreath");
		createGiantMonsterEntity(EntityGodzilla.class,"Godzilla",0x5D1F26,0x3DB564);
		
	}
	public static void registerRenders(){
		
		RenderingRegistry.registerEntityRenderingHandler(EntityAtomicBreath.class, new RenderAtomicBreath(Minecraft.getMinecraft().getRenderManager()));
		RenderingRegistry.registerEntityRenderingHandler(EntityGodzilla.class,new RenderGodzilla(10) );
		
	}
	private static void createEntity(Class entityClass,String entityName){
		int randomId = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
		EntityRegistry.registerModEntity(entityClass, entityName, randomId, BeastMod.modInstance, 64, 10, true);
	
	}
	private static void createGiantMonsterEntity(Class entityClass,String entityName,int solidColor, int spotColor){
		int randomId = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
		EntityRegistry.registerModEntity(entityClass, entityName, randomId, BeastMod.modInstance, 400, 1, true);

		createEgg(randomId,solidColor,spotColor);
	}
	
	private static void createEgg(int randomId,int solidColor,int spotColor){
		EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColor, spotColor));
	}
}
