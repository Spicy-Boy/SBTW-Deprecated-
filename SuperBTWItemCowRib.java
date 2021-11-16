package net.minecraft.src;

public class SuperBTWItemCowRib extends Item
{
	public SuperBTWItemCowRib (int iItemID) 
	{
		super (iItemID);
		
		SetBuoyant();
    	SetIncineratedInCrucible();
    	setUnlocalizedName( "SuperBTWItemCowRib" );
		
	}
}
