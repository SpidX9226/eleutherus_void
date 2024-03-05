package com.spidx.eleutherus_void_mod.entity.client;

import com.spidx.eleutherus_void_mod.entity.custom.VoidAlbino;
import net.minecraft.block.BlockState;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.BlockRenderManager;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.util.math.RotationAxis;

public class VoidAlbinoBlockFeatureRender extends FeatureRenderer<VoidAlbino, VoidAlbinoModel<VoidAlbino>> {
    private final BlockRenderManager blockRenderManager;

    public VoidAlbinoBlockFeatureRender(FeatureRendererContext<VoidAlbino, VoidAlbinoModel<VoidAlbino>> context, BlockRenderManager blockRenderManager) {
        super(context);
        this.blockRenderManager = blockRenderManager;
    }

    @Override
    public void render(MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i, VoidAlbino voidAlbino, float f, float g, float h, float j, float k, float l) {
        BlockState blockState = voidAlbino.getCarriedBlock();
        if (blockState == null) {
            return;
        }
        matrixStack.push();
        matrixStack.translate(0.0f, 0.6875f, -0.75f);
        matrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(20.0f));
        matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(45.0f));
        matrixStack.translate(0.25f, 0.1875f, 0.25f);
        float m = 0.5f;
        matrixStack.scale(-0.5f, -0.5f, 0.5f);
        matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(90.0f));
        this.blockRenderManager.renderBlockAsEntity(blockState, matrixStack, vertexConsumerProvider, i, OverlayTexture.DEFAULT_UV);
        matrixStack.pop();
    }
}