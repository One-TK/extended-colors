package com.itk.extendedcolors.core.itemgroup;

import com.itk.extendedcolors.core.init.ItemInit;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ExtendedColorsItemGroup extends ItemGroup {
	
	public static final ExtendedColorsItemGroup EXTENDEDCOLORS_WOOL = new ExtendedColorsItemGroup(ItemGroup.TABS.length, "extendedcolorswool");
	public static final ExtendedColorsItemGroup EXTENDEDCOLORS_TBD1 = new ExtendedColorsItemGroup(ItemGroup.TABS.length, "extendedcolorstbd1");
	public static final ExtendedColorsItemGroup EXTENDEDCOLORS_TBD2 = new ExtendedColorsItemGroup(ItemGroup.TABS.length, "extendedcolorstbd2");
	public static final ExtendedColorsItemGroup EXTENDEDCOLORS_TBD3 = new ExtendedColorsItemGroup(ItemGroup.TABS.length, "extendedcolorstbd3");
	public static final ExtendedColorsItemGroup EXTENDEDCOLORS_TBD4 = new ExtendedColorsItemGroup(ItemGroup.TABS.length, "extendedcolorstbd4");
	public static final ExtendedColorsItemGroup EXTENDEDCOLORS_TBD5 = new ExtendedColorsItemGroup(ItemGroup.TABS.length, "extendedcolorstbd5");
	public static final ExtendedColorsItemGroup EXTENDEDCOLORS_TBD6 = new ExtendedColorsItemGroup(ItemGroup.TABS.length, "extendedcolorstbd6");
	public static final ExtendedColorsItemGroup EXTENDEDCOLORS_TBD7 = new ExtendedColorsItemGroup(ItemGroup.TABS.length, "extendedcolorstbd7");
	public static final ExtendedColorsItemGroup EXTENDEDCOLORS_TBD8 = new ExtendedColorsItemGroup(ItemGroup.TABS.length, "extendedcolorstbd8");
	public static final ExtendedColorsItemGroup EXTENDEDCOLORS_TBD9 = new ExtendedColorsItemGroup(ItemGroup.TABS.length, "extendedcolorstbd9");

	public ExtendedColorsItemGroup(int index, String label) {
		super(index, label);
	}

	@Override
	public ItemStack makeIcon() {
		//below is to set the tab icon image
		return new ItemStack(ItemInit.EXAMPLE_ITEM.get());
	}

}
