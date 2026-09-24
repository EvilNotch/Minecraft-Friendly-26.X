package net.evilnotch.minecraftfriendly.datagen;

import net.evilnotch.minecraftfriendly.block.ModBlocks;
import net.evilnotch.minecraftfriendly.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;

import java.awt.*;
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

                shaped(RecipeCategory.COMBAT, Items.CHAINMAIL_HELMET)
                        .pattern("i#i")
                        .pattern("# #")
                        .define('#', Items.IRON_CHAIN)
                        .define('i', Items.IRON_NUGGET)
                        .unlockedBy(getHasName(Items.IRON_CHAIN), has(Items.IRON_CHAIN))
                        .unlockedBy(getHasName(Items.IRON_NUGGET), has(Items.IRON_NUGGET))
                        .group("combat")
                        .save(output, "chainmail_helmet_fix");

                shaped(RecipeCategory.COMBAT, Items.CHAINMAIL_CHESTPLATE)
                        .pattern("#i#")
                        .pattern("###")
                        .pattern("###")
                        .define('#', Items.IRON_CHAIN)
                        .define('i', Items.IRON_NUGGET)
                        .unlockedBy(getHasName(Items.IRON_CHAIN), has(Items.IRON_CHAIN))
                        .unlockedBy(getHasName(Items.IRON_NUGGET), has(Items.IRON_NUGGET))
                        .group("combat")
                        .save(output, "chainmail_chestplate_fix");

                shaped(RecipeCategory.COMBAT, Items.CHAINMAIL_LEGGINGS)
                        .pattern("###")
                        .pattern("#i#")
                        .pattern("# #")
                        .define('#', Items.IRON_CHAIN)
                        .define('i', Items.IRON_NUGGET)
                        .unlockedBy(getHasName(Items.IRON_CHAIN), has(Items.IRON_CHAIN))
                        .unlockedBy(getHasName(Items.IRON_NUGGET), has(Items.IRON_NUGGET))
                        .group("combat")
                        .save(output, "chainmail_leggings_fix");

                shaped(RecipeCategory.COMBAT, Items.CHAINMAIL_BOOTS)
                        .pattern("#i#")
                        .pattern("#i#")
                        .define('#', Items.IRON_CHAIN)
                        .define('i', Items.IRON_NUGGET)
                        .unlockedBy(getHasName(Items.IRON_CHAIN), has(Items.IRON_CHAIN))
                        .unlockedBy(getHasName(Items.IRON_NUGGET), has(Items.IRON_NUGGET))
                        .group("combat")
                        .save(output, "chainmail_boots_fix");

                shaped(RecipeCategory.FOOD, Items.ENCHANTED_BOOK)
                        .pattern("###")
                        .pattern("#A#")
                        .pattern("###")
                        .define('#', Blocks.GOLD_BLOCK)
                        .define('A', Items.GOLDEN_APPLE)
                        .unlockedBy(getHasName(Items.GOLDEN_APPLE), has(Items.GOLDEN_APPLE))
                        .unlockedBy(getHasName(Blocks.GOLD_BLOCK), has(Blocks.GOLD_BLOCK))
                        .group("food")
                        .save(output, "notch_apple_from_golden_apple");

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

                shapeless(RecipeCategory.MISC, Items.STRING, 2)
                        .requires(Blocks.COBWEB)
                        .unlockedBy(getHasName(Blocks.COBWEB), has(Blocks.COBWEB))
                        .group("misc")
                        .save(output, "string_from_cobweb");

                shapeless(RecipeCategory.MISC, Blocks.BARRIER, 9)
                        .requires(Blocks.STRUCTURE_VOID)
                        .unlockedBy(getHasName(Blocks.STRUCTURE_VOID), has(Blocks.STRUCTURE_VOID))
                        .group("testing")
                        .save(output, "barrier_blocks_from_structure_void");

                shapeless(RecipeCategory.MISC, Items.AMETHYST_SHARD, 4)
                        .requires(Blocks.AMETHYST_BLOCK)
                        .unlockedBy(getHasName(Blocks.AMETHYST_BLOCK), has(Blocks.AMETHYST_BLOCK))
                        .save(output, "amethyst_shards_from_amethyst_block");

                shapeless(RecipeCategory.MISC, Items.DYE.pink(), 1)
                        .requires(ModBlocks.PINK_DAISY)
                        .unlockedBy(getHasName(ModBlocks.PINK_DAISY), has(ModBlocks.PINK_DAISY))
                        .group("building")
                        .save(output, "pink_dye_from_pink_daisy");

                shapeless(RecipeCategory.MISC, Items.DYE.yellow(), 1)
                        .requires(ModBlocks.BUTTERCUP)
                        .unlockedBy(getHasName(ModBlocks.BUTTERCUP), has(ModBlocks.BUTTERCUP))
                        .group("building")
                        .save(output, "yellow_dye_from_buttercup");

                shaped(RecipeCategory.MISC, Blocks.ROSE_BUSH)
                        .pattern("   ")
                        .pattern(" RR")
                        .pattern(" RR")
                        .define('R', ModBlocks.ROSE)
                        .unlockedBy(getHasName(ModBlocks.ROSE), has(ModBlocks.ROSE))
                        .group("building")
                        .save(output, "rose_bush_from_rose_bouquet");

                shapeless(RecipeCategory.MISC, Items.DYE.red(), 1)
                        .requires(ModBlocks.ROSE)
                        .unlockedBy(getHasName(ModBlocks.ROSE), has(ModBlocks.ROSE))
                        .group("building")
                        .save(output, "red_dye_from_rose");

                shaped(RecipeCategory.MISC, Blocks.PEONY)
                        .pattern("   ")
                        .pattern(" PP")
                        .pattern(" PP")
                        .define('P', ModBlocks.PAEONIA)
                        .unlockedBy(getHasName(ModBlocks.PAEONIA), has(ModBlocks.PAEONIA))
                        .group("building")
                        .save(output, "peony_from_paeonia_bouquet");

                shapeless(RecipeCategory.MISC, Items.DYE.pink(), 1)
                        .requires(ModBlocks.PAEONIA)
                        .unlockedBy(getHasName(ModBlocks.PAEONIA), has(ModBlocks.PAEONIA))
                        .group("building")
                        .save(output, "pink_dye_from_paeonia");

                shapeless(RecipeCategory.MISC, Items.DYE.white(), 1)
                        .requires(Items.WHITE_TULIP)
                        .group("white_dye_from_white_tulip")
                        .unlockedBy(getHasName(Items.WHITE_TULIP), has(Items.WHITE_TULIP))
                        .save(output, "white_dye_from_white_tulip");

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIRT_SLAB, Ingredient.of(Blocks.DIRT))
                        .unlockedBy(getHasName(Blocks.DIRT), has(Blocks.DIRT))
                        .group("building")
                        .save(output, "dirt_slab_from_dirt_block");

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



                shaped(RecipeCategory.MISC, ModBlocks.NETHER_BRICK_FENCE_GATE)
                        .pattern("   ")
                        .pattern("BNB")
                        .pattern("BNB")
                        .define('B', Items.NETHER_BRICK)
                        .define('N', Blocks.NETHER_BRICKS)
                        .unlockedBy(getHasName(Blocks.NETHER_BRICKS), has(Blocks.NETHER_BRICKS))
                        .group("building")
                        .save(output, "nether_fence_gate_from_nether_bricks_and_nether_brick_blocks");

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.NETHER_BRICK_FENCE, Blocks.NETHER_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHER_BRICK_FENCE_GATE, Blocks.NETHER_BRICKS);

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_NETHER_BRICK_SLAB, Ingredient.of(Blocks.CRACKED_NETHER_BRICKS))
                        .unlockedBy(getHasName(Blocks.CRACKED_NETHER_BRICKS), has(Blocks.CRACKED_NETHER_BRICKS))
                        .group("building")
                        .save(output, "cracked_nether_brick_slab_from_cracked_nether_bricks");

                smeltingResultFromBase(ModBlocks.CRACKED_NETHER_BRICK_SLAB, Blocks.NETHER_BRICK_SLAB);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_NETHER_BRICK_STAIRS, Blocks.CRACKED_NETHER_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_NETHER_BRICK_STAIRS, Blocks.NETHER_BRICK_STAIRS);

                smeltingResultFromBase(ModBlocks.CRACKED_NETHER_BRICK_STAIRS, Blocks.NETHER_BRICK_STAIRS);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_NETHER_BRICK_SLAB, Blocks.CRACKED_NETHER_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_NETHER_BRICK_SLAB, Blocks.NETHER_BRICK_SLAB);

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUBY_BLOCK)
                        .pattern("RRR")
                        .pattern("RRR")
                        .pattern("RRR")
                        .define('R', ModItems.RUBY)
                        .unlockedBy(getHasName(ModItems.RUBY), has(ModItems.RUBY))
                        .group("building")
                        .save(output, "ruby_block_from_rupies");

                shapeless(RecipeCategory.MISC, ModItems.RUBY, 9)
                        .requires(ModBlocks.RUBY_BLOCK)
                        .unlockedBy(getHasName(ModBlocks.RUBY_BLOCK), has(ModBlocks.RUBY_BLOCK))
                        .group("ingredients")
                        .save(output, "rupies_from_ruby_block");

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SAPPHIRE_BLOCK)
                        .pattern(" SS")
                        .pattern(" SS")
                        .define('S', ModBlocks.SAPPHIRE_CLUSTER)
                        .unlockedBy(getHasName(ModBlocks.SAPPHIRE_CLUSTER), has(ModBlocks.SAPPHIRE_CLUSTER))
                        .group("building")
                        .save(output, "sapphire_block_from_tears_of_the_fallen");

                shapeless(RecipeCategory.MISC, ModBlocks.SAPPHIRE_CLUSTER, 4)
                        .requires(ModBlocks.SAPPHIRE_BLOCK)
                        .unlockedBy(getHasName(ModBlocks.SAPPHIRE_BLOCK), has(ModBlocks.SAPPHIRE_BLOCK))
                        .group("ingredients")
                        .save(output, "tears_of_the_fallen_from_sapphire_block");

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAVEL_LAYER_BLOCK, Ingredient.of(Blocks.GRAVEL))
                        .unlockedBy(getHasName(Blocks.GRAVEL), has(Blocks.GRAVEL))
                        .group("building")
                        .save(output, "layered_gravel_from_gravel_block");

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SAND_LAYER_BLOCK, Ingredient.of(Blocks.SAND))
                        .unlockedBy(getHasName(Blocks.SAND), has(Blocks.SAND))
                        .group("building")
                        .save(output, "layered_sand_from_sand_block");

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SAND_LAYER_BLOCK, Ingredient.of(Blocks.RED_SAND))
                        .unlockedBy(getHasName(Blocks.RED_SAND), has(Blocks.RED_SAND))
                        .group("building")
                        .save(output, "layered_red_sand_from_red_sand_block");

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SOUL_SAND_LAYER_BLOCK, Ingredient.of(Blocks.SOUL_SAND))
                        .unlockedBy(getHasName(Blocks.SOUL_SAND), has(Blocks.SOUL_SAND))
                        .group("building")
                        .save(output, "layered_soul_sand_from_soul_sand_block");

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SOUL_SAND_LAYER_BLOCK, Blocks.SOUL_SAND, 6);

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SOUL_SOIL_LAYER_BLOCK, Ingredient.of(Blocks.SOUL_SOIL))
                        .unlockedBy(getHasName(Blocks.SOUL_SOIL), has(Blocks.SOUL_SOIL))
                        .group("building")
                        .save(output, "layered_soul_soil_from_soul_soil_block");

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SOUL_SOIL_LAYER_BLOCK, Blocks.SOUL_SOIL, 6);

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TUBE_CORAL_SLAB, Ingredient.of(Blocks.TUBE_CORAL))
                        .unlockedBy(getHasName(Blocks.TUBE_CORAL), has(Blocks.TUBE_CORAL))
                        .group("building")
                        .save(output, "tube_coral_slab_from_tube_coral_block");

                smeltingResultFromBase(ModBlocks.CRACKED_PURPUR_BLOCK, Blocks.PURPUR_BLOCK);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_PURPUR_BLOCK, Blocks.PURPUR_BLOCK);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_PURPUR_SLAB, Blocks.PURPUR_SLAB);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_PURPUR_SLAB, Blocks.PURPUR_BLOCK, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_PURPUR_SLAB, ModBlocks.CRACKED_PURPUR_BLOCK, 2);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_PURPUR_STAIRS, Blocks.PURPUR_STAIRS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_PURPUR_STAIRS, Blocks.PURPUR_BLOCK);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_PURPUR_STAIRS, ModBlocks.CRACKED_PURPUR_BLOCK);

                smeltingResultFromBase(ModBlocks.CRACKED_PURPUR_SLAB, Blocks.PURPUR_SLAB);
                smeltingResultFromBase(ModBlocks.CRACKED_PURPUR_STAIRS, Blocks.PURPUR_STAIRS);

                smeltingResultFromBase(ModItems.COOKED_CALAMARI, ModItems.RAW_CALAMARI);

                smeltingResultFromBase(Items.LEATHER, Items.ROTTEN_FLESH);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_WALL, Blocks.SMOOTH_STONE);

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DEEPSLATE_TILE_SLAB, Ingredient.of(Blocks.CRACKED_DEEPSLATE_TILES))
                        .unlockedBy(getHasName(Blocks.CRACKED_DEEPSLATE_TILES), has(Blocks.CRACKED_DEEPSLATE_TILES))
                        .group("building")
                        .save(output, "cracked_deepslate_tile_slab_from_cracked_deepslate_tiles");

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DEEPSLATE_TILE_STAIRS, Blocks.CRACKED_DEEPSLATE_TILES);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DEEPSLATE_TILE_SLAB, Blocks.CRACKED_DEEPSLATE_TILES);

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DEEPSLATE_BRICK_SLAB, Ingredient.of(Blocks.CRACKED_DEEPSLATE_BRICKS))
                        .unlockedBy(getHasName(Blocks.CRACKED_DEEPSLATE_BRICKS), has(Blocks.CRACKED_DEEPSLATE_BRICKS))
                        .group("building")
                        .save(output, "cracked_deepslate_brick_slab_from_cracked_deepslate_bricks");

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS, Blocks.CRACKED_DEEPSLATE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DEEPSLATE_BRICK_SLAB, Blocks.CRACKED_DEEPSLATE_BRICKS);

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_STONE_BRICK_SLAB, Ingredient.of(Blocks.CRACKED_STONE_BRICKS))
                        .unlockedBy(getHasName(Blocks.CRACKED_STONE_BRICKS), has(Blocks.CRACKED_STONE_BRICKS))
                        .group("building")
                        .save(output, "cracked_stone_brick_slab_from_cracked_stone_bricks");

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_STONE_BRICK_STAIRS, Blocks.CRACKED_STONE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_STONE_BRICK_SLAB, Blocks.CRACKED_STONE_BRICKS);

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB, Ingredient.of(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS))
                        .unlockedBy(getHasName(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS), has(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS))
                        .group("building")
                        .save(output, "cracked_polished_blackstone_brick_slab_from_cracked_polished_blackstone_bricks");

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PLATED_IRON, Blocks.IRON_BLOCK);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.IRON_STAIRS, Blocks.IRON_BLOCK);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.IRON_SLAB, Blocks.IRON_BLOCK, 2);

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.IRON_SLAB, Ingredient.of(Blocks.IRON_BLOCK))
                        .unlockedBy(getHasName(Blocks.IRON_BLOCK), has(Blocks.IRON_BLOCK))
                        .group("building")
                        .save(output, "iron_slab_from_iron_block");

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLD_SLAB, Ingredient.of(Blocks.GOLD_BLOCK))
                        .unlockedBy(getHasName(Blocks.GOLD_BLOCK), has(Blocks.GOLD_BLOCK))
                        .group("building")
                        .save(output, "gold_slab_from_gold_block");

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_GOLD, Blocks.GOLD_BLOCK);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLD_SLAB, Blocks.GOLD_BLOCK, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLD_STAIRS, Blocks.GOLD_BLOCK);

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.REDSTONE_SLAB, Ingredient.of(Blocks.REDSTONE_BLOCK))
                        .unlockedBy(getHasName(Blocks.REDSTONE_BLOCK), has(Blocks.REDSTONE_BLOCK))
                        .group("building")
                        .save(output, "redstone_slab_from_redstone_block");

                shapeless(RecipeCategory.MISC, Items.EMERALD, 9)
                        .requires(ModBlocks.CHISELED_EMERALD)
                        .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
                        .unlockedBy(getHasName(ModBlocks.CHISELED_EMERALD), has(ModBlocks.CHISELED_EMERALD))
                        .group("misc")
                        .save(output, "emeralds_from_chiseled_emerald_block");

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_EMERALD, Blocks.EMERALD_BLOCK);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.EMERALD_SLAB, Blocks.EMERALD_BLOCK, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.EMERALD_STAIRS, Blocks.EMERALD_BLOCK);

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

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LAPIS_SLAB, Ingredient.of(Blocks.LAPIS_BLOCK))
                        .unlockedBy(getHasName(Blocks.LAPIS_BLOCK), has(Blocks.LAPIS_BLOCK))
                        .group("building")
                        .save(output, "lapis_slab_from_lapis_block");

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_LAPIS, Blocks.LAPIS_BLOCK);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LAPIS_SLAB, Blocks.LAPIS_BLOCK, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LAPIS_STAIRS, Blocks.LAPIS_BLOCK);

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIAMOND_SLAB, Ingredient.of(Blocks.DIAMOND_BLOCK))
                        .unlockedBy(getHasName(Blocks.DIAMOND_BLOCK), has(Blocks.DIAMOND_BLOCK))
                        .group("building")
                        .save(output, "diamond_slab_from_diamond_block");

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DIAMOND, Blocks.DIAMOND_BLOCK);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIAMOND_SLAB, Blocks.DIAMOND_BLOCK, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIAMOND_STAIRS, Blocks.DIAMOND_BLOCK);

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CONCRETE_SLAB, Ingredient.of(Blocks.CONCRETE.white()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.white()), has(Blocks.CONCRETE.white()))
                        .group("building")
                        .save(output, "white_concrete_slab_from_white_concrete");

                fenceBuilder(ModBlocks.WHITE_CONCRETE_FENCE, Ingredient.of(Blocks.CONCRETE.white()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.white()), has(Blocks.CONCRETE.white()))
                        .group("building")
                        .save(output, "white_concrete_fence_from_white_concrete");

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CONCRETE_FENCE, Blocks.CONCRETE.white());

                fenceGateBuilder(ModBlocks.WHITE_CONCRETE_FENCE_GATE, Ingredient.of(Blocks.CONCRETE.white()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.white()), has(Blocks.CONCRETE.white()))
                        .group("building")
                        .save(output, "white_concrete_fence_gate_from_white_concrete");

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CONCRETE_FENCE_GATE, Blocks.CONCRETE.white());

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CONCRETE_WALL, Blocks.CONCRETE.white());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CONCRETE_WALL, Blocks.CONCRETE.white());

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_CONCRETE_SLAB, Ingredient.of(Blocks.CONCRETE.lightGray()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.lightGray()), has(Blocks.CONCRETE.lightGray()))
                        .group("building")
                        .save(output, "light_gray_concrete_slab_from_light_gray_concrete");

                fenceBuilder(ModBlocks.LIGHT_GRAY_CONCRETE_FENCE, Ingredient.of(Blocks.CONCRETE.lightGray()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.lightGray()), has(Blocks.CONCRETE.lightGray()))
                        .group("building")
                        .save(output, "light_gray_concrete_fence_from_light_gray_concrete");

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_CONCRETE_FENCE, Blocks.CONCRETE.lightGray());

                fenceGateBuilder(ModBlocks.LIGHT_GRAY_CONCRETE_FENCE_GATE, Ingredient.of(Blocks.CONCRETE.lightGray()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.lightGray()), has(Blocks.CONCRETE.lightGray()))
                        .group("building")
                        .save(output, "light_gray_concrete_fence_gate_from_light_gray_concrete");

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_CONCRETE_FENCE_GATE, Blocks.CONCRETE.lightGray());

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_CONCRETE_WALL, Blocks.CONCRETE.lightGray());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_CONCRETE_WALL, Blocks.CONCRETE.lightGray());

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_CONCRETE_SLAB, Ingredient.of(Blocks.CONCRETE.gray()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.gray()), has(Blocks.CONCRETE.gray()))
                        .group("building")
                        .save(output, "gray_concrete_slab_from_gray_concrete");

                fenceBuilder(ModBlocks.GRAY_CONCRETE_FENCE, Ingredient.of(Blocks.CONCRETE.gray()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.gray()), has(Blocks.CONCRETE.gray()))
                        .group("building")
                        .save(output, "gray_concrete_fence_from_gray_concrete");

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_CONCRETE_FENCE, Blocks.CONCRETE.gray());

                fenceGateBuilder(ModBlocks.GRAY_CONCRETE_FENCE_GATE, Ingredient.of(Blocks.CONCRETE.gray()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.gray()), has(Blocks.CONCRETE.gray()))
                        .group("building")
                        .save(output, "gray_concrete_fence_gate_from_gray_concrete");

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_CONCRETE_FENCE_GATE, Blocks.CONCRETE.gray());

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_CONCRETE_WALL, Blocks.CONCRETE.gray());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_CONCRETE_WALL, Blocks.CONCRETE.gray());

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CONCRETE_SLAB, Ingredient.of(Blocks.CONCRETE.black()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.black()), has(Blocks.CONCRETE.black()))
                        .group("building")
                        .save(output, "black_concrete_slab_from_black_concrete");

                fenceBuilder(ModBlocks.BLACK_CONCRETE_FENCE, Ingredient.of(Blocks.CONCRETE.black()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.black()), has(Blocks.CONCRETE.black()))
                        .group("building")
                        .save(output, "black_concrete_fence_from_black_concrete");

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CONCRETE_FENCE, Blocks.CONCRETE.black());

                fenceGateBuilder(ModBlocks.BLACK_CONCRETE_FENCE_GATE, Ingredient.of(Blocks.CONCRETE.black()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.black()), has(Blocks.CONCRETE.black()))
                        .group("building")
                        .save(output, "black_concrete_fence_gate_from_black_concrete");

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CONCRETE_FENCE_GATE, Blocks.CONCRETE.black());

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CONCRETE_WALL, Blocks.CONCRETE.black());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CONCRETE_WALL, Blocks.CONCRETE.black());

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_CONCRETE_SLAB, Ingredient.of(Blocks.CONCRETE.brown()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.brown()), has(Blocks.CONCRETE.brown()))
                        .group("building")
                        .save(output, "brown_concrete_slab_from_brown_concrete");

                fenceBuilder(ModBlocks.BROWN_CONCRETE_FENCE, Ingredient.of(Blocks.CONCRETE.brown()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.brown()), has(Blocks.CONCRETE.brown()))
                        .group("building")
                        .save(output, "brown_concrete_fence_from_brown_concrete");

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_CONCRETE_FENCE, Blocks.CONCRETE.brown());

                fenceGateBuilder(ModBlocks.BROWN_CONCRETE_FENCE_GATE, Ingredient.of(Blocks.CONCRETE.brown()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.brown()), has(Blocks.CONCRETE.brown()))
                        .group("building")
                        .save(output, "brown_concrete_fence_gate_from_brown_concrete");

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_CONCRETE_FENCE_GATE, Blocks.CONCRETE.brown());

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_CONCRETE_WALL, Blocks.CONCRETE.brown());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_CONCRETE_WALL, Blocks.CONCRETE.brown());

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CONCRETE_SLAB, Ingredient.of(Blocks.CONCRETE.red()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.red()), has(Blocks.CONCRETE.red()))
                        .group("building")
                        .save(output, "red_concrete_slab_from_red_concrete");

                fenceBuilder(ModBlocks.RED_CONCRETE_FENCE, Ingredient.of(Blocks.CONCRETE.red()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.red()), has(Blocks.CONCRETE.red()))
                        .group("building")
                        .save(output, "red_concrete_fence_from_red_concrete");

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CONCRETE_FENCE, Blocks.CONCRETE.red());

                fenceGateBuilder(ModBlocks.RED_CONCRETE_FENCE_GATE, Ingredient.of(Blocks.CONCRETE.red()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.red()), has(Blocks.CONCRETE.red()))
                        .group("building")
                        .save(output, "red_concrete_fence_gate_from_red_concrete");

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CONCRETE_FENCE_GATE, Blocks.CONCRETE.red());

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CONCRETE_WALL, Blocks.CONCRETE.red());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CONCRETE_WALL, Blocks.CONCRETE.red());

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CONCRETE_SLAB, Ingredient.of(Blocks.CONCRETE.orange()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.orange()), has(Blocks.CONCRETE.orange()))
                        .group("building")
                        .save(output, "orange_concrete_slab_from_orange_concrete");

                fenceBuilder(ModBlocks.ORANGE_CONCRETE_FENCE, Ingredient.of(Blocks.CONCRETE.orange()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.orange()), has(Blocks.CONCRETE.orange()))
                        .group("building")
                        .save(output, "orange_concrete_fence_from_orange_concrete");

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CONCRETE_FENCE, Blocks.CONCRETE.orange());

                fenceGateBuilder(ModBlocks.ORANGE_CONCRETE_FENCE_GATE, Ingredient.of(Blocks.CONCRETE.orange()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.orange()), has(Blocks.CONCRETE.orange()))
                        .group("building")
                        .save(output, "orange_concrete_fence_gate_from_orange_concrete");

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CONCRETE_FENCE_GATE, Blocks.CONCRETE.orange());

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CONCRETE_WALL, Blocks.CONCRETE.orange());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CONCRETE_WALL, Blocks.CONCRETE.orange());

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CONCRETE_SLAB, Ingredient.of(Blocks.CONCRETE.yellow()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.yellow()), has(Blocks.CONCRETE.yellow()))
                        .group("building")
                        .save(output, "yellow_concrete_slab_from_yellow_concrete");

                fenceBuilder(ModBlocks.YELLOW_CONCRETE_FENCE, Ingredient.of(Blocks.CONCRETE.yellow()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.yellow()), has(Blocks.CONCRETE.yellow()))
                        .group("building")
                        .save(output, "yellow_concrete_fence_from_yellow_concrete");

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CONCRETE_FENCE, Blocks.CONCRETE.yellow());

                fenceGateBuilder(ModBlocks.YELLOW_CONCRETE_FENCE_GATE, Ingredient.of(Blocks.CONCRETE.yellow()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.yellow()), has(Blocks.CONCRETE.yellow()))
                        .group("building")
                        .save(output, "yellow_concrete_fence_gate_from_yellow_concrete");

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CONCRETE_FENCE_GATE, Blocks.CONCRETE.yellow());

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CONCRETE_WALL, Blocks.CONCRETE.yellow());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CONCRETE_WALL, Blocks.CONCRETE.yellow());

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_CONCRETE_SLAB, Ingredient.of(Blocks.CONCRETE.lime()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.lime()), has(Blocks.CONCRETE.lime()))
                        .group("building")
                        .save(output, "lime_concrete_slab_from_lime_concrete");

                fenceBuilder(ModBlocks.LIME_CONCRETE_FENCE, Ingredient.of(Blocks.CONCRETE.lime()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.lime()), has(Blocks.CONCRETE.lime()))
                        .group("building")
                        .save(output, "lime_concrete_fence_from_lime_concrete");

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_CONCRETE_FENCE, Blocks.CONCRETE.lime());

                fenceGateBuilder(ModBlocks.LIME_CONCRETE_FENCE_GATE, Ingredient.of(Blocks.CONCRETE.lime()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.lime()), has(Blocks.CONCRETE.lime()))
                        .group("building")
                        .save(output, "lime_concrete_fence_gate_from_lime_concrete");

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_CONCRETE_FENCE_GATE, Blocks.CONCRETE.lime());

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_CONCRETE_WALL, Blocks.CONCRETE.lime());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_CONCRETE_WALL, Blocks.CONCRETE.lime());

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CONCRETE_SLAB, Ingredient.of(Blocks.CONCRETE.green()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.green()), has(Blocks.CONCRETE.green()))
                        .group("building")
                        .save(output, "green_concrete_slab_from_green_concrete");

                fenceBuilder(ModBlocks.GREEN_CONCRETE_FENCE, Ingredient.of(Blocks.CONCRETE.green()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.green()), has(Blocks.CONCRETE.green()))
                        .group("building")
                        .save(output, "green_concrete_fence_from_green_concrete");

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CONCRETE_FENCE, Blocks.CONCRETE.green());

                fenceGateBuilder(ModBlocks.GREEN_CONCRETE_FENCE_GATE, Ingredient.of(Blocks.CONCRETE.green()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.green()), has(Blocks.CONCRETE.green()))
                        .group("building")
                        .save(output, "green_concrete_fence_gate_from_green_concrete");

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CONCRETE_FENCE_GATE, Blocks.CONCRETE.green());

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CONCRETE_WALL, Blocks.CONCRETE.green());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CONCRETE_WALL, Blocks.CONCRETE.green());

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_CONCRETE_SLAB, Ingredient.of(Blocks.CONCRETE.cyan()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.cyan()), has(Blocks.CONCRETE.cyan()))
                        .group("building")
                        .save(output, "cyan_concrete_slab_from_cyan_concrete");

                fenceBuilder(ModBlocks.CYAN_CONCRETE_FENCE, Ingredient.of(Blocks.CONCRETE.cyan()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.cyan()), has(Blocks.CONCRETE.cyan()))
                        .group("building")
                        .save(output, "cyan_concrete_fence_from_cyan_concrete");

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_CONCRETE_FENCE, Blocks.CONCRETE.cyan());

                fenceGateBuilder(ModBlocks.CYAN_CONCRETE_FENCE_GATE, Ingredient.of(Blocks.CONCRETE.cyan()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.cyan()), has(Blocks.CONCRETE.cyan()))
                        .group("building")
                        .save(output, "cyan_concrete_fence_gate_from_cyan_concrete");

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_CONCRETE_FENCE_GATE, Blocks.CONCRETE.cyan());

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_CONCRETE_WALL, Blocks.CONCRETE.cyan());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_CONCRETE_WALL, Blocks.CONCRETE.cyan());

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_CONCRETE_SLAB, Ingredient.of(Blocks.CONCRETE.lightBlue()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.lightBlue()), has(Blocks.CONCRETE.lightBlue()))
                        .group("building")
                        .save(output, "light_blue_concrete_slab_from_light_blue_concrete");

                fenceBuilder(ModBlocks.LIGHT_BLUE_CONCRETE_FENCE, Ingredient.of(Blocks.CONCRETE.lightBlue()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.lightBlue()), has(Blocks.CONCRETE.lightBlue()))
                        .group("building")
                        .save(output, "light_blue_concrete_fence_from_light_blue_concrete");

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_CONCRETE_FENCE, Blocks.CONCRETE.lightBlue());

                fenceGateBuilder(ModBlocks.LIGHT_BLUE_CONCRETE_FENCE_GATE, Ingredient.of(Blocks.CONCRETE.lightBlue()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.lightBlue()), has(Blocks.CONCRETE.lightBlue()))
                        .group("building")
                        .save(output, "light_blue_concrete_fence_gate_from_light_blue_concrete");

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_CONCRETE_FENCE_GATE, Blocks.CONCRETE.lightBlue());

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_CONCRETE_WALL, Blocks.CONCRETE.lightBlue());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_CONCRETE_WALL, Blocks.CONCRETE.lightBlue());

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CONCRETE_SLAB, Ingredient.of(Blocks.CONCRETE.blue()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.blue()), has(Blocks.CONCRETE.blue()))
                        .group("building")
                        .save(output, "blue_concrete_slab_from_blue_concrete");

                fenceBuilder(ModBlocks.BLUE_CONCRETE_FENCE, Ingredient.of(Blocks.CONCRETE.blue()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.blue()), has(Blocks.CONCRETE.blue()))
                        .group("building")
                        .save(output, "blue_concrete_fence_from_blue_concrete");

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CONCRETE_FENCE, Blocks.CONCRETE.blue());

                fenceGateBuilder(ModBlocks.BLUE_CONCRETE_FENCE_GATE, Ingredient.of(Blocks.CONCRETE.blue()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.blue()), has(Blocks.CONCRETE.blue()))
                        .group("building")
                        .save(output, "blue_concrete_fence_gate_from_blue_concrete");

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CONCRETE_FENCE_GATE, Blocks.CONCRETE.blue());

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CONCRETE_WALL, Blocks.CONCRETE.blue());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CONCRETE_WALL, Blocks.CONCRETE.blue());

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CONCRETE_SLAB, Ingredient.of(Blocks.CONCRETE.purple()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.purple()), has(Blocks.CONCRETE.purple()))
                        .group("building")
                        .save(output, "purple_concrete_slab_from_purple_concrete");

                fenceBuilder(ModBlocks.PURPLE_CONCRETE_FENCE, Ingredient.of(Blocks.CONCRETE.purple()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.purple()), has(Blocks.CONCRETE.purple()))
                        .group("building")
                        .save(output, "purple_concrete_fence_from_purple_concrete");

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CONCRETE_FENCE, Blocks.CONCRETE.purple());

                fenceGateBuilder(ModBlocks.PURPLE_CONCRETE_FENCE_GATE, Ingredient.of(Blocks.CONCRETE.purple()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.purple()), has(Blocks.CONCRETE.purple()))
                        .group("building")
                        .save(output, "purple_concrete_fence_gate_from_purple_concrete");

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CONCRETE_FENCE_GATE, Blocks.CONCRETE.purple());

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CONCRETE_WALL, Blocks.CONCRETE.purple());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CONCRETE_WALL, Blocks.CONCRETE.purple());

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_CONCRETE_SLAB, Ingredient.of(Blocks.CONCRETE.magenta()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.magenta()), has(Blocks.CONCRETE.magenta()))
                        .group("building")
                        .save(output, "magenta_concrete_slab_from_magenta_concrete");

                fenceBuilder(ModBlocks.MAGENTA_CONCRETE_FENCE, Ingredient.of(Blocks.CONCRETE.magenta()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.magenta()), has(Blocks.CONCRETE.magenta()))
                        .group("building")
                        .save(output, "magenta_concrete_fence_from_magenta_concrete");

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_CONCRETE_FENCE, Blocks.CONCRETE.magenta());

                fenceGateBuilder(ModBlocks.MAGENTA_CONCRETE_FENCE_GATE, Ingredient.of(Blocks.CONCRETE.magenta()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.magenta()), has(Blocks.CONCRETE.magenta()))
                        .group("building")
                        .save(output, "magenta_concrete_fence_gate_from_magenta_concrete");

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_CONCRETE_FENCE_GATE, Blocks.CONCRETE.magenta());

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_CONCRETE_WALL, Blocks.CONCRETE.magenta());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_CONCRETE_WALL, Blocks.CONCRETE.magenta());

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CONCRETE_SLAB, Ingredient.of(Blocks.CONCRETE.pink()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.pink()), has(Blocks.CONCRETE.pink()))
                        .group("building")
                        .save(output, "pink_concrete_slab_from_pink_concrete");

                fenceBuilder(ModBlocks.PINK_CONCRETE_FENCE, Ingredient.of(Blocks.CONCRETE.pink()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.pink()), has(Blocks.CONCRETE.pink()))
                        .group("building")
                        .save(output, "pink_concrete_fence_from_pink_concrete");

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CONCRETE_FENCE, Blocks.CONCRETE.pink());

                fenceGateBuilder(ModBlocks.PINK_CONCRETE_FENCE_GATE, Ingredient.of(Blocks.CONCRETE.pink()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.pink()), has(Blocks.CONCRETE.pink()))
                        .group("building")
                        .save(output, "pink_concrete_fence_gate_from_pink_concrete");

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CONCRETE_FENCE_GATE, Blocks.CONCRETE.pink());

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CONCRETE_WALL, Blocks.CONCRETE.pink());

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CONCRETE_STAIRS, Blocks.CONCRETE.pink());

                shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAINBOW_WOOL, 6)
                        .requires(Blocks.WOOL.red())
                        .requires(Blocks.WOOL.orange())
                        .requires(Blocks.WOOL.yellow())
                        .requires(Blocks.WOOL.lime())
                        .requires(Blocks.WOOL.blue())
                        .requires(Blocks.WOOL.purple())
                        .unlockedBy(getHasName(Blocks.WOOL.red()), has(Blocks.WOOL.red()))
                        .unlockedBy(getHasName(Blocks.WOOL.orange()), has(Blocks.WOOL.orange()))
                        .unlockedBy(getHasName(Blocks.WOOL.yellow()), has(Blocks.WOOL.yellow()))
                        .unlockedBy(getHasName(Blocks.WOOL.lime()), has(Blocks.WOOL.lime()))
                        .unlockedBy(getHasName(Blocks.WOOL.blue()), has(Blocks.WOOL.blue()))
                        .unlockedBy(getHasName(Blocks.WOOL.purple()), has(Blocks.WOOL.purple()))
                        .group("building")
                        .save(output, "rainbow_wool_recipe");

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_WOOL_SLAB, Ingredient.of(Blocks.WOOL.white()))
                        .unlockedBy(getHasName(Blocks.WOOL.white()), has(Blocks.WOOL.white()))
                        .group("building")
                        .save(output, "white_wool_slab_from_white_wool");

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_WOOL_SLAB, Ingredient.of(Blocks.WOOL.lightGray()))
                        .unlockedBy(getHasName(Blocks.WOOL.lightGray()), has(Blocks.WOOL.lightGray()))
                        .group("building")
                        .save(output, "light_gray_wool_slab_from_light_gray_wool");

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_WOOL_SLAB, Ingredient.of(Blocks.WOOL.gray()))
                        .unlockedBy(getHasName(Blocks.WOOL.gray()), has(Blocks.WOOL.gray()))
                        .group("building")
                        .save(output, "gray_wool_slab_from_gray_wool");

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_WOOL_SLAB, Ingredient.of(Blocks.WOOL.black()))
                        .unlockedBy(getHasName(Blocks.WOOL.black()), has(Blocks.WOOL.black()))
                        .group("building")
                        .save(output, "black_wool_slab_from_black_wool");

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_WOOL_SLAB, Ingredient.of(Blocks.WOOL.brown()))
                        .unlockedBy(getHasName(Blocks.WOOL.brown()), has(Blocks.WOOL.brown()))
                        .group("building")
                        .save(output, "brown_wool_slab_from_brown_wool");

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_WOOL_SLAB, Ingredient.of(Blocks.WOOL.red()))
                        .unlockedBy(getHasName(Blocks.WOOL.red()), has(Blocks.WOOL.red()))
                        .group("building")
                        .save(output, "red_wool_slab_from_red_wool");

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_WOOL_SLAB, Ingredient.of(Blocks.WOOL.orange()))
                        .unlockedBy(getHasName(Blocks.WOOL.orange()), has(Blocks.WOOL.orange()))
                        .group("building")
                        .save(output, "orange_wool_slab_from_orange_wool");

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_WOOL_SLAB, Ingredient.of(Blocks.WOOL.yellow()))
                        .unlockedBy(getHasName(Blocks.WOOL.yellow()), has(Blocks.WOOL.yellow()))
                        .group("building")
                        .save(output, "yellow_wool_slab_from_yellow_wool");

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_WOOL_SLAB, Ingredient.of(Blocks.WOOL.lime()))
                        .unlockedBy(getHasName(Blocks.WOOL.lime()), has(Blocks.WOOL.lime()))
                        .group("building")
                        .save(output, "lime_wool_slab_from_lime_wool");

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_WOOL_SLAB, Ingredient.of(Blocks.WOOL.green()))
                        .unlockedBy(getHasName(Blocks.WOOL.green()), has(Blocks.WOOL.green()))
                        .group("building")
                        .save(output, "green_wool_slab_from_green_wool");

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_WOOL_SLAB, Ingredient.of(Blocks.WOOL.cyan()))
                        .unlockedBy(getHasName(Blocks.WOOL.cyan()), has(Blocks.WOOL.cyan()))
                        .group("building")
                        .save(output, "cyan_wool_slab_from_cyan_wool");

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_WOOL_SLAB, Ingredient.of(Blocks.WOOL.lightBlue()))
                        .unlockedBy(getHasName(Blocks.WOOL.lightBlue()), has(Blocks.WOOL.lightBlue()))
                        .group("building")
                        .save(output, "light_blue_wool_slab_from_light_blue_wool");

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_WOOL_SLAB, Ingredient.of(Blocks.WOOL.blue()))
                        .unlockedBy(getHasName(Blocks.WOOL.blue()), has(Blocks.WOOL.blue()))
                        .group("building")
                        .save(output, "blue_wool_slab_from_blue_wool");

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_WOOL_SLAB, Ingredient.of(Blocks.WOOL.purple()))
                        .unlockedBy(getHasName(Blocks.WOOL.purple()), has(Blocks.WOOL.purple()))
                        .group("building")
                        .save(output, "purple_wool_slab_from_purple_wool");

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_WOOL_SLAB, Ingredient.of(Blocks.WOOL.magenta()))
                        .unlockedBy(getHasName(Blocks.WOOL.magenta()), has(Blocks.WOOL.magenta()))
                        .group("building")
                        .save(output, "magenta_wool_slab_from_magenta_wool");

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_WOOL_SLAB, Ingredient.of(Blocks.WOOL.pink()))
                        .unlockedBy(getHasName(Blocks.WOOL.pink()), has(Blocks.WOOL.pink()))
                        .group("building")
                        .save(output, "pink_wool_slab_from_pink_wool");

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.SAND, Blocks.GRAVEL, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Items.FLINT, Blocks.GRAVEL, 2);

                shapeless(RecipeCategory.MISC, ModItems.LONGER_STRING, 1)
                        .requires(Items.STRING)
                        .requires(Items.STRING)
                        .group("ingredients")
                        .unlockedBy(getHasName(Items.STRING), has(Items.STRING))
                        .save(output, "longer_string_from_string");

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.SNOW, Blocks.SNOW_BLOCK, 6);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Items.SNOWBALL, Blocks.SNOW_BLOCK, 9);

                shapeless(RecipeCategory.MISC, Items.DYE.black(), 2)
                        .requires(Items.DYE.brown())
                        .requires(Items.DYE.blue())
                        .unlockedBy(getHasName(Items.DYE.brown()), has(Items.DYE.brown()))
                        .unlockedBy(getHasName(Items.DYE.blue()), has(Items.DYE.blue()))
                        .save(output, "black_dye_from_brown_and_blue_dye");

                shapeless(RecipeCategory.BUILDING_BLOCKS, Blocks.POINTED_DRIPSTONE, 4)
                        .requires(Blocks.DRIPSTONE_BLOCK)
                        .unlockedBy(getHasName(Blocks.DRIPSTONE_BLOCK), has(Blocks.DRIPSTONE_BLOCK))
                        .save(output, "pointed_dripstone_from_dripstone_block");

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.POINTED_DRIPSTONE, Blocks.DRIPSTONE_BLOCK, 2);

                shaped(RecipeCategory.MISC, ModItems.EMERALD_UPGRADE_SMITHING_TEMPLATE, 2)
                        .pattern("#E#")
                        .pattern("#G#")
                        .pattern("###")
                        .define('#', Blocks.NETHERRACK)
                        .define('G', Items.GOLD_INGOT)
                        .define('E', ModItems.EMERALD_UPGRADE_SMITHING_TEMPLATE)
                        .unlockedBy(getHasName(ModItems.EMERALD_UPGRADE_SMITHING_TEMPLATE), has(ModItems.EMERALD_UPGRADE_SMITHING_TEMPLATE))
                        .save(output, "emerald_upgrade_smithing_template_duper");

                smeltingResultFromBase(Blocks.COPPER_BLOCK.weathering().unaffected(), Blocks.RAW_COPPER_BLOCK);
                smeltingResultFromBase(Blocks.IRON_BLOCK, Blocks.RAW_IRON_BLOCK);
                smeltingResultFromBase(Blocks.GOLD_BLOCK, Blocks.RAW_GOLD_BLOCK);

                smeltingResultFromBase(Items.QUARTZ, Blocks.DIORITE);

                shaped(RecipeCategory.DECORATIONS, Blocks.END_ROD, 4)
                        .pattern("/")
                        .pattern("#")
                        .define('#', Items.POPPED_CHORUS_FRUIT)
                        .define('/', Items.BREEZE_ROD)
                        .unlockedBy(getHasName(Items.POPPED_CHORUS_FRUIT), has(Items.POPPED_CHORUS_FRUIT))
                        .save(output, "end_rod_from_breeze_rod");

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.CLAY, Blocks.DIRT, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.CLAY, Blocks.ROOTED_DIRT, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.CLAY, Blocks.COARSE_DIRT, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.CLAY, Blocks.MUD, 4);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.ROOTED_DIRT, Blocks.MUD);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.DIRT, Blocks.ROOTED_DIRT);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.DIRT, Blocks.COARSE_DIRT);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.FARMLAND, Blocks.DIRT);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.FARMLAND, Blocks.ROOTED_DIRT);
                stonecutterResultFromBase(RecipeCategory.FOOD, Blocks.HAY_BLOCK, Items.WHEAT, 12);
                stonecutterResultFromBase(RecipeCategory.FOOD, Blocks.HAY_BLOCK, Items.WHEAT_SEEDS, 8);

                shapeless(RecipeCategory.BUILDING_BLOCKS, Blocks.MOSSY_COBBLESTONE)
                        .requires(Blocks.MOSS_CARPET)
                        .requires(Blocks.COBBLESTONE)
                        .unlockedBy(getHasName(Blocks.MOSS_CARPET), has(Blocks.MOSS_CARPET))
                        .save(output, "mossy_cobblestone_from_mossy_carpet_block");


                shapeless(RecipeCategory.BUILDING_BLOCKS, Blocks.MOSSY_COBBLESTONE, 4)
                        .requires(Blocks.MOSS_BLOCK)
                        .requires(Blocks.COBBLESTONE)
                        .unlockedBy(getHasName(Blocks.MOSS_CARPET), has(Blocks.MOSS_CARPET))
                        .save(output, "mossy_cobblestone_from_moss_block");



                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_GLAZED_TERRACOTTA_STAIRS, Blocks.GLAZED_TERRACOTTA.white());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_GLAZED_TERRACOTTA_SLAB, Blocks.GLAZED_TERRACOTTA.white(), 2);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS, Blocks.GLAZED_TERRACOTTA.lightGray());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB, Blocks.GLAZED_TERRACOTTA.lightGray(), 2);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_GLAZED_TERRACOTTA_STAIRS, Blocks.GLAZED_TERRACOTTA.gray());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_GLAZED_TERRACOTTA_SLAB, Blocks.GLAZED_TERRACOTTA.gray(), 2);


            }
        };
    }

    @Override
    public String getName() {
        return "MinecraftFriendly Recipes";
    }
}
