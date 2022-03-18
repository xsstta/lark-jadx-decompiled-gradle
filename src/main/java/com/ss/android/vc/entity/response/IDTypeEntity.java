package com.ss.android.vc.entity.response;

public enum IDTypeEntity {
    UNKNOWN_ID_TYPE(0),
    GROUP_ID(1),
    MEETING_ID(2),
    UNIQUE_ID(3),
    INTERVIEW_UID(4),
    RESERVATION_ID(5);
    
    private int value;

    public int getNumber() {
        return this.value;
    }

    public static IDTypeEntity fromValue(int i) {
        if (i == 0) {
            return UNKNOWN_ID_TYPE;
        }
        if (i == 1) {
            return GROUP_ID;
        }
        if (i == 2) {
            return MEETING_ID;
        }
        if (i == 3) {
            return UNIQUE_ID;
        }
        if (i == 4) {
            return INTERVIEW_UID;
        }
        if (i != 5) {
            return null;
        }
        return RESERVATION_ID;
    }

    private IDTypeEntity(int i) {
        this.value = i;
    }
}
