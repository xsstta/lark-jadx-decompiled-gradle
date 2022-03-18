package com.ss.android.lark.mail.impl.entity;

public enum AddressType {
    UNKNOWN(0),
    USER(1),
    GROUP(2),
    SHARED_MAILBOX(3),
    ENTERPRISE_MAIL_GROUP(250);
    
    private final int value;

    public int getValue() {
        return this.value;
    }

    public static AddressType fromValue(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return USER;
        }
        if (i == 2) {
            return GROUP;
        }
        if (i == 3) {
            return SHARED_MAILBOX;
        }
        if (i != 250) {
            return null;
        }
        return ENTERPRISE_MAIL_GROUP;
    }

    private AddressType(int i) {
        this.value = i;
    }
}
