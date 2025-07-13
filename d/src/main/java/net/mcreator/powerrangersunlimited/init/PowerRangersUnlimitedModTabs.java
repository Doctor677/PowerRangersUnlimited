
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.powerrangersunlimited.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.powerrangersunlimited.PowerRangersUnlimitedMod;

public class PowerRangersUnlimitedModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PowerRangersUnlimitedMod.MODID);
	public static final RegistryObject<CreativeModeTab> POWER_RANGERS_UNLIMITED_ASSORTED = REGISTRY.register("power_rangers_unlimited_assorted", () -> CreativeModeTab.builder()
			.title(Component.translatable("item_group.power_rangers_unlimited.power_rangers_unlimited_assorted")).icon(() -> new ItemStack(PowerRangersUnlimitedModItems.DINO_FOSSIL.get())).displayItems((parameters, tabData) -> {
				tabData.accept(PowerRangersUnlimitedModItems.DINO_FOSSIL.get());
				tabData.accept(PowerRangersUnlimitedModBlocks.MORPH_X_ORE.get().asItem());
				tabData.accept(PowerRangersUnlimitedModBlocks.DEEPSLATE_MORPH_X_ORE.get().asItem());
				tabData.accept(PowerRangersUnlimitedModItems.MORPHIN_ENERGY_BUCKET.get());
				tabData.accept(PowerRangersUnlimitedModBlocks.FOSSILIZED_ORE.get().asItem());
				tabData.accept(PowerRangersUnlimitedModBlocks.DEEPSLATE_FOSSILIZED_ORE.get().asItem());
				tabData.accept(PowerRangersUnlimitedModBlocks.INFUSION_FURNACE.get().asItem());
				tabData.accept(PowerRangersUnlimitedModItems.RED_INFUSED_GOLD_INGOT.get());
				tabData.accept(PowerRangersUnlimitedModItems.PINK_INFUSED_DIAMOND.get());
				tabData.accept(PowerRangersUnlimitedModItems.YELLOW_INFUSED_IRON_INGOT.get());
				tabData.accept(PowerRangersUnlimitedModItems.GREEN_INFUSED_REDSTONE.get());
				tabData.accept(PowerRangersUnlimitedModItems.BLUE_INFUSED_NETHERITE_SCRAP.get());
				tabData.accept(PowerRangersUnlimitedModItems.PURPLE_INFUSED_NETHERITE_INGOT.get());
				tabData.accept(PowerRangersUnlimitedModItems.BLACK_INFUSED_LAPIS_LAZULI.get());
				tabData.accept(PowerRangersUnlimitedModItems.WHITE_INFUSED_EMERALD.get());
				tabData.accept(PowerRangersUnlimitedModItems.ORANGE_INFUSED_COPPER_INGOT.get());
			}).withSearchBar().build());
}
