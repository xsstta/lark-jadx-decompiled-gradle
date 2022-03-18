package com.ss.android.lark.mail.impl.entity;

public enum SendState {
    UNKNOWN_SEND_STATE(0),
    DELIVERING(1),
    PARTIAL_SUCCESS(2),
    ALL_SUCCESS(3),
    PARTIAL_FAIL(4),
    ALL_FAIL(5);
    
    private final int value;

    public int getValue() {
        return this.value;
    }

    public static SendState fromValue(int i) {
        if (i == 0) {
            return UNKNOWN_SEND_STATE;
        }
        if (i == 1) {
            return DELIVERING;
        }
        if (i == 2) {
            return PARTIAL_SUCCESS;
        }
        if (i == 3) {
            return ALL_SUCCESS;
        }
        if (i == 4) {
            return PARTIAL_FAIL;
        }
        if (i != 5) {
            return null;
        }
        return ALL_FAIL;
    }

    private SendState(int i) {
        this.value = i;
    }
}
