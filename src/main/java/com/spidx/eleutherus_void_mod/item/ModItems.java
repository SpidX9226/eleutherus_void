package com.spidx.eleutherus_void_mod.item;

import com.spidx.eleutherus_void_mod.Eleutherus_void_mod;
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
    public static final Item ELEUTHERUS_PIE = registerItem("eleutherus_pie",
            new Item(new FabricItemSettings().food(ModFoodComponents.ELEUTHERUS_PIE)));
    public static final Item ELEUTHERUS_PICKAXE = registerItem("eleutherus_pickaxe",
            new PickaxeItem(ModToolMaterial.ELEUTHERUS, 3, 3f, new FabricItemSettings()));

    public static final Item ELEUTHERUS_SWORD = registerItem("eleutherus_sword",
            new SwordItem(ModToolMaterial.ELEUTHERUS, 3, 3f, new FabricItemSettings()));

    public static final Item ELEUTHERUS_AXE = registerItem("eleutherus_axe",
            new AxeItem(ModToolMaterial.ELEUTHERUS, 3, 3f, new FabricItemSettings()));

    public static final Item ELEUTHERUS_SHOVEL = registerItem("eleutherus_shovel",
            new ShovelItem(ModToolMaterial.ELEUTHERUS, 3, 3f, new FabricItemSettings()));

    public static final Item ELEUTHERUS_HOE = registerItem("eleutherus_hoe",
            new HoeItem(ModToolMaterial.ELEUTHERUS, 3, 3f, new FabricItemSettings()));

    public static final Item ELEUTHERUS_HELMET = registerItem("eleutherus_helmet",
            new ModArmorItem(ModArmorMaterials.ELEUTHERUS, ArmorItem.Type.HELMET, new FabricItemSettings()));

    public static final Item ELEUTHERUS_CHESTPLATE = registerItem("eleutherus_chestplate",
            new ModArmorItem(ModArmorMaterials.ELEUTHERUS, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));

    public static final Item ELEUTHERUS_LEGGINGS = registerItem("eleutherus_leggings",
            new ModArmorItem(ModArmorMaterials.ELEUTHERUS, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));

    public static final Item ELEUTHERUS_BOOTS = registerItem("eleutherus_boots",
            new ModArmorItem(ModArmorMaterials.ELEUTHERUS, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item VOID_DESTROYER_BLADE = registerItem("void_destroyer_blade",
            new PickaxeItem(ModToolMaterial.VOID, 3, 3f, new FabricItemSettings().rarity(Rarity.EPIC)));

    public static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(Eleutherus_void_mod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        Eleutherus_void_mod.LOGGER.info("Registering Mod Items for " + Eleutherus_void_mod.MOD_ID);
    }
}
