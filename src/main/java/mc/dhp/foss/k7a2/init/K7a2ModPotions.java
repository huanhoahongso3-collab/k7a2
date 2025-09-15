
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package mc.dhp.foss.k7a2.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;

import mc.dhp.foss.k7a2.K7a2Mod;

public class K7a2ModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, K7a2Mod.MODID);
	public static final RegistryObject<Potion> POTION_OF_K_7_A_2_DAM = REGISTRY.register("potion_of_k_7_a_2_dam", () -> new Potion(new MobEffectInstance(K7a2ModMobEffects.POTION_OF_K_7_A_2_DAM.get(), 3600, 0, false, true)));
}
