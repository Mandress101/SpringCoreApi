package it.mandress101.springcore.api;

import it.mandress101.springcore.api.centraldata.ICentralData;
import it.mandress101.springcore.api.model.PlayerInformation;
import it.mandress101.springcore.commands.FreezeCommand;
import it.mandress101.springcore.commands.SpyCommandsCommand;
import it.mandress101.springcore.commands.VanishCommand;
import it.mandress101.springcore.database.centraldata.CentralData;
import it.mandress101.springcore.database.centraldata.MongoStorage;
import it.mandress101.springcore.utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.List;

public class SpringCorePlayerApi implements SpringCorePlayer {

    private String name;
    private Player player;

    public SpringCorePlayerApi(String name) {
        this.name = name;
    }

    public SpringCorePlayerApi(Player player) {
        this.player = player;
    }

    @Override
    public Player getPlayer() {
        return Bukkit.getPlayer(name);
    }

    @Override
    public String getName() {
        return getPlayer().getName();
    }

    @Override
    public boolean hasCmdSpyEnabled() {
        return SpyCommandsCommand.SpyStaffList.contains(getPlayer());
    }

    @Override
    public boolean isVanished() {
        return VanishCommand.VanishedList.contains(getPlayer());
    }

    @Override
    public boolean isHisUUIDVanished() {
        return VanishCommand.uuidVanishedList.contains(getPlayer().getUniqueId());
    }

    @Override
    public boolean hasAllPerms() {
        return getPlayer().hasPermission("springcore.*");
    }

    @Override
    public int getToalReports() {
        return -010101;
    }

    @Override
    public void freeze() {
        FreezeCommand.FrozenList.add(this.getPlayer());
        MongoStorage.setFrozen(this.name, true);
    }

    @Override
    public void vanish() {
        VanishCommand.VanishedList.add(this.getPlayer());
    }

    @Override
    public void unvanish() {
        VanishCommand.VanishedList.add(this.getPlayer());
    }

    @Override
    public void sendMessage(String mesage) {
        if(this.player != null) {
            this.player.sendMessage(Utils.translate(mesage));
        } else {
            Utils.logInConsole("&8[&3Spring&bCore&8] [&cAPI&8] >> &cImpossibile mandare il messaggio al player, giocatore offilne!");
        }
    }

    @Override
    public void unfreeze() {
        FreezeCommand.FrozenList.remove(this.getPlayer());
        MongoStorage.setFrozen(this.name, false);
    }

    @Override
    public boolean isFreezed() {
        return FreezeCommand.FrozenList.contains(this.getPlayer());
    }

    @Override
    public void setProperty(String property, String value) {

    }

    @Override
    public void setProperty(String property, boolean value) {

    }

    @Override
    public void setProperty(String property, int value) {

    }

    @Override
    public void setProperty(String property, List<String> value) {

    }

    @Override
    public boolean propertyIsSet(String property) {
        return false;
    }

    @Override
    public boolean propertyIsTrue(String property) {
        return false;
    }

    @Override
    public void unsetProperty(String property) {

    }

    @Override
    public void removeProperty(String property) {

    }

    @Override
    public String getSpringCoreRank() {
        return null;
    }

    @Override
    public PlayerInformation getPlayerInformation() {
        return null;
    }

    @Override
    public String getCustomNickname() {
        ICentralData centralData = new CentralData();
        return centralData.getCustomNickname(name);
    }
}
