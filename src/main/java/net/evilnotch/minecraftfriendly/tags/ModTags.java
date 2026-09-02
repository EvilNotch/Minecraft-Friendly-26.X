package net.evilnotch.minecraftfriendly.tags;

import net.evilnotch.minecraftfriendly.MinecraftFriendly;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {

        public static final TagKey<Block> NEEDS_GOLD_TOOL = createTag("needs_gold_tool");
        public static final TagKey<Block> NEEDS_EMERALD_TOOL = createTag("needs_emerald_tool");
        public static final TagKey<Block> INCORRECT_FOR_EMERALD_TOOL = createTag("incorrect_for_emerald_tool");

        public static final TagKey<Block> BLOCK_RECIPE_VOIDER = createTag("block_recipe_voider");
        private static TagKey<Block> createTag(String name) {
            return TagKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MinecraftFriendly.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> REPAIRS_EMERALD_ARMOR = createTag("repairs_emerald_armor");

        public static final TagKey<Item> EMERALD_TOOL_MATERIALS = createTag("emerald_tool_materials");

        public static final TagKey<Item> IS_EMERALD =  createTag("is_emerald");
        public static final TagKey<Item> IS_NETHERITE = createTag("is_netherite");
        public static final TagKey<Item> GEMSTONES = createTag("gemstones");

        public static final TagKey<Item> IS_ANIMAL_HIDE = createTag("is_animal_hide");

        public static final TagKey<Item> IS_TICKLING = createTag("is_tickling");

        public static final TagKey<Item> ITEM_RECIPE_VOIDER = createTag("item_recipe_voider");
        private static TagKey<Item> createTag(String name) {
            return TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MinecraftFriendly.MOD_ID, name));
        }
    }
}
