package net.evilnotch.minecraftfriendly.stat;

import net.evilnotch.minecraftfriendly.MinecraftFriendly;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.stats.Stat;
import net.minecraft.stats.StatFormatter;
import net.minecraft.stats.Stats;

public class ModStats {


    private static Stat<?> makeCustomStat(String key) {
        Identifier identifier = Identifier.fromNamespaceAndPath(MinecraftFriendly.MOD_ID, key);
        Identifier newStat = Registry.register(BuiltInRegistries.CUSTOM_STAT, key, identifier);

        return Stats.CUSTOM.get(newStat, StatFormatter.DEFAULT);
    }

    public static void registerStats() {
        MinecraftFriendly.LOGGER.info("Registering Stats for " + MinecraftFriendly.MOD_ID + "!");
    }
}
