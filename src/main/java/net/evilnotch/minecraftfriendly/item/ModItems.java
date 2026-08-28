package net.evilnotch.minecraftfriendly.item;

import net.evilnotch.minecraftfriendly.MinecraftFriendly;
import net.evilnotch.minecraftfriendly.datagen.ModJukeboxSongs;
import net.evilnotch.minecraftfriendly.food.ModFoods;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.*;

import java.util.function.Function;


public class ModItems {
    public static final Item RAW_CALAMARI = registerItem("raw_calamari", properties -> new Item(properties
            .food(ModFoods.RAW_CALAMARI, ModFoods.RAW_CALAMARI_CONSUMABLE)));

    public static final Item COOKED_CALAMARI = registerItem("cooked_calamari", properties -> new Item(properties
            .food(ModFoods.COOKED_CALAMARI, ModFoods.COOKED_CALAMARI_CONSUMABLE)));

    public static final Item PRISMARINE = registerItem("prismarine", properties -> new Item(properties.fireResistant()));

    public static final Item RUBY = registerItem("ruby", properties -> new Item(properties.fireResistant()));

    public static final Item INDEPENDENT_ACCIDENT = registerItem("independent_accident", properties -> new Item(properties.stacksTo(1)
            .jukeboxPlayable(ModJukeboxSongs.INDEPENDENT_ACCIDENT_KEY).rarity(Rarity.UNCOMMON)));

    public static final Item LONGER_STRING = registerItem("longer_string", Item::new);

    public static final Item EMERALD_SWORD = registerItem("emerald_sword", properties -> new Item(properties.sword(ModToolMaterials.EMERALD,
            3.5F, -2.4F)));

    public static final Item EMERALD_SHOVEL = registerItem("emerald_shovel", properties -> new ShovelItem(ModToolMaterials.EMERALD,
            1.5F, -3.0F, properties));

    public static final Item EMERALD_PICKAXE = registerItem("emerald_pickaxe", properties -> new Item(properties.pickaxe(ModToolMaterials.EMERALD,
            1F, -2.8F)));

    public static final Item EMERALD_AXE = registerItem("emerald_axe", properties -> new AxeItem(ModToolMaterials.EMERALD,
            6.0F, -3.0F, properties));

    public static final Item EMERALD_HOE = registerItem("emerald_hoe", properties -> new HoeItem(ModToolMaterials.EMERALD,
            0.0F, -3.0F, properties));

    public static final Item EMERALD_SPEAR = registerItem("emerald_spear", properties -> new Item(properties.spear(ModToolMaterials.EMERALD,
            0.95F, 0.9F,
            0.7F, 3.5F,
            13.0F, 8.5F,
            5.1F, 13.75F,
            5.0F)));

    //public static final Item NETHERITE_SLAB = registerBlock()


    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(MinecraftFriendly.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM,
                        Identifier.fromNamespaceAndPath(MinecraftFriendly.MOD_ID, name)))));
    };

    public static ResourceKey<Item> getRK(Item item) {
        return BuiltInRegistries.ITEM.getResourceKey(item).get();
    }
    public static void registerItems() {
        MinecraftFriendly.LOGGER.info("Registering Items and their Creative Entries for " + MinecraftFriendly.MOD_ID);

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.FOOD_AND_DRINKS).register(output -> {
            output.insertAfter(Items.TROPICAL_FISH, ModItems.RAW_CALAMARI);
            output.insertAfter(ModItems.RAW_CALAMARI, ModItems.COOKED_CALAMARI);
        });

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register(output -> {
            output.insertAfter(Items.DIAMOND, ModItems.PRISMARINE);
            output.insertAfter(Items.RAW_GOLD, ModItems.RUBY);

            output.insertAfter(Items.STRING, ModItems.LONGER_STRING);
        });

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(output -> {
            output.insertAfter(Items.MUSIC_DISC_MALL, ModItems.INDEPENDENT_ACCIDENT);
        });
    }

}
