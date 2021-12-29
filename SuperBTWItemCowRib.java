package net.minecraft.src;

public class SuperBTWItemCowRib extends Item
{
	public SuperBTWItemCowRib (int iItemID) 
	{
		super (iItemID);
		
    	SetIncineratedInCrucible();
    	setUnlocalizedName( "SuperBTWItemCowRib" );
    	
    	this.setCreativeTab(CreativeTabs.tabFood);
		
	}
}
