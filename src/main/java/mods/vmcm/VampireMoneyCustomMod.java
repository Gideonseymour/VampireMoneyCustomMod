package mods.vmcm;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import mods.vmcm.handler.ConfigurationHandler;
import mods.vmcm.init.ModBlocks;
import mods.vmcm.init.ModItems;
import mods.vmcm.init.Recipes;
import mods.vmcm.lib.Reference;
import mods.vmcm.proxy.CommonProxy;
import mods.vmcm.proxy.IProxy;
import mods.vmcm.utility.LogHelper;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class VampireMoneyCustomMod
{
    @Mod.Instance(Reference.MOD_ID)
    public static VampireMoneyCustomMod instance;

    @SidedProxy(clientSide = "mods.vmcm.proxy.ClientProxy", serverSide = "mods.vmcm.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInitialize(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        proxy.initRenderers();
        proxy.initSounds();

        ModItems.init();

        ModBlocks.init();
    }

    @Mod.EventHandler
    public void initialize(FMLInitializationEvent event)
    {
        ModItems.addNames();

        ModBlocks.addNames();
        ModBlocks.registerTileEntities();

        Recipes.init();

        LogHelper.info("Initialization Complete");
    }

    @Mod.EventHandler
    public void postInitialize(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initialization Complete");
    }
}