package net.moose.pizzlymod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.moose.pizzlymod.PizzlyMod;

public class ModItems {
    public static final Item PIZZLY_HIDE = registerItem("pizzly_hide", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(PizzlyMod.MOD_ID, "pizzly_hide")))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(PizzlyMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        PizzlyMod.LOGGER.info("Registering mod items for" + PizzlyMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(PIZZLY_HIDE);
        });
    }
}
