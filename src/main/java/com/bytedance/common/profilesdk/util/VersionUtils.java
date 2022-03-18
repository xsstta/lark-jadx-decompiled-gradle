package com.bytedance.common.profilesdk.util;

import android.os.Build;

public class VersionUtils {
    public static boolean isP() {
        if (Build.VERSION.SDK_INT == 28) {
            return true;
        }
        return false;
    }

    public static boolean isQ() {
        if (Build.VERSION.SDK_INT == 29) {
            return true;
        }
        return false;
    }

    public static boolean isR() {
        if (Build.VERSION.SDK_INT == 30) {
            return true;
        }
        return false;
    }

    public static boolean isN() {
        if (Build.VERSION.SDK_INT == 24 || Build.VERSION.SDK_INT == 25) {
            return true;
        }
        return false;
    }

    public static boolean isNOP() {
        if (isN() || isO() || isP()) {
            return true;
        }
        return false;
    }

    public static boolean isO() {
        if (Build.VERSION.SDK_INT == 26 || Build.VERSION.SDK_INT == 27) {
            return true;
        }
        return false;
    }

    public static boolean isQR() {
        if (isQ() || isR()) {
            return true;
        }
        return false;
    }
}
