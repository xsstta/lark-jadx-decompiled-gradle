package com.ss.android.vc.entity;

public enum AttendeeFromSource {
    UNKNOWN(0),
    VC_CARD_ATTENDEE(1),
    VC_PREVIEW_ATTENDEE(2),
    VC_TAB_ATTENDEE(3);
    
    private int value;

    public int getNumber() {
        return this.value;
    }

    public int getValue() {
        return this.value;
    }

    public static AttendeeFromSource fromValue(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return VC_CARD_ATTENDEE;
        }
        if (i == 2) {
            return VC_PREVIEW_ATTENDEE;
        }
        if (i != 3) {
            return UNKNOWN;
        }
        return VC_TAB_ATTENDEE;
    }

    private AttendeeFromSource(int i) {
        this.value = i;
    }
}
