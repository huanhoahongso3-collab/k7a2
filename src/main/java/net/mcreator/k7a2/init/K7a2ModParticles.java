
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.k7a2.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.k7a2.client.particle.K7A2ParticleParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class K7a2ModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(K7a2ModParticleTypes.K_7_A_2_PARTICLE.get(), K7A2ParticleParticle::provider);
	}
}
