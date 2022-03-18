package com.ss.android.lark.mail.impl.entity;

public enum UserType {
    LARK_SERVER(0),
    GMAIL_NEW_USER(1),
    GMAIL_OAUTH_CLIENT(2),
    EXCHANGE_CLIENT(3),
    LARK_SERVER_UNBIND(4),
    SERVICE_ACCOUNT_CLIENT(5),
    EXCHANGE_NEW_USER(6),
    GMAIL_API_CLIENT(7),
    EXCHANGE_API_CLIENT(8),
    NO_PRIMARY_ADDRESS_USER(9);
    
    private final int value;

    public int getValue() {
        return this.value;
    }

    public static UserType fromValue(int i) {
        switch (i) {
            case 0:
                return LARK_SERVER;
            case 1:
                return GMAIL_NEW_USER;
            case 2:
                return GMAIL_OAUTH_CLIENT;
            case 3:
                return EXCHANGE_CLIENT;
            case 4:
                return LARK_SERVER_UNBIND;
            case 5:
                return SERVICE_ACCOUNT_CLIENT;
            case 6:
                return EXCHANGE_NEW_USER;
            case 7:
                return GMAIL_API_CLIENT;
            case 8:
                return EXCHANGE_API_CLIENT;
            case 9:
                return NO_PRIMARY_ADDRESS_USER;
            default:
                return null;
        }
    }

    private UserType(int i) {
        this.value = i;
    }
}
