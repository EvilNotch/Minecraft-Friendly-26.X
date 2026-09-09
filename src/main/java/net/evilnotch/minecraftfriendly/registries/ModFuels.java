package net.evilnotch.minecraftfriendly.registries;

import net.evilnotch.minecraftfriendly.item.ModItems;
import net.fabricmc.fabric.api.registry.FuelValueEvents;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;

public class ModFuels {
    public static void registerFuels() {
        FuelValueEvents.BUILD.register((builder, context) -> {
            builder.add(Items.MAGMA_BLOCK, context.baseSmeltTime() * 14);
            builder.add(Items.BLAZE_POWDER, context.baseSmeltTime() * 6);
            builder.add(Items.STRING, context.baseSmeltTime() / 2);
            builder.add(ModItems.LONGER_STRING, context.baseSmeltTime() / 2);
            builder.add(ItemTags.BEE_FOOD, context.baseSmeltTime() / 2);
            builder.add(Items.GUNPOWDER, context.baseSmeltTime() / 2);
        }); //Can also just input a number value if I don't want to adjust from vanilla.
    }
}
