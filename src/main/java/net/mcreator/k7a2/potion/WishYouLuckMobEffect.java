
package net.mcreator.k7a2.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.k7a2.procedures.WishYouLuckEffectStartedappliedProcedure;

public class WishYouLuckMobEffect extends MobEffect {
	public WishYouLuckMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -10066330);
	}

	@Override
	public String getDescriptionId() {
		return "effect.k7a2.wish_you_luck";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		WishYouLuckEffectStartedappliedProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
