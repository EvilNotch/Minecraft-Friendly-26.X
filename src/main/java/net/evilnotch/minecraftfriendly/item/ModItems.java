package net.evilnotch.minecraftfriendly.item;

import net.evilnotch.minecraftfriendly.MinecraftFriendly;
import net.evilnotch.minecraftfriendly.datagen.ModJukeboxSongs;
import net.evilnotch.minecraftfriendly.food.ModFoods;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.*;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.equipment.ArmorType;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;


public class ModItems {
    public static final Item RAW_CALAMARI = registerItem("raw_calamari", properties -> new Item(properties
            .food(ModFoods.RAW_CALAMARI, ModFoods.RAW_CALAMARI_CONSUMABLE)));

    public static final Item COOKED_CALAMARI = registerItem("cooked_calamari", properties -> new Item(properties
            .food(ModFoods.COOKED_CALAMARI, ModFoods.COOKED_CALAMARI_CONSUMABLE)));

    public static final Item PRISMARINE = registerItem("prismarine", properties -> new Item(properties.fireResistant()));

    public static final Item RUBY = registerItem("ruby", properties -> new Item(properties.stacksTo(64)) {
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
            builder.accept(Component.translatable("tooltip.minecraftfriendly.ruby"));
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }
    });

    public static final Item INDEPENDENT_ACCIDENT = registerItem("independent_accident", properties -> new Item(properties.stacksTo(1)
            .jukeboxPlayable(ModJukeboxSongs.INDEPENDENT_ACCIDENT_KEY).rarity(Rarity.UNCOMMON)));

    public static final Item LONGER_STRING = registerItem("longer_string", Item::new);

    public static final Item EMERALD_SWORD = registerItem("emerald_sword", properties -> new Item(properties.sword(ModToolMaterials.EMERALD,
            3.5F, -2.2F)));

    public static final Item EMERALD_SHOVEL = registerItem("emerald_shovel", properties -> new ShovelItem(ModToolMaterials.EMERALD,
            1.5F, -2.8F, properties));

    public static final Item EMERALD_PICKAXE = registerItem("emerald_pickaxe", properties -> new Item(properties.pickaxe(ModToolMaterials.EMERALD,
            1F, -2.6F)));

    public static final Item EMERALD_AXE = registerItem("emerald_axe", properties -> new AxeItem(ModToolMaterials.EMERALD,
            6.0F, -3.0F, properties));

    public static final Item EMERALD_HOE = registerItem("emerald_hoe", properties -> new HoeItem(ModToolMaterials.EMERALD,
            0.0F, -2.0F, properties));

    public static final Item EMERALD_SPEAR = registerItem("emerald_spear", properties -> new Item(properties.spear(ModToolMaterials.EMERALD,
            0.95F, 0.9F,
            0.65F, 3.5F,
            13.0F, 8.5F,
            5.1F, 13.75F,
            5.0F)));

    public static final Item EMERALD_HELMET = registerItem("emerald_helmet", properties -> new Item(properties.humanoidArmor(ModArmorMaterials.EMERALD_ARMOR_MATERIAL,
            ArmorType.HELMET)));

    public static final Item EMERALD_CHESTPLATE = registerItem("emerald_chestplate", properties -> new Item(properties.humanoidArmor(ModArmorMaterials.EMERALD_ARMOR_MATERIAL,
            ArmorType.CHESTPLATE)));

    public static final Item EMERALD_LEGGINGS = registerItem("emerald_leggings", properties -> new Item(properties.humanoidArmor(ModArmorMaterials.EMERALD_ARMOR_MATERIAL,
            ArmorType.LEGGINGS)));

    public static final Item EMERALD_BOOTS = registerItem("emerald_boots", properties -> new Item(properties.humanoidArmor(ModArmorMaterials.EMERALD_ARMOR_MATERIAL,
            ArmorType.BOOTS)));


    public static final Item EMERALD_UPGRADE_SMITHING_TEMPLATE = registerItem("emerald_upgrade_smithing_template", properties ->
            new Item(properties.stacksTo(64)));



    //public static final Item EMERALD_UPGRADE_SMITHING_TEMPLATE = registerItem("emerald_upgrade_smithing_template",
      //      properties -> new SmithingTemplateItem(Component.translatable("minecraftfriendly.smithing_template.emerald_upgrade.applies_to"),
        //    Component.translatable("minecraftfriendly.smithing_template.emerald_upgrade.ingredients"),
          //          Component.translatable("minecraftfriendly.smithing_template.emerald_upgrade.base_slot"),
            //        Component.translatable("minecraftfriendly.smithing_template.emerald_upgrade.additions_slot_description"),
              //      BasicUpgradeIconList(), EmeraldUpgradeMaterialList(), properties.stacksTo(64)));


    private static List<Identifier> BasicUpgradeIconList() {
        return List.of(
                EMPTY_SLOT_HELMET,
                EMPTY_SLOT_SWORD,
                EMPTY_SLOT_CHESTPLATE,
                EMPTY_SLOT_PICKAXE,
                EMPTY_SLOT_LEGGINGS,
                EMPTY_SLOT_AXE,
                EMPTY_SLOT_BOOTS,
                EMPTY_SLOT_HOE,
                EMPTY_SLOT_SHOVEL,
                EMPTY_SLOT_SPEAR
        );
    }

    private static List<Identifier> EmeraldUpgradeMaterialList() {
        return List.of(EMPTY_SLOT_EMERALD);
    }

    private static final Identifier EMPTY_SLOT_EMERALD
            = Identifier.withDefaultNamespace("container/slot/emerald");

    private static final Identifier EMPTY_SLOT_SWORD
            = Identifier.withDefaultNamespace("container/slot/sword");
    private static final Identifier EMPTY_SLOT_PICKAXE
            = Identifier.withDefaultNamespace("container/slot/pickaxe");
    private static final Identifier EMPTY_SLOT_AXE
            = Identifier.withDefaultNamespace("container/slot/axe");
    private static final Identifier EMPTY_SLOT_HOE
            = Identifier.withDefaultNamespace("container/slot/hoe");
    private static final Identifier EMPTY_SLOT_SHOVEL
            = Identifier.withDefaultNamespace("container/slot/shovel");
    private static final Identifier EMPTY_SLOT_SPEAR
            = Identifier.withDefaultNamespace("container/slot/spear");
    private static final Identifier EMPTY_SLOT_HELMET
            = Identifier.withDefaultNamespace("container/slot/helmet");
    private static final Identifier EMPTY_SLOT_CHESTPLATE
            = Identifier.withDefaultNamespace("container/slot/chestplate");
    private static final Identifier EMPTY_SLOT_LEGGINGS
            = Identifier.withDefaultNamespace("container/slot/leggings");
    private static final Identifier EMPTY_SLOT_BOOTS
            = Identifier.withDefaultNamespace("container/slot/boots");

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

            output.insertBefore(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, ModItems.EMERALD_UPGRADE_SMITHING_TEMPLATE);
        });

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(output -> {
            output.insertAfter(Items.GOLDEN_HOE, ModItems.EMERALD_SHOVEL);
            output.insertAfter(ModItems.EMERALD_SHOVEL, ModItems.EMERALD_PICKAXE);
            output.insertAfter(ModItems.EMERALD_PICKAXE, ModItems.EMERALD_AXE);
            output.insertAfter(ModItems.EMERALD_AXE, ModItems.EMERALD_HOE);

            output.insertAfter(Items.MUSIC_DISC_MALL, ModItems.INDEPENDENT_ACCIDENT);
        });

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.COMBAT).register(output -> {
            output.insertAfter(Items.GOLDEN_SWORD, ModItems.EMERALD_SWORD);
            output.insertAfter(Items.GOLDEN_SPEAR, ModItems.EMERALD_SPEAR);
            output.insertAfter(Items.GOLDEN_AXE, ModItems.EMERALD_AXE);

            output.insertAfter(Items.GOLDEN_BOOTS, ModItems.EMERALD_HELMET);
            output.insertAfter(ModItems.EMERALD_HELMET, ModItems.EMERALD_CHESTPLATE);
            output.insertAfter(ModItems.EMERALD_CHESTPLATE, ModItems.EMERALD_LEGGINGS);
            output.insertAfter(ModItems.EMERALD_LEGGINGS, ModItems.EMERALD_BOOTS);
        });

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.SEARCH).register(output -> {
           //TBC
        });
    }

}
