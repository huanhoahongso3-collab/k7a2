
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package mc.dhp.foss.k7a2.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import mc.dhp.foss.k7a2.K7a2Mod;

public class K7a2ModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, K7a2Mod.MODID);
	public static final RegistryObject<SimpleParticleType> K_7_A_2_PARTICLE = REGISTRY.register("k_7_a_2_particle", () -> new SimpleParticleType(true));
}
