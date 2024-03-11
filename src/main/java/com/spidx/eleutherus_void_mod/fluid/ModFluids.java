package com.spidx.eleutherus_void_mod.fluid;

import com.spidx.eleutherus_void_mod.Eleutherus_void_mod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModFluids {
    public static FlowableFluid STILL_PORTAL_FLUID;
    public static FlowableFluid FLOWING_PORTAL_FLUID;
    public static Block PORTAL_FLUID_BLOCK;
    public static Item PORTAL_FLUID_BUCKET;

    public static void register(){
        STILL_PORTAL_FLUID = Registry.register(Registries.FLUID,
                new Identifier(Eleutherus_void_mod.MOD_ID, "portal_fluid"), new PortalFluid.Still());
        FLOWING_PORTAL_FLUID = Registry.register(Registries.FLUID,
                new Identifier(Eleutherus_void_mod.MOD_ID, "flowing_portal_fluid"), new PortalFluid.Flowing());

        PORTAL_FLUID_BLOCK = Registry.register(Registries.BLOCK, new Identifier(Eleutherus_void_mod.MOD_ID, "portal_fluid_block"),
                new FluidBlock(ModFluids.STILL_PORTAL_FLUID, FabricBlockSettings.copyOf(Blocks.LAVA)));
        PORTAL_FLUID_BUCKET = Registry.register(Registries.ITEM, new Identifier(Eleutherus_void_mod.MOD_ID, "portal_fluid_bucket"),
                new BucketItem(ModFluids.STILL_PORTAL_FLUID, new FabricItemSettings().maxCount(1)));
    }
}
