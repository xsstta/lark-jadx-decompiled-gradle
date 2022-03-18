package com.ss.android.lark.openplatform.openapp.dto;

public enum PlatformType {
    UNKNOWN(-1),
    PlatformTypeWindows(2),
    PlatformTypeMac(3),
    PlatformTypeIphone(4),
    PlatformTypeAndroidMobile(5),
    PlatformTypeAndroidpad(6),
    PlatformTypeIpad(7);
    
    private int value;

    public int getNumber() {
        return this.value;
    }

    public static PlatformType forNumber(int i) {
        switch (i) {
            case 2:
                return PlatformTypeWindows;
            case 3:
                return PlatformTypeMac;
            case 4:
                return PlatformTypeIphone;
            case 5:
                return PlatformTypeAndroidMobile;
            case 6:
                return PlatformTypeAndroidpad;
            case 7:
                return PlatformTypeIpad;
            default:
                return UNKNOWN;
        }
    }

    private PlatformType(int i) {
        this.value = i;
    }
}
