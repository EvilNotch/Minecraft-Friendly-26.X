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
        blockModelGenerators.createTrivialCube(ModBlocks.CHISELED_EMERALD);

        blockModelGenerators.family(Blocks.NETHER_BRICKS)
                        .fenceGate(ModBlocks.NETHER_BRICK_FENCE_GATE);

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
                .stairs(ModBlocks.IRON_STAIRS);

        blockModelGenerators.family(Blocks.GOLD_BLOCK)
                .slab(ModBlocks.GOLD_SLAB)
                .stairs(ModBlocks.GOLD_STAIRS);

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


    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(ModItems.RAW_CALAMARI, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.COOKED_CALAMARI, ModelTemplates.FLAT_ITEM);
    }
}
