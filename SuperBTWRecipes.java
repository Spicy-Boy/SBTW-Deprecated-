package net.minecraft.src;

public class SuperBTWRecipes 
{
	public static final SuperBTWRecipes instance = new SuperBTWRecipes();
	private SuperBTWRecipes() {}
	
	public static void addRecipes()
	{
		addProgressRecipes();
		addBladeRecipes();
		addLeatherRecipes();
	}
	
    public static ShapedRecipes AddRecipe( ItemStack itemStack, Object aobj[] )
	{
    	return CraftingManager.getInstance().addRecipe( itemStack, aobj );
	}
	
	private static void addProgressRecipes() 
	{
		FCRecipes.AddShapelessRecipe(new ItemStack(SuperBTWDefinitions.leatherWorking, 1, 20), new ItemStack[] {new ItemStack(Item.flint), new ItemStack(Item.leather)} );
		FCRecipes.AddShapelessRecipe(new ItemStack(SuperBTWDefinitions.flintKnapping, 1, 10), new ItemStack [] {new ItemStack(Item.flint), new ItemStack(FCBetterThanWolves.fcItemStone)} );
	}
	
	private static void addBladeRecipes()
	{
		AddRecipe( new ItemStack( SuperBTWDefinitions.ironBlade ), new Object[] 
		{
			"X", 
			"X", 
	    	Character.valueOf( 'X' ), FCBetterThanWolves.fcItemNuggetIron
		} );
	}
	
	private static void addLeatherRecipes()
	{
		FCRecipes.AddShapelessRecipe(new ItemStack(Item.plateLeather, 1), new ItemStack [] {new ItemStack(FCBetterThanWolves.fcItemLeatherCut), new ItemStack(FCBetterThanWolves.fcItemLeatherCut), new ItemStack(FCBetterThanWolves.fcItemLeatherCut), new ItemStack(FCBetterThanWolves.fcItemLeatherCut)} );
		FCRecipes.AddShapelessRecipe(new ItemStack(Item.legsLeather, 1), new ItemStack [] {new ItemStack(FCBetterThanWolves.fcItemLeatherCut), new ItemStack(FCBetterThanWolves.fcItemLeatherCut), new ItemStack(FCBetterThanWolves.fcItemLeatherCut)} );
		FCRecipes.AddShapelessRecipe(new ItemStack(Item.helmetLeather, 1), new ItemStack [] {new ItemStack(FCBetterThanWolves.fcItemLeatherCut), new ItemStack(FCBetterThanWolves.fcItemLeatherCut)} );
		FCRecipes.AddShapelessRecipe(new ItemStack(Item.bootsLeather, 1), new ItemStack [] {new ItemStack(FCBetterThanWolves.fcItemLeatherCut)} );
		
	}


}
