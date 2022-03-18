package com.larksuite.component.blockit.entity;

public enum BlockitEnv {
    ONLINE(0),
    PRE_RELEASE(1),
    STAGING(2),
    BOE(3);
    
    private int value;

    public int getNumber() {
        return this.value;
    }

    public static BlockitEnv valueOf(int i) {
        return forNumber(i);
    }

    public static BlockitEnv forNumber(int i) {
        if (i == 0) {
            return ONLINE;
        }
        if (i == 1) {
            return PRE_RELEASE;
        }
        if (i == 2) {
            return STAGING;
        }
        if (i != 3) {
            return null;
        }
        return BOE;
    }

    private BlockitEnv(int i) {
        this.value = i;
    }
}
