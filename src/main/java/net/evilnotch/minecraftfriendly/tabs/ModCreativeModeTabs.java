package net.evilnotch.minecraftfriendly.tabs;

import net.evilnotch.minecraftfriendly.MinecraftFriendly;
import net.evilnotch.minecraftfriendly.block.ModBlocks;
import net.evilnotch.minecraftfriendly.item.ModItems;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;

public class ModCreativeModeTabs {
    public static final CreativeModeTab EXTRA_RENDITIONS = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(MinecraftFriendly.MOD_ID, "extra_renditions"),
            FabricCreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.CHISELED_EMERALD))
                    .title(Component.translatable("creativemodetab.minecraftfriendly.extra_renditions"))
                    .displayItems((parameters, output) -> {
                        //output.accept(ModBlocks.REDSTONE_SLAB);
                        //output.accept(ModBlocks.REDSTONE_STAIRS);
                        output.accept(ModBlocks.CHISELED_GOLD);
                        output.accept(ModBlocks.RUBY_BLOCK);
                        output.accept(ModBlocks.SAPPHIRE_BLOCK);
                        output.accept(ModBlocks.CHISELED_EMERALD);
                        output.accept(ModBlocks.CHISELED_LAPIS);
                        output.accept(ModBlocks.CHISELED_DIAMOND);
                    })
                    .build());
    public static void registerModCreativeTabs() {
        MinecraftFriendly.LOGGER.info("This registers any custom creative mode tabs from " + MinecraftFriendly.MOD_ID + "!");
    }
}
