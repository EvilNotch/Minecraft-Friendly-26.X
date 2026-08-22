package net.evilnotch.minecraftfriendly.datagen;

import net.evilnotch.minecraftfriendly.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;

import java.util.concurrent.CompletableFuture;

import static net.evilnotch.minecraftfriendly.block.ModBlocks.*;


public class ModBlockTagsProvider extends FabricTagsProvider.BlockTagsProvider {
    public ModBlockTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {

        tag(BlockTags.WOOL)
                .add(ModBlocks.getRK(RAINBOW_WOOL));

        tag(BlockTags.OCCLUDES_VIBRATION_SIGNALS)
                .add(ModBlocks.getRK(RAINBOW_WOOL));

        tag(BlockTags.FLOWERS)
                .add(ModBlocks.getRK(PINK_DAISY))
                .add(ModBlocks.getRK(BUTTERCUP))
                .add(ModBlocks.getRK(PAEONIA))
                .add(ModBlocks.getRK(ROSE));

        tag(BlockTags.BEE_ATTRACTIVE)
                .add(ModBlocks.getRK(PINK_DAISY))
                .add(ModBlocks.getRK(BUTTERCUP))
                .add(ModBlocks.getRK(PAEONIA))
                .add(ModBlocks.getRK(ROSE));

        tag(BlockTags.CONCRETE)
                .add(ModBlocks.getRK(WHITE_CONCRETE_SLAB))
                .add(ModBlocks.getRK(WHITE_CONCRETE_STAIRS))
                .add(ModBlocks.getRK(WHITE_CONCRETE_FENCE))
                .add(ModBlocks.getRK(WHITE_CONCRETE_FENCE_GATE))
                .add(ModBlocks.getRK(WHITE_CONCRETE_WALL))

                .add(ModBlocks.getRK(LIGHT_GRAY_CONCRETE_SLAB))
                .add(ModBlocks.getRK(LIGHT_GRAY_CONCRETE_STAIRS))
                .add(ModBlocks.getRK(LIGHT_GRAY_CONCRETE_FENCE))
                .add(ModBlocks.getRK(LIGHT_GRAY_CONCRETE_FENCE_GATE))
                .add(ModBlocks.getRK(LIGHT_GRAY_CONCRETE_WALL))

                .add(ModBlocks.getRK(GRAY_CONCRETE_SLAB))
                .add(ModBlocks.getRK(GRAY_CONCRETE_STAIRS))
                .add(ModBlocks.getRK(GRAY_CONCRETE_FENCE))
                .add(ModBlocks.getRK(GRAY_CONCRETE_FENCE_GATE))
                .add(ModBlocks.getRK(GRAY_CONCRETE_WALL))

                .add(ModBlocks.getRK(BLACK_CONCRETE_SLAB))
                .add(ModBlocks.getRK(BLACK_CONCRETE_STAIRS))
                .add(ModBlocks.getRK(BLACK_CONCRETE_FENCE))
                .add(ModBlocks.getRK(BLACK_CONCRETE_FENCE_GATE))
                .add(ModBlocks.getRK(BLACK_CONCRETE_WALL))

                .add(ModBlocks.getRK(BROWN_CONCRETE_SLAB))
                .add(ModBlocks.getRK(BROWN_CONCRETE_STAIRS))
                .add(ModBlocks.getRK(BROWN_CONCRETE_FENCE))
                .add(ModBlocks.getRK(BROWN_CONCRETE_FENCE_GATE))
                .add(ModBlocks.getRK(BROWN_CONCRETE_WALL))

                .add(ModBlocks.getRK(RED_CONCRETE_SLAB))
                .add(ModBlocks.getRK(RED_CONCRETE_STAIRS))
                .add(ModBlocks.getRK(RED_CONCRETE_FENCE))
                .add(ModBlocks.getRK(RED_CONCRETE_FENCE_GATE))
                .add(ModBlocks.getRK(RED_CONCRETE_WALL))

                .add(ModBlocks.getRK(ORANGE_CONCRETE_SLAB))
                .add(ModBlocks.getRK(ORANGE_CONCRETE_STAIRS))
                .add(ModBlocks.getRK(ORANGE_CONCRETE_FENCE))
                .add(ModBlocks.getRK(ORANGE_CONCRETE_FENCE_GATE))
                .add(ModBlocks.getRK(ORANGE_CONCRETE_WALL))

                .add(ModBlocks.getRK(YELLOW_CONCRETE_SLAB))
                .add(ModBlocks.getRK(YELLOW_CONCRETE_STAIRS))
                .add(ModBlocks.getRK(YELLOW_CONCRETE_FENCE))
                .add(ModBlocks.getRK(YELLOW_CONCRETE_FENCE_GATE))
                .add(ModBlocks.getRK(YELLOW_CONCRETE_WALL))

                .add(ModBlocks.getRK(LIME_CONCRETE_SLAB))
                .add(ModBlocks.getRK(LIME_CONCRETE_STAIRS))
                .add(ModBlocks.getRK(LIME_CONCRETE_FENCE))
                .add(ModBlocks.getRK(LIME_CONCRETE_FENCE_GATE))
                .add(ModBlocks.getRK(LIME_CONCRETE_WALL))

                .add(ModBlocks.getRK(GREEN_CONCRETE_SLAB))
                .add(ModBlocks.getRK(GREEN_CONCRETE_STAIRS))
                .add(ModBlocks.getRK(GREEN_CONCRETE_FENCE))
                .add(ModBlocks.getRK(GREEN_CONCRETE_FENCE_GATE))
                .add(ModBlocks.getRK(GREEN_CONCRETE_WALL))

                .add(ModBlocks.getRK(CYAN_CONCRETE_SLAB))
                .add(ModBlocks.getRK(CYAN_CONCRETE_STAIRS))
                .add(ModBlocks.getRK(CYAN_CONCRETE_FENCE))
                .add(ModBlocks.getRK(CYAN_CONCRETE_FENCE_GATE))
                .add(ModBlocks.getRK(CYAN_CONCRETE_WALL))

                .add(ModBlocks.getRK(LIGHT_BLUE_CONCRETE_SLAB))
                .add(ModBlocks.getRK(LIGHT_BLUE_CONCRETE_STAIRS))
                .add(ModBlocks.getRK(LIGHT_BLUE_CONCRETE_FENCE))
                .add(ModBlocks.getRK(LIGHT_BLUE_CONCRETE_FENCE_GATE))
                .add(ModBlocks.getRK(LIGHT_BLUE_CONCRETE_WALL))

                .add(ModBlocks.getRK(BLUE_CONCRETE_SLAB))
                .add(ModBlocks.getRK(BLUE_CONCRETE_STAIRS))
                .add(ModBlocks.getRK(BLUE_CONCRETE_FENCE))
                .add(ModBlocks.getRK(BLUE_CONCRETE_FENCE_GATE))
                .add(ModBlocks.getRK(BLUE_CONCRETE_WALL))

                .add(ModBlocks.getRK(PURPLE_CONCRETE_SLAB))
                .add(ModBlocks.getRK(PURPLE_CONCRETE_STAIRS))
                .add(ModBlocks.getRK(PURPLE_CONCRETE_FENCE))
                .add(ModBlocks.getRK(PURPLE_CONCRETE_FENCE_GATE))
                .add(ModBlocks.getRK(PURPLE_CONCRETE_WALL))

                .add(ModBlocks.getRK(MAGENTA_CONCRETE_SLAB))
                .add(ModBlocks.getRK(MAGENTA_CONCRETE_STAIRS))
                .add(ModBlocks.getRK(MAGENTA_CONCRETE_FENCE))
                .add(ModBlocks.getRK(MAGENTA_CONCRETE_FENCE_GATE))
                .add(ModBlocks.getRK(MAGENTA_CONCRETE_WALL))
                
                .add(ModBlocks.getRK(PINK_CONCRETE_SLAB))
                .add(ModBlocks.getRK(PINK_CONCRETE_STAIRS))
                .add(ModBlocks.getRK(PINK_CONCRETE_FENCE))
                .add(ModBlocks.getRK(PINK_CONCRETE_FENCE_GATE))
                .add(ModBlocks.getRK(PINK_CONCRETE_WALL));

        tag(BlockTags.SHEARS_MAJOR_BREAKING_SPEED)
                .add(ModBlocks.getRK(TUBE_CORAL_SLAB));

        tag(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(ModBlocks.getRK(DIRT_SLAB))

                .add(ModBlocks.getRK(GRASS_SLAB))


                .add(ModBlocks.getRK(GRAVEL_LAYER_BLOCK))
                .add(ModBlocks.getRK(SAND_LAYER_BLOCK))
                .add(ModBlocks.getRK(RED_SAND_LAYER_BLOCK));

        tag(BlockTags.MINEABLE_WITH_PICKAXE)

                .add(ModBlocks.getRK(NETHER_BRICK_FENCE_GATE))

                .add(ModBlocks.getRK(SAPPHIRE_CLUSTER))

                .add(ModBlocks.getRK(PETRIFIED_SPRUCE_SLAB))
                .add(ModBlocks.getRK(PETRIFIED_BIRCH_SLAB))
                .add(ModBlocks.getRK(PETRIFIED_JUNGLE_SLAB))
                .add(ModBlocks.getRK(PETRIFIED_ACACIA_SLAB))
                .add(ModBlocks.getRK(PETRIFIED_DARK_OAK_SLAB))
                .add(ModBlocks.getRK(PETRIFIED_MANGROVE_SLAB))
                .add(ModBlocks.getRK(PETRIFIED_CHERRY_SLAB))
                .add(ModBlocks.getRK(PETRIFIED_PALE_OAK_SLAB))
                .add(ModBlocks.getRK(PETRIFIED_BAMBOO_SLAB))
                .add(ModBlocks.getRK(PETRIFIED_BAMBOO_MOSAIC_SLAB))
                .add(ModBlocks.getRK(PETRIFIED_CRIMSON_SLAB))
                .add(ModBlocks.getRK(PETRIFIED_WARPED_SLAB))

                .add(ModBlocks.getRK(CRACKED_PURPUR_BLOCK))

                .add(ModBlocks.getRK(SMOOTH_STONE_STAIRS))
                .add(ModBlocks.getRK(SMOOTH_STONE_WALL))

                .add(ModBlocks.getRK(PLATED_IRON))
                .add(ModBlocks.getRK(IRON_BUTTON))
                .add(ModBlocks.getRK(IRON_SLAB))
                .add(ModBlocks.getRK(IRON_STAIRS))

                .add(ModBlocks.getRK(CHISELED_GOLD))
                .add(ModBlocks.getRK(GOLD_BUTTON))
                .add(ModBlocks.getRK(GOLD_SLAB))
                .add(ModBlocks.getRK(GOLD_STAIRS))
                .add(ModBlocks.getRK(GOLD_CHAIN))
                .add(ModBlocks.getRK(GOLD_BARS))

                .add(ModBlocks.getRK(REDSTONE_SLAB))
                .add(ModBlocks.getRK(REDSTONE_STAIRS))

                .add(ModBlocks.getRK(RUBY_BLOCK))
                .add(ModBlocks.getRK(SAPPHIRE_BLOCK))

                .add(ModBlocks.getRK(CHISELED_EMERALD))
                .add(ModBlocks.getRK(EMERALD_SLAB))
                .add(ModBlocks.getRK(EMERALD_STAIRS))

                .add(ModBlocks.getRK(CHISELED_LAPIS))
                .add(ModBlocks.getRK(LAPIS_SLAB))
                .add(ModBlocks.getRK(LAPIS_STAIRS))

                .add(ModBlocks.getRK(CHISELED_DIAMOND))
                .add(ModBlocks.getRK(DIAMOND_SLAB))
                .add(ModBlocks.getRK(DIAMOND_STAIRS))

                .add(ModBlocks.getRK(NETHERITE_SLAB))
                .add(ModBlocks.getRK(NETHERITE_STAIRS))

                .add(ModBlocks.getRK(WHITE_CONCRETE_SLAB))
                .add(ModBlocks.getRK(WHITE_CONCRETE_STAIRS))
                .add(ModBlocks.getRK(WHITE_CONCRETE_FENCE))
                .add(ModBlocks.getRK(WHITE_CONCRETE_FENCE_GATE))
                .add(ModBlocks.getRK(WHITE_CONCRETE_WALL))

                .add(ModBlocks.getRK(LIGHT_GRAY_CONCRETE_SLAB))
                .add(ModBlocks.getRK(LIGHT_GRAY_CONCRETE_STAIRS))
                .add(ModBlocks.getRK(LIGHT_GRAY_CONCRETE_FENCE))
                .add(ModBlocks.getRK(LIGHT_GRAY_CONCRETE_FENCE_GATE))
                .add(ModBlocks.getRK(LIGHT_GRAY_CONCRETE_WALL))

                .add(ModBlocks.getRK(GRAY_CONCRETE_SLAB))
                .add(ModBlocks.getRK(GRAY_CONCRETE_STAIRS))
                .add(ModBlocks.getRK(GRAY_CONCRETE_FENCE))
                .add(ModBlocks.getRK(GRAY_CONCRETE_FENCE_GATE))
                .add(ModBlocks.getRK(GRAY_CONCRETE_WALL))

                .add(ModBlocks.getRK(BLACK_CONCRETE_SLAB))
                .add(ModBlocks.getRK(BLACK_CONCRETE_STAIRS))
                .add(ModBlocks.getRK(BLACK_CONCRETE_FENCE))
                .add(ModBlocks.getRK(BLACK_CONCRETE_FENCE_GATE))
                .add(ModBlocks.getRK(BLACK_CONCRETE_WALL))

                .add(ModBlocks.getRK(BROWN_CONCRETE_SLAB))
                .add(ModBlocks.getRK(BROWN_CONCRETE_STAIRS))
                .add(ModBlocks.getRK(BROWN_CONCRETE_FENCE))
                .add(ModBlocks.getRK(BROWN_CONCRETE_FENCE_GATE))
                .add(ModBlocks.getRK(BROWN_CONCRETE_WALL))

                .add(ModBlocks.getRK(RED_CONCRETE_SLAB))
                .add(ModBlocks.getRK(RED_CONCRETE_STAIRS))
                .add(ModBlocks.getRK(RED_CONCRETE_FENCE))
                .add(ModBlocks.getRK(RED_CONCRETE_FENCE_GATE))
                .add(ModBlocks.getRK(RED_CONCRETE_WALL))

                .add(ModBlocks.getRK(ORANGE_CONCRETE_SLAB))
                .add(ModBlocks.getRK(ORANGE_CONCRETE_STAIRS))
                .add(ModBlocks.getRK(ORANGE_CONCRETE_FENCE))
                .add(ModBlocks.getRK(ORANGE_CONCRETE_FENCE_GATE))
                .add(ModBlocks.getRK(ORANGE_CONCRETE_WALL))

                .add(ModBlocks.getRK(YELLOW_CONCRETE_SLAB))
                .add(ModBlocks.getRK(YELLOW_CONCRETE_STAIRS))
                .add(ModBlocks.getRK(YELLOW_CONCRETE_FENCE))
                .add(ModBlocks.getRK(YELLOW_CONCRETE_FENCE_GATE))
                .add(ModBlocks.getRK(YELLOW_CONCRETE_WALL))

                .add(ModBlocks.getRK(LIME_CONCRETE_SLAB))
                .add(ModBlocks.getRK(LIME_CONCRETE_STAIRS))
                .add(ModBlocks.getRK(LIME_CONCRETE_FENCE))
                .add(ModBlocks.getRK(LIME_CONCRETE_FENCE_GATE))
                .add(ModBlocks.getRK(LIME_CONCRETE_WALL))

                .add(ModBlocks.getRK(GREEN_CONCRETE_SLAB))
                .add(ModBlocks.getRK(GREEN_CONCRETE_STAIRS))
                .add(ModBlocks.getRK(GREEN_CONCRETE_FENCE))
                .add(ModBlocks.getRK(GREEN_CONCRETE_FENCE_GATE))
                .add(ModBlocks.getRK(GREEN_CONCRETE_WALL))

                .add(ModBlocks.getRK(CYAN_CONCRETE_SLAB))
                .add(ModBlocks.getRK(CYAN_CONCRETE_STAIRS))
                .add(ModBlocks.getRK(CYAN_CONCRETE_FENCE))
                .add(ModBlocks.getRK(CYAN_CONCRETE_FENCE_GATE))
                .add(ModBlocks.getRK(CYAN_CONCRETE_WALL))

                .add(ModBlocks.getRK(LIGHT_BLUE_CONCRETE_SLAB))
                .add(ModBlocks.getRK(LIGHT_BLUE_CONCRETE_STAIRS))
                .add(ModBlocks.getRK(LIGHT_BLUE_CONCRETE_FENCE))
                .add(ModBlocks.getRK(LIGHT_BLUE_CONCRETE_FENCE_GATE))
                .add(ModBlocks.getRK(LIGHT_BLUE_CONCRETE_WALL))

                .add(ModBlocks.getRK(BLUE_CONCRETE_SLAB))
                .add(ModBlocks.getRK(BLUE_CONCRETE_STAIRS))
                .add(ModBlocks.getRK(BLUE_CONCRETE_FENCE))
                .add(ModBlocks.getRK(BLUE_CONCRETE_FENCE_GATE))
                .add(ModBlocks.getRK(BLUE_CONCRETE_WALL))

                .add(ModBlocks.getRK(PURPLE_CONCRETE_SLAB))
                .add(ModBlocks.getRK(PURPLE_CONCRETE_STAIRS))
                .add(ModBlocks.getRK(PURPLE_CONCRETE_FENCE))
                .add(ModBlocks.getRK(PURPLE_CONCRETE_FENCE_GATE))
                .add(ModBlocks.getRK(PURPLE_CONCRETE_WALL))

                .add(ModBlocks.getRK(MAGENTA_CONCRETE_SLAB))
                .add(ModBlocks.getRK(MAGENTA_CONCRETE_STAIRS))
                .add(ModBlocks.getRK(MAGENTA_CONCRETE_FENCE))
                .add(ModBlocks.getRK(MAGENTA_CONCRETE_FENCE_GATE))
                .add(ModBlocks.getRK(MAGENTA_CONCRETE_WALL))

                .add(ModBlocks.getRK(PINK_CONCRETE_SLAB))
                .add(ModBlocks.getRK(PINK_CONCRETE_STAIRS))
                .add(ModBlocks.getRK(PINK_CONCRETE_FENCE))
                .add(ModBlocks.getRK(PINK_CONCRETE_FENCE_GATE))
                .add(ModBlocks.getRK(PINK_CONCRETE_WALL));

        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.getRK(PLATED_IRON))
                .add(ModBlocks.getRK(IRON_BUTTON))
                .add(ModBlocks.getRK(IRON_SLAB))
                .add(ModBlocks.getRK(IRON_STAIRS))
                .add(ModBlocks.getRK(CHISELED_LAPIS))
                .add(ModBlocks.getRK(LAPIS_SLAB))
                .add(ModBlocks.getRK(LAPIS_STAIRS));

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.getRK(CHISELED_GOLD))
                .add(ModBlocks.getRK(GOLD_BUTTON))
                .add(ModBlocks.getRK(GOLD_SLAB))
                .add(ModBlocks.getRK(GOLD_STAIRS))
                .add(ModBlocks.getRK(GOLD_CHAIN))
                .add(ModBlocks.getRK(GOLD_BARS))
                .add(ModBlocks.getRK(REDSTONE_SLAB))
                .add(ModBlocks.getRK(REDSTONE_STAIRS))
                .add(ModBlocks.getRK(RUBY_BLOCK))
                .add(ModBlocks.getRK(SAPPHIRE_BLOCK))
                .add(ModBlocks.getRK(CHISELED_EMERALD))
                .add(ModBlocks.getRK(EMERALD_SLAB))
                .add(ModBlocks.getRK(EMERALD_STAIRS))
                .add(ModBlocks.getRK(CHISELED_DIAMOND))
                .add(ModBlocks.getRK(DIAMOND_SLAB))
                .add(ModBlocks.getRK(DIAMOND_STAIRS));

        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.getRK(NETHERITE_SLAB))
                .add(ModBlocks.getRK(NETHERITE_STAIRS));

        tag(BlockTags.BEACON_BASE_BLOCKS)
                .add(ModBlocks.getRK(PLATED_IRON))
                .add(ModBlocks.getRK(RUBY_BLOCK))
                .add(ModBlocks.getRK(SAPPHIRE_BLOCK))
                .add(ModBlocks.getRK(CHISELED_EMERALD))
                .add(ModBlocks.getRK(CHISELED_LAPIS))
                .add(ModBlocks.getRK(CHISELED_GOLD))
                .add(ModBlocks.getRK(CHISELED_DIAMOND));

        tag(BlockTags.DIRT).add(ModBlocks.getRK(DIRT_SLAB));


        tag(BlockTags.SLABS).add(ModBlocks.getRK(DIRT_SLAB));


        tag(BlockTags.SLABS).add(ModBlocks.getRK(GRASS_SLAB));


        tag(BlockTags.SLABS).add(ModBlocks.getRK(PETRIFIED_SPRUCE_SLAB));
        tag(BlockTags.SLABS).add(ModBlocks.getRK(PETRIFIED_BIRCH_SLAB));
        tag(BlockTags.SLABS).add(ModBlocks.getRK(PETRIFIED_JUNGLE_SLAB));
        tag(BlockTags.SLABS).add(ModBlocks.getRK(PETRIFIED_ACACIA_SLAB));
        tag(BlockTags.SLABS).add(ModBlocks.getRK(PETRIFIED_DARK_OAK_SLAB));
        tag(BlockTags.SLABS).add(ModBlocks.getRK(PETRIFIED_MANGROVE_SLAB));
        tag(BlockTags.SLABS).add(ModBlocks.getRK(PETRIFIED_CHERRY_SLAB));
        tag(BlockTags.SLABS).add(ModBlocks.getRK(PETRIFIED_PALE_OAK_SLAB));
        tag(BlockTags.SLABS).add(ModBlocks.getRK(PETRIFIED_BAMBOO_SLAB));
        tag(BlockTags.SLABS).add(ModBlocks.getRK(PETRIFIED_BAMBOO_MOSAIC_SLAB));
        tag(BlockTags.SLABS).add(ModBlocks.getRK(PETRIFIED_CRIMSON_SLAB));
        tag(BlockTags.SLABS).add(ModBlocks.getRK(PETRIFIED_WARPED_SLAB));



        tag(BlockTags.FENCE_GATES).add(ModBlocks.getRK(NETHER_BRICK_FENCE_GATE));

        tag(BlockTags.STAIRS).add(ModBlocks.getRK(SMOOTH_STONE_STAIRS));
        tag(BlockTags.WALLS).add(ModBlocks.getRK(SMOOTH_STONE_WALL));

        tag(BlockTags.SLABS).add(ModBlocks.getRK(ModBlocks.WHITE_CONCRETE_SLAB));
        tag(BlockTags.STAIRS).add(ModBlocks.getRK(ModBlocks.WHITE_CONCRETE_STAIRS));
        tag(BlockTags.FENCES).add(ModBlocks.getRK(WHITE_CONCRETE_FENCE));
        tag(BlockTags.FENCE_GATES).add(ModBlocks.getRK(WHITE_CONCRETE_FENCE_GATE));
        tag(BlockTags.WALLS).add(ModBlocks.getRK(WHITE_CONCRETE_WALL));

        tag(BlockTags.SLABS).add(ModBlocks.getRK(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB));
        tag(BlockTags.STAIRS).add(ModBlocks.getRK(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS));
        tag(BlockTags.FENCES).add(ModBlocks.getRK(LIGHT_GRAY_CONCRETE_FENCE));
        tag(BlockTags.FENCE_GATES).add(ModBlocks.getRK(LIGHT_GRAY_CONCRETE_FENCE_GATE));
        tag(BlockTags.WALLS).add(ModBlocks.getRK(LIGHT_GRAY_CONCRETE_WALL));

        tag(BlockTags.SLABS).add(ModBlocks.getRK(ModBlocks.GRAY_CONCRETE_SLAB));
        tag(BlockTags.STAIRS).add(ModBlocks.getRK(ModBlocks.GRAY_CONCRETE_STAIRS));
        tag(BlockTags.FENCES).add(ModBlocks.getRK(GRAY_CONCRETE_FENCE));
        tag(BlockTags.FENCE_GATES).add(ModBlocks.getRK(GRAY_CONCRETE_FENCE_GATE));
        tag(BlockTags.WALLS).add(ModBlocks.getRK(GRAY_CONCRETE_WALL));

        tag(BlockTags.SLABS).add(ModBlocks.getRK(ModBlocks.BLACK_CONCRETE_SLAB));
        tag(BlockTags.STAIRS).add(ModBlocks.getRK(ModBlocks.BLACK_CONCRETE_STAIRS));
        tag(BlockTags.FENCES).add(ModBlocks.getRK(BLACK_CONCRETE_FENCE));
        tag(BlockTags.FENCE_GATES).add(ModBlocks.getRK(BLACK_CONCRETE_FENCE_GATE));
        tag(BlockTags.WALLS).add(ModBlocks.getRK(BLACK_CONCRETE_WALL));

        tag(BlockTags.SLABS).add(ModBlocks.getRK(ModBlocks.BROWN_CONCRETE_SLAB));
        tag(BlockTags.STAIRS).add(ModBlocks.getRK(ModBlocks.BROWN_CONCRETE_STAIRS));
        tag(BlockTags.FENCES).add(ModBlocks.getRK(BROWN_CONCRETE_FENCE));
        tag(BlockTags.FENCE_GATES).add(ModBlocks.getRK(BROWN_CONCRETE_FENCE_GATE));
        tag(BlockTags.WALLS).add(ModBlocks.getRK(BROWN_CONCRETE_WALL));

        tag(BlockTags.SLABS).add(ModBlocks.getRK(ModBlocks.RED_CONCRETE_SLAB));
        tag(BlockTags.STAIRS).add(ModBlocks.getRK(ModBlocks.RED_CONCRETE_STAIRS));
        tag(BlockTags.FENCES).add(ModBlocks.getRK(RED_CONCRETE_FENCE));
        tag(BlockTags.FENCE_GATES).add(ModBlocks.getRK(RED_CONCRETE_FENCE_GATE));
        tag(BlockTags.WALLS).add(ModBlocks.getRK(RED_CONCRETE_WALL));

        tag(BlockTags.SLABS).add(ModBlocks.getRK(ModBlocks.ORANGE_CONCRETE_SLAB));
        tag(BlockTags.STAIRS).add(ModBlocks.getRK(ModBlocks.ORANGE_CONCRETE_STAIRS));
        tag(BlockTags.FENCES).add(ModBlocks.getRK(ORANGE_CONCRETE_FENCE));
        tag(BlockTags.FENCE_GATES).add(ModBlocks.getRK(ORANGE_CONCRETE_FENCE_GATE));
        tag(BlockTags.WALLS).add(ModBlocks.getRK(ORANGE_CONCRETE_WALL));

        tag(BlockTags.SLABS).add(ModBlocks.getRK(ModBlocks.YELLOW_CONCRETE_SLAB));
        tag(BlockTags.STAIRS).add(ModBlocks.getRK(ModBlocks.YELLOW_CONCRETE_STAIRS));
        tag(BlockTags.FENCES).add(ModBlocks.getRK(YELLOW_CONCRETE_FENCE));
        tag(BlockTags.FENCE_GATES).add(ModBlocks.getRK(YELLOW_CONCRETE_FENCE_GATE));
        tag(BlockTags.WALLS).add(ModBlocks.getRK(YELLOW_CONCRETE_WALL));

        tag(BlockTags.SLABS).add(ModBlocks.getRK(ModBlocks.LIME_CONCRETE_SLAB));
        tag(BlockTags.STAIRS).add(ModBlocks.getRK(ModBlocks.LIME_CONCRETE_STAIRS));
        tag(BlockTags.FENCES).add(ModBlocks.getRK(LIME_CONCRETE_FENCE));
        tag(BlockTags.FENCE_GATES).add(ModBlocks.getRK(LIME_CONCRETE_FENCE_GATE));
        tag(BlockTags.WALLS).add(ModBlocks.getRK(LIME_CONCRETE_WALL));

        tag(BlockTags.SLABS).add(ModBlocks.getRK(ModBlocks.GREEN_CONCRETE_SLAB));
        tag(BlockTags.STAIRS).add(ModBlocks.getRK(ModBlocks.GREEN_CONCRETE_STAIRS));
        tag(BlockTags.FENCES).add(ModBlocks.getRK(GREEN_CONCRETE_FENCE));
        tag(BlockTags.FENCE_GATES).add(ModBlocks.getRK(GREEN_CONCRETE_FENCE_GATE));
        tag(BlockTags.WALLS).add(ModBlocks.getRK(GREEN_CONCRETE_WALL));

        tag(BlockTags.SLABS).add(ModBlocks.getRK(ModBlocks.CYAN_CONCRETE_SLAB));
        tag(BlockTags.STAIRS).add(ModBlocks.getRK(ModBlocks.CYAN_CONCRETE_STAIRS));
        tag(BlockTags.FENCES).add(ModBlocks.getRK(CYAN_CONCRETE_FENCE));
        tag(BlockTags.FENCE_GATES).add(ModBlocks.getRK(CYAN_CONCRETE_FENCE_GATE));
        tag(BlockTags.WALLS).add(ModBlocks.getRK(CYAN_CONCRETE_WALL));

        tag(BlockTags.SLABS).add(ModBlocks.getRK(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB));
        tag(BlockTags.STAIRS).add(ModBlocks.getRK(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS));
        tag(BlockTags.FENCES).add(ModBlocks.getRK(LIGHT_BLUE_CONCRETE_FENCE));
        tag(BlockTags.FENCE_GATES).add(ModBlocks.getRK(LIGHT_BLUE_CONCRETE_FENCE_GATE));
        tag(BlockTags.WALLS).add(ModBlocks.getRK(LIGHT_BLUE_CONCRETE_WALL));

        tag(BlockTags.SLABS).add(ModBlocks.getRK(ModBlocks.BLUE_CONCRETE_SLAB));
        tag(BlockTags.STAIRS).add(ModBlocks.getRK(ModBlocks.BLUE_CONCRETE_STAIRS));
        tag(BlockTags.FENCES).add(ModBlocks.getRK(BLUE_CONCRETE_FENCE));
        tag(BlockTags.FENCE_GATES).add(ModBlocks.getRK(BLUE_CONCRETE_FENCE_GATE));
        tag(BlockTags.WALLS).add(ModBlocks.getRK(BLUE_CONCRETE_WALL));

        tag(BlockTags.SLABS).add(ModBlocks.getRK(ModBlocks.PURPLE_CONCRETE_SLAB));
        tag(BlockTags.STAIRS).add(ModBlocks.getRK(ModBlocks.PURPLE_CONCRETE_STAIRS));
        tag(BlockTags.FENCES).add(ModBlocks.getRK(PURPLE_CONCRETE_FENCE));
        tag(BlockTags.FENCE_GATES).add(ModBlocks.getRK(PURPLE_CONCRETE_FENCE_GATE));
        tag(BlockTags.WALLS).add(ModBlocks.getRK(PURPLE_CONCRETE_WALL));

        tag(BlockTags.SLABS).add(ModBlocks.getRK(ModBlocks.MAGENTA_CONCRETE_SLAB));
        tag(BlockTags.STAIRS).add(ModBlocks.getRK(ModBlocks.MAGENTA_CONCRETE_STAIRS));
        tag(BlockTags.FENCES).add(ModBlocks.getRK(MAGENTA_CONCRETE_FENCE));
        tag(BlockTags.FENCE_GATES).add(ModBlocks.getRK(MAGENTA_CONCRETE_FENCE_GATE));
        tag(BlockTags.WALLS).add(ModBlocks.getRK(MAGENTA_CONCRETE_WALL));

        tag(BlockTags.SLABS).add(ModBlocks.getRK(ModBlocks.PINK_CONCRETE_SLAB));
        tag(BlockTags.STAIRS).add(ModBlocks.getRK(ModBlocks.PINK_CONCRETE_STAIRS));
        tag(BlockTags.FENCES).add(ModBlocks.getRK(PINK_CONCRETE_FENCE));
        tag(BlockTags.FENCE_GATES).add(ModBlocks.getRK(PINK_CONCRETE_FENCE_GATE));
        tag(BlockTags.WALLS).add(ModBlocks.getRK(PINK_CONCRETE_WALL));

        tag(BlockTags.BUTTONS).add(ModBlocks.getRK(ModBlocks.IRON_BUTTON));
        tag(BlockTags.SLABS).add(ModBlocks.getRK(ModBlocks.IRON_SLAB));
        tag(BlockTags.STAIRS).add(ModBlocks.getRK(ModBlocks.IRON_STAIRS));

        tag(BlockTags.BUTTONS).add(ModBlocks.getRK(ModBlocks.GOLD_BUTTON));
        tag(BlockTags.SLABS).add(ModBlocks.getRK(ModBlocks.GOLD_SLAB));
        tag(BlockTags.STAIRS).add(ModBlocks.getRK(ModBlocks.GOLD_STAIRS));
        tag(BlockTags.CHAINS).add(ModBlocks.getRK(ModBlocks.GOLD_CHAIN));
        tag(BlockTags.BARS).add(ModBlocks.getRK(ModBlocks.GOLD_BARS));

        tag(BlockTags.SLABS).add(ModBlocks.getRK(ModBlocks.REDSTONE_SLAB));
        tag(BlockTags.STAIRS).add(ModBlocks.getRK(ModBlocks.REDSTONE_STAIRS));

        tag(BlockTags.SLABS).add(ModBlocks.getRK(ModBlocks.EMERALD_SLAB));
        tag(BlockTags.STAIRS).add(ModBlocks.getRK(ModBlocks.EMERALD_STAIRS));

        tag(BlockTags.SLABS).add(ModBlocks.getRK(ModBlocks.LAPIS_SLAB));
        tag(BlockTags.STAIRS).add(ModBlocks.getRK(ModBlocks.LAPIS_STAIRS));

        tag(BlockTags.SLABS).add(ModBlocks.getRK(ModBlocks.DIAMOND_SLAB));
        tag(BlockTags.STAIRS).add(ModBlocks.getRK(ModBlocks.DIAMOND_STAIRS));

        tag(BlockTags.SLABS).add(ModBlocks.getRK(ModBlocks.NETHERITE_SLAB));
        tag(BlockTags.STAIRS).add(ModBlocks.getRK(ModBlocks.NETHERITE_STAIRS));

    }
}
