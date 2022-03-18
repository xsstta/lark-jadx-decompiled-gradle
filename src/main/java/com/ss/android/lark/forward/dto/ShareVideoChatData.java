package com.ss.android.lark.forward.dto;

import com.ss.android.lark.utils.C57782ag;
import java.io.Serializable;

public class ShareVideoChatData implements Serializable {
    private String meetingId;

    public String getMeetingId() {
        return this.meetingId;
    }

    public boolean isEmpty() {
        return C57782ag.m224241a(this.meetingId);
    }

    public void setMeetingId(String str) {
        this.meetingId = str;
    }
}
