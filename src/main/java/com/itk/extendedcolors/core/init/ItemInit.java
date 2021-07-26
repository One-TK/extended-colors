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
	
	
}
