package com.bytedance.common.wschannel.event;

public enum ChannelType {
    CHANNEL_SELF(1),
    CHANNEL_OK(2);
    
    int mTypeValue;

    public int getVal() {
        return this.mTypeValue;
    }

    public String toString() {
        return "ChannelType{Type=" + this.mTypeValue + '}';
    }

    public static ChannelType of(int i) {
        if (i == 1) {
            return CHANNEL_SELF;
        }
        return CHANNEL_OK;
    }

    private ChannelType(int i) {
        this.mTypeValue = i;
    }
}
