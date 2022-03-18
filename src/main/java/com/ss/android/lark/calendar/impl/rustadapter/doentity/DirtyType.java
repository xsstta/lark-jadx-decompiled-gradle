package com.ss.android.lark.calendar.impl.rustadapter.doentity;

public enum DirtyType {
    NONE_DIRTY_TYPE(0),
    UPDATED(1),
    DELETED(2);
    
    private int value;

    public int getNumber() {
        return this.value;
    }

    public static DirtyType valueOf(int i) {
        return forNumber(i);
    }

    public static DirtyType forNumber(int i) {
        if (i == 0) {
            return NONE_DIRTY_TYPE;
        }
        if (i == 1) {
            return UPDATED;
        }
        if (i != 2) {
            return null;
        }
        return DELETED;
    }

    private DirtyType(int i) {
        this.value = i;
    }
}
