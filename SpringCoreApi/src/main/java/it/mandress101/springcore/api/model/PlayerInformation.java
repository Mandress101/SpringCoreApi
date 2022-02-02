package it.mandress101.springcore.api.model;

public class PlayerInformation {

    private String name;
    private String uuid;
    private String spring_core_rank;
    private String lastIp;
    private boolean frozen;
    private boolean banned;

    public PlayerInformation(String name, String uuid, String spring_core_rank, String lastIp, boolean frozen, boolean banned) {
        this.name = name;
        this.uuid = uuid;
        this.spring_core_rank = spring_core_rank;
        this.lastIp = lastIp;
        this.frozen = frozen;
        this.banned = banned;
    }

    public String getName() {
        return name;
    }

    public String getUuid() {
        return uuid;
    }

    public String getCoreRank() {
        return spring_core_rank;
    }

    public String getLastIp() {
        return lastIp;
    }

    public boolean isFrozen() {
        return frozen;
    }

    public boolean isBanned() {
        return banned;
    }
}
