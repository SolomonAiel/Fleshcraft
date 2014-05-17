package Fleshcraft.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemReceptiveFlesh extends Item {

	public ItemReceptiveFlesh(int id) {
		super(id);
		setCreativeTab(CreativeTabs.tabMaterials);
		setMaxStackSize(64);
		setUnlocalizedName(ItemInfo.RECEPTIVEFLESH_UNLOCALIZED_NAME);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		itemIcon=register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.RECEPTIVEFLESH_ICON);
	}
	
}
	
