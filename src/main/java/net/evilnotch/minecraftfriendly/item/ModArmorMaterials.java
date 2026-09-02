package net.evilnotch.minecraftfriendly.item;

import net.evilnotch.minecraftfriendly.MinecraftFriendly;
import net.evilnotch.minecraftfriendly.tags.ModTags;
import net.minecraft.core.Registry;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorMaterials;
import net.minecraft.world.item.equipment.EquipmentAsset;

public class ModArmorMaterials {
    public static final ResourceKey<? extends Registry<EquipmentAsset>> REGISTRY_KEY =
            ResourceKey.createRegistryKey(Identifier.withDefaultNamespace("equipment_asset"));

    public static final ResourceKey<EquipmentAsset> EMERALD_KEY =
            ResourceKey.create(REGISTRY_KEY, Identifier.fromNamespaceAndPath(MinecraftFriendly.MOD_ID, "emerald"));

    public static final ArmorMaterial EMERALD_ARMOR_MATERIAL = new ArmorMaterial(12,
            ArmorMaterials.makeDefense(1, 3, 4, 2, 4), 28, SoundEvents.ARMOR_EQUIP_GOLD, 0F, 0.1F,
            ModTags.Items.REPAIRS_EMERALD_ARMOR, EMERALD_KEY);
}
