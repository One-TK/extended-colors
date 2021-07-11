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
	
	//How does fire work?????
	//public boolean 
	//Blocks.FIRE.setFireInfo(ExtendedColors.EXAMPLE_BLOCK,30,60);
}
