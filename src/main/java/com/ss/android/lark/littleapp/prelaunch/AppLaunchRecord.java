package com.ss.android.lark.littleapp.prelaunch;

import java.util.List;

public class AppLaunchRecord {
    private List<Long> launchTimestamps;

    public List<Long> getLaunchTimestamps() {
        return this.launchTimestamps;
    }

    public void setLaunchTimestamps(List<Long> list) {
        this.launchTimestamps = list;
    }
}
