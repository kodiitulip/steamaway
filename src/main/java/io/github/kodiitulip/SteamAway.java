package io.github.kodiitulip;

import io.github.kodiitulip.init.ModItems;
import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SteamAway implements ModInitializer {
	public static final String MOD_ID = "steamaway";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static Identifier getNameIdentifier(String name) {
		return Identifier.of(MOD_ID, name);
	}

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");

		ModItems.initialize();
	}
}