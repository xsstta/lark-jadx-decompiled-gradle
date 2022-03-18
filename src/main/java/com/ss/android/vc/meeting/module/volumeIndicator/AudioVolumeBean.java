package com.ss.android.vc.meeting.module.volumeIndicator;

import java.io.Serializable;

public class AudioVolumeBean implements Serializable {
    private int interval;
    private int level;

    public int getInterval() {
        return this.interval;
    }

    public int getLevel() {
        return this.level;
    }

    public void setInterval(int i) {
        this.interval = i;
    }

    public void setLevel(int i) {
        this.level = i;
    }
}
