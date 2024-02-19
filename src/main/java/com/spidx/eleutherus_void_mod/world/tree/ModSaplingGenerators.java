package com.spidx.eleutherus_void_mod.world.tree;

import com.spidx.eleutherus_void_mod.world.ModConfiguredFeature;
import com.spidx.eleutherus_void_mod.world.ModPlacedFeature;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public class ModSaplingGenerators {
    public static final SaplingGenerator VOID =
            new SaplingGenerator("void", 0f, Optional.empty(),
                    Optional.empty(),
                    Optional.of(ModConfiguredFeature.VOID_KEY),
                    Optional.empty(),
                    Optional.empty(),
                    Optional.empty());
}
