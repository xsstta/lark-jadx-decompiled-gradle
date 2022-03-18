package com.ss.video.rtc.engine.device;

public enum DeviceType {
    MICROPHONE(0),
    SPEAKER(1),
    CAMERA(2);
    
    int type;

    /* access modifiers changed from: package-private */
    public int getId() {
        return this.type;
    }

    public static DeviceType fromId(int i) {
        DeviceType[] values = values();
        for (DeviceType deviceType : values) {
            if (deviceType.getId() == i) {
                return deviceType;
            }
        }
        return null;
    }

    private DeviceType(int i) {
        this.type = i;
    }
}
