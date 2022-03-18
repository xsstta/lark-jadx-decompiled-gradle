package com.ss.android.lark.mm.apm.p2285a;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Debug;
import android.os.Environment;
import android.os.PowerManager;
import android.os.Process;
import android.os.StatFs;
import android.system.Os;
import android.system.OsConstants;
import android.text.TextUtils;
import com.bytedance.monitor.util.C20172c;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.lark.mm.p2288b.C45851c;
import com.ss.android.lark.mm.p2288b.C45855f;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import me.ele.lancet.base.annotations.Skip;

/* renamed from: com.ss.android.lark.mm.apm.a.a */
public class C45849a {

    /* renamed from: a */
    private static int f115659a = 0;

    /* renamed from: b */
    private static long f115660b = -1;

    /* renamed from: c */
    private static int f115661c = 0;

    /* renamed from: d */
    private static long f115662d = -1;

    /* renamed from: j */
    public static long m181625j() {
        return m181611a(Environment.getDataDirectory().getAbsolutePath());
    }

    /* renamed from: g */
    public static int m181622g() {
        try {
            BatteryManager batteryManager = (BatteryManager) C45851c.m181646a().getSystemService("batterymanager");
            if (batteryManager != null) {
                return batteryManager.getIntProperty(4);
            }
            C45855f.m181666e("MmCommonMonitorUtil", "[getPowerLevel]can not get system service BATTERY_SERVICE");
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: f */
    public static Boolean m181621f() {
        try {
            return Boolean.valueOf(((PowerManager) C45851c.m181646a().getSystemService("power")).isPowerSaveMode());
        } catch (Exception e) {
            C45855f.m181666e("MmCommonMonitorUtil", "isPowerSaving fail: " + e);
            return false;
        }
    }

    /* renamed from: i */
    public static float m181624i() {
        Intent a = m181612a(C45851c.m181646a(), null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (a != null) {
            return ((float) a.getIntExtra("temperature", -1)) / 10.0f;
        }
        C45855f.m181666e("MmCommonMonitorUtil", "[getDeviceTemperature]can not register receiver ACTION_BATTERY_CHANGED ");
        return BitmapDescriptorFactory.HUE_RED;
    }

    /* renamed from: b */
    public static long m181614b() {
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
    public static long m181617c() {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mm.apm.p2285a.C45849a.m181617c():long");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0037 A[Catch:{ all -> 0x0030, all -> 0x003b }] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized int m181619d() {
        /*
            java.lang.Class<com.ss.android.lark.mm.apm.a.a> r0 = com.ss.android.lark.mm.apm.p2285a.C45849a.class
            monitor-enter(r0)
            int r1 = com.ss.android.lark.mm.apm.p2285a.C45849a.f115659a     // Catch:{ all -> 0x003f }
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
            com.ss.android.lark.mm.apm.p2285a.C45849a.f115659a = r2     // Catch:{ all -> 0x003b }
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
            int r1 = com.ss.android.lark.mm.apm.p2285a.C45849a.f115659a
            monitor-exit(r0)
            return r1
        L_0x003f:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mm.apm.p2285a.C45849a.m181619d():int");
    }

    /* renamed from: e */
    public static long m181620e() {
        int myPid = Process.myPid();
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

    /* renamed from: h */
    public static boolean m181623h() {
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                BatteryManager batteryManager = (BatteryManager) C45851c.m181646a().getSystemService("batterymanager");
                if (batteryManager != null) {
                    return batteryManager.isCharging();
                }
                C45855f.m181666e("MmCommonMonitorUtil", "[isDeviceCharging]can not get system service BATTERY_SERVICE");
                return false;
            }
            Intent a = m181612a(C45851c.m181646a(), null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (a == null) {
                C45855f.m181666e("MmCommonMonitorUtil", "[isDeviceCharging]can not register receiver ACTION_BATTERY_CHANGED");
                return false;
            }
            int intExtra = a.getIntExtra(UpdateKey.STATUS, -1);
            if (intExtra == 2 || intExtra == 5) {
                return true;
            }
            return false;
        } catch (Exception e) {
            C45855f.m181666e("MmCommonMonitorUtil", "[isDeviceCharging] error: " + e);
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m181613a() {
        int i = f115661c;
        if (i == 0) {
            File file = new File("/proc/stat");
            if (!file.exists() || !file.canRead()) {
                f115661c = 2;
                return false;
            }
            f115661c = 1;
            return true;
        } else if (i == 1) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public static long m181611a(String str) {
        if (TextUtils.isEmpty(str)) {
            C45855f.m181666e("MmCommonMonitorUtil", "getAvailSpace path is emtpy!");
            return 0;
        }
        StatFs statFs = new StatFs(str);
        return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
    }

    /* renamed from: b */
    public static long m181616b(Context context) {
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
    public static long m181618c(Context context) {
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

    /* renamed from: a */
    public static long m181609a(long j) {
        long j2;
        if (f115660b == -1) {
            if (Build.VERSION.SDK_INT >= 21) {
                j2 = Os.sysconf(OsConstants._SC_CLK_TCK);
            } else if (Build.VERSION.SDK_INT >= 14) {
                j2 = m181615b(j);
            } else {
                j2 = j;
            }
            if (j2 > 0) {
                j = j2;
            }
            f115660b = j;
        }
        return f115660b;
    }

    /* renamed from: a */
    public static long m181610a(Context context) {
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
    private static long m181615b(long j) {
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
    public static Intent m181612a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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
