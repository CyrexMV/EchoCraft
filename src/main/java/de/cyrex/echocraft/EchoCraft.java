package de.cyrex.echocraft;

import de.cyrex.echocraft.block.ModBlocks;
import de.cyrex.echocraft.item.ModItemGroups;
import de.cyrex.echocraft.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EchoCraft implements ModInitializer {
	public static final String MOD_ID = "echocraft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}