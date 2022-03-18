package com.ss.android.vc.entity.background;

public enum PushVirtualBackgroundType {
    All(0),
    Add(1),
    Update(2),
    Delete(3),
    HasSyncFailer(4);
    
    private int value;

    public int getNumber() {
        return this.value;
    }

    public static PushVirtualBackgroundType valueOf(int i) {
        return forNumber(i);
    }

    public static PushVirtualBackgroundType forNumber(int i) {
        if (i == 0) {
            return All;
        }
        if (i == 1) {
            return Add;
        }
        if (i == 2) {
            return Update;
        }
        if (i == 3) {
            return Delete;
        }
        if (i != 4) {
            return null;
        }
        return HasSyncFailer;
    }

    private PushVirtualBackgroundType(int i) {
        this.value = i;
    }
}
