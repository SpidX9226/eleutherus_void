package com.spidx.eleutherus_void_mod.datagen;

import com.spidx.eleutherus_void_mod.block.ModBlocks;
import com.spidx.eleutherus_void_mod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool eleutherusPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ELEUTHERUS_PLANKS);
        BlockStateModelGenerator.BlockTexturePool voidPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.VOID_PLANKS);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ELEUTHERUS_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RANDOM_ORE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ELEUTHERUS_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TUNGSTEN_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_TUNGSTEN_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TUNGSTEN_ORE);

        eleutherusPool.stairs(ModBlocks.ELEUTHERUS_STAIRS);
        eleutherusPool.slab(ModBlocks.ELEUTHERUS_SLAB);
        eleutherusPool.button(ModBlocks.ELEUTHERUS_BUTTON);
        eleutherusPool.fence(ModBlocks.ELEUTHERUS_FENCE);
        eleutherusPool.fenceGate(ModBlocks.ELEUTHERUS_FENCE_GATE);
        eleutherusPool.pressurePlate(ModBlocks.ELEUTHERUS_PRESSURE_PLATE);

        blockStateModelGenerator.registerDoor(ModBlocks.ELEUTHERUS_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.ELEUTHERUS_TRAPDOOR);

        voidPool.stairs(ModBlocks.VOID_STAIRS);
        voidPool.slab(ModBlocks.VOID_SLAB);
        voidPool.button(ModBlocks.VOID_BUTTON);
        voidPool.fence(ModBlocks.VOID_FENCE);
        voidPool.fenceGate(ModBlocks.VOID_FENCE_GATE);
        voidPool.pressurePlate(ModBlocks.VOID_PRESSURE_PLATE);

        blockStateModelGenerator.registerDoor(ModBlocks.VOID_DOOR);

        blockStateModelGenerator.registerLog(ModBlocks.ELEUTHERUS_LOG).log(ModBlocks.ELEUTHERUS_LOG).wood(ModBlocks.ELEUTHERUS_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_ELEUTHERUS_LOG).log(ModBlocks.STRIPPED_ELEUTHERUS_LOG).wood(ModBlocks.STRIPPED_ELEUTHERUS_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ELEUTHERUS_WART);

        blockStateModelGenerator.registerLog(ModBlocks.VOID_LOG).log(ModBlocks.VOID_LOG).wood(ModBlocks.VOID_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_VOID_LOG).log(ModBlocks.STRIPPED_VOID_LOG).wood(ModBlocks.STRIPPED_VOID_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.VOID_LEAVES);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.VOID_SAND);

        voidPool.family(ModBlocks.VOID_FAMILY);
        eleutherusPool.family(ModBlocks.ELEUTHERUS_FAMILY);

        blockStateModelGenerator.registerTintableCross(ModBlocks.VOID_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(ModBlocks.VOID_BUSH, BlockStateModelGenerator.TintType.NOT_TINTED);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.ELEUTHERUS, Models.GENERATED);
        itemModelGenerator.register(ModItems.ELEUTHERUS_PIE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ELEUTHERUS_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPER_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.ELEUTHERUS_SMITHING_UPGRADE, Models.GENERATED);
        itemModelGenerator.register(ModItems.VOID_ALBINO_SPAWN_EGG, Models.GENERATED);

        itemModelGenerator.register(ModItems.TUNGSTEN_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_TUNGSTEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.TUNGSTEN_SCRAP, Models.GENERATED);
        itemModelGenerator.register(ModItems.TUNGSTEN_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);

        itemModelGenerator.register(ModItems.ELEUTHERUS_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ELEUTHERUS_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ELEUTHERUS_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ELEUTHERUS_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ELEUTHERUS_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.TUNGSTEN_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TUNGSTEN_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TUNGSTEN_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TUNGSTEN_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TUNGSTEN_HOE, Models.HANDHELD);


        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ELEUTHERUS_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ELEUTHERUS_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ELEUTHERUS_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ELEUTHERUS_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TUNGSTEN_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TUNGSTEN_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TUNGSTEN_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TUNGSTEN_BOOTS));

    }
}
