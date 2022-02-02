package it.mandress101.springcore.api;

import it.mandress101.springcore.utils.Utils;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.entity.Player;

@Deprecated
public class PlayersApi {

    private Player player;
    private SpringCorePlayer springCorePlayer;

    public PlayersApi(Player player) {
        this.player = player;
    }

    public PlayersApi(SpringCorePlayer springCorePlayer) {
        this.springCorePlayer = springCorePlayer;
    }

    public void sendActionBar(String text) {
        getPlayer().spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(Utils.translate(text)));
    }

    public void sendTitle(String title, String subtitle, int fadeIn, int fateOut, int stay) {

    }

    public void sendActionBar(TextComponent textComponent) {
        getPlayer().spigot().sendMessage(ChatMessageType.ACTION_BAR, textComponent);
    }

    public void sendHover(String text, String hover_message) {
        TextComponent component = new TextComponent(Utils.translate(text));
    }

    public Player getPlayer() {
        return player;
    }

    public SpringCorePlayer getSpringCorePlayer() {
        return springCorePlayer;
    }
}
