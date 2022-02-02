package it.mandress101.springcore.api.chat;

import it.mandress101.springcore.api.SpringCorePlayer;

public interface IChatFormat {

    IChatFormat getFormat();
    String setChatPrefix();
    String getChatSuffix();
    SpringCorePlayer getPlayer();
    String getMessage();
    String getSeparator();
    String getCompiledFormat();

}
