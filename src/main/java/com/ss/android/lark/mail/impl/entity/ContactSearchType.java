package com.ss.android.lark.mail.impl.entity;

public enum ContactSearchType {
    UNKNOWN(0, "unknown"),
    CHATTER(1, "inner_contact"),
    GROUP(2, "chat_group"),
    EXTERNAL_CONTACT(3, "outer_mail_address"),
    NAME_CARD(4, "mail_contact"),
    SHARED_MAILBOX(5, "public_mail_address"),
    ENTERPRISE_MAIL_GROUP(250, "mail_group"),
    NONE_TYPE(301, "none_type_contact");
    
    private final String label;
    private final int value;

    public String getLabel() {
        return this.label;
    }

    public int getValue() {
        return this.value;
    }

    public static AddressType convertToAddressType(int i) {
        if (i == 0) {
            return AddressType.UNKNOWN;
        }
        if (i == 1) {
            return AddressType.USER;
        }
        if (i == 2) {
            return AddressType.GROUP;
        }
        if (i == 3) {
            return AddressType.USER;
        }
        if (i == 4) {
            return AddressType.USER;
        }
        if (i == 5) {
            return AddressType.SHARED_MAILBOX;
        }
        if (i == 250) {
            return AddressType.ENTERPRISE_MAIL_GROUP;
        }
        if (i != 301) {
            return null;
        }
        return AddressType.UNKNOWN;
    }

    public static ContactSearchType fromValue(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return CHATTER;
        }
        if (i == 2) {
            return GROUP;
        }
        if (i == 3) {
            return EXTERNAL_CONTACT;
        }
        if (i == 4) {
            return NAME_CARD;
        }
        if (i == 5) {
            return SHARED_MAILBOX;
        }
        if (i == 250) {
            return ENTERPRISE_MAIL_GROUP;
        }
        if (i != 301) {
            return null;
        }
        return NONE_TYPE;
    }

    private ContactSearchType(int i, String str) {
        this.value = i;
        this.label = str;
    }
}
