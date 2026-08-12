package net.evilnotch.minecraftfriendly.sound;

import net.evilnotch.minecraftfriendly.MinecraftFriendly;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvent;

import static net.evilnotch.minecraftfriendly.MinecraftFriendly.MOD_ID;

public class ModSounds {

    public static final Holder.Reference<SoundEvent> TEST = registerJukeboxSong("test");

    private static Holder.Reference<SoundEvent> registerJukeboxSong(String name) {
        Identifier id = Identifier.fromNamespaceAndPath(MinecraftFriendly.MOD_ID, name);
        return Registry.registerForHolder(BuiltInRegistries.SOUND_EVENT, id, SoundEvent.createVariableRangeEvent(id));
    }

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.fromNamespaceAndPath(MinecraftFriendly.MOD_ID, name);
        return Registry.register(BuiltInRegistries.SOUND_EVENT, id, SoundEvent.createVariableRangeEvent(id));
    }

    public static void registerSounds(){
        MinecraftFriendly.LOGGER.info("Registering Sounds for " + MOD_ID + "!");
    }
}
