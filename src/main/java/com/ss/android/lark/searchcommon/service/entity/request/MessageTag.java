package com.ss.android.lark.searchcommon.service.entity.request;

public enum MessageTag {
    UNKNOWN(0),
    PIN(1);
    
    private final int value;

    public int getValue() {
        return this.value;
    }

    private MessageTag(int i) {
        this.value = i;
    }
}
