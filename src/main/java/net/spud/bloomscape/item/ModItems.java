package net.spud.bloomscape.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.spud.bloomscape.Bloomscape;

public class ModItems {

    public static final Item DREAMERS_DUST = registerItem("dreamers_dust", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM,Identifier.of(Bloomscape.MOD_ID,"dreamers_dust")))));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(Bloomscape.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Bloomscape.LOGGER.info("Registering Mod Items for " + Bloomscape.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(DREAMERS_DUST);
        });
    };
}
