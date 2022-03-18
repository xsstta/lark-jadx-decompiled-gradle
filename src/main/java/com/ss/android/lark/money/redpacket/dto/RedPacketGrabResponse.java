package com.ss.android.lark.money.redpacket.dto;

import java.io.Serializable;

public class RedPacketGrabResponse implements Serializable {
    private static final long serialVersionUID = -5038519747221204693L;
    private String authUrl;
    private long grabAmount;
    private boolean isRealNameAuthed;

    public String getAuthUrl() {
        return this.authUrl;
    }

    public long getGrabAmount() {
        return this.grabAmount;
    }

    public boolean isRealNameAuthed() {
        return this.isRealNameAuthed;
    }

    public RedPacketGrabResponse(long j, boolean z, String str) {
        this.grabAmount = j;
        this.isRealNameAuthed = z;
        this.authUrl = str;
    }
}
