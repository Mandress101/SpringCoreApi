package it.mandress101.springcore.api.chat;

import it.mandress101.springcore.api.SpringCorePlayer;
import org.jetbrains.annotations.NotNull;

public class ChatComponent {

    private String componentMame;
    private String componentValue;
    private String source;
    private String sourceName;

    public Builder build() {
        return new Builder();
    }

    public ChatComponent(String componentMame, String componentValue, String source, String sourceName) {
        this.componentMame = componentMame;
        this.componentValue = componentValue;
        this.source = source;
        this.sourceName = sourceName;
    }

    public void setComponentMame(String componentMame) {
        this.componentMame = componentMame;
    }

    public void setComponentValue(String componentValue) {
        this.componentValue = componentValue;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public String getComponentMame() {
        return componentMame;
    }

    public String getComponentValue() {
        return componentValue;
    }

    public String getSource() {
        return source;
    }

    public String getSourceName() {
        return sourceName;
    }

    public static class Builder implements IChatComponentBuilder {

        private String source;
        private String sourceName;
        private SpringCorePlayer player;
        private String name;
        private String targetName;
        private String value;

        @Override
        public @NotNull IChatComponentBuilder source(String source) {
            this.source = source;
            return this;
        }

        @Override
        public @NotNull IChatComponentBuilder sourceName(String name) {
            this.sourceName = sourceName;
            return this;
        }

        @Override
        public @NotNull IChatComponentBuilder getChatPlayer(SpringCorePlayer player) {
            this.player = player;
            return this;
        }

        @Override
        public @NotNull IChatComponentBuilder targetName(String name) {
            this.name = name;
            return this;
        }

        @Override
        public @NotNull IChatComponentBuilder getComponentValue(String value) {
            return this;
        }

        @Override
        public @NotNull Builder build() {
            targetName(targetName);
            sourceName(sourceName);
            return new Builder();
        }
    }
}
