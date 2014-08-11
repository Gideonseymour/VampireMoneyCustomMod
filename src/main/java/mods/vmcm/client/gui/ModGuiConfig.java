package mods.vmcm.client.gui;


import cpw.mods.fml.client.config.GuiConfig;
import mods.vmcm.handler.ConfigurationHandler;
import mods.vmcm.lib.Reference;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

public class ModGuiConfig extends GuiConfig{

    public ModGuiConfig(GuiScreen guiScreen)
        {
            super(guiScreen,
                    new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                    Reference.MOD_ID,
                    false,
                    false,
                    GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
        }

}

