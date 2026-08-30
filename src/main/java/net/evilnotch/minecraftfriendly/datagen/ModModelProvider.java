package net.evilnotch.minecraftfriendly.datagen;

import net.evilnotch.minecraftfriendly.block.ModBlocks;
import net.evilnotch.minecraftfriendly.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.world.level.block.Blocks;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {

        blockModelGenerators.createTrivialCube(ModBlocks.PLATED_IRON);
        blockModelGenerators.createTrivialCube(ModBlocks.CHISELED_GOLD);

        blockModelGenerators.family(ModBlocks.RUBY_BLOCK)
                .stairs(ModBlocks.RUBY_STAIRS);
        blockModelGenerators.family(ModBlocks.SAPPHIRE_BLOCK)
                .stairs(ModBlocks.SAPPHIRE_STAIRS);

        blockModelGenerators.createTrivialCube(ModBlocks.CHISELED_EMERALD);
        blockModelGenerators.createTrivialCube(ModBlocks.CHISELED_LAPIS);
        blockModelGenerators.createTrivialCube(ModBlocks.CHISELED_DIAMOND);

        blockModelGenerators.family(ModBlocks.CRACKED_PURPUR_BLOCK)
                .stairs(ModBlocks.CRACKED_PURPUR_STAIRS)
                .slab(ModBlocks.CRACKED_PURPUR_SLAB);

        blockModelGenerators.createTrivialCube(ModBlocks.RAINBOW_WOOL);

        blockModelGenerators.createBarsAndItem(ModBlocks.GOLD_BARS);

        blockModelGenerators.createPlantWithDefaultItem(ModBlocks.PINK_DAISY, ModBlocks.POTTED_PINK_DAISY, BlockModelGenerators.PlantType.NOT_TINTED);
        blockModelGenerators.createPlantWithDefaultItem(ModBlocks.BUTTERCUP, ModBlocks.POTTED_BUTTERCUP, BlockModelGenerators.PlantType.NOT_TINTED);
        blockModelGenerators.createPlantWithDefaultItem(ModBlocks.PAEONIA, ModBlocks.POTTED_PAEONIA, BlockModelGenerators.PlantType.NOT_TINTED);
        blockModelGenerators.createPlantWithDefaultItem(ModBlocks.ROSE, ModBlocks.POTTED_ROSE, BlockModelGenerators.PlantType.NOT_TINTED);
        blockModelGenerators.createPlantWithDefaultItem(ModBlocks.BLUE_HYPNEA_MACROALGAE,
                ModBlocks.POTTED_BLUE_HYPNEA_MACROALGAE, BlockModelGenerators.PlantType.NOT_TINTED);

        blockModelGenerators.createFlowerBed(ModBlocks.WARPED_PETALS);

        blockModelGenerators.family(Blocks.DIRT)
                        .slab(ModBlocks.DIRT_SLAB)
                        .slab(ModBlocks.GRASS_SLAB);

        //blockModelGenerators.family(Blocks.GRASS_BLOCK)
                        //.slab(ModBlocks.GRASS_SLAB);

        blockModelGenerators.family(Blocks.NETHER_BRICKS)
                        .fenceGate(ModBlocks.NETHER_BRICK_FENCE_GATE);

        blockModelGenerators.family(Blocks.CRACKED_NETHER_BRICKS)
                        .stairs(ModBlocks.CRACKED_NETHER_BRICK_STAIRS)
                        .slab(ModBlocks.CRACKED_NETHER_BRICK_SLAB);

        blockModelGenerators.createAmethystCluster(ModBlocks.SAPPHIRE_CLUSTER);

        blockModelGenerators.family(Blocks.SPRUCE_PLANKS)
                        .slab(ModBlocks.PETRIFIED_SPRUCE_SLAB);

        blockModelGenerators.family(Blocks.BIRCH_PLANKS)
                        .slab(ModBlocks.PETRIFIED_BIRCH_SLAB);

        blockModelGenerators.family(Blocks.JUNGLE_PLANKS)
                .slab(ModBlocks.PETRIFIED_JUNGLE_SLAB);

        blockModelGenerators.family(Blocks.ACACIA_PLANKS)
                .slab(ModBlocks.PETRIFIED_ACACIA_SLAB);

        blockModelGenerators.family(Blocks.DARK_OAK_PLANKS)
                .slab(ModBlocks.PETRIFIED_DARK_OAK_SLAB);

        blockModelGenerators.family(Blocks.MANGROVE_PLANKS)
                .slab(ModBlocks.PETRIFIED_MANGROVE_SLAB);

        blockModelGenerators.family(Blocks.CHERRY_PLANKS)
                .slab(ModBlocks.PETRIFIED_CHERRY_SLAB);

        blockModelGenerators.family(Blocks.PALE_OAK_PLANKS)
                .slab(ModBlocks.PETRIFIED_PALE_OAK_SLAB);

        blockModelGenerators.family(Blocks.BAMBOO_PLANKS)
                .slab(ModBlocks.PETRIFIED_BAMBOO_SLAB);

        blockModelGenerators.family(Blocks.BAMBOO_MOSAIC)
                .slab(ModBlocks.PETRIFIED_BAMBOO_MOSAIC_SLAB);

        blockModelGenerators.family(Blocks.CRIMSON_PLANKS)
                .slab(ModBlocks.PETRIFIED_CRIMSON_SLAB);

        blockModelGenerators.family(Blocks.WARPED_PLANKS)
                .slab(ModBlocks.PETRIFIED_WARPED_SLAB);



        blockModelGenerators.family(Blocks.TUBE_CORAL_BLOCK)
                        .slab(ModBlocks.TUBE_CORAL_SLAB);

        blockModelGenerators.family(Blocks.CONCRETE.white())
                .slab(ModBlocks.WHITE_CONCRETE_SLAB)
                .stairs(ModBlocks.WHITE_CONCRETE_STAIRS)
                .fence(ModBlocks.WHITE_CONCRETE_FENCE)
                .fenceGate(ModBlocks.WHITE_CONCRETE_FENCE_GATE)
                .wall(ModBlocks.WHITE_CONCRETE_WALL);

        blockModelGenerators.family(Blocks.CONCRETE.lightGray())
                .slab(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB)
                .stairs(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS)
                .fence(ModBlocks.LIGHT_GRAY_CONCRETE_FENCE)
                .fenceGate(ModBlocks.LIGHT_GRAY_CONCRETE_FENCE_GATE)
                .wall(ModBlocks.LIGHT_GRAY_CONCRETE_WALL);

        blockModelGenerators.family(Blocks.CONCRETE.gray())
                .slab(ModBlocks.GRAY_CONCRETE_SLAB)
                .stairs(ModBlocks.GRAY_CONCRETE_STAIRS)
                .fence(ModBlocks.GRAY_CONCRETE_FENCE)
                .fenceGate(ModBlocks.GRAY_CONCRETE_FENCE_GATE)
                .wall(ModBlocks.GRAY_CONCRETE_WALL);

        blockModelGenerators.family(Blocks.CONCRETE.black())
                .slab(ModBlocks.BLACK_CONCRETE_SLAB)
                .stairs(ModBlocks.BLACK_CONCRETE_STAIRS)
                .fence(ModBlocks.BLACK_CONCRETE_FENCE)
                .fenceGate(ModBlocks.BLACK_CONCRETE_FENCE_GATE)
                .wall(ModBlocks.BLACK_CONCRETE_WALL);

        blockModelGenerators.family(Blocks.CONCRETE.brown())
                .slab(ModBlocks.BROWN_CONCRETE_SLAB)
                .stairs(ModBlocks.BROWN_CONCRETE_STAIRS)
                .fence(ModBlocks.BROWN_CONCRETE_FENCE)
                .fenceGate(ModBlocks.BROWN_CONCRETE_FENCE_GATE)
                .wall(ModBlocks.BROWN_CONCRETE_WALL);

        blockModelGenerators.family(Blocks.CONCRETE.red())
                .slab(ModBlocks.RED_CONCRETE_SLAB)
                .stairs(ModBlocks.RED_CONCRETE_STAIRS)
                .fence(ModBlocks.RED_CONCRETE_FENCE)
                .fenceGate(ModBlocks.RED_CONCRETE_FENCE_GATE)
                .wall(ModBlocks.RED_CONCRETE_WALL);

        blockModelGenerators.family(Blocks.CONCRETE.orange())
                .slab(ModBlocks.ORANGE_CONCRETE_SLAB)
                .stairs(ModBlocks.ORANGE_CONCRETE_STAIRS)
                .fence(ModBlocks.ORANGE_CONCRETE_FENCE)
                .fenceGate(ModBlocks.ORANGE_CONCRETE_FENCE_GATE)
                .wall(ModBlocks.ORANGE_CONCRETE_WALL);

        blockModelGenerators.family(Blocks.CONCRETE.yellow())
                .slab(ModBlocks.YELLOW_CONCRETE_SLAB)
                .stairs(ModBlocks.YELLOW_CONCRETE_STAIRS)
                .fence(ModBlocks.YELLOW_CONCRETE_FENCE)
                .fenceGate(ModBlocks.YELLOW_CONCRETE_FENCE_GATE)
                .wall(ModBlocks.YELLOW_CONCRETE_WALL);

        blockModelGenerators.family(Blocks.CONCRETE.lime())
                .slab(ModBlocks.LIME_CONCRETE_SLAB)
                .stairs(ModBlocks.LIME_CONCRETE_STAIRS)
                .fence(ModBlocks.LIME_CONCRETE_FENCE)
                .fenceGate(ModBlocks.LIME_CONCRETE_FENCE_GATE)
                .wall(ModBlocks.LIME_CONCRETE_WALL);

        blockModelGenerators.family(Blocks.CONCRETE.green())
                .slab(ModBlocks.GREEN_CONCRETE_SLAB)
                .stairs(ModBlocks.GREEN_CONCRETE_STAIRS)
                .fence(ModBlocks.GREEN_CONCRETE_FENCE)
                .fenceGate(ModBlocks.GREEN_CONCRETE_FENCE_GATE)
                .wall(ModBlocks.GREEN_CONCRETE_WALL);

        blockModelGenerators.family(Blocks.CONCRETE.cyan())
                .slab(ModBlocks.CYAN_CONCRETE_SLAB)
                .stairs(ModBlocks.CYAN_CONCRETE_STAIRS)
                .fence(ModBlocks.CYAN_CONCRETE_FENCE)
                .fenceGate(ModBlocks.CYAN_CONCRETE_FENCE_GATE)
                .wall(ModBlocks.CYAN_CONCRETE_WALL);

        blockModelGenerators.family(Blocks.CONCRETE.lightBlue())
                .slab(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB)
                .stairs(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS)
                .fence(ModBlocks.LIGHT_BLUE_CONCRETE_FENCE)
                .fenceGate(ModBlocks.LIGHT_BLUE_CONCRETE_FENCE_GATE)
                .wall(ModBlocks.LIGHT_BLUE_CONCRETE_WALL);

        blockModelGenerators.family(Blocks.CONCRETE.blue())
                .slab(ModBlocks.BLUE_CONCRETE_SLAB)
                .stairs(ModBlocks.BLUE_CONCRETE_STAIRS)
                .fence(ModBlocks.BLUE_CONCRETE_FENCE)
                .fenceGate(ModBlocks.BLUE_CONCRETE_FENCE_GATE)
                .wall(ModBlocks.BLUE_CONCRETE_WALL);

        blockModelGenerators.family(Blocks.CONCRETE.purple())
                .slab(ModBlocks.PURPLE_CONCRETE_SLAB)
                .stairs(ModBlocks.PURPLE_CONCRETE_STAIRS)
                .fence(ModBlocks.PURPLE_CONCRETE_FENCE)
                .fenceGate(ModBlocks.PURPLE_CONCRETE_FENCE_GATE)
                .wall(ModBlocks.PURPLE_CONCRETE_WALL);

        blockModelGenerators.family(Blocks.CONCRETE.magenta())
                .slab(ModBlocks.MAGENTA_CONCRETE_SLAB)
                .stairs(ModBlocks.MAGENTA_CONCRETE_STAIRS)
                .fence(ModBlocks.MAGENTA_CONCRETE_FENCE)
                .fenceGate(ModBlocks.MAGENTA_CONCRETE_FENCE_GATE)
                .wall(ModBlocks.MAGENTA_CONCRETE_WALL);

        blockModelGenerators.family(Blocks.CONCRETE.pink())
                .slab(ModBlocks.PINK_CONCRETE_SLAB)
                .stairs(ModBlocks.PINK_CONCRETE_STAIRS)
                .fence(ModBlocks.PINK_CONCRETE_FENCE)
                .fenceGate(ModBlocks.PINK_CONCRETE_FENCE_GATE)
                .wall(ModBlocks.PINK_CONCRETE_WALL);

        blockModelGenerators.family(Blocks.IRON_BLOCK)
                .slab(ModBlocks.IRON_SLAB)
                .stairs(ModBlocks.IRON_STAIRS)
                .button(ModBlocks.IRON_BUTTON);

        blockModelGenerators.family(Blocks.GOLD_BLOCK)
                .slab(ModBlocks.GOLD_SLAB)
                .stairs(ModBlocks.GOLD_STAIRS)
                .button(ModBlocks.GOLD_BUTTON);

        blockModelGenerators.family(Blocks.REDSTONE_BLOCK)
                .slab(ModBlocks.REDSTONE_SLAB)
                .stairs(ModBlocks.REDSTONE_STAIRS);

        blockModelGenerators.family(Blocks.EMERALD_BLOCK)
                .slab(ModBlocks.EMERALD_SLAB)
                .stairs(ModBlocks.EMERALD_STAIRS);

        blockModelGenerators.family(Blocks.LAPIS_BLOCK)
                .slab(ModBlocks.LAPIS_SLAB)
                .stairs(ModBlocks.LAPIS_STAIRS);

        blockModelGenerators.family(Blocks.DIAMOND_BLOCK)
                .slab(ModBlocks.DIAMOND_SLAB)
                .stairs(ModBlocks.DIAMOND_STAIRS);

        blockModelGenerators.family(Blocks.NETHERITE_BLOCK)
                .slab(ModBlocks.NETHERITE_SLAB)
                .stairs(ModBlocks.NETHERITE_STAIRS);


        blockModelGenerators.family(Blocks.SMOOTH_STONE)
                .stairs(ModBlocks.SMOOTH_STONE_STAIRS)
                .wall(ModBlocks.SMOOTH_STONE_WALL);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(ModItems.RAW_CALAMARI, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.COOKED_CALAMARI, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.PRISMARINE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.INDEPENDENT_ACCIDENT, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.RUBY, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.LONGER_STRING, ModelTemplates.FLAT_ITEM);

        itemModelGenerators.generateFlatItem(ModItems.EMERALD_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.EMERALD_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.EMERALD_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.EMERALD_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.EMERALD_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateSpear(ModItems.EMERALD_SPEAR);
    }
}
