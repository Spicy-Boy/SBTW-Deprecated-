package net.minecraft.src;

import java.util.ArrayList;

public class SuperBTWRecipesPumpkinCutting implements IRecipe
{
	public boolean matches( InventoryCrafting craftingInventory, World world )
    {
        ItemStack knifeStack = null;
        ItemStack pumpkinStack = null;

        for ( int iTempSlot = 0; iTempSlot < craftingInventory.getSizeInventory(); ++iTempSlot )
        {
            ItemStack tempStack = craftingInventory.getStackInSlot( iTempSlot );

            if ( tempStack != null )
            {
                if ( IsKnife( tempStack ) )
                {
                	if ( knifeStack == null )
                	{
                		knifeStack = tempStack;
                	}
                	else
                	{
                		return false;
                	}
                }
                else if ( IsPumpkin( tempStack ) )
                {
                    if ( pumpkinStack == null )
                    {
                    	pumpkinStack = tempStack;
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

        return knifeStack != null && pumpkinStack != null;
    }
	
	 private boolean IsKnife( ItemStack stack)
	 {
	    	int iItemID = stack.itemID;
   		
	    	if ( iItemID == SuperBTWDefinitions.flintBlade.itemID ||
	    		iItemID == SuperBTWDefinitions.ironBlade.itemID )
	    	{
	    		
	    		return true;
	    	}
	    	
	    	return false;
	 }
	 
	 private boolean IsPumpkin( ItemStack stack )
	 {
	    	int iBlockID = stack.itemID;
	    		    		
	    	if ( iBlockID == SCDefs.pumpkinHarvested.blockID )
	    	{
	    		return true;
	    		
	    	}
	    	
	    	return false;
	  }
	 
	   /**
	     * Returns an Item that is the result of this recipe
	     */
	    public ItemStack getCraftingResult( InventoryCrafting craftingInventory )
	    {
	        ItemStack knifeStack = null;
	        ItemStack pumpkinStack = null;
	        
	        for ( int iTempSlot = 0; iTempSlot < craftingInventory.getSizeInventory(); ++iTempSlot )
	        {
	            ItemStack tempStack = craftingInventory.getStackInSlot( iTempSlot );

	            if ( tempStack != null )
	            {
	                if ( IsKnife( tempStack ) )
	                {
	                	if ( knifeStack == null )
	                	{
	                		knifeStack = tempStack;
	                	}
	                	else
	                	{
	                		return null;
	                	}
	                }
	                else if ( IsPumpkin( tempStack ) )
	                {
	                    if ( pumpkinStack == null )
	                    {
	                    	pumpkinStack = tempStack;                        
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

	        if ( pumpkinStack != null && knifeStack != null )
	        {
	            ItemStack resultStack = null;

	            resultStack = new ItemStack( SCDefs.pumpkinSlice, 2 );

	            
	        	return resultStack;
	        }
	        
	    	return null;
	    }
	    
	    public int getRecipeSize()
	    {
	        return 2;
	    }

	    @Override
	    public ItemStack getRecipeOutput()
	    {
	        return null;
	    }

	    @Override
	    public boolean matches( IRecipe recipe )
	    {
	    	return false;
	    }
	    
	    @Override
	    public boolean HasSecondaryOutput()
	    {
	    	return true;
	    }
}
