package net.spud.bloomscape;

import net.fabricmc.api.ModInitializer;

import net.spud.bloomscape.blocks.ModBlocks;
import net.spud.bloomscape.item.ModItemGroups;
import net.spud.bloomscape.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bloomscape implements ModInitializer {
	public static final String MOD_ID = "bloomscape";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
	}
}