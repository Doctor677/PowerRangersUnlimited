
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.powerrangersunlimited.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber
public class PowerRangersUnlimitedModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		ItemStack itemstack = event.getItemStack();
		if (itemstack.getItem() == PowerRangersUnlimitedModItems.DINO_FOSSIL.get())
			event.setBurnTime(2400);
	}
}
