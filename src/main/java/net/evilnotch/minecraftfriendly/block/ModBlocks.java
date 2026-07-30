package net.evilnotch.minecraftfriendly.block;

import net.evilnotch.minecraftfriendly.MinecraftFriendly;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

import java.util.function.Function;

public class ModBlocks {
    public static final Block CHISELED_EMERALD = registerBlock("chiseled_emerald",
            properties -> new Block(properties
                    .sound(SoundType.METAL)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.EMERALD)
                    .instrument(NoteBlockInstrument.BIT)
                    .strength(5.0F, 6.0F)));

    public static final Block WHITE_CONCRETE_STAIRS = registerBlock("white_concrete_stairs",
            properties -> new StairBlock(Blocks.CONCRETE.white().defaultBlockState(), properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block WHITE_CONCRETE_SLAB = registerBlock("white_concrete_slab",
            properties -> new SlabBlock(properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block LIGHT_GRAY_CONCRETE_STAIRS = registerBlock("light_gray_concrete_stairs",
            properties -> new StairBlock(Blocks.CONCRETE.lightGray().defaultBlockState(), properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block LIGHT_GRAY_CONCRETE_SLAB = registerBlock("light_gray_concrete_slab",
            properties -> new SlabBlock(properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block GRAY_CONCRETE_STAIRS = registerBlock("gray_concrete_stairs",
            properties -> new StairBlock(Blocks.CONCRETE.gray().defaultBlockState(), properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block GRAY_CONCRETE_SLAB = registerBlock("gray_concrete_slab",
            properties -> new SlabBlock(properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block BLACK_CONCRETE_STAIRS = registerBlock("black_concrete_stairs",
            properties -> new StairBlock(Blocks.CONCRETE.black().defaultBlockState(), properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block BLACK_CONCRETE_SLAB = registerBlock("black_concrete_slab",
            properties -> new SlabBlock(properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block BROWN_CONCRETE_STAIRS = registerBlock("brown_concrete_stairs",
            properties -> new StairBlock(Blocks.CONCRETE.brown().defaultBlockState(), properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block BROWN_CONCRETE_SLAB = registerBlock("brown_concrete_slab",
            properties -> new SlabBlock(properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block RED_CONCRETE_STAIRS = registerBlock("red_concrete_stairs",
            properties -> new StairBlock(Blocks.CONCRETE.red().defaultBlockState(), properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block RED_CONCRETE_SLAB = registerBlock("red_concrete_slab",
            properties -> new SlabBlock(properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block ORANGE_CONCRETE_STAIRS = registerBlock("orange_concrete_stairs",
            properties -> new StairBlock(Blocks.CONCRETE.orange().defaultBlockState(), properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block ORANGE_CONCRETE_SLAB = registerBlock("orange_concrete_slab",
            properties -> new SlabBlock(properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block YELLOW_CONCRETE_STAIRS = registerBlock("yellow_concrete_stairs",
            properties -> new StairBlock(Blocks.CONCRETE.yellow().defaultBlockState(), properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block YELLOW_CONCRETE_SLAB = registerBlock("yellow_concrete_slab",
            properties -> new SlabBlock(properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block LIME_CONCRETE_STAIRS = registerBlock("lime_concrete_stairs",
            properties -> new StairBlock(Blocks.CONCRETE.lime().defaultBlockState(), properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block LIME_CONCRETE_SLAB = registerBlock("lime_concrete_slab",
            properties -> new SlabBlock(properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block GREEN_CONCRETE_STAIRS = registerBlock("green_concrete_stairs",
            properties -> new StairBlock(Blocks.CONCRETE.green().defaultBlockState(), properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block GREEN_CONCRETE_SLAB = registerBlock("green_concrete_slab",
            properties -> new SlabBlock(properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block CYAN_CONCRETE_STAIRS = registerBlock("cyan_concrete_stairs",
            properties -> new StairBlock(Blocks.CONCRETE.cyan().defaultBlockState(), properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block CYAN_CONCRETE_SLAB = registerBlock("cyan_concrete_slab",
            properties -> new SlabBlock(properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block LIGHT_BLUE_CONCRETE_STAIRS = registerBlock("light_blue_concrete_stairs",
            properties -> new StairBlock(Blocks.CONCRETE.lightBlue().defaultBlockState(), properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block LIGHT_BLUE_CONCRETE_SLAB = registerBlock("light_blue_concrete_slab",
            properties -> new SlabBlock(properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block BLUE_CONCRETE_STAIRS = registerBlock("blue_concrete_stairs",
            properties -> new StairBlock(Blocks.CONCRETE.blue().defaultBlockState(), properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block BLUE_CONCRETE_SLAB = registerBlock("blue_concrete_slab",
            properties -> new SlabBlock(properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block PURPLE_CONCRETE_STAIRS = registerBlock("purple_concrete_stairs",
            properties -> new StairBlock(Blocks.CONCRETE.purple().defaultBlockState(), properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block PURPLE_CONCRETE_SLAB = registerBlock("purple_concrete_slab",
            properties -> new SlabBlock(properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block MAGENTA_CONCRETE_STAIRS = registerBlock("magenta_concrete_stairs",
            properties -> new StairBlock(Blocks.CONCRETE.magenta().defaultBlockState(), properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block MAGENTA_CONCRETE_SLAB = registerBlock("magenta_concrete_slab",
            properties -> new SlabBlock(properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block PINK_CONCRETE_STAIRS = registerBlock("pink_concrete_stairs",
            properties -> new StairBlock(Blocks.CONCRETE.pink().defaultBlockState(), properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block PINK_CONCRETE_SLAB = registerBlock("pink_concrete_slab",
            properties -> new SlabBlock(properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));


    public static ResourceKey<Block> getRK(Block block) {
        return BuiltInRegistries.BLOCK.getResourceKey(block).get();
    }
    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function) {
        Block toRegister = function.apply(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MinecraftFriendly.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MinecraftFriendly.MOD_ID, name), toRegister);
    }
    private static void registerBlockItem(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(MinecraftFriendly.MOD_ID, name),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MinecraftFriendly.MOD_ID, name)))));
    };

    public static void registerBlocks() {
        MinecraftFriendly.LOGGER.info("Registering Blocks and their Creative Entries for " + MinecraftFriendly.MOD_ID);

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.OP_BLOCKS).register(output -> {
            output.accept(ModBlocks.CHISELED_EMERALD);
        });
    }
}
