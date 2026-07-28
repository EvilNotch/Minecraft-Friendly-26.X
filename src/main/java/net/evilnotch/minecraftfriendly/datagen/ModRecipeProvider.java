package net.evilnotch.minecraftfriendly.datagen;

import net.evilnotch.minecraftfriendly.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
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
                        .save(output, "structure_void_from_barrier_blocks");//By default without identifier it takes the name of the output.

                shapeless(RecipeCategory.MISC, Blocks.BARRIER, 9)
                        .requires(Blocks.STRUCTURE_VOID)
                        .unlockedBy(getHasName(Blocks.STRUCTURE_VOID), has(Blocks.STRUCTURE_VOID))
                        .group("testing")
                        .save(output, "barrier_blocks_from_structure_void");

                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CONCRETE_SLAB, Ingredient.of(Blocks.CONCRETE.white()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.white()), has(Blocks.CONCRETE.white()))
                        .group("building")
                        .save(output, "white_concrete_slab_from_white_concrete");

                stairBuilder(ModBlocks.WHITE_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.white()))
                        .unlockedBy(getHasName(Blocks.CONCRETE.white()), has(Blocks.CONCRETE.white()))
                        .group("building")
                        .save(output, "white_concrete_stairs_from_white_concrete");

            }
        };
    }

    @Override
    public String getName() {
        return "MinecraftFriendly Recipes";
    }
}
