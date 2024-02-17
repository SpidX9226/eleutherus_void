package com.spidx.eleutherus_void_mod.enchantments;

import com.spidx.eleutherus_void_mod.Eleutherus_void_mod;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEnchantments{
    public static Enchantment VOID_SHARPNESS = register("void_sharpness",
            new VoidSharpnessEnchantment(Enchantment.Rarity.VERY_RARE, EquipmentSlot.MAINHAND));

    private static Enchantment register(String name, Enchantment enchantment){
        return Registry.register(Registries.ENCHANTMENT, new Identifier(Eleutherus_void_mod.MOD_ID, name), enchantment);
    }

    public static void registerModEnchantments() {
        Eleutherus_void_mod.LOGGER.info("Registering Enchantments for " + Eleutherus_void_mod.MOD_ID);
    }
}
