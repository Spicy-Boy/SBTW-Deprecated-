# Super-Better-Than-Wolves WIP 1.0 release

This initial release seeks to lay the groundwork for a richer Better Than Wolves survival experience. 

It has increased dramatically in scope since I first began work on the project. Originally, I only sought to make the pickaxe obtainable earlier in the tech tree and also make leather armor easier and cheaper to make. Now, there is a boat-load of junk from knives to tweaked enchanting. 

Here is the "changelog" that I have been using to keep track of my work (as of 12/29/21):

VERSION 1.0
Additions:

-Added new tool type: blades/knives
    >effective against webs
-Added new tool: Flint knife
-Added new tool: Iron knife
-Added new progress crafting recipe: flint knapping (to produce flint knife)
    TODO>Animated! Too many bad hits and the flint may break..

-Added new item: Branch 
    TODO>How do we get these? Dead bushes and leaves?

-Added new progress crafting recipe: leather cutting (to make cut leather)
-Added new crafting recipes for leather armor using cut leather (for use in 2x2 grid!)
    TODO>make craft back into knife

-Added new cow drop: Beef rib
    TODO>Make it take forever to eat
-Added new food: Seared Beef Rib (by cooking a beef rib)
    >eaten in stages, can be shared
-Added new progress crafting recipe: rib cutting
-Added new item: Rib Bone (made from beef rib)
-Added new tool: Bone Pickaxe (made from rib)
    TODO>make craft back into knife

-Added recipe for the original workbench, crafted with 8 planks and an iron ingot


Changes/Tweaks:
-Changed cows to drop at least 1 leather every time
-Changed chickens to drop at least 2 feathers every time
-Changed pigs to always drop 2-3 pork when killed

-Changed leather to render into 2 glue instead of 1 (and 1 cut leather = 1 glue) 
-Changed pork to render into 3 tallow (instead of 1 tallow)
-changed a single beef to render into 1 tallow (instead of 4 beef)

-Changed steel tools to be enchantable in the standard table ;P
-Changed steel tools to now accept up to five enchantments in the infernal enchanter (go nuts!)
-Changed diamond tools to now accept up to three enchantments in the infernal enchanter
-Tweaked diamond tool enchanting to increase the rate of level 3 enchantments
-Tweaked steel tool enchanting to make level 3 enchantments standard
    >Efficiency IV is now a possibility... too OP?

-Changed Bottles O' Enchanting to drop a lot more EXP...


TODO: branches


Hunger TODO:
- make starvation health drain take WAAAYYY longer!!! 
- sprint all the way to hungry (not just peckish)
- push back the health debuffs to critical levels (look into them, not sure how they work)

Fixes:

Base Class Edits:
FCBlockWeb
FCEntityChicken
FCEntityCow
FCEntityPig
FCRecipes
FCBlockWaterStationary
EnumToolMaterial
EntityExpBottle
FCBlockWorkbench




NOT YET
-Added new item: Sinew (a string substitute made from meat) TODO

-added the meat cube! TODO

-animated flint sculpting

-Recipe: cutting recipes give back blade (in case you need it)
CODE from bow class:



-Fixed mining charges

-Carving recipes on wood give sawdust at intervals?
    >bowl carving

---
Really Crazy Ideas:
-Make animals startle just by getting too close?
Nah, that's lame.

-Animals automatically run from mobs?
Could be fun, maybe hard to implement.




