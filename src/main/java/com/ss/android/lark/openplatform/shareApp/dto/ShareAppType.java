package com.ss.android.lark.openplatform.shareApp.dto;

public enum ShareAppType {
    SHARE_UNKNOWN(0),
    SHARE_APP(1),
    SHARE_APP_PAGE(2),
    SHARE_APP_H5(3);
    
    private int value;

    public int getNumber() {
        return this.value;
    }

    public static ShareAppType valueOf(int i) {
        return forNumber(i);
    }

    public static ShareAppType forNumber(int i) {
        if (i == 1) {
            return SHARE_APP;
        }
        if (i == 2) {
            return SHARE_APP_PAGE;
        }
        if (i != 3) {
            return SHARE_UNKNOWN;
        }
        return SHARE_APP_H5;
    }

    private ShareAppType(int i) {
        this.value = i;
    }
}
