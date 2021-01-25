package me.Thom.events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public final class PlayerCommand extends Event {
	
	public static final HandlerList handlers = new HandlerList();
	
	private String p;
	private String cmd;
	
	public PlayerCommand(String p, String cmd) {
		this.p = p;
		this.cmd = cmd;
	}
	
	
	public HandlerList getHandlers() {
		return handlers;
	}
	
	public static HandlerList getHandlerList() {
		return handlers;
	}
	
	
	public String getPlayer() {
		return p;
	}
	
	public String getCommand() {
		return cmd;
	}
	
}
