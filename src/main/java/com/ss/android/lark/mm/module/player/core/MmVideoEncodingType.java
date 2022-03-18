package com.ss.android.lark.mm.module.player.core;

public enum MmVideoEncodingType {
    H264(0),
    H265(1),
    UNKNOWN(2);
    
    private int value;

    public int getValue() {
        return this.value;
    }

    public static MmVideoEncodingType valueOf(int i) {
        if (i == 0) {
            return H264;
        }
        if (i != 1) {
            return UNKNOWN;
        }
        return H265;
    }

    private MmVideoEncodingType(int i) {
        this.value = i;
    }
}
