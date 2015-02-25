package anonmine.beastmod.init;

import anonmine.beastmod.Reference;
import anonmine.beastmod.common.item.ItemAtomicBreath;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BeastModItems {

	public static Item atomic_breath_item;
	
	public static void init(){
		atomic_breath_item = (new ItemAtomicBreath()).setUnlocalizedName("atomic_breath_item").setCreativeTab(CreativeTabs.tabCombat);
	}

	public static void register(){
		GameRegistry.registerItem(atomic_breath_item, atomic_breath_item.getUnlocalizedName().substring(5));
	
	}
	
	public static void registerRenders(){
		
		registerRender(atomic_breath_item);
	}
	
	public static void registerRender(Item item){

		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID+":"+item.getUnlocalizedName().substring(5),"inventory"));
	}
}
