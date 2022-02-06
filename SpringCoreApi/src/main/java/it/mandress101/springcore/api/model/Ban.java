package it.mandress101.springcore.api.model;

public class Ban {

    public String player;
    public String staffer;
    public String dateExecuted;
    public String reason;
    public boolean active;
    public String removedby;
    public String removal_reason;

    public Ban(String player, String staffer, String dateExecuted, String reason, boolean active, String removedby, String removal_reason) {
        this.player = player;
        this.staffer = staffer;
        this.dateExecuted = dateExecuted;
        this.reason = reason;
        this.active = active;
        this.removedby = removedby;
        this.removal_reason = removal_reason;
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

    public String getReason() {
        return reason;
    }

    public boolean isActive() {
        return active;
    }

    public String getRemovedby() {
        return removedby;
    }

    public String getRemoval_reason() {
        return removal_reason;
    }
}
