package net.minecraft.src;

import java.util.ArrayList;

public class SuperBTWRecipesLeatherCutting implements IRecipe
{
	
	public static ItemStack blade;

	 public boolean matches( InventoryCrafting craftingInventory, World world )
	    {
	        ItemStack bladeStack = null;
	        ItemStack leatherStack = null;

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
	                else if ( IsLeather( tempStack ) )
	                {
	                    if ( leatherStack == null )
	                    {
	                        leatherStack = tempStack;
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

	        return bladeStack != null && leatherStack != null;
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
	 
	 private boolean IsLeather( ItemStack stack )
	 {
	    	int iItemID = stack.itemID;
	    		    		
	    	if ( iItemID == Item.leather.itemID )
	    	{
	    		return true;
	    		
	    	}
	    	
	    	return false;
	  }

	@Override
	public ItemStack getCraftingResult(InventoryCrafting craftingInventory) {
	    {
	        ItemStack bladeStack = null;
	        ItemStack leatherStack = null;
	        
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
	                else if ( IsLeather( tempStack ) )
	                {
	                    if ( leatherStack == null )
	                    {
	                        leatherStack = tempStack;                        
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
	        
	        if ( leatherStack != null && bladeStack != null )
	        {
	        	ItemStack resultStack = null;
	        	
	        	ItemStack inheritedBlade = bladeStack;
	        	

	        	SuperBTWItemBlade bladeItem = (SuperBTWItemBlade)bladeStack.getItem();

	            if ( bladeItem.getMaterial() == 0 ) // flint
	            {
	            	resultStack = new ItemStack(SuperBTWDefinitions.leatherWorking, 1, 150);
	            	
	            	NBTTagCompound newTag = new NBTTagCompound();
	            	resultStack.setTagCompound(newTag);
	            	
	            	resultStack.getTagCompound().setInteger("damage", inheritedBlade.getItemDamage());
	            	
	            	
	            	//test output
	            	//resultStack = bladeStack;
	            }
	            
	            else if ( bladeItem.getMaterial() == 1 ) //iron
	            {
	            	resultStack = new ItemStack(SuperBTWDefinitions.leatherWorkingIron, 1, 30);
	            	
	            	NBTTagCompound newTag = new NBTTagCompound();
	            	resultStack.setTagCompound(newTag);
	            	
	            	resultStack.getTagCompound().setInteger("damage", inheritedBlade.getItemDamage());
	            }
	            
	            else
	            {
	            	return null;
	            }
	            
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
