package com.ss.android.lark.leanmode.dto;

public enum SyncDataStrategy {
    LOCAL(1),
    TRY_LOCAL(2),
    FORCE_SERVER(3);
    
    private int mValue;

    public int getValue() {
        return this.mValue;
    }

    public static SyncDataStrategy fromValue(int i) {
        if (i == 1) {
            return LOCAL;
        }
        if (i == 2) {
            return TRY_LOCAL;
        }
        if (i != 3) {
            return null;
        }
        return FORCE_SERVER;
    }

    private SyncDataStrategy(int i) {
        this.mValue = i;
    }
}
