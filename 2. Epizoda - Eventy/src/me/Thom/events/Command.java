package me.Thom.events;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command implements CommandExecutor {
	
	public boolean onCommand(CommandSender sender, org.bukkit.command.Command cmd, String label, String[] args) {
		if (sender instanceof Player) {
			Player p = (Player) sender;
			
			if (cmd.getName().equalsIgnoreCase("cmd")) {
				p.sendMessage("Prikaz byl zjisten");
				Bukkit.getPluginManager().callEvent(new PlayerCommand(p.getName(), label));
			}
		}
		return false;
	}
	
}
