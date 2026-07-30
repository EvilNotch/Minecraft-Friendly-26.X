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

        tag(BlockTags.CONCRETE)
                .add(ModBlocks.getRK(WHITE_CONCRETE_SLAB))
                .add(ModBlocks.getRK(WHITE_CONCRETE_STAIRS))
                .add(ModBlocks.getRK(LIGHT_GRAY_CONCRETE_SLAB))
                .add(ModBlocks.getRK(LIGHT_GRAY_CONCRETE_STAIRS))
                .add(ModBlocks.getRK(GRAY_CONCRETE_SLAB))
                .add(ModBlocks.getRK(GRAY_CONCRETE_STAIRS))
                .add(ModBlocks.getRK(BLACK_CONCRETE_SLAB))
                .add(ModBlocks.getRK(BLACK_CONCRETE_STAIRS))
                .add(ModBlocks.getRK(BROWN_CONCRETE_SLAB))
                .add(ModBlocks.getRK(BROWN_CONCRETE_STAIRS))
                .add(ModBlocks.getRK(RED_CONCRETE_SLAB))
                .add(ModBlocks.getRK(RED_CONCRETE_STAIRS))
                .add(ModBlocks.getRK(ORANGE_CONCRETE_SLAB))
                .add(ModBlocks.getRK(ORANGE_CONCRETE_STAIRS))
                .add(ModBlocks.getRK(YELLOW_CONCRETE_SLAB))
                .add(ModBlocks.getRK(YELLOW_CONCRETE_STAIRS))
                .add(ModBlocks.getRK(LIME_CONCRETE_SLAB))
                .add(ModBlocks.getRK(LIME_CONCRETE_STAIRS))
                .add(ModBlocks.getRK(GREEN_CONCRETE_SLAB))
                .add(ModBlocks.getRK(GREEN_CONCRETE_STAIRS))
                .add(ModBlocks.getRK(CYAN_CONCRETE_SLAB))
                .add(ModBlocks.getRK(CYAN_CONCRETE_STAIRS))
                .add(ModBlocks.getRK(LIGHT_BLUE_CONCRETE_SLAB))
                .add(ModBlocks.getRK(LIGHT_BLUE_CONCRETE_STAIRS))
                .add(ModBlocks.getRK(BLUE_CONCRETE_SLAB))
                .add(ModBlocks.getRK(BLUE_CONCRETE_STAIRS))
                .add(ModBlocks.getRK(PURPLE_CONCRETE_SLAB))
                .add(ModBlocks.getRK(PURPLE_CONCRETE_STAIRS))
                .add(ModBlocks.getRK(MAGENTA_CONCRETE_SLAB))
                .add(ModBlocks.getRK(MAGENTA_CONCRETE_STAIRS))
                .add(ModBlocks.getRK(PINK_CONCRETE_SLAB))
                .add(ModBlocks.getRK(PINK_CONCRETE_STAIRS));

        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.getRK(GOLD_SLAB))
                .add(ModBlocks.getRK(GOLD_STAIRS))
                .add(ModBlocks.getRK(CHISELED_EMERALD))
                .add(ModBlocks.getRK(EMERALD_SLAB))
                .add(ModBlocks.getRK(EMERALD_STAIRS))
                .add(ModBlocks.getRK(DIAMOND_SLAB))
                .add(ModBlocks.getRK(DIAMOND_STAIRS))
                .add(ModBlocks.getRK(WHITE_CONCRETE_SLAB))
                .add(ModBlocks.getRK(WHITE_CONCRETE_STAIRS))
                .add(ModBlocks.getRK(LIGHT_GRAY_CONCRETE_SLAB))
                .add(ModBlocks.getRK(LIGHT_GRAY_CONCRETE_STAIRS))
                .add(ModBlocks.getRK(GRAY_CONCRETE_SLAB))
                .add(ModBlocks.getRK(GRAY_CONCRETE_STAIRS))
                .add(ModBlocks.getRK(BLACK_CONCRETE_SLAB))
                .add(ModBlocks.getRK(BLACK_CONCRETE_STAIRS))
                .add(ModBlocks.getRK(BROWN_CONCRETE_SLAB))
                .add(ModBlocks.getRK(BROWN_CONCRETE_STAIRS))
                .add(ModBlocks.getRK(RED_CONCRETE_SLAB))
                .add(ModBlocks.getRK(RED_CONCRETE_STAIRS))
                .add(ModBlocks.getRK(ORANGE_CONCRETE_SLAB))
                .add(ModBlocks.getRK(ORANGE_CONCRETE_STAIRS))
                .add(ModBlocks.getRK(YELLOW_CONCRETE_SLAB))
                .add(ModBlocks.getRK(YELLOW_CONCRETE_STAIRS))
                .add(ModBlocks.getRK(LIME_CONCRETE_SLAB))
                .add(ModBlocks.getRK(LIME_CONCRETE_STAIRS))
                .add(ModBlocks.getRK(GREEN_CONCRETE_SLAB))
                .add(ModBlocks.getRK(GREEN_CONCRETE_STAIRS))
                .add(ModBlocks.getRK(CYAN_CONCRETE_SLAB))
                .add(ModBlocks.getRK(CYAN_CONCRETE_STAIRS))
                .add(ModBlocks.getRK(LIGHT_BLUE_CONCRETE_SLAB))
                .add(ModBlocks.getRK(LIGHT_BLUE_CONCRETE_STAIRS))
                .add(ModBlocks.getRK(BLUE_CONCRETE_SLAB))
                .add(ModBlocks.getRK(BLUE_CONCRETE_STAIRS))
                .add(ModBlocks.getRK(PURPLE_CONCRETE_SLAB))
                .add(ModBlocks.getRK(PURPLE_CONCRETE_STAIRS))
                .add(ModBlocks.getRK(MAGENTA_CONCRETE_SLAB))
                .add(ModBlocks.getRK(MAGENTA_CONCRETE_STAIRS))
                .add(ModBlocks.getRK(PINK_CONCRETE_SLAB))
                .add(ModBlocks.getRK(PINK_CONCRETE_STAIRS));

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.getRK(GOLD_SLAB))
                .add(ModBlocks.getRK(GOLD_STAIRS))
                .add(ModBlocks.getRK(CHISELED_EMERALD))
                .add(ModBlocks.getRK(EMERALD_SLAB))
                .add(ModBlocks.getRK(EMERALD_STAIRS))
                .add(ModBlocks.getRK(DIAMOND_SLAB))
                .add(ModBlocks.getRK(DIAMOND_STAIRS));

        tag(BlockTags.SLABS).add(ModBlocks.getRK(ModBlocks.WHITE_CONCRETE_SLAB));
        tag(BlockTags.STAIRS).add(ModBlocks.getRK(ModBlocks.WHITE_CONCRETE_STAIRS));

        tag(BlockTags.SLABS).add(ModBlocks.getRK(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB));
        tag(BlockTags.STAIRS).add(ModBlocks.getRK(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS));

        tag(BlockTags.SLABS).add(ModBlocks.getRK(ModBlocks.GRAY_CONCRETE_SLAB));
        tag(BlockTags.STAIRS).add(ModBlocks.getRK(ModBlocks.GRAY_CONCRETE_STAIRS));

        tag(BlockTags.SLABS).add(ModBlocks.getRK(ModBlocks.BLACK_CONCRETE_SLAB));
        tag(BlockTags.STAIRS).add(ModBlocks.getRK(ModBlocks.BLACK_CONCRETE_STAIRS));

        tag(BlockTags.SLABS).add(ModBlocks.getRK(ModBlocks.BROWN_CONCRETE_SLAB));
        tag(BlockTags.STAIRS).add(ModBlocks.getRK(ModBlocks.BROWN_CONCRETE_STAIRS));

        tag(BlockTags.SLABS).add(ModBlocks.getRK(ModBlocks.RED_CONCRETE_SLAB));
        tag(BlockTags.STAIRS).add(ModBlocks.getRK(ModBlocks.RED_CONCRETE_STAIRS));

        tag(BlockTags.SLABS).add(ModBlocks.getRK(ModBlocks.ORANGE_CONCRETE_SLAB));
        tag(BlockTags.STAIRS).add(ModBlocks.getRK(ModBlocks.ORANGE_CONCRETE_STAIRS));

        tag(BlockTags.SLABS).add(ModBlocks.getRK(ModBlocks.YELLOW_CONCRETE_SLAB));
        tag(BlockTags.STAIRS).add(ModBlocks.getRK(ModBlocks.YELLOW_CONCRETE_STAIRS));

        tag(BlockTags.SLABS).add(ModBlocks.getRK(ModBlocks.LIME_CONCRETE_SLAB));
        tag(BlockTags.STAIRS).add(ModBlocks.getRK(ModBlocks.LIME_CONCRETE_STAIRS));

        tag(BlockTags.SLABS).add(ModBlocks.getRK(ModBlocks.GREEN_CONCRETE_SLAB));
        tag(BlockTags.STAIRS).add(ModBlocks.getRK(ModBlocks.GREEN_CONCRETE_STAIRS));

        tag(BlockTags.SLABS).add(ModBlocks.getRK(ModBlocks.CYAN_CONCRETE_SLAB));
        tag(BlockTags.STAIRS).add(ModBlocks.getRK(ModBlocks.CYAN_CONCRETE_STAIRS));

        tag(BlockTags.SLABS).add(ModBlocks.getRK(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB));
        tag(BlockTags.STAIRS).add(ModBlocks.getRK(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS));

        tag(BlockTags.SLABS).add(ModBlocks.getRK(ModBlocks.BLUE_CONCRETE_SLAB));
        tag(BlockTags.STAIRS).add(ModBlocks.getRK(ModBlocks.BLUE_CONCRETE_STAIRS));

        tag(BlockTags.SLABS).add(ModBlocks.getRK(ModBlocks.PURPLE_CONCRETE_SLAB));
        tag(BlockTags.STAIRS).add(ModBlocks.getRK(ModBlocks.PURPLE_CONCRETE_STAIRS));

        tag(BlockTags.SLABS).add(ModBlocks.getRK(ModBlocks.MAGENTA_CONCRETE_SLAB));
        tag(BlockTags.STAIRS).add(ModBlocks.getRK(ModBlocks.MAGENTA_CONCRETE_STAIRS));

        tag(BlockTags.SLABS).add(ModBlocks.getRK(ModBlocks.PINK_CONCRETE_SLAB));
        tag(BlockTags.STAIRS).add(ModBlocks.getRK(ModBlocks.PINK_CONCRETE_STAIRS));
    }
}
