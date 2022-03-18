package com.ss.android.vesdk.gesture;

public class VEGesture {

    public enum EventType {
        TOUCH,
        TOUCH_DOWN,
        TOUCH_UP,
        TOUCH_LONG,
        PAN,
        SCALE,
        ROTATE,
        DB_CLICK,
        CANCELLED
    }

    public enum GestureType {
        UNKNOWN,
        TAP,
        PAN,
        ROTATE,
        SCALE,
        LONG_PRESS
    }
}
