package net.voidrealms.coacoamagic;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;

import com.brokenmatrix.modcore.blocks.CustomBlocks;
import com.brokenmatrix.modcore.blocks.CustomColorableBlock;
import com.brokenmatrix.modcore.items.CustomColorableBlockItem;
import com.brokenmatrix.modcore.items.CustomColorableItem;
import com.brokenmatrix.modcore.items.CustomItem;
import com.brokenmatrix.modcore.items.CustomItems;
import com.brokenmatrix.modcore.items.drops.CustomDrops;

import net.voidrealms.coacoamagic.items.drops.CustomItemChanceDrop;

public class ThomasMagic
{
	//Blocks
	
	//Testing
	public CustomColorableBlock pureJessBlock;
	
	//Items
	
	//Orbs
	public CustomItem natureOrb;
	public CustomItem fireOrb;
	public CustomItem waterOrb;
	public CustomItem afflictionOrb;
	public CustomItem desolateOrb;
	public CustomItem earthOrb;
	public CustomItem prosperityOrb;
	public CustomItem iceOrb;
	public CustomItem enderOrb;
	public CustomColorableItem crushedOrb;
	public CustomColorableItem vexedOrb;
	
	//Testing
	public CustomColorableBlockItem pureJessBlockItem;
	
	public ThomasMagic()
	{
		//Blocks
		
		//Testing
		pureJessBlock = new CustomColorableBlock("Pure Jess Block", Material.CONCRETE, (byte) 10);
		
		//Items
		
		//Orbs
		natureOrb = new CustomItem(ChatColor.GREEN + "Nature Orb", Material.SLIME_BALL, 16, ChatColor.WHITE + "Essence of relaxation");
		fireOrb = new CustomItem(ChatColor.RED + "Fire Orb", Material.MAGMA_CREAM, 16, ChatColor.WHITE + "Essence of suffering");
		waterOrb = new CustomItem(ChatColor.BLUE + "Water Orb", Material.ENDER_PEARL, 16, ChatColor.WHITE + "Essence of wisdom");
		afflictionOrb = new CustomItem(ChatColor.DARK_GRAY +  "Affliction Orb", Material.FIREWORK_CHARGE, 16, ChatColor.WHITE + "Essence of despair");
		desolateOrb = new CustomItem(ChatColor.YELLOW + "Desolate Orb", Material.DOUBLE_PLANT, 16, ChatColor.WHITE + "Essence of fatigue");
		earthOrb = new CustomItem(ChatColor.GOLD + "Earth Orb", Material.CLAY_BALL, 16, ChatColor.WHITE + "Essence of dedication");
		prosperityOrb = new CustomItem(ChatColor.LIGHT_PURPLE + "Prosperity Orb", Material.CHORUS_FRUIT_POPPED, 16, ChatColor.WHITE + "Essence of beauty");
		iceOrb = new CustomItem(ChatColor.AQUA + "Ice Orb", Material.SNOW_BALL, 16, ChatColor.WHITE + "Essence of survival");
		enderOrb = new CustomItem(ChatColor.DARK_PURPLE + "Ender Orb", Material.EYE_OF_ENDER, 16, ChatColor.WHITE + "Essence of curiosity");
		crushedOrb = new CustomColorableItem(ChatColor.WHITE + "Crushed Orb", Material.INK_SACK, (byte) 15, 16, ChatColor.WHITE + "Essence of frustration");
		vexedOrb = new CustomColorableItem(ChatColor.DARK_RED + "Vexed Orb", Material.INK_SACK, (byte) 1, 16, ChatColor.WHITE + "Essence of anger");
		
		//Testing
		pureJessBlockItem = new CustomColorableBlockItem(ChatColor.DARK_PURPLE + "Pure Jess Block", Material.CONCRETE, (byte) 10, pureJessBlock, true, new String[]{"This block is made from the finest of jess hairs."});
		
		//Registry
		
		//Blocks
		CustomBlocks.Register(pureJessBlock);
		
		//Items
		CustomItems.Register(natureOrb);
		CustomItems.Register(fireOrb);
		CustomItems.Register(waterOrb);
		CustomItems.Register(afflictionOrb);
		CustomItems.Register(desolateOrb);
		CustomItems.Register(earthOrb);
		CustomItems.Register(prosperityOrb);
		CustomItems.Register(iceOrb);
		CustomItems.Register(enderOrb);
		CustomItems.Register(crushedOrb);
		CustomItems.Register(vexedOrb);
		CustomItems.Register(pureJessBlockItem);
		
		//Drops
		CustomDrops.Register(EntityType.ZOMBIE, new CustomItemChanceDrop(vexedOrb, 0.1f));
	}
	
	public void disable()
	{
		
	}
}
