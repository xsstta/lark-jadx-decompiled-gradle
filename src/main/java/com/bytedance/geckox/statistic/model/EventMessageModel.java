package com.bytedance.geckox.statistic.model;

import com.google.gson.annotations.SerializedName;

public class EventMessageModel {
    @SerializedName("duration")
    private long duration;
    @SerializedName("err_msg")
    private String errMsg;
    @SerializedName("event_type")
    private int eventType;
    @SerializedName("extra")
    private String extra;
    @SerializedName("sub_type")
    private int subType;

    public void setDuration(long j) {
        this.duration = j;
    }

    public void setErrMsg(String str) {
        this.errMsg = str;
    }

    public void setEventType(int i) {
        this.eventType = i;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setSubType(int i) {
        this.subType = i;
    }
}
