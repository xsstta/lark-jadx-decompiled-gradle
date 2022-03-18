package com.ss.video.rtc.engine.video;

public class ScreenSharingParameters {
    public int bitrate = -1;
    public int frameRate = 15;
    public int maxHeight;
    public int maxWidth;

    public ScreenSharingParameters() {
    }

    public ScreenSharingParameters(int i, int i2, int i3, int i4) {
        this.maxHeight = i2;
        this.maxWidth = i;
        this.frameRate = i3;
        this.bitrate = i4;
    }
}
