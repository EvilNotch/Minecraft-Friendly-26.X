package net.evilnotch.minecraftfriendly.food;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;

public class ModFoods {
    public static final FoodProperties RAW_CALAMARI = new FoodProperties.Builder().nutrition(1).saturationModifier(0.3F).build();
    public static final FoodProperties COOKED_CALAMARI = new FoodProperties.Builder().nutrition(3).saturationModifier(0.6F).build();

    public static final Consumable RAW_CALAMARI_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(1.8F).build();

    public static final Consumable COOKED_CALAMARI_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(1.9F).build();
}
