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
		id_bonePickaxe = 2006,
		
		id_leatherWorkingKnife = 2007,
		
		id_wetMudBrick = 2008,
		id_branch = 2009;
	
	//leather stuff
	public static Item leatherWorking;
	public static Item flintKnapping;
	public static Item flintBlade;
	public static Item ironBlade;
	public static Item branch;
	
	public static void addDefinitions() 
	{

		leatherWorking = new SuperBTWItemLeatherWorking(id_leatherWorking - 256);
		flintKnapping = new SuperBTWItemFlintKnapping(id_flintKnapping - 256);
		flintBlade = new SuperBTWItemFlintBlade(id_flintBlade - 256);
		ironBlade = new SuperBTWItemIronBlade(id_ironBlade - 256);
		branch = new SuperBTWItemBranch(id_branch - 256);


	}
	
}
