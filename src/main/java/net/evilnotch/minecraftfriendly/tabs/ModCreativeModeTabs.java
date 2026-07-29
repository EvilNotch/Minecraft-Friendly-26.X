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
                    .icon(() -> new ItemStack(Blocks.PETRIFIED_OAK_SLAB))
                    .title(Component.translatable("creativemodetab.minecraftfriendly.extra_renditions"))
                    .displayItems((parameters, output) -> {
                        output.accept(Blocks.PETRIFIED_OAK_SLAB);
                        output.accept(ModBlocks.WHITE_CONCRETE_SLAB);
                        output.accept(ModBlocks.WHITE_CONCRETE_STAIRS);
                        output.accept(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB);
                        output.accept(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
                        output.accept(ModBlocks.GRAY_CONCRETE_SLAB);
                        output.accept(ModBlocks.GRAY_CONCRETE_STAIRS);
                        output.accept(ModBlocks.BLACK_CONCRETE_SLAB);
                        output.accept(ModBlocks.BLACK_CONCRETE_STAIRS);
                        output.accept(ModBlocks.BROWN_CONCRETE_SLAB);
                        output.accept(ModBlocks.BROWN_CONCRETE_STAIRS);
                        output.accept(ModBlocks.RED_CONCRETE_SLAB);
                        output.accept(ModBlocks.RED_CONCRETE_STAIRS);
                        output.accept(ModBlocks.ORANGE_CONCRETE_SLAB);
                        output.accept(ModBlocks.ORANGE_CONCRETE_STAIRS);
                        output.accept(ModBlocks.YELLOW_CONCRETE_SLAB);
                        output.accept(ModBlocks.YELLOW_CONCRETE_STAIRS);
                        output.accept(ModBlocks.LIME_CONCRETE_SLAB);
                        output.accept(ModBlocks.LIME_CONCRETE_STAIRS);
                        output.accept(ModBlocks.GREEN_CONCRETE_SLAB);
                        output.accept(ModBlocks.GREEN_CONCRETE_STAIRS);
                        output.accept(ModBlocks.CYAN_CONCRETE_SLAB);
                        output.accept(ModBlocks.CYAN_CONCRETE_STAIRS);
                        output.accept(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB);
                        output.accept(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
                        output.accept(ModBlocks.BLUE_CONCRETE_SLAB);
                        output.accept(ModBlocks.BLUE_CONCRETE_STAIRS);
                        output.accept(ModBlocks.PURPLE_CONCRETE_SLAB);
                        output.accept(ModBlocks.PURPLE_CONCRETE_STAIRS);
                        output.accept(ModBlocks.MAGENTA_CONCRETE_SLAB);
                        output.accept(ModBlocks.MAGENTA_CONCRETE_STAIRS);
                        output.accept(ModBlocks.PINK_CONCRETE_SLAB);
                        output.accept(ModBlocks.PINK_CONCRETE_STAIRS);
                    })
                    .build());
    public static void registerModCreativeTabs() {
        MinecraftFriendly.LOGGER.info("This registers any custom creative mode tabs from " + MinecraftFriendly.MOD_ID + "!");
    }
}
