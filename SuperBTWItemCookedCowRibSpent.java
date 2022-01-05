package net.minecraft.src;

public class SuperBTWItemCookedCowRibSpent extends ItemFood {

	public SuperBTWItemCookedCowRibSpent (int iItemID) 
	{
		super (iItemID, 1, 0.25F, false, false);
		
		
    	SetIncineratedInCrucible();
    	setUnlocalizedName( "SuperBTWItemCookedCowRibPartial" );
    	
    	maxStackSize = 1;
		
	}
	
}
