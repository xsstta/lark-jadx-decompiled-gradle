package com.ss.android.lark.stepcount.dto;

import java.io.Serializable;

public class DayStepInfo implements Serializable {
    private long currentTime;
    private int errCount;
    private int firstDayCount;
    private long firstDayTime;
    private int lastSensorCount;
    private int stepCount;

    public long getCurrentTime() {
        return this.currentTime;
    }

    public int getErrCount() {
        return this.errCount;
    }

    public int getFirstDayCount() {
        return this.firstDayCount;
    }

    public long getFirstDayTime() {
        return this.firstDayTime;
    }

    public int getLastSensorCount() {
        return this.lastSensorCount;
    }

    public int getStepCount() {
        return this.stepCount;
    }

    public void setCurrentTime(long j) {
        this.currentTime = j;
    }

    public void setErrCount(int i) {
        this.errCount = i;
    }

    public void setFirstDayCount(int i) {
        this.firstDayCount = i;
    }

    public void setFirstDayTime(long j) {
        this.firstDayTime = j;
    }

    public void setLastSensorCount(int i) {
        this.lastSensorCount = i;
    }

    public void setStepCount(int i) {
        this.stepCount = i;
    }
}
