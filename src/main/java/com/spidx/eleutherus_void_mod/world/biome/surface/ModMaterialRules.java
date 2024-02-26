package com.spidx.eleutherus_void_mod.world.biome.surface;

import com.spidx.eleutherus_void_mod.block.ModBlocks;
import com.spidx.eleutherus_void_mod.world.biome.ModBiomes;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;

public class   ModMaterialRules {
    private static final MaterialRules.MaterialRule DIRT = makeStateRule(ModBlocks.VOID_SAND);
    private static final MaterialRules.MaterialRule GRASS_BLOCK = makeStateRule(ModBlocks.VOID_NYLIUM);

    public static MaterialRules.MaterialRule makeRules() {
        MaterialRules.MaterialCondition isAtOrAboveWaterLevel = MaterialRules.water(-1, 0);

        MaterialRules.MaterialRule grassSurface = MaterialRules.sequence(MaterialRules.condition(isAtOrAboveWaterLevel, GRASS_BLOCK), DIRT);

        return MaterialRules.sequence(
                // Default to a grass and dirt surface
                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, grassSurface)
        );
    }

    private static MaterialRules.MaterialRule makeStateRule(Block block) {
        return MaterialRules.block(block.getDefaultState());
    }
}
