package com.ss.android.lark.calendar.impl.rustadapter.doentity;

import java.io.Serializable;

public class CalendarEventInstanceTime implements Serializable, Cloneable {
    private long endTime;
    private long startTime;

    public long getEndTime() {
        return this.endTime;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public void setEndTime(long j) {
        this.endTime = j;
    }

    public void setStartTime(long j) {
        this.startTime = j;
    }
}
