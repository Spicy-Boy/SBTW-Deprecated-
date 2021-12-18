package net.minecraft.src;

public class SuperBTWDefinitions {
	
	private static int
		//leather stuff
		id_leatherWorking = 2000,
		id_flintKnapping = 2001,
		
		id_flintBlade = 2002,
		id_ironBlade = 2003,
		
		id_cowRib = 2004,
		id_rib = 2005,
		id_cookedCowRib = 2006,
		id_bonePickaxe = 2007,
		

		id_leatherWorkingIron = 2008,

		
		id_wetMudBrick = 2009,
		id_wetAdobe = 2010,
		id_adobe = 2011,
		

		id_branch = 2012,
		
		id_ribCarving = 2013,
		id_ribCarvingIron = 2014;

		
	
	//leather stuff
	public static Item leatherWorking;
	public static Item flintKnapping;
	public static Item flintBlade;
	public static Item ironBlade;
	public static Item branch;
	public static Item cowRib;
	public static Item rib;
	public static Item cookedCowRib;

	public static Item bonePickaxe;
	public static Item leatherWorkingIron;
	public static Item ribCarving;
	public static Item ribCarvingIron;

	
	public static void addDefinitions() 
	{

		leatherWorking = new SuperBTWItemLeatherWorking(id_leatherWorking - 256);
		flintKnapping = new SuperBTWItemFlintKnapping(id_flintKnapping - 256);
		flintBlade = new SuperBTWItemFlintBlade(id_flintBlade - 256);
		ironBlade = new SuperBTWItemIronBlade(id_ironBlade - 256);
		branch = new SuperBTWItemBranch(id_branch - 256);
		cowRib = new SuperBTWItemCowRib(id_cowRib - 256);
		rib = new SuperBTWItemRib(id_rib - 256);
		cookedCowRib = new SuperBTWItemCookedCowRib(id_cookedCowRib - 256);

		bonePickaxe = new SuperBTWItemBonePickaxe(id_bonePickaxe - 256);
		leatherWorkingIron = new SuperBTWItemLeatherWorkingIron(id_leatherWorkingIron - 256);
		ribCarving = new SuperBTWItemRibCarving(id_ribCarving - 256);
		ribCarvingIron = new SuperBTWItemRibCarvingIron(id_ribCarvingIron - 256);

	}
	
}
