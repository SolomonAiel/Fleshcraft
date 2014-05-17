package Fleshcraft.config;

import java.io.File;

import net.minecraftforge.common.Configuration;
import Fleshcraft.blocks.BlockInfo;
import Fleshcraft.items.ItemInfo;

public class ConfigHandler {
	
	
	
	public static void Init(File file) {
		
		Configuration config = new Configuration(file);
		
		config.load();
		
		BlockInfo.LIVINGFLESHBLOCK_ID = config.getBlock(BlockInfo.LIVINGFLESHBLOCK_KEY, BlockInfo.LIVINGFLESHBLOCK_DEFAULT).getInt();
		BlockInfo.ENERGETICLIVINGFLESHBLOCK_ID = config.getBlock(BlockInfo.ENERGETICLIVINGFLESHBLOCK_KEY, BlockInfo.ENERGETICLIVINGFLESHBLOCK_DEFAULT).getInt();
		BlockInfo.FLABBYLIVINGBLOCK_ID = config.getBlock(BlockInfo.FLABBYLIVINGBLOCK_KEY, BlockInfo.FLABBYLIVINGBLOCK_DEFAULT).getInt();
		
		ItemInfo.RECEPTIVEFLESH_ID = config.getItem(ItemInfo.RECEPTIVEFLESH_KEY, ItemInfo.RECEPTIVEFLESH_DEFAULT).getInt() - 256;
		ItemInfo.ENERGETICRECEPTIVEFLESH_ID = config.getItem(ItemInfo.ENERGETICRECEPTIVEFLESH_KEY, ItemInfo.ENERGETICRECEPTIVEFLESH_DEFAULT).getInt() - 256;
		
		config.save();
	}
}