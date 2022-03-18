package com.ss.android.vc.entity.response;

public enum ClientExtraActionEntity {
    UNKNOWN_ACTION(0),
    START_SHARE_SCREEN(1);
    
    private int value;

    public int getNumber() {
        return this.value;
    }

    public static ClientExtraActionEntity fromValue(int i) {
        if (i == 0) {
            return UNKNOWN_ACTION;
        }
        if (i != 1) {
            return null;
        }
        return START_SHARE_SCREEN;
    }

    private ClientExtraActionEntity(int i) {
        this.value = i;
    }
}
