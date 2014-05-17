package Fleshcraft.blocks;

import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Blocks 
{
	public static Block LivingFleshBlock;
	public static Block EnergeticLivingFleshBlock;
	public static Block FlabbyLivingBlock;
	public static void init()
	{
		LivingFleshBlock = new LivingFleshBlock(BlockInfo.LIVINGFLESHBLOCK_ID);
		GameRegistry.registerBlock(LivingFleshBlock, BlockInfo.LIVINGFLESHBLOCK_KEY);
		EnergeticLivingFleshBlock = new EnergeticLivingFleshBlock(BlockInfo.ENERGETICLIVINGFLESHBLOCK_ID);
		GameRegistry.registerBlock(EnergeticLivingFleshBlock, BlockInfo.ENERGETICLIVINGFLESHBLOCK_KEY);
		FlabbyLivingBlock = new FlabbyLivingBlock(BlockInfo.FLABBYLIVINGBLOCK_ID);
		GameRegistry.registerBlock(FlabbyLivingBlock, BlockInfo.FLABBYLIVINGBLOCK_KEY);
	}
	
	public static void addNames()
	{
		LanguageRegistry.addName(LivingFleshBlock, BlockInfo.LIVINGFLESHBLOCK_LOCALIZED_NAME);
		LanguageRegistry.addName(EnergeticLivingFleshBlock, BlockInfo.ENERGETICLIVINGFLESHBLOCK_LOCALIZED_NAME);
		LanguageRegistry.addName(FlabbyLivingBlock, BlockInfo.FLABBYLIVINGBLOCK_LOCALIZED_NAME);
	}
}
