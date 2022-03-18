package com.ss.android.lark.leanmode.dto;

public enum CleanLevel {
    LOW(1),
    MEDIUM(2),
    HIGH(3),
    FULL(4);
    
    private int mValue;

    public int getValue() {
        return this.mValue;
    }

    public static CleanLevel fromValue(int i) {
        if (i == 1) {
            return LOW;
        }
        if (i == 2) {
            return MEDIUM;
        }
        if (i == 3) {
            return HIGH;
        }
        if (i != 4) {
            return null;
        }
        return FULL;
    }

    private CleanLevel(int i) {
        this.mValue = i;
    }
}
