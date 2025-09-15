
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package mc.dhp.foss.k7a2.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import mc.dhp.foss.k7a2.fluid.K7A2LavaFluid;
import mc.dhp.foss.k7a2.K7a2Mod;

public class K7a2ModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, K7a2Mod.MODID);
	public static final RegistryObject<FlowingFluid> K_7_A_2_LAVA = REGISTRY.register("k_7_a_2_lava", () -> new K7A2LavaFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_K_7_A_2_LAVA = REGISTRY.register("flowing_k_7_a_2_lava", () -> new K7A2LavaFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(K_7_A_2_LAVA.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_K_7_A_2_LAVA.get(), RenderType.translucent());
		}
	}
}
