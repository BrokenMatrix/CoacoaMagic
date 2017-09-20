package net.voidrealms.cocoamagic;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Biome;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;

import com.brokenmatrix.modcore.blocks.CustomBlocks;
import com.brokenmatrix.modcore.blocks.CustomColorableBlock;
import com.brokenmatrix.modcore.items.CustomColorableBlockItem;
import com.brokenmatrix.modcore.items.CustomColorableItem;
import com.brokenmatrix.modcore.items.CustomItem;
import com.brokenmatrix.modcore.items.CustomItems;
import com.brokenmatrix.modcore.items.drops.CustomDrops;
import com.brokenmatrix.multiblockcore.MBCBlock;
import com.brokenmatrix.multiblockcore.MBCColorableBlock;
import com.brokenmatrix.multiblockcore.MultiblockConfigurations;

import net.voidrealms.cocoamagic.blocks.multiblocks.ManaFocusMultiblock;
import net.voidrealms.cocoamagic.items.drops.CustomItemChanceDrop;

public class ThomasMagic
{
	public static ThomasMagic Instance;
	
	//Blocks
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
	
	//Blocks
	public CustomColorableBlockItem pureJessBlockItem;
	
	//Multiblocks
	
	//Mana Focuses
	public ManaFocusMultiblock natureManaFocus;
	
	public ThomasMagic()
	{
		Instance = this;
		
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
		pureJessBlockItem = new CustomColorableBlockItem(ChatColor.DARK_PURPLE + "Pure Jess Block", Material.CONCRETE, (byte) 10, pureJessBlock, true, "This block is made from the finest of jess hairs.");
		
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
		
		//Multiblocks
		MBCColorableBlock stoneBricks = new MBCColorableBlock(Material.SMOOTH_BRICK, (byte) 1);
		MBCBlock water = new MBCBlock(Material.STATIONARY_WATER);
		
		//Mana Focuses
		natureManaFocus = new ManaFocusMultiblock("Nature Mana Focus", Material.IRON_FENCE)
				.addComponent("0 -1 0", stoneBricks)
				.addComponent("0 -1 1", water)
				.addComponent("0 -1 2", stoneBricks)
				.addComponent("1 -1 1", stoneBricks)
				.addComponent("-1 -1 1", stoneBricks)
				.finish();
		
		//Multiblock Register
		MultiblockConfigurations.Register(natureManaFocus);
	}
	
	public ItemStack getOrb(Biome biome)
	{
		CustomItem orb = null;
		int amount = -1;
		
		switch(biome)
		{
			//Forest
			case PLAINS:
				orb = natureOrb;
				amount = 1;
				break;
			case SAVANNA:
				orb = natureOrb;
				amount = 1;
				break;
			case SAVANNA_ROCK:
				orb = natureOrb;
				amount = 1;
				break;
			case MUTATED_PLAINS:
				amount = 2;
			case BIRCH_FOREST:
				orb = natureOrb;
				amount = 2;
				break;
			case BIRCH_FOREST_HILLS:
				orb = natureOrb;
				amount = 2;
				break;
			case FOREST:
				orb = natureOrb;
				amount = 2;
				break;
			case JUNGLE_EDGE:
				orb = natureOrb;
				amount = 2;
				break;
			case FOREST_HILLS:
				orb = natureOrb;
				amount = 2;
				break;
			case ROOFED_FOREST:
				orb = natureOrb;
				amount = 2;
				break;
			case MUTATED_SAVANNA:
				orb = natureOrb;
				amount = 2;
				break;
			case MUTATED_SAVANNA_ROCK:
				orb = natureOrb;
				amount = 2;
				break;
			case JUNGLE:
				orb = natureOrb;
				amount = 3;
				break;
			case JUNGLE_HILLS:
				orb = natureOrb;
				amount = 3;
				break;
			case MUTATED_BIRCH_FOREST:
				orb = natureOrb;
				amount = 3;
				break;
			case MUTATED_BIRCH_FOREST_HILLS:
				orb = natureOrb;
				amount = 3;
				break;
			case MUTATED_JUNGLE_EDGE:
				orb = natureOrb;
				amount = 3;
				break;
			case MUTATED_ROOFED_FOREST:
				orb = natureOrb;
				amount = 3;
				break;
			case MUTATED_JUNGLE:
				orb = natureOrb;
				amount = 4;
				break;
			//Cold
			case FROZEN_OCEAN:
				orb = iceOrb;
				amount = 1;
				break;
			case FROZEN_RIVER:
				orb = iceOrb;
				amount = 1;
				break;
			case REDWOOD_TAIGA:
				orb = iceOrb;
				amount = 1;
				break;
			case REDWOOD_TAIGA_HILLS:
				orb = iceOrb;
				amount = 1;
				break;
			case TAIGA_HILLS:
				orb = iceOrb;
				amount = 1;
				break;
			case COLD_BEACH:
				orb = iceOrb;
				amount = 1;
				break;
			case TAIGA:
				orb = iceOrb;
				amount = 1;
				break;
			case TAIGA_COLD:
				orb = iceOrb;
				amount = 2;
				break;
			case TAIGA_COLD_HILLS:
				orb = iceOrb;
				amount = 2;
				break;
			case MUTATED_TAIGA:
				orb = iceOrb;
				amount = 2;
				break;
			case MUTATED_REDWOOD_TAIGA:
				orb = iceOrb;
				amount = 2;
				break;
			case MUTATED_REDWOOD_TAIGA_HILLS:
				orb = iceOrb;
				amount = 2;
				break;
			case ICE_FLATS:
				orb = iceOrb;
				amount = 3;
				break;
			case ICE_MOUNTAINS:
				orb = iceOrb;
				amount = 3;
				break;
			case MUTATED_TAIGA_COLD:
				orb = iceOrb;
				amount = 3;
				break;
			case MUTATED_ICE_FLATS:
				orb = iceOrb;
				amount = 4;
				break;
			//Hills
			case SMALLER_EXTREME_HILLS:
				orb = earthOrb;
				amount = 1;
				break;
			case STONE_BEACH:
				orb = earthOrb;
				amount = 1;
				break;
			case EXTREME_HILLS:
				orb = earthOrb;
				amount = 2;
				break;
			case EXTREME_HILLS_WITH_TREES:
				orb = earthOrb;
				amount = 2;
				break;
			case MUTATED_EXTREME_HILLS:
				orb = earthOrb;
				amount = 3;
				break;
			case MUTATED_EXTREME_HILLS_WITH_TREES:
				orb = earthOrb;
				amount = 3;
				break;
			//Water
			case RIVER:
				orb = waterOrb;
				amount = 1;
				break;
			case OCEAN:
				orb = waterOrb;
				amount = 2;
				break;
			case DEEP_OCEAN:
				orb = waterOrb;
				amount = 3;
				break;
			//Desert
			case DESERT:
				orb = desolateOrb;
				amount = 1;
				break;
			case DESERT_HILLS:
				orb = desolateOrb;
				amount = 1;
				break;
			case MUTATED_DESERT:
				orb = desolateOrb;
				amount = 2;
				break;
			case MESA:
				orb = desolateOrb;
				amount = 3;
				break;
			case MESA_ROCK:
				amount = 3;
				break;
			case MESA_CLEAR_ROCK:
				orb = desolateOrb;
				amount = 3;
				break;
			case MUTATED_MESA:
				orb = desolateOrb;
				amount = 4;
				break;
			case MUTATED_MESA_CLEAR_ROCK:
				orb = desolateOrb;
				amount = 4;
				break;
			case MUTATED_MESA_ROCK:
				orb = desolateOrb;
				amount = 4;
				break;
			//Mushroom
			case MUSHROOM_ISLAND_SHORE:
				orb = afflictionOrb;
				amount = 1;
				break;
			case MUSHROOM_ISLAND:
				orb = afflictionOrb;
				amount = 2;
				break;
			//Fire
			case HELL:
				orb = fireOrb;
				amount = 1;
				break;
			//Ender
			case SKY:
				orb = enderOrb;
				amount = 2;
				break;
			case VOID:
				orb = enderOrb;
				amount = 1;
				break;
			//Swamp
			case SWAMPLAND:
				orb = vexedOrb;
				amount = 1;
				break;
			case MUTATED_SWAMPLAND:
				orb = vexedOrb;
				amount = 2;
				break;
			//Flowers
			case MUTATED_FOREST:
				amount = 1;
				break;
			default:
				break;
		}
		
		if (orb != null)
		{
			return orb.getItemStack(amount);
		}
		
		return null;
	}
	
	public void disable()
	{
		
	}
}
