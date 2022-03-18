package com.ss.android.common.p1317a;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.os.Process;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;

/* renamed from: com.ss.android.common.a.a */
public final class C28446a {

    /* renamed from: a */
    public static String f71548a = ":push";

    /* renamed from: b */
    public static boolean f71549b = false;

    /* renamed from: c */
    public static boolean f71550c = false;

    /* renamed from: d */
    private static String f71551d = null;

    /* renamed from: e */
    private static boolean f71552e = true;

    /* renamed from: a */
    public static boolean m104267a() {
        if (!f71550c) {
            try {
                if (Class.forName("miui.os.Build") != null) {
                    f71549b = true;
                    f71550c = true;
                    return true;
                }
            } catch (Exception unused) {
            }
            f71550c = true;
        }
        return f71549b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0069 A[SYNTHETIC, Splitter:B:20:0x0069] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m104269b() {
        /*
        // Method dump skipped, instructions count: 109
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.p1317a.C28446a.m104269b():java.lang.String");
    }

    /* renamed from: a */
    public static boolean m104268a(Context context) {
        String b = m104270b(context);
        if ((b == null || !b.contains(":")) && b != null && b.equals(context.getPackageName())) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static String m104270b(Context context) {
        String str = f71551d;
        if (!StringUtils.isEmpty(str)) {
            return str;
        }
        try {
            int myPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == myPid) {
                    if (Logger.debug()) {
                        Logger.m15167d("Process", "processName = " + runningAppProcessInfo.processName);
                    }
                    String str2 = runningAppProcessInfo.processName;
                    f71551d = str2;
                    return str2;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        String b = m104269b();
        f71551d = b;
        return b;
    }

    /* renamed from: a */
    public static Intent m104266a(Context context, String str) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            return launchIntentForPackage;
        }
        if (!launchIntentForPackage.hasCategory("android.intent.category.LAUNCHER")) {
            launchIntentForPackage.addCategory("android.intent.category.LAUNCHER");
            Logger.m15167d("ToolUtils", "add category LAUNCHER in launch intent");
        }
        launchIntentForPackage.setPackage(null);
        launchIntentForPackage.addFlags(2097152);
        launchIntentForPackage.addFlags(268435456);
        return launchIntentForPackage;
    }

    /* renamed from: b */
    public static String m104271b(Context context, String str) {
        if (context != null && !StringUtils.isEmpty(str)) {
            try {
                ProviderInfo[] providerInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 8).providers;
                for (ProviderInfo providerInfo : providerInfoArr) {
                    if (str.equals(providerInfo.name)) {
                        return providerInfo.authority;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
