package com.spidx.eleutherus_void_mod.block;

import com.spidx.eleutherus_void_mod.Eleutherus_void_mod;
import com.spidx.eleutherus_void_mod.block.custom.Eleutherus_wart_block;
import com.terraformersmc.terraform.sign.block.TerraformHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallSignBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;
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

    public static final Block ELEUTHERUS_LOG = registerBlock("eleutherus_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.WARPED_STEM).lightLevel(s -> 5)));
    public static final Block ELEUTHERUS_WOOD = registerBlock("eleutherus_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.WARPED_STEM).lightLevel(s -> 5)));
    public static final Block STRIPPED_ELEUTHERUS_LOG = registerBlock("stripped_eleutherus_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_WARPED_STEM).lightLevel(s -> 5)));
    public static final Block STRIPPED_ELEUTHERUS_WOOD = registerBlock("stripped_eleutherus_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_WARPED_STEM).lightLevel(s -> 5)));

    public static final Block ELEUTHERUS_WART = registerBlock("eleutherus_wart",
            new Eleutherus_wart_block(FabricBlockSettings.copyOf(Blocks.WARPED_WART_BLOCK).lightLevel(s -> 5)));

    public static final Block VOID_LOG = registerBlock("void_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_LOG).lightLevel(s -> 1)));
    public static final Block VOID_WOOD = registerBlock("void_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_WOOD).lightLevel(s -> 1)));
    public static final Block STRIPPED_VOID_LOG = registerBlock("stripped_void_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CHERRY_LOG).lightLevel(s -> 1)));
    public static final Block STRIPPED_VOID_WOOD = registerBlock("stripped_void_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CHERRY_WOOD).lightLevel(s -> 1)));

    public static final Block VOID_PLANKS = registerBlock("void_planks",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_LOG).lightLevel(s -> 5)));

    public static final Block VOID_LEAVES = registerBlock("void_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_LEAVES).nonOpaque().lightLevel(s -> 5).nonOpaque()));

    public static final Block VOID_STAIRS = registerBlock("void_stairs",
            new StairsBlock(ModBlocks.VOID_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS).lightLevel(s -> 5)));
    public static final Block VOID_SLAB = registerBlock("void_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS).lightLevel(s -> 5)));

    public static final Block VOID_BUTTON = registerBlock("void_button",
            new ButtonBlock(BlockSetType.CHERRY, 10, FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS).lightLevel(s -> 5)));
    public static final Block VOID_PRESSURE_PLATE = registerBlock("void_pressure_plate",
            new PressurePlateBlock(BlockSetType.CHERRY,FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS).lightLevel(s -> 5)));

    public static final Block VOID_FENCE = registerBlock("void_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS).lightLevel(s -> 5)));
    public static final Block VOID_FENCE_GATE = registerBlock("void_fence_gate",
            new FenceGateBlock(WoodType.CHERRY ,FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS).lightLevel(s -> 5)));

    public static final Block VOID_DOOR = registerBlock("void_door",
            new DoorBlock(BlockSetType.CHERRY, FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS).lightLevel(s -> 5)));

    public static final Block VOID_TRAPDOOR = registerBlock("void_trapdoor",
            new TrapdoorBlock(BlockSetType.CHERRY, FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS).nonOpaque().lightLevel(s -> 5)));

    public static final Identifier VOID_SIGN_TEXTURE = new Identifier(Eleutherus_void_mod.MOD_ID, "entity/signs/void");
    public static final Identifier VOID_HANGING_SIGN_TEXTURE = new Identifier(Eleutherus_void_mod.MOD_ID, "entity/signs/hanging/void");
    public static final Identifier VOID_HANGING_GUI_SIGN_TEXTURE = new Identifier(Eleutherus_void_mod.MOD_ID, "textures/gui/hanging_signs/void");

    public static final Block STANDING_VOID_SIGN = Registry.register(Registries.BLOCK, new Identifier(Eleutherus_void_mod.MOD_ID, "void_standing_sign"),
            new TerraformSignBlock(VOID_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.CHERRY_SIGN)));
    public static final Block WALL_VOID_SIGN = Registry.register(Registries.BLOCK, new Identifier(Eleutherus_void_mod.MOD_ID, "void_wall_sign"),
            new TerraformWallSignBlock(VOID_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.CHERRY_WALL_SIGN)));
    public static final Block HANGING_VOID_SIGN = Registry.register(Registries.BLOCK, new Identifier(Eleutherus_void_mod.MOD_ID, "void_hanging_sign"),
            new TerraformHangingSignBlock(VOID_HANGING_SIGN_TEXTURE,VOID_HANGING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.CHERRY_HANGING_SIGN)));
    public static final Block WALL_HANGING_VOID_SIGN = Registry.register(Registries.BLOCK, new Identifier(Eleutherus_void_mod.MOD_ID, "void_wall_hanging_sign"),
            new TerraformWallHangingSignBlock(VOID_HANGING_SIGN_TEXTURE,VOID_HANGING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.CHERRY_WALL_HANGING_SIGN)));

    public static final Identifier ELEUTHERUS_SIGN_TEXTURE = new Identifier(Eleutherus_void_mod.MOD_ID, "entity/signs/eleutherus");
    public static final Identifier ELEUTHERUS_HANGING_SIGN_TEXTURE = new Identifier(Eleutherus_void_mod.MOD_ID, "entity/signs/hanging/eleutherus");
    public static final Identifier ELEUTHERUS_HANGING_GUI_SIGN_TEXTURE = new Identifier(Eleutherus_void_mod.MOD_ID, "textures/gui/hanging_signs/eleutherus");

    public static final Block STANDING_ELEUTHERUS_SIGN = Registry.register(Registries.BLOCK, new Identifier(Eleutherus_void_mod.MOD_ID, "eleutherus_standing_sign"),
            new TerraformSignBlock(ELEUTHERUS_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.WARPED_SIGN)));
    public static final Block WALL_ELEUTHERUS_SIGN = Registry.register(Registries.BLOCK, new Identifier(Eleutherus_void_mod.MOD_ID, "eleutherus_wall_sign"),
            new TerraformWallSignBlock(ELEUTHERUS_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.WARPED_WALL_SIGN)));
    public static final Block HANGING_ELEUTHERUS_SIGN = Registry.register(Registries.BLOCK, new Identifier(Eleutherus_void_mod.MOD_ID, "eleutherus_hanging_sign"),
            new TerraformHangingSignBlock(ELEUTHERUS_HANGING_SIGN_TEXTURE,ELEUTHERUS_HANGING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.WARPED_HANGING_SIGN)));
    public static final Block WALL_HANGING_ELEUTHERUS_SIGN = Registry.register(Registries.BLOCK, new Identifier(Eleutherus_void_mod.MOD_ID, "eleutherus_wall_hanging_sign"),
            new TerraformWallHangingSignBlock(ELEUTHERUS_HANGING_SIGN_TEXTURE,ELEUTHERUS_HANGING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.WARPED_WALL_HANGING_SIGN)));

    public static final BlockFamily VOID_FAMILY = BlockFamilies.register(ModBlocks.VOID_PLANKS)
            .sign(ModBlocks.STANDING_VOID_SIGN, ModBlocks.WALL_VOID_SIGN)
            .group("wooden").unlockCriterionName("has_planks").build();

    public static final BlockFamily ELEUTHERUS_FAMILY = BlockFamilies.register(ModBlocks.ELEUTHERUS_PLANKS)
            .sign(ModBlocks.STANDING_ELEUTHERUS_SIGN, ModBlocks.WALL_ELEUTHERUS_SIGN)
            .group("wooden").unlockCriterionName("has_planks").build();

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
