package com.spidx.eleutherus_void_mod.datagen;

import com.spidx.eleutherus_void_mod.block.ModBlocks;
import com.spidx.eleutherus_void_mod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.ELEUTHERUS_HELMET)
                .add(ModItems.TUNGSTEN_HELMET)
                .add(ModItems.ELEUTHERUS_CHESTPLATE)
                .add(ModItems.TUNGSTEN_CHESTPLATE)
                .add(ModItems.ELEUTHERUS_LEGGINGS)
                .add(ModItems.TUNGSTEN_LEGGINGS)
                .add(ModItems.ELEUTHERUS_BOOTS)
                .add(ModItems.TUNGSTEN_BOOTS);

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(ModBlocks.ELEUTHERUS_PLANKS.asItem())
                .add(ModBlocks.VOID_PLANKS.asItem());

        getOrCreateTagBuilder(ItemTags.BEACON_PAYMENT_ITEMS)
                .add(ModItems.ELEUTHERUS)
                .add(ModItems.TUNGSTEN_INGOT);

    }
}
