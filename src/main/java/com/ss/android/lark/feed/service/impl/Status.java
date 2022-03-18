package com.ss.android.lark.feed.service.impl;

public enum Status {
    START(0),
    FINISHED(1);
    
    private int value;

    public int getNumber() {
        return this.value;
    }

    public static Status valueOf(int i) {
        return forNumber(i);
    }

    public static Status forNumber(int i) {
        if (i == 0) {
            return START;
        }
        if (i != 1) {
            return FINISHED;
        }
        return FINISHED;
    }

    private Status(int i) {
        this.value = i;
    }
}
