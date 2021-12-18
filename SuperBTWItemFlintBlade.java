package net.minecraft.src;

public class SuperBTWItemFlintBlade extends SuperBTWItemBlade 
//should be extends SuperBTWItemBlade
{
	static int durability = 20;
	
	public SuperBTWItemFlintBlade(int iItemID) 
	{
		super(iItemID, EnumToolMaterial.STONE, durability);
		// TODO Auto-generated constructor stub
		
		SetFilterableProperties( Item.m_iFilterable_Narrow );
	    	
	    setUnlocalizedName( "SuperBTWItemFlintBlade" );  
	    
	    this.setCreativeTab(CreativeTabs.tabTools);

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
    
	public int getMaterial()
	{
		return 0; //0 is flint, 1 is iron
	}


	
}

