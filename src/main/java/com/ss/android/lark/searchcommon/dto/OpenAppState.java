package com.ss.android.lark.searchcommon.dto;

public enum OpenAppState {
    USABLE(0),
    TENANT_FORBIDDEN(2),
    PLATFORM_FORBIDDEN(3),
    DEVELOPER_FORBIDDEN(4),
    OFFLINE(5),
    USER_INVISIBLE(6),
    APP_NEED_PAY_USE(7),
    APP_DELETED(8);
    
    private int value;

    public final int getNumber() {
        return this.value;
    }

    public static OpenAppState forNumber(int i) {
        if (i == 0) {
            return USABLE;
        }
        if (i == 2) {
            return TENANT_FORBIDDEN;
        }
        if (i == 3) {
            return PLATFORM_FORBIDDEN;
        }
        if (i == 4) {
            return DEVELOPER_FORBIDDEN;
        }
        if (i == 5) {
            return OFFLINE;
        }
        if (i == 7) {
            return APP_NEED_PAY_USE;
        }
        if (i != 8) {
            return USER_INVISIBLE;
        }
        return APP_DELETED;
    }

    private OpenAppState(int i) {
        this.value = i;
    }
}
