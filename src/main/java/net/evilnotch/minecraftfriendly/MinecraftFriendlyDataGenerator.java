package net.evilnotch.minecraftfriendly;

import net.evilnotch.minecraftfriendly.datagen.ModBlockLootTableProvider;
import net.evilnotch.minecraftfriendly.datagen.ModBlockTagsProvider;
import net.evilnotch.minecraftfriendly.datagen.ModModelProvider;
import net.evilnotch.minecraftfriendly.datagen.ModRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class MinecraftFriendlyDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		var pack = fabricDataGenerator.createPack();

		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModBlockTagsProvider::new);
		pack.addProvider(ModBlockLootTableProvider::new);
		pack.addProvider(ModRecipeProvider::new);
	}
}
