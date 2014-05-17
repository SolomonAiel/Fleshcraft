package Fleshcraft;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import Fleshcraft.blocks.Blocks;
import Fleshcraft.items.Items;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes 
{
	public static void init()
	{
		GameRegistry.addRecipe(new ItemStack(Items.receptiveflesh, 16),
		new Object[] {
					"XXX",
					"XYX",
					"XXX",

					'X', Item.rottenFlesh,
					'Y', Item.redstone
					});

				GameRegistry.addRecipe(new ItemStack(Items.electricflesh, 1),
				new Object[] {
					" Y ",
					"YXY",
					" Y ",

					'X', Items.receptiveflesh,
					'Y', Item.redstone
					});
				GameRegistry.addRecipe(new ItemStack(Blocks.LivingFleshBlock, 1),
				new Object[]{
					"XXX",
					"XYX",
					"XXX",

					'X', Items.receptiveflesh,
					'Y', Items.electricflesh
				});
				GameRegistry.addRecipe(new ItemStack(Blocks.EnergeticLivingFleshBlock, 4),
						new Object[]{
							"XXX",
							"XYX",
							"XXX",

							'X', Items.electricflesh,
							'Y', Item.bone
						});
				GameRegistry.addRecipe(new ItemStack(Blocks.FlabbyLivingBlock, 4),
						new Object[]{
							"XY ",
							"YY ",
							"   ",

							'X', Items.receptiveflesh,
							'Y', Item.porkRaw
						});
	}
}