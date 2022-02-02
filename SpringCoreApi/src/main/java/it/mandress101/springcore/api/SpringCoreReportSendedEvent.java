package it.mandress101.springcore.api;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class SpringCoreReportSendedEvent extends Event {

    private static final HandlerList handlers = new HandlerList();
    private String id;
    private String player;
    private String sender;
    private String status;
    private String reason;

    public SpringCoreReportSendedEvent(String id, String player, String sender, String status, String reason) {
        this.id = id;
        this.player = player;
        this.sender = sender;
        this.status = status;
        this.reason = reason;
    }

    public String getId() {
        return id;
    }

    public String getPlayer() {
        return player;
    }

    public String getSender() {
        return sender;
    }

    public String getStatus() {
        return status;
    }

    public String getReason() {
        return reason;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return handlers;
    }
}
