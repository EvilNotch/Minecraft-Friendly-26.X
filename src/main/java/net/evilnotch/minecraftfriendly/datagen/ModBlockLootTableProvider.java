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

        dropSelf(ModBlocks.NETHER_BRICK_FENCE_GATE);

        dropSelf(ModBlocks.SAND_LAYER_BLOCK);
        dropSelf(ModBlocks.RED_SAND_LAYER_BLOCK);

        add(ModBlocks.PETRIFIED_SPRUCE_SLAB, this::createSlabItemTable);
        add(ModBlocks.PETRIFIED_BIRCH_SLAB, this::createSlabItemTable);
        add(ModBlocks.PETRIFIED_JUNGLE_SLAB, this::createSlabItemTable);
        add(ModBlocks.PETRIFIED_ACACIA_SLAB, this::createSlabItemTable);
        add(ModBlocks.PETRIFIED_DARK_OAK_SLAB, this::createSlabItemTable);
        add(ModBlocks.PETRIFIED_MANGROVE_SLAB, this::createSlabItemTable);
        add(ModBlocks.PETRIFIED_CHERRY_SLAB, this::createSlabItemTable);
        add(ModBlocks.PETRIFIED_PALE_OAK_SLAB, this::createSlabItemTable);
        add(ModBlocks.PETRIFIED_BAMBOO_SLAB, this::createSlabItemTable);
        add(ModBlocks.PETRIFIED_BAMBOO_MOSAIC_SLAB, this::createSlabItemTable);
        add(ModBlocks.PETRIFIED_CRIMSON_SLAB, this::createSlabItemTable);
        add(ModBlocks.PETRIFIED_WARPED_SLAB, this::createSlabItemTable);


        add(ModBlocks.TUBE_CORAL_SLAB, this::createSlabItemTable);

        dropSelf(ModBlocks.SMOOTH_STONE_STAIRS);
        dropSelf(ModBlocks.SMOOTH_STONE_WALL);

        dropSelf(ModBlocks.IRON_BUTTON);
        dropSelf(ModBlocks.IRON_STAIRS);
        add(ModBlocks.IRON_SLAB, this::createSlabItemTable);

        dropSelf(ModBlocks.GOLD_BUTTON);
        dropSelf(ModBlocks.GOLD_STAIRS);
        add(ModBlocks.GOLD_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.GOLD_CHAIN);
        //dropSelf(ModBlocks.GOLD_BARS);

        dropSelf(ModBlocks.REDSTONE_STAIRS);
        add(ModBlocks.REDSTONE_SLAB, this::createSlabItemTable);

        dropSelf(ModBlocks.CHISELED_EMERALD);
        dropSelf(ModBlocks.EMERALD_STAIRS);
        add(ModBlocks.EMERALD_SLAB, this::createSlabItemTable);

        dropSelf(ModBlocks.LAPIS_STAIRS);
        add(ModBlocks.LAPIS_SLAB, this::createSlabItemTable);

        dropSelf(ModBlocks.DIAMOND_STAIRS);
        add(ModBlocks.DIAMOND_SLAB, this::createSlabItemTable);

        dropSelf(ModBlocks.NETHERITE_STAIRS);
        add(ModBlocks.NETHERITE_SLAB, this::createSlabItemTable);

        dropSelf(ModBlocks.WHITE_CONCRETE_STAIRS);
        add(ModBlocks.WHITE_CONCRETE_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.WHITE_CONCRETE_FENCE);
        dropSelf(ModBlocks.WHITE_CONCRETE_FENCE_GATE);
        dropSelf(ModBlocks.WHITE_CONCRETE_WALL);

        dropSelf(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
        add(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.LIGHT_GRAY_CONCRETE_FENCE);
        dropSelf(ModBlocks.LIGHT_GRAY_CONCRETE_FENCE_GATE);
        dropSelf(ModBlocks.LIGHT_GRAY_CONCRETE_WALL);

        dropSelf(ModBlocks.GRAY_CONCRETE_STAIRS);
        add(ModBlocks.GRAY_CONCRETE_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.GRAY_CONCRETE_FENCE);
        dropSelf(ModBlocks.GRAY_CONCRETE_FENCE_GATE);
        dropSelf(ModBlocks.GRAY_CONCRETE_WALL);

        dropSelf(ModBlocks.BLACK_CONCRETE_STAIRS);
        add(ModBlocks.BLACK_CONCRETE_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.BLACK_CONCRETE_FENCE);
        dropSelf(ModBlocks.BLACK_CONCRETE_FENCE_GATE);
        dropSelf(ModBlocks.BLACK_CONCRETE_WALL);

        dropSelf(ModBlocks.BROWN_CONCRETE_STAIRS);
        add(ModBlocks.BROWN_CONCRETE_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.BROWN_CONCRETE_FENCE);
        dropSelf(ModBlocks.BROWN_CONCRETE_FENCE_GATE);
        dropSelf(ModBlocks.BROWN_CONCRETE_WALL);

        dropSelf(ModBlocks.RED_CONCRETE_STAIRS);
        add(ModBlocks.RED_CONCRETE_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.RED_CONCRETE_FENCE);
        dropSelf(ModBlocks.RED_CONCRETE_FENCE_GATE);
        dropSelf(ModBlocks.RED_CONCRETE_WALL);

        dropSelf(ModBlocks.ORANGE_CONCRETE_STAIRS);
        add(ModBlocks.ORANGE_CONCRETE_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.ORANGE_CONCRETE_FENCE);
        dropSelf(ModBlocks.ORANGE_CONCRETE_FENCE_GATE);
        dropSelf(ModBlocks.ORANGE_CONCRETE_WALL);

        dropSelf(ModBlocks.YELLOW_CONCRETE_STAIRS);
        add(ModBlocks.YELLOW_CONCRETE_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.YELLOW_CONCRETE_FENCE);
        dropSelf(ModBlocks.YELLOW_CONCRETE_FENCE_GATE);
        dropSelf(ModBlocks.YELLOW_CONCRETE_WALL);

        dropSelf(ModBlocks.LIME_CONCRETE_STAIRS);
        add(ModBlocks.LIME_CONCRETE_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.LIME_CONCRETE_FENCE);
        dropSelf(ModBlocks.LIME_CONCRETE_FENCE_GATE);
        dropSelf(ModBlocks.LIME_CONCRETE_WALL);

        dropSelf(ModBlocks.GREEN_CONCRETE_STAIRS);
        add(ModBlocks.GREEN_CONCRETE_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.GREEN_CONCRETE_FENCE);
        dropSelf(ModBlocks.GREEN_CONCRETE_FENCE_GATE);
        dropSelf(ModBlocks.GREEN_CONCRETE_WALL);

        dropSelf(ModBlocks.CYAN_CONCRETE_STAIRS);
        add(ModBlocks.CYAN_CONCRETE_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.CYAN_CONCRETE_FENCE);
        dropSelf(ModBlocks.CYAN_CONCRETE_FENCE_GATE);
        dropSelf(ModBlocks.CYAN_CONCRETE_WALL);

        dropSelf(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
        add(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.LIGHT_BLUE_CONCRETE_FENCE);
        dropSelf(ModBlocks.LIGHT_BLUE_CONCRETE_FENCE_GATE);
        dropSelf(ModBlocks.LIGHT_BLUE_CONCRETE_WALL);

        dropSelf(ModBlocks.BLUE_CONCRETE_STAIRS);
        add(ModBlocks.BLUE_CONCRETE_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.BLUE_CONCRETE_FENCE);
        dropSelf(ModBlocks.BLUE_CONCRETE_FENCE_GATE);
        dropSelf(ModBlocks.BLUE_CONCRETE_WALL);

        dropSelf(ModBlocks.PURPLE_CONCRETE_STAIRS);
        add(ModBlocks.PURPLE_CONCRETE_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.PURPLE_CONCRETE_FENCE);
        dropSelf(ModBlocks.PURPLE_CONCRETE_FENCE_GATE);
        dropSelf(ModBlocks.PURPLE_CONCRETE_WALL);

        dropSelf(ModBlocks.MAGENTA_CONCRETE_STAIRS);
        add(ModBlocks.MAGENTA_CONCRETE_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.MAGENTA_CONCRETE_FENCE);
        dropSelf(ModBlocks.MAGENTA_CONCRETE_FENCE_GATE);
        dropSelf(ModBlocks.MAGENTA_CONCRETE_WALL);

        dropSelf(ModBlocks.PINK_CONCRETE_STAIRS);
        add(ModBlocks.PINK_CONCRETE_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.PINK_CONCRETE_FENCE);
        dropSelf(ModBlocks.PINK_CONCRETE_FENCE_GATE);
        dropSelf(ModBlocks.PINK_CONCRETE_WALL);
    }
}
