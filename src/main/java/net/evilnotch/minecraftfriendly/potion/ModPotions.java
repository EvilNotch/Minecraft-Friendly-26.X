package net.evilnotch.minecraftfriendly.potion;

import net.evilnotch.minecraftfriendly.MinecraftFriendly;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.alchemy.Potion;

public class ModPotions {


    public static final Holder<Potion> POTION_OF_DECAY = registerPotion("potion_of_decay",
            new Potion("potion_of_decay", new MobEffectInstance(MobEffects.WITHER, 800, 1)));
    private static Holder<Potion> registerPotion(String name, Potion potion) {
        return Registry.registerForHolder(BuiltInRegistries.POTION, Identifier.fromNamespaceAndPath(MinecraftFriendly.MOD_ID, name), potion);
    }
    public static void registerPotions() {
        MinecraftFriendly.LOGGER.info("Registering Potions for " + MinecraftFriendly.MOD_ID + "!");
    }
}
