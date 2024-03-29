package com.spidx.eleutherus_void_mod.particle.custom;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.particle.*;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particle.DefaultParticleType;
import org.jetbrains.annotations.Nullable;

@Environment(value= EnvType.CLIENT)
public class VoidLeaves extends SpriteBillboardParticle {

    private static final float field_43372 = 0.0025f;
    private static final int field_43373 = 300;
    private static final int field_43366 = 300;
    private static final float field_43367 = 0.25f;
    private static final float field_43368 = 2.0f;
    public static Object Factory;
    private float field_43369;
    private final float field_43370;
    private final float field_43371;

    public VoidLeaves(ClientWorld world, double x, double y, double z, SpriteProvider spriteProvider, double velocityX, double velocityY, double velocityZ) {
        super(world, x, y, z);
        float f;
        this.setSprite(spriteProvider.getSprite(this.random.nextInt(12), 12));
        this.field_43369 = (float)Math.toRadians(this.random.nextBoolean() ? -30.0 : 30.0);
        this.field_43370 = this.random.nextFloat();
        this.field_43371 = (float)Math.toRadians(this.random.nextBoolean() ? -5.0 : 5.0);
        this.maxAge = 300;
        this.gravityStrength = 7.5E-4f;
        this.scale = f = this.random.nextBoolean() ? 0.05f : 0.075f;
        this.setBoundingBoxSpacing(f, f);
        this.velocityMultiplier = 1.0f;
    }

    @Override
    public ParticleTextureSheet getType() {
        return ParticleTextureSheet.PARTICLE_SHEET_OPAQUE;
    }

    @Override
    public void tick() {
        this.prevPosX = this.x;
        this.prevPosY = this.y;
        this.prevPosZ = this.z;
        if (this.maxAge-- <= 0) {
            this.markDead();
        }
        if (this.dead) {
            return;
        }
        float f = 300 - this.maxAge;
        float g = Math.min(f / 300.0f, 1.0f);
        double d = Math.cos(Math.toRadians(this.field_43370 * 60.0f)) * 2.0 * Math.pow(g, 1.25);
        double e = Math.sin(Math.toRadians(this.field_43370 * 60.0f)) * 2.0 * Math.pow(g, 1.25);
        this.velocityX += d * (double)0.0025f;
        this.velocityZ += e * (double)0.0025f;
        this.velocityY -= (double)this.gravityStrength;
        this.field_43369 += this.field_43371 / 20.0f;
        this.prevAngle = this.angle;
        this.angle += this.field_43369 / 20.0f;
        this.move(this.velocityX, this.velocityY, this.velocityZ);
        if (this.onGround || this.maxAge < 299 && (this.velocityX == 0.0 || this.velocityZ == 0.0)) {
            this.markDead();
        }
        if (this.dead) {
            return;
        }
        this.velocityX *= (double)this.velocityMultiplier;
        this.velocityY *= (double)this.velocityMultiplier;
        this.velocityZ *= (double)this.velocityMultiplier;
    }

    @Environment(EnvType.CLIENT)
    public static class Factory implements ParticleFactory<DefaultParticleType>{

        private final SpriteProvider sprites;

        public Factory(SpriteProvider spriteSet){
            this.sprites = spriteSet;
        }

        @Nullable
        @Override
        public Particle createParticle(DefaultParticleType parameters, ClientWorld world, double x, double y, double z, double velocityX, double velocityY, double velocityZ) {
            return new VoidLeaves(world, x, y, z, this.sprites, velocityX, velocityY, velocityZ);
        }
    }

}
