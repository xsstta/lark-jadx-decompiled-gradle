package com.ss.android.vc.entity;

public enum ParticipantRole {
    UNKNOW_ROLE(0),
    INTERVIEWER(1),
    INTERVIEWEE(2);
    
    private int value;

    public int getNumber() {
        return this.value;
    }

    public static ParticipantRole valueOf(int i) {
        return forNumber(i);
    }

    public static ParticipantRole forNumber(int i) {
        if (i == 0) {
            return UNKNOW_ROLE;
        }
        if (i == 1) {
            return INTERVIEWER;
        }
        if (i != 2) {
            return null;
        }
        return INTERVIEWEE;
    }

    private ParticipantRole(int i) {
        this.value = i;
    }
}
