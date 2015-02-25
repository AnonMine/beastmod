package anonmine.beastmod.proxy;

import anonmine.beastmod.init.BeastModEntities;
import anonmine.beastmod.init.BeastModItems;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void registerRenders(){
		BeastModItems.registerRenders();
		BeastModEntities.registerRenders();
	}
}
