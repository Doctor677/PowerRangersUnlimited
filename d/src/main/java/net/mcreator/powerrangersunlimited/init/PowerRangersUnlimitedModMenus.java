
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.powerrangersunlimited.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.powerrangersunlimited.world.inventory.InfusionFurnaceGUIMenu;
import net.mcreator.powerrangersunlimited.PowerRangersUnlimitedMod;

public class PowerRangersUnlimitedModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, PowerRangersUnlimitedMod.MODID);
	public static final RegistryObject<MenuType<InfusionFurnaceGUIMenu>> INFUSION_FURNACE_GUI = REGISTRY.register("infusion_furnace_gui", () -> IForgeMenuType.create(InfusionFurnaceGUIMenu::new));
}
