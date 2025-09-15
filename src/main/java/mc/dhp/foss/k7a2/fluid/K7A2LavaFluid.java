
package mc.dhp.foss.k7a2.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleOptions;

import mc.dhp.foss.k7a2.init.K7a2ModParticleTypes;
import mc.dhp.foss.k7a2.init.K7a2ModItems;
import mc.dhp.foss.k7a2.init.K7a2ModFluids;
import mc.dhp.foss.k7a2.init.K7a2ModFluidTypes;
import mc.dhp.foss.k7a2.init.K7a2ModBlocks;

public abstract class K7A2LavaFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> K7a2ModFluidTypes.K_7_A_2_LAVA_TYPE.get(), () -> K7a2ModFluids.K_7_A_2_LAVA.get(), () -> K7a2ModFluids.FLOWING_K_7_A_2_LAVA.get())
			.explosionResistance(100f).bucket(() -> K7a2ModItems.K_7_A_2_LAVA_BUCKET.get()).block(() -> (LiquidBlock) K7a2ModBlocks.K_7_A_2_LAVA.get());

	private K7A2LavaFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return (SimpleParticleType) (K7a2ModParticleTypes.K_7_A_2_PARTICLE.get());
	}

	public static class Source extends K7A2LavaFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends K7A2LavaFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
