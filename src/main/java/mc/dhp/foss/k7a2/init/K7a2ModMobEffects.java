
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package mc.dhp.foss.k7a2.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import mc.dhp.foss.k7a2.potion.WishYouLuckMobEffect;
import mc.dhp.foss.k7a2.potion.PotionOfK7A2DamMobEffect;
import mc.dhp.foss.k7a2.K7a2Mod;

public class K7a2ModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, K7a2Mod.MODID);
	public static final RegistryObject<MobEffect> POTION_OF_K_7_A_2_DAM = REGISTRY.register("potion_of_k_7_a_2_dam", () -> new PotionOfK7A2DamMobEffect());
	public static final RegistryObject<MobEffect> WISH_YOU_LUCK = REGISTRY.register("wish_you_luck", () -> new WishYouLuckMobEffect());
}
