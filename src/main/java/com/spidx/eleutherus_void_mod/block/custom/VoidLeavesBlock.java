package com.spidx.eleutherus_void_mod.block.custom;

import com.mojang.serialization.MapCodec;
import com.spidx.eleutherus_void_mod.particle.ModParticles;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.LeavesBlock;
import net.minecraft.client.util.ParticleUtil;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class VoidLeavesBlock extends LeavesBlock {
    public static final MapCodec<VoidLeavesBlock> CODEC = VoidLeavesBlock.createCodec(VoidLeavesBlock::new);

    public MapCodec<VoidLeavesBlock> getCodec() {
        return CODEC;
    }

    public VoidLeavesBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        super.randomDisplayTick(state, world, pos, random);
        if (random.nextInt(10) != 0) {
            return;
        }
        BlockPos blockPos = pos.down();
        BlockState blockState = world.getBlockState(blockPos);
        if (VoidLeavesBlock.isFaceFullSquare(blockState.getCollisionShape(world, blockPos), Direction.UP)) {
            return;
        }
        ParticleUtil.spawnParticle(world, pos, random, ModParticles.VOID_LEAVES_PARTICLE);
    }
}

