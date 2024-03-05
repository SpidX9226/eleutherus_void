package com.spidx.eleutherus_void_mod.entity.client;

import com.spidx.eleutherus_void_mod.Eleutherus_void_mod;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.feature.EyesFeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.entity.model.EndermanEntityModel;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.Identifier;

@Environment(value= EnvType.CLIENT)
public class VoidAlbinoEyesFeatureRender<T extends LivingEntity>
        extends EyesFeatureRenderer<T, VoidAlbinoModel<T>> {
    private static final RenderLayer SKIN = RenderLayer.getEyes(new Identifier (Eleutherus_void_mod.MOD_ID, ("textures/entity/void_albino/void_albino_eyes.png")));

    public VoidAlbinoEyesFeatureRender(FeatureRendererContext<T, VoidAlbinoModel<T>> featureRendererContext) {
        super(featureRendererContext);
    }

    @Override
    public RenderLayer getEyesTexture() {
        return SKIN;
    }
}