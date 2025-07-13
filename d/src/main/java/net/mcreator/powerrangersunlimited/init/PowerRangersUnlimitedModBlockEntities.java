
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.powerrangersunlimited.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.powerrangersunlimited.block.entity.InfusionFurnaceBlockEntity;
import net.mcreator.powerrangersunlimited.PowerRangersUnlimitedMod;

public class PowerRangersUnlimitedModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, PowerRangersUnlimitedMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> INFUSION_FURNACE = register("infusion_furnace", PowerRangersUnlimitedModBlocks.INFUSION_FURNACE, InfusionFurnaceBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
