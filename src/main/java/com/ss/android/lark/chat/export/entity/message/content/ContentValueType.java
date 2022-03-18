package com.ss.android.lark.chat.export.entity.message.content;

public enum ContentValueType {
    UNKNOWN(0),
    USER(1),
    BOT(2),
    TEXT(3),
    CHAT(4),
    CHATTER(5),
    URL(6),
    ACTION(7),
    DEPARTMENT(8);
    
    private final int value;

    public int getValue() {
        return this.value;
    }

    public static ContentValueType fromValue(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return USER;
            case 2:
                return BOT;
            case 3:
                return TEXT;
            case 4:
                return CHAT;
            case 5:
                return CHATTER;
            case 6:
                return URL;
            case 7:
                return ACTION;
            case 8:
                return DEPARTMENT;
            default:
                return null;
        }
    }

    private ContentValueType(int i) {
        this.value = i;
    }
}
