package it.mandress101.springcore.api.abstracts;

import it.mandress101.springcore.api.SpringCoreApi;
import it.mandress101.springcore.api.SpringCoreProvider;

public class SpringCoreExtention {

    public void onEnable() {

    }

    public void registerCommand(SpringCoreCommand coreCommand) {

    }

    public void onDisable() {

    }

    public SpringCoreApi getSpringApi() {
        return SpringCoreProvider.getApi();
    }

    public void log(String message) {
        SpringCoreProvider.getApi().sendConsoleMessage(message);
    }
}
