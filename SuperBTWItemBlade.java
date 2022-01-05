package net.minecraft.src;

public class SuperBTWItemBlade extends FCItemTool
{
	
	private final int m_iWeaponDamage;
	
	protected SuperBTWItemBlade( int iItemID, EnumToolMaterial toolMaterial, int iNumUses ) 
	{
		super( iItemID, 1, toolMaterial );
		
		m_iWeaponDamage = 1;
	}

	@Override
	protected boolean IsToolTypeEfficientVsBlockType(Block block) 
	{
		// TODO Auto-generated method stub
		return false;
	}

	public int getMaterial()
	{
		return 1; //0 is flint, 1 is iron
	}
	
    public float getStrVsBlock( ItemStack stack, World world, Block block, int i, int j, int k )
    {
        Material material = block.blockMaterial;
            
            if ( material == Material.plants || material == Material.vine || material == Material.coral || material != Material.leaves || material != Material.pumpkin )
            {
            	return 2.5F;
            }            
    	
    	return super.getStrVsBlock( stack, world, block, i, j, k );
    }
    
    public int getDamageVsEntity( Entity entity )
    {
        return m_iWeaponDamage;
    }
    
//    @Override
//    public boolean onBlockDestroyed( ItemStack stack, World world, int iBlockID, int i, int j, int k, EntityLiving usingEntity )
//    {
//        if ( iBlockID != Block.leaves.blockID && 
//        	iBlockID != FCBetterThanWolves.fcBlockBloodLeaves.blockID &&
//        	iBlockID != Block.vine.blockID && 
//        	iBlockID != FCBetterThanWolves.fcBlockHempCrop.blockID )
//        {
//            return super.onBlockDestroyed(stack, world, iBlockID, i, j, k, usingEntity);
//        }
//        else
//        {
//            stack.damageItem( 1, usingEntity );
//            return true;
//        }
//    }
	

}
