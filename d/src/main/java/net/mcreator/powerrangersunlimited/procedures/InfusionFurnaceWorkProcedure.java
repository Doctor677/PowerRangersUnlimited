package net.mcreator.powerrangersunlimited.procedures;

import net.minecraft.world.level.LevelAccessor;

public class InfusionFurnaceWorkProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		InfusionFurnaceRecipeProcedure.execute(world, x, y, z);
		InfusionFurnaceMorphinEnergyProcedure.execute(world, x, y, z);
	}
}
