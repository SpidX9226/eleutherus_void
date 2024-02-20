package com.spidx.eleutherus_void_mod.entity.client;

import com.spidx.eleutherus_void_mod.Eleutherus_void_mod;
import com.spidx.eleutherus_void_mod.entity.custom.VoidAlbino;
import net.minecraft.block.BlockState;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.random.Random;


public class VoidAlbinoRender extends MobEntityRenderer<VoidAlbino, VoidAlbinoModel<VoidAlbino>> {

    private static final Identifier TEXTURE = new Identifier(Eleutherus_void_mod.MOD_ID, "textures/entity/void_albino.png");
    private final Random random = Random.create();

    public VoidAlbinoRender(EntityRendererFactory.Context context) {
        super(context, new VoidAlbinoModel<VoidAlbino>(context.getPart(ModModelLayers.VOID_ALBINO)), 0.5f);
        this.addFeature(new VoidAlbinoEyesFeatureRender<VoidAlbino>(this));
        this.addFeature(new VoidAlbinoBlockFeatureRender(this, context.getBlockRenderManager()));
    }

    @Override
    public void render(VoidAlbino voidAlbino, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        BlockState blockState = voidAlbino.getCarriedBlock();
        VoidAlbinoModel<VoidAlbino> voidAlbinoModel = (VoidAlbinoModel<VoidAlbino>)this.getModel();
        voidAlbinoModel.carryingBlock = blockState != null;
        voidAlbinoModel.angry = voidAlbino.isAngry();
        super.render(voidAlbino, f, g, matrixStack, vertexConsumerProvider, i);
    }

    @Override
    public Vec3d getPositionOffset(VoidAlbino entity, float f) {
        if (entity.isAngry()) {
            double d = 0.02;
            return new Vec3d(this.random.nextGaussian() * 0.02, 0.0, this.random.nextGaussian() * 0.02);
        }
        return super.getPositionOffset(entity, f);
    }

    @Override
    public Identifier getTexture(VoidAlbino entity) {
        return TEXTURE;
    }
}
