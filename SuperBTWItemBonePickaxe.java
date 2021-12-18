package net.minecraft.src;

public class SuperBTWItemBonePickaxe extends Item
{
	public SuperBTWItemBonePickaxe (int iItemID) 
	{
		super (iItemID);
		
    	SetIncineratedInCrucible();
    	setUnlocalizedName( "SuperBTWItemBonePickaxe" );
    	
    	this.setCreativeTab(CreativeTabs.tabTools);
		
	}
}