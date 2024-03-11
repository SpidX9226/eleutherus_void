package com.spidx.eleutherus_void_mod.fluid;

import net.minecraft.fluid.FlowableFluid;
import net.minecraft.world.WorldView;

public abstract class VoidFluid extends FlowableFluid {


    @Override
    protected int getFlowSpeed(WorldView world) {
        return world.getDimension().hasSkyLight() ? 2:4;
    }
}
