package com.ss.android.vc.entity;

public enum UserWorkStatusType {
    ON_DEFAULT(0),
    ON_BUSINESS(1),
    ON_LEAVE(2),
    ON_MEETING(3);
    
    private int value;

    public int getNumber() {
        return this.value;
    }

    public int getValue() {
        return this.value;
    }

    public static UserWorkStatusType fromValue(int i) {
        if (i == 0) {
            return ON_DEFAULT;
        }
        if (i == 1) {
            return ON_BUSINESS;
        }
        if (i == 2) {
            return ON_LEAVE;
        }
        if (i != 3) {
            return null;
        }
        return ON_MEETING;
    }

    private UserWorkStatusType(int i) {
        this.value = i;
    }
}
