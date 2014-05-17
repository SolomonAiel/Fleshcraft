package Fleshcraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EnergeticLivingFleshBlock extends Block 
{
	public EnergeticLivingFleshBlock(int id)
	{
		super(id, Material.sponge);

		setCreativeTab(CreativeTabs.tabBlock);
		setHardness(2F);
		setStepSound(Block.soundSnowFootstep);
		setUnlocalizedName(BlockInfo.ENERGETICLIVINGFLESHBLOCK_UNLOCALIZED_NAME);
	}
	@SideOnly(Side.CLIENT)
	private Icon topIcon;
	@SideOnly(Side.CLIENT)
	private Icon botIcon;
	@SideOnly(Side.CLIENT)
	private Icon sideIcon;

	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister register)
	{
		topIcon = register.registerIcon(BlockInfo.TEXTURE_LOCATION + ";" + BlockInfo.ENERGETICLIVINGFLESHBLOCK_TOP);
		botIcon = register.registerIcon(BlockInfo.TEXTURE_LOCATION + ";" + BlockInfo.ENERGETICLIVINGFLESHBLOCK_BOT);
		sideIcon = register.registerIcon(BlockInfo.TEXTURE_LOCATION + ";" + BlockInfo.ENERGETICLIVINGFLESHBLOCK_SIDE);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public Icon getIcon(int side, int meta)
	{
		if (side == 0)
		{
			return botIcon;
		}
		else if(side == 1)
		{
			return topIcon;
		}
		else
		{
			return sideIcon;
		}
}
}
