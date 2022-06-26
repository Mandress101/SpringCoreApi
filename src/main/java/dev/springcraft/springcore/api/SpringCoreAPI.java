package dev.springcraft.springcore.api;

import dev.springcraft.springcore.api.player.SpringCorePlayer;
import dev.springcraft.springcore.api.protocol.ProtocolInjector;
import org.bukkit.entity.Player;

public interface SpringCoreAPI {

    String getVersion();
    SpringCorePlayer loadPlayer(String name);
    SpringCorePlayer loadPlayer(Player bukkitPlayer);
    String getEnabledVersion();
    String getMessagesPrefix();
    ProtocolInjector getPacketInjector();

}
