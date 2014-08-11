package mods.vmcm.item.tools.ToolAbstracts;


import mods.vmcm.lib.ToolsReference;

abstract public class ItemAxeVM extends ToolVM
{
    public ItemAxeVM(ToolMaterial material)
    {
        super(0, material, ToolsReference.axeBlocksEffectiveAgainst);
    }

}
