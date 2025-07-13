
package net.mcreator.powerrangersunlimited.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

import net.mcreator.powerrangersunlimited.init.PowerRangersUnlimitedModFluids;

public class MorphinEnergyBlock extends LiquidBlock {
	public MorphinEnergyBlock() {
		super(() -> PowerRangersUnlimitedModFluids.MORPHIN_ENERGY.get(), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GREEN).strength(100f).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).noCollission()
				.noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 14;
	}
}
