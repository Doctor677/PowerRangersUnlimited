
package net.mcreator.powerrangersunlimited.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.powerrangersunlimited.init.PowerRangersUnlimitedModItems;
import net.mcreator.powerrangersunlimited.init.PowerRangersUnlimitedModFluids;
import net.mcreator.powerrangersunlimited.init.PowerRangersUnlimitedModFluidTypes;
import net.mcreator.powerrangersunlimited.init.PowerRangersUnlimitedModBlocks;

public abstract class MorphinEnergyFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> PowerRangersUnlimitedModFluidTypes.MORPHIN_ENERGY_TYPE.get(), () -> PowerRangersUnlimitedModFluids.MORPHIN_ENERGY.get(),
			() -> PowerRangersUnlimitedModFluids.FLOWING_MORPHIN_ENERGY.get()).explosionResistance(100f).bucket(() -> PowerRangersUnlimitedModItems.MORPHIN_ENERGY_BUCKET.get())
			.block(() -> (LiquidBlock) PowerRangersUnlimitedModBlocks.MORPHIN_ENERGY.get());

	private MorphinEnergyFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.DRIPPING_WATER;
	}

	public static class Source extends MorphinEnergyFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends MorphinEnergyFluid {
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
