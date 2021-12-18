package net.minecraft.src;

public class SuperBTWItemIronBlade extends SuperBTWItemBlade 
//should be extends SuperBTWItemBlade
{
	
	static int durability = 75;
	
	public SuperBTWItemIronBlade(int iItemID) 
	{
		//ID, material, number of uses
		super(iItemID, EnumToolMaterial.IRON, durability);
		// TODO Auto-generated constructor stub
	    	
		SetFilterableProperties( Item.m_iFilterable_Narrow );
		
	    setUnlocalizedName( "SuperBTWItemIronBlade" ); 
	    
	    this.setCreativeTab(CreativeTabs.tabTools);
	    
	    SetIncineratedInCrucible();

	}
	
	
    public float getStrVsBlock( ItemStack stack, World world, Block block, int i, int j, int k )
    {
    	float fStrength = super.getStrVsBlock( stack, world, block, i, j, k );
    	
    	if ( block.blockID == Block.web.blockID || block.blockID == FCBetterThanWolves.fcBlockWeb.blockID )
    	{	
    		fStrength *= 150;
    	}
    	
    	return fStrength;
    }
    
	public int getMaterial()
	{
		return 1; //0 is flint, 1 is iron
	}
}
