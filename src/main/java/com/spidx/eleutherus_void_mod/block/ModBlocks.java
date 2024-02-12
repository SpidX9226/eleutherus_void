package com.spidx.eleutherus_void_mod.block;

import com.spidx.eleutherus_void_mod.Eleutherus_void_mod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block ELEUTHERUS_BLOCK = registerBlock("eleutherus_block",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).lightLevel(s -> 5)));

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
