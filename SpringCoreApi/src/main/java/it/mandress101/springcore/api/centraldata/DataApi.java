package it.mandress101.springcore.api.centraldata;

import it.mandress101.springcore.api.SpringCorePlayer;
import it.mandress101.springcore.api.model.EPrefix;
import it.mandress101.springcore.database.centraldata.MongoStorage;
import org.bukkit.entity.Player;

/*
* Questa classe api è stata programmata con uno sfondo del cazzo
* */

public class DataApi implements ICentralData {

    @Override
    public SpringCorePlayer getSpringCorePlayer() {
        return null;
    }

    @Override
    public boolean isPropertySet(String property) {
        return false;
    }

    @Override
    public void setProperty(String property, Object value) {
        MongoStorage.setStrigProperty(getSpringCorePlayer().getName(), property, String.valueOf(value));
    }

    @Override
    public void unsetProperty(String property) {

    }

    @Override
    public void deleteProperty(String property) {

    }

    @Override
    public boolean isFrozen() {
        return false;
    }

    @Override
    public boolean isBanned() {
        return false;
    }

    @Override
    public String getSpringCoreInternalRank() {
        return null;
    }

    @Override
    public Player getPlayer() {
        return null;
    }

    @Override
    public EPrefix getPluginPrefix() {
        return null;
    }
}
