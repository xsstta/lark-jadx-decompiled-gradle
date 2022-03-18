package com.bytedance.common.jato.util;

import java.io.File;

public class DeviceInfoUtils {
    private static final String VENDOR_VERSION = System.getProperty("java.vm.version", "");
    private static int sIsEmulator = -1;
    private static int sIsEmulatorTrans2Arm = -1;

    public static boolean isART() {
        try {
            String str = VENDOR_VERSION;
            if (str == null || str.length() < 1 || Integer.parseInt(String.valueOf(str.charAt(0))) >= 2) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    public static synchronized boolean isEmulator() {
        synchronized (DeviceInfoUtils.class) {
            int i = sIsEmulator;
            boolean z = true;
            if (i != -1) {
                if (i <= 0) {
                    z = false;
                }
                return z;
            }
            try {
                if (getSystemProperty("ro.kernel.qemu").equals("1")) {
                    sIsEmulator = 1;
                } else {
                    sIsEmulator = 0;
                }
            } catch (Throwable unused) {
                sIsEmulator = 0;
            }
            if (sIsEmulator <= 0) {
                z = false;
            }
            return z;
        }
    }

    public static synchronized boolean isEmulatorTrans2Arm() {
        synchronized (DeviceInfoUtils.class) {
            int i = sIsEmulatorTrans2Arm;
            boolean z = true;
            if (i != -1) {
                if (i <= 0) {
                    z = false;
                }
                return z;
            } else if (!isEmulator()) {
                sIsEmulatorTrans2Arm = 0;
                return false;
            } else {
                if (new File("/system/lib/arm/nb/libc.so").exists()) {
                    sIsEmulatorTrans2Arm = 1;
                } else {
                    sIsEmulatorTrans2Arm = 0;
                }
                if (sIsEmulatorTrans2Arm <= 0) {
                    z = false;
                }
                return z;
            }
        }
    }

    public static synchronized String getSystemProperty(String str) throws Exception {
        String str2;
        synchronized (DeviceInfoUtils.class) {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            str2 = (String) cls.getDeclaredMethod("get", String.class).invoke(cls, str);
        }
        return str2;
    }
}
