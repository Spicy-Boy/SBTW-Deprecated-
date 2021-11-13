package net.minecraft.src;

public class SuperBTWItemLeatherWorking extends FCItemCraftingProgressive 
{
	
	
	
	public SuperBTWItemLeatherWorking(int iItemID) {
		super(iItemID);
		// TODO Auto-generated constructor stub
	    	
	    SetBuoyant();
	    	
	    setUnlocalizedName( "SuperBTWItemLeatherCutting" );  
	    
	    setMaxDamage( GetProgressiveCraftingMaxDamage() );
	 }
	 
	 protected void PlayCraftingFX( ItemStack stack, World world, EntityPlayer player )
	 {
	    	//worldObj.playAuxSFX( FCBetterThanWolves.m_iCreeperNeuteredAuxFXID, i, j, k, 0 );
	        player.playSound( "mob.sheep.shear", 
	        	0.25F + 0.25F * (float)world.rand.nextInt( 2 ), 
	        	( world.rand.nextFloat() - world.rand.nextFloat() ) * 0.25F + 1.75F );
	 }
	 
	 public ItemStack onEaten( ItemStack stack, World world, EntityPlayer player )
	 {
	    	ItemStack leatherWorking = new ItemStack( SuperBTWDefinitions.leatherWorking, 1);
	    	
	        world.playSoundAtEntity( player, "step.cloth", 1.0F, world.rand.nextFloat() * 0.1F + 0.9F );
	        
			//FCUtilsItem.GivePlayerStackOrEject( player, leatherWorking );
			
	        return new ItemStack( FCBetterThanWolves.fcItemLeatherCut, 2);
	 }
	 
	 private Icon m_iconLeatherWorking;
	 
	 @Override    
	 public void registerIcons( IconRegister register )
	 {
		 super.registerIcons( register );
	    	
	     m_iconLeatherWorking = register.registerIcon( "SuperBTWItemLeatherCutting" );
	 }
	    
	 public void onCreated( ItemStack stack, World world, EntityPlayer player ) 
	 {

			
	    super.onCreated( stack, world, player );
	 }
	 
	 protected int GetProgressiveCraftingMaxDamage()
	 {
	    	return 20;
	 }

}
