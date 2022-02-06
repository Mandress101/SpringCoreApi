package it.mandress101.springcore.api.model;

public class Tempban {

    public String player;
    public String staffer;
    public String dateExecuted;
    public long duration;
    public String reason;
    public boolean active;
    public String removed;
    public String removalReason;

    public Tempban(String player, String staffer, String dateExecuted, long duration, String reason, boolean active, String removed, String removalReason) {
        this.player = player;
        this.staffer = staffer;
        this.dateExecuted = dateExecuted;
        this.duration = duration;
        this.reason = reason;
        this.active = active;
        this.removed = removed;
        this.removalReason = removalReason;
    }

    public String getPlayer() {
        return player;
    }

    public String getStaffer() {
        return staffer;
    }

    public String getDateExecuted() {
        return dateExecuted;
    }

    public long getDuration() {
        return duration;
    }

    public String getReason() {
        return reason;
    }

    public boolean isActive() {
        return active;
    }

    public String getRemoved() {
        return removed;
    }

    public String getRemovalReason() {
        return removalReason;
    }
}
