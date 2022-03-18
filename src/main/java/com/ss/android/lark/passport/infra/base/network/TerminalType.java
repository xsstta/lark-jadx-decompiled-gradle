package com.ss.android.lark.passport.infra.base.network;

public enum TerminalType {
    UNKNOWN_TERMINAL_TYPE(0),
    PC(1),
    WEB(2),
    ANDROID(3),
    IOS(4);
    
    int value;

    public int getValue() {
        return this.value;
    }

    public void setValue(int i) {
        this.value = i;
    }

    public static TerminalType valueOf(int i) {
        if (i == 0) {
            return UNKNOWN_TERMINAL_TYPE;
        }
        if (i == 1) {
            return PC;
        }
        if (i == 2) {
            return WEB;
        }
        if (i == 3) {
            return ANDROID;
        }
        if (i != 4) {
            return UNKNOWN_TERMINAL_TYPE;
        }
        return IOS;
    }

    private TerminalType(int i) {
        this.value = i;
    }
}
