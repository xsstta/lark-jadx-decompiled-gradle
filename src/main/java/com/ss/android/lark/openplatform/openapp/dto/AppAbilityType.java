package com.ss.android.lark.openplatform.openapp.dto;

public enum AppAbilityType {
    UNKNOWN(0),
    GADGET(1),
    H5(2),
    BOT(3);
    
    private int value;

    public int getNumber() {
        return this.value;
    }

    public static AppAbilityType forNumber(int i) {
        if (i == 1) {
            return GADGET;
        }
        if (i == 2) {
            return H5;
        }
        if (i != 3) {
            return UNKNOWN;
        }
        return BOT;
    }

    private AppAbilityType(int i) {
        this.value = i;
    }
}
