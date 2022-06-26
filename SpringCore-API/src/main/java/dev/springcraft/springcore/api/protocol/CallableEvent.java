package dev.springcraft.springcore.api.protocol;

import dev.springcraft.springcore.api.protocol.packet.WrappedPacket;

public interface CallableEvent {

    void call(WrappedPacket packet);
}
