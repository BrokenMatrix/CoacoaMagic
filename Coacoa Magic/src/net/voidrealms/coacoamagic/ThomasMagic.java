package net.voidrealms.coacoamagic;

import org.bukkit.Material;

import com.brokenmatrix.modcore.blocks.CustomBlock;
import com.brokenmatrix.modcore.blocks.CustomBlocks;
import com.brokenmatrix.modcore.items.CustomBlockItem;
import com.brokenmatrix.modcore.items.CustomItems;

public class ThomasMagic
{
	public CustomBlock pureJessBlock;
	
	public CustomBlockItem pureJessBlockItem;
	
	public ThomasMagic()
	{
		pureJessBlock = new CustomBlock("Pure Jess Block", Material.HARD_CLAY);
		
		pureJessBlockItem = new CustomBlockItem("&5Pure Jess Block", Material.HARD_CLAY, pureJessBlock, true, new String[]{"This block is made from the finest of jess hairs."});
		
		CustomBlocks.Register(pureJessBlock);
		
		CustomItems.Register(pureJessBlockItem);
	}
	
	public void disable()
	{
		
	}
}
