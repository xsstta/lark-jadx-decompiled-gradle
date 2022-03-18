package com.ss.android.vc.meeting.module.busyring;

public class MeetingNullException extends Exception {
    public MeetingNullException(String str) {
        super(str);
    }

    public MeetingNullException(String str, Exception exc) {
        super(str, exc);
    }
}
