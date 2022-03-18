package com.ss.ttvideoengine.strategrycenter;

public class StrategyKeys {
    public static int mInteractionBlockDurationNonPreloaded = 800;
    public static int mInteractionBlockDurationPreloaded = 400;

    public static void setIntValue(int i, int i2) {
        if (i == 120) {
            mInteractionBlockDurationPreloaded = i2;
        } else if (i == 121) {
            mInteractionBlockDurationNonPreloaded = i2;
        }
    }
}
