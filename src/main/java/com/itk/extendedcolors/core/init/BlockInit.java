package com.itk.extendedcolors.core.init;

import com.itk.extendedcolors.ExtendedColors;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
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

	public static final RegistryObject<Block> ATOMICTANGERINEWOOLBLOCK = BLOCKS.register("atomictangerinewoolblock",
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

	public static final RegistryObject<Block> SCREAMINGREENWOOLBLOCK = BLOCKS.register("screamingreenwoolblock",
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
	
	
}
