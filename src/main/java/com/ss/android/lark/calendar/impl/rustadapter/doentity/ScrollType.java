package com.ss.android.lark.calendar.impl.rustadapter.doentity;

public enum ScrollType {
    EVENT_INFO(1),
    MEETING_TRANSFER_CHAT(2);
    
    private int value;

    public int getNumber() {
        return this.value;
    }

    public static ScrollType valueOf(int i) {
        return forNumber(i);
    }

    public static ScrollType forNumber(int i) {
        if (i != 2) {
            return EVENT_INFO;
        }
        return MEETING_TRANSFER_CHAT;
    }

    private ScrollType(int i) {
        this.value = i;
    }
}
