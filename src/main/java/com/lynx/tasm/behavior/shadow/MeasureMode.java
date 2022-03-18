package com.lynx.tasm.behavior.shadow;

import android.view.View;

public enum MeasureMode {
    UNDEFINED(0),
    EXACTLY(1),
    AT_MOST(2);
    
    private final int mIntValue;

    public int intValue() {
        return this.mIntValue;
    }

    public static MeasureMode fromInt(int i) {
        if (i == 0) {
            return UNDEFINED;
        }
        if (i == 1) {
            return EXACTLY;
        }
        if (i == 2) {
            return AT_MOST;
        }
        throw new IllegalArgumentException("Unknown measureMode");
    }

    public static int fromMeasureSpec(int i) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            return AT_MOST.intValue();
        }
        if (mode == 0) {
            return UNDEFINED.intValue();
        }
        if (mode == 1073741824) {
            return EXACTLY.intValue();
        }
        throw new IllegalArgumentException("Unknown measureSpec");
    }

    private MeasureMode(int i) {
        this.mIntValue = i;
    }
}
