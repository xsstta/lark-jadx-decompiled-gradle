package com.ss.android.vc.entity;

import java.io.Serializable;

public class ActionTime implements Serializable {
    private static final long serialVersionUID = 1;
    private long acceptTime;
    private long inviteTime;
    private long pushTime;

    public long getAcceptTime() {
        return this.acceptTime;
    }

    public long getInviteTime() {
        return this.inviteTime;
    }

    public long getPushTime() {
        return this.pushTime;
    }

    public String toString() {
        return "ActionTime{inviteTime=" + this.inviteTime + ", acceptTime=" + this.acceptTime + ", pushTime=" + this.pushTime + '}';
    }

    public void setAcceptTime(long j) {
        this.acceptTime = j;
    }

    public void setInviteTime(long j) {
        this.inviteTime = j;
    }

    public void setPushTime(long j) {
        this.pushTime = j;
    }
}
