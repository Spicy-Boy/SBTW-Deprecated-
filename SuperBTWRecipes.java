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
		addMiscRecipes();
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
		
		//hoes hoes hoes
		AddRecipe( new ItemStack( SuperBTWDefinitions.hoeStoneNew, 1 ), new Object[] {
	            "XI", 
	            "SI",
	            " I",
	            Character.valueOf('X'), FCBetterThanWolves.fcItemStone, 
	            Character.valueOf('I'), Item.stick,
	            Character.valueOf('S'), Item.silk,
		} );
		AddRecipe( new ItemStack( SuperBTWDefinitions.hoeStoneNew, 1 ), new Object[] {
	            "IX", 
	            "IS",
	            "I ",
	            Character.valueOf('X'), FCBetterThanWolves.fcItemStone, 
	            Character.valueOf('I'), Item.stick,
	            Character.valueOf('S'), Item.silk,
		} );
		AddRecipe( new ItemStack( SuperBTWDefinitions.hoeStoneNew, 1 ), new Object[] {
	            "XI ", 
	            " IS",
	            " I ",
	            Character.valueOf('X'), FCBetterThanWolves.fcItemStone, 
	            Character.valueOf('I'), Item.stick,
	            Character.valueOf('S'), Item.silk,
		} );
		AddRecipe( new ItemStack( SuperBTWDefinitions.hoeStoneNew, 1 ), new Object[] {
	            " IX", 
	            "SI ",
	            " I ",
	            Character.valueOf('X'), FCBetterThanWolves.fcItemStone, 
	            Character.valueOf('I'), Item.stick,
	            Character.valueOf('S'), Item.silk,
		} );
		AddRecipe( new ItemStack( SuperBTWDefinitions.hoeStoneNew, 1 ), new Object[] {
	            "XIS", 
	            " I ",
	            " I ",
	            Character.valueOf('X'), FCBetterThanWolves.fcItemStone, 
	            Character.valueOf('I'), Item.stick,
	            Character.valueOf('S'), Item.silk,
		} );
	
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
			"X",
			"X",
	    	Character.valueOf( 'X' ), FCBetterThanWolves.fcItemNuggetIron
		} );
		
		AddRecipe( new ItemStack( FCBetterThanWolves.fcAestheticVegetation, 1, FCBlockAestheticVegetation.m_iSubtypeVineTrap ), new Object[] {
	    	"##", 
	    	Character.valueOf( '#' ), Block.vine
		} );
		
	}
	
	private static void addMiscRecipes()
	{
		FCRecipes.AddShapelessRecipe(new ItemStack(Item.plateLeather, 1), new ItemStack [] {new ItemStack(FCBetterThanWolves.fcItemLeatherCut), new ItemStack(FCBetterThanWolves.fcItemLeatherCut), new ItemStack(FCBetterThanWolves.fcItemLeatherCut), new ItemStack(FCBetterThanWolves.fcItemLeatherCut)} );
		FCRecipes.AddShapelessRecipe(new ItemStack(Item.legsLeather, 1), new ItemStack [] {new ItemStack(FCBetterThanWolves.fcItemLeatherCut), new ItemStack(FCBetterThanWolves.fcItemLeatherCut), new ItemStack(FCBetterThanWolves.fcItemLeatherCut)} );
		FCRecipes.AddShapelessRecipe(new ItemStack(Item.bootsLeather, 1), new ItemStack [] {new ItemStack(FCBetterThanWolves.fcItemLeatherCut), new ItemStack(FCBetterThanWolves.fcItemLeatherCut)} );
		FCRecipes.AddShapelessRecipe(new ItemStack(Item.helmetLeather, 1), new ItemStack [] {new ItemStack(FCBetterThanWolves.fcItemLeatherCut)} );
		
		FCRecipes.AddShapelessRecipe(new ItemStack(FCBetterThanWolves.fcItemFireStarterSticks, 1), new ItemStack [] {new ItemStack(SuperBTWDefinitions.branch), new ItemStack(SuperBTWDefinitions.branch)} );
		FCRecipes.AddShapelessRecipe(new ItemStack(FCBetterThanWolves.fcItemFireStarterSticks, 1), new ItemStack [] {new ItemStack(SuperBTWDefinitions.branch), new ItemStack(Item.stick)} );
		FCRecipes.AddShapelessRecipe(new ItemStack(FCBetterThanWolves.fcItemChiselWood, 1), new ItemStack [] {new ItemStack(SuperBTWDefinitions.branch)} );
		
		FCRecipes.AddShapelessRecipe(new ItemStack(FCBetterThanWolves.fcItemFireStarterBow, 1), new ItemStack [] {new ItemStack(SuperBTWDefinitions.branch), new ItemStack(SuperBTWDefinitions.branch), new ItemStack(Item.silk)} );
		FCRecipes.AddShapelessRecipe(new ItemStack(FCBetterThanWolves.fcItemFireStarterBow, 1), new ItemStack [] {new ItemStack(SuperBTWDefinitions.branch), new ItemStack(Item.stick), new ItemStack(Item.silk)} );
		
		//all them recipes be like (LMAO!!! CAMPFIRE!!!!)
		FCRecipes.AddShapelessRecipe(new ItemStack(FCBetterThanWolves.fcBlockCampfireUnlit, 1), new ItemStack [] {new ItemStack(SuperBTWDefinitions.branch), new ItemStack(Item.stick), new ItemStack(Item.stick), new ItemStack(Item.stick)} );
		FCRecipes.AddShapelessRecipe(new ItemStack(FCBetterThanWolves.fcBlockCampfireUnlit, 1), new ItemStack [] {new ItemStack(SuperBTWDefinitions.branch), new ItemStack(SuperBTWDefinitions.branch), new ItemStack(Item.stick), new ItemStack(Item.stick)} );
		FCRecipes.AddShapelessRecipe(new ItemStack(FCBetterThanWolves.fcBlockCampfireUnlit, 1), new ItemStack [] {new ItemStack(SuperBTWDefinitions.branch), new ItemStack(SuperBTWDefinitions.branch), new ItemStack(SuperBTWDefinitions.branch), new ItemStack(Item.stick)} );
		FCRecipes.AddShapelessRecipe(new ItemStack(FCBetterThanWolves.fcBlockCampfireUnlit, 1), new ItemStack [] {new ItemStack(SuperBTWDefinitions.branch), new ItemStack(SuperBTWDefinitions.branch), new ItemStack(SuperBTWDefinitions.branch), new ItemStack(SuperBTWDefinitions.branch)} );

		
		AddStokedCrucibleRecipe( 
			new ItemStack( SuperBTWDefinitions.rib, 1 ), 
			new ItemStack[] {
			new ItemStack( SuperBTWDefinitions.cowRib )
		} );
		//this.addRecipe(new ItemStack(Block.railPowered, 6), new Object[] {"X X", "X#X", "XRX", 'X', Item.ingotGold, 'R', Item.redstone, '#', Item.stick});
        
		AddRecipe( new ItemStack( Block.railPowered, 8 ), new Object[] {
	            "IRI", 
	            "XYX",
	            "IRI",
	            Character.valueOf('X'), Item.ingotGold, 
	            Character.valueOf('I'), Item.ingotIron,
	            Character.valueOf('R'), Item.redstone,
	            Character.valueOf('Y'), Item.stick,
		} );
		
		//debug
		//FCRecipes.AddShapelessRecipe(new ItemStack(SuperBTWDefinitions.branchBlock, 1), new ItemStack [] {new ItemStack(Item.diamond)} );
		

	}


}
