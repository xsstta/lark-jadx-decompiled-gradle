package com.ss.ttvideoengine.preload;

public class PreloadTaskConfig {
    public int count = 1;
    public int offset;
    public int progress = 100;
    public int size;

    public PreloadTaskConfig(int i, int i2) {
        this.count = i;
        this.size = i2;
    }
}
