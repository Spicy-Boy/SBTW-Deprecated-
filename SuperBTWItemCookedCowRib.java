package net.minecraft.src;

public class SuperBTWItemCookedCowRib extends Item
{
	public SuperBTWItemCookedCowRib (int iItemID) 
	{
		super (iItemID);
		
		SetBuoyant();
    	SetIncineratedInCrucible();
    	setUnlocalizedName( "SuperBTWItemCookedCowRib" );

    	
    	this.setCreativeTab(CreativeTabs.tabFood);

		
	}
}
