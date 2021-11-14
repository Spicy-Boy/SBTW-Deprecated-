package net.minecraft.src;
import java.util.List;

public class SuperBTWItemFlintKnapping extends Item 
{
	
	static public final int m_iDefaultMaxDamage = 10;
	
	public SuperBTWItemFlintKnapping(int iItemID) {
		super(iItemID);
		// TODO Auto-generated constructor stub
	    	
	    setUnlocalizedName( "SuperBTWItemFlintKnapping" );  

	    maxStackSize = 1;        
        
        setMaxDamage( GetProgressiveCraftingMaxDamage() );
	}
	

//	private Icon m_iconFlintKnapping;
//
//	@Override    
//	public void registerIcons( IconRegister register )
//	{
//		super.registerIcons( register );
//   	
//		m_iconFlintKnapping = register.registerIcon( "SuperBTWItemFlintKnapping" );
//	}
	
	
//	@Override
//    public boolean onItemUse( ItemStack stack, EntityPlayer player, World world, int i, int j, int k, int iFacing, float fClickX, float fClickY, float fClickZ )
//    {
//        //if ( player.canPlayerEdit( i, j, k, iFacing, stack ) )
//        //{
//    		PerformUseEffects( player );
//  
//            //player.addExhaustion( m_fExhaustionPerUse );
//            
//            stack.damageItem( -1, player );
//            
//            return true;
//        //}
//        
//        //return false;
//    }
	
	public ItemStack onItemRightClick( ItemStack itemStack, World world, EntityPlayer entityPlayer )
	{
		
		PerformUseEffects(entityPlayer);
		
		itemStack.damageItem( -1, entityPlayer );
		
		if (itemStack.getItemDamage() == 0) 
		{
			FCUtilsItem.GivePlayerStackOrEject( entityPlayer, new ItemStack(FCBetterThanWolves.fcItemStone, 1));
			
			return new ItemStack( SuperBTWDefinitions.flintBlade, 1);
		}
		else 
		{
			return itemStack;
		}
		
	}
	
	protected void PerformUseEffects( EntityPlayer player )
	{
		player.playSound( "fire.ignite", 1.0F, itemRand.nextFloat() * 0.4F + 0.8F );
		//System.out.println("USED KNAPPING USED KNAPPING USED KNAPPING");
	}
	
	//from FCItemCraftingProgressive
    protected int GetProgressiveCraftingMaxDamage()
    {
    	return m_iDefaultMaxDamage;
    }
}
