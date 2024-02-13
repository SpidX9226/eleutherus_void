package com.spidx.eleutherus_void_mod.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
public class ModFoodComponents {
    public static final FoodComponent ELEUTHERUS_PIE = new FoodComponent.Builder().hunger(6).saturationModifier(1.25f).alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 1), 1).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 2400, 1), 1).statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 2400, 1),1).build();
}
