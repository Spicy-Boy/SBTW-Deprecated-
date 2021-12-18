package net.minecraft.src;

import java.util.ArrayList;

public class SuperBTWRecipesRibCarving implements IRecipe
{
	
	public static ItemStack blade;

	 public boolean matches( InventoryCrafting craftingInventory, World world )
	    {
	        ItemStack bladeStack = null;
	        ItemStack ribStack = null;

	        for ( int iTempSlot = 0; iTempSlot < craftingInventory.getSizeInventory(); ++iTempSlot )
	        {
	            ItemStack tempStack = craftingInventory.getStackInSlot( iTempSlot );

	            if ( tempStack != null )
	            {
	                if ( isBlade( tempStack ) )
	                {
	                	if ( bladeStack == null )
	                	{
	                		bladeStack = tempStack;
	                	}
	                	else
	                	{
	                		return false;
	                	}
	                }
	                else if ( IsRib( tempStack ) )
	                {
	                    if ( ribStack == null )
	                    {
	                        ribStack = tempStack;
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

	        return bladeStack != null && ribStack != null;
	   }
	 
	 private boolean isBlade( ItemStack stack)
	 {
	    	int iItemID = stack.itemID;
    		
	    	if ( iItemID == SuperBTWDefinitions.flintBlade.itemID ||
	    		iItemID == SuperBTWDefinitions.ironBlade.itemID )
	    	{
	    		
	    		return true;
	    	}
	    	
	    	return false;
	 }
	 
	 private boolean IsRib( ItemStack stack )
	 {
	    	int iItemID = stack.itemID;
	    		    		
	    	if ( iItemID == SuperBTWDefinitions.cowRib.itemID )
	    	{
	    		return true;
	    		
	    	}
	    	
	    	return false;
	  }

	@Override
	public ItemStack getCraftingResult(InventoryCrafting craftingInventory) {
	    {
	        ItemStack bladeStack = null;
	        ItemStack ribStack = null;
	        
	        for ( int iTempSlot = 0; iTempSlot < craftingInventory.getSizeInventory(); ++iTempSlot )
	        {
	            ItemStack tempStack = craftingInventory.getStackInSlot( iTempSlot );

	            if ( tempStack != null )
	            {
	                if ( isBlade( tempStack ) )
	                {
	                	if ( bladeStack == null )
	                	{
	                		bladeStack = tempStack;
	                	}
	                	else
	                	{
	                		return null;
	                	}
	                }
	                else if ( IsRib( tempStack ) )
	                {
	                    if ( ribStack == null )
	                    {
	                        ribStack = tempStack;                        
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
	        
	        if ( ribStack != null && bladeStack != null )
	        {
	        	ItemStack resultStack = null;
	        	
	        	ItemStack inheritedBlade = bladeStack;
	        	

	        	SuperBTWItemBlade bladeItem = (SuperBTWItemBlade)bladeStack.getItem();
            	NBTTagCompound newTag = new NBTTagCompound();
            	
	        	switch (bladeItem.getMaterial()) {
	        	
	        	case 0:

	            	resultStack = new ItemStack(SuperBTWDefinitions.ribCarving, 1, 150);
	            	break;
	            	
	            	//test output
	            	//resultStack = bladeStack;
	        		
	        	case 1:
	        		
	            	resultStack = new ItemStack(SuperBTWDefinitions.ribCarvingIron, 1, 75);
	            	break;
	        		
	        	default:
	        		
	            	return null;
	        	
	        	}
            	
            	resultStack.setTagCompound(newTag);
            	resultStack.getTagCompound().setInteger("damage", inheritedBlade.getItemDamage());
	            
	            return resultStack;

	        }
	        
	    	return null;
	    }
	}

	@Override
	public int getRecipeSize() {
		// TODO Auto-generated method stub
		return 2;
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
