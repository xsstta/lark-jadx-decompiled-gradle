package com.bytedance.ee.bear.document.device;

import com.bytedance.ee.util.io.NonProguard;

public class DeviceInfo implements NonProguard {
    private boolean androidPad;
    private String brand;
    private String deviceId;
    private String model;

    public DeviceInfo() {
    }

    public boolean getAndroidPad() {
        return this.androidPad;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public String getModel() {
        return this.model;
    }

    public String toString() {
        return "DeviceInfo{brand='" + this.brand + '\'' + ", model='" + this.model + '\'' + ", deviceId='" + this.deviceId + '\'' + '}';
    }

    public void setAndroidPad(boolean z) {
        this.androidPad = z;
    }

    public void setBrand(String str) {
        this.brand = str;
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public void setModel(String str) {
        this.model = str;
    }

    public DeviceInfo(String str, String str2, String str3, boolean z) {
        this.brand = str;
        this.model = str2;
        this.deviceId = str3;
        this.androidPad = z;
    }
}
