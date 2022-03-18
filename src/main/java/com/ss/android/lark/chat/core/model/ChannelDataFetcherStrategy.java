package com.ss.android.lark.chat.core.model;

public enum ChannelDataFetcherStrategy {
    IGNORE_LOCAL_DATA(1),
    RETURN_LOCAL_DATA(2),
    SYNC_SERVER_DATA(3);
    
    private int value;

    public int getNumber() {
        return this.value;
    }

    public static ChannelDataFetcherStrategy fromValue(int i) {
        if (i == 1) {
            return IGNORE_LOCAL_DATA;
        }
        if (i == 2) {
            return RETURN_LOCAL_DATA;
        }
        if (i != 3) {
            return SYNC_SERVER_DATA;
        }
        return SYNC_SERVER_DATA;
    }

    private ChannelDataFetcherStrategy(int i) {
        this.value = i;
    }
}
