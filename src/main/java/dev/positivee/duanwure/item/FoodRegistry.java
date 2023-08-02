package dev.positivee.duanwure.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class FoodRegistry
{
	public static final FoodProperties NORMAL_ZONGZI = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.5F).build();
	public static final FoodProperties SUGER_ZONGZI = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.5F)
			.effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 60), 1.0F).build();
	public static final FoodProperties MEAT_ZONGZI = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.5F)
			.effect(new MobEffectInstance(MobEffects.SATURATION, 60), 1.0F).build();
}
