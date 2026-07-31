package net.evilnotch.minecraftfriendly.datagen;

import net.evilnotch.minecraftfriendly.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
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

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_CONCRETE_SLAB, Ingredient.of(Blocks.CONCRETE.lightGray()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.lightGray()), has(Blocks.CONCRETE.lightGray()))
                        .group("building")
                        .save(output, "light_gray_concrete_slab_from_light_gray_concrete");

                stairBuilder(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.lightGray()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.lightGray()), has(Blocks.CONCRETE.lightGray()))
                        .group("building")
                        .save(output, "light_gray_concrete_stairs_from_light_gray_concrete");

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_CONCRETE_SLAB, Ingredient.of(Blocks.CONCRETE.gray()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.gray()), has(Blocks.CONCRETE.gray()))
                        .group("building")
                        .save(output, "gray_concrete_slab_from_gray_concrete");

                stairBuilder(ModBlocks.GRAY_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.gray()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.gray()), has(Blocks.CONCRETE.gray()))
                        .group("building")
                        .save(output, "gray_concrete_stairs_from_gray_concrete");

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CONCRETE_SLAB, Ingredient.of(Blocks.CONCRETE.black()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.black()), has(Blocks.CONCRETE.black()))
                        .group("building")
                        .save(output, "black_concrete_slab_from_black_concrete");

                stairBuilder(ModBlocks.BLACK_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.black()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.black()), has(Blocks.CONCRETE.black()))
                        .group("building")
                        .save(output, "black_concrete_stairs_from_black_concrete");

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_CONCRETE_SLAB, Ingredient.of(Blocks.CONCRETE.brown()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.brown()), has(Blocks.CONCRETE.brown()))
                        .group("building")
                        .save(output, "brown_concrete_slab_from_brown_concrete");

                stairBuilder(ModBlocks.BROWN_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.brown()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.brown()), has(Blocks.CONCRETE.brown()))
                        .group("building")
                        .save(output, "brown_concrete_stairs_from_brown_concrete");

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CONCRETE_SLAB, Ingredient.of(Blocks.CONCRETE.red()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.red()), has(Blocks.CONCRETE.red()))
                        .group("building")
                        .save(output, "red_concrete_slab_from_red_concrete");

                stairBuilder(ModBlocks.RED_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.red()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.red()), has(Blocks.CONCRETE.red()))
                        .group("building")
                        .save(output, "red_concrete_stairs_from_red_concrete");

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CONCRETE_SLAB, Ingredient.of(Blocks.CONCRETE.orange()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.orange()), has(Blocks.CONCRETE.orange()))
                        .group("building")
                        .save(output, "orange_concrete_slab_from_orange_concrete");

                stairBuilder(ModBlocks.ORANGE_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.orange()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.orange()), has(Blocks.CONCRETE.orange()))
                        .group("building")
                        .save(output, "orange_concrete_stairs_from_orange_concrete");

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CONCRETE_SLAB, Ingredient.of(Blocks.CONCRETE.yellow()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.yellow()), has(Blocks.CONCRETE.yellow()))
                        .group("building")
                        .save(output, "yellow_concrete_slab_from_yellow_concrete");

                stairBuilder(ModBlocks.YELLOW_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.yellow()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.yellow()), has(Blocks.CONCRETE.yellow()))
                        .group("building")
                        .save(output, "yellow_concrete_stairs_from_yellow_concrete");

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_CONCRETE_SLAB, Ingredient.of(Blocks.CONCRETE.lime()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.lime()), has(Blocks.CONCRETE.lime()))
                        .group("building")
                        .save(output, "lime_concrete_slab_from_lime_concrete");

                stairBuilder(ModBlocks.LIME_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.lime()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.lime()), has(Blocks.CONCRETE.lime()))
                        .group("building")
                        .save(output, "lime_concrete_stairs_from_lime_concrete");

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CONCRETE_SLAB, Ingredient.of(Blocks.CONCRETE.green()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.green()), has(Blocks.CONCRETE.green()))
                        .group("building")
                        .save(output, "green_concrete_slab_from_green_concrete");

                stairBuilder(ModBlocks.GREEN_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.green()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.green()), has(Blocks.CONCRETE.green()))
                        .group("building")
                        .save(output, "green_concrete_stairs_from_green_concrete");

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_CONCRETE_SLAB, Ingredient.of(Blocks.CONCRETE.cyan()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.cyan()), has(Blocks.CONCRETE.cyan()))
                        .group("building")
                        .save(output, "cyan_concrete_slab_from_cyan_concrete");

                stairBuilder(ModBlocks.CYAN_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.cyan()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.cyan()), has(Blocks.CONCRETE.cyan()))
                        .group("building")
                        .save(output, "cyan_concrete_stairs_from_cyan_concrete");

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_CONCRETE_SLAB, Ingredient.of(Blocks.CONCRETE.lightBlue()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.lightBlue()), has(Blocks.CONCRETE.lightBlue()))
                        .group("building")
                        .save(output, "light_blue_concrete_slab_from_light_blue_concrete");

                stairBuilder(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.lightBlue()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.lightBlue()), has(Blocks.CONCRETE.lightBlue()))
                        .group("building")
                        .save(output, "light_blue_concrete_stairs_from_light_blue_concrete");

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CONCRETE_SLAB, Ingredient.of(Blocks.CONCRETE.blue()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.blue()), has(Blocks.CONCRETE.blue()))
                        .group("building")
                        .save(output, "blue_concrete_slab_from_blue_concrete");

                stairBuilder(ModBlocks.BLUE_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.blue()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.blue()), has(Blocks.CONCRETE.blue()))
                        .group("building")
                        .save(output, "blue_concrete_stairs_from_blue_concrete");

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CONCRETE_SLAB, Ingredient.of(Blocks.CONCRETE.purple()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.purple()), has(Blocks.CONCRETE.purple()))
                        .group("building")
                        .save(output, "purple_concrete_slab_from_purple_concrete");

                stairBuilder(ModBlocks.PURPLE_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.purple()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.purple()), has(Blocks.CONCRETE.purple()))
                        .group("building")
                        .save(output, "purple_concrete_stairs_from_purple_concrete");

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_CONCRETE_SLAB, Ingredient.of(Blocks.CONCRETE.magenta()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.magenta()), has(Blocks.CONCRETE.magenta()))
                        .group("building")
                        .save(output, "magenta_concrete_slab_from_magenta_concrete");

                stairBuilder(ModBlocks.MAGENTA_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.magenta()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.magenta()), has(Blocks.CONCRETE.magenta()))
                        .group("building")
                        .save(output, "magenta_concrete_stairs_from_magenta_concrete");

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CONCRETE_SLAB, Ingredient.of(Blocks.CONCRETE.pink()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.pink()), has(Blocks.CONCRETE.pink()))
                        .group("building")
                        .save(output, "pink_concrete_slab_from_pink_concrete");

                stairBuilder(ModBlocks.PINK_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.pink()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.pink()), has(Blocks.CONCRETE.pink()))
                        .group("building")
                        .save(output, "pink_concrete_stairs_from_pink_concrete");

            }
        };
    }

    @Override
    public String getName() {
        return "MinecraftFriendly Recipes";
    }
}
