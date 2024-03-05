package com.spidx.eleutherus_void_mod.entity;

import com.spidx.eleutherus_void_mod.Eleutherus_void_mod;
import com.spidx.eleutherus_void_mod.entity.custom.VoidAlbino;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.client.render.entity.EndermanEntityRenderer;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<VoidAlbino> VOID_ALBINO = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(Eleutherus_void_mod.MOD_ID, "void_albino"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, VoidAlbino::new).dimensions(EntityDimensions.fixed(0.6f,2.9f)).build());
}
