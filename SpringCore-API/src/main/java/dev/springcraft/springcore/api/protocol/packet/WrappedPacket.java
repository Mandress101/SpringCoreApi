package dev.springcraft.springcore.api.protocol.packet;

public abstract class WrappedPacket {

    protected final Object packet;
    private boolean cancelled = false;

    public WrappedPacket(Object packet) {
        this.packet = packet;
    }

    public Object getPacket() {
        return packet;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public abstract Class<? extends WrappedPacket> getPacketType();
}
