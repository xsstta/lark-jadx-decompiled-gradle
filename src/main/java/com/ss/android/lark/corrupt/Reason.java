package com.ss.android.lark.corrupt;

import com.bytedance.lark.pb.basic.v1.PushDataCorruptResponse;

public enum Reason {
    DATABASE_CORRUPT(1);
    
    private int mValue;

    public int getValue() {
        return this.mValue;
    }

    public boolean isDbCorrupt() {
        if (this.mValue == 1) {
            return true;
        }
        return false;
    }

    public static Reason fromValue(int i) {
        if (i != 1) {
            return null;
        }
        return DATABASE_CORRUPT;
    }

    public static Reason valueOf(int i) {
        return fromValue(i);
    }

    public static Reason convert(PushDataCorruptResponse.Reason reason) {
        if (reason == null) {
            return null;
        }
        return fromValue(reason.getValue());
    }

    private Reason(int i) {
        this.mValue = i;
    }
}
