package com.ss.android.vc.entity;

public enum MutexServiceType {
    UNKNOWN(0),
    VOIP(1),
    VC(2);
    
    private int value;

    public int getNumber() {
        return this.value;
    }

    public static MutexServiceType valueOf(int i) {
        return forNumber(i);
    }

    public static MutexServiceType forNumber(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return VOIP;
        }
        if (i != 2) {
            return null;
        }
        return VC;
    }

    private MutexServiceType(int i) {
        this.value = i;
    }
}
