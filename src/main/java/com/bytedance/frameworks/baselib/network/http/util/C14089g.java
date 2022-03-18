package com.bytedance.frameworks.baselib.network.http.util;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.frameworks.baselib.network.http.util.g */
public class C14089g {

    /* renamed from: a */
    private static AtomicInteger f37029a = new AtomicInteger(0);

    /* renamed from: b */
    private static String f37030b = null;

    /* renamed from: a */
    public static int m57044a() {
        return f37029a.get();
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0069 A[SYNTHETIC, Splitter:B:20:0x0069] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m57047b() {
        /*
        // Method dump skipped, instructions count: 109
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.util.C14089g.m57047b():java.lang.String");
    }

    /* renamed from: a */
    public static void m57045a(int i) {
        f37029a.set(i);
    }

    /* renamed from: a */
    public static boolean m57046a(Context context) {
        String e = m57051e(context);
        if (e == null) {
            return false;
        }
        if (e.endsWith(":push") || e.endsWith(":pushservice")) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m57049c(Context context) {
        String e = m57051e(context);
        if ((e == null || !e.contains(":")) && e != null && e.equals(context.getPackageName())) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m57050d(Context context) {
        String e = m57051e(context);
        if (e == null || !e.contains(":miniapp")) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m57048b(Context context) {
        if (Logger.debug()) {
            Logger.m15167d("ProcessUtils", "TTNet ProcessFlag: " + f37029a);
        }
        int a = m57044a();
        if (a == 1) {
            return true;
        }
        if (a != 2) {
            return m57049c(context);
        }
        return false;
    }

    /* renamed from: e */
    public static String m57051e(Context context) {
        String str = f37030b;
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
                    f37030b = str2;
                    return str2;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        String b = m57047b();
        f37030b = b;
        return b;
    }
}
