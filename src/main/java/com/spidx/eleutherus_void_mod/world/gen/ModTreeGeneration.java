package com.spidx.eleutherus_void_mod.world.gen;

import com.spidx.eleutherus_void_mod.world.ModPlacedFeature;
import com.spidx.eleutherus_void_mod.world.biome.ModBiomes;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class ModTreeGeneration {
    public static void generateTrees(){
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.VOID_GROVE),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeature.VOID_PLACED_KEY);
    }
}