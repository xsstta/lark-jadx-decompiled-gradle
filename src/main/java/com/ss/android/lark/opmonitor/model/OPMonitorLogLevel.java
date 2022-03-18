package com.ss.android.lark.opmonitor.model;

public enum OPMonitorLogLevel {
    UNKNOWN(0),
    DEBUG(1),
    INFO(2),
    WARN(3),
    ERROR(4),
    FATAL(5);
    
    private final int value;

    public final int getNumber() {
        return this.value;
    }

    public static OPMonitorLogLevel forNumber(int i) {
        if (i == 1) {
            return DEBUG;
        }
        if (i == 2) {
            return INFO;
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

    private OPMonitorLogLevel(int i) {
        this.value = i;
    }
}
