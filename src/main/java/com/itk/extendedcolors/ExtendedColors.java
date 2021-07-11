package com.itk.extendedcolors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.itk.extendedcolors.core.init.BlockInit;
import com.itk.extendedcolors.core.init.ItemInit;
import com.itk.extendedcolors.core.itemgroup.ExtendedColorsItemGroup;

import io.netty.resolver.AbstractAddressResolver;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("extendedcolors")
@Mod.EventBusSubscriber(modid = ExtendedColors.MOD_ID, bus = Bus.MOD)
public class ExtendedColors {
	// Directly reference a log4j logger.
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MOD_ID = "extendedcolors";

	public ExtendedColors() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

		ItemInit.ITEMS.register(bus);
		BlockInit.BLOCKS.register(bus);
		// Register ourselves for server and other game events we are interested in
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
		BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
			event.getRegistry().register(
					new BlockItem(block, new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_MOD))
							.setRegistryName(block.getRegistryName()));
		});
	}

}

