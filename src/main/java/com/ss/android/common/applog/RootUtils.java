package com.ss.android.common.applog;

import android.os.Build;
import java.io.File;

public class RootUtils {
    public static boolean checkRootMethod1() {
        String str = Build.TAGS;
        return str != null && str.contains("test-keys");
    }

    public static boolean checkRootMethod2() {
        try {
            return new File("/system/bin/su").exists() || new File("/system/xbin/su").exists();
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean checkRootMethod3() {
        try {
            return new File("/system/app/Superuser.apk").exists();
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isDeviceRooted() {
        return checkRootMethod1() || checkRootMethod2() || checkRootMethod3();
    }
}
