package net.minecraft.src;

public class SuperBTWDefinitions {
	
	private static final int

		id_leatherWorking = 20000,
		id_flintKnapping = 20001,
		
		id_flintBlade = 20002,
		id_ironBlade = 20003,
		
		id_cowRib = 20004,
		id_rib = 20005,
		id_cookedCowRib = 20006,
		id_bonePickaxe = 20007,
		
		id_leatherWorkingIron = 20008,
		
		id_wetMudBrick = 20009,
		id_wetAdobe = 20010,
		id_adobe = 20011,
		
		id_branch = 20012,
		
		id_ribCarving = 20013,
		id_ribCarvingIron = 20014,
	
		id_cookedCowRibPartial = 20015,
		id_cookedCowRibSpent = 20016;
		
	private static final int
		id_branchBlock = 2000;
		
	
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
	public static Item cookedCowRibPartial;
	public static Item cookedCowRibSpent;
	
	public static Block branchBlock;
	
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
		cookedCowRibPartial = new SuperBTWItemCookedCowRibPartial(id_cookedCowRibPartial - 256);
		cookedCowRibSpent = new SuperBTWItemCookedCowRibSpent(id_cookedCowRibSpent - 256);
		
		branchBlock = new SuperBTWBlockBranch(id_branchBlock);
		Item.itemsList[branchBlock.blockID] = new ItemBlock(branchBlock.blockID - 256); 
	}
	
}
