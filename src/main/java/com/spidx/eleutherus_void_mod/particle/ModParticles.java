package com.spidx.eleutherus_void_mod.particle;

import com.spidx.eleutherus_void_mod.Eleutherus_void_mod;
import com.spidx.eleutherus_void_mod.particle.custom.VoidAlbinoParticle;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.client.particle.FlameParticle;
import net.minecraft.client.particle.SpriteProvider;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModParticles {
    public static final DefaultParticleType VOID_LEAVES_PARTICLE = FabricParticleTypes.simple();
    public static final DefaultParticleType VOID_ALBINO_PARTICLE = FabricParticleTypes.simple();
    public static final DefaultParticleType MOON_SWEEP = FabricParticleTypes.simple();
    protected ClientWorld world;
    public static void registerParticles(){
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(Eleutherus_void_mod.MOD_ID, "void_leaves_particle"),
                VOID_LEAVES_PARTICLE);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(Eleutherus_void_mod.MOD_ID, "void_albino_particle"),
                VOID_ALBINO_PARTICLE);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(Eleutherus_void_mod.MOD_ID, "moon_sweep"),
                MOON_SWEEP);
    }
}
