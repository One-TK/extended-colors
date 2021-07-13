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
	
	public static final RegistryObject<Block> EXAMPLE_BLOCK = BLOCKS.register("example_block",
			() -> new Block(AbstractBlock.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.8f, 1.2f)
					.harvestLevel(0).sound(SoundType.WOOL)));
	
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
}
