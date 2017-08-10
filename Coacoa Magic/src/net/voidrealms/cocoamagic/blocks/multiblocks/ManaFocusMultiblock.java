package net.voidrealms.cocoamagic.blocks.multiblocks;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;

import com.brokenmatrix.multiblockcore.IMultiblockComponent;
import com.brokenmatrix.multiblockcore.MultiblockConfiguration;

import net.voidrealms.cocoamagic.ThomasMagic;

public class ManaFocusMultiblock extends MultiblockConfiguration
{
	public ManaFocusMultiblock(String ID, Material centre)
	{
		super(ID, centre);
	}
	
	@Override
	public void onInteract(Player player, Location centre, int rotation)
	{
		player.sendMessage(ChatColor.GREEN + "MUTLIBLOCK WORKING!!!");
		
		player.getInventory().addItem(ThomasMagic.Instance.getOrb(centre.getWorld().getBiome(centre.getBlockX(), centre.getBlockZ())));
	}
	
	@Override
	public ManaFocusMultiblock addComponent(String loc, IMultiblockComponent component)
	{
		super.addComponent(loc, component);
		
		return this;
	}
	
	public ManaFocusMultiblock addComponent4(String sloc, IMultiblockComponent component)
	{
		super.addComponent4(sloc, component);
		
		return this;
	}

	public ManaFocusMultiblock finish()
	{
		super.finish();
		
		return this;
	}
}
