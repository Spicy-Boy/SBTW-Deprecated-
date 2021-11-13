package net.minecraft.src;

public class SuperBTWItemFlintBlade extends SuperBTWItemBlade 
//should be extends SuperBTWItemBlade
{

	
	public SuperBTWItemFlintBlade(int iItemID) 
	{
		super(iItemID, EnumToolMaterial.STONE, 20);
		// TODO Auto-generated constructor stub
		
		SetFilterableProperties( Item.m_iFilterable_Narrow );
	    	
	    setUnlocalizedName( "SuperBTWItemFlintBlade" );  

	}
	
    public float getStrVsBlock( ItemStack stack, World world, Block block, int i, int j, int k )
    {
    	float fStrength = super.getStrVsBlock( stack, world, block, i, j, k );
    	
    	if ( block.blockID == Block.web.blockID || block.blockID == FCBetterThanWolves.fcBlockWeb.blockID )
    	{	
    		fStrength *= 50;
    	}
    	
    	return fStrength;
    }


	
}

