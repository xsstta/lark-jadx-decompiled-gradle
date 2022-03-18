package com.ss.android.lark.chat.entity.message;

public enum SendStatus {
    SUCCESS(0),
    SENDING(1),
    FAIL(2),
    DRAFT(3);
    
    private int value;

    public int getNumber() {
        return this.value;
    }

    public static SendStatus forNumber(int i) {
        if (i == 0) {
            return SUCCESS;
        }
        if (i == 1) {
            return SENDING;
        }
        if (i == 2) {
            return FAIL;
        }
        if (i != 3) {
            return null;
        }
        return DRAFT;
    }

    private SendStatus(int i) {
        this.value = i;
    }
}
