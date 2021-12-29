package net.minecraft.src;
import java.util.List;

//TODO calculate pull force (for good/bad hits) and figure out animations

public class SuperBTWItemFlintKnapping extends Item 
{
    public static final String[] knappingIconNameArray = new String[] {"knapping_pull_0", "knapping_pull_1", "knapping_pull_2"};
    private Icon[] iconArray;
	
	public SuperBTWItemFlintKnapping(int iItemID) {
		super(iItemID);
		// TODO Auto-generated constructor stub
	    	
	    setUnlocalizedName( "SuperBTWItemFlintKnapping" );  

	    maxStackSize = 1;
        
        setMaxDamage( GetProgressiveCraftingMaxDamage() );
	}
	
	 protected int GetProgressiveCraftingMaxDamage() //how long it takes... don't forget to match value from RecipesRibCarving!
	 {
	    return 10;
	 }
	
    public int getMaxItemUseDuration(ItemStack par1ItemStack)
    {
    	//same as bow, not sure what this does...
        return 72000; 
    }
	
	public ItemStack onItemRightClick( ItemStack stack, World world, EntityPlayer player )
    {

    	player.setItemInUse( stack, getMaxItemUseDuration( stack ) );
    	
    	return stack;
    }
	
	//may need to look into this to make animation work
    public EnumAction getItemUseAction(ItemStack par1ItemStack)
    {
        return EnumAction.bow;
    }
    
    //when bad hits == 3, break item and return stone to player
    public void onPlayerStoppedUsing( ItemStack itemStack, World world, EntityPlayer player, int iTicksInUseRemaining )
    {
    	itemStack.damageItem( -1, player );
    	player.playSound( "fire.ignite", 1.0F, itemRand.nextFloat() * 0.4F + 0.8F );
    	
    	if (itemStack.getItemDamage() <= 0)
    	{
    		
    		FCUtilsItem.GivePlayerStackOrEject( player, new ItemStack(FCBetterThanWolves.fcItemStone, 1));
    		itemStack.damageItem( 11, player );
    		//to remove item from inv VVV
    		//player.inventory.mainInventory[player.inventory.currentItem] = null;
    		player.inventory.mainInventory[player.inventory.currentItem] = new ItemStack( SuperBTWDefinitions.flintBlade, 1);;
    	}
    	
    	
    }
	
	
	
    public void registerIcons(IconRegister par1IconRegister)
    {
        super.registerIcons(par1IconRegister);
        this.iconArray = new Icon[knappingIconNameArray.length];

        for (int var2 = 0; var2 < this.iconArray.length; ++var2)
        {
            this.iconArray[var2] = par1IconRegister.registerIcon(knappingIconNameArray[var2]);
        }
    }
    
    public Icon getItemIconForUseDuration(int par1)
    {
        return this.iconArray[par1];
    }
	

	//OLD STUFF VVV

//	private Icon m_iconFlintKnapping;
//
//	@Override    
//	public void registerIcons( IconRegister register )
//	{
//		super.registerIcons( register );
//   	
//		m_iconFlintKnapping = register.registerIcon( "SuperBTWItemFlintKnapping" );
//	}
	
///*STANDARD CODE (HOLD RIGHT CLICK)*/
//	public ItemStack onItemRightClick( ItemStack itemStack, World world, EntityPlayer entityPlayer )
//	{
//		
//		PerformUseEffects(entityPlayer);
//		
//		itemStack.damageItem( -1, entityPlayer );
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
//	protected void PerformUseEffects( EntityPlayer player )
//	{
//		player.playSound( "fire.ignite", 1.0F, itemRand.nextFloat() * 0.4F + 0.8F );
//		//System.out.println("USED KNAPPING USED KNAPPING USED KNAPPING");
//	}

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

	
//	//from FCItemCraftingProgressive
//    protected int GetProgressiveCraftingMaxDamage()
//    {
//    	return m_iDefaultMaxDamage;
//    }
    
//    public int getMaxItemUseDuration(ItemStack par1ItemStack)
//    {
//        return 5000;
//    }
}
