package com.ss.android.lark.feed.service.impl;

public enum Scene {
    DELAY(1),
    BOX(2);
    
    private int value;

    public int getNumber() {
        return this.value;
    }

    public static Scene valueOf(int i) {
        return forNumber(i);
    }

    public static Scene forNumber(int i) {
        if (i == 1) {
            return DELAY;
        }
        if (i != 2) {
            return null;
        }
        return BOX;
    }

    private Scene(int i) {
        this.value = i;
    }
}
