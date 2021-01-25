package me.Thom.events;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	public void onEnable() {
		Bukkit.getPluginManager().registerEvents(new CommandListener(), this);
		getCommand("cmd").setExecutor(new Command());
	}
	
}
