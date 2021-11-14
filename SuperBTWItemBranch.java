package net.minecraft.src;

public class SuperBTWItemBranch extends Item
{
	public SuperBTWItemBranch (int iItemID) 
	{
		super (iItemID);
		
		setFull3D();
		SetBuoyant();
		SetFurnaceBurnTime( FCEnumFurnaceBurnTime.SHAFT );
    	SetIncineratedInCrucible();
    	SetFilterableProperties( m_iFilterable_Narrow );
    	setUnlocalizedName( "SuperBTWItemBranch" );
		
	}
}
