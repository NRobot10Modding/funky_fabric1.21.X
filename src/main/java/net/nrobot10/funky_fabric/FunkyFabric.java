package net.nrobot10.funky_fabric;

import net.fabricmc.api.ModInitializer;

import net.nrobot10.funky_fabric.item.ModItemGroups;
import net.nrobot10.funky_fabric.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FunkyFabric implements ModInitializer {
	public static final String MOD_ID = "funky_fabric";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();

		LOGGER.info("Hello Fabric world!");
	}
}