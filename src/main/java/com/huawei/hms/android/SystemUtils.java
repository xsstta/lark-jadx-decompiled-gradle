package com.huawei.hms.android;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.support.log.HMSLog;
import java.util.Locale;

public class SystemUtils {
    /* renamed from: a */
    public static String m85030a() {
        return getSystemProperties("ro.product.locale", "");
    }

    /* renamed from: b */
    public static String m85031b() {
        return getSystemProperties("ro.product.locale.region", "");
    }

    public static String getLocalCountry() {
        Locale locale = Locale.getDefault();
        if (locale != null) {
            return locale.getCountry();
        }
        return "";
    }

    public static boolean isTVDevice() {
        return getSystemProperties("ro.build.characteristics", "default").equalsIgnoreCase("tv");
    }

    public static boolean isEMUI() {
        HMSLog.m86966i("SystemUtils", "is Emui :" + HwBuildEx.VERSION.EMUI_SDK_INT);
        if (HwBuildEx.VERSION.EMUI_SDK_INT > 0) {
            return true;
        }
        return false;
    }

    public static boolean isChinaROM() {
        String b = m85031b();
        if (!TextUtils.isEmpty(b)) {
            return "cn".equalsIgnoreCase(b);
        }
        String a = m85030a();
        if (!TextUtils.isEmpty(a)) {
            return a.toLowerCase(Locale.US).contains("cn");
        }
        String localCountry = getLocalCountry();
        if (!TextUtils.isEmpty(localCountry)) {
            return "cn".equalsIgnoreCase(localCountry);
        }
        return false;
    }

    public static String getNetType(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isAvailable()) {
            return "";
        }
        return activeNetworkInfo.getTypeName();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0026, code lost:
        com.huawei.hms.support.log.HMSLog.m86964e("SystemUtils", "An exception occurred while reading: getSystemProperties:" + r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003c, code lost:
        return r8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:5:? A[ExcHandler: ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:1:0x0009] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getSystemProperties(java.lang.String r7, java.lang.String r8) {
        /*
            java.lang.String r0 = "android.os.SystemProperties"
            java.lang.Class r0 = java.lang.Class.forName(r0)
            java.lang.String r1 = "get"
            r2 = 2
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x0026, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x0026, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x0026, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x0026, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x0026 }
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r5 = 0
            r3[r5] = r4     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x0026, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x0026, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x0026, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x0026, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x0026 }
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r6 = 1
            r3[r6] = r4     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x0026, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x0026, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x0026, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x0026, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x0026 }
            java.lang.reflect.Method r1 = r0.getDeclaredMethod(r1, r3)     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x0026, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x0026, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x0026, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x0026, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x0026 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x0026, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x0026, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x0026, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x0026, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x0026 }
            r2[r5] = r7     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x0026, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x0026, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x0026, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x0026, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x0026 }
            r2[r6] = r8     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x0026, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x0026, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x0026, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x0026, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x0026 }
            java.lang.Object r0 = r1.invoke(r0, r2)     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x0026, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x0026, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x0026, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x0026, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x0026 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x0026, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x0026, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x0026, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x0026, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x0026 }
            return r0
        L_0x0026:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "An exception occurred while reading: getSystemProperties:"
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.String r0 = "SystemUtils"
            com.huawei.hms.support.log.HMSLog.m86964e(r0, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.android.SystemUtils.getSystemProperties(java.lang.String, java.lang.String):java.lang.String");
    }

    public static boolean isSystemApp(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 16384);
        } catch (PackageManager.NameNotFoundException e) {
            HMSLog.m86964e("SystemUtils", "isSystemApp Exception: " + e);
            packageInfo = null;
        }
        if (packageInfo == null || (packageInfo.applicationInfo.flags & 1) <= 0) {
            return false;
        }
        return true;
    }
}
