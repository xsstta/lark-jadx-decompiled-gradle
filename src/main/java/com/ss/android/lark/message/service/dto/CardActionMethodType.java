package com.ss.android.lark.message.service.dto;

public enum CardActionMethodType {
    UNKNOWN(-1),
    GET(1),
    POST(2),
    LARK_COMMAND(3),
    OPEN_URL(4);
    
    private int value;

    public int getNumber() {
        return this.value;
    }

    public static CardActionMethodType valueOf(int i) {
        return forNumber(i);
    }

    public static CardActionMethodType forNumber(int i) {
        if (i == 1) {
            return GET;
        }
        if (i == 2) {
            return POST;
        }
        if (i == 3) {
            return LARK_COMMAND;
        }
        if (i != 4) {
            return UNKNOWN;
        }
        return OPEN_URL;
    }

    private CardActionMethodType(int i) {
        this.value = i;
    }
}
