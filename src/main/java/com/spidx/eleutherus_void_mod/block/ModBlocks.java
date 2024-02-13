package com.spidx.eleutherus_void_mod.block;

import com.spidx.eleutherus_void_mod.Eleutherus_void_mod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    public static final Block ELEUTHERUS_BLOCK = registerBlock("eleutherus_block",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).lightLevel(s -> 7)));

    public static final Block ELEUTHERUS_ORE = registerBlock("eleutherus_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(6, 8), FabricBlockSettings.copyOf(Blocks.DEEPSLATE_DIAMOND_ORE).lightLevel(s -> 5).sounds(BlockSoundGroup.STONE)));
    public static final Block ELEUTHERUS_PLANKS = registerBlock("eleutherus_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS).lightLevel(s -> 5)));

    public static final Block ELEUTHERUS_STAIRS = registerBlock("eleutherus_stairs",
            new StairsBlock(ModBlocks.ELEUTHERUS_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS).lightLevel(s -> 5)));
    public static final Block ELEUTHERUS_SLAB = registerBlock("eleutherus_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS).lightLevel(s -> 5)));

    public static final Block ELEUTHERUS_BUTTON = registerBlock("eleutherus_button",
            new ButtonBlock(BlockSetType.WARPED, 10, FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS).lightLevel(s -> 5)));
    public static final Block ELEUTHERUS_PRESSURE_PLATE = registerBlock("eleutherus_pressure_plate",
            new PressurePlateBlock(BlockSetType.WARPED,FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS).lightLevel(s -> 5)));

    public static final Block ELEUTHERUS_FENCE = registerBlock("eleutherus_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS).lightLevel(s -> 5)));
    public static final Block ELEUTHERUS_FENCE_GATE = registerBlock("eleutherus_fence_gate",
            new FenceGateBlock(WoodType.WARPED ,FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS).lightLevel(s -> 5)));

    public static final Block ELEUTHERUS_DOOR = registerBlock("eleutherus_door",
            new DoorBlock(BlockSetType.WARPED, FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS).nonOpaque().lightLevel(s -> 5)));

    public static final Block ELEUTHERUS_TRAPDOOR = registerBlock("eleutherus_trapdoor",
            new TrapdoorBlock(BlockSetType.WARPED, FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS).nonOpaque().lightLevel(s -> 5)));

    private static Block registerBlock(String name, Block block){
        RegisterBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Eleutherus_void_mod.MOD_ID, name), block);
    }

    private static Item RegisterBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(Eleutherus_void_mod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks(){
        Eleutherus_void_mod.LOGGER.info("Registering ModBlocks for " + Eleutherus_void_mod.MOD_ID);
    }
}
