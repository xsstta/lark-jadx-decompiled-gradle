package com.ss.video.rtc.engine;

public class InternalSourceWantedData {
    public int frameRate;
    public int height;
    public int width;

    public String toString() {
        return "InternalSourceWantedData{width='" + this.width + '\'' + ", height='" + this.height + '\'' + ", frameRate='" + this.frameRate + '\'' + '}';
    }

    private static InternalSourceWantedData create(int i, int i2, int i3) {
        return new InternalSourceWantedData(i, i2, i3);
    }

    public InternalSourceWantedData(int i, int i2, int i3) {
        this.width = i;
        this.height = i2;
        this.frameRate = i3;
    }
}
