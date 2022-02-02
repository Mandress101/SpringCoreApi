package it.mandress101.springcore.api;

import it.mandress101.springcore.SpringCore;
import it.mandress101.springcore.api.abstracts.SpringCoreCommand;
import it.mandress101.springcore.api.abstracts.SpringCoreRankRservedCommand;
import it.mandress101.springcore.utils.Utils;
import org.bukkit.entity.Player;

public class SpringCoreProvider implements SpringCoreApi {

    private static SpringCoreApi api;
    private SpringCore plugin;

    public void init() {
        api = this;
        Utils.logInConsole("&aApi inizializzate!");
    }

    @Override
    public void sendMessage(Player player, String message) {
        if(player != null) {
            player.sendMessage(Utils.translate(message));
        } else {
            sendConsoleMessage("&c[SPRINGCORE] [ERRORE] >> Giocatore null!");
            return;
        }
    }

    @Override
    public void sendMessage(SpringCorePlayer player, String message) {
        if(player != null) {
            player.sendMessage(message);
        } else {
            return;
        }
    }

    @Override
    public void sendConsoleMessage(String message) {
        Utils.logInConsole("&3[Api] &6" + message);
    }

    @Override
    public SpringCorePlayer loadPlayer(Player p) {
        return new SpringCorePlayerApi(p);
    }

    @Override
    public SpringCorePlayer laodPlayer(String name) {
        return new SpringCorePlayerApi(name);
    }

    @Override
    public void registerCommand(SpringCoreCommand commandClass) {
        this.plugin.addNewCommand(commandClass);
    }

    @Override
    public void registerReservedcommand(SpringCoreRankRservedCommand commandClass) {

    }

    @Override
    public void registerExtension(Class clazz, boolean legacy) {
        sendConsoleMessage("Estensione registrata su: &6" + clazz.getName());
        //Utils.logInConsole("Estensione registrata su: &6" + clazz.getName());
    }

    public static SpringCoreApi getApi() {
        return api;
    }
}
