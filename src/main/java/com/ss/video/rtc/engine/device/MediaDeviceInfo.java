package com.ss.video.rtc.engine.device;

public class MediaDeviceInfo {
    public DeviceError error;
    public String message;
    public DeviceState state;
    public DeviceType type;

    public String toString() {
        return "[type=" + this.type + ", state=" + this.state + ", error=" + this.error + ", msg=" + this.message + "]";
    }

    public MediaDeviceInfo(DeviceType deviceType, DeviceState deviceState, DeviceError deviceError, String str) {
        this.type = deviceType;
        this.state = deviceState;
        this.error = deviceError;
        this.message = str;
    }
}
