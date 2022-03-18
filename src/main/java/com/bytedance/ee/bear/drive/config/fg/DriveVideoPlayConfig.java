package com.bytedance.ee.bear.drive.config.fg;

import com.bytedance.ee.util.io.NonProguard;
import java.util.ArrayList;
import java.util.List;

public class DriveVideoPlayConfig implements NonProguard {
    private List<String> compatExts;
    private int compatType;
    private boolean enable;
    private long maxBitrate;
    private int maxFps;

    public List<String> getCompatExts() {
        return this.compatExts;
    }

    public int getCompatType() {
        return this.compatType;
    }

    public long getMaxBitrate() {
        return this.maxBitrate;
    }

    public int getMaxFps() {
        return this.maxFps;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public DriveVideoPlayConfig() {
        this.compatExts = new ArrayList();
    }

    public String toString() {
        return "DriveVideoPlayConfig{enable=" + this.enable + ", maxBitrate=" + this.maxBitrate + ", maxFps=" + this.maxFps + ", compatType=" + this.compatType + ", compatExts=" + this.compatExts + '}';
    }

    public void setCompatExts(List<String> list) {
        this.compatExts = list;
    }

    public void setCompatType(int i) {
        this.compatType = i;
    }

    public void setEnable(boolean z) {
        this.enable = z;
    }

    public void setMaxBitrate(long j) {
        this.maxBitrate = j;
    }

    public void setMaxFps(int i) {
        this.maxFps = i;
    }

    public DriveVideoPlayConfig(boolean z, long j, int i) {
        ArrayList arrayList = new ArrayList();
        this.compatExts = arrayList;
        this.enable = z;
        this.maxBitrate = j;
        this.maxFps = i;
        arrayList.add("mp4");
    }
}
