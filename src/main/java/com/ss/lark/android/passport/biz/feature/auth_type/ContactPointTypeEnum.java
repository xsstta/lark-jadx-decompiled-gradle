package com.ss.lark.android.passport.biz.feature.auth_type;

public enum ContactPointTypeEnum {
    PHONE(1),
    MAIL(2),
    IDP(32),
    OTHERS(-1);
    
    private final int type;

    public int value() {
        return this.type;
    }

    public static ContactPointTypeEnum fromValue(int i) {
        if (i == 1) {
            return PHONE;
        }
        if (i == 2) {
            return MAIL;
        }
        if (i != 32) {
            return OTHERS;
        }
        return IDP;
    }

    private ContactPointTypeEnum(int i) {
        this.type = i;
    }
}
