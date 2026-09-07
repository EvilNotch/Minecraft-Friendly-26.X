package net.evilnotch.minecraftfriendly.datagen;

import net.evilnotch.minecraftfriendly.MinecraftFriendly;
import net.evilnotch.minecraftfriendly.sound.ModSounds;
import net.fabricmc.fabric.api.client.datagen.v1.builder.SoundTypeBuilder;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricSoundsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.SoundType;

import java.util.concurrent.CompletableFuture;

public class ModSoundsProvider extends FabricSoundsProvider {
    public ModSoundsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(HolderLookup.Provider registryLookup, SoundExporter exporter) {
        exporter.add(ModSounds.INDEPENDENT_ACCIDENT, SoundTypeBuilder.of(ModSounds.INDEPENDENT_ACCIDENT.value())
                .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Identifier.fromNamespaceAndPath(MinecraftFriendly.MOD_ID, "independent_accident")).stream(true)));

        exporter.add(ModSounds.HUMAN_FEEL, SoundTypeBuilder.of(ModSounds.HUMAN_FEEL.value())
                .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Identifier.fromNamespaceAndPath(MinecraftFriendly.MOD_ID, "human_feel")).stream(true)));

        exporter.add(ModSounds.CUBE_LAND, SoundTypeBuilder.of(ModSounds.CUBE_LAND.value())
                .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Identifier.fromNamespaceAndPath(MinecraftFriendly.MOD_ID, "cube_land")).stream(true)));
    }

    @Override
    public String getName() {
        return "MinecraftFriendly Sounds";
    }
}
