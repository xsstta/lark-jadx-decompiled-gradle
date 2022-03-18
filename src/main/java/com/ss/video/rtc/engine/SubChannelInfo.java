package com.ss.video.rtc.engine;

public class SubChannelInfo {
    private String channelName;
    private double volumeScale;

    public String getChannelName() {
        return this.channelName;
    }

    public double getVolumeScale() {
        return this.volumeScale;
    }

    public SubChannelInfo(String str, double d) {
        this.channelName = str;
        this.volumeScale = d;
    }
}
