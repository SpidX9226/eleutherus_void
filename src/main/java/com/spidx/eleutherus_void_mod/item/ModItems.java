package com.spidx.eleutherus_void_mod.item;

import com.spidx.eleutherus_void_mod.Eleutherus_void_mod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item ELEUTHERUS = registerItem("eleutherus", new Item(new FabricItemSettings()));
    public static final Item ELEUTHERUS_PIE = registerItem("eleutherus_pie", new Item(new FabricItemSettings().food(ModFoodComponents.ELEUTHERUS_PIE)));

    public static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(Eleutherus_void_mod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        Eleutherus_void_mod.LOGGER.info("Registering Mod Items for " + Eleutherus_void_mod.MOD_ID);
    }
}
