package net.evilnotch.minecraftfriendly.registries;

import net.evilnotch.minecraftfriendly.potion.ModPotions;
import net.fabricmc.fabric.api.registry.FabricPotionBrewingBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.item.crafting.Ingredient;

public class ModPotionRecipes {
    public static void registerPotionRecipes() {
        FabricPotionBrewingBuilder.BUILD.register(builder -> {
            builder.registerPotionRecipe(Potions.AWKWARD, Ingredient.of(Items.WITHER_ROSE), ModPotions.POTION_OF_DECAY);
        });
    }
}
