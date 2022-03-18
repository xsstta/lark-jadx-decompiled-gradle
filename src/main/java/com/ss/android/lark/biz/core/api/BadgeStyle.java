package com.ss.android.lark.biz.core.api;

public enum BadgeStyle {
    WEAK_REMIND(1),
    STRONG_REMIND(2);
    
    private int value;

    public int getNumber() {
        return this.value;
    }

    public static BadgeStyle valueOf(int i) {
        return forNumber(i);
    }

    public static BadgeStyle forNumber(int i) {
        if (i == 1) {
            return WEAK_REMIND;
        }
        if (i != 2) {
            return STRONG_REMIND;
        }
        return STRONG_REMIND;
    }

    private BadgeStyle(int i) {
        this.value = i;
    }
}
