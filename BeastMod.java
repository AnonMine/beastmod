package anonmine.beastmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import anonmine.beastmod.init.BeastModEntities;
import anonmine.beastmod.init.BeastModItems;
import anonmine.beastmod.proxy.CommonProxy;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class BeastMod {

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@Instance(Reference.MOD_ID)
	public static BeastMod modInstance;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		BeastModItems.init();
		BeastModItems.register();
		
		BeastModEntities.register();
	}

	@EventHandler
	public void init(FMLInitializationEvent event){
		proxy.registerRenders();
	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
	
}
