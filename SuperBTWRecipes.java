package net.minecraft.src;

public class SuperBTWRecipes extends FCRecipes
{
	public static final SuperBTWRecipes instance = new SuperBTWRecipes();
	private SuperBTWRecipes() {}
	
	public static void addRecipes()
	{
		addCustomRecipeClasses();
		addBlockRecipes();
		addFoodRecipes();
		addToolRecipes();
		addProgressRecipes();
		addBladeRecipes();
		addLeatherRecipes();
	}
	
	public static void addCustomRecipeClasses() 
	{
		CraftingManager.getInstance().getRecipeList().add( new SuperBTWRecipesLeatherCutting() );
		
		CraftingManager.getInstance().getRecipeList().add( new SuperBTWRecipesRibCarving() );
		
		CraftingManager.getInstance().getRecipeList().add( new SuperBTWRecipesBladeReturn() );
	}
	
	public static void addBlockRecipes()
	{
		AddRecipe( new ItemStack( FCBetterThanWolves.fcBlockWorkbench, 1 ), new Object[] //ITS BACK BABY
		{
			"###", 
			"#X#", 
			"###", 
			'#', Block.planks, 
			'X', Item.ingotIron
		} );
	}
	
	
	public static void addToolRecipes()
	{
		FCRecipes.AddShapelessRecipe(new ItemStack(SuperBTWDefinitions.bonePickaxe, 1), new ItemStack [] {new ItemStack(SuperBTWDefinitions.rib), new ItemStack(Item.silk), new ItemStack(Item.stick)} );
		FCRecipes.AddShapelessRecipe(new ItemStack(SuperBTWDefinitions.bonePickaxe, 1), new ItemStack [] {new ItemStack(SuperBTWDefinitions.rib), new ItemStack(FCBetterThanWolves.fcItemHempFibers), new ItemStack(Item.stick)} );
		
	
	}
	
	public static void addFoodRecipes()
	{
		FurnaceRecipes.smelting().addSmelting( SuperBTWDefinitions.cowRib.itemID, new ItemStack( SuperBTWDefinitions.cookedCowRib ), 0 );
		
	}
	
	private static void addProgressRecipes() 
	{

		//OLD VVV
		//FCRecipes.AddShapelessRecipe(new ItemStack(SuperBTWDefinitions.leatherWorking, 1, 20), new ItemStack[] {new ItemStack(SuperBTWDefinitions.flintBlade), new ItemStack(Item.leather)} );
		
		
		FCRecipes.AddShapelessRecipe(new ItemStack(SuperBTWDefinitions.flintKnapping, 1, /*this number must match the value within GetProgressiveCraftingMaxDamage*/10), new ItemStack [] {new ItemStack(Item.flint), new ItemStack(FCBetterThanWolves.fcItemStone)} );
	}
	
	private static void addBladeRecipes()
	{
		AddRecipe( new ItemStack( SuperBTWDefinitions.ironBlade ), new Object[] 
		{
			"X", 
			"X", 
	    	Character.valueOf( 'X' ), FCBetterThanWolves.fcItemNuggetIron
		} );
		AddRecipe( new ItemStack( SuperBTWDefinitions.ironBlade ), new Object[] 
		{ 
			"XX", 
	    	Character.valueOf( 'X' ), FCBetterThanWolves.fcItemNuggetIron
		} );
		
	}
	
	private static void addLeatherRecipes()
	{
		FCRecipes.AddShapelessRecipe(new ItemStack(Item.plateLeather, 1), new ItemStack [] {new ItemStack(FCBetterThanWolves.fcItemLeatherCut), new ItemStack(FCBetterThanWolves.fcItemLeatherCut), new ItemStack(FCBetterThanWolves.fcItemLeatherCut), new ItemStack(FCBetterThanWolves.fcItemLeatherCut)} );
		FCRecipes.AddShapelessRecipe(new ItemStack(Item.legsLeather, 1), new ItemStack [] {new ItemStack(FCBetterThanWolves.fcItemLeatherCut), new ItemStack(FCBetterThanWolves.fcItemLeatherCut), new ItemStack(FCBetterThanWolves.fcItemLeatherCut)} );
		FCRecipes.AddShapelessRecipe(new ItemStack(Item.bootsLeather, 1), new ItemStack [] {new ItemStack(FCBetterThanWolves.fcItemLeatherCut), new ItemStack(FCBetterThanWolves.fcItemLeatherCut)} );
		FCRecipes.AddShapelessRecipe(new ItemStack(Item.helmetLeather, 1), new ItemStack [] {new ItemStack(FCBetterThanWolves.fcItemLeatherCut)} );
		
		
		AddStokedCrucibleRecipe( 
			new ItemStack( SuperBTWDefinitions.rib, 1 ), 
			new ItemStack[] {
			new ItemStack( SuperBTWDefinitions.cowRib )
		} );
	}


}
