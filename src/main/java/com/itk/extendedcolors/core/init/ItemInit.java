package com.itk.extendedcolors.core.init;

import com.itk.extendedcolors.ExtendedColors;
import com.itk.extendedcolors.core.itemgroup.ExtendedColorsItemGroup;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			ExtendedColors.MOD_ID);

	public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("example_item",
			() -> new Item(new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_MOD)));
}
