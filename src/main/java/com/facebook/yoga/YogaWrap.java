package com.facebook.yoga;

public enum YogaWrap {
    NO_WRAP(0),
    WRAP(1),
    WRAP_REVERSE(2);
    
    private final int mIntValue;

    public int intValue() {
        return this.mIntValue;
    }

    public static YogaWrap fromInt(int i) {
        if (i == 0) {
            return NO_WRAP;
        }
        if (i == 1) {
            return WRAP;
        }
        if (i == 2) {
            return WRAP_REVERSE;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i);
    }

    private YogaWrap(int i) {
        this.mIntValue = i;
    }
}
