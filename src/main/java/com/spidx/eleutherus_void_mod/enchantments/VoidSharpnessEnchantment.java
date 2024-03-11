package com.spidx.eleutherus_void_mod.enchantments;

import net.minecraft.enchantment.DamageEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EntityGroup;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;

public class VoidSharpnessEnchantment extends Enchantment {
    protected VoidSharpnessEnchantment(Enchantment.Rarity weight, EquipmentSlot ... slots) {
        super(weight, EnchantmentTarget.WEAPON, slots);
    }

    @Override
    public int getMaxLevel() {
        return 2;
    }

    @Override
    public float getAttackDamage(int level, EntityGroup group) {
        if (group == EntityGroup.UNDEAD) {
            return (float)level * 2;
        }
        if (group == EntityGroup.ARTHROPOD) {
            return (float)level * 2.5f;
        }
        if (group == EntityGroup.AQUATIC) {
            return (float)level * 5;
        }
        if (group == EntityGroup.DEFAULT || group ==  EntityGroup.ILLAGER) {
            return (float)level * 3;
        }
        return -1f;
    }

    @Override
    public boolean canAccept(Enchantment other) {
        return !(other instanceof DamageEnchantment);
    }

    @Override
    public boolean isAcceptableItem(ItemStack stack) {
        if (stack.getItem() instanceof AxeItem) {
            return true;
        }
        return super.isAcceptableItem(stack);
    }
}
