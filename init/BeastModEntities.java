package anonmine.beastmod.init;

import anonmine.beastmod.BeastMod;
import anonmine.beastmod.client.renderer.entity.RenderAtomicBreath;
import anonmine.beastmod.client.renderer.entity.RenderGodzilla;
import anonmine.beastmod.client.renderer.entity.RenderSpider;
import anonmine.beastmod.client.renderer.entity.RenderTarantula;
import anonmine.beastmod.client.renderer.entity.RenderTest;
import anonmine.beastmod.common.entity.giantmonster.EntityGodzilla;
import anonmine.beastmod.common.entity.giantmonster.EntityTarantula;
import anonmine.beastmod.common.entity.projectile.EntityAtomicBreath;
import anonmine.beastmod.common.entity.testmonster.EntityTest;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.item.Item;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class BeastModEntities {

	public static void init(){
		
	}
	public static void postInit(){
		BiomeDictionary.registerAllBiomes();
		BiomeGenBase[] biomes = BiomeDictionary.getBiomesForType(Type.PLAINS);
		System.out.println("Length : " + biomes.length);
		EntityRegistry.addSpawn(EntityTarantula.class, 100, 1, 1, EnumCreatureType.MONSTER, biomes);
	}
	public static void register(){
		
		createEntity(EntityAtomicBreath.class,"AtomicBreath");
		createGiantMonsterEntity(EntityGodzilla.class,"Godzilla",0x5D1F26,0x3DB564);
		createGiantMonsterEntity(EntityTarantula.class,"Tarantula",0x1F0F00,0x990000);
		createMonsterEntity(EntityTest.class,"Test",0x131626,0x24B534);
		
	}
	public static void registerRenders(){
		
		RenderingRegistry.registerEntityRenderingHandler(EntityAtomicBreath.class, new RenderAtomicBreath(Minecraft.getMinecraft().getRenderManager()));
		RenderingRegistry.registerEntityRenderingHandler(EntityGodzilla.class,new RenderGodzilla() );		
		RenderingRegistry.registerEntityRenderingHandler(EntityTest.class,new RenderTest() );			
		RenderingRegistry.registerEntityRenderingHandler(EntityTarantula.class,new RenderTarantula() );	
		
		
		//replacement
		//RenderingRegistry.registerEntityRenderingHandler(EntitySpider.class,new RenderSpider() );	
		
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
	private static void createMonsterEntity(Class entityClass,String entityName,int solidColor, int spotColor){
		int randomId = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
		EntityRegistry.registerModEntity(entityClass, entityName, randomId, BeastMod.modInstance, 64, 1, true);

		createEgg(randomId,solidColor,spotColor);
	}
	
	private static void createEgg(int randomId,int solidColor,int spotColor){
		EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColor, spotColor));
	}
}
