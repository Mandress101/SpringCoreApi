package it.mandress101.springcore.api.abstracts;

import it.mandress101.springcore.api.SpringCoreApi;
import it.mandress101.springcore.api.SpringCoreProvider;

public class SpringCoreExtention {

    public int onEnable() {
        return 1;
    }

    public void registerCommand(SpringCoreCommand coreCommand) {

    }

    public int onDisable() {
        return 0;
    }

    public SpringCoreApi getSpringApi() {
        return SpringCoreProvider.getApi();
    }
}
