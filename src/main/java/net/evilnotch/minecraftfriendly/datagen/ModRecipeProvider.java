package net.evilnotch.minecraftfriendly.datagen;

import net.evilnotch.minecraftfriendly.block.ModBlocks;
import net.evilnotch.minecraftfriendly.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.component.predicates.DataComponentPredicate;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CampfireCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.StonecutterRecipe;
import net.minecraft.world.level.block.Blocks;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        return new RecipeProvider(registries, output) {
            @Override
            public void buildRecipes() {

                shaped(RecipeCategory.MISC, ModItems.PRISMARINE)
                        .pattern("SSS")
                        .pattern("SSS")
                        .pattern("SSS")
                        .define('S', Items.PRISMARINE_CRYSTALS)
                        .unlockedBy(getHasName(Items.PRISMARINE_CRYSTALS), has(Items.PRISMARINE_CRYSTALS))
                        .group("misc")
                        .save(output, "prismarine_from_prismarine_shards");

                shaped(RecipeCategory.MISC, Blocks.STRUCTURE_VOID)
                        .pattern("SSS")
                        .pattern("SSS")
                        .pattern("SSS")
                        .define('S', Blocks.BARRIER)
                        .unlockedBy(getHasName(Blocks.BARRIER), has(Blocks.BARRIER))
                        .group("testing")
                        .save(output, "structure_void_from_barrier_blocks");//By default, without identifier it takes the name of the output.

                shapeless(RecipeCategory.MISC, Blocks.BARRIER, 9)
                        .requires(Blocks.STRUCTURE_VOID)
                        .unlockedBy(getHasName(Blocks.STRUCTURE_VOID), has(Blocks.STRUCTURE_VOID))
                        .group("testing")
                        .save(output, "barrier_blocks_from_structure_void");

                shapeless(RecipeCategory.MISC, Blocks.PETRIFIED_OAK_SLAB, 1)
                        .requires(Blocks.OAK_SLAB)
                        .requires(Items.RESIN_CLUMP)
                        .unlockedBy(getHasName(Blocks.OAK_SLAB), has(Blocks.OAK_SLAB))
                        .unlockedBy(getHasName(Items.RESIN_CLUMP), has(Blocks.RESIN_CLUMP))
                        .group("building")
                        .save(output, "petrified_oak_slab_from_resin_and_oak_slab");

                shapeless(RecipeCategory.MISC, ModBlocks.PETRIFIED_SPRUCE_SLAB, 1)
                        .requires(Blocks.SPRUCE_SLAB)
                        .requires(Items.RESIN_CLUMP)
                        .unlockedBy(getHasName(Blocks.SPRUCE_SLAB), has(Blocks.SPRUCE_SLAB))
                        .unlockedBy(getHasName(Items.RESIN_CLUMP), has(Blocks.RESIN_CLUMP))
                        .group("building")
                        .save(output, "petrified_spruce_slab_from_resin_and_spruce_slab");

                shapeless(RecipeCategory.MISC, ModBlocks.PETRIFIED_BIRCH_SLAB, 1)
                        .requires(Blocks.BIRCH_SLAB)
                        .requires(Items.RESIN_CLUMP)
                        .unlockedBy(getHasName(Blocks.BIRCH_SLAB), has(Blocks.BIRCH_SLAB))
                        .unlockedBy(getHasName(Items.RESIN_CLUMP), has(Blocks.RESIN_CLUMP))
                        .group("building")
                        .save(output, "petrified_birch_slab_from_resin_and_birch_slab");

                shapeless(RecipeCategory.MISC, ModBlocks.PETRIFIED_JUNGLE_SLAB, 1)
                        .requires(Blocks.JUNGLE_SLAB)
                        .requires(Items.RESIN_CLUMP)
                        .unlockedBy(getHasName(Blocks.JUNGLE_SLAB), has(Blocks.JUNGLE_SLAB))
                        .unlockedBy(getHasName(Items.RESIN_CLUMP), has(Blocks.RESIN_CLUMP))
                        .group("building")
                        .save(output, "petrified_jungle_slab_from_resin_and_jungle_slab");

                shapeless(RecipeCategory.MISC, ModBlocks.PETRIFIED_ACACIA_SLAB, 1)
                        .requires(Blocks.ACACIA_SLAB)
                        .requires(Items.RESIN_CLUMP)
                        .unlockedBy(getHasName(Blocks.ACACIA_SLAB), has(Blocks.ACACIA_SLAB))
                        .unlockedBy(getHasName(Items.RESIN_CLUMP), has(Blocks.RESIN_CLUMP))
                        .group("building")
                        .save(output, "petrified_acacia_slab_from_resin_and_acacia_slab");

                shapeless(RecipeCategory.MISC, ModBlocks.PETRIFIED_DARK_OAK_SLAB, 1)
                        .requires(Blocks.DARK_OAK_SLAB)
                        .requires(Items.RESIN_CLUMP)
                        .unlockedBy(getHasName(Blocks.DARK_OAK_SLAB), has(Blocks.DARK_OAK_SLAB))
                        .unlockedBy(getHasName(Items.RESIN_CLUMP), has(Blocks.RESIN_CLUMP))
                        .group("building")
                        .save(output, "petrified_dark_oak_slab_from_resin_and_dark_oak_slab");

                shapeless(RecipeCategory.MISC, ModBlocks.PETRIFIED_MANGROVE_SLAB, 1)
                        .requires(Blocks.MANGROVE_SLAB)
                        .requires(Items.RESIN_CLUMP)
                        .unlockedBy(getHasName(Blocks.MANGROVE_SLAB), has(Blocks.MANGROVE_SLAB))
                        .unlockedBy(getHasName(Items.RESIN_CLUMP), has(Blocks.RESIN_CLUMP))
                        .group("building")
                        .save(output, "petrified_mangrove_slab_from_resin_and_mangrove_slab");

                shapeless(RecipeCategory.MISC, ModBlocks.PETRIFIED_CHERRY_SLAB, 1)
                        .requires(Blocks.CHERRY_SLAB)
                        .requires(Items.RESIN_CLUMP)
                        .unlockedBy(getHasName(Blocks.CHERRY_SLAB), has(Blocks.CHERRY_SLAB))
                        .unlockedBy(getHasName(Items.RESIN_CLUMP), has(Blocks.RESIN_CLUMP))
                        .group("building")
                        .save(output, "petrified_cherry_slab_from_resin_and_cherry_slab");

                shapeless(RecipeCategory.MISC, ModBlocks.PETRIFIED_PALE_OAK_SLAB, 1)
                        .requires(Blocks.PALE_OAK_SLAB)
                        .requires(Items.RESIN_CLUMP)
                        .unlockedBy(getHasName(Blocks.PALE_OAK_SLAB), has(Blocks.PALE_OAK_SLAB))
                        .unlockedBy(getHasName(Items.RESIN_CLUMP), has(Blocks.RESIN_CLUMP))
                        .group("building")
                        .save(output, "petrified_pale_oak_slab_from_resin_and_pale_oak_slab");

                shapeless(RecipeCategory.MISC, ModBlocks.PETRIFIED_BAMBOO_SLAB, 1)
                        .requires(Blocks.BAMBOO_SLAB)
                        .requires(Items.RESIN_CLUMP)
                        .unlockedBy(getHasName(Blocks.BAMBOO_SLAB), has(Blocks.BAMBOO_SLAB))
                        .unlockedBy(getHasName(Items.RESIN_CLUMP), has(Blocks.RESIN_CLUMP))
                        .group("building")
                        .save(output, "petrified_bamboo_slab_from_resin_and_bamboo_slab");

                shapeless(RecipeCategory.MISC, ModBlocks.PETRIFIED_BAMBOO_MOSAIC_SLAB, 1)
                        .requires(Blocks.BAMBOO_MOSAIC_SLAB)
                        .requires(Items.RESIN_CLUMP)
                        .unlockedBy(getHasName(Blocks.BAMBOO_MOSAIC_SLAB), has(Blocks.BAMBOO_MOSAIC_SLAB))
                        .unlockedBy(getHasName(Items.RESIN_CLUMP), has(Blocks.RESIN_CLUMP))
                        .group("building")
                        .save(output, "petrified_bamboo_mosaic_slab_from_resin_and_bamboo_mosaic_slab");

                shapeless(RecipeCategory.MISC, ModBlocks.PETRIFIED_CRIMSON_SLAB, 1)
                        .requires(Blocks.CRIMSON_SLAB)
                        .requires(Items.RESIN_CLUMP)
                        .unlockedBy(getHasName(Blocks.CRIMSON_SLAB), has(Blocks.CRIMSON_SLAB))
                        .unlockedBy(getHasName(Items.RESIN_CLUMP), has(Blocks.RESIN_CLUMP))
                        .group("building")
                        .save(output, "petrified_crimson_slab_from_resin_and_crimson_slab");

                shapeless(RecipeCategory.MISC, ModBlocks.PETRIFIED_WARPED_SLAB, 1)
                        .requires(Blocks.WARPED_SLAB)
                        .requires(Items.RESIN_CLUMP)
                        .unlockedBy(getHasName(Blocks.WARPED_SLAB), has(Blocks.WARPED_SLAB))
                        .unlockedBy(getHasName(Items.RESIN_CLUMP), has(Blocks.RESIN_CLUMP))
                        .group("building")
                        .save(output, "petrified_warped_slab_from_resin_and_warped_slab");



                //Insert Later Datagen Food Recipes here: starting with calamari.

                shaped(RecipeCategory.MISC, ModBlocks.NETHER_BRICK_FENCE_GATE)
                        .pattern("   ")
                        .pattern("BNB")
                        .pattern("BNB")
                        .define('B', Items.NETHER_BRICK)
                        .define('N', Blocks.NETHER_BRICKS)
                        .unlockedBy(getHasName(Blocks.NETHER_BRICKS), has(Blocks.NETHER_BRICKS))
                        .group("building")
                        .save(output, "nether_fence_gate_from_nether_bricks_and_nether_brick_blocks");

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SAND_LAYER_BLOCK, Ingredient.of(Blocks.SAND))
                        .unlockedBy(getHasName(Blocks.SAND), has(Blocks.SAND))
                        .group("building")
                        .save(output, "layered_sand_from_sand_block");

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SAND_LAYER_BLOCK, Ingredient.of(Blocks.RED_SAND))
                        .unlockedBy(getHasName(Blocks.RED_SAND), has(Blocks.RED_SAND))
                        .group("building")
                        .save(output, "layered_red_sand_from_red_sand_block");

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TUBE_CORAL_SLAB, Ingredient.of(Blocks.TUBE_CORAL))
                        .unlockedBy(getHasName(Blocks.TUBE_CORAL), has(Blocks.TUBE_CORAL))
                        .group("building")
                        .save(output, "tube_coral_slab_from_tube_coral_block");

                stairBuilder(ModBlocks.SMOOTH_STONE_STAIRS, Ingredient.of(Blocks.SMOOTH_STONE))
                        .unlockedBy(getHasName(Blocks.SMOOTH_STONE), has(Blocks.SMOOTH_STONE))
                        .group("building")
                        .save(output, "smooth_stone_stairs_from_smooth_stone_block");

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_WALL, Blocks.SMOOTH_STONE);

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.IRON_SLAB, Ingredient.of(Blocks.IRON_BLOCK))
                        .unlockedBy(getHasName(Blocks.IRON_BLOCK), has(Blocks.IRON_BLOCK))
                        .group("building")
                        .save(output, "iron_slab_from_iron_block");

                stairBuilder(ModBlocks.IRON_STAIRS, Ingredient.of(Blocks.IRON_BLOCK))
                        .unlockedBy(getHasName(Blocks.IRON_BLOCK), has(Blocks.IRON_BLOCK))
                        .group("building")
                        .save(output, "iron_stairs_from_iron_block");

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLD_SLAB, Ingredient.of(Blocks.GOLD_BLOCK))
                        .unlockedBy(getHasName(Blocks.GOLD_BLOCK), has(Blocks.GOLD_BLOCK))
                        .group("building")
                        .save(output, "gold_slab_from_gold_block");

                stairBuilder(ModBlocks.GOLD_STAIRS, Ingredient.of(Blocks.GOLD_BLOCK))
                        .unlockedBy(getHasName(Blocks.GOLD_BLOCK), has(Blocks.GOLD_BLOCK))
                        .group("building")
                        .save(output, "gold_stairs_from_gold_block");

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.REDSTONE_SLAB, Ingredient.of(Blocks.REDSTONE_BLOCK))
                        .unlockedBy(getHasName(Blocks.REDSTONE_BLOCK), has(Blocks.REDSTONE_BLOCK))
                        .group("building")
                        .save(output, "redstone_slab_from_redstone_block");

                stairBuilder(ModBlocks.REDSTONE_STAIRS, Ingredient.of(Blocks.REDSTONE_BLOCK))
                        .unlockedBy(getHasName(Blocks.REDSTONE_BLOCK), has(Blocks.REDSTONE_BLOCK))
                        .group("building")
                        .save(output, "redstone_stairs_from_redstone_block");

                shapeless(RecipeCategory.MISC, Items.EMERALD, 9)
                        .requires(ModBlocks.CHISELED_EMERALD)
                        .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
                        .unlockedBy(getHasName(ModBlocks.CHISELED_EMERALD), has(ModBlocks.CHISELED_EMERALD))
                        .group("misc")
                        .save(output, "emeralds_from_chiseled_emerald_block");

                shapeless(RecipeCategory.MISC, Blocks.GILDED_BLACKSTONE, 1)
                        .requires(Items.GOLD_INGOT)
                                .requires(Blocks.BLACKSTONE)
                                .unlockedBy(getHasName(Blocks.BLACKSTONE), has(Blocks.BLACKSTONE))
                                .unlockedBy(getHasName(Items.GOLD_INGOT), has(Items.GOLD_INGOT))
                                .group("building")
                                .save(output, "gilded_blackstone_from_gold_ingot_and_blackstone_block");

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.EMERALD_SLAB, Ingredient.of(Blocks.EMERALD_BLOCK))
                        .unlockedBy(getHasName(Blocks.EMERALD_BLOCK), has(Blocks.EMERALD_BLOCK))
                        .group("building")
                        .save(output, "emerald_slab_from_emerald_block");

                stairBuilder(ModBlocks.EMERALD_STAIRS, Ingredient.of(Blocks.EMERALD_BLOCK))
                        .unlockedBy(getHasName(Blocks.EMERALD_BLOCK), has(Blocks.EMERALD_BLOCK))
                        .group("building")
                        .save(output, "emerald_stairs_from_emerald_block");

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LAPIS_SLAB, Ingredient.of(Blocks.LAPIS_BLOCK))
                        .unlockedBy(getHasName(Blocks.LAPIS_BLOCK), has(Blocks.LAPIS_BLOCK))
                        .group("building")
                        .save(output, "lapis_slab_from_lapis_block");

                stairBuilder(ModBlocks.LAPIS_STAIRS, Ingredient.of(Blocks.LAPIS_BLOCK))
                        .unlockedBy(getHasName(Blocks.LAPIS_BLOCK), has(Blocks.LAPIS_BLOCK))
                        .group("building")
                        .save(output, "lapis_stairs_from_lapis_block");

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIAMOND_SLAB, Ingredient.of(Blocks.DIAMOND_BLOCK))
                        .unlockedBy(getHasName(Blocks.DIAMOND_BLOCK), has(Blocks.DIAMOND_BLOCK))
                        .group("building")
                        .save(output, "diamond_slab_from_diamond_block");

                stairBuilder(ModBlocks.DIAMOND_STAIRS, Ingredient.of(Blocks.DIAMOND_BLOCK))
                        .unlockedBy(getHasName(Blocks.DIAMOND_BLOCK), has(Blocks.DIAMOND_BLOCK))
                        .group("building")
                        .save(output, "diamond_stairs_from_diamond_block");

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CONCRETE_SLAB, Ingredient.of(Blocks.CONCRETE.white()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.white()), has(Blocks.CONCRETE.white()))
                        .group("building")
                        .save(output, "white_concrete_slab_from_white_concrete");

                stairBuilder(ModBlocks.WHITE_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.white()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.white()), has(Blocks.CONCRETE.white()))
                        .group("building")
                        .save(output, "white_concrete_stairs_from_white_concrete");

                fenceBuilder(ModBlocks.WHITE_CONCRETE_FENCE, Ingredient.of(Blocks.CONCRETE.white()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.white()), has(Blocks.CONCRETE.white()))
                        .group("building")
                        .save(output, "white_concrete_fence_from_white_concrete");

                fenceGateBuilder(ModBlocks.WHITE_CONCRETE_FENCE_GATE, Ingredient.of(Blocks.CONCRETE.white()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.white()), has(Blocks.CONCRETE.white()))
                        .group("building")
                        .save(output, "white_concrete_fence_gate_from_white_concrete");

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CONCRETE_WALL, Blocks.CONCRETE.white());

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_CONCRETE_SLAB, Ingredient.of(Blocks.CONCRETE.lightGray()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.lightGray()), has(Blocks.CONCRETE.lightGray()))
                        .group("building")
                        .save(output, "light_gray_concrete_slab_from_light_gray_concrete");

                stairBuilder(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.lightGray()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.lightGray()), has(Blocks.CONCRETE.lightGray()))
                        .group("building")
                        .save(output, "light_gray_concrete_stairs_from_light_gray_concrete");

                fenceBuilder(ModBlocks.LIGHT_GRAY_CONCRETE_FENCE, Ingredient.of(Blocks.CONCRETE.lightGray()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.lightGray()), has(Blocks.CONCRETE.lightGray()))
                        .group("building")
                        .save(output, "light_gray_concrete_fence_from_light_gray_concrete");

                fenceGateBuilder(ModBlocks.LIGHT_GRAY_CONCRETE_FENCE_GATE, Ingredient.of(Blocks.CONCRETE.lightGray()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.lightGray()), has(Blocks.CONCRETE.lightGray()))
                        .group("building")
                        .save(output, "light_gray_concrete_fence_gate_from_light_gray_concrete");

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_CONCRETE_WALL, Blocks.CONCRETE.lightGray());

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_CONCRETE_SLAB, Ingredient.of(Blocks.CONCRETE.gray()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.gray()), has(Blocks.CONCRETE.gray()))
                        .group("building")
                        .save(output, "gray_concrete_slab_from_gray_concrete");

                stairBuilder(ModBlocks.GRAY_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.gray()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.gray()), has(Blocks.CONCRETE.gray()))
                        .group("building")
                        .save(output, "gray_concrete_stairs_from_gray_concrete");

                fenceBuilder(ModBlocks.GRAY_CONCRETE_FENCE, Ingredient.of(Blocks.CONCRETE.gray()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.gray()), has(Blocks.CONCRETE.gray()))
                        .group("building")
                        .save(output, "gray_concrete_fence_from_gray_concrete");

                fenceGateBuilder(ModBlocks.GRAY_CONCRETE_FENCE_GATE, Ingredient.of(Blocks.CONCRETE.gray()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.gray()), has(Blocks.CONCRETE.gray()))
                        .group("building")
                        .save(output, "gray_concrete_fence_gate_from_gray_concrete");

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_CONCRETE_WALL, Blocks.CONCRETE.gray());

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CONCRETE_SLAB, Ingredient.of(Blocks.CONCRETE.black()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.black()), has(Blocks.CONCRETE.black()))
                        .group("building")
                        .save(output, "black_concrete_slab_from_black_concrete");

                stairBuilder(ModBlocks.BLACK_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.black()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.black()), has(Blocks.CONCRETE.black()))
                        .group("building")
                        .save(output, "black_concrete_stairs_from_black_concrete");

                fenceBuilder(ModBlocks.BLACK_CONCRETE_FENCE, Ingredient.of(Blocks.CONCRETE.black()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.black()), has(Blocks.CONCRETE.black()))
                        .group("building")
                        .save(output, "black_concrete_fence_from_black_concrete");

                fenceGateBuilder(ModBlocks.BLACK_CONCRETE_FENCE_GATE, Ingredient.of(Blocks.CONCRETE.black()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.black()), has(Blocks.CONCRETE.black()))
                        .group("building")
                        .save(output, "black_concrete_fence_gate_from_black_concrete");

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CONCRETE_WALL, Blocks.CONCRETE.black());

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_CONCRETE_SLAB, Ingredient.of(Blocks.CONCRETE.brown()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.brown()), has(Blocks.CONCRETE.brown()))
                        .group("building")
                        .save(output, "brown_concrete_slab_from_brown_concrete");

                stairBuilder(ModBlocks.BROWN_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.brown()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.brown()), has(Blocks.CONCRETE.brown()))
                        .group("building")
                        .save(output, "brown_concrete_stairs_from_brown_concrete");

                fenceBuilder(ModBlocks.BROWN_CONCRETE_FENCE, Ingredient.of(Blocks.CONCRETE.brown()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.brown()), has(Blocks.CONCRETE.brown()))
                        .group("building")
                        .save(output, "brown_concrete_fence_from_brown_concrete");

                fenceGateBuilder(ModBlocks.BROWN_CONCRETE_FENCE_GATE, Ingredient.of(Blocks.CONCRETE.brown()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.brown()), has(Blocks.CONCRETE.brown()))
                        .group("building")
                        .save(output, "brown_concrete_fence_gate_from_brown_concrete");

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_CONCRETE_WALL, Blocks.CONCRETE.brown());

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CONCRETE_SLAB, Ingredient.of(Blocks.CONCRETE.red()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.red()), has(Blocks.CONCRETE.red()))
                        .group("building")
                        .save(output, "red_concrete_slab_from_red_concrete");

                stairBuilder(ModBlocks.RED_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.red()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.red()), has(Blocks.CONCRETE.red()))
                        .group("building")
                        .save(output, "red_concrete_stairs_from_red_concrete");

                fenceBuilder(ModBlocks.RED_CONCRETE_FENCE, Ingredient.of(Blocks.CONCRETE.red()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.red()), has(Blocks.CONCRETE.red()))
                        .group("building")
                        .save(output, "red_concrete_fence_from_red_concrete");

                fenceGateBuilder(ModBlocks.RED_CONCRETE_FENCE_GATE, Ingredient.of(Blocks.CONCRETE.red()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.red()), has(Blocks.CONCRETE.red()))
                        .group("building")
                        .save(output, "red_concrete_fence_gate_from_red_concrete");

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CONCRETE_WALL, Blocks.CONCRETE.red());

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CONCRETE_SLAB, Ingredient.of(Blocks.CONCRETE.orange()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.orange()), has(Blocks.CONCRETE.orange()))
                        .group("building")
                        .save(output, "orange_concrete_slab_from_orange_concrete");

                stairBuilder(ModBlocks.ORANGE_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.orange()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.orange()), has(Blocks.CONCRETE.orange()))
                        .group("building")
                        .save(output, "orange_concrete_stairs_from_orange_concrete");

                fenceBuilder(ModBlocks.ORANGE_CONCRETE_FENCE, Ingredient.of(Blocks.CONCRETE.orange()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.orange()), has(Blocks.CONCRETE.orange()))
                        .group("building")
                        .save(output, "orange_concrete_fence_from_orange_concrete");

                fenceGateBuilder(ModBlocks.ORANGE_CONCRETE_FENCE_GATE, Ingredient.of(Blocks.CONCRETE.orange()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.orange()), has(Blocks.CONCRETE.orange()))
                        .group("building")
                        .save(output, "orange_concrete_fence_gate_from_orange_concrete");

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CONCRETE_WALL, Blocks.CONCRETE.orange());

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CONCRETE_SLAB, Ingredient.of(Blocks.CONCRETE.yellow()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.yellow()), has(Blocks.CONCRETE.yellow()))
                        .group("building")
                        .save(output, "yellow_concrete_slab_from_yellow_concrete");

                stairBuilder(ModBlocks.YELLOW_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.yellow()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.yellow()), has(Blocks.CONCRETE.yellow()))
                        .group("building")
                        .save(output, "yellow_concrete_stairs_from_yellow_concrete");

                fenceBuilder(ModBlocks.YELLOW_CONCRETE_FENCE, Ingredient.of(Blocks.CONCRETE.yellow()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.yellow()), has(Blocks.CONCRETE.yellow()))
                        .group("building")
                        .save(output, "yellow_concrete_fence_from_yellow_concrete");

                fenceGateBuilder(ModBlocks.YELLOW_CONCRETE_FENCE_GATE, Ingredient.of(Blocks.CONCRETE.yellow()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.yellow()), has(Blocks.CONCRETE.yellow()))
                        .group("building")
                        .save(output, "yellow_concrete_fence_gate_from_yellow_concrete");

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CONCRETE_WALL, Blocks.CONCRETE.yellow());

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_CONCRETE_SLAB, Ingredient.of(Blocks.CONCRETE.lime()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.lime()), has(Blocks.CONCRETE.lime()))
                        .group("building")
                        .save(output, "lime_concrete_slab_from_lime_concrete");

                stairBuilder(ModBlocks.LIME_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.lime()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.lime()), has(Blocks.CONCRETE.lime()))
                        .group("building")
                        .save(output, "lime_concrete_stairs_from_lime_concrete");

                fenceBuilder(ModBlocks.LIME_CONCRETE_FENCE, Ingredient.of(Blocks.CONCRETE.lime()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.lime()), has(Blocks.CONCRETE.lime()))
                        .group("building")
                        .save(output, "lime_concrete_fence_from_lime_concrete");

                fenceGateBuilder(ModBlocks.LIME_CONCRETE_FENCE_GATE, Ingredient.of(Blocks.CONCRETE.lime()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.lime()), has(Blocks.CONCRETE.lime()))
                        .group("building")
                        .save(output, "lime_concrete_fence_gate_from_lime_concrete");

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_CONCRETE_WALL, Blocks.CONCRETE.lime());

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CONCRETE_SLAB, Ingredient.of(Blocks.CONCRETE.green()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.green()), has(Blocks.CONCRETE.green()))
                        .group("building")
                        .save(output, "green_concrete_slab_from_green_concrete");

                stairBuilder(ModBlocks.GREEN_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.green()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.green()), has(Blocks.CONCRETE.green()))
                        .group("building")
                        .save(output, "green_concrete_stairs_from_green_concrete");

                fenceBuilder(ModBlocks.GREEN_CONCRETE_FENCE, Ingredient.of(Blocks.CONCRETE.green()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.green()), has(Blocks.CONCRETE.green()))
                        .group("building")
                        .save(output, "green_concrete_fence_from_green_concrete");

                fenceGateBuilder(ModBlocks.GREEN_CONCRETE_FENCE_GATE, Ingredient.of(Blocks.CONCRETE.green()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.green()), has(Blocks.CONCRETE.green()))
                        .group("building")
                        .save(output, "green_concrete_fence_gate_from_green_concrete");

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CONCRETE_WALL, Blocks.CONCRETE.green());

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_CONCRETE_SLAB, Ingredient.of(Blocks.CONCRETE.cyan()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.cyan()), has(Blocks.CONCRETE.cyan()))
                        .group("building")
                        .save(output, "cyan_concrete_slab_from_cyan_concrete");

                stairBuilder(ModBlocks.CYAN_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.cyan()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.cyan()), has(Blocks.CONCRETE.cyan()))
                        .group("building")
                        .save(output, "cyan_concrete_stairs_from_cyan_concrete");

                fenceBuilder(ModBlocks.CYAN_CONCRETE_FENCE, Ingredient.of(Blocks.CONCRETE.cyan()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.cyan()), has(Blocks.CONCRETE.cyan()))
                        .group("building")
                        .save(output, "cyan_concrete_fence_from_cyan_concrete");

                fenceGateBuilder(ModBlocks.CYAN_CONCRETE_FENCE_GATE, Ingredient.of(Blocks.CONCRETE.cyan()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.cyan()), has(Blocks.CONCRETE.cyan()))
                        .group("building")
                        .save(output, "cyan_concrete_fence_gate_from_cyan_concrete");

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_CONCRETE_WALL, Blocks.CONCRETE.cyan());

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_CONCRETE_SLAB, Ingredient.of(Blocks.CONCRETE.lightBlue()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.lightBlue()), has(Blocks.CONCRETE.lightBlue()))
                        .group("building")
                        .save(output, "light_blue_concrete_slab_from_light_blue_concrete");

                stairBuilder(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.lightBlue()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.lightBlue()), has(Blocks.CONCRETE.lightBlue()))
                        .group("building")
                        .save(output, "light_blue_concrete_stairs_from_light_blue_concrete");

                fenceBuilder(ModBlocks.LIGHT_BLUE_CONCRETE_FENCE, Ingredient.of(Blocks.CONCRETE.lightBlue()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.lightBlue()), has(Blocks.CONCRETE.lightBlue()))
                        .group("building")
                        .save(output, "light_blue_concrete_fence_from_light_blue_concrete");

                fenceGateBuilder(ModBlocks.LIGHT_BLUE_CONCRETE_FENCE_GATE, Ingredient.of(Blocks.CONCRETE.lightBlue()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.lightBlue()), has(Blocks.CONCRETE.lightBlue()))
                        .group("building")
                        .save(output, "light_blue_concrete_fence_gate_from_light_blue_concrete");

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_CONCRETE_WALL, Blocks.CONCRETE.lightBlue());

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CONCRETE_SLAB, Ingredient.of(Blocks.CONCRETE.blue()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.blue()), has(Blocks.CONCRETE.blue()))
                        .group("building")
                        .save(output, "blue_concrete_slab_from_blue_concrete");

                stairBuilder(ModBlocks.BLUE_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.blue()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.blue()), has(Blocks.CONCRETE.blue()))
                        .group("building")
                        .save(output, "blue_concrete_stairs_from_blue_concrete");

                fenceBuilder(ModBlocks.BLUE_CONCRETE_FENCE, Ingredient.of(Blocks.CONCRETE.blue()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.blue()), has(Blocks.CONCRETE.blue()))
                        .group("building")
                        .save(output, "blue_concrete_fence_from_blue_concrete");

                fenceGateBuilder(ModBlocks.BLUE_CONCRETE_FENCE_GATE, Ingredient.of(Blocks.CONCRETE.blue()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.blue()), has(Blocks.CONCRETE.blue()))
                        .group("building")
                        .save(output, "blue_concrete_fence_gate_from_blue_concrete");

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CONCRETE_WALL, Blocks.CONCRETE.blue());

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CONCRETE_SLAB, Ingredient.of(Blocks.CONCRETE.purple()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.purple()), has(Blocks.CONCRETE.purple()))
                        .group("building")
                        .save(output, "purple_concrete_slab_from_purple_concrete");

                stairBuilder(ModBlocks.PURPLE_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.purple()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.purple()), has(Blocks.CONCRETE.purple()))
                        .group("building")
                        .save(output, "purple_concrete_stairs_from_purple_concrete");

                fenceBuilder(ModBlocks.PURPLE_CONCRETE_FENCE, Ingredient.of(Blocks.CONCRETE.purple()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.purple()), has(Blocks.CONCRETE.purple()))
                        .group("building")
                        .save(output, "purple_concrete_fence_from_purple_concrete");

                fenceGateBuilder(ModBlocks.PURPLE_CONCRETE_FENCE_GATE, Ingredient.of(Blocks.CONCRETE.purple()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.purple()), has(Blocks.CONCRETE.purple()))
                        .group("building")
                        .save(output, "purple_concrete_fence_gate_from_purple_concrete");

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CONCRETE_WALL, Blocks.CONCRETE.purple());

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_CONCRETE_SLAB, Ingredient.of(Blocks.CONCRETE.magenta()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.magenta()), has(Blocks.CONCRETE.magenta()))
                        .group("building")
                        .save(output, "magenta_concrete_slab_from_magenta_concrete");

                stairBuilder(ModBlocks.MAGENTA_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.magenta()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.magenta()), has(Blocks.CONCRETE.magenta()))
                        .group("building")
                        .save(output, "magenta_concrete_stairs_from_magenta_concrete");

                fenceBuilder(ModBlocks.MAGENTA_CONCRETE_FENCE, Ingredient.of(Blocks.CONCRETE.magenta()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.magenta()), has(Blocks.CONCRETE.magenta()))
                        .group("building")
                        .save(output, "magenta_concrete_fence_from_magenta_concrete");

                fenceGateBuilder(ModBlocks.MAGENTA_CONCRETE_FENCE_GATE, Ingredient.of(Blocks.CONCRETE.magenta()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.magenta()), has(Blocks.CONCRETE.magenta()))
                        .group("building")
                        .save(output, "magenta_concrete_fence_gate_from_magenta_concrete");

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_CONCRETE_WALL, Blocks.CONCRETE.magenta());

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CONCRETE_SLAB, Ingredient.of(Blocks.CONCRETE.pink()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.pink()), has(Blocks.CONCRETE.pink()))
                        .group("building")
                        .save(output, "pink_concrete_slab_from_pink_concrete");

                stairBuilder(ModBlocks.PINK_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.pink()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.pink()), has(Blocks.CONCRETE.pink()))
                        .group("building")
                        .save(output, "pink_concrete_stairs_from_pink_concrete");

                fenceBuilder(ModBlocks.PINK_CONCRETE_FENCE, Ingredient.of(Blocks.CONCRETE.pink()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.pink()), has(Blocks.CONCRETE.pink()))
                        .group("building")
                        .save(output, "pink_concrete_fence_from_pink_concrete");

                fenceGateBuilder(ModBlocks.PINK_CONCRETE_FENCE_GATE, Ingredient.of(Blocks.CONCRETE.pink()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.pink()), has(Blocks.CONCRETE.pink()))
                        .group("building")
                        .save(output, "pink_concrete_fence_gate_from_pink_concrete");

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CONCRETE_WALL, Blocks.CONCRETE.pink());

            }
        };
    }

    @Override
    public String getName() {
        return "MinecraftFriendly Recipes";
    }
}
