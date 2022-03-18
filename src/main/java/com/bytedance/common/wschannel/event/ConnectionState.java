package com.bytedance.common.wschannel.event;

public enum ConnectionState {
    CONNECTION_UNKNOWN(1),
    CONNECTING(2),
    CONNECT_FAILED(4),
    CONNECT_CLOSED(8),
    CONNECTED(16);
    
    final int mTypeValue;

    public int getTypeValue() {
        return this.mTypeValue;
    }

    public String toString() {
        return "ConnectionState{State=" + this.mTypeValue + '}';
    }

    private ConnectionState(int i) {
        this.mTypeValue = i;
    }
}
