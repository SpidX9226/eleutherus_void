package com.spidx.eleutherus_void_mod.item;

import com.spidx.eleutherus_void_mod.Eleutherus_void_mod;
import com.spidx.eleutherus_void_mod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ELEUTHERUS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Eleutherus_void_mod.MOD_ID, "eleutherus"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.eleutherus_void"))
                    .icon(() -> new ItemStack(ModItems.ELEUTHERUS)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.ELEUTHERUS_ORE);
                        entries.add(ModItems.ELEUTHERUS);
                        entries.add(ModBlocks.ELEUTHERUS_BLOCK);
                        entries.add(ModItems.ELEUTHERUS_PICKAXE);
                        entries.add(ModItems.ELEUTHERUS_SWORD);
                        entries.add(ModItems.ELEUTHERUS_AXE);
                        entries.add(ModItems.ELEUTHERUS_SHOVEL);
                        entries.add(ModItems.ELEUTHERUS_HOE);
                        entries.add(ModItems.ELEUTHERUS_HELMET);
                        entries.add(ModItems.ELEUTHERUS_CHESTPLATE);
                        entries.add(ModItems.ELEUTHERUS_LEGGINGS);
                        entries.add(ModItems.ELEUTHERUS_BOOTS);


                        entries.add(ModItems.ELEUTHERUS_DUST);
                        entries.add(ModItems.ELEUTHERUS_SMITHING_UPGRADE);
                        entries.add(ModItems.COPPER_DUST);
                        entries.add(ModItems.ELEUTHERUS_PIE);

                        entries.add(ModBlocks.ELEUTHERUS_LOG);
                        entries.add(ModBlocks.STRIPPED_ELEUTHERUS_LOG);
                        entries.add(ModBlocks.ELEUTHERUS_WOOD);
                        entries.add(ModBlocks.STRIPPED_ELEUTHERUS_WOOD);
                        entries.add(ModBlocks.ELEUTHERUS_WART);
                        entries.add(ModBlocks.ELEUTHERUS_SLAB);
                        entries.add(ModBlocks.ELEUTHERUS_STAIRS);
                        entries.add(ModBlocks.ELEUTHERUS_DOOR);
                        entries.add(ModBlocks.ELEUTHERUS_TRAPDOOR);
                        entries.add(ModBlocks.ELEUTHERUS_FENCE);
                        entries.add(ModBlocks.ELEUTHERUS_FENCE_GATE);
                        entries.add(ModBlocks.ELEUTHERUS_BUTTON);
                        entries.add(ModBlocks.ELEUTHERUS_PRESSURE_PLATE);

                        entries.add(ModItems.ELEUTHERUS_SIGN);
                        entries.add(ModItems.HANGING_ELEUTHERUS_SIGN);

                        entries.add(ModBlocks.VOID_LOG);
                        entries.add(ModBlocks.VOID_WOOD);
                        entries.add(ModBlocks.STRIPPED_VOID_LOG);
                        entries.add(ModBlocks.STRIPPED_VOID_WOOD);
                        entries.add(ModBlocks.VOID_LEAVES);

                        entries.add(ModBlocks.VOID_PLANKS);
                        entries.add(ModBlocks.VOID_SLAB);
                        entries.add(ModBlocks.VOID_STAIRS);
                        entries.add(ModBlocks.VOID_DOOR);
                        entries.add(ModBlocks.VOID_TRAPDOOR);
                        entries.add(ModBlocks.VOID_FENCE);
                        entries.add(ModBlocks.VOID_FENCE_GATE);
                        entries.add(ModBlocks.VOID_BUTTON);
                        entries.add(ModBlocks.VOID_PRESSURE_PLATE);

                        entries.add(ModItems.VOID_SIGN);
                        entries.add(ModItems.HANGING_VOID_SIGN);

                        entries.add(ModItems.VOID_DESTROYER_BLADE);

                    }).build());
    public static void registerItemGroups(){
        Eleutherus_void_mod.LOGGER.info("Registering Item Groups for " + Eleutherus_void_mod.MOD_ID);
    }


}
