package com.ss.android.appcenter.business.dto;

public enum AppType {
    UNKNOWN(0),
    LINK(1),
    APP(2),
    H5(3),
    MINA(4),
    ONCALL(5),
    SYS_BYTEDANCE_APP(21),
    SYS_BYTEDANCE_VAPP(22),
    SYS_EXTERNAL_APP(41),
    SYS_EXTERNAL_VAPP(42),
    SYS_ALL_APP(61),
    SYS_ALL_VAPP(62);
    
    private int value;

    public int getValue() {
        return this.value;
    }

    public static AppType fromValue(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return LINK;
        }
        if (i == 2) {
            return APP;
        }
        if (i == 3) {
            return H5;
        }
        if (i == 4) {
            return MINA;
        }
        if (i == 5) {
            return ONCALL;
        }
        if (i == 21) {
            return SYS_BYTEDANCE_APP;
        }
        if (i == 22) {
            return SYS_BYTEDANCE_VAPP;
        }
        if (i == 41) {
            return SYS_EXTERNAL_APP;
        }
        if (i == 42) {
            return SYS_EXTERNAL_VAPP;
        }
        if (i == 61) {
            return SYS_ALL_APP;
        }
        if (i != 62) {
            return null;
        }
        return SYS_ALL_VAPP;
    }

    private AppType(int i) {
        this.value = i;
    }
}
