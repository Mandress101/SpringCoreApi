package dev.springcraft.springcore.api.events;

import dev.springcraft.springcore.api.player.SpringCorePlayer;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class SpringCorePlayerVanishEvent extends Event implements Cancellable {

    private static HandlerList HANDLERS = new HandlerList();
    private SpringCorePlayer player;
    private boolean cancel = true;
    private String cancelled_message;

    public SpringCorePlayerVanishEvent(SpringCorePlayer player) {
        this.player = player;
    }

    public SpringCorePlayerVanishEvent(boolean isAsync, SpringCorePlayer player) {
        super(isAsync);
        this.player = player;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    @Override
    public boolean isCancelled() {
        return this.cancel;
    }

    @Override
    public void setCancelled(boolean cancel) {
        this.cancel = cancel;
    }

    public void setCancelled_message(String cancelled_message) {
        this.cancelled_message = cancelled_message;
    }

    public String getCancelled_message() {
        return cancelled_message;
    }

    public SpringCorePlayer getPlayer() {
        return player;
    }
}
