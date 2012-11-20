package com.timvisee.DungeonMaze.event.EventHandler;

import org.bukkit.Server;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class DMEventHandler extends Event {
	
	private boolean isCancelled;
	private static final HandlerList handlers = new HandlerList();
	private static Server s;

	
	public HandlerList getHandlers() {
		return handlers;
	}
	
    public static HandlerList getHandlerList() {
        return handlers;
    }
	
	public boolean isCancelled() {
		return this.isCancelled;
	}
	
	public void setCancelled(boolean cancelled) {
		this.isCancelled = cancelled;
	}

	
	public static Server getServer() {
		return s;
	}
	
	

}
