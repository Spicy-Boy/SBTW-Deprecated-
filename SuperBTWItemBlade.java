package net.minecraft.src;

public class SuperBTWItemBlade extends FCItemTool
{
	protected SuperBTWItemBlade( int iItemID, EnumToolMaterial toolMaterial, int iNumUses ) 
	{
		super( iItemID, 1, toolMaterial );
	}

	@Override
	protected boolean IsToolTypeEfficientVsBlockType(Block block) 
	{
		// TODO Auto-generated method stub
		return false;
	}
}
