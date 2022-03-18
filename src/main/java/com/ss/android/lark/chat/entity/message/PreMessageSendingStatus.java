package com.ss.android.lark.chat.entity.message;

public enum PreMessageSendingStatus {
    UNKNOWN(0),
    PENDING(1),
    FAILED(2);
    
    private int value;

    public int getNumber() {
        return this.value;
    }

    public static PreMessageSendingStatus forNumber(int i) {
        if (i == 1) {
            return PENDING;
        }
        if (i != 2) {
            return UNKNOWN;
        }
        return FAILED;
    }

    private PreMessageSendingStatus(int i) {
        this.value = i;
    }
}
