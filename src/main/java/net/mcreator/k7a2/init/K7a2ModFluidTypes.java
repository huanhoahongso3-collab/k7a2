
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.k7a2.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.k7a2.fluid.types.K7A2LavaFluidType;
import net.mcreator.k7a2.K7a2Mod;

public class K7a2ModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, K7a2Mod.MODID);
	public static final RegistryObject<FluidType> K_7_A_2_LAVA_TYPE = REGISTRY.register("k_7_a_2_lava", () -> new K7A2LavaFluidType());
}
