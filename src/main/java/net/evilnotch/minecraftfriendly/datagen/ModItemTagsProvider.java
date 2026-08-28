package net.evilnotch.minecraftfriendly.datagen;

import net.evilnotch.minecraftfriendly.block.ModBlocks;
import net.evilnotch.minecraftfriendly.item.ModItems;
import net.evilnotch.minecraftfriendly.tags.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.references.ItemIds;
import net.minecraft.tags.EnchantmentTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends FabricTagsProvider.ItemTagsProvider {
    public ModItemTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        tag(ModTags.Items.GEMSTONES).add(ModItems.getRK(ModItems.RUBY));

        tag(ItemTags.CREEPER_DROP_MUSIC_DISCS).add(ModItems.getRK(ModItems.INDEPENDENT_ACCIDENT));


        tag(ItemTags.SWORDS).add(ModItems.getRK(ModItems.EMERALD_SWORD));
        tag(ItemTags.SHOVELS).add(ModItems.getRK(ModItems.EMERALD_SHOVEL));
        tag(ItemTags.PICKAXES).add(ModItems.getRK(ModItems.EMERALD_PICKAXE));
        tag(ItemTags.AXES).add(ModItems.getRK(ModItems.EMERALD_AXE));
        tag(ItemTags.HOES).add(ModItems.getRK(ModItems.EMERALD_HOE));
        tag(ItemTags.SPEARS).add(ModItems.getRK(ModItems.EMERALD_SPEAR));

    }
}
