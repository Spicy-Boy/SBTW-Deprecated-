package net.minecraft.src;

public class SuperBTWItemBowStringing extends Item {

	public SuperBTWItemBowStringing(int iItemID) {
		super(iItemID);
		// TODO Auto-generated constructor stub
	    	
	    setUnlocalizedName( "SuperBTWItemFlintKnapping" );  

	    maxStackSize = 1;
        
	    this.setMaxDamage(1);
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
    
    public void onPlayerStoppedUsing( ItemStack itemStack, World world, EntityPlayer player, int iTicksInUseRemaining )
    {	

    	int var6 = this.getMaxItemUseDuration(itemStack) - iTicksInUseRemaining;
    	System.out.println("Var 6 = " + var6);
        
    	if (var6 < 7)
    	{
    		return;
    	}
    	
        if (var6 < 20 || var6 > 35)
        {

        	itemStack.damageItem( 11, player );
        	FCUtilsItem.GivePlayerStackOrEject( player, new ItemStack(FCBetterThanWolves.fcItemStone, 1));
        	//player.inventory.mainInventory[player.inventory.currentItem] = null;
        	player.inventory.mainInventory[player.inventory.currentItem] = new ItemStack( FCBetterThanWolves.fcItemStone, 1);

        }
        else if (var6 > 20)
        {
        	itemStack.damageItem( -1, player);
        	System.out.println("Item damage = " + itemStack.getItemDamage());
        	player.playSound( "fire.ignite", 1.0F, itemRand.nextFloat() * 0.4F + 0.8F );
            //var7 = 1.0F;
        	
        	if (itemStack.getItemDamage() <= 0)
        	{
        		
        		FCUtilsItem.GivePlayerStackOrEject( player, new ItemStack(FCBetterThanWolves.fcItemStone, 1));
        		itemStack.damageItem( 11, player );
        		//to remove item from inv VVV
        		//player.inventory.mainInventory[player.inventory.currentItem] = null;
        		player.inventory.mainInventory[player.inventory.currentItem] = new ItemStack( SuperBTWDefinitions.flintBlade, 1);
        	}
        }
    	
    	
    }
	
}
