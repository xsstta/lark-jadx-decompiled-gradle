package com.ss.android.lark.mail.impl.entity;

public enum BadgeCountState {
    GRAY(0),
    RED(1),
    WARNING(2),
    RED_DOT(3);
    
    private final int value;

    public int getValue() {
        return this.value;
    }

    public static BadgeCountState fromValue(int i) {
        if (i == 0) {
            return GRAY;
        }
        if (i == 1) {
            return RED;
        }
        if (i == 2) {
            return WARNING;
        }
        if (i != 3) {
            return null;
        }
        return RED_DOT;
    }

    private BadgeCountState(int i) {
        this.value = i;
    }
}
