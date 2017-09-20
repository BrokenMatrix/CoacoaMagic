package net.voidrealms.cocoamagic;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import com.brokenmatrix.modcore.ModCore;

public class CocoaMagic extends JavaPlugin
{
	private ThomasMagic thomasMagic;
	
	@Override
	public void onEnable()
	{
		((ModCore) Bukkit.getPluginManager().getPlugin("ModCore")).notifyOfMod(this);
		
		thomasMagic = new ThomasMagic();
	}
	
	@Override
	public void onDisable()
	{
		thomasMagic.disable();
	}
}
