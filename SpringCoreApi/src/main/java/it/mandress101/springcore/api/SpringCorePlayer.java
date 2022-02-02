package it.mandress101.springcore.api;

import it.mandress101.springcore.api.model.PlayerInformation;
import org.bukkit.entity.Player;

import java.util.List;

public interface SpringCorePlayer {

   Player getPlayer();

   String getName();

   boolean hasCmdSpyEnabled();

   boolean isVanished();

   boolean isHisUUIDVanished();

   boolean hasAllPerms();

   int getToalReports();

   void freeze();

   void vanish();

   void unvanish();

   void sendMessage(String message);

   void unfreeze();

   boolean isFreezed();

   void setProperty(String property, String value);

   void setProperty(String property, boolean value);

   void setProperty(String property, int value);

   void setProperty(String property, List<String> value);

   boolean propertyIsSet(String property);

   boolean propertyIsTrue(String property);

   void unsetProperty(String property);

   void removeProperty(String property);

   String getSpringCoreRank();

   PlayerInformation getPlayerInformation();

}
