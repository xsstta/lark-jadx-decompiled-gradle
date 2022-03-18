package com.ss.android.vc.net.service;

public enum VideoChatUserRole {
    UNKNOWN(0),
    SINGLE_CALLER(1),
    SINGLE_CALLEE(2),
    GROUP_HOST(3),
    GROUP_PARTICIPANT(4);
    
    private int value;

    public int getNumber() {
        return this.value;
    }

    public static VideoChatUserRole valueOf(int i) {
        return forNumber(i);
    }

    public static VideoChatUserRole forNumber(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return SINGLE_CALLER;
        }
        if (i == 2) {
            return SINGLE_CALLEE;
        }
        if (i == 3) {
            return GROUP_HOST;
        }
        if (i != 4) {
            return null;
        }
        return GROUP_PARTICIPANT;
    }

    private VideoChatUserRole(int i) {
        this.value = i;
    }
}
