package it.mandress101.springcore.api.chat;

import it.mandress101.springcore.api.SpringCorePlayer;
import it.mandress101.springcore.api.SpringCoreProvider;
import it.mandress101.springcore.events.SpringPexChatHandler;
import it.springcraft.springpex.api.SpringPexAPI;
import it.springcraft.springpex.api.SpringPexProvider;
import it.springcraft.springpex.api.model.group.Group;
import it.springcraft.springpex.api.model.group.GroupManager;
import it.springcraft.springpex.api.model.user.User;

public class ChatFormat implements IChatFormat {

    private IChatFormat chatFormat;
    private String playerName;
    private String chatMessage;
    private String sperator;

    public ChatFormat(String playerName, String message, String seprator) {
        chatFormat = this;
        this.playerName = playerName;
        this.chatMessage = message;
        this.sperator = seprator;
    }

    @Override
    public IChatFormat getFormat() {
        return this;
    }

    @Override
    public String setChatPrefix() {
        String name = getPlayer().getName();
        SpringPexAPI pexApi = SpringPexProvider.get();
        GroupManager groupManager = pexApi.getGroupManager();
        User pexUser = pexApi.getPlayerAdapter(SpringCorePlayer.class).getUser(getPlayer());
        Group rank = groupManager.getGroup(pexUser.getPrimaryGroup());
        return new ChatComponent(
                "SpringPex prefix",
                rank.getCachedData().getMetaData().getPrefix(),
                Group.class.getName(),
                SpringPexAPI.class.getName())
                .build()
                .getComponentValue(rank.getCachedData().getMetaData().getPrefix())
                .toString();
    }

    @Override
    public String getChatSuffix() {
        String name = getPlayer().getName();
        SpringPexAPI pexApi = SpringPexProvider.get();
        GroupManager groupManager = pexApi.getGroupManager();
        User pexUser = pexApi.getPlayerAdapter(SpringCorePlayer.class).getUser(getPlayer());
        Group rank = groupManager.getGroup(pexUser.getPrimaryGroup());
        return rank.getCachedData().getMetaData().getSuffix();
    }

    @Override
    public SpringCorePlayer getPlayer() {
        return SpringCoreProvider.getApi().laodPlayer(this.playerName);
    }

    @Override
    public String getMessage() {
        return this.chatMessage;
    }

    @Override
    public String getSeparator() {
        return this.sperator;
    }

    @Override
    public String getCompiledFormat() {
        String format = getChatSuffix() + getPlayer().getPlayer() + getChatSuffix() + getSeparator() + getMessage();
        return format;
    }

    public void registerPrefix(String prefix) {
        new ChatComponent("SpringPex Prefix", prefix, SpringPexChatHandler.class.getName(), "SpringPexApi").build();
    }
}
