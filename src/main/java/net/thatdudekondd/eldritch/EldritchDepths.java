package net.thatdudekondd.eldritch;

import net.fabricmc.api.ModInitializer;

import net.thatdudekondd.eldritch.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EldritchDepths implements ModInitializer {
	public static final String MOD_ID = "eldritch";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		ModItems.registerModItems();
	}
}