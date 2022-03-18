package com.ss.android.vc.entity;

public enum ContainerType {
    SPACE(0),
    WIKI2(1);
    
    private int value;

    public int getNumber() {
        return this.value;
    }

    public int getValue() {
        return this.value;
    }

    public static ContainerType fromValue(int i) {
        if (i == 0) {
            return SPACE;
        }
        if (i != 1) {
            return SPACE;
        }
        return WIKI2;
    }

    private ContainerType(int i) {
        this.value = i;
    }
}
