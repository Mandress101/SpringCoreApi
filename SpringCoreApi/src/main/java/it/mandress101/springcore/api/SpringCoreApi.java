package it.mandress101.springcore.api;

import it.mandress101.springcore.api.abstracts.SpringCoreCommand;
import it.mandress101.springcore.api.abstracts.SpringCoreRankRservedCommand;
import org.bukkit.entity.Player;

public interface SpringCoreApi {

    void sendMessage(Player player, String message);
    void sendMessage(SpringCorePlayer player, String message);
    void sendConsoleMessage(String message);
    SpringCorePlayer loadPlayer(Player p);
    SpringCorePlayer laodPlayer(String name);
    void registerCommand(SpringCoreCommand commandClass);
    void registerReservedcommand(SpringCoreRankRservedCommand commandClass);
    void registerExtension(Class clazz, boolean legacy);
}
