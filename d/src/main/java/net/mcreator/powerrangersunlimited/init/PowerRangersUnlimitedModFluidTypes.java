
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.powerrangersunlimited.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.powerrangersunlimited.fluid.types.MorphinEnergyFluidType;
import net.mcreator.powerrangersunlimited.PowerRangersUnlimitedMod;

public class PowerRangersUnlimitedModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, PowerRangersUnlimitedMod.MODID);
	public static final RegistryObject<FluidType> MORPHIN_ENERGY_TYPE = REGISTRY.register("morphin_energy", () -> new MorphinEnergyFluidType());
}
