package com.spidx.eleutherus_void_mod.entity.custom;

import com.spidx.eleutherus_void_mod.entity.client.VoidAlbinoModel;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.feature.EndermanEyesFeatureRenderer;
import net.minecraft.client.render.entity.feature.EyesFeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.entity.model.EndermanEntityModel;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.Identifier;

@Environment(value= EnvType.CLIENT)
public class VoidAlbinoEyesFeature <T extends LivingEntity>
        extends EyesFeatureRenderer<T, VoidAlbinoModel<T>> {

    private static final RenderLayer SKIN = RenderLayer.getEyes(new Identifier("textures/entity/void_albino/void_albino_eyes.png"));

    public VoidAlbinoEyesFeature(FeatureRendererContext<T, VoidAlbinoModel<T>> featureRendererContext) {
        super(featureRendererContext);
    }

    @Override
    public RenderLayer getEyesTexture() {
        return SKIN;
    }
}
