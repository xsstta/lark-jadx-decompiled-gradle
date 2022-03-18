package com.facebook.yoga;

public class YogaConstants {
    public static boolean isUndefined(YogaValue yogaValue) {
        if (yogaValue.unit == YogaUnit.UNDEFINED) {
            return true;
        }
        return false;
    }

    public static boolean isUndefined(float f) {
        if (Float.compare(f, 1.0E9f) >= 0 || Float.compare(f, -1.0E9f) <= 0) {
            return true;
        }
        return false;
    }
}
