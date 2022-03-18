package com.ss.android.lark.calendar.impl.rustadapter.doentity;

public enum EventOperationType {
    OP_CREATE_EVENT(1),
    OP_EDIT_EVENT(2),
    OP_DELETE_EVENT(3);
    
    private int value;

    public int getNumber() {
        return this.value;
    }

    public static EventOperationType valueOf(int i) {
        return forNumber(i);
    }

    public static EventOperationType forNumber(int i) {
        if (i == 1) {
            return OP_CREATE_EVENT;
        }
        if (i == 2) {
            return OP_EDIT_EVENT;
        }
        if (i != 3) {
            return null;
        }
        return OP_DELETE_EVENT;
    }

    private EventOperationType(int i) {
        this.value = i;
    }
}
