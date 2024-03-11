package com.spidx.eleutherus_void_mod;

import com.spidx.eleutherus_void_mod.block.ModBlocks;
import com.spidx.eleutherus_void_mod.entity.ModEntities;
import com.spidx.eleutherus_void_mod.entity.client.ModModelLayers;
import com.spidx.eleutherus_void_mod.entity.client.VoidAlbinoModel;
import com.spidx.eleutherus_void_mod.entity.client.VoidAlbinoRender;
import com.spidx.eleutherus_void_mod.fluid.ModFluids;
import com.spidx.eleutherus_void_mod.particle.ModParticles;
import com.spidx.eleutherus_void_mod.particle.custom.VoidAlbinoParticle;
import com.spidx.eleutherus_void_mod.particle.custom.VoidLeaves;
import com.terraformersmc.terraform.sign.SpriteIdentifierRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.particle.SweepAttackParticle;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.TexturedRenderLayers;
import net.minecraft.client.util.SpriteIdentifier;
import net.minecraft.fluid.Fluid;
import net.minecraft.util.Identifier;

public class Eleutherus_void_modClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ELEUTHERUS_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ELEUTHERUS_TRAPDOOR, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.VOID_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.VOID_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.VOID_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.VOID_PETALS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ELEUTHERUS_LANTERN, RenderLayer.getCutout());

        SpriteIdentifierRegistry.INSTANCE.addIdentifier(new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, ModBlocks.VOID_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier(new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, ModBlocks.VOID_HANGING_SIGN_TEXTURE));

        SpriteIdentifierRegistry.INSTANCE.addIdentifier(new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, ModBlocks.ELEUTHERUS_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier(new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, ModBlocks.ELEUTHERUS_HANGING_SIGN_TEXTURE));

        ParticleFactoryRegistry.getInstance().register(ModParticles.VOID_LEAVES_PARTICLE,
                VoidLeaves.Factory::new);

        ParticleFactoryRegistry.getInstance().register(ModParticles.VOID_ALBINO_PARTICLE,
                VoidAlbinoParticle.Factory::new);

        ParticleFactoryRegistry.getInstance().register(ModParticles.MOON_SWEEP, SweepAttackParticle.Factory::new);

        EntityRendererRegistry.register(ModEntities.VOID_ALBINO,
                VoidAlbinoRender::new);

        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.VOID_ALBINO,
                VoidAlbinoModel::getTexturesModelData);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_PORTAL_FLUID, ModFluids.FLOWING_PORTAL_FLUID,
                new SimpleFluidRenderHandler(
                        new Identifier("eleutherus_void_mod:block/portal_fluid"),
                        new Identifier("eleutherus_void_mod:block/flowing_portal_fluid")
                ));

        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
                ModFluids.STILL_PORTAL_FLUID, ModFluids.FLOWING_PORTAL_FLUID);
    }

}
