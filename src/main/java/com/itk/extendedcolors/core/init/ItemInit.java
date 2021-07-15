package com.itk.extendedcolors.core.init;

import com.itk.extendedcolors.ExtendedColors;
import com.itk.extendedcolors.core.itemgroup.ExtendedColorsItemGroup;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			ExtendedColors.MOD_ID);

	public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("example_item",
			() -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));
	
	public static final RegistryObject<Item> EXAMPLE_BLOCK = ITEMS.register("example_block",
			() -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));

	public static final RegistryObject<BlockItem> REDWOOLBLOCK = ITEMS.register("redwoolblock",
			() -> new BlockItem(BlockInit.REDWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> ORANGEWOOLBLOCK = ITEMS.register("orangewoolblock",
			() -> new BlockItem(BlockInit.ORANGEWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> BLACKWOOLBLOCK = ITEMS.register("blackwoolblock",
			() -> new BlockItem(BlockInit.BLACKWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
}
