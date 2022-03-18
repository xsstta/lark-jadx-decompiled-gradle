package com.ss.android.lark.calendar.impl.features.events.edit.data;

public enum UpdateTimeType {
    UPDATE_TIME_BY_EVENT(1),
    UPDATE_TIME_BY_DIFF(2);
    
    private int value;

    public int getNumber() {
        return this.value;
    }

    public static UpdateTimeType valueOf(int i) {
        return forNumber(i);
    }

    public static UpdateTimeType forNumber(int i) {
        if (i == 1) {
            return UPDATE_TIME_BY_EVENT;
        }
        if (i != 2) {
            return UPDATE_TIME_BY_EVENT;
        }
        return UPDATE_TIME_BY_DIFF;
    }

    private UpdateTimeType(int i) {
        this.value = i;
    }
}
