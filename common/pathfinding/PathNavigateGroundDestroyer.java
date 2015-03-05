package anonmine.beastmod.common.pathfinding;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.pathfinding.PathEntity;
import net.minecraft.pathfinding.PathFinder;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.util.BlockPos;
import net.minecraft.util.Vec3;
import net.minecraft.world.ChunkCache;
import net.minecraft.world.World;
import net.minecraft.world.pathfinder.WalkNodeProcessor;

public class PathNavigateGroundDestroyer extends PathNavigateGround{

    private final PathFinder pathFinder;
    
	public PathNavigateGroundDestroyer(EntityLiving p_i1671_1_, World worldIn) {
		super(p_i1671_1_, worldIn);
		// TODO Auto-generated constructor stub
        pathFinder = new PathFinder(this.field_179695_a);
	}


    protected boolean isDirectPathBetweenPoints(Vec3 pos1, Vec3 pos2, int entityXSize, int entityYSize, int entityZSize)
    {
    	return true;
		//return super.isDirectPathBetweenPoints(pos1, pos2, entityXSize/2, 1 , 1);
    }
    /**
     * Returns the path to the given EntityLiving. Args : entity
     */
    public PathEntity getPathToEntityLiving(Entity p_75494_1_)
    {
        if (!this.canNavigate())
        {
            return null;
        }
        else
        {
            float f = this.getPathSearchRange();
            this.worldObj.theProfiler.startSection("pathfind");
            BlockPos blockpos = (new BlockPos(this.theEntity)).up();
            int i = (int)(f + 16.0F);
            ChunkCache chunkcache = new ChunkCache(this.worldObj, blockpos.add(-i, -i, -i), blockpos.add(i, i, i), 0);
            PathEntity pathentity = this.pathFinder.func_176188_a(chunkcache, this.theEntity, p_75494_1_, f);
            this.worldObj.theProfiler.endSection();
            return pathentity;
        }
    }
}
