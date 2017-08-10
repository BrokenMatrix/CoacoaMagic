package net.voidrealms.cocoamagic.items.drops;

import org.bukkit.inventory.ItemStack;

import com.brokenmatrix.modcore.items.CustomItem;
import com.brokenmatrix.modcore.items.drops.ICustomDrop;
import com.brokenmatrix.modcore.tools.Helper;

public class CustomItemChanceDrop implements ICustomDrop
{
	private CustomItem item;
	private float chance;
	
	public CustomItemChanceDrop(CustomItem item, float chance)
	{
		this.item = item;
		this.chance = 1f - chance;
	}
	@Override
	public ItemStack getItemStack()
	{
		System.out.println("DROPPING ITEM");
		
		if (Helper.NextFloat() > chance)
		{
			return item.getItemStack(1);
		}
		
		return null;
	}
}
