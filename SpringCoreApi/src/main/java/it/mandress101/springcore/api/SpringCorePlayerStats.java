package it.mandress101.springcore.api;

public class SpringCorePlayerStats {

    private int kills;
    private int deaths;
    private int timeJoined;

    public SpringCorePlayerStats(int kills, int deaths, int timeJoined) {
        this.kills = kills;
        this.deaths = deaths;
        this.timeJoined = timeJoined;
    }

    public int getKills() {
        return kills;
    }

    public int getDeaths() {
        return deaths;
    }

    public int getTimeJoined() {
        return timeJoined;
    }
}
