package com.ss.android.lark.searchcommon.service.entity;

public enum ChatType {
    UNKNOWN(0),
    PRIVATE(1),
    OUTER(2),
    PUBLIC_JOIN(3),
    PUBLIC_ABSENT(4),
    PUBLIC_THREAD(5),
    PRIVATE_THREAD(6),
    All_THREAD(7);
    
    private int value;

    public final int getNumber() {
        return this.value;
    }

    public static ChatType forNumber(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return PRIVATE;
            case 2:
                return OUTER;
            case 3:
                return PUBLIC_JOIN;
            case 4:
                return PUBLIC_ABSENT;
            case 5:
                return PUBLIC_THREAD;
            case 6:
                return PRIVATE_THREAD;
            case 7:
                return All_THREAD;
            default:
                return UNKNOWN;
        }
    }

    private ChatType(int i) {
        this.value = i;
    }
}
