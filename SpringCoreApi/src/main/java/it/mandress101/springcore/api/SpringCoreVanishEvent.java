package it.mandress101.springcore.api;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class SpringCoreVanishEvent extends Event {

    private static final HandlerList handlers = new HandlerList();
    private Player player;
    private List<Player> VanishedPlayers;

    public SpringCoreVanishEvent(Player player, List<Player> vanishedPlayer) {
        this.player = player;
        this.VanishedPlayers = vanishedPlayer;
    }

    public Player getPlayer() {
        return player;
    }

    public List<Player> getVanishedPlayers() {
        return VanishedPlayers;
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
