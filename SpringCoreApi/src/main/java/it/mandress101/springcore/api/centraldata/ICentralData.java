package it.mandress101.springcore.api.centraldata;

import it.mandress101.springcore.api.SpringCorePlayer;
import it.mandress101.springcore.api.model.EPrefix;
import org.bukkit.entity.Player;

public interface ICentralData {
    SpringCorePlayer getSpringCorePlayer();
    boolean isPropertySet(String property);
    void setProperty(String property, Object value);
    void unsetProperty(String property);
    void deleteProperty(String property);
    boolean isFrozen();
    boolean isBanned();
    String getSpringCoreInternalRank();
    Player getPlayer();
    EPrefix getPluginPrefix();
}
