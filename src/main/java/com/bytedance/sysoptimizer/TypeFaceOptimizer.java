package com.bytedance.sysoptimizer;

public class TypeFaceOptimizer {
    private static boolean mSwitch;

    public static void start() {
        mSwitch = true;
    }

    public static boolean getSwitch() {
        return mSwitch;
    }
}
