package com.bytedance.common.wschannel.event;

public class ConnectEvent {
    public final ConnectionState connectionState;
    public final int mChannelId;
    public final ChannelType mType;

    public String toString() {
        return "ConnectEvent{mType=" + this.mType + ", connectionState=" + this.connectionState + ", mChannelId=" + this.mChannelId + '}';
    }

    public ConnectEvent(ConnectionState connectionState2, ChannelType channelType, int i) {
        this.connectionState = connectionState2;
        this.mType = channelType;
        this.mChannelId = i;
    }
}
