package it.mandress101.springcore.api.chat;

import it.mandress101.springcore.api.SpringCorePlayer;
import org.jetbrains.annotations.NotNull;

public interface IChatComponentBuilder {

    @NotNull IChatComponentBuilder source(String source);

    @NotNull IChatComponentBuilder sourceName(String name);

    @NotNull IChatComponentBuilder getChatPlayer(SpringCorePlayer player);

    @NotNull IChatComponentBuilder targetName(String name);

    @NotNull IChatComponentBuilder getComponentValue(String value);

    @NotNull ChatComponent.Builder build();

}
