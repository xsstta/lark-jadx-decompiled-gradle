package com.ss.android.lark.mail.impl.entity;

public enum ReplyLanguage {
    AUTO(0),
    ZH(1),
    US(2);
    
    private final int value;

    public int getValue() {
        return this.value;
    }

    public static ReplyLanguage fromValue(int i) {
        if (i == 0) {
            return AUTO;
        }
        if (i == 1) {
            return ZH;
        }
        if (i != 2) {
            return null;
        }
        return US;
    }

    private ReplyLanguage(int i) {
        this.value = i;
    }
}
