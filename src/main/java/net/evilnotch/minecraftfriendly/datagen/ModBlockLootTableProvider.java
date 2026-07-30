package net.evilnotch.minecraftfriendly.datagen;

import net.evilnotch.minecraftfriendly.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class ModBlockLootTableProvider extends FabricBlockLootSubProvider {

    public ModBlockLootTableProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(packOutput, registriesFuture);
    }

    @Override
    public void generate() {

        dropSelf(ModBlocks.GOLD_STAIRS);
        add(ModBlocks.GOLD_SLAB, this::createSlabItemTable);

        dropSelf(ModBlocks.CHISELED_EMERALD);
        dropSelf(ModBlocks.EMERALD_STAIRS);
        add(ModBlocks.EMERALD_SLAB, this::createSlabItemTable);

        dropSelf(ModBlocks.DIAMOND_STAIRS);
        add(ModBlocks.DIAMOND_SLAB, this::createSlabItemTable);

        dropSelf(ModBlocks.WHITE_CONCRETE_STAIRS);
        add(ModBlocks.WHITE_CONCRETE_SLAB, this::createSlabItemTable);

        dropSelf(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
        add(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB, this::createSlabItemTable);

        dropSelf(ModBlocks.GRAY_CONCRETE_STAIRS);
        add(ModBlocks.GRAY_CONCRETE_SLAB, this::createSlabItemTable);

        dropSelf(ModBlocks.BLACK_CONCRETE_STAIRS);
        add(ModBlocks.BLACK_CONCRETE_SLAB, this::createSlabItemTable);

        dropSelf(ModBlocks.BROWN_CONCRETE_STAIRS);
        add(ModBlocks.BROWN_CONCRETE_SLAB, this::createSlabItemTable);

        dropSelf(ModBlocks.RED_CONCRETE_STAIRS);
        add(ModBlocks.RED_CONCRETE_SLAB, this::createSlabItemTable);

        dropSelf(ModBlocks.ORANGE_CONCRETE_STAIRS);
        add(ModBlocks.ORANGE_CONCRETE_SLAB, this::createSlabItemTable);

        dropSelf(ModBlocks.YELLOW_CONCRETE_STAIRS);
        add(ModBlocks.YELLOW_CONCRETE_SLAB, this::createSlabItemTable);

        dropSelf(ModBlocks.LIME_CONCRETE_STAIRS);
        add(ModBlocks.LIME_CONCRETE_SLAB, this::createSlabItemTable);

        dropSelf(ModBlocks.GREEN_CONCRETE_STAIRS);
        add(ModBlocks.GREEN_CONCRETE_SLAB, this::createSlabItemTable);

        dropSelf(ModBlocks.CYAN_CONCRETE_STAIRS);
        add(ModBlocks.CYAN_CONCRETE_SLAB, this::createSlabItemTable);

        dropSelf(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
        add(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB, this::createSlabItemTable);

        dropSelf(ModBlocks.BLUE_CONCRETE_STAIRS);
        add(ModBlocks.BLUE_CONCRETE_SLAB, this::createSlabItemTable);

        dropSelf(ModBlocks.PURPLE_CONCRETE_STAIRS);
        add(ModBlocks.PURPLE_CONCRETE_SLAB, this::createSlabItemTable);

        dropSelf(ModBlocks.MAGENTA_CONCRETE_STAIRS);
        add(ModBlocks.MAGENTA_CONCRETE_SLAB, this::createSlabItemTable);

        dropSelf(ModBlocks.PINK_CONCRETE_STAIRS);
        add(ModBlocks.PINK_CONCRETE_SLAB, this::createSlabItemTable);
    }
}
