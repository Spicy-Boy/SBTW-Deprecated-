package net.minecraft.src;

public class SuperBTWItemRib extends Item
{
	public SuperBTWItemRib (int iItemID) 
	{
		super (iItemID);
		
		SetBuoyant();
    	SetIncineratedInCrucible();
    	setUnlocalizedName( "SuperBTWItemRib" );
		
	}
}
