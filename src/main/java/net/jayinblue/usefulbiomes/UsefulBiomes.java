package net.jayinblue.usefulbiomes;

import net.fabricmc.api.ModInitializer;
import net.jayinblue.usefulbiomes.block.ModBlocks;
import net.jayinblue.usefulbiomes.item.ModItems;

public class UsefulBiomes implements ModInitializer {

	public static final String MOD_ID = "usefulbiomes";

	@Override
	public void onInitialize() {

		ModItems.registerModitems();
		ModBlocks.registerModBlocks();
		System.out.println("Initializing UBI!");
	}
}
