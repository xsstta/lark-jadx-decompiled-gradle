package com.ss.ttvideoengine.selector.shift;

import android.util.Pair;
import java.util.Set;

public interface IGearConfig {
    Pair<Double, Double> getBitrateInterval();

    double getDefaultBitrate();

    String getDefaultGearName();

    Set<String> getGearGroup();
}
