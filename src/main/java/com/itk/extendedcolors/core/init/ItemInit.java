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

	
//	 Uncomment when image for item tab gets added
	  
/*			
 Block Icon
	public static final RegistryObject<BlockItem> TABITEMICON = ITEMS.register("tabitemicon",
		() -> new BlockItem(BlockInit.BLACKWOOLBLOCK.get(), new Item.Properties()));
		
Item Icon	
	public static final RegistryObject<Item> TABITEMICON = ITEMS.register("tabitemicon",
			() -> new Item(new Item.Properties()));
*/
	
	
	public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("example_item",
			() -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));
	
	public static final RegistryObject<Item> EXAMPLE_BLOCK = ITEMS.register("example_block",
			() -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));

//	public static final RegistryObject<Item> ITEMSTABITEMICON = ITEMS.register("itemstabitemicon",
//			() -> new Item(new Item.Properties()));
	
	public static final RegistryObject<Item> WOOLTABITEMICON = ITEMS.register("wooltabitemicon",
			() -> new Item(new Item.Properties()));
	
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Standard Colors ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	public static final RegistryObject<BlockItem> REDWOOLBLOCK = ITEMS.register("redwoolblock",
			() -> new BlockItem(BlockInit.REDWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> MAROONWOOLBLOCK = ITEMS.register("maroonwoolblock",
			() -> new BlockItem(BlockInit.MAROONWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> SCARLETWOOLBLOCK = ITEMS.register("scarletwoolblock",
			() -> new BlockItem(BlockInit.SCARLETWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
			
	public static final RegistryObject<BlockItem> BRICKREDWOOLBLOCK = ITEMS.register("brickredwoolblock",
			() -> new BlockItem(BlockInit.BRICKREDWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> CHESTNUTWOOLBLOCK = ITEMS.register("chestnutwoolblock",
			() -> new BlockItem(BlockInit.CHESTNUTWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> ORANGEREDWOOLBLOCK = ITEMS.register("orangeredwoolblock",
			() -> new BlockItem(BlockInit.ORANGEREDWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> SUNSETORANGEWOOLBLOCK = ITEMS.register("sunsetorangewoolblock",
			() -> new BlockItem(BlockInit.SUNSETORANGEWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> BITTERSWEETWOOLBLOCK = ITEMS.register("bittersweetwoolblock",
			() -> new BlockItem(BlockInit.BITTERSWEETWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> VIVIDTANGERINEWOOLBLOCK = ITEMS.register("vividtangerinewoolblock",
			() -> new BlockItem(BlockInit.VIVIDTANGERINEWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> BURNTORANGEWOOLBLOCK = ITEMS.register("burntorangewoolblock",
			() -> new BlockItem(BlockInit.BURNTORANGEWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> REDORANGEWOOLBLOCK = ITEMS.register("redorangewoolblock",
			() -> new BlockItem(BlockInit.REDORANGEWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> ORANGEWOOLBLOCK = ITEMS.register("orangewoolblock",
			() -> new BlockItem(BlockInit.ORANGEWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> MACANDCHEESEWOOLBLOCK = ITEMS.register("macandcheesewoolblock",
			() -> new BlockItem(BlockInit.MACANDCHEESEWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> MANGOTANGOWOOLBLOCK = ITEMS.register("mangotangowoolblock",
			() -> new BlockItem(BlockInit.MANGOTANGOWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> YELLOWORANGEWOOLBLOCK = ITEMS.register("yelloworangewoolblock",
			() -> new BlockItem(BlockInit.YELLOWORANGEWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> BANANAMANIAWOOLBLOCK = ITEMS.register("bananamaniawoolblock",
			() -> new BlockItem(BlockInit.BANANAMANIAWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> MAIZEWOOLBLOCK = ITEMS.register("maizewoolblock",
			() -> new BlockItem(BlockInit.MAIZEWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> ORANGEYELLOWWOOLBLOCK = ITEMS.register("orangeyellowwoolblock",
			() -> new BlockItem(BlockInit.ORANGEYELLOWWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> GOLDENRODWOOLBLOCK = ITEMS.register("goldenrodwoolblock",
			() -> new BlockItem(BlockInit.GOLDENRODWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> DANDELOINWOOLBLOCK = ITEMS.register("dandelionwoolblock",
			() -> new BlockItem(BlockInit.DANDELIONWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> YELLOWWOOLBLOCK = ITEMS.register("yellowwoolblock",
			() -> new BlockItem(BlockInit.YELLOWWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> GREENYELLOWWOOLBLOCK = ITEMS.register("greenyellowwoolblock",
			() -> new BlockItem(BlockInit.GREENYELLOWWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> OLIVEGREENWOOLBLOCK = ITEMS.register("olivegreenwoolblock",
			() -> new BlockItem(BlockInit.OLIVEGREENWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> SPRINGGREENWOOLBLOCK = ITEMS.register("springgreenwoolblock",
			() -> new BlockItem(BlockInit.SPRINGGREENWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> CANARYWOOLBLOCK = ITEMS.register("canarywoolblock",
			() -> new BlockItem(BlockInit.CANARYWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> LEMONYELLOWWOOLBLOCK = ITEMS.register("lemonyellowwoolblock",
			() -> new BlockItem(BlockInit.LEMONYELLOWWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> INCHWORMWOOLBLOCK = ITEMS.register("inchwormwoolblock",
			() -> new BlockItem(BlockInit.INCHWORMWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> YELLOWGREENWOOLBLOCK = ITEMS.register("yellowgreenwoolblock",
			() -> new BlockItem(BlockInit.YELLOWGREENWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> ASPARAGUSWOOLBLOCK = ITEMS.register("asparaguswoolblock",
			() -> new BlockItem(BlockInit.ASPARAGUSWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> GRANNYSMITHAPPLEWOOLBLOCK = ITEMS.register("grannysmithapplewoolblock",
			() -> new BlockItem(BlockInit.GRANNYSMITHAPPLEWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> FERNWOOLBLOCK = ITEMS.register("fernwoolblock",
			() -> new BlockItem(BlockInit.FERNWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> GREENWOOLBLOCK = ITEMS.register("greenwoolblock",
			() -> new BlockItem(BlockInit.GREENWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> FORESTGREENWOOLBLOCK = ITEMS.register("forestgreenwoolblock",
			() -> new BlockItem(BlockInit.FORESTGREENWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> SEAGREENWOOLBLOCK = ITEMS.register("seagreenwoolblock",
			() -> new BlockItem(BlockInit.SEAGREENWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> SHAMROCKWOOLBLOCK = ITEMS.register("shamrockwoolblock",
			() -> new BlockItem(BlockInit.SHAMROCKWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> MOUNTAINMEADOWWOOLBLOCK = ITEMS.register("mountainmeadowwoolblock",
			() -> new BlockItem(BlockInit.MOUNTAINMEADOWWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> JUNGLEGREENWOOLBLOCK = ITEMS.register("junglegreenwoolblock",
			() -> new BlockItem(BlockInit.JUNGLEGREENWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> CARIBBEANGREENWOOLBLOCK = ITEMS.register("caribbeangreenwoolblock",
			() -> new BlockItem(BlockInit.CARIBBEANGREENWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> TROPICALRAINFORESTWOOLBLOCK = ITEMS.register("tropicalrainforestwoolblock",
			() -> new BlockItem(BlockInit.TROPICALRAINFORESTWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> PINEGREENWOOLBLOCK = ITEMS.register("pinegreenwoolblock",
			() -> new BlockItem(BlockInit.PINEGREENWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> ROBINSEGGBLUEWOOLBLOCK = ITEMS.register("robinseggbluewoolblock",
			() -> new BlockItem(BlockInit.ROBINSEGGBLUEWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> TEALBLUEWOOLBLOCK = ITEMS.register("tealbluewoolblock",
			() -> new BlockItem(BlockInit.TEALBLUEWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> LIGHTBLUEWOOLBLOCK = ITEMS.register("lightbluewoolblock",
			() -> new BlockItem(BlockInit.LIGHTBLUEWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> AQUAMARINEWOOLBLOCK = ITEMS.register("aquamarinewoolblock",
			() -> new BlockItem(BlockInit.AQUAMARINEWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> TURQUOISEBLUEWOOLBLOCK = ITEMS.register("turquoisebluewoolblock",
			() -> new BlockItem(BlockInit.TURQUOISEBLUEWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> OUTERSPACEWOOLBLOCK = ITEMS.register("outerspacewoolblock",
			() -> new BlockItem(BlockInit.OUTERSPACEWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> SKYBLUEWOOLBLOCK = ITEMS.register("skybluewoolblock",
			() -> new BlockItem(BlockInit.SKYBLUEWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> BLUEGREENWOOLBLOCK = ITEMS.register("bluegreenwoolblock",
			() -> new BlockItem(BlockInit.BLUEGREENWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> PACIFICBLUEWOOLBLOCK = ITEMS.register("pacificbluewoolblock",
			() -> new BlockItem(BlockInit.PACIFICBLUEWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> CERULEANWOOLBLOCK = ITEMS.register("ceruleanwoolblock",
			() -> new BlockItem(BlockInit.CERULEANWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> CORNFLOWERWOOLBLOCK = ITEMS.register("cornflowerwoolblock",
			() -> new BlockItem(BlockInit.CORNFLOWERWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> GREENBLUEWOOLBLOCK = ITEMS.register("greenbluewoolblock",
			() -> new BlockItem(BlockInit.GREENBLUEWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> MIDNIGHTBLUEWOOLBLOCK = ITEMS.register("midnightbluewoolblock",
			() -> new BlockItem(BlockInit.MIDNIGHTBLUEWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> NAVYBLUEWOOLBLOCK = ITEMS.register("navybluewoolblock",
			() -> new BlockItem(BlockInit.NAVYBLUEWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> DENIMWOOLBLOCK = ITEMS.register("denimwoolblock",
			() -> new BlockItem(BlockInit.DENIMWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> BLUEWOOLBLOCK = ITEMS.register("bluewoolblock",
			() -> new BlockItem(BlockInit.BLUEWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> CADETBLUEWOOLBLOCK = ITEMS.register("cadetbluewoolblock",
			() -> new BlockItem(BlockInit.CADETBLUEWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> PERIWINKLEWOOLBLOCK = ITEMS.register("periwinklewoolblock",
			() -> new BlockItem(BlockInit.PERIWINKLEWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> BLUETIFULWOOLBLOCK = ITEMS.register("bluetifulwoolblock",
			() -> new BlockItem(BlockInit.BLUETIFULWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> WILDBLUEYONDERWOOLBLOCK = ITEMS.register("wildblueyonderwoolblock",
			() -> new BlockItem(BlockInit.WILDBLUEYONDERWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> INDIGOWOOLBLOCK = ITEMS.register("indigowoolblock",
			() -> new BlockItem(BlockInit.INDIGOWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> MANATEEWOOLBLOCK = ITEMS.register("manateewoolblock",
			() -> new BlockItem(BlockInit.MANATEEWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> BLUEBELLWOOLBLOCK = ITEMS.register("bluebellwoolblock",
			() -> new BlockItem(BlockInit.BLUEBELLWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> VIOLETBLUEWOOLBLOCK = ITEMS.register("violetbluewoolblock",
			() -> new BlockItem(BlockInit.VIOLETBLUEWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> BLUEVIOLETWOOLBLOCK = ITEMS.register("bluevioletwoolblock",
			() -> new BlockItem(BlockInit.BLUEVIOLETWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> PURPLEHEARTWOOLBLOCK = ITEMS.register("purpleheartwoolblock",
			() -> new BlockItem(BlockInit.PURPLEHEARTWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

	public static final RegistryObject<BlockItem> ROYALPURPLEWOOLBLOCK = ITEMS.register("royalpurplewoolblock",
			() -> new BlockItem(BlockInit.ROYALPURPLEWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> VIOLETWOOLBLOCK = ITEMS.register("violetwoolblock",
			() -> new BlockItem(BlockInit.VIOLETWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> PURPLEMOUNTAINSMAJESTYWOOLBLOCK = ITEMS.register("purplemountainsmajestywoolblock",
			() -> new BlockItem(BlockInit.PURPLEMOUNTAINSMAJESTYWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> FUCHSIAWOOLBLOCK = ITEMS.register("fuchsiawoolblock",
			() -> new BlockItem(BlockInit.FUCHSIAWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> PINKFLAMINGOWOOLBLOCK = ITEMS.register("pinkflamingowoolblock",
			() -> new BlockItem(BlockInit.PINKFLAMINGOWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> ORCHIDWOOLBLOCK = ITEMS.register("orchidwoolblock",
			() -> new BlockItem(BlockInit.ORCHIDWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> PLUMWOOLBLOCK = ITEMS.register("plumwoolblock",
			() -> new BlockItem(BlockInit.PLUMWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> THISTLEWOOLBLOCK = ITEMS.register("thistlewoolblock",
			() -> new BlockItem(BlockInit.THISTLEWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> MULBERRYWOOLBLOCK = ITEMS.register("mulberrywoolblock",
			() -> new BlockItem(BlockInit.MULBERRYWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> REDVIOLETWOOLBLOCK = ITEMS.register("redvioletwoolblock",
			() -> new BlockItem(BlockInit.REDVIOLETWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> JAZZBERRYJAMWOOLBLOCK = ITEMS.register("jazzberryjamwoolblock",
			() -> new BlockItem(BlockInit.JAZZBERRYJAMWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> EGGPLANTWOOLBLOCK = ITEMS.register("eggplantwoolblock",
			() -> new BlockItem(BlockInit.EGGPLANTWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> MAGENTAWOOLBLOCK = ITEMS.register("magentawoolblock",
			() -> new BlockItem(BlockInit.MAGENTAWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> CERISEWOOLBLOCK = ITEMS.register("cerisewoolblock",
			() -> new BlockItem(BlockInit.CERISEWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> WILDSTRAWBERRYWOOLBLOCK = ITEMS.register("wildstrawberrywoolblock",
			() -> new BlockItem(BlockInit.WILDSTRAWBERRYWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> COTTONCANDYWOOLBLOCK = ITEMS.register("cottoncandywoolblock",
			() -> new BlockItem(BlockInit.COTTONCANDYWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> CARNATIONPINKWOOLBLOCK = ITEMS.register("carnationpinkwoolblock",
			() -> new BlockItem(BlockInit.CARNATIONPINKWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> VIOLETREDWOOLBLOCK = ITEMS.register("violetredwoolblock",
			() -> new BlockItem(BlockInit.VIOLETREDWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> RAZZMATAZZWOOLBLOCK = ITEMS.register("razzmatazzwoolblock",
			() -> new BlockItem(BlockInit.RAZZMATAZZWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> PIGGYPINKWOOLBLOCK = ITEMS.register("piggypinkwoolblock",
			() -> new BlockItem(BlockInit.PIGGYPINKWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> BLUSHWOOLBLOCK = ITEMS.register("blushwoolblock",
			() -> new BlockItem(BlockInit.BLUSHWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> TICKLEMEPINKWOOLBLOCK = ITEMS.register("ticklemepinkwoolblock",
			() -> new BlockItem(BlockInit.TICKLEMEPINKWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> MAUVELOUSWOOLBLOCK = ITEMS.register("mauvelouswoolblock",
			() -> new BlockItem(BlockInit.MAUVELOUSWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> SALMONWOOLBLOCK = ITEMS.register("salmonwoolblock",
			() -> new BlockItem(BlockInit.SALMONWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> MAHOGANYWOOLBLOCK = ITEMS.register("mahoganywoolblock",
			() -> new BlockItem(BlockInit.MAHOGANYWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> MELONWOOLBLOCK = ITEMS.register("melonwoolblock",
			() -> new BlockItem(BlockInit.MELONWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> PINKSHERBERTWOOLBLOCK = ITEMS.register("pinksherbertwoolblock",
			() -> new BlockItem(BlockInit.PINKSHERBERTWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> BURNTSIENNAWOOLBLOCK = ITEMS.register("burntsiennawoolblock",
			() -> new BlockItem(BlockInit.BURNTSIENNAWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> BROWNWOOLBLOCK = ITEMS.register("brownwoolblock",
			() -> new BlockItem(BlockInit.BROWNWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> SEPIAWOOLBLOCK = ITEMS.register("sepiawoolblock",
			() -> new BlockItem(BlockInit.SEPIAWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> FUZZYWUZZYWOOLBLOCK = ITEMS.register("fuzzywuzzywoolblock",
			() -> new BlockItem(BlockInit.FUZZYWUZZYWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> BEAVERWOOLBLOCK = ITEMS.register("beaverwoolblock",
			() -> new BlockItem(BlockInit.BEAVERWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> TUMBLEWEEDWOOLBLOCK = ITEMS.register("tumbleweedwoolblock",
			() -> new BlockItem(BlockInit.TUMBLEWEEDWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> RAWSIENNAWOOLBLOCK = ITEMS.register("rawsiennawoolblock",
			() -> new BlockItem(BlockInit.RAWSIENNAWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> TANWOOLBLOCK = ITEMS.register("tanwoolblock",
			() -> new BlockItem(BlockInit.TANWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> DESERTSANDWOOLBLOCK = ITEMS.register("desertsandwoolblock",
			() -> new BlockItem(BlockInit.DESERTSANDWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> PEACHWOOLBLOCK = ITEMS.register("peachwoolblock",
			() -> new BlockItem(BlockInit.PEACHWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> APRICOTWOOLBLOCK = ITEMS.register("apricotwoolblock",
			() -> new BlockItem(BlockInit.APRICOTWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> ALMONDWOOLBLOCK = ITEMS.register("almondwoolblock",
			() -> new BlockItem(BlockInit.ALMONDWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> RAWUMBERWOOLBLOCK = ITEMS.register("rawumberwoolblock",
			() -> new BlockItem(BlockInit.RAWUMBERWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> SHADOWWOOLBLOCK = ITEMS.register("shadowwoolblock",
			() -> new BlockItem(BlockInit.SHADOWWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> TIMBERWOLFWOOLBLOCK = ITEMS.register("timberwolfwoolblock",
			() -> new BlockItem(BlockInit.TIMBERWOLFWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> GOLDWOOLBLOCK = ITEMS.register("goldwoolblock",
			() -> new BlockItem(BlockInit.GOLDWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> SILVERWOOLBLOCK = ITEMS.register("silverwoolblock",
			() -> new BlockItem(BlockInit.SILVERWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> COPPERWOOLBLOCK = ITEMS.register("copperwoolblock",
			() -> new BlockItem(BlockInit.COPPERWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> ANTIQUEBRASSWOOLBLOCK = ITEMS.register("antiquebrasswoolblock",
			() -> new BlockItem(BlockInit.ANTIQUEBRASSWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> BLACKWOOLBLOCK = ITEMS.register("blackwoolblock",
			() -> new BlockItem(BlockInit.BLACKWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> GRAYWOOLBLOCK = ITEMS.register("graywoolblock",
			() -> new BlockItem(BlockInit.GRAYWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem>BLUEGRAYWOOLBLOCK = ITEMS.register("bluegraywoolblock",
			() -> new BlockItem(BlockInit.BLUEGRAYWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> WHITEWOOLBLOCK = ITEMS.register("whitewoolblock",
			() -> new BlockItem(BlockInit.WHITEWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Fluorescent Colors ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	public static final RegistryObject<BlockItem> RADICALREDWOOLBLOCK = ITEMS.register("radicalredwoolblock",
			() -> new BlockItem(BlockInit.RADICALREDWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> WILDWATERMELONWOOLBLOCK = ITEMS.register("wildwatermelonwoolblock",
			() -> new BlockItem(BlockInit.WILDWATERMELONWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> OUTRAGEOUSORANGEWOOLBLOCK = ITEMS.register("outrageousorangewoolblock",
			() -> new BlockItem(BlockInit.OUTRAGEOUSORANGEWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> SIZZLINGSUNSETWOOLBLOCK = ITEMS.register("sizzlingsunsetwoolblock",
			() -> new BlockItem(BlockInit.SIZZLINGSUNSETWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> NEONCARROTOOLBLOCK = ITEMS.register("neoncarrotwoolblock",
			() -> new BlockItem(BlockInit.NEONCARROTWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> SUNGLOWWOOLBLOCK = ITEMS.register("sunglowwoolblock",
			() -> new BlockItem(BlockInit.SUNGLOWWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> LASERLEMONWOOLBLOCK = ITEMS.register("laserlemonwoolblock",
			() -> new BlockItem(BlockInit.LASERLEMONWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> ELECTIRICLIMEWOOLBLOCK = ITEMS.register("electriclimewoolblock",
			() -> new BlockItem(BlockInit.ELECTRICLIMEWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> SPRINGFORESTWOOLBLOCK = ITEMS.register("springforestwoolblock",
			() -> new BlockItem(BlockInit.SPRINGFORESTWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> MAGICMINTWOOLBLOCK = ITEMS.register("magicmintwoolblock",
			() -> new BlockItem(BlockInit.MAGICMINTWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> BLIZZARDBLUEWOOLBLOCK = ITEMS.register("blizzardbluewoolblock",
			() -> new BlockItem(BlockInit.BLIZZARDBLUEWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> SHOCKINGPINKWOOLBLOCK = ITEMS.register("shockingpinkwoolblock",
			() -> new BlockItem(BlockInit.SHOCKINGPINKWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> RAZZLEDAZZLEROSEWOOLBLOCK = ITEMS.register("razzledazzlerosewoolblock",
			() -> new BlockItem(BlockInit.RAZZLEDAZZLEROSEWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	public static final RegistryObject<BlockItem> PURPLEPIZZAZZWOOLBLOCK = ITEMS.register("purplepizzazzwoolblock",
			() -> new BlockItem(BlockInit.PURPLEPIZZAZZWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
//	public static final RegistryObject<BlockItem> WOOLBLOCK = ITEMS.register("woolblock",
//			() -> new BlockItem(BlockInit.WOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));
	
	
public static final RegistryObject<BlockItem> AMETHYSTWOOLBLOCK = ITEMS.register("amethystwoolblock",
            () -> new BlockItem(BlockInit.AMETHYSTWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> CITRINEWOOLBLOCK = ITEMS.register("citrinewoolblock",
            () -> new BlockItem(BlockInit.CITRINEWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> EMERALDWOOLBLOCK = ITEMS.register("emeraldwoolblock",
            () -> new BlockItem(BlockInit.EMERALDWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> JADEWOOLBLOCK = ITEMS.register("jadewoolblock",
            () -> new BlockItem(BlockInit.JADEWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> JASPERWOOLBLOCK = ITEMS.register("jasperwoolblock",
            () -> new BlockItem(BlockInit.JASPERWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> LAPISLAZULIWOOLBLOCK = ITEMS.register("lapislazuliwoolblock",
            () -> new BlockItem(BlockInit.LAPISLAZULIWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> MALACHITEWOOLBLOCK = ITEMS.register("malachitewoolblock",
            () -> new BlockItem(BlockInit.MALACHITEWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> MOONSTONEWOOLBLOCK = ITEMS.register("moonstonewoolblock",
            () -> new BlockItem(BlockInit.MOONSTONEWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> ONYXWOOLBLOCK = ITEMS.register("onyxwoolblock",
            () -> new BlockItem(BlockInit.ONYXWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> PERIDOTWOOLBLOCK = ITEMS.register("peridotwoolblock",
            () -> new BlockItem(BlockInit.PERIDOTWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> PINKPEARLWOOLBLOCK = ITEMS.register("pinkpearlwoolblock",
            () -> new BlockItem(BlockInit.PINKPEARLWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> ROSEQUARTZWOOLBLOCK = ITEMS.register("rosequartzwoolblock",
            () -> new BlockItem(BlockInit.ROSEQUARTZWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> RUBYWOOLBLOCK = ITEMS.register("rubywoolblock",
            () -> new BlockItem(BlockInit.RUBYWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> SAPPHIREWOOLBLOCK = ITEMS.register("sapphirewoolblock",
            () -> new BlockItem(BlockInit.SAPPHIREWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> SMOKEYTOPAZWOOLBLOCK = ITEMS.register("smokeytopazwoolblock",
            () -> new BlockItem(BlockInit.SMOKEYTOPAZWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> TIGERSEYEWOOLBLOCK = ITEMS.register("tigerseyewoolblock",
            () -> new BlockItem(BlockInit.TIGERSEYEWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> BUBBLEGUMSTARWOOLBLOCK = ITEMS.register("bubblegumstarwoolblock",
            () -> new BlockItem(BlockInit.BUBBLEGUMSTARWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> BLUSHINGSTARWOOLBLOCK = ITEMS.register("blushingstarwoolblock",
            () -> new BlockItem(BlockInit.BLUSHINGSTARWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> BRICKREDSTARWOOLBLOCK = ITEMS.register("brickredstarwoolblock",
            () -> new BlockItem(BlockInit.BRICKREDSTARWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> LAVAREDSTARWOOLBLOCK = ITEMS.register("lavaredstarwoolblock",
            () -> new BlockItem(BlockInit.LAVAREDSTARWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> PUMPKINSTARWOOLBLOCK = ITEMS.register("pumpkinstarwoolblock",
            () -> new BlockItem(BlockInit.PUMPKINSTARWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> LEMONDROPSTARWOOLBLOCK = ITEMS.register("lemondropstarwoolblock",
            () -> new BlockItem(BlockInit.LEMONDROPSTARWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> MINTGREENSTARWOOLBLOCK = ITEMS.register("mintgreenstarwoolblock",
            () -> new BlockItem(BlockInit.MINTGREENSTARWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> JADESTARWOOLBLOCK = ITEMS.register("jadestarwoolblock",
            () -> new BlockItem(BlockInit.JADESTARWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> DEEPSEABLUESTARWOOLBLOCK = ITEMS.register("deepseabluestarwoolblock",
            () -> new BlockItem(BlockInit.DEEPSEABLUESTARWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> SKYSTARWOOLBLOCK = ITEMS.register("skystarwoolblock",
            () -> new BlockItem(BlockInit.SKYSTARWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> OCEANSTARWOOLBLOCK = ITEMS.register("oceanstarwoolblock",
            () -> new BlockItem(BlockInit.OCEANSTARWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> PLUMSTARWOOLBLOCK = ITEMS.register("plumstarwoolblock",
            () -> new BlockItem(BlockInit.PLUMSTARWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> BLUEBERRYSTARWOOLBLOCK = ITEMS.register("blueberrystarwoolblock",
            () -> new BlockItem(BlockInit.BLUEBERRYSTARWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> VOIDSTARWOOLBLOCK = ITEMS.register("voidstarwoolblock",
            () -> new BlockItem(BlockInit.VOIDSTARWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> LAVAORANGESTARWOOLBLOCK = ITEMS.register("lavaorangestarwoolblock",
            () -> new BlockItem(BlockInit.LAVAORANGESTARWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> CARROTCAKESTARWOOLBLOCK = ITEMS.register("carrotcakestarwoolblock",
            () -> new BlockItem(BlockInit.CARROTCAKESTARWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> AQUAPEARLWOOLBLOCK = ITEMS.register("aquapearlwoolblock",
            () -> new BlockItem(BlockInit.AQUAPEARLWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> BLACKCORALPEARLWOOLBLOCK = ITEMS.register("blackcoralpearlwoolblock",
            () -> new BlockItem(BlockInit.BLACKCORALPEARLWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> CARIBBEANGREENPEARLWOOLBLOCK = ITEMS.register("caribbeangreenpearlwoolblock",
            () -> new BlockItem(BlockInit.CARIBBEANGREENPEARLWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> CULTUREDPEARLWOOLBLOCK = ITEMS.register("culturedpearlwoolblock",
            () -> new BlockItem(BlockInit.CULTUREDPEARLWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> KEYLIMEPEARLWOOLBLOCK = ITEMS.register("keylimepearlwoolblock",
            () -> new BlockItem(BlockInit.KEYLIMEPEARLWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> MANDARINPEARLWOOLBLOCK = ITEMS.register("mandarinpearlwoolblock",
            () -> new BlockItem(BlockInit.MANDARINPEARLWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> MIDNIGHTPEARLWOOLBLOCK = ITEMS.register("midnightpearlwoolblock",
            () -> new BlockItem(BlockInit.MIDNIGHTPEARLWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> MYSTICPEARLWOOLBLOCK = ITEMS.register("mysticpearlwoolblock",
            () -> new BlockItem(BlockInit.MYSTICPEARLWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> OCEANBLUEPEARLWOOLBLOCK = ITEMS.register("oceanbluepearlwoolblock",
            () -> new BlockItem(BlockInit.OCEANBLUEPEARLWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> OCEANGREENPEARLWOOLBLOCK = ITEMS.register("oceangreenpearlwoolblock",
            () -> new BlockItem(BlockInit.OCEANGREENPEARLWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> ORCHIDPEARLWOOLBLOCK = ITEMS.register("orchidpearlwoolblock",
            () -> new BlockItem(BlockInit.ORCHIDPEARLWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> ROSEPEARLWOOLBLOCK = ITEMS.register("rosepearlwoolblock",
            () -> new BlockItem(BlockInit.ROSEPEARLWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> SALMONPEARLWOOLBLOCK = ITEMS.register("salmonpearlwoolblock",
            () -> new BlockItem(BlockInit.SALMONPEARLWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> SUNNYPEARLWOOLBLOCK = ITEMS.register("sunnypearlwoolblock",
            () -> new BlockItem(BlockInit.SUNNYPEARLWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> SUNSETPEARLWOOLBLOCK = ITEMS.register("sunsetpearlwoolblock",
            () -> new BlockItem(BlockInit.SUNSETPEARLWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> TURQUOISEPEARLWOOLBLOCK = ITEMS.register("turquoisepearlwoolblock",
            () -> new BlockItem(BlockInit.TURQUOISEPEARLWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> WARNINGREDWOOLBLOCK = ITEMS.register("warningredwoolblock",
            () -> new BlockItem(BlockInit.WARNINGREDWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> SUNBURNTREDWOOLBLOCK = ITEMS.register("sunburntredwoolblock",
            () -> new BlockItem(BlockInit.SUNBURNTREDWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> CAUTIONORANGEWOOLBLOCK = ITEMS.register("cautionorangewoolblock",
            () -> new BlockItem(BlockInit.CAUTIONORANGEWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> SPEEDBUMPORANGEWOOLBLOCK = ITEMS.register("speedbumporangewoolblock",
            () -> new BlockItem(BlockInit.SPEEDBUMPORANGEWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> SLOWYELLOWWOOLBLOCK = ITEMS.register("slowyellowwoolblock",
            () -> new BlockItem(BlockInit.SLOWYELLOWWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> SICKLYGREENWOOLBLOCK = ITEMS.register("sicklygreenwoolblock",
            () -> new BlockItem(BlockInit.SICKLYGREENWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> WATERLOGGEDBLUEWOOLBLOCK = ITEMS.register("waterloggedbluewoolblock",
            () -> new BlockItem(BlockInit.WATERLOGGEDBLUEWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> CLEARSKYBLUEWOOLBLOCK = ITEMS.register("clearskybluewoolblock",
            () -> new BlockItem(BlockInit.CLEARSKYBLUEWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> BLUEPRINTBLUEWOOLBLOCK = ITEMS.register("blueprintbluewoolblock",
            () -> new BlockItem(BlockInit.BLUEPRINTBLUEWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> PECULIARPURPLEWOOLBLOCK = ITEMS.register("peculiarpurplewoolblock",
            () -> new BlockItem(BlockInit.PECULIARPURPLEWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> BRUISEDPURPLEWOOLBLOCK = ITEMS.register("bruisedpurplewoolblock",
            () -> new BlockItem(BlockInit.BRUISEDPURPLEWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> DIRTBROWNWOOLBLOCK = ITEMS.register("dirtbrownwoolblock",
            () -> new BlockItem(BlockInit.DIRTBROWNWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> ALLOYORANGEWOOLBLOCK = ITEMS.register("alloyorangewoolblock",
            () -> new BlockItem(BlockInit.ALLOYORANGEWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> BDAZZLEDBLUEWOOLBLOCK = ITEMS.register("bdazzledbluewoolblock",
            () -> new BlockItem(BlockInit.BDAZZLEDBLUEWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> BIGDIPORUBYWOOLBLOCK = ITEMS.register("bigdiporubywoolblock",
            () -> new BlockItem(BlockInit.BIGDIPORUBYWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> BITTERSWEETSHIMMERWOOLBLOCK = ITEMS.register("bittersweetshimmerwoolblock",
            () -> new BlockItem(BlockInit.BITTERSWEETSHIMMERWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> BLASTOFFBRONZEWOOLBLOCK = ITEMS.register("blastoffbronzewoolblock",
            () -> new BlockItem(BlockInit.BLASTOFFBRONZEWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> CYBERGRAPEWOOLBLOCK = ITEMS.register("cybergrapewoolblock",
            () -> new BlockItem(BlockInit.CYBERGRAPEWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> DEEPSPACESPARKLEWOOLBLOCK = ITEMS.register("deepspacesparklewoolblock",
            () -> new BlockItem(BlockInit.DEEPSPACESPARKLEWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> GOLDFUSIONWOOLBLOCK = ITEMS.register("goldfusionwoolblock",
            () -> new BlockItem(BlockInit.GOLDFUSIONWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> ILLUMINATINGEMERALDWOOLBLOCK = ITEMS.register("illuminatingemeraldwoolblock",
            () -> new BlockItem(BlockInit.ILLUMINATINGEMERALDWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> METALLICSEAWEEDWOOLBLOCK = ITEMS.register("metallicseaweedwoolblock",
            () -> new BlockItem(BlockInit.METALLICSEAWEEDWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> ROBOTCANARYWOOLBLOCK = ITEMS.register("robotcanarywoolblock",
            () -> new BlockItem(BlockInit.ROBOTCANARYWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> RAZZMICBERRYWOOLBLOCK = ITEMS.register("razzmicberrywoolblock",
            () -> new BlockItem(BlockInit.RAZZMICBERRYWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> SHEENGREENWOOLBLOCK = ITEMS.register("sheengreenwoolblock",
            () -> new BlockItem(BlockInit.SHEENGREENWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> SHIMMERINGBLUSHWOOLBLOCK = ITEMS.register("shimmeringblushwoolblock",
            () -> new BlockItem(BlockInit.SHIMMERINGBLUSHWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> SONICSILVERWOOLBLOCK = ITEMS.register("sonicsilverwoolblock",
            () -> new BlockItem(BlockInit.SONICSILVERWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> STEELBLUEWOOLBLOCK = ITEMS.register("steelbluewoolblock",
            () -> new BlockItem(BlockInit.STEELBLUEWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> CHEESEGRATERWOOLBLOCK = ITEMS.register("cheesegraterwoolblock",
            () -> new BlockItem(BlockInit.CHEESEGRATERWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> IRONINDIGOWOOLBLOCK = ITEMS.register("ironindigowoolblock",
            () -> new BlockItem(BlockInit.IRONINDIGOWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> MAGNETICMAGENTAWOOLBLOCK = ITEMS.register("magneticmagentawoolblock",
            () -> new BlockItem(BlockInit.MAGNETICMAGENTAWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> COBALTCOOLWOOLBLOCK = ITEMS.register("cobaltcoolwoolblock",
            () -> new BlockItem(BlockInit.COBALTCOOLWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> ACIDWASHJEANSWOOLBLOCK = ITEMS.register("acidwashjeanswoolblock",
            () -> new BlockItem(BlockInit.ACIDWASHJEANSWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> PETRIFIEDFORESTWOOLBLOCK = ITEMS.register("petrifiedforestwoolblock",
            () -> new BlockItem(BlockInit.PETRIFIEDFORESTWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> ROSEGOLDWOOLBLOCK = ITEMS.register("rosegoldwoolblock",
            () -> new BlockItem(BlockInit.ROSEGOLDWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> GOLDMEDALWOOLBLOCK = ITEMS.register("goldmedalwoolblock",
            () -> new BlockItem(BlockInit.GOLDMEDALWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> LIPSTICKPINKWOOLBLOCK = ITEMS.register("lipstickpinkwoolblock",
            () -> new BlockItem(BlockInit.LIPSTICKPINKWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> CRUSHPINKWOOLBLOCK = ITEMS.register("crushpinkwoolblock",
            () -> new BlockItem(BlockInit.CRUSHPINKWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> SASSYMALASSYWOOLBLOCK = ITEMS.register("sassymalassywoolblock",
            () -> new BlockItem(BlockInit.SASSYMALASSYWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> ORANGESHERBERTWOOLBLOCK = ITEMS.register("orangesherbertwoolblock",
            () -> new BlockItem(BlockInit.ORANGESHERBERTWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> ORANGEDREAMWOOLBLOCK = ITEMS.register("orangedreamwoolblock",
            () -> new BlockItem(BlockInit.ORANGEDREAMWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> LEMONBLASTWOOLBLOCK = ITEMS.register("lemonblastwoolblock",
            () -> new BlockItem(BlockInit.LEMONBLASTWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> LIMEWOOLBLOCK = ITEMS.register("limewoolblock",
            () -> new BlockItem(BlockInit.LIMEWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> ELECTRICBLUEWOOLBLOCK = ITEMS.register("electricbluewoolblock",
            () -> new BlockItem(BlockInit.ELECTRICBLUEWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> PLATYPUSWOOLBLOCK = ITEMS.register("platypuswoolblock",
            () -> new BlockItem(BlockInit.PLATYPUSWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> DEEPSKYBLUEWOOLBLOCK = ITEMS.register("deepskybluewoolblock",
            () -> new BlockItem(BlockInit.DEEPSKYBLUEWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> SOMEKINDAGRAYWOOLBLOCK = ITEMS.register("somekindagraywoolblock",
            () -> new BlockItem(BlockInit.SOMEKINDAGRAYWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> BERRYLICIOUSBLUEWOOLBLOCK = ITEMS.register("berryliciousbluewoolblock",
            () -> new BlockItem(BlockInit.BERRYLICIOUSBLUEWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> TARDISBLUEWOOLBLOCK = ITEMS.register("tardisbluewoolblock",
            () -> new BlockItem(BlockInit.TARDISBLUEWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> BASILWOOLBLOCK = ITEMS.register("basilwoolblock",
            () -> new BlockItem(BlockInit.BASILWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> ANTIQUEGRAYWOOLBLOCK = ITEMS.register("antiquegraywoolblock",
            () -> new BlockItem(BlockInit.ANTIQUEGRAYWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> APPLEORCHARDWOOLBLOCK = ITEMS.register("appleorchardwoolblock",
            () -> new BlockItem(BlockInit.APPLEORCHARDWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> BERRYPARFAITWOOLBLOCK = ITEMS.register("berryparfaitwoolblock",
            () -> new BlockItem(BlockInit.BERRYPARFAITWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> BLACKPEARLWOOLBLOCK = ITEMS.register("blackpearlwoolblock",
            () -> new BlockItem(BlockInit.BLACKPEARLWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> BUBBLEGUMWOOLBLOCK = ITEMS.register("bubblegumwoolblock",
            () -> new BlockItem(BlockInit.BUBBLEGUMWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> BUTTERNUTSQUASHWOOLBLOCK = ITEMS.register("butternutsquashwoolblock",
            () -> new BlockItem(BlockInit.BUTTERNUTSQUASHWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> CARIBBEANSEAWOOLBLOCK = ITEMS.register("caribbeanseawoolblock",
            () -> new BlockItem(BlockInit.CARIBBEANSEAWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> CLOUDYSKYWOOLBLOCK = ITEMS.register("cloudyskywoolblock",
            () -> new BlockItem(BlockInit.CLOUDYSKYWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> HOTCOCOAWOOLBLOCK = ITEMS.register("hotcocoawoolblock",
            () -> new BlockItem(BlockInit.HOTCOCOAWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> IRIDESCENTINDIGOWOOLBLOCK = ITEMS.register("iridescentindigowoolblock",
            () -> new BlockItem(BlockInit.IRIDESCENTINDIGOWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> LAVENDERSILKWOOLBLOCK = ITEMS.register("lavendersilkwoolblock",
            () -> new BlockItem(BlockInit.LAVENDERSILKWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> LEAFYCANOPYWOOLBLOCK = ITEMS.register("leafycanopywoolblock",
            () -> new BlockItem(BlockInit.LEAFYCANOPYWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> LIQUIDGOLDWOOLBLOCK = ITEMS.register("liquidgoldwoolblock",
            () -> new BlockItem(BlockInit.LIQUIDGOLDWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> MANGOPUREEWOOLBLOCK = ITEMS.register("mangopureewoolblock",
            () -> new BlockItem(BlockInit.MANGOPUREEWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> MOONLITPONDWOOLBLOCK = ITEMS.register("moonlitpondwoolblock",
            () -> new BlockItem(BlockInit.MOONLITPONDWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> OCEANFOAMWOOLBLOCK = ITEMS.register("oceanfoamwoolblock",
            () -> new BlockItem(BlockInit.OCEANFOAMWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> ORANGEPEELWOOLBLOCK = ITEMS.register("orangepeelwoolblock",
            () -> new BlockItem(BlockInit.ORANGEPEELWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> PESTOWOOLBLOCK = ITEMS.register("pestowoolblock",
            () -> new BlockItem(BlockInit.PESTOWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> PINKLUSTERWOOLBLOCK = ITEMS.register("pinklusterwoolblock",
            () -> new BlockItem(BlockInit.PINKLUSTERWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> REDSATINWOOLBLOCK = ITEMS.register("redsatinwoolblock",
            () -> new BlockItem(BlockInit.REDSATINWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> SEAGLASSWOOLBLOCK = ITEMS.register("seaglasswoolblock",
            () -> new BlockItem(BlockInit.SEAGLASSWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> SHOOTINGSTARWOOLBLOCK = ITEMS.register("shootingstarwoolblock",
            () -> new BlockItem(BlockInit.SHOOTINGSTARWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> SNOWDRIFTWOOLBLOCK = ITEMS.register("snowdriftwoolblock",
            () -> new BlockItem(BlockInit.SNOWDRIFTWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> SUNSETSHIMMERWOOLBLOCK = ITEMS.register("sunsetshimmerwoolblock",
            () -> new BlockItem(BlockInit.SUNSETSHIMMERWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> BLACKHAIRWOOLBLOCK = ITEMS.register("blackhairwoolblock",
            () -> new BlockItem(BlockInit.BLACKHAIRWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> BLONDEHAIRWOOLBLOCK = ITEMS.register("blondehairwoolblock",
            () -> new BlockItem(BlockInit.BLONDEHAIRWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> BLUEEYESWOOLBLOCK = ITEMS.register("blueeyeswoolblock",
            () -> new BlockItem(BlockInit.BLUEEYESWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> BROWNEYESWOOLBLOCK = ITEMS.register("browneyeswoolblock",
            () -> new BlockItem(BlockInit.BROWNEYESWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> BROWNHAIRWOOLBLOCK = ITEMS.register("brownhairwoolblock",
            () -> new BlockItem(BlockInit.BROWNHAIRWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> DEEPALMONDWOOLBLOCK = ITEMS.register("deepalmondwoolblock",
            () -> new BlockItem(BlockInit.DEEPALMONDWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> DEEPGOLDENWOOLBLOCK = ITEMS.register("deepgoldenwoolblock",
            () -> new BlockItem(BlockInit.DEEPGOLDENWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> DEEPROSEWOOLBLOCK = ITEMS.register("deeprosewoolblock",
            () -> new BlockItem(BlockInit.DEEPROSEWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> DEEPESTALMONDWOOLBLOCK = ITEMS.register("deepestalmondwoolblock",
            () -> new BlockItem(BlockInit.DEEPESTALMONDWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> EXTRADEEPALMONDWOOLBLOCK = ITEMS.register("extradeepalmondwoolblock",
            () -> new BlockItem(BlockInit.EXTRADEEPALMONDWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> EXTRADEEPGOLDENWOOLBLOCK = ITEMS.register("extradeepgoldenwoolblock",
            () -> new BlockItem(BlockInit.EXTRADEEPGOLDENWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> EXTRADEEPROSEWOOLBLOCK = ITEMS.register("extradeeprosewoolblock",
            () -> new BlockItem(BlockInit.EXTRADEEPROSEWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> EXTRALIGHTALMONDWOOLBLOCK = ITEMS.register("extralightalmondwoolblock",
            () -> new BlockItem(BlockInit.EXTRALIGHTALMONDWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> GREENEYESWOOLBLOCK = ITEMS.register("greeneyeswoolblock",
            () -> new BlockItem(BlockInit.GREENEYESWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> HAZELEYESWOOLBLOCK = ITEMS.register("hazeleyeswoolblock",
            () -> new BlockItem(BlockInit.HAZELEYESWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> LIGHTALMONDWOOLBLOCK = ITEMS.register("lightalmondwoolblock",
            () -> new BlockItem(BlockInit.LIGHTALMONDWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> LIGHTGOLDENWOOLBLOCK = ITEMS.register("lightgoldenwoolblock",
            () -> new BlockItem(BlockInit.LIGHTGOLDENWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> LIGHTMEDIUMALMONDWOOLBLOCK = ITEMS.register("lightmediumalmondwoolblock",
            () -> new BlockItem(BlockInit.LIGHTMEDIUMALMONDWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> LIGHTMEDIUMGOLDENWOOLBLOCK = ITEMS.register("lightmediumgoldenwoolblock",
            () -> new BlockItem(BlockInit.LIGHTMEDIUMGOLDENWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> LIGHTMEDIUMROSEWOOLBLOCK = ITEMS.register("lightmediumrosewoolblock",
            () -> new BlockItem(BlockInit.LIGHTMEDIUMROSEWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> LIGHTROSEWOOLBLOCK = ITEMS.register("lightrosewoolblock",
            () -> new BlockItem(BlockInit.LIGHTROSEWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> MEDIUMALMONDWOOLBLOCK = ITEMS.register("mediumalmondwoolblock",
            () -> new BlockItem(BlockInit.MEDIUMALMONDWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> MEDIUMDEEPALMONDWOOLBLOCK = ITEMS.register("mediumdeepalmondwoolblock",
            () -> new BlockItem(BlockInit.MEDIUMDEEPALMONDWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> MEDIUMDEEPGOLDENWOOLBLOCK = ITEMS.register("mediumdeepgoldenwoolblock",
            () -> new BlockItem(BlockInit.MEDIUMDEEPGOLDENWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> MEDIUMDEEPROSEWOOLBLOCK = ITEMS.register("mediumdeeprosewoolblock",
            () -> new BlockItem(BlockInit.MEDIUMDEEPROSEWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> MEDIUMGOLDENWOOLBLOCK = ITEMS.register("mediumgoldenwoolblock",
            () -> new BlockItem(BlockInit.MEDIUMGOLDENWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> REDHAIRWOOLBLOCK = ITEMS.register("redhairwoolblock",
            () -> new BlockItem(BlockInit.REDHAIRWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> VERYDEEPALMONDWOOLBLOCK = ITEMS.register("verydeepalmondwoolblock",
            () -> new BlockItem(BlockInit.VERYDEEPALMONDWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> VERYDEEPROSEWOOLBLOCK = ITEMS.register("verydeeprosewoolblock",
            () -> new BlockItem(BlockInit.VERYDEEPROSEWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> VERYLIGHTALMONDWOOLBLOCK = ITEMS.register("verylightalmondwoolblock",
            () -> new BlockItem(BlockInit.VERYLIGHTALMONDWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> VERYLIGHTGOLDENWOOLBLOCK = ITEMS.register("verylightgoldenwoolblock",
            () -> new BlockItem(BlockInit.VERYLIGHTGOLDENWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> VERYLIGHTROSEWOOLBLOCK = ITEMS.register("verylightrosewoolblock",
            () -> new BlockItem(BlockInit.VERYLIGHTROSEWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> ABSOLUTEZEROWOOLBLOCK = ITEMS.register("absolutezerowoolblock",
            () -> new BlockItem(BlockInit.ABSOLUTEZEROWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> WINTERSKYWOOLBLOCK = ITEMS.register("winterskywoolblock",
            () -> new BlockItem(BlockInit.WINTERSKYWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> FROSTBITEWOOLBLOCK = ITEMS.register("frostbitewoolblock",
            () -> new BlockItem(BlockInit.FROSTBITEWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

public static final RegistryObject<BlockItem> BLUERIBBONWOOLBLOCK = ITEMS.register("blueribbonwoolblock",
            () -> new BlockItem(BlockInit.BLUERIBBONWOOLBLOCK.get(), new Item.Properties().tab(ExtendedColorsItemGroup.EXTENDEDCOLORS_WOOL)));

}