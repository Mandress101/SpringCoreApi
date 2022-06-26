package dev.springcraft.springcore.api.player;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public interface SpringCorePlayer {

    String getName();
    Player getBukkitPlayer();
    boolean isVanished();
    void setVanished(boolean vanished);
    boolean isBedrock();
    void setBedrock(boolean bedrock_player);
    boolean isFrozen();
    void setFrozen(boolean frozen);
    String getFirstEnter();
    boolean hasAllPerms();
    long getFirstJoinTimestamp();
    boolean hasCommandSpyEnabled();
    void setCommandSptEnabled(boolean enabled);
    String getCustomNick();
    void setCustomNick(String nickname);
    void setCustomNameTag(String nameTag);
    void destroyNameTag();
    void sendMessage(String message);
    void sendTitle(String title, String subTitle, int fadeIn, int stay, int fadeOut);
    void sendActionBar(String message);
    void openBook(ItemStack book);
    void clearArrows();
    void removeEntity(Entity entity);

}
