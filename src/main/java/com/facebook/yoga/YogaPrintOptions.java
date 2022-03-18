package com.facebook.yoga;

public enum YogaPrintOptions {
    LAYOUT(1),
    STYLE(2),
    CHILDREN(4);
    
    private final int mIntValue;

    public int intValue() {
        return this.mIntValue;
    }

    public static YogaPrintOptions fromInt(int i) {
        if (i == 1) {
            return LAYOUT;
        }
        if (i == 2) {
            return STYLE;
        }
        if (i == 4) {
            return CHILDREN;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i);
    }

    private YogaPrintOptions(int i) {
        this.mIntValue = i;
    }
}
