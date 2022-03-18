package com.ss.ttvideoengine.utils;

import android.os.Build;

public class DeviceUtil {
    public static String sBoard;
    public static String sHardware;

    public static String getDeviceBoard() {
        try {
            if (sBoard == null) {
                sBoard = Build.BOARD;
            }
        } catch (Throwable unused) {
            sBoard = null;
        }
        return sBoard;
    }

    public static String getDeviceHardware() {
        try {
            if (sHardware == null) {
                sHardware = Build.HARDWARE;
            }
        } catch (Throwable unused) {
            sHardware = null;
        }
        return sHardware;
    }
}
