package com.ss.android.lark.biz.core.api;

public enum FileState {
    NORMAL(1),
    DELETED(2),
    RECOVERABLE(3),
    UNRECOVERABLE(4);
    
    private int value;

    public int getNumber() {
        return this.value;
    }

    public static FileState valueOf(int i) {
        return forNumber(i);
    }

    public static FileState forNumber(int i) {
        if (i == 1) {
            return NORMAL;
        }
        if (i == 2) {
            return DELETED;
        }
        if (i == 3) {
            return RECOVERABLE;
        }
        if (i != 4) {
            return NORMAL;
        }
        return UNRECOVERABLE;
    }

    private FileState(int i) {
        this.value = i;
    }
}
