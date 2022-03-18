package com.ss.android.lark.mail.impl.entity;

public enum MailOnBoardStatus {
    ACTIVE(0),
    SMTP_ACTIVE(1),
    FORCE_INPUT(2),
    SOFT_INPUT(3);
    
    private final int value;

    public int getValue() {
        return this.value;
    }

    public boolean isValid() {
        if (this == ACTIVE || this == SOFT_INPUT) {
            return true;
        }
        return false;
    }

    public static MailOnBoardStatus fromValue(int i) {
        if (i == 0) {
            return ACTIVE;
        }
        if (i == 1) {
            return SMTP_ACTIVE;
        }
        if (i == 2) {
            return FORCE_INPUT;
        }
        if (i != 3) {
            return null;
        }
        return SOFT_INPUT;
    }

    private MailOnBoardStatus(int i) {
        this.value = i;
    }
}
