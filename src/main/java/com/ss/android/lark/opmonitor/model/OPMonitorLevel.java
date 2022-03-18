package com.ss.android.lark.opmonitor.model;

public enum OPMonitorLevel {
    UNKNOWN(0),
    TRACE(1),
    NORMAL(2),
    WARN(3),
    ERROR(4),
    FATAL(5);
    
    private final int value;

    public final int getNumber() {
        return this.value;
    }

    public static OPMonitorLevel forNumber(int i) {
        if (i == 1) {
            return TRACE;
        }
        if (i == 2) {
            return NORMAL;
        }
        if (i == 3) {
            return WARN;
        }
        if (i == 4) {
            return ERROR;
        }
        if (i != 5) {
            return UNKNOWN;
        }
        return FATAL;
    }

    private OPMonitorLevel(int i) {
        this.value = i;
    }
}
