package it.mandress101.springcore.api;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class SpringCoreInitializeEvent extends Event{

    private static final HandlerList handlers = new HandlerList();
    private String pluginOnwer;
    private String license;

    public SpringCoreInitializeEvent(String pluginOnwer, String license) {
        this.pluginOnwer = pluginOnwer;
        this.license = license;
    }

    public String getPluginOnwer() {
        return pluginOnwer;
    }

    public String getLicense() {
        return license;
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
