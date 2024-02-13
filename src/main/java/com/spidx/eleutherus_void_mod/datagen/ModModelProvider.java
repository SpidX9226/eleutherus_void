package com.spidx.eleutherus_void_mod.datagen;

import com.spidx.eleutherus_void_mod.block.ModBlocks;
import com.spidx.eleutherus_void_mod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool eleutherusPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ELEUTHERUS_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ELEUTHERUS_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ELEUTHERUS_BLOCK);

        eleutherusPool.stairs(ModBlocks.ELEUTHERUS_STAIRS);
        eleutherusPool.slab(ModBlocks.ELEUTHERUS_SLAB);
        eleutherusPool.button(ModBlocks.ELEUTHERUS_BUTTON);
        eleutherusPool.fence(ModBlocks.ELEUTHERUS_FENCE);
        eleutherusPool.fenceGate(ModBlocks.ELEUTHERUS_FENCE_GATE);
        eleutherusPool.pressurePlate(ModBlocks.ELEUTHERUS_PRESSURE_PLATE);

        blockStateModelGenerator.registerDoor(ModBlocks.ELEUTHERUS_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.ELEUTHERUS_TRAPDOOR);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.ELEUTHERUS, Models.GENERATED);
        itemModelGenerator.register(ModItems.ELEUTHERUS_PIE, Models.GENERATED);
    }
}
