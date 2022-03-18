package com.ss.video.rtc.engine.device;

public enum DeviceState {
    INIT(0),
    START(1),
    STOP(2),
    REMOVE(3);
    
    int type;

    public int getId() {
        return this.type;
    }

    public static DeviceState fromId(int i) {
        DeviceState[] values = values();
        for (DeviceState deviceState : values) {
            if (deviceState.getId() == i) {
                return deviceState;
            }
        }
        return null;
    }

    private DeviceState(int i) {
        this.type = i;
    }
}
