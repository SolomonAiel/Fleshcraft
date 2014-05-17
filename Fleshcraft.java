package Fleshcraft;

import Fleshcraft.Network.PacketHandler;
import Fleshcraft.blocks.Blocks;
import Fleshcraft.config.ConfigHandler;
import Fleshcraft.items.Items;
import Fleshcraft.proxies.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
//ctrl shift o imports things needed

@Mod(modid = ModInformation.ID, name = ModInformation.NAME, version = ModInformation.VERSION) // mod id, propername, version
@NetworkMod(channels = {ModInformation.CHANNEL}, clientSideRequired = true/*Client side needed*/, serverSideRequired = false/*Serverside reqpured (needed to be installed on the server or uninstalled on the client before join server*/, packetHandler = PacketHandler.class/*Recieves the calls from the mod*/)
public class Fleshcraft 
{
	@Instance(ModInformation.ID)
	public static Fleshcraft instance;

	@SidedProxy(clientSide = "Fleshcraft.proxies.ClientProxy", serverSide = "Fleshcraft.proxies.CommonProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)//run before initialization phase register sounds, items, recipes, config, mod ids
	{
		ConfigHandler.Init(event.getSuggestedConfigurationFile());
		Items.init();
		Blocks.init();

		proxy.initSounds();
		proxy.initRenders();
	}
	@EventHandler
	public void load(FMLInitializationEvent event)// handlers, register recipes,
	{
		Items.addNames();

		Blocks.addNames();

		Recipes.init();

	}
	@EventHandler
	public void modsLoaded(FMLPostInitializationEvent event)//interact with mods
	{

	}

}//when you wish to export the mod, click recompile.bat in your workspace folders and then click reobfuscate_srg.bat after recompile.bat is done.