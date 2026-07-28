package net.evilnotch.minecraftfriendly;

import net.evilnotch.minecraftfriendly.block.ModBlocks;
import net.evilnotch.minecraftfriendly.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MinecraftFriendly implements ModInitializer {
	public static final String MOD_ID = "minecraftfriendly";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Minecraft and Fabric Friendly Peeps! This is initialization for all non-datapack things in this mod.");
		ModItems.registerItems(); //Accepts Items.
		ModBlocks.registerBlocks();//Accepts Blocks.
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
