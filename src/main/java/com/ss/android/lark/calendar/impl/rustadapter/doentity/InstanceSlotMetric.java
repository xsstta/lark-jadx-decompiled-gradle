package com.ss.android.lark.calendar.impl.rustadapter.doentity;

import java.io.Serializable;

public class InstanceSlotMetric implements Serializable {
    private int mEndDay;
    private int mEndMinute;
    private long mEndTime;
    private String mId;
    private int mStartDay;
    private int mStartMinute;
    private long mStartTime;

    public int getEndDay() {
        return this.mEndDay;
    }

    public int getEndMinute() {
        return this.mEndMinute;
    }

    public long getEndTime() {
        return this.mEndTime;
    }

    public String getId() {
        return this.mId;
    }

    public int getStartDay() {
        return this.mStartDay;
    }

    public int getStartMinute() {
        return this.mStartMinute;
    }

    public long getStartTime() {
        return this.mStartTime;
    }

    public InstanceSlotMetric setEndDay(int i) {
        this.mEndDay = i;
        return this;
    }

    public InstanceSlotMetric setEndMinute(int i) {
        this.mEndMinute = i;
        return this;
    }

    public InstanceSlotMetric setEndTime(long j) {
        this.mEndTime = j;
        return this;
    }

    public InstanceSlotMetric setId(String str) {
        this.mId = str;
        return this;
    }

    public InstanceSlotMetric setStartDay(int i) {
        this.mStartDay = i;
        return this;
    }

    public InstanceSlotMetric setStartMinute(int i) {
        this.mStartMinute = i;
        return this;
    }

    public InstanceSlotMetric setStartTime(long j) {
        this.mStartTime = j;
        return this;
    }
}
