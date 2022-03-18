package com.ss.android.vc.entity;

public enum VcDocShareStatus {
    UNKNOWN(0),
    FULLY_SHARE(1),
    PARTIAL_SHARE(2),
    NO_SHARE_PERMISSION(3),
    NO_SUPPORT_SHARE(4);
    
    private int value;

    public int getNumber() {
        return this.value;
    }

    public static VcDocShareStatus valueOf(int i) {
        return forNumber(i);
    }

    public static VcDocShareStatus forNumber(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return FULLY_SHARE;
        }
        if (i == 2) {
            return PARTIAL_SHARE;
        }
        if (i == 3) {
            return NO_SHARE_PERMISSION;
        }
        if (i != 4) {
            return null;
        }
        return NO_SUPPORT_SHARE;
    }

    private VcDocShareStatus(int i) {
        this.value = i;
    }
}
