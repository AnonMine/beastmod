package anonmine.beastmod.event;

import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAITasks.EntityAITaskEntry;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(value=Side.CLIENT)
public class OnSpawnEvent {
	@SubscribeEvent(priority=EventPriority.HIGHEST)
	public void onEntitySpawn(EntityJoinWorldEvent event)
	{
		System.out.print("not yet lobotomized");
		if (event.entity instanceof EntityLiving) 
			lobotomized((EntityLiving) event.entity, event);
		
	}
	
	private void lobotomized(EntityLiving e, Event ev)
	{
		for (int i=0;i < e.targetTasks.taskEntries.size(); i++){
			
			EntityAIBase ai = ((EntityAITaskEntry) e.targetTasks.taskEntries.get(0)).action;
			e.tasks.removeTask(ai);
			
			
		}
		System.out.print("LOBOTOMIZED");
	}
}
