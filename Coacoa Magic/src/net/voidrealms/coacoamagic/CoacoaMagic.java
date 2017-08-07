package net.voidrealms.coacoamagic;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import com.brokenmatrix.modcore.ModCore;

public class CoacoaMagic extends JavaPlugin
{
	private JessMagic jessMagic;
	private ThomasMagic thomasMagic;
	
	@Override
	public void onEnable()
	{
		jessMagic = new JessMagic();
		thomasMagic = new ThomasMagic();
		
		((ModCore) Bukkit.getPluginManager().getPlugin("ModCore")).notifyOfMod(this);
	}
	
	@Override
	public void onDisable()
	{
		jessMagic.disable();
		thomasMagic.disable();
	}
}
