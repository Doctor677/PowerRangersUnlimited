
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.powerrangersunlimited.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.powerrangersunlimited.block.MorphinEnergyBlock;
import net.mcreator.powerrangersunlimited.block.MorphXOreBlock;
import net.mcreator.powerrangersunlimited.block.InfusionFurnaceBlock;
import net.mcreator.powerrangersunlimited.block.FossilizedOreBlock;
import net.mcreator.powerrangersunlimited.block.DeepslateMorphXOreBlock;
import net.mcreator.powerrangersunlimited.block.DeepslateFossilizedOreBlock;
import net.mcreator.powerrangersunlimited.PowerRangersUnlimitedMod;

public class PowerRangersUnlimitedModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, PowerRangersUnlimitedMod.MODID);
	public static final RegistryObject<Block> MORPH_X_ORE = REGISTRY.register("morph_x_ore", () -> new MorphXOreBlock());
	public static final RegistryObject<Block> DEEPSLATE_MORPH_X_ORE = REGISTRY.register("deepslate_morph_x_ore", () -> new DeepslateMorphXOreBlock());
	public static final RegistryObject<Block> MORPHIN_ENERGY = REGISTRY.register("morphin_energy", () -> new MorphinEnergyBlock());
	public static final RegistryObject<Block> FOSSILIZED_ORE = REGISTRY.register("fossilized_ore", () -> new FossilizedOreBlock());
	public static final RegistryObject<Block> DEEPSLATE_FOSSILIZED_ORE = REGISTRY.register("deepslate_fossilized_ore", () -> new DeepslateFossilizedOreBlock());
	public static final RegistryObject<Block> INFUSION_FURNACE = REGISTRY.register("infusion_furnace", () -> new InfusionFurnaceBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
