package com.facebook.yoga;

public enum YogaDirection {
    INHERIT(0),
    LTR(1),
    RTL(2);
    
    private final int mIntValue;

    public int intValue() {
        return this.mIntValue;
    }

    public static YogaDirection fromInt(int i) {
        if (i == 0) {
            return INHERIT;
        }
        if (i == 1) {
            return LTR;
        }
        if (i == 2) {
            return RTL;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i);
    }

    private YogaDirection(int i) {
        this.mIntValue = i;
    }
}
