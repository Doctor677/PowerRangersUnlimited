
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.powerrangersunlimited.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.powerrangersunlimited.client.gui.InfusionFurnaceGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PowerRangersUnlimitedModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(PowerRangersUnlimitedModMenus.INFUSION_FURNACE_GUI.get(), InfusionFurnaceGUIScreen::new);
		});
	}
}
