package mods.vmcm.item.tools.ToolAbstracts;

import mods.vmcm.lib.ToolsReference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;


abstract public class ItemPickaxeVM extends ToolVM
{

    public ItemPickaxeVM(Item.ToolMaterial material)
    {
        super(0, material, ToolsReference.pickaxeBlocksEffectiveAgainst);
    }

    @Override
    public boolean canHarvestBlock(Block block, ItemStack stack)
    {
        if(block == Blocks.obsidian)
        {
            return toolMaterial.getHarvestLevel() == 3;
        }

        if(block == Blocks.diamond_block || block == Blocks.diamond_ore)
        {
            return toolMaterial.getHarvestLevel() >= 2;
        }

        if(block == Blocks.gold_block || block == Blocks.gold_ore)
        {
            return toolMaterial.getHarvestLevel() >= 2;
        }

        if(block == Blocks.iron_block || block == Blocks.iron_ore)
        {
            return toolMaterial.getHarvestLevel() >= 1;
        }

        if(block == Blocks.lapis_block || block == Blocks.lapis_ore)
        {
            return toolMaterial.getHarvestLevel() >= 1;
        }

        if(block == Blocks.redstone_ore || block == Blocks.lit_redstone_ore)
        {
            return toolMaterial.getHarvestLevel() >= 2;
        }

        if(block.getMaterial() == Material.rock)
        {
            return true;
        }

        return block.getMaterial() == Material.iron;
    }

}
