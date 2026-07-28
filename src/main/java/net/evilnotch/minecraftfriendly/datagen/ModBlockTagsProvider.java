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
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.getRK(TEST_BLOCK))
                .add(ModBlocks.getRK(WHITE_CONCRETE_SLAB))
                .add(ModBlocks.getRK(WHITE_CONCRETE_STAIRS)); //Replace valueLookupBuilder with tag as of 26.2

        tag(BlockTags.NEEDS_STONE_TOOL).add(ModBlocks.getRK(WHITE_CONCRETE_SLAB))
                .add(ModBlocks.getRK(WHITE_CONCRETE_STAIRS));
        tag(BlockTags.NEEDS_IRON_TOOL).add(ModBlocks.getRK(TEST_BLOCK));

        tag(BlockTags.SLABS).add(ModBlocks.getRK(ModBlocks.WHITE_CONCRETE_SLAB));
        tag(BlockTags.STAIRS).add(ModBlocks.getRK(ModBlocks.WHITE_CONCRETE_STAIRS));
    }
}
