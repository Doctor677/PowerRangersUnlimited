
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.powerrangersunlimited.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.powerrangersunlimited.item.YellowInfusedIronIngotItem;
import net.mcreator.powerrangersunlimited.item.WhiteInfusedEmeraldItem;
import net.mcreator.powerrangersunlimited.item.RedInfusedGoldIngotItem;
import net.mcreator.powerrangersunlimited.item.PurpleInfusedNetheriteIngotItem;
import net.mcreator.powerrangersunlimited.item.PinkInfusedDiamondItem;
import net.mcreator.powerrangersunlimited.item.OrangeInfusedCopperIngotItem;
import net.mcreator.powerrangersunlimited.item.MorphinEnergyItem;
import net.mcreator.powerrangersunlimited.item.GreenInfusedRedstoneItem;
import net.mcreator.powerrangersunlimited.item.DinoFossilItem;
import net.mcreator.powerrangersunlimited.item.BlueInfusedNetheriteScrapItem;
import net.mcreator.powerrangersunlimited.item.BlackInfusedLapisLazuliItem;
import net.mcreator.powerrangersunlimited.PowerRangersUnlimitedMod;

public class PowerRangersUnlimitedModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PowerRangersUnlimitedMod.MODID);
	public static final RegistryObject<Item> DINO_FOSSIL = REGISTRY.register("dino_fossil", () -> new DinoFossilItem());
	public static final RegistryObject<Item> MORPH_X_ORE = block(PowerRangersUnlimitedModBlocks.MORPH_X_ORE);
	public static final RegistryObject<Item> DEEPSLATE_MORPH_X_ORE = block(PowerRangersUnlimitedModBlocks.DEEPSLATE_MORPH_X_ORE);
	public static final RegistryObject<Item> MORPHIN_ENERGY_BUCKET = REGISTRY.register("morphin_energy_bucket", () -> new MorphinEnergyItem());
	public static final RegistryObject<Item> FOSSILIZED_ORE = block(PowerRangersUnlimitedModBlocks.FOSSILIZED_ORE);
	public static final RegistryObject<Item> DEEPSLATE_FOSSILIZED_ORE = block(PowerRangersUnlimitedModBlocks.DEEPSLATE_FOSSILIZED_ORE);
	public static final RegistryObject<Item> INFUSION_FURNACE = block(PowerRangersUnlimitedModBlocks.INFUSION_FURNACE);
	public static final RegistryObject<Item> RED_INFUSED_GOLD_INGOT = REGISTRY.register("red_infused_gold_ingot", () -> new RedInfusedGoldIngotItem());
	public static final RegistryObject<Item> PINK_INFUSED_DIAMOND = REGISTRY.register("pink_infused_diamond", () -> new PinkInfusedDiamondItem());
	public static final RegistryObject<Item> YELLOW_INFUSED_IRON_INGOT = REGISTRY.register("yellow_infused_iron_ingot", () -> new YellowInfusedIronIngotItem());
	public static final RegistryObject<Item> GREEN_INFUSED_REDSTONE = REGISTRY.register("green_infused_redstone", () -> new GreenInfusedRedstoneItem());
	public static final RegistryObject<Item> BLUE_INFUSED_NETHERITE_SCRAP = REGISTRY.register("blue_infused_netherite_scrap", () -> new BlueInfusedNetheriteScrapItem());
	public static final RegistryObject<Item> PURPLE_INFUSED_NETHERITE_INGOT = REGISTRY.register("purple_infused_netherite_ingot", () -> new PurpleInfusedNetheriteIngotItem());
	public static final RegistryObject<Item> BLACK_INFUSED_LAPIS_LAZULI = REGISTRY.register("black_infused_lapis_lazuli", () -> new BlackInfusedLapisLazuliItem());
	public static final RegistryObject<Item> WHITE_INFUSED_EMERALD = REGISTRY.register("white_infused_emerald", () -> new WhiteInfusedEmeraldItem());
	public static final RegistryObject<Item> ORANGE_INFUSED_COPPER_INGOT = REGISTRY.register("orange_infused_copper_ingot", () -> new OrangeInfusedCopperIngotItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
