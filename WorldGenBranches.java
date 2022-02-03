package net.minecraft.src;

import java.util.Random;

public class WorldGenBranches extends WorldGenerator
{
	
	private int branchBlockID;
	
	public WorldGenBranches(int ID)
	{
		
		this.branchBlockID = ID;
		
	}
	
	@Override
	public boolean generate(World par1World, Random par2Random, int par3, int par4, int par5)
	{
		
		for (int var6 = 0; var6 < 64; ++var6)
        {
            int var7 = par3 + par2Random.nextInt(8) - par2Random.nextInt(8);
            int var8 = par4 + par2Random.nextInt(4) - par2Random.nextInt(4);
            int var9 = par5 + par2Random.nextInt(8) - par2Random.nextInt(8);

            // FCMOD: Change
            /*
            if (par1World.isAirBlock(var7, var8, var9) && (!par1World.provider.hasNoSky || var8 < 127) && Block.blocksList[this.plantBlockId].canBlockStay(par1World, var7, var8, var9))
            */
            if (par1World.isAirBlock(var7, var8, var9) && (par1World.provider.hasNoSky || var8 < 127) && 
            	Block.blocksList[this.branchBlockID].CanBlockStayDuringGenerate(par1World, var7, var8, var9))
        	// END FCMOD
            {
                par1World.setBlock(var7, var8, var9, this.branchBlockID, 0, 2);
            }
        }

        return true;
    }

}
