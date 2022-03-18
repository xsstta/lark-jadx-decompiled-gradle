package com.ss.android.lark.live.apm.p2134a;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Debug;
import android.os.PowerManager;
import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import com.bytedance.monitor.util.C20172c;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.lark.mm.p2288b.C45855f;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import me.ele.lancet.base.annotations.Skip;

/* renamed from: com.ss.android.lark.live.apm.a.a */
public class C41500a {

    /* renamed from: a */
    private static int f105488a = 0;

    /* renamed from: b */
    private static long f105489b = -1;

    /* renamed from: c */
    private static int f105490c = 0;

    /* renamed from: d */
    private static long f105491d = -1;

    /* renamed from: b */
    public static long m164667b() {
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/stat")), 1000);
            try {
                String readLine = bufferedReader2.readLine();
                bufferedReader2.close();
                String[] split = readLine.split(" ");
                long parseLong = Long.parseLong(split[2]) + Long.parseLong(split[3]) + Long.parseLong(split[4]) + Long.parseLong(split[6]) + Long.parseLong(split[5]) + Long.parseLong(split[7]) + Long.parseLong(split[8]);
                C20172c.m73614a(bufferedReader2);
                return parseLong;
            } catch (Throwable unused) {
                bufferedReader = bufferedReader2;
                C20172c.m73614a(bufferedReader);
                return -1;
            }
        } catch (Throwable unused2) {
            C20172c.m73614a(bufferedReader);
            return -1;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x006a A[Catch:{ all -> 0x0066, all -> 0x0061 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0063 A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m164670c() {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.live.apm.p2134a.C41500a.m164670c():long");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0037 A[Catch:{ all -> 0x0030, all -> 0x003b }] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized int m164672d() {
        /*
            java.lang.Class<com.ss.android.lark.live.apm.a.a> r0 = com.ss.android.lark.live.apm.p2134a.C41500a.class
            monitor-enter(r0)
            int r1 = com.ss.android.lark.live.apm.p2134a.C41500a.f105488a     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)
            return r1
        L_0x0009:
            r1 = 0
            r2 = 0
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ all -> 0x0032 }
            java.io.FileReader r4 = new java.io.FileReader     // Catch:{ all -> 0x0032 }
            java.lang.String r5 = "/proc/cpuinfo"
            r4.<init>(r5)     // Catch:{ all -> 0x0032 }
            r5 = 50
            r3.<init>(r4, r5)     // Catch:{ all -> 0x0032 }
        L_0x0019:
            java.lang.String r1 = r3.readLine()     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x002a
            java.lang.String r4 = "processor"
            boolean r1 = r1.startsWith(r4)     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x0019
            int r2 = r2 + 1
            goto L_0x0019
        L_0x002a:
            r3.close()     // Catch:{ all -> 0x003b }
            com.ss.android.lark.live.apm.p2134a.C41500a.f105488a = r2     // Catch:{ all -> 0x003b }
            goto L_0x003b
        L_0x0030:
            r1 = move-exception
            goto L_0x0035
        L_0x0032:
            r2 = move-exception
            r3 = r1
            r1 = r2
        L_0x0035:
            if (r3 == 0) goto L_0x003a
            r3.close()     // Catch:{ all -> 0x003b }
        L_0x003a:
            throw r1     // Catch:{ all -> 0x003b }
        L_0x003b:
            int r1 = com.ss.android.lark.live.apm.p2134a.C41500a.f105488a
            monitor-exit(r0)
            return r1
        L_0x003f:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.live.apm.p2134a.C41500a.m164672d():int");
    }

    /* renamed from: e */
    public static long m164675e() {
        int myPid = Process.myPid();
        C45855f.m181663b("LiveCommonMonitorUtil", "[getAppCPUTime] pid: " + myPid);
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/" + myPid + "/stat")), 1000);
            try {
                String readLine = bufferedReader2.readLine();
                bufferedReader2.close();
                String[] split = readLine.split(" ");
                long parseLong = Long.parseLong(split[13]) + Long.parseLong(split[14]) + Long.parseLong(split[15]) + Long.parseLong(split[16]);
                C20172c.m73614a(bufferedReader2);
                return parseLong;
            } catch (Throwable unused) {
                bufferedReader = bufferedReader2;
                C20172c.m73614a(bufferedReader);
                return -1;
            }
        } catch (Throwable unused2) {
            C20172c.m73614a(bufferedReader);
            return -1;
        }
    }

    /* renamed from: a */
    public static boolean m164666a() {
        int i = f105490c;
        if (i == 0) {
            File file = new File("/proc/stat");
            if (!file.exists() || !file.canRead()) {
                f105490c = 2;
                return false;
            }
            f105490c = 1;
            return true;
        } else if (i == 1) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: e */
    public static int m164674e(Context context) {
        return ((BatteryManager) context.getSystemService("batterymanager")).getIntProperty(4);
    }

    /* renamed from: b */
    public static long m164669b(Context context) {
        if (context == null) {
            return -1;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return -1;
        }
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    /* renamed from: c */
    public static long m164671c(Context context) {
        if (context == null) {
            return -1;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return -1;
        }
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    /* renamed from: d */
    public static Boolean m164673d(Context context) {
        return Boolean.valueOf(((PowerManager) context.getSystemService("power")).isPowerSaveMode());
    }

    /* renamed from: g */
    public static float m164677g(Context context) {
        return ((float) m164665a(context, null, new IntentFilter("android.intent.action.BATTERY_CHANGED")).getIntExtra("temperature", -1)) / 10.0f;
    }

    /* renamed from: a */
    public static long m164663a(long j) {
        long j2;
        if (f105489b == -1) {
            if (Build.VERSION.SDK_INT >= 21) {
                j2 = Os.sysconf(OsConstants._SC_CLK_TCK);
            } else if (Build.VERSION.SDK_INT >= 14) {
                j2 = m164668b(j);
            } else {
                j2 = j;
            }
            if (j2 > 0) {
                j = j2;
            }
            f105489b = j;
        }
        return f105489b;
    }

    /* renamed from: f */
    public static boolean m164676f(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return ((BatteryManager) context.getSystemService("batterymanager")).isCharging();
        }
        int intExtra = m164665a(context, null, new IntentFilter("android.intent.action.BATTERY_CHANGED")).getIntExtra(UpdateKey.STATUS, -1);
        if (intExtra == 2 || intExtra == 5) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static long m164664a(Context context) {
        Debug.MemoryInfo memoryInfo;
        if (context == null) {
            return -1;
        }
        int myPid = Process.myPid();
        try {
            if (Build.VERSION.SDK_INT > 28) {
                memoryInfo = new Debug.MemoryInfo();
                Debug.getMemoryInfo(memoryInfo);
            } else {
                ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                if (activityManager == null) {
                    return -1;
                }
                memoryInfo = activityManager.getProcessMemoryInfo(new int[]{myPid})[0];
            }
            return (long) (memoryInfo.getTotalPss() * 1024);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    /* renamed from: b */
    private static long m164668b(long j) {
        try {
            int i = Class.forName("libcore.io.OsConstants").getField("_SC_CLK_TCK").getInt(null);
            Class<?> cls = Class.forName("libcore.io.Libcore");
            Class<?> cls2 = Class.forName("libcore.io.Os");
            Object obj = cls.getField("os").get(null);
            return ((Long) cls2.getMethod("sysconf", Integer.TYPE).invoke(obj, Integer.valueOf(i))).longValue();
        } catch (Exception unused) {
            return j;
        }
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    /* renamed from: a */
    public static Intent m164665a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }
}
