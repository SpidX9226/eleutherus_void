package com.spidx.eleutherus_void_mod.enchantments;

import net.minecraft.enchantment.DamageEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityGroup;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
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
            return (float)level * 2.5f;
        }
        if (group == EntityGroup.ARTHROPOD) {
            return (float)level * 2.5f;
        }
        if (group == EntityGroup.AQUATIC) {
            return (float)level * 5.0f;
        }
        if (group == EntityGroup.DEFAULT || group ==  EntityGroup.ILLAGER) {
            return (float)level * 0.5f;
        }
        return 0.0f;
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
