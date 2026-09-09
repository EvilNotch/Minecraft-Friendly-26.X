package net.evilnotch.minecraftfriendly;

import net.evilnotch.minecraftfriendly.block.ModBlocks;
import net.evilnotch.minecraftfriendly.item.ModItems;
import net.evilnotch.minecraftfriendly.pack.BuiltinResourcePacks;
import net.evilnotch.minecraftfriendly.potion.ModPotions;
import net.evilnotch.minecraftfriendly.registries.ModFuels;
import net.evilnotch.minecraftfriendly.registries.ModPotionRecipes;
import net.evilnotch.minecraftfriendly.sound.ModSounds;
import net.evilnotch.minecraftfriendly.stat.ModStats;
import net.evilnotch.minecraftfriendly.tabs.ModCreativeModeTabs;
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
		ModFuels.registerFuels();//Accepts any Fuel Entries.
		ModBlocks.registerBlocks();//Accepts Blocks.
		ModCreativeModeTabs.registerModCreativeTabs();//Accepts any custom Creative Tabs and entries.
		ModSounds.registerSounds();//Accepts any custom Sound Entries.
		ModStats.registerStats();//Accepts any custom Stats.

		ModPotions.registerPotions();//Accepts any custom Potions.



		ModPotionRecipes.registerPotionRecipes();//Accepts any custom Potion Recipes.
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
