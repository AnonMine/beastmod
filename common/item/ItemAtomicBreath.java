package anonmine.beastmod.common.item;


import anonmine.beastmod.common.entity.projectile.EntityAtomicBreath;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class ItemAtomicBreath extends Item{
	
	public ItemAtomicBreath(){
		this.maxStackSize = 64;
	}
	
	public boolean canHarvestBlock(Block blockIn){
		return false;
	}
	public boolean getIsRepairable(ItemStack toRepair,ItemStack repair){
		return false;
	}
	
	public ItemStack onItemRightClick(ItemStack itemStack , World worldObj, EntityPlayer player){
		if (!player.capabilities.isCreativeMode){
			--itemStack.stackSize;
		}
		
		player.swingItem();
		player.setItemInUse(itemStack, this.getMaxItemUseDuration(itemStack));
		worldObj.playSoundAtEntity(player, "random.bow", 0.5F, 0.4F/(itemRand.nextFloat()*0.4F+0.8F));
		
		if (!worldObj.isRemote){
			EntityAtomicBreath ab = new EntityAtomicBreath(worldObj,player);
			ab.motionX *= 2;
			ab.motionY *= 2;
			ab.motionZ *= 2;
			worldObj.spawnEntityInWorld(ab);
		}
		
		return itemStack;
	}
	
	
}
