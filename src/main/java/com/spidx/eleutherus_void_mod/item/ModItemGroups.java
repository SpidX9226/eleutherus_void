package com.spidx.eleutherus_void_mod.item;

import com.spidx.eleutherus_void_mod.Eleutherus_void_mod;
import com.spidx.eleutherus_void_mod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ELEUTHERUS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Eleutherus_void_mod.MOD_ID, "eleutherus"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.eleutherus_void"))
                    .icon(() -> new ItemStack(ModItems.ELEUTHERUS)).entries((displayContext, entries) -> {
                        entries.add(ModItems.ELEUTHERUS);

                        entries.add(ModBlocks.ELEUTHERUS_BLOCK);
                    }).build());
    public static void registerItemGroups(){
        Eleutherus_void_mod.LOGGER.info("Registering Item Groups for " + Eleutherus_void_mod.MOD_ID);
    }


}
