package com.ss.android.vc.entity;

public enum ChatterMeetingStatus {
    UNKNOWN(0),
    IDLE(1),
    BUSY(2),
    INMEETING(3),
    INVITING(4);
    
    private int value;

    public int getNumber() {
        return this.value;
    }

    public static ChatterMeetingStatus valueOf(int i) {
        return forNumber(i);
    }

    public static ChatterMeetingStatus forNumber(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return IDLE;
        }
        if (i == 2) {
            return BUSY;
        }
        if (i == 3) {
            return INMEETING;
        }
        if (i != 4) {
            return null;
        }
        return INVITING;
    }

    private ChatterMeetingStatus(int i) {
        this.value = i;
    }
}
