package dev.springcraft.springcore.api.protocol.packet.server;

import dev.springcraft.springcore.api.protocol.packet.WrappedPacket;

public class ServerPositionPacket extends WrappedPacket {
    private final ServerPositionPacket.PositionType type;
    private final boolean ground;
    private final double x;
    private final double y;
    private final double z;
    private final float yaw;
    private final float pitch;

    public ServerPositionPacket(Object packet, boolean ground) {
        super(packet);
        this.type = PositionType.FLYING;
        this.ground = ground;
        this.x = 0.0D;
        this.y = 0.0D;
        this.z = 0.0D;
        this.yaw = 0.0F;
        this.pitch = 0.0F;
    }

    public ServerPositionPacket(Object packet, boolean ground, double x, double y, double z) {
        super(packet);
        this.type = PositionType.POSITION;
        this.ground = ground;
        this.x = x;
        this.y = y;
        this.z = z;
        this.yaw = 0.0F;
        this.pitch = 0.0F;
    }

    public ServerPositionPacket(Object packet, boolean ground, float yaw, float pitch) {
        super(packet);
        this.type = PositionType.LOOK;
        this.ground = ground;
        this.yaw = yaw;
        this.pitch = pitch;
        this.x = 0.0D;
        this.y = 0.0D;
        this.z = 0.0D;
    }

    public ServerPositionPacket(Object packet, PositionType type, boolean ground, double x, double y, double z, float yaw, float pitch) {
        super(packet);
        this.type = type;
        this.ground = ground;
        this.x = x;
        this.y = y;
        this.z = z;
        this.yaw = yaw;
        this.pitch = pitch;
    }

    public boolean isMoving() {
        return this.type == PositionType.POSITION;
    }

    public boolean isRotating() {
        return this.type == PositionType.LOOK;
    }

    @Override
    public Class<? extends WrappedPacket> getPacketType() {
        return this.getClass();
    }

    private static enum PositionType {
        FLYING,
        POSITION,
        LOOK;

        private static ServerPositionPacket.PositionType[] getValues() {
            return new ServerPositionPacket.PositionType[]{FLYING, POSITION, LOOK};
        }
    }

    public boolean isGround() {
        return ground;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public float getYaw() {
        return yaw;
    }

    public float getPitch() {
        return pitch;
    }
}
