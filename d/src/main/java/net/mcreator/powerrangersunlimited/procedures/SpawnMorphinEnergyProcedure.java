package net.mcreator.powerrangersunlimited.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.powerrangersunlimited.init.PowerRangersUnlimitedModBlocks;

public class SpawnMorphinEnergyProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y, z), PowerRangersUnlimitedModBlocks.MORPHIN_ENERGY.get().defaultBlockState(), 3);
	}
}
