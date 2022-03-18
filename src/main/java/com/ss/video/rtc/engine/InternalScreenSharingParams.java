package com.ss.video.rtc.engine;

import com.ss.video.rtc.engine.video.ScreenSharingParameters;

public class InternalScreenSharingParams {
    public int bitrate = -1;
    public int frameRate = 15;
    public int maxHeight;
    public int maxWidth;

    public int getBitrate() {
        return this.bitrate;
    }

    public int getFrameRate() {
        return this.frameRate;
    }

    public int getHeight() {
        return this.maxHeight;
    }

    public int getWidth() {
        return this.maxWidth;
    }

    public InternalScreenSharingParams(ScreenSharingParameters screenSharingParameters) {
        if (screenSharingParameters != null) {
            this.maxHeight = screenSharingParameters.maxHeight;
            this.maxWidth = screenSharingParameters.maxWidth;
            this.frameRate = screenSharingParameters.frameRate;
            this.bitrate = screenSharingParameters.bitrate;
        }
    }

    public InternalScreenSharingParams(int i, int i2, int i3, int i4) {
        this.maxHeight = i2;
        this.maxWidth = i;
        this.frameRate = i3;
        this.bitrate = i4;
    }
}
