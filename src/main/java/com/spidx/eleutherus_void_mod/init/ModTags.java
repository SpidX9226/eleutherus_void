package com.spidx.eleutherus_void_mod.init;

import com.spidx.eleutherus_void_mod.Eleutherus_void_mod;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;

public interface ModTags {

    TagKey<Biome> IS_OUTER_END = createBiome("is_outer_end");
    TagKey<Biome> IS_INNER_END = createBiome("is_inner_end");

    private static TagKey<Biome> createBiome(String id) {
        return TagKey.of(RegistryKeys.BIOME, new Identifier(Eleutherus_void_mod.MOD_ID, id));
    }
}
