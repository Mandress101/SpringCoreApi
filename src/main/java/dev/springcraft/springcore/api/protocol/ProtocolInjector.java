package dev.springcraft.springcore.api.protocol;

import dev.springcraft.springcore.api.player.SpringCorePlayer;
import org.bukkit.entity.Player;

public interface ProtocolInjector {

    void inject(Player player);
    void inject(SpringCorePlayer player);

    void unInject(Player player);
    void unInject(SpringCorePlayer player);
}
