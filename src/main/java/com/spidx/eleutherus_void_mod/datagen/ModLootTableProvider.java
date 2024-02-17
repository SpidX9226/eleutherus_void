package com.spidx.eleutherus_void_mod.datagen;

import com.spidx.eleutherus_void_mod.block.ModBlocks;
import com.spidx.eleutherus_void_mod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.ELEUTHERUS_BLOCK);

        addDrop(ModBlocks.ELEUTHERUS_PLANKS);
        addDrop(ModBlocks.ELEUTHERUS_STAIRS);
        addDrop(ModBlocks.ELEUTHERUS_BUTTON);
        addDrop(ModBlocks.ELEUTHERUS_PRESSURE_PLATE);
        addDrop(ModBlocks.ELEUTHERUS_FENCE);
        addDrop(ModBlocks.ELEUTHERUS_FENCE_GATE);
        addDrop(ModBlocks.ELEUTHERUS_TRAPDOOR);

        addDrop(ModBlocks.VOID_STAIRS);
        addDrop(ModBlocks.VOID_BUTTON);
        addDrop(ModBlocks.VOID_PRESSURE_PLATE);
        addDrop(ModBlocks.VOID_FENCE);
        addDrop(ModBlocks.VOID_FENCE_GATE);
        addDrop(ModBlocks.VOID_TRAPDOOR);

        addDrop(ModBlocks.ELEUTHERUS_DOOR, doorDrops(ModBlocks.ELEUTHERUS_DOOR));
        addDrop(ModBlocks.ELEUTHERUS_SLAB, slabDrops(ModBlocks.ELEUTHERUS_SLAB));

        addDrop(ModBlocks.VOID_DOOR, doorDrops(ModBlocks.VOID_DOOR));
        addDrop(ModBlocks.VOID_SLAB, slabDrops(ModBlocks.VOID_SLAB));

        addDrop(ModBlocks.ELEUTHERUS_ORE, oreDrops(ModBlocks.ELEUTHERUS_ORE, ModItems.ELEUTHERUS));

        addDrop(ModBlocks.ELEUTHERUS_LOG);
        addDrop(ModBlocks.ELEUTHERUS_WOOD);
        addDrop(ModBlocks.STRIPPED_ELEUTHERUS_LOG);
        addDrop(ModBlocks.STRIPPED_ELEUTHERUS_WOOD);
        addDrop(ModBlocks.ELEUTHERUS_WART);

        addDrop(ModBlocks.VOID_LOG);
        addDrop(ModBlocks.VOID_WOOD);
        addDrop(ModBlocks.STRIPPED_VOID_LOG);
        addDrop(ModBlocks.STRIPPED_VOID_WOOD);

        addDrop(ModBlocks.VOID_LEAVES, leavesDrops(ModBlocks.VOID_LEAVES, ModBlocks.ELEUTHERUS_BLOCK, 0.025f));
    }
}
