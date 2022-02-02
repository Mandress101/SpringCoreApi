package it.mandress101.springcore.api;

import it.mandress101.springcore.utils.Configurations;

public enum SpringCore {

    PERSONAL("SpringCore - Personal", "DEMON-PRE-0.0.3", Configurations.getAuthString("auth.settings.licnese")),
    ENTERPRISE("SpringCore - Enterprise", "DEMON-PRE-0.0.3", Configurations.getAuthString("auth.settings.licnese"));

    private String name;
    private String version;
    private String authKey;

    SpringCore(String name, String version, String authKey) {
        this.name = name;
        this.version = version;
        this.authKey = authKey;
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public String getAuthKey() {
        return authKey;
    }
}
