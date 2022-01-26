package net.jayinblue.usefulbiomes;

import net.fabricmc.api.ModInitializer;
import net.jayinblue.usefulbiomes.block.ModBlocks;
import net.jayinblue.usefulbiomes.item.ModItems;

/* you can reinforce netherite and diamond armour with amethyst ingots, same with tools. amethyst ingot is made by cooking amethyst dust to get raw amethyst. then crafting
9 raw amethyst into a raw amethyst ingot, then smithing raw amethyst ingot with diamond to make amethyst ingot. amethyst ingot can then be smithed with diamond/netherite armour
to make armour that gives you regen. amethyst reinforced diamond can be smithed with a netherite ingot to make amethyst reinforced netherite
 */

public class UsefulBiomes implements ModInitializer {

	public static final String MOD_ID = "usefulbiomes";

	@Override
	public void onInitialize() {

		ModItems.registerModitems();
		ModBlocks.registerModBlocks();
		System.out.println("Initializing UBI!");
	}
}
