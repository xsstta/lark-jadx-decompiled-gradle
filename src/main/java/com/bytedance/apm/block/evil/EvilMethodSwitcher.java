package com.bytedance.apm.block.evil;

public class EvilMethodSwitcher {
    public static long getEvilThresholdMs() {
        return 1000;
    }

    public static long getLaunchEvilThresholdMs() {
        return 100;
    }

    public static boolean isLaunchLimitEvilMethodDepth() {
        return false;
    }

    public static boolean isLimitEvilMethodDepth() {
        return false;
    }

    public static boolean isMessageKeyEnable() {
        return false;
    }

    public static boolean isOpenLaunchEvilMethod() {
        return false;
    }
}
