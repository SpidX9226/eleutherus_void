package com.spidx.eleutherus_void_mod.particle;

import com.spidx.eleutherus_void_mod.Eleutherus_void_mod;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModParticles {
    public static final DefaultParticleType VOID_LEAVES_PARTICLE = FabricParticleTypes.simple();

    public static void registerParticles(){
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(Eleutherus_void_mod.MOD_ID, "void_leaves_particle"),
                VOID_LEAVES_PARTICLE);
    }
}
