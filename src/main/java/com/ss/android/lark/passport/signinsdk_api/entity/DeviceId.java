package com.ss.android.lark.passport.signinsdk_api.entity;

import java.io.Serializable;

public class DeviceId implements Serializable {
    private String deviceId;

    public String getDeviceId() {
        return this.deviceId;
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public DeviceId(String str) {
        this.deviceId = str;
    }
}
