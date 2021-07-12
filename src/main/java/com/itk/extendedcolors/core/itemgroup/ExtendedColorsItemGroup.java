package com.itk.extendedcolors.core.itemgroup;

import com.itk.extendedcolors.core.init.ItemInit;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
//import net.minecraft.util.NonNullList;

public class ExtendedColorsItemGroup extends ItemGroup {
	
	public static final ExtendedColorsItemGroup EXTENDEDCOLORS_MOD = new ExtendedColorsItemGroup(ItemGroup.TABS.length, "extendedcolors");
	
	public ExtendedColorsItemGroup(int index, String label) {
		super(index,label);
	}
	
	@Override
	public ItemStack makeIcon() {
		return new ItemStack(ItemInit.EXAMPLE_ITEM.get());
	}

	/*@Override
	public void fillItemList(NonNullList<ItemStack> items) {
		super.fillItemList(items);
	} */
}
