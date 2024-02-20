package com.spidx.eleutherus_void_mod.item;

import com.spidx.eleutherus_void_mod.Eleutherus_void_mod;
import com.spidx.eleutherus_void_mod.block.ModBlocks;
import com.spidx.eleutherus_void_mod.entity.ModEntities;
import com.spidx.eleutherus_void_mod.item.custom.ModArmorItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {
    public static final Item ELEUTHERUS = registerItem("eleutherus",
            new Item(new FabricItemSettings()));

    public static final Item ELEUTHERUS_DUST = registerItem("eleutherus_dust",
            new Item(new FabricItemSettings()));

    public static final Item COPPER_DUST = registerItem("copper_dust",
            new Item(new FabricItemSettings()));

    public static final Item ELEUTHERUS_SMITHING_UPGRADE  = registerItem("eleutherus_smithing_update",
            new Item(new FabricItemSettings()));

    public static final Item ELEUTHERUS_PIE = registerItem("eleutherus_pie",
            new Item(new FabricItemSettings().food(ModFoodComponents.ELEUTHERUS_PIE)));

    public static final Item VOID_ALBINO_SPAWN_EGG = registerItem("void_albino_spawn_egg",
            new SpawnEggItem(ModEntities.VOID_ALBINO, 0xe3ebff, 0x0d51ff, new FabricItemSettings()));

    public static final Item ELEUTHERUS_PICKAXE = registerItem("eleutherus_pickaxe",
            new PickaxeItem(ModToolMaterial.ELEUTHERUS, 2, -2.6f, new FabricItemSettings()));

    public static final Item ELEUTHERUS_SWORD = registerItem("eleutherus_sword",
            new SwordItem(ModToolMaterial.ELEUTHERUS, 3, -2.2f, new FabricItemSettings()));

    public static final Item ELEUTHERUS_AXE = registerItem("eleutherus_axe",
            new AxeItem(ModToolMaterial.ELEUTHERUS, 5, -2.8f, new FabricItemSettings()));

    public static final Item ELEUTHERUS_SHOVEL = registerItem("eleutherus_shovel",
            new ShovelItem(ModToolMaterial.ELEUTHERUS, 2, -2.8f, new FabricItemSettings()));

    public static final Item ELEUTHERUS_HOE = registerItem("eleutherus_hoe",
            new HoeItem(ModToolMaterial.ELEUTHERUS, -3, 0.2f, new FabricItemSettings()));

    public static final Item ELEUTHERUS_HELMET = registerItem("eleutherus_helmet",
            new ModArmorItem(ModArmorMaterials.ELEUTHERUS, ArmorItem.Type.HELMET, new FabricItemSettings()));

    public static final Item ELEUTHERUS_CHESTPLATE = registerItem("eleutherus_chestplate",
            new ModArmorItem(ModArmorMaterials.ELEUTHERUS, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));

    public static final Item ELEUTHERUS_LEGGINGS = registerItem("eleutherus_leggings",
            new ModArmorItem(ModArmorMaterials.ELEUTHERUS, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));

    public static final Item ELEUTHERUS_BOOTS = registerItem("eleutherus_boots",
            new ModArmorItem(ModArmorMaterials.ELEUTHERUS, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item VOID_SIGN = registerItem("void_sign",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.STANDING_VOID_SIGN, ModBlocks.WALL_VOID_SIGN));
    public static final Item HANGING_VOID_SIGN = registerItem("void_hanging_sign",
            new HangingSignItem(ModBlocks.HANGING_VOID_SIGN, ModBlocks.WALL_HANGING_VOID_SIGN, new FabricItemSettings().maxCount(16)));

    public static final Item ELEUTHERUS_SIGN = registerItem("eleutherus_sign",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.STANDING_ELEUTHERUS_SIGN, ModBlocks.WALL_ELEUTHERUS_SIGN));
    public static final Item HANGING_ELEUTHERUS_SIGN = registerItem("eleutherus_hanging_sign",
            new HangingSignItem(ModBlocks.HANGING_ELEUTHERUS_SIGN, ModBlocks.WALL_HANGING_ELEUTHERUS_SIGN, new FabricItemSettings().maxCount(16)));

    public static final Item VOID_DESTROYER_BLADE = registerItem("void_destroyer_blade",
            new PickaxeItem(ModToolMaterial.VOID, 3, -2f, new FabricItemSettings().rarity(Rarity.EPIC)));

    public static final Item VOID_REAVER_FLAMBERGE = registerItem("void_reaver_flamberge",
            new PickaxeItem(ModToolMaterial.VOID, 5, -2.2f, new FabricItemSettings().rarity(Rarity.EPIC)));

    public static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(Eleutherus_void_mod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        Eleutherus_void_mod.LOGGER.info("Registering Mod Items for " + Eleutherus_void_mod.MOD_ID);
    }
}
