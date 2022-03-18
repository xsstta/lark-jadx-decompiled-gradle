package com.ss.android.lark.feed.service.impl;

public enum PullType {
    REFRESH(1),
    LOAD_MORE(2),
    BETWEEN_CURSOR(3);
    
    private int value;

    public int getNumber() {
        return this.value;
    }

    public static PullType valueOf(int i) {
        return forNumber(i);
    }

    public static PullType forNumber(int i) {
        if (i == 1) {
            return REFRESH;
        }
        if (i == 2) {
            return LOAD_MORE;
        }
        if (i != 3) {
            return null;
        }
        return BETWEEN_CURSOR;
    }

    private PullType(int i) {
        this.value = i;
    }
}
