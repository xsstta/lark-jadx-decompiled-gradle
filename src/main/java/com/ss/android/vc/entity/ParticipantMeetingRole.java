package com.ss.android.vc.entity;

public enum ParticipantMeetingRole {
    PARTICIPANT(0),
    HOST(1),
    CO_HOST(2);
    
    private int value;

    public int getNumber() {
        return this.value;
    }

    public static ParticipantMeetingRole valueOf(int i) {
        return forNumber(i);
    }

    public static ParticipantMeetingRole forNumber(int i) {
        if (i == 0) {
            return PARTICIPANT;
        }
        if (i == 1) {
            return HOST;
        }
        if (i != 2) {
            return null;
        }
        return CO_HOST;
    }

    private ParticipantMeetingRole(int i) {
        this.value = i;
    }
}
