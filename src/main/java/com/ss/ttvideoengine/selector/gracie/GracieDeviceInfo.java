package com.ss.ttvideoengine.selector.gracie;

import com.bytedance.vcloud.abrmodule.IDeviceInfo;

class GracieDeviceInfo implements IDeviceInfo {
    private int mHeight;
    private int mWidth;

    public int getHDRInfo() {
        return -1;
    }

    public int getHWDecodeMaxLength() {
        return -1;
    }

    public int getScreenFps() {
        return -1;
    }

    public int getScreenHeight() {
        return this.mHeight;
    }

    public int getScreenWidth() {
        return this.mWidth;
    }

    private GracieDeviceInfo(int i, int i2) {
        this.mWidth = i;
        this.mHeight = i2;
    }
}
