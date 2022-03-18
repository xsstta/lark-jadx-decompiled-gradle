package com.lynx.tasm.behavior.ui.background;

public enum BackgroundRepeat {
    REPEAT,
    NO_REPEAT,
    REPEAT_X,
    REPEAT_Y,
    ROUND,
    SPACE;

    public static BackgroundRepeat valueOf(int i) {
        if (i == 0) {
            return REPEAT;
        }
        if (i == 1) {
            return NO_REPEAT;
        }
        if (i == 2) {
            return REPEAT_X;
        }
        if (i == 3) {
            return REPEAT_Y;
        }
        if (i == 4) {
            return ROUND;
        }
        if (i != 5) {
            return REPEAT;
        }
        return SPACE;
    }
}
