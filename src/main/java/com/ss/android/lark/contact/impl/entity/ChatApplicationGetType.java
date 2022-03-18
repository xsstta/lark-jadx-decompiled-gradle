package com.ss.android.lark.contact.impl.entity;

public enum ChatApplicationGetType {
    BEFORE(1),
    AFTER(2);
    
    private int value;

    public int getNumber() {
        return this.value;
    }

    public static ChatApplicationGetType valueOf(int i) {
        return forNumber(i);
    }

    public static ChatApplicationGetType forNumber(int i) {
        if (i == 1) {
            return BEFORE;
        }
        if (i != 2) {
            return null;
        }
        return AFTER;
    }

    private ChatApplicationGetType(int i) {
        this.value = i;
    }
}
