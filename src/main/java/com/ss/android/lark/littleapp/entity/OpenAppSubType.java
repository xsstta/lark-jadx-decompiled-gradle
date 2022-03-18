package com.ss.android.lark.littleapp.entity;

public enum OpenAppSubType {
    UNKNOWN(0),
    MINI_APP(1),
    BOT_CHAT(2);
    
    int value;

    public int getNumber() {
        return this.value;
    }

    public static OpenAppSubType valueOf(int i) {
        return forNumber(i);
    }

    public static OpenAppSubType forNumber(int i) {
        if (i == 1) {
            return MINI_APP;
        }
        if (i != 2) {
            return UNKNOWN;
        }
        return BOT_CHAT;
    }

    private OpenAppSubType(int i) {
        this.value = i;
    }
}
