package net.evilnotch.minecraftfriendly.block;

import com.mojang.datafixers.types.Func;
import net.evilnotch.minecraftfriendly.MinecraftFriendly;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockItemTags;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.*;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

import java.util.function.Consumer;
import java.util.function.Function;

public class ModBlocks {

    public static final Block NETHER_BRICK_FENCE_GATE = registerBlock("nether_brick_fence_gate",
            properties -> new FenceGateBlock(WoodType.CRIMSON, properties.strength(2.0F, 6.0F)
                    .requiresCorrectToolForDrops().mapColor(MapColor.NETHER).instrument(NoteBlockInstrument.BASEDRUM)
                    .sound(SoundType.NETHER_BRICKS)));

    public static final Block CRACKED_NETHER_BRICK_SLAB = registerBlock("cracked_nether_brick_slab", properties ->
            new SlabBlock(properties.strength(2.0F, 6.0F).requiresCorrectToolForDrops()
                    .mapColor(MapColor.NETHER).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.NETHER_BRICKS)));

    public static final Block CRACKED_NETHER_BRICK_STAIRS = registerBlock("cracked_nether_brick_stairs", properties ->
            new StairBlock(Blocks.CRACKED_NETHER_BRICKS.defaultBlockState(), properties.strength(2.0F, 6.0F)
                    .requiresCorrectToolForDrops().mapColor(MapColor.NETHER).sound(SoundType.NETHER_BRICKS)));

    public static final Block CRACKED_DEEPSLATE_TILE_SLAB = registerBlock("cracked_deepslate_tile_slab", properties ->
            new SlabBlock(properties.strength(3.0F, 6.0F).requiresCorrectToolForDrops()
                    .mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE_TILES)));

    public static final Block CRACKED_DEEPSLATE_TILE_STAIRS = registerBlock("cracked_deepslate_tile_stairs", properties ->
            new StairBlock(Blocks.CRACKED_DEEPSLATE_TILES.defaultBlockState(), properties.strength(3.0F, 6.0F)
                    .requiresCorrectToolForDrops().mapColor(MapColor.DEEPSLATE).sound(SoundType.DEEPSLATE_TILES)));

    public static final Block CRACKED_DEEPSLATE_BRICK_SLAB = registerBlock("cracked_deepslate_brick_slab", properties ->
            new SlabBlock(properties.strength(3.0F, 6.0F).requiresCorrectToolForDrops()
                    .mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE_BRICKS)));

    public static final Block CRACKED_DEEPSLATE_BRICK_STAIRS = registerBlock("cracked_deepslate_brick_stairs", properties ->
            new StairBlock(Blocks.CRACKED_DEEPSLATE_BRICKS.defaultBlockState(), properties.strength(3.0F, 6.0F)
                    .requiresCorrectToolForDrops().mapColor(MapColor.DEEPSLATE).sound(SoundType.DEEPSLATE_BRICKS)));

    public static final Block CRACKED_STONE_BRICK_SLAB = registerBlock("cracked_stone_brick_slab", properties ->
            new SlabBlock(properties.strength(1.5F, 6.0F).requiresCorrectToolForDrops()
                    .mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.STONE)));

    public static final Block CRACKED_STONE_BRICK_STAIRS = registerBlock("cracked_stone_brick_stairs", properties ->
            new StairBlock(Blocks.CRACKED_STONE_BRICKS.defaultBlockState(), properties.strength(1.5F, 6.0F)
                    .requiresCorrectToolForDrops().mapColor(MapColor.STONE).sound(SoundType.STONE)));

    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB = registerBlock("cracked_polished_blackstone_brick_slab", properties ->
            new SlabBlock(properties.strength(1.5F, 6.0F).requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM)));


    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS = registerBlock("cracked_polished_blackstone_brick_stairs", properties ->
            new StairBlock(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS.defaultBlockState(), properties.strength(1.5F, 6.0F)
                    .requiresCorrectToolForDrops().mapColor(MapColor.COLOR_BLACK)));

    public static final Block RAINBOW_WOOL = registerBlock("rainbow_wool", properties -> new Block(properties.sound(SoundType.WOOL).mapColor(DyeColor.BROWN)
            .strength(0.8F).instrument(NoteBlockInstrument.GUITAR).ignitedByLava()));

    //public static final Block RAINBOW_WOOL_STAIRS = registerBlock("rainbow_wool_stairs", properties ->
            //new StairBlock(ModBlocks.RAINBOW_WOOL.defaultBlockState(), properties.strength(0.8F)
                    //.mapColor(DyeColor.BROWN).sound(SoundType.WOOL).ignitedByLava().instrument(NoteBlockInstrument.GUITAR)));

    //public static final Block RAINBOW_WOOL_SLAB = registerBlock("rainbow_wool_slab", properties ->
            //new SlabBlock(properties.strength(0.8F).mapColor(DyeColor.BROWN).instrument(NoteBlockInstrument.GUITAR).ignitedByLava()));

    public static final Block SAPPHIRE_CLUSTER = registerBlock("sapphire_cluster", properties -> new AmethystClusterBlock(4.0F, 10.0F, properties
            .sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel(statex -> 5)));

    //public static final Block WARPED_PETALS = registerBlock("warped_petals", properties -> new FlowerBedBlock(properties.mapColor(MapColor.WARPED_HYPHAE)
            //.noCollision().sound(SoundType.PINK_PETALS).pushReaction(PushReaction.PUSH)));

    public static final Block PINK_DAISY = registerBlock("pink_daisy", properties -> new FlowerBlock(MobEffects.REGENERATION, 0.35F,
            properties.noCollision().mapColor(MapColor.PLANT).instabreak().sound(SoundType.GRASS)
                    .offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.PUSH)));

    public static final Block POTTED_PINK_DAISY = registerBlock("potted_pink_daisy", properties -> new FlowerPotBlock(ModBlocks.PINK_DAISY, properties));

    public static final Block BUTTERCUP = registerBlock("buttercup", properties -> new FlowerBlock(MobEffects.REGENERATION, 0.35F,
            properties.noCollision().mapColor(MapColor.PLANT).instabreak().sound(SoundType.GRASS)
                    .offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.PUSH)));

    public static final Block POTTED_BUTTERCUP = registerBlock("potted_buttercup", properties -> new FlowerPotBlock(ModBlocks.BUTTERCUP, properties));

    public static final Block PAEONIA = registerBlock("paeonia", properties -> new FlowerBlock(MobEffects.REGENERATION, 0.35F,
            properties.noCollision().mapColor(MapColor.PLANT).instabreak().sound(SoundType.GRASS)
                    .offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.PUSH)), Component.translatable("tooltip.minecraftfriendly.paeonia"));

    public static final Block POTTED_PAEONIA = registerBlock("potted_paeonia", properties -> new FlowerPotBlock(ModBlocks.PAEONIA, properties));

    public static final Block ROSE = registerBlock("rose", properties -> new FlowerBlock(MobEffects.REGENERATION, 0.35F,
            properties.noCollision().mapColor(MapColor.PLANT).instabreak().sound(SoundType.GRASS)
                    .offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.PUSH)), Component.translatable("tooltip.minecraftfriendly.rose"));

    public static final Block POTTED_ROSE = registerBlock("potted_rose", properties -> new FlowerPotBlock(ModBlocks.ROSE, properties));

    public static final Block BLUE_HYPNEA_MACROALGAE = registerBlock("blue_hypnea_macroalgae",
            properties -> new FlowerBlock(MobEffects.LEVITATION, 0.35F, properties.noCollision().mapColor(MapColor.PLANT)
                    .instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.PUSH)));

    public static final Block POTTED_BLUE_HYPNEA_MACROALGAE = registerBlock("potted_blue_hypnea_macroalgae",
            properties -> new FlowerPotBlock(ModBlocks.BLUE_HYPNEA_MACROALGAE, properties));

    //public static final Block BLUEBERRY_VINE = registerBlock("blueberry_vine", properties -> new CaveVinesBlock());

    public static final Block DIRT_SLAB = registerBlock("dirt_slab",
            properties -> new SlabBlock(properties.strength(0.5F).mapColor(MapColor.DIRT).sound(SoundType.GRAVEL)));

    public static final Block GRAVEL_LAYER_BLOCK = registerBlock("gravel_layer_block",
            properties -> new SnowLayerBlock(properties.strength(0.2F).sound(SoundType.GRAVEL).mapColor(MapColor.STONE)
                    .pushReaction(PushReaction.PUSH)
                    .replaceable()
                    .randomTicks()));

    public static final Block SAND_LAYER_BLOCK = registerBlock("sand_layer_block",
            properties -> new SnowLayerBlock(properties.strength(0.2F).sound(SoundType.SAND).mapColor(MapColor.SAND)
                    .pushReaction(PushReaction.PUSH)
                    .replaceable()
                    .randomTicks()));

    public static final Block RED_SAND_LAYER_BLOCK = registerBlock("red_sand_layer_block",
            properties -> new SnowLayerBlock(properties.strength(0.2F).sound(SoundType.SAND).mapColor(MapColor.FIRE)
                    .pushReaction(PushReaction.PUSH)
                    .replaceable()
                    .randomTicks()));

    public static final Block SOUL_SAND_LAYER_BLOCK = registerBlock("soul_sand_layer_block", properties -> new SnowLayerBlock(
            properties.strength(0.2F).sound(SoundType.SOUL_SAND).mapColor(MapColor.COLOR_BROWN).instrument(NoteBlockInstrument.COW_BELL).speedFactor(0.4F)
                    .isValidSpawn(Blocks::always).isRedstoneConductor(Blocks::always)
                    .pushReaction(PushReaction.PUSH)
                    .replaceable()
                    .randomTicks()
    ));

    public static final Block SOUL_SOIL_LAYER_BLOCK = registerBlock("soul_soil_layer_block", properties -> new SnowLayerBlock(
            properties.strength(0.2F).sound(SoundType.SOUL_SOIL).mapColor(MapColor.COLOR_BROWN)
                    .pushReaction(PushReaction.PUSH)
                    .replaceable()
                    .randomTicks()
    ));

    public static final Block TUBE_CORAL_SLAB = registerBlock("tube_coral_slab",
            properties -> new SlabBlock(properties.strength(1.5F, 6.0F)
                    .instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.CORAL_BLOCK).mapColor(MapColor.COLOR_BLUE)));

    public static final Block PETRIFIED_SPRUCE_SLAB = registerBlock("petrified_spruce_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 6.0F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.WOOD)));

    public static final Block PETRIFIED_BIRCH_SLAB = registerBlock("petrified_birch_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 6.0F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.WOOD)));

    public static final Block PETRIFIED_JUNGLE_SLAB = registerBlock("petrified_jungle_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 6.0F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.WOOD)));

    public static final Block PETRIFIED_ACACIA_SLAB = registerBlock("petrified_acacia_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 6.0F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.WOOD)));

    public static final Block PETRIFIED_DARK_OAK_SLAB = registerBlock("petrified_dark_oak_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 6.0F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.WOOD)));

    public static final Block PETRIFIED_MANGROVE_SLAB = registerBlock("petrified_mangrove_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 6.0F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.WOOD)));

    public static final Block PETRIFIED_CHERRY_SLAB = registerBlock("petrified_cherry_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 6.0F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.WOOD)));

    public static final Block PETRIFIED_PALE_OAK_SLAB = registerBlock("petrified_pale_oak_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 6.0F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.WOOD)));

    public static final Block PETRIFIED_BAMBOO_SLAB = registerBlock("petrified_bamboo_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 6.0F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.WOOD)));

    public static final Block PETRIFIED_BAMBOO_MOSAIC_SLAB = registerBlock("petrified_bamboo_mosaic_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 6.0F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.WOOD)));

    public static final Block PETRIFIED_CRIMSON_SLAB = registerBlock("petrified_crimson_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 6.0F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.WOOD)));

    public static final Block PETRIFIED_WARPED_SLAB = registerBlock("petrified_warped_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 6.0F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.WOOD)));

    public static final Block CRACKED_PURPUR_BLOCK = registerBlock("cracked_purpur_block", properties -> new Block(properties.mapColor(MapColor.COLOR_MAGENTA)
            .instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));

    public static final Block CRACKED_PURPUR_SLAB = registerBlock("cracked_purpur_slab", properties -> new SlabBlock(properties.strength(1.0F, 6.0F)
            .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.COLOR_MAGENTA)));
    public static final Block CRACKED_PURPUR_STAIRS = registerBlock("cracked_purpur_stairs", properties -> new StairBlock(ModBlocks.CRACKED_PURPUR_BLOCK.defaultBlockState(),
            properties.mapColor(MapColor.COLOR_MAGENTA).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));

    public static final Block SMOOTH_STONE_STAIRS = registerBlock("smooth_stone_stairs",
            properties -> new StairBlock(Blocks.SMOOTH_STONE.defaultBlockState(), properties.strength(2.0F, 6.0F)
                    .requiresCorrectToolForDrops().mapColor(MapColor.STONE)));

    public static final Block SMOOTH_STONE_WALL = registerBlock("smooth_stone_wall",
            properties -> new WallBlock(properties.strength(2.0F, 6.0F)
                    .requiresCorrectToolForDrops().mapColor(MapColor.STONE)));

    public static final Block PLATED_IRON = registerBlock("plated_iron",
            properties -> new Block(properties
                    .sound(SoundType.METAL)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.METAL)
                    .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                    .strength(5.0F, 6.0F)));

    public static final Block IRON_BUTTON = registerBlock("iron_button",
            properties -> new ButtonBlock(BlockSetType.IRON, 30, properties.strength(5.0F, 6.0F)
                    .requiresCorrectToolForDrops().mapColor(MapColor.METAL).instrument(NoteBlockInstrument.IRON_XYLOPHONE).noCollision()));
    public static final Block IRON_SLAB = registerBlock("iron_slab",
            properties -> new SlabBlock(properties.strength(5.0F, 6.0F)
                    .requiresCorrectToolForDrops().mapColor(MapColor.METAL).instrument(NoteBlockInstrument.IRON_XYLOPHONE)));

    public static final Block IRON_STAIRS = registerBlock("iron_stairs",
            properties -> new StairBlock(Blocks.IRON_BLOCK.defaultBlockState(), properties.strength(5.0F, 6.0F)
                    .requiresCorrectToolForDrops().mapColor(MapColor.METAL).instrument(NoteBlockInstrument.IRON_XYLOPHONE)));

    public static final Block CHISELED_GOLD = registerBlock("chiseled_gold",
            properties -> new Block(properties
                    .sound(SoundType.METAL)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.GOLD)
                    .instrument(NoteBlockInstrument.BELL)
                    .strength(3.0F, 6.0F)));

    public static final Block GOLD_BUTTON = registerBlock("gold_button",
            properties -> new ButtonBlock(BlockSetType.GOLD, 5, properties.strength(3.0F, 6.0F)
                    .requiresCorrectToolForDrops().mapColor(MapColor.GOLD).instrument(NoteBlockInstrument.BELL).noCollision()));

    public static final Block GOLD_SLAB = registerBlock("gold_slab",
            properties -> new SlabBlock(properties.strength(3.0F, 6.0F)
                    .requiresCorrectToolForDrops().mapColor(MapColor.GOLD).instrument(NoteBlockInstrument.BELL)));

    public static final Block GOLD_STAIRS = registerBlock("gold_stairs",
            properties -> new StairBlock(Blocks.GOLD_BLOCK.defaultBlockState(), properties.strength(3.0F, 6.0F)
                    .requiresCorrectToolForDrops().mapColor(MapColor.GOLD).instrument(NoteBlockInstrument.BELL)));

    public static final Block GOLD_CHAIN = registerBlock("gold_chain", properties -> new ChainBlock(properties.strength(3.0F,
            6.0F).forceSolidOn().requiresCorrectToolForDrops().sound(SoundType.CHAIN).noOcclusion()));

    public static final Block GOLD_BARS = registerBlock("gold_bars", properties -> new IronBarsBlock(properties.strength(3.0F,
            6.0F).noOcclusion().sound(SoundType.IRON).requiresCorrectToolForDrops()));

    public static final Block REDSTONE_SLAB = registerBlock("redstone_slab",
            properties -> new SlabBlock(properties.strength(5.0F, 6.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.METAL).mapColor(MapColor.FIRE)
                    .isRedstoneConductor(Blocks::never)));

    public static final Block REDSTONE_STAIRS = registerBlock("redstone_stairs",
            properties -> new StairBlock(Blocks.REDSTONE_BLOCK.defaultBlockState(), properties.strength(5.0F, 6.0F)
                    .requiresCorrectToolForDrops().sound(SoundType.METAL).mapColor(MapColor.FIRE)
                    .isRedstoneConductor(Blocks::never)));

    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            properties -> new Block(properties
                    .sound(SoundType.METAL)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.FIRE)
                    .instrument(NoteBlockInstrument.BIT)
                    .strength(5.0F, 6.0F)));

    public static final Block RUBY_STAIRS = registerBlock("ruby_stairs",
            properties -> new StairBlock(ModBlocks.RUBY_BLOCK.defaultBlockState(), properties.strength(5.0F, 6.0F)
                    .instrument(NoteBlockInstrument.BIT).mapColor(MapColor.FIRE).sound(SoundType.METAL)));

    public static final Block SAPPHIRE_BLOCK = registerBlock("sapphire_block",
            properties -> new Block(properties
                    .sound(SoundType.METAL)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.LAPIS)
                    .instrument(NoteBlockInstrument.BIT)
                    .strength(5.0F, 6.0F)));

    public static final Block SAPPHIRE_STAIRS = registerBlock("sapphire_stairs",
            properties -> new StairBlock(ModBlocks.SAPPHIRE_BLOCK.defaultBlockState(), properties.strength(5.0F, 6.0F)
                    .instrument(NoteBlockInstrument.BIT).mapColor(MapColor.LAPIS).sound(SoundType.METAL)));

    public static final Block CHISELED_EMERALD = registerBlock("chiseled_emerald",
            properties -> new Block(properties
                    .sound(SoundType.METAL)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.EMERALD)
                    .instrument(NoteBlockInstrument.BIT)
                    .strength(5.0F, 6.0F)));
    public static final Block EMERALD_SLAB = registerBlock("emerald_slab",
            properties -> new SlabBlock(properties.strength(5.0F, 6.0F)
                    .mapColor(MapColor.EMERALD).requiresCorrectToolForDrops()));

    public static final Block EMERALD_STAIRS = registerBlock("emerald_stairs",
            properties -> new StairBlock(Blocks.EMERALD_BLOCK.defaultBlockState(), properties.strength(5.0F, 6.0F)
                    .requiresCorrectToolForDrops().mapColor(MapColor.EMERALD).instrument(NoteBlockInstrument.BIT)));

    public static final Block CHISELED_LAPIS = registerBlock("chiseled_lapis",
            properties -> new Block(properties
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.LAPIS)
                    .strength(3.0F, 3.0F)));
    public static final Block LAPIS_SLAB = registerBlock("lapis_slab",
            properties -> new SlabBlock(properties.strength(3.0F, 3.0F)
                    .requiresCorrectToolForDrops().mapColor(MapColor.LAPIS)));

    public static final Block LAPIS_STAIRS = registerBlock("lapis_stairs",
            properties -> new StairBlock(Blocks.LAPIS_BLOCK.defaultBlockState(), properties.strength(3.0F, 3.0F)
                    .requiresCorrectToolForDrops().mapColor(MapColor.LAPIS)));

    public static final Block CHISELED_DIAMOND = registerBlock("chiseled_diamond",
            properties -> new Block(properties
                    .sound(SoundType.METAL)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.DIAMOND)
                    .strength(5.0F, 6.0F)));
    public static final Block DIAMOND_SLAB = registerBlock("diamond_slab",
            properties -> new SlabBlock(properties.strength(5.0F, 6.0F)
                    .requiresCorrectToolForDrops().mapColor(MapColor.DIAMOND).sound(SoundType.METAL)));

    public static final Block DIAMOND_STAIRS = registerBlock("diamond_stairs",
            properties -> new StairBlock(Blocks.DIAMOND_BLOCK.defaultBlockState(), properties.strength(5.0F, 6.0F)
                    .requiresCorrectToolForDrops().mapColor(MapColor.DIAMOND).sound(SoundType.METAL)));

    public static final Block NETHERITE_SLAB = registerBlock("netherite_slab",
            properties -> new SlabBlock(properties.strength(50.0F, 1200.0F)
                    .requiresCorrectToolForDrops().mapColor(MapColor.COLOR_BLACK).sound(SoundType.NETHERITE_BLOCK)),
            Component.translatable("tooltip.minecraftfriendly.netherite_slab"));

    public static final Block NETHERITE_STAIRS = registerBlock("netherite_stairs",
            properties -> new StairBlock(Blocks.NETHERITE_BLOCK.defaultBlockState(), properties.strength(50.0F, 1200.0F)
                    .requiresCorrectToolForDrops().mapColor(MapColor.COLOR_BLACK).sound(SoundType.NETHERITE_BLOCK)),
            Component.translatable("tooltip.minecraftfriendly.netherite_stairs"));


    //Concrete

    public static final Block WHITE_CONCRETE_FENCE = registerBlock("white_concrete_fence",
            properties -> new FenceBlock(properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block WHITE_CONCRETE_FENCE_GATE = registerBlock("white_concrete_fence_gate",
            properties -> new FenceGateBlock(WoodType.WARPED, properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block WHITE_CONCRETE_WALL = registerBlock("white_concrete_wall",
            properties -> new WallBlock(properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block LIGHT_GRAY_CONCRETE_FENCE = registerBlock("light_gray_concrete_fence",
            properties -> new FenceBlock(properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block LIGHT_GRAY_CONCRETE_FENCE_GATE = registerBlock("light_gray_concrete_fence_gate",
            properties -> new FenceGateBlock(WoodType.WARPED, properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block LIGHT_GRAY_CONCRETE_WALL = registerBlock("light_gray_concrete_wall",
            properties -> new WallBlock(properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block GRAY_CONCRETE_FENCE = registerBlock("gray_concrete_fence",
            properties -> new FenceBlock(properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block GRAY_CONCRETE_FENCE_GATE = registerBlock("gray_concrete_fence_gate",
            properties -> new FenceGateBlock(WoodType.WARPED, properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block GRAY_CONCRETE_WALL = registerBlock("gray_concrete_wall",
            properties -> new WallBlock(properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block BLACK_CONCRETE_FENCE = registerBlock("black_concrete_fence",
            properties -> new FenceBlock(properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block BLACK_CONCRETE_FENCE_GATE = registerBlock("black_concrete_fence_gate",
            properties -> new FenceGateBlock(WoodType.WARPED, properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block BLACK_CONCRETE_WALL = registerBlock("black_concrete_wall",
            properties -> new WallBlock(properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block BROWN_CONCRETE_FENCE = registerBlock("brown_concrete_fence",
            properties -> new FenceBlock(properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block BROWN_CONCRETE_FENCE_GATE = registerBlock("brown_concrete_fence_gate",
            properties -> new FenceGateBlock(WoodType.WARPED, properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block BROWN_CONCRETE_WALL = registerBlock("brown_concrete_wall",
            properties -> new WallBlock(properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block RED_CONCRETE_FENCE = registerBlock("red_concrete_fence",
            properties -> new FenceBlock(properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block RED_CONCRETE_FENCE_GATE = registerBlock("red_concrete_fence_gate",
            properties -> new FenceGateBlock(WoodType.WARPED, properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block RED_CONCRETE_WALL = registerBlock("red_concrete_wall",
            properties -> new WallBlock(properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block ORANGE_CONCRETE_FENCE = registerBlock("orange_concrete_fence",
            properties -> new FenceBlock(properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block ORANGE_CONCRETE_FENCE_GATE = registerBlock("orange_concrete_fence_gate",
            properties -> new FenceGateBlock(WoodType.WARPED, properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block ORANGE_CONCRETE_WALL = registerBlock("orange_concrete_wall",
            properties -> new WallBlock(properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block YELLOW_CONCRETE_FENCE = registerBlock("yellow_concrete_fence",
            properties -> new FenceBlock(properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block YELLOW_CONCRETE_FENCE_GATE = registerBlock("yellow_concrete_fence_gate",
            properties -> new FenceGateBlock(WoodType.WARPED, properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block YELLOW_CONCRETE_WALL = registerBlock("yellow_concrete_wall",
            properties -> new WallBlock(properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block LIME_CONCRETE_FENCE = registerBlock("lime_concrete_fence",
            properties -> new FenceBlock(properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block LIME_CONCRETE_FENCE_GATE = registerBlock("lime_concrete_fence_gate",
            properties -> new FenceGateBlock(WoodType.WARPED, properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block LIME_CONCRETE_WALL = registerBlock("lime_concrete_wall",
            properties -> new WallBlock(properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block GREEN_CONCRETE_FENCE = registerBlock("green_concrete_fence",
            properties -> new FenceBlock(properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block GREEN_CONCRETE_FENCE_GATE = registerBlock("green_concrete_fence_gate",
            properties -> new FenceGateBlock(WoodType.WARPED, properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block GREEN_CONCRETE_WALL = registerBlock("green_concrete_wall",
            properties -> new WallBlock(properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block CYAN_CONCRETE_FENCE = registerBlock("cyan_concrete_fence",
            properties -> new FenceBlock(properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block CYAN_CONCRETE_FENCE_GATE = registerBlock("cyan_concrete_fence_gate",
            properties -> new FenceGateBlock(WoodType.WARPED, properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block CYAN_CONCRETE_WALL = registerBlock("cyan_concrete_wall",
            properties -> new WallBlock(properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block LIGHT_BLUE_CONCRETE_FENCE = registerBlock("light_blue_concrete_fence",
            properties -> new FenceBlock(properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block LIGHT_BLUE_CONCRETE_FENCE_GATE = registerBlock("light_blue_concrete_fence_gate",
            properties -> new FenceGateBlock(WoodType.WARPED, properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block LIGHT_BLUE_CONCRETE_WALL = registerBlock("light_blue_concrete_wall",
            properties -> new WallBlock(properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block BLUE_CONCRETE_FENCE = registerBlock("blue_concrete_fence",
            properties -> new FenceBlock(properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block BLUE_CONCRETE_FENCE_GATE = registerBlock("blue_concrete_fence_gate",
            properties -> new FenceGateBlock(WoodType.WARPED, properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block BLUE_CONCRETE_WALL = registerBlock("blue_concrete_wall",
            properties -> new WallBlock(properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block PURPLE_CONCRETE_FENCE = registerBlock("purple_concrete_fence",
            properties -> new FenceBlock(properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block PURPLE_CONCRETE_FENCE_GATE = registerBlock("purple_concrete_fence_gate",
            properties -> new FenceGateBlock(WoodType.WARPED, properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block PURPLE_CONCRETE_WALL = registerBlock("purple_concrete_wall",
            properties -> new WallBlock(properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block MAGENTA_CONCRETE_FENCE = registerBlock("magenta_concrete_fence",
            properties -> new FenceBlock(properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block MAGENTA_CONCRETE_FENCE_GATE = registerBlock("magenta_concrete_fence_gate",
            properties -> new FenceGateBlock(WoodType.WARPED, properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block MAGENTA_CONCRETE_WALL = registerBlock("magenta_concrete_wall",
            properties -> new WallBlock(properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block PINK_CONCRETE_FENCE = registerBlock("pink_concrete_fence",
            properties -> new FenceBlock(properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block PINK_CONCRETE_FENCE_GATE = registerBlock("pink_concrete_fence_gate",
            properties -> new FenceGateBlock(WoodType.WARPED, properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block PINK_CONCRETE_WALL = registerBlock("pink_concrete_wall",
            properties -> new WallBlock(properties.strength(1.8F)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    //Terracotta

    //public static final Block WHITE_TERRACOTTA_STAIRS = registerBlock("white_terracotta_stairs",
            //properties -> new StairBlock(Blocks.TERRACOTTA.defaultBlockState(), properties.strength(1.8F)
                    //.requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    //public static final Block WHITE_CONCRETE_SLAB = registerBlock("white_concrete_slab",
           // properties -> new SlabBlock(properties.strength(1.8F)
                  //  .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM)));

    //Glazed Terracotta

    public static final Block WHITE_GLAZED_TERRACOTTA_STAIRS = registerBlock("white_glazed_terracotta_stairs",
            properties -> new StairBlock(Blocks.GLAZED_TERRACOTTA.white().defaultBlockState(), properties.strength(1.4F)
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().pushReaction(PushReaction.PUSH)));

    public static final Block WHITE_GLAZED_TERRACOTTA_SLAB = registerBlock("white_glazed_terracotta_slab",
            properties -> new SlabBlock(properties.strength(1.4F).mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().pushReaction(PushReaction.PUSH)));

    public static final Block LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS = registerBlock("light_gray_glazed_terracotta_stairs",
            properties -> new StairBlock(Blocks.GLAZED_TERRACOTTA.lightGray().defaultBlockState(), properties.strength(1.4F)
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().pushReaction(PushReaction.PUSH)));

    public static final Block LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB = registerBlock("light_gray_glazed_terracotta_slab",
            properties -> new SlabBlock(properties.strength(1.4F).mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().pushReaction(PushReaction.PUSH)));

    public static final Block GRAY_GLAZED_TERRACOTTA_STAIRS = registerBlock("gray_glazed_terracotta_stairs",
            properties -> new StairBlock(Blocks.GLAZED_TERRACOTTA.gray().defaultBlockState(), properties.strength(1.4F)
                    .mapColor(MapColor.TERRACOTTA_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().pushReaction(PushReaction.PUSH)));

    public static final Block GRAY_GLAZED_TERRACOTTA_SLAB = registerBlock("gray_glazed_terracotta_slab",
            properties -> new SlabBlock(properties.strength(1.4F).mapColor(MapColor.TERRACOTTA_GRAY).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().pushReaction(PushReaction.PUSH)));




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
    }

    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function, Component... tooltips) {
        Block toRegister = function.apply(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MinecraftFriendly.MOD_ID, name))));
        registerBlockItem(name, toRegister, tooltips);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MinecraftFriendly.MOD_ID, name), toRegister);
    }
    private static void registerBlockItem(String name, Block block, Component... tooltips) {
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(MinecraftFriendly.MOD_ID, name),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MinecraftFriendly.MOD_ID, name)))) {
                    @Override
                    public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
                        for(var component :  tooltips) {
                            builder.accept(component);
                        }

                        super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
                    }
                });
    }

    public static void registerBlocks() {
        MinecraftFriendly.LOGGER.info("Registering Blocks and their Creative Entries for " + MinecraftFriendly.MOD_ID);

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.BUILDING_BLOCKS).register(output -> {
            output.insertAfter(Blocks.OAK_SLAB, Blocks.PETRIFIED_OAK_SLAB);
            output.insertAfter(Blocks.SPRUCE_SLAB, ModBlocks.PETRIFIED_SPRUCE_SLAB);
            output.insertAfter(Blocks.BIRCH_SLAB, ModBlocks.PETRIFIED_BIRCH_SLAB);
            output.insertAfter(Blocks.JUNGLE_SLAB, ModBlocks.PETRIFIED_JUNGLE_SLAB);
            output.insertAfter(Blocks.ACACIA_SLAB, ModBlocks.PETRIFIED_ACACIA_SLAB);
            output.insertAfter(Blocks.DARK_OAK_SLAB, ModBlocks.PETRIFIED_DARK_OAK_SLAB);
            output.insertAfter(Blocks.MANGROVE_SLAB, ModBlocks.PETRIFIED_MANGROVE_SLAB);
            output.insertAfter(Blocks.CHERRY_SLAB, ModBlocks.PETRIFIED_CHERRY_SLAB);
            output.insertAfter(Blocks.PALE_OAK_SLAB, ModBlocks.PETRIFIED_PALE_OAK_SLAB);
            output.insertAfter(Blocks.BAMBOO_SLAB, ModBlocks.PETRIFIED_BAMBOO_SLAB);
            output.insertAfter(Blocks.BAMBOO_MOSAIC_SLAB, ModBlocks.PETRIFIED_BAMBOO_MOSAIC_SLAB);
            output.insertAfter(Blocks.CRIMSON_SLAB, ModBlocks.PETRIFIED_CRIMSON_SLAB);
            output.insertAfter(Blocks.WARPED_SLAB, ModBlocks.PETRIFIED_WARPED_SLAB);


            output.insertAfter(Blocks.NETHER_BRICK_FENCE, ModBlocks.NETHER_BRICK_FENCE_GATE);

            output.insertAfter(Blocks.CRACKED_NETHER_BRICKS, ModBlocks.CRACKED_NETHER_BRICK_STAIRS);
            output.insertAfter(ModBlocks.CRACKED_NETHER_BRICK_STAIRS, ModBlocks.CRACKED_NETHER_BRICK_SLAB);

            output.insertAfter(Blocks.STONE_BRICKS, Blocks.STONE_BRICK_STAIRS);
            output.insertAfter(Blocks.STONE_BRICK_STAIRS, Blocks.STONE_BRICK_SLAB);
            output.insertBefore(Blocks.CRACKED_STONE_BRICKS, Blocks.STONE_BRICK_STAIRS);
            output.insertBefore(Blocks.CRACKED_STONE_BRICKS, Blocks.STONE_BRICK_SLAB);
            output.insertAfter(Blocks.STONE_BRICK_SLAB, Blocks.STONE_BRICK_WALL);
            output.insertBefore(Blocks.CRACKED_STONE_BRICKS, Blocks.STONE_BRICK_WALL);

            output.insertAfter(Blocks.SMOOTH_STONE, ModBlocks.SMOOTH_STONE_STAIRS);
            output.insertAfter(Blocks.SMOOTH_STONE_SLAB, ModBlocks.SMOOTH_STONE_WALL);

            output.insertAfter(Blocks.CRACKED_STONE_BRICKS, ModBlocks.CRACKED_STONE_BRICK_STAIRS);
            output.insertAfter(ModBlocks.CRACKED_STONE_BRICK_STAIRS, ModBlocks.CRACKED_STONE_BRICK_SLAB);

            output.insertBefore(Blocks.STONE_BRICKS, Blocks.CHISELED_STONE_BRICKS);

            output.insertBefore(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS);
            output.insertBefore(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, Blocks.POLISHED_BLACKSTONE_BRICK_SLAB);
            output.insertBefore(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, Blocks.POLISHED_BLACKSTONE_BRICK_WALL);

            output.insertAfter(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS);
            output.insertAfter(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS, ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB);

            output.insertAfter(Blocks.DEEPSLATE_BRICKS, Blocks.DEEPSLATE_BRICK_STAIRS);
            output.insertAfter(Blocks.DEEPSLATE_BRICK_STAIRS, Blocks.DEEPSLATE_BRICK_SLAB);
            output.insertBefore(Blocks.CRACKED_DEEPSLATE_BRICKS, Blocks.DEEPSLATE_BRICK_SLAB);
            output.insertAfter(Blocks.DEEPSLATE_BRICK_SLAB, Blocks.DEEPSLATE_BRICK_WALL);
            output.insertBefore(Blocks.CRACKED_DEEPSLATE_BRICKS, Blocks.DEEPSLATE_BRICK_WALL);

            output.insertAfter(Blocks.CRACKED_DEEPSLATE_TILES, ModBlocks.CRACKED_DEEPSLATE_TILE_STAIRS);
            output.insertAfter(ModBlocks.CRACKED_DEEPSLATE_TILE_STAIRS, ModBlocks.CRACKED_DEEPSLATE_TILE_SLAB);

            output.insertAfter(Blocks.CRACKED_DEEPSLATE_BRICKS, ModBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS);
            output.insertAfter(ModBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS, ModBlocks.CRACKED_DEEPSLATE_BRICK_SLAB);

            output.insertAfter(Blocks.IRON_BLOCK, ModBlocks.IRON_STAIRS);
            output.insertAfter(ModBlocks.IRON_STAIRS, ModBlocks.IRON_SLAB);
            output.insertAfter(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE, ModBlocks.IRON_BUTTON);

            output.insertAfter(Blocks.GOLD_BLOCK, ModBlocks.GOLD_STAIRS);
            output.insertAfter(ModBlocks.GOLD_STAIRS, ModBlocks.GOLD_SLAB);
            output.insertAfter(Blocks.LIGHT_WEIGHTED_PRESSURE_PLATE, ModBlocks.GOLD_BUTTON);

            output.insertAfter(Blocks.EMERALD_BLOCK, ModBlocks.EMERALD_STAIRS);
            output.insertAfter(ModBlocks.EMERALD_STAIRS, ModBlocks.EMERALD_SLAB);

            output.insertAfter(Blocks.LAPIS_BLOCK, ModBlocks.LAPIS_STAIRS);
            output.insertAfter(ModBlocks.LAPIS_STAIRS, ModBlocks.LAPIS_SLAB);

            output.insertAfter(Blocks.DIAMOND_BLOCK, ModBlocks.DIAMOND_STAIRS);
            output.insertAfter(ModBlocks.DIAMOND_STAIRS, ModBlocks.DIAMOND_SLAB);

            output.insertAfter(Blocks.PURPUR_BLOCK, ModBlocks.CRACKED_PURPUR_BLOCK);
            output.insertAfter(Blocks.PURPUR_SLAB, ModBlocks.CRACKED_PURPUR_STAIRS);
            output.insertAfter(ModBlocks.CRACKED_PURPUR_STAIRS, ModBlocks.CRACKED_PURPUR_SLAB);
        });

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.COLORED_BLOCKS).register(output -> {

            output.insertAfter(Blocks.WOOL.pink(), ModBlocks.RAINBOW_WOOL);

            output.insertAfter(Blocks.GLAZED_TERRACOTTA.white(), ModBlocks.WHITE_GLAZED_TERRACOTTA_STAIRS);
            output.insertAfter(ModBlocks.WHITE_GLAZED_TERRACOTTA_STAIRS, ModBlocks.WHITE_GLAZED_TERRACOTTA_SLAB);

            output.insertAfter(Blocks.GLAZED_TERRACOTTA.lightGray(), ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS);
            output.insertAfter(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS, ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB);

            output.insertAfter(Blocks.GLAZED_TERRACOTTA.gray(), ModBlocks.GRAY_GLAZED_TERRACOTTA_STAIRS);
            output.insertAfter(ModBlocks.GRAY_GLAZED_TERRACOTTA_STAIRS, ModBlocks.GRAY_GLAZED_TERRACOTTA_SLAB);
        });

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.NATURAL_BLOCKS).register(output -> {
            output.insertAfter(Blocks.GRAVEL, ModBlocks.GRAVEL_LAYER_BLOCK);
            output.insertAfter(Blocks.SAND, ModBlocks.SAND_LAYER_BLOCK);
            output.insertAfter(Blocks.RED_SAND, ModBlocks.RED_SAND_LAYER_BLOCK);
            output.insertAfter(Blocks.SOUL_SAND, ModBlocks.SOUL_SAND_LAYER_BLOCK);
            output.insertAfter(Blocks.SOUL_SOIL, ModBlocks.SOUL_SOIL_LAYER_BLOCK);

            output.insertAfter(Blocks.OXEYE_DAISY, ModBlocks.PINK_DAISY);
            output.insertAfter(Blocks.DANDELION, ModBlocks.BUTTERCUP);

            output.insertAfter(Blocks.LILY_OF_THE_VALLEY, ModBlocks.PAEONIA);
            output.insertAfter(Blocks.OPEN_EYEBLOSSOM, ModBlocks.ROSE);

            output.insertAfter(Blocks.BLUE_ORCHID, ModBlocks.BLUE_HYPNEA_MACROALGAE);

            output.insertAfter(Blocks.AMETHYST_CLUSTER, ModBlocks.SAPPHIRE_CLUSTER);
        });

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.SEARCH).register(output -> {
            //TBC
        });
    }
}
