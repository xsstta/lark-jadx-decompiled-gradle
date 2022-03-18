package com.ss.android.lark.team.entity;

public enum TeamNameCheckType {
    UNKNOWN(0),
    CHAT(1),
    TEAM(2);
    
    private final int value;

    public int getValue() {
        return this.value;
    }

    private TeamNameCheckType(int i) {
        this.value = i;
    }
}
