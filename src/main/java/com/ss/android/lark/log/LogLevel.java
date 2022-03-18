package com.ss.android.lark.log;

public enum LogLevel {
    VERBOSE(2),
    DEBUG(3),
    INFO(4),
    WARN(5),
    ERROR(6),
    ASSERT(7);
    
    private int value;

    public int getNumber() {
        return this.value;
    }

    public static LogLevel valueOf(int i) {
        return forNumber(i);
    }

    public static LogLevel forNumber(int i) {
        switch (i) {
            case 2:
                return VERBOSE;
            case 3:
                return DEBUG;
            case 4:
                return INFO;
            case 5:
                return WARN;
            case 6:
                return ERROR;
            case 7:
                return ASSERT;
            default:
                return VERBOSE;
        }
    }

    private LogLevel(int i) {
        this.value = i;
    }
}
