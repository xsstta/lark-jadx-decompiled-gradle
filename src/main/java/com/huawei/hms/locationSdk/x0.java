package com.huawei.hms.locationSdk;

import android.app.ActivityManager;
import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.provider.Settings;
import android.text.TextUtils;
import com.huawei.hms.support.log.HMSLog;

public class x0 {
    /* renamed from: a */
    public static boolean m86127a(Context context) {
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
            if (runningAppProcessInfo.importance == 100 && runningAppProcessInfo.processName.equals(context.getApplicationInfo().processName)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m86128a(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
        }
        HMSLog.m86966i("PermissionUtil", "permission is null");
        return false;
    }

    /* renamed from: a */
    public static boolean m86129a(String str, Context context) {
        String str2;
        try {
            boolean z = true;
            if (Build.VERSION.SDK_INT >= 23) {
                Object systemService = context.getSystemService("appops");
                if (systemService instanceof AppOpsManager) {
                    return ((AppOpsManager) systemService).noteOp("android:mock_location", Process.myUid(), str) == 0;
                }
                HMSLog.m86966i("PermissionUtil", "canCallerAccessMockLocation ,no AppOpsManager ");
                return false;
            }
            if (Settings.Secure.getInt(context.getContentResolver(), "mock_location", 0) == 0) {
                z = false;
            }
            HMSLog.m86966i("PermissionUtil", "canCallerAccessMockLocation ,Build.VERSION.SDK_INT <23 ,mock is " + z);
            return z;
        } catch (SecurityException unused) {
            str2 = "canCallerAccessMockLocation ,SecurityException ";
            HMSLog.m86966i("PermissionUtil", str2);
            return false;
        } catch (Exception unused2) {
            str2 = "canCallerAccessMockLocation ,Exception ";
            HMSLog.m86966i("PermissionUtil", str2);
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m86130b(Context context) {
        if (!m86128a(context, "android.permission.ACCESS_FINE_LOCATION")) {
            return false;
        }
        if (Build.VERSION.SDK_INT <= 28) {
            return true;
        }
        return m86128a(context, "android.permission.ACCESS_BACKGROUND_LOCATION");
    }

    /* renamed from: b */
    public static boolean m86131b(Context context, String str) {
        return m86128a(context, str);
    }

    /* renamed from: c */
    public static boolean m86132c(Context context) {
        String str;
        if (!m86128a(context, "android.permission.ACCESS_FINE_LOCATION") && !m86128a(context, "android.permission.ACCESS_COARSE_LOCATION")) {
            str = "checkSelfPermission is false";
        } else if (Build.VERSION.SDK_INT <= 28 || !m86127a(context) || m86128a(context, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
            return true;
        } else {
            str = "App is in background , but BackgroundPermission is false";
        }
        HMSLog.m86966i("PermissionUtil", str);
        return false;
    }
}
