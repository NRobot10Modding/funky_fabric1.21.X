package net.nrobot10.funky_fabric.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.nrobot10.funky_fabric.FunkyFabric;

public class ModItemGroups {

    public static final ItemGroup FUNKYFABRIC_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.tryParse(FunkyFabric.MOD_ID + ":" + "funkyfabric_item_group"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemgroup.test"))
                    .icon(() -> new ItemStack(Items.DIRT))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.WATCH);
                    })
                    .build());

    public static void registerItemGroups() {
        FunkyFabric.LOGGER.info("Registering Mod Item Groups for " + FunkyFabric.MOD_ID);
    }
}
