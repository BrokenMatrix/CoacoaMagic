package net.voidrealms.coacoamagic;

import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;

import com.brokenmatrix.modcore.blocks.CustomBlocks;
import com.brokenmatrix.modcore.blocks.CustomColorableBlock;
import com.brokenmatrix.modcore.items.CustomColorableBlockItem;
import com.brokenmatrix.modcore.items.CustomItems;

public class ThomasMagic
{
	public CustomColorableBlock pureJessBlock;
	
	public CustomColorableBlockItem pureJessBlockItem;
	
	public ThomasMagic()
	{
		pureJessBlock = new CustomColorableBlock("Pure Jess Block", Material.CONCRETE, (byte) 10);
		
		pureJessBlockItem = new CustomColorableBlockItem(ChatColor.DARK_PURPLE + "Pure Jess Block", Material.CONCRETE, (byte) 10, pureJessBlock, true, new String[]{"This block is made from the finest of jess hairs."});
		
		CustomBlocks.Register(pureJessBlock);
		
		CustomItems.Register(pureJessBlockItem);
	}
	
	public void disable()
	{
		
	}
}
