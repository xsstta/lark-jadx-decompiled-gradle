package com.ss.android.lark.team.entity;

public enum TeamChatMode {
    UNKNOWN(0),
    CONVERSATION(1),
    TOPIC(3);
    
    private final int value;

    public int getValue() {
        return this.value;
    }

    public static TeamChatMode fromValue(int i) {
        if (i == 1) {
            return CONVERSATION;
        }
        if (i != 3) {
            return UNKNOWN;
        }
        return TOPIC;
    }

    private TeamChatMode(int i) {
        this.value = i;
    }
}
