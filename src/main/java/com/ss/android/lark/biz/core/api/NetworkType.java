package com.ss.android.lark.biz.core.api;

public enum NetworkType {
    NO_INTERNET_CONNECTION(1),
    CELLULAR_DATA_NETWORK(2),
    WIFI(3);
    
    private int value;

    public int getNumber() {
        return this.value;
    }

    public static NetworkType valueOf(int i) {
        return forNumber(i);
    }

    public static NetworkType forNumber(int i) {
        if (i == 1) {
            return NO_INTERNET_CONNECTION;
        }
        if (i == 2) {
            return CELLULAR_DATA_NETWORK;
        }
        if (i != 3) {
            return null;
        }
        return WIFI;
    }

    private NetworkType(int i) {
        this.value = i;
    }
}
