package net.chronic.additionstwo;

import net.chronic.additionstwo.block.ModBlocks;
import net.chronic.additionstwo.item.ModItemGroups;
import net.chronic.additionstwo.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AdditionsTwo implements ModInitializer {
	public static final String MOD_ID = "additionstwo";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
	}
}