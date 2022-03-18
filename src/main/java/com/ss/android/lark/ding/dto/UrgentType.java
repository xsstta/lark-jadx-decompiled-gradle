package com.ss.android.lark.ding.dto;

public enum UrgentType {
    APP(1),
    SMS(2),
    PHONE(3);
    
    private int value;

    public int getNumber() {
        return this.value;
    }

    public static UrgentType forNumber(int i) {
        if (i == 1) {
            return APP;
        }
        if (i == 2) {
            return SMS;
        }
        if (i != 3) {
            return APP;
        }
        return PHONE;
    }

    private UrgentType(int i) {
        this.value = i;
    }
}
