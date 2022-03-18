package com.ss.video.rtc.engine.device;

import java.util.HashMap;
import java.util.Map;

public enum DeviceError {
    DEVICE_NO_ERROR(0),
    NO_VIDEO_DEVICE(1),
    NO_AUDIO_DEVICE(2),
    AUDIO_DEVICE_REMOVED(3),
    VIDEO_DEVICE_REMOVED(4),
    AUDIO_PARAM_NOSUPPORT(5),
    VIDEO_DEVICE_PERMISSION(6),
    AUDIO_DEVICE_PERMISSION(7),
    VIDEO_DEVICE_OCCUPIED(8),
    AUDIO_DEVICE_OCCUPIED(9),
    VIDEO_DEVICE_UNKNOWN_ERROR(10),
    AUDIO_DEVICE_UNKNOWN_ERROR(11),
    DEVICE_UNKNOWN(1000000);
    
    static Map<Integer, DeviceError> hash = new HashMap();
    int errorCode;

    public int getId() {
        return this.errorCode;
    }

    public static DeviceError get(int i) {
        if (hash.size() == 0) {
            DeviceError[] values = values();
            for (DeviceError deviceError : values) {
                hash.put(Integer.valueOf(deviceError.errorCode), deviceError);
            }
        }
        if (hash.containsKey(Integer.valueOf(i))) {
            return hash.get(Integer.valueOf(i));
        }
        return DEVICE_UNKNOWN;
    }

    private DeviceError(int i) {
        this.errorCode = i;
    }
}
