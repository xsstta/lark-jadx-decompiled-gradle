package com.ss.ttvideoengine.selector.shift;

import java.util.List;

public interface SpeedShiftConfig {
    IAutoBitrateSet getIAutoBitrateSet();

    List<? extends IBandwidthSet> getIBandwidthSets();

    IGearConfig getIGearConfig();

    List<? extends IGearSet> getIGearSets();
}
