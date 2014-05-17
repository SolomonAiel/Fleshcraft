package Fleshcraft.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Items 
{

	public static Item receptiveflesh;
	public static Item electricflesh;

	public static void init() 
	{
		receptiveflesh = new ItemReceptiveFlesh(ItemInfo.RECEPTIVEFLESH_ID);
		electricflesh = new ItemEnergeticReceptiveFlesh(ItemInfo.ENERGETICRECEPTIVEFLESH_ID);
	}


	public static void addNames() 
	{
		LanguageRegistry.addName(receptiveflesh, ItemInfo.RECEPTIVEFLESH_NAME);

		LanguageRegistry.addName(electricflesh, ItemInfo.ENERGETICRECEPTIVEFLESH_NAME);

	}
}