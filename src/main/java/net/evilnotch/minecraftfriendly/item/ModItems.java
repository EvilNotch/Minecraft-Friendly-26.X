package net.evilnotch.minecraftfriendly.item;

import net.evilnotch.minecraftfriendly.MinecraftFriendly;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.TestBlock;

import java.util.function.Function;

public class ModItems {
    public static final Item TEST_ITEM = registerItem("test_item", Item::new);
    public static final Item TEST_ITEM_2 = registerItem("test_item_2", properties -> new Item(properties.stacksTo(32)));


    //Helper and register.
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

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.OP_BLOCKS).register(output -> {
            output.accept(TEST_ITEM);
        });
    }

}
