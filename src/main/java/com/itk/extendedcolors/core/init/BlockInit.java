package com.itk.extendedcolors.core.init;

import com.itk.extendedcolors.ExtendedColors;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
			ExtendedColors.MOD_ID);
	
	//vvvvvvvvvvvvvvvvvvvvv delete when wool is finished vvvvvvvvvvvvvvvvvvvv
	public static final RegistryObject<Block> EXAMPLE_BLOCK = BLOCKS.register("example_block",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));
	
/*
  	public static final RegistryObject<Block> REDWOOLBLOCK = BLOCKS.register("redwoolblock",
			() -> new WoolBlock(AbstractBlock.Properties.from(Blocks.WHITE_WOOL)));
*/
	
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Standard Colors ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	public static final RegistryObject<Block> REDWOOLBLOCK = BLOCKS.register("redwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));
	
	public static final RegistryObject<Block> MAROONWOOLBLOCK = BLOCKS.register("maroonwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));
	
	public static final RegistryObject<Block> SCARLETWOOLBLOCK = BLOCKS.register("scarletwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));
	
	public static final RegistryObject<Block> BRICKREDWOOLBLOCK = BLOCKS.register("brickredwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));
	
	public static final RegistryObject<Block> CHESTNUTWOOLBLOCK = BLOCKS.register("chestnutwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));
	
	public static final RegistryObject<Block> ORANGEREDWOOLBLOCK = BLOCKS.register("orangeredwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));
	
	public static final RegistryObject<Block> SUNSETORANGEWOOLBLOCK = BLOCKS.register("sunsetorangewoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));
	
	public static final RegistryObject<Block> BITTERSWEETWOOLBLOCK = BLOCKS.register("bittersweetwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));
	
	public static final RegistryObject<Block> VIVIDTANGERINEWOOLBLOCK = BLOCKS.register("vividtangerinewoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));
	
	public static final RegistryObject<Block> BURNTORANGEWOOLBLOCK = BLOCKS.register("burntorangewoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));
	
	public static final RegistryObject<Block> REDORANGEWOOLBLOCK = BLOCKS.register("redorangewoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));
	
	public static final RegistryObject<Block> ORANGEWOOLBLOCK = BLOCKS.register("orangewoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> MACANDCHEESEWOOLBLOCK = BLOCKS.register("macandcheesewoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> MANGOTANGOWOOLBLOCK = BLOCKS.register("mangotangowoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> YELLOWORANGEWOOLBLOCK = BLOCKS.register("yelloworangewoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> BANANAMANIAWOOLBLOCK = BLOCKS.register("bananamaniawoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> MAIZEWOOLBLOCK = BLOCKS.register("maizewoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> ORANGEYELLOWWOOLBLOCK = BLOCKS.register("orangeyellowwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> GOLDENRODWOOLBLOCK = BLOCKS.register("goldenrodwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> DANDELIONWOOLBLOCK = BLOCKS.register("dandelionwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> YELLOWWOOLBLOCK = BLOCKS.register("yellowwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> GREENYELLOWWOOLBLOCK = BLOCKS.register("greenyellowwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> OLIVEGREENWOOLBLOCK = BLOCKS.register("olivegreenwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> SPRINGGREENWOOLBLOCK = BLOCKS.register("springgreenwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> CANARYWOOLBLOCK = BLOCKS.register("canarywoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> LEMONYELLOWWOOLBLOCK = BLOCKS.register("lemonyellowwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> INCHWORMWOOLBLOCK = BLOCKS.register("inchwormwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> YELLOWGREENWOOLBLOCK = BLOCKS.register("yellowgreenwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> ASPARAGUSWOOLBLOCK = BLOCKS.register("asparaguswoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> GRANNYSMITHAPPLEWOOLBLOCK = BLOCKS.register("grannysmithapplewoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> FERNWOOLBLOCK = BLOCKS.register("fernwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> GREENWOOLBLOCK = BLOCKS.register("greenwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> FORESTGREENWOOLBLOCK = BLOCKS.register("forestgreenwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> SEAGREENWOOLBLOCK = BLOCKS.register("seagreenwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> SHAMROCKWOOLBLOCK = BLOCKS.register("shamrockwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> MOUNTAINMEADOWWOOLBLOCK = BLOCKS.register("mountainmeadowwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> JUNGLEGREENWOOLBLOCK = BLOCKS.register("junglegreenwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> CARIBBEANGREENWOOLBLOCK = BLOCKS.register("caribbeangreenwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> TROPICALRAINFORESTWOOLBLOCK = BLOCKS.register("tropicalrainforestwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> PINEGREENWOOLBLOCK = BLOCKS.register("pinegreenwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> ROBINSEGGBLUEWOOLBLOCK = BLOCKS.register("robinseggbluewoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> TEALBLUEWOOLBLOCK = BLOCKS.register("tealbluewoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> LIGHTBLUEWOOLBLOCK = BLOCKS.register("lightbluewoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> AQUAMARINEWOOLBLOCK = BLOCKS.register("aquamarinewoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> TURQUOISEBLUEWOOLBLOCK = BLOCKS.register("turquoisebluewoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> OUTERSPACEWOOLBLOCK = BLOCKS.register("outerspacewoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> SKYBLUEWOOLBLOCK = BLOCKS.register("skybluewoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> BLUEGREENWOOLBLOCK = BLOCKS.register("bluegreenwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> PACIFICBLUEWOOLBLOCK = BLOCKS.register("pacificbluewoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> CERULEANWOOLBLOCK = BLOCKS.register("ceruleanwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> CORNFLOWERWOOLBLOCK = BLOCKS.register("cornflowerwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> GREENBLUEWOOLBLOCK = BLOCKS.register("greenbluewoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> MIDNIGHTBLUEWOOLBLOCK = BLOCKS.register("midnightbluewoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> NAVYBLUEWOOLBLOCK = BLOCKS.register("navybluewoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> DENIMWOOLBLOCK = BLOCKS.register("denimwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> BLUEWOOLBLOCK = BLOCKS.register("bluewoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> CADETBLUEWOOLBLOCK = BLOCKS.register("cadetbluewoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> PERIWINKLEWOOLBLOCK = BLOCKS.register("periwinklewoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> BLUETIFULWOOLBLOCK = BLOCKS.register("bluetifulwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));
	
	public static final RegistryObject<Block> WILDBLUEYONDERWOOLBLOCK = BLOCKS.register("wildblueyonderwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> INDIGOWOOLBLOCK = BLOCKS.register("indigowoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> MANATEEWOOLBLOCK = BLOCKS.register("manateewoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> BLUEBELLWOOLBLOCK = BLOCKS.register("bluebellwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> VIOLETBLUEWOOLBLOCK = BLOCKS.register("violetbluewoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> BLUEVIOLETWOOLBLOCK = BLOCKS.register("bluevioletwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> PURPLEHEARTWOOLBLOCK = BLOCKS.register("purpleheartwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> ROYALPURPLEWOOLBLOCK = BLOCKS.register("royalpurplewoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> VIOLETWOOLBLOCK = BLOCKS.register("violetwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> WISTERIAWOOLBLOCK = BLOCKS.register("wisteriawoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> LAVENDERWOOLBLOCK = BLOCKS.register("lavenderwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> VIVIDVIOLETWOOLBLOCK = BLOCKS.register("vividvioletwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> PURPLEMOUNTAINSMAJESTYWOOLBLOCK = BLOCKS.register("purplemountainsmajestywoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> FUCHSIAWOOLBLOCK = BLOCKS.register("fuchsiawoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> PINKFLAMINGOWOOLBLOCK = BLOCKS.register("pinkflamingowoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> ORCHIDWOOLBLOCK = BLOCKS.register("orchidwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> PLUMWOOLBLOCK = BLOCKS.register("plumwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> THISTLEWOOLBLOCK = BLOCKS.register("thistlewoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> MULBERRYWOOLBLOCK = BLOCKS.register("mulberrywoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> REDVIOLETWOOLBLOCK = BLOCKS.register("redvioletwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> JAZZBERRYJAMWOOLBLOCK = BLOCKS.register("jazzberryjamwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> EGGPLANTWOOLBLOCK = BLOCKS.register("eggplantwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> MAGENTAWOOLBLOCK = BLOCKS.register("magentawoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));
	

	public static final RegistryObject<Block> CERISEWOOLBLOCK = BLOCKS.register("cerisewoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));
	

	public static final RegistryObject<Block> WILDSTRAWBERRYWOOLBLOCK = BLOCKS.register("wildstrawberrywoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));
	

	public static final RegistryObject<Block> COTTONCANDYWOOLBLOCK = BLOCKS.register("cottoncandywoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));
	

	public static final RegistryObject<Block> CARNATIONPINKWOOLBLOCK = BLOCKS.register("carnationpinkwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));
	

	public static final RegistryObject<Block> VIOLETREDWOOLBLOCK = BLOCKS.register("violetredwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));
	

	public static final RegistryObject<Block> RAZZMATAZZWOOLBLOCK = BLOCKS.register("razzmatazzwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));
	

	public static final RegistryObject<Block> PIGGYPINKWOOLBLOCK = BLOCKS.register("piggypinkwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));
	

	public static final RegistryObject<Block> BLUSHWOOLBLOCK = BLOCKS.register("blushwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));
	

	public static final RegistryObject<Block> TICKLEMEPINKWOOLBLOCK = BLOCKS.register("ticklemepinkwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));
	

	public static final RegistryObject<Block> MAUVELOUSWOOLBLOCK = BLOCKS.register("mauvelouswoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));
	

	public static final RegistryObject<Block> SALMONWOOLBLOCK = BLOCKS.register("salmonwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));
	

	public static final RegistryObject<Block> MAHOGANYWOOLBLOCK = BLOCKS.register("mahoganywoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));
	

	public static final RegistryObject<Block> MELONWOOLBLOCK = BLOCKS.register("melonwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));
	

	public static final RegistryObject<Block> PINKSHERBERTWOOLBLOCK = BLOCKS.register("pinksherbertwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));
	

	public static final RegistryObject<Block> BURNTSIENNAWOOLBLOCK = BLOCKS.register("burntsiennawoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));
	

	public static final RegistryObject<Block> BROWNWOOLBLOCK = BLOCKS.register("brownwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));
	

	public static final RegistryObject<Block> SEPIAWOOLBLOCK = BLOCKS.register("sepiawoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));
	

	public static final RegistryObject<Block> FUZZYWUZZYWOOLBLOCK = BLOCKS.register("fuzzywuzzywoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));
	

	public static final RegistryObject<Block> BEAVERWOOLBLOCK = BLOCKS.register("beaverwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));
	

	public static final RegistryObject<Block> TUMBLEWEEDWOOLBLOCK = BLOCKS.register("tumbleweedwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));
	

	public static final RegistryObject<Block> RAWSIENNAWOOLBLOCK = BLOCKS.register("rawsiennawoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));
	

	public static final RegistryObject<Block> TANWOOLBLOCK = BLOCKS.register("tanwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));
	

	public static final RegistryObject<Block> DESERTSANDWOOLBLOCK = BLOCKS.register("desertsandwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));
	

	public static final RegistryObject<Block> PEACHWOOLBLOCK = BLOCKS.register("peachwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> APRICOTWOOLBLOCK = BLOCKS.register("apricotwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> ALMONDWOOLBLOCK = BLOCKS.register("almondwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> RAWUMBERWOOLBLOCK = BLOCKS.register("rawumberwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> SHADOWWOOLBLOCK = BLOCKS.register("shadowwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> TIMBERWOLFWOOLBLOCK = BLOCKS.register("timberwolfwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> GOLDWOOLBLOCK = BLOCKS.register("goldwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> SILVERWOOLBLOCK = BLOCKS.register("silverwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> COPPERWOOLBLOCK = BLOCKS.register("copperwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> ANTIQUEBRASSWOOLBLOCK = BLOCKS.register("antiquebrasswoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> BLACKWOOLBLOCK = BLOCKS.register("blackwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> GRAYWOOLBLOCK = BLOCKS.register("graywoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> BLUEGRAYWOOLBLOCK = BLOCKS.register("bluegraywoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> WHITEWOOLBLOCK = BLOCKS.register("whitewoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));
	
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Fluorescent Colors ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

	public static final RegistryObject<Block> RADICALREDWOOLBLOCK = BLOCKS.register("radicalredwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> WILDWATERMELONWOOLBLOCK = BLOCKS.register("wildwatermelonwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> OUTRAGEOUSORANGEWOOLBLOCK = BLOCKS.register("outrageousorangewoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> SIZZLINGSUNSETWOOLBLOCK = BLOCKS.register("sizzlingsunsetwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> NEONCARROTWOOLBLOCK = BLOCKS.register("neoncarrotwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> SUNGLOWWOOLBLOCK = BLOCKS.register("sunglowwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> LASERLEMONWOOLBLOCK = BLOCKS.register("laserlemonwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> ELECTRICLIMEWOOLBLOCK = BLOCKS.register("electriclimewoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> SPRINGFORESTWOOLBLOCK = BLOCKS.register("springforestwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> MAGICMINTWOOLBLOCK = BLOCKS.register("magicmintwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> BLIZZARDBLUEWOOLBLOCK = BLOCKS.register("blizzardbluewoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> SHOCKINGPINKWOOLBLOCK = BLOCKS.register("shockingpinkwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> RAZZLEDAZZLEROSEWOOLBLOCK = BLOCKS.register("razzledazzlerosewoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

	public static final RegistryObject<Block> PURPLEPIZZAZZWOOLBLOCK = BLOCKS.register("purplepizzazzwoolblock",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));

//	public static final RegistryObject<Block> WOOLBLOCK = BLOCKS.register("woolblock",
//			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
//					.harvestLevel(0).sound(SoundType.WOOL)));
	
public static final RegistryObject<Block> AMETHYSTWOOLBLOCK = BLOCKS.register("amethystwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> CITRINEWOOLBLOCK = BLOCKS.register("citrinewoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> EMERALDWOOLBLOCK = BLOCKS.register("emeraldwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> JADEWOOLBLOCK = BLOCKS.register("jadewoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> JASPERWOOLBLOCK = BLOCKS.register("jasperwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> LAPISLAZULIWOOLBLOCK = BLOCKS.register("lapislazuliwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> MALACHITEWOOLBLOCK = BLOCKS.register("malachitewoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> MOONSTONEWOOLBLOCK = BLOCKS.register("moonstonewoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> ONYXWOOLBLOCK = BLOCKS.register("onyxwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> PERIDOTWOOLBLOCK = BLOCKS.register("peridotwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> PINKPEARLWOOLBLOCK = BLOCKS.register("pinkpearlwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> ROSEQUARTZWOOLBLOCK = BLOCKS.register("rosequartzwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> RUBYWOOLBLOCK = BLOCKS.register("rubywoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> SAPPHIREWOOLBLOCK = BLOCKS.register("sapphirewoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> SMOKEYTOPAZWOOLBLOCK = BLOCKS.register("smokeytopazwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> TIGERSEYEWOOLBLOCK = BLOCKS.register("tigerseyewoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> BUBBLEGUMSTARWOOLBLOCK = BLOCKS.register("bubblegumstarwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> BLUSHINGSTARWOOLBLOCK = BLOCKS.register("blushingstarwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> BRICKREDSTARWOOLBLOCK = BLOCKS.register("brickredstarwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> LAVAREDSTARWOOLBLOCK = BLOCKS.register("lavaredstarwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> PUMPKINSTARWOOLBLOCK = BLOCKS.register("pumpkinstarwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> LEMONDROPSTARWOOLBLOCK = BLOCKS.register("lemondropstarwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> MINTGREENSTARWOOLBLOCK = BLOCKS.register("mintgreenstarwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> JADESTARWOOLBLOCK = BLOCKS.register("jadestarwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> DEEPSEABLUESTARWOOLBLOCK = BLOCKS.register("deepseabluestarwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> SKYSTARWOOLBLOCK = BLOCKS.register("skystarwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> OCEANSTARWOOLBLOCK = BLOCKS.register("oceanstarwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> PLUMSTARWOOLBLOCK = BLOCKS.register("plumstarwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> BLUEBERRYSTARWOOLBLOCK = BLOCKS.register("blueberrystarwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> VOIDSTARWOOLBLOCK = BLOCKS.register("voidstarwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> LAVAORANGESTARWOOLBLOCK = BLOCKS.register("lavaorangestarwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> CARROTCAKESTARWOOLBLOCK = BLOCKS.register("carrotcakestarwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> AQUAPEARLWOOLBLOCK = BLOCKS.register("aquapearlwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> BLACKCORALPEARLWOOLBLOCK = BLOCKS.register("blackcoralpearlwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> CARIBBEANGREENPEARLWOOLBLOCK = BLOCKS.register("caribbeangreenpearlwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> CULTUREDPEARLWOOLBLOCK = BLOCKS.register("culturedpearlwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> KEYLIMEPEARLWOOLBLOCK = BLOCKS.register("keylimepearlwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> MANDARINPEARLWOOLBLOCK = BLOCKS.register("mandarinpearlwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> MIDNIGHTPEARLWOOLBLOCK = BLOCKS.register("midnightpearlwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> MYSTICPEARLWOOLBLOCK = BLOCKS.register("mysticpearlwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> OCEANBLUEPEARLWOOLBLOCK = BLOCKS.register("oceanbluepearlwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> OCEANGREENPEARLWOOLBLOCK = BLOCKS.register("oceangreenpearlwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> ORCHIDPEARLWOOLBLOCK = BLOCKS.register("orchidpearlwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> ROSEPEARLWOOLBLOCK = BLOCKS.register("rosepearlwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> SALMONPEARLWOOLBLOCK = BLOCKS.register("salmonpearlwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> SUNNYPEARLWOOLBLOCK = BLOCKS.register("sunnypearlwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> SUNSETPEARLWOOLBLOCK = BLOCKS.register("sunsetpearlwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> TURQUOISEPEARLWOOLBLOCK = BLOCKS.register("turquoisepearlwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> WARNINGREDWOOLBLOCK = BLOCKS.register("warningredwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> SUNBURNTREDWOOLBLOCK = BLOCKS.register("sunburntredwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> CAUTIONORANGEWOOLBLOCK = BLOCKS.register("cautionorangewoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> SPEEDBUMPORANGEWOOLBLOCK = BLOCKS.register("speedbumporangewoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> SLOWYELLOWWOOLBLOCK = BLOCKS.register("slowyellowwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> SICKLYGREENWOOLBLOCK = BLOCKS.register("sicklygreenwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> WATERLOGGEDBLUEWOOLBLOCK = BLOCKS.register("waterloggedbluewoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> CLEARSKYBLUEWOOLBLOCK = BLOCKS.register("clearskybluewoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> BLUEPRINTBLUEWOOLBLOCK = BLOCKS.register("blueprintbluewoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> PECULIARPURPLEWOOLBLOCK = BLOCKS.register("peculiarpurplewoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> BRUISEDPURPLEWOOLBLOCK = BLOCKS.register("bruisedpurplewoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> DIRTBROWNWOOLBLOCK = BLOCKS.register("dirtbrownwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> ALLOYORANGEWOOLBLOCK = BLOCKS.register("alloyorangewoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> BDAZZLEDBLUEWOOLBLOCK = BLOCKS.register("bdazzledbluewoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> BIGDIPORUBYWOOLBLOCK = BLOCKS.register("bigdiporubywoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> BITTERSWEETSHIMMERWOOLBLOCK = BLOCKS.register("bittersweetshimmerwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> BLASTOFFBRONZEWOOLBLOCK = BLOCKS.register("blastoffbronzewoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> CYBERGRAPEWOOLBLOCK = BLOCKS.register("cybergrapewoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> DEEPSPACESPARKLEWOOLBLOCK = BLOCKS.register("deepspacesparklewoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> GOLDFUSIONWOOLBLOCK = BLOCKS.register("goldfusionwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> ILLUMINATINGEMERALDWOOLBLOCK = BLOCKS.register("illuminatingemeraldwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> METALLICSEAWEEDWOOLBLOCK = BLOCKS.register("metallicseaweedwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> ROBOTCANARYWOOLBLOCK = BLOCKS.register("robotcanarywoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> RAZZMICBERRYWOOLBLOCK = BLOCKS.register("razzmicberrywoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> SHEENGREENWOOLBLOCK = BLOCKS.register("sheengreenwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> SHIMMERINGBLUSHWOOLBLOCK = BLOCKS.register("shimmeringblushwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> SONICSILVERWOOLBLOCK = BLOCKS.register("sonicsilverwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> STEELBLUEWOOLBLOCK = BLOCKS.register("steelbluewoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> CHEESEGRATERWOOLBLOCK = BLOCKS.register("cheesegraterwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> IRONINDIGOWOOLBLOCK = BLOCKS.register("ironindigowoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> MAGNETICMAGENTAWOOLBLOCK = BLOCKS.register("magneticmagentawoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> COBALTCOOLWOOLBLOCK = BLOCKS.register("cobaltcoolwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> ACIDWASHJEANSWOOLBLOCK = BLOCKS.register("acidwashjeanswoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> PETRIFIEDFORESTWOOLBLOCK = BLOCKS.register("petrifiedforestwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> ROSEGOLDWOOLBLOCK = BLOCKS.register("rosegoldwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> GOLDMEDALWOOLBLOCK = BLOCKS.register("goldmedalwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> LIPSTICKPINKWOOLBLOCK = BLOCKS.register("lipstickpinkwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> CRUSHPINKWOOLBLOCK = BLOCKS.register("crushpinkwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> SASSYMALASSYWOOLBLOCK = BLOCKS.register("sassymalassywoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> ORANGESHERBERTWOOLBLOCK = BLOCKS.register("orangesherbertwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> ORANGEDREAMWOOLBLOCK = BLOCKS.register("orangedreamwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> LEMONBLASTWOOLBLOCK = BLOCKS.register("lemonblastwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> LIMEWOOLBLOCK = BLOCKS.register("limewoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> ELECTRICBLUEWOOLBLOCK = BLOCKS.register("electricbluewoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> PLATYPUSWOOLBLOCK = BLOCKS.register("platypuswoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> DEEPSKYBLUEWOOLBLOCK = BLOCKS.register("deepskybluewoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> SOMEKINDAGRAYWOOLBLOCK = BLOCKS.register("somekindagraywoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> BERRYLICIOUSBLUEWOOLBLOCK = BLOCKS.register("berryliciousbluewoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> TARDISBLUEWOOLBLOCK = BLOCKS.register("tardisbluewoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> BASILWOOLBLOCK = BLOCKS.register("basilwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> ANTIQUEGRAYWOOLBLOCK = BLOCKS.register("antiquegraywoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> APPLEORCHARDWOOLBLOCK = BLOCKS.register("appleorchardwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> BERRYPARFAITWOOLBLOCK = BLOCKS.register("berryparfaitwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> BLACKPEARLWOOLBLOCK = BLOCKS.register("blackpearlwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> BUBBLEGUMWOOLBLOCK = BLOCKS.register("bubblegumwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> BUTTERNUTSQUASHWOOLBLOCK = BLOCKS.register("butternutsquashwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> CARIBBEANSEAWOOLBLOCK = BLOCKS.register("caribbeanseawoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> CLOUDYSKYWOOLBLOCK = BLOCKS.register("cloudyskywoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> HOTCOCOAWOOLBLOCK = BLOCKS.register("hotcocoawoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> IRIDESCENTINDIGOWOOLBLOCK = BLOCKS.register("iridescentindigowoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> LAVENDERSILKWOOLBLOCK = BLOCKS.register("lavendersilkwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> LEAFYCANOPYWOOLBLOCK = BLOCKS.register("leafycanopywoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> LIQUIDGOLDWOOLBLOCK = BLOCKS.register("liquidgoldwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> MANGOPUREEWOOLBLOCK = BLOCKS.register("mangopureewoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> MOONLITPONDWOOLBLOCK = BLOCKS.register("moonlitpondwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> OCEANFOAMWOOLBLOCK = BLOCKS.register("oceanfoamwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> ORANGEPEELWOOLBLOCK = BLOCKS.register("orangepeelwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> PESTOWOOLBLOCK = BLOCKS.register("pestowoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> PINKLUSTERWOOLBLOCK = BLOCKS.register("pinklusterwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> REDSATINWOOLBLOCK = BLOCKS.register("redsatinwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> SEAGLASSWOOLBLOCK = BLOCKS.register("seaglasswoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> SHOOTINGSTARWOOLBLOCK = BLOCKS.register("shootingstarwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> SNOWDRIFTWOOLBLOCK = BLOCKS.register("snowdriftwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> SUNSETSHIMMERWOOLBLOCK = BLOCKS.register("sunsetshimmerwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> BLACKHAIRWOOLBLOCK = BLOCKS.register("blackhairwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> BLONDEHAIRWOOLBLOCK = BLOCKS.register("blondehairwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> BLUEEYESWOOLBLOCK = BLOCKS.register("blueeyeswoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> BROWNEYESWOOLBLOCK = BLOCKS.register("browneyeswoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> BROWNHAIRWOOLBLOCK = BLOCKS.register("brownhairwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> DEEPALMONDWOOLBLOCK = BLOCKS.register("deepalmondwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> DEEPGOLDENWOOLBLOCK = BLOCKS.register("deepgoldenwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> DEEPROSEWOOLBLOCK = BLOCKS.register("deeprosewoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> DEEPESTALMONDWOOLBLOCK = BLOCKS.register("deepestalmondwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> EXTRADEEPALMONDWOOLBLOCK = BLOCKS.register("extradeepalmondwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> EXTRADEEPGOLDENWOOLBLOCK = BLOCKS.register("extradeepgoldenwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> EXTRADEEPROSEWOOLBLOCK = BLOCKS.register("extradeeprosewoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> EXTRALIGHTALMONDWOOLBLOCK = BLOCKS.register("extralightalmondwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> GREENEYESWOOLBLOCK = BLOCKS.register("greeneyeswoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> HAZELEYESWOOLBLOCK = BLOCKS.register("hazeleyeswoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> LIGHTALMONDWOOLBLOCK = BLOCKS.register("lightalmondwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> LIGHTGOLDENWOOLBLOCK = BLOCKS.register("lightgoldenwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> LIGHTMEDIUMALMONDWOOLBLOCK = BLOCKS.register("lightmediumalmondwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> LIGHTMEDIUMGOLDENWOOLBLOCK = BLOCKS.register("lightmediumgoldenwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> LIGHTMEDIUMROSEWOOLBLOCK = BLOCKS.register("lightmediumrosewoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> LIGHTROSEWOOLBLOCK = BLOCKS.register("lightrosewoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> MEDIUMALMONDWOOLBLOCK = BLOCKS.register("mediumalmondwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> MEDIUMDEEPALMONDWOOLBLOCK = BLOCKS.register("mediumdeepalmondwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> MEDIUMDEEPGOLDENWOOLBLOCK = BLOCKS.register("mediumdeepgoldenwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> MEDIUMDEEPROSEWOOLBLOCK = BLOCKS.register("mediumdeeprosewoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> MEDIUMGOLDENWOOLBLOCK = BLOCKS.register("mediumgoldenwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> REDHAIRWOOLBLOCK = BLOCKS.register("redhairwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> VERYDEEPALMONDWOOLBLOCK = BLOCKS.register("verydeepalmondwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> VERYDEEPROSEWOOLBLOCK = BLOCKS.register("verydeeprosewoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> VERYLIGHTALMONDWOOLBLOCK = BLOCKS.register("verylightalmondwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> VERYLIGHTGOLDENWOOLBLOCK = BLOCKS.register("verylightgoldenwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> VERYLIGHTROSEWOOLBLOCK = BLOCKS.register("verylightrosewoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> ABSOLUTEZEROWOOLBLOCK = BLOCKS.register("absolutezerowoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> WINTERSKYWOOLBLOCK = BLOCKS.register("winterskywoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> FROSTBITEWOOLBLOCK = BLOCKS.register("frostbitewoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

public static final RegistryObject<Block> BLUERIBBONWOOLBLOCK = BLOCKS.register("blueribbonwoolblock",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
                    .harvestLevel(0).sound(SoundType.WOOL)));

}