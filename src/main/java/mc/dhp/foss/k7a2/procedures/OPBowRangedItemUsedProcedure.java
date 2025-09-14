package mc.dhp.foss.k7a2.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import mc.dhp.foss.k7a2.init.K7a2ModMobEffects;

public class OPBowRangedItemUsedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(K7a2ModMobEffects.POTION_OF_K_7_A_2_DAM.get(), 200, 1));
	}
}