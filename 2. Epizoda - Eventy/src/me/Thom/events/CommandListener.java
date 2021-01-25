package me.Thom.events;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class CommandListener implements Listener {

	@EventHandler
	public void join(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		Bukkit.broadcastMessage("Pripojil se hrac jmenem " + p.getName());
		p.sendMessage("Vitej na serveru hraci " + p.getName());
	}
	
	@EventHandler
	public void onCommandExecute(PlayerCommand e) {
		String p = e.getPlayer();
		Bukkit.broadcastMessage("Hrac " + p + " napsal prikaz " + e.getCommand());
	}
	
}
