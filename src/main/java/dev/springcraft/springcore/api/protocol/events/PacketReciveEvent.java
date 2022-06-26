package dev.springcraft.springcore.api.protocol.events;

import dev.springcraft.springcore.api.player.SpringCorePlayer;
import dev.springcraft.springcore.api.protocol.packet.WrappedPacket;
import org.bukkit.entity.Player;

public class PacketReciveEvent {

    private final WrappedPacket packet;
    private final Player player;
    private final SpringCorePlayer springCorePlayer;

    public PacketReciveEvent(WrappedPacket packet, Player player, SpringCorePlayer springCorePlayer) {
        this.packet = packet;
        this.player = player;
        this.springCorePlayer = springCorePlayer;
    }

    public WrappedPacket getPacket() {
        return packet;
    }

    public Player getPlayer() {
        return player;
    }

    public SpringCorePlayer getSpringCorePlayer() {
        return springCorePlayer;
    }
}
