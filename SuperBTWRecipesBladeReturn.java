package net.minecraft.src;

public class SuperBTWRecipesBladeReturn implements IRecipe
{
	public static ItemStack bladeProgressiveItem;
	
	public boolean matches(InventoryCrafting craftingInventory, World world) 
	{
		ItemStack progressiveItemStack = null;
		
        for ( int iTempSlot = 0; iTempSlot < craftingInventory.getSizeInventory(); ++iTempSlot )
        {
            ItemStack tempStack = craftingInventory.getStackInSlot( iTempSlot );

            if ( tempStack != null )
            {
                if ( isProgressiveItem( tempStack ) )
                {
                	if ( progressiveItemStack == null )
                	{
                		progressiveItemStack = tempStack;
                	}
                	else
                	{
                		return false;
                	}
                }
                else
                {
                	return false;
                }
            }
        }

        return progressiveItemStack != null;
   }
	
	private boolean isProgressiveItem (ItemStack stack)
	{
    	int iItemID = stack.itemID;
		
    	if ( iItemID == SuperBTWDefinitions.leatherWorking.itemID ||
    		iItemID == SuperBTWDefinitions.leatherWorkingIron.itemID ||
    		iItemID == SuperBTWDefinitions.ribCarving.itemID ||
    		iItemID == SuperBTWDefinitions.ribCarvingIron.itemID )
    	{
    		return true;
    	}
		return false;
	}
	
	public ItemStack getCraftingResult(InventoryCrafting craftingInventory)
	{
		ItemStack progressiveItemStack = null;
		
		for ( int iTempSlot = 0; iTempSlot < craftingInventory.getSizeInventory(); ++iTempSlot )
        {
            ItemStack tempStack = craftingInventory.getStackInSlot( iTempSlot );

            if ( tempStack != null )
            {
                if ( isProgressiveItem( tempStack ) )
                {
                	if ( progressiveItemStack == null )
                	{
                		progressiveItemStack = tempStack;
                	}
                	else
                	{
                		return null;
                	}
                }
                else
                {
                	return null;
                }
            }
        }
		
		if (progressiveItemStack != null)
		{
			ItemStack resultStack = null;
			
		}
		
		return null; //NOT DONE
		
	}
	
	@Override
	public int getRecipeSize() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public ItemStack getRecipeOutput() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean HasSecondaryOutput() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean matches(IRecipe recipe) {
		// TODO Auto-generated method stub
		return false;
	}   
}

