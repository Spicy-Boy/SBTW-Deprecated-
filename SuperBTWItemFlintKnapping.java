package net.minecraft.src;
import java.util.List;

public class SuperBTWItemFlintKnapping extends Item 
{
	
	static public final int m_iDefaultMaxDamage = 10;
//	static boolean holding = true;
	
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
	
/*STANDARD CODE (HOLD RIGHT CLICK)*/
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

/*ATTEMPT TO MAKE IT TAKE DAMAGE WHEN RIGHT CLICK IS RELEASED*/
//	public ItemStack onItemRightClick( ItemStack itemStack, World world, EntityPlayer entityPlayer )
//	{
//		
//		PerformUseEffects(entityPlayer);
//		
//		entityPlayer.setItemInUse( itemStack, getMaxItemUseDuration( itemStack ) );
//		if (holding == false) 
//		{
//			itemStack.damageItem( -1, entityPlayer );
//			holding = true;
//		}
//		
//		if (itemStack.getItemDamage() == 0) 
//		{
//			FCUtilsItem.GivePlayerStackOrEject( entityPlayer, new ItemStack(FCBetterThanWolves.fcItemStone, 1));
//			
//			return new ItemStack( SuperBTWDefinitions.flintBlade, 1);
//		}
//		else 
//		{
//			return itemStack;
//		}
//		
//	}
//	
//	public void onPlayerStoppedUsing(ItemStack itemStack, World par2World, EntityPlayer entityPlayer, int par4) 
//	{
//		System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAH!!!!");
//		holding = false;
//		
//	}

	
	//from FCItemCraftingProgressive
    protected int GetProgressiveCraftingMaxDamage()
    {
    	return m_iDefaultMaxDamage;
    }
    
    public int getMaxItemUseDuration(ItemStack par1ItemStack)
    {
        return 5000;
    }
}
