package net.mcreator.powerrangersunlimited.procedures;

import net.minecraftforge.fluids.capability.IFluidHandler;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.core.BlockPos;

import net.mcreator.powerrangersunlimited.init.PowerRangersUnlimitedModItems;
import net.mcreator.powerrangersunlimited.init.PowerRangersUnlimitedModFluids;

public class InsertMorphinEnergyProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PowerRangersUnlimitedModItems.MORPHIN_ENERGY_BUCKET.get()) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(Items.BUCKET).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
				int _amount = 1000;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability.fill(new FluidStack(PowerRangersUnlimitedModFluids.MORPHIN_ENERGY.get(), _amount), IFluidHandler.FluidAction.EXECUTE));
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == PowerRangersUnlimitedModItems.MORPHIN_ENERGY_BUCKET.get()) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(Items.BUCKET).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
				int _amount = 1000;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability.fill(new FluidStack(PowerRangersUnlimitedModFluids.MORPHIN_ENERGY.get(), _amount), IFluidHandler.FluidAction.EXECUTE));
			}
		}
	}
}
