package anonmine.beastmod.init;

import net.minecraft.entity.EntityLiving;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class BeastModEventHandler {
	
	@SubscribeEvent
	public void onEntitySpawn(EntityJoinWorldEvent event)
	{
		//System.out.print("not yet lobotomized "+ event.entity.getName());
//		if (event.entity instanceof EntityLiving) 
//			lobotomized((EntityLiving) event.entity);
		
	}
	private void lobotomized(EntityLiving e)
	{
		e.tasks.taskEntries.clear();
		e.targetTasks.taskEntries.clear();
		//System.out.print("LOBOTOMIZED");
	}

}
