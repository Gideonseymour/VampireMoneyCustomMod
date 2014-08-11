package mods.vmcm.item.tools.ToolAbstracts;

import mods.vmcm.lib.ToolsReference;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

abstract public class ItemShovelVM extends ToolVM
{
    public ItemShovelVM(Item.ToolMaterial material)
    {
        super(0, material, ToolsReference.shovelBlocksEffectiveAgainst);
    }

    @Override
    public boolean canHarvestBlock(Block block, ItemStack stack)
    {
        if(block == Blocks.snow)
        {
            return true;
        }

        return block == Blocks.snow;
    }

}
