package net.nrobot10.funky_fabric.item;


import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.nrobot10.funky_fabric.FunkyFabric;

public class ModItems {

    private static void addItemsToFirstItemGroup(FabricItemGroupEntries entries) {
        entries.add(Items.STONE);
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.tryParse(FunkyFabric.MOD_ID + ":" + name), item);
    }

    public static void registerModItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(ModItems::addItemsToFirstItemGroup);
    }
}