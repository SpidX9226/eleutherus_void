package com.spidx.eleutherus_void_mod.datagen;

import com.spidx.eleutherus_void_mod.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.DIRT)
                .add(ModBlocks.VOID_NYLIUM);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.ELEUTHERUS_ORE)
                .add(ModBlocks.ELEUTHERUS_BLOCK)
                .add(ModBlocks.RANDOM_ORE_BLOCK);

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_4")))
                .add(ModBlocks.ELEUTHERUS_ORE)
                .add(ModBlocks.ELEUTHERUS_BLOCK);

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_5")))
                .add(ModBlocks.RANDOM_ORE_BLOCK);

        getOrCreateTagBuilder(BlockTags.BEACON_BASE_BLOCKS)
                .add(ModBlocks.ELEUTHERUS_BLOCK);

        getOrCreateTagBuilder(BlockTags.LOGS)
                .add(ModBlocks.VOID_LOG);

        getOrCreateTagBuilder(BlockTags.PLANKS)
                .add(ModBlocks.ELEUTHERUS_PLANKS)
                .add(ModBlocks.VOID_PLANKS);

        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.ELEUTHERUS_FENCE)
                .add(ModBlocks.VOID_FENCE);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.ELEUTHERUS_FENCE_GATE)
                .add(ModBlocks.VOID_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.VOID_SANDSTONE_WALL);
    }
}
