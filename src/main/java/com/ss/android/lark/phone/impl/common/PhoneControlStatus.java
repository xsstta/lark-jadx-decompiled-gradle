package com.ss.android.lark.phone.impl.common;

public enum PhoneControlStatus {
    PERMISSION_CONTROL(-5),
    NO_PERMISSION_BY_EXECUTIVE(-4),
    ACQUIRED_IN_161TH_TIME(-3),
    REACH_UPPER_LIMIT_IN_24_HOURS(-2),
    NO_QUERY_AMOUNT(-1),
    NO_PERMISSION(0),
    CAN_CALL(1),
    ONLY_2_TIMES_LEFT(2);
    
    private int value;

    public int getNumber() {
        return this.value;
    }

    public static PhoneControlStatus valueOf(int i) {
        return forNumber(i);
    }

    public static PhoneControlStatus forNumber(int i) {
        switch (i) {
            case -5:
                return PERMISSION_CONTROL;
            case -4:
                return NO_PERMISSION_BY_EXECUTIVE;
            case -3:
                return ACQUIRED_IN_161TH_TIME;
            case -2:
                return REACH_UPPER_LIMIT_IN_24_HOURS;
            case -1:
                return NO_QUERY_AMOUNT;
            case 0:
                return NO_PERMISSION;
            case 1:
                return CAN_CALL;
            case 2:
                return ONLY_2_TIMES_LEFT;
            default:
                return CAN_CALL;
        }
    }

    private PhoneControlStatus(int i) {
        this.value = i;
    }
}
