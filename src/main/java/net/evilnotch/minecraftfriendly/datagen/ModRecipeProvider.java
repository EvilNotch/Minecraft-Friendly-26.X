package net.evilnotch.minecraftfriendly.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.level.block.BarrierBlock;
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

            }
        };
    }

    @Override
    public String getName() {
        return "MinecraftFriendly Recipes";
    }
}
