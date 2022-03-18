package com.bytedance.crash.util;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.crash.entity.C3742b;
import com.bytedance.crash.p218b.C3696c;
import com.bytedance.crash.runtime.p227a.C3824a;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.util.b */
public final class C3933b {

    /* renamed from: a */
    private static String f12029a;

    /* renamed from: b */
    private static Class<?> f12030b;

    /* renamed from: c */
    private static Field f12031c;

    /* renamed from: d */
    private static Field f12032d;

    /* renamed from: e */
    private static boolean f12033e;

    /* renamed from: a */
    private static long m16324a(int i) {
        if (i < 0) {
            return 0;
        }
        return ((long) i) * 1024;
    }

    /* renamed from: a */
    private static long m16325a(long j) {
        return j;
    }

    /* renamed from: a */
    public static String m16327a() {
        String str = f12029a;
        if (str != null) {
            return str;
        }
        return "";
    }

    /* renamed from: b */
    private static String m16334b() {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/" + Process.myPid() + "/cmdline"), "iso-8859-1"));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    int read = bufferedReader.read();
                    if (read > 0) {
                        sb.append((char) read);
                    } else {
                        String sb2 = sb.toString();
                        C3954p.m16437a(bufferedReader);
                        return sb2;
                    }
                }
            } catch (Throwable unused) {
                C3954p.m16437a(bufferedReader);
                return null;
            }
        } catch (Throwable unused2) {
            bufferedReader = null;
            C3954p.m16437a(bufferedReader);
            return null;
        }
    }

    /* renamed from: a */
    public static void m16329a(String str) {
        f12029a = str;
    }

    /* renamed from: d */
    public static String m16338d(Context context) {
        Class<?> g = m16341g(context);
        if (f12031c == null && g != null) {
            try {
                f12031c = g.getDeclaredField("VERSION_NAME");
            } catch (NoSuchFieldException unused) {
            }
        }
        Field field = f12031c;
        if (field == null) {
            return "";
        }
        try {
            return String.valueOf(field.get(null));
        } catch (Throwable unused2) {
            return "";
        }
    }

    /* renamed from: e */
    public static int m16339e(Context context) {
        Class<?> g = m16341g(context);
        if (f12032d == null && g != null) {
            try {
                f12032d = g.getDeclaredField("VERSION_CODE");
            } catch (NoSuchFieldException unused) {
            }
        }
        Field field = f12032d;
        if (field == null) {
            return -1;
        }
        try {
            return ((Integer) field.get(null)).intValue();
        } catch (Throwable unused2) {
            return -1;
        }
    }

    /* renamed from: g */
    private static Class<?> m16341g(Context context) {
        if (f12030b == null && !f12033e) {
            try {
                f12030b = Class.forName(context.getPackageName() + ".BuildConfig");
            } catch (ClassNotFoundException unused) {
            }
            f12033e = true;
        }
        return f12030b;
    }

    /* renamed from: c */
    public static String m16337c(Context context) {
        if (!TextUtils.isEmpty(f12029a)) {
            return f12029a;
        }
        try {
            int myPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                    if (runningAppProcessInfo.pid == myPid) {
                        String str = runningAppProcessInfo.processName;
                        f12029a = str;
                        return str;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        String b = m16334b();
        f12029a = b;
        if (b == null) {
            return "";
        }
        return b;
    }

    /* renamed from: f */
    private static boolean m16340f(Context context) {
        ComponentName componentName;
        String packageName = context.getPackageName();
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null) {
                return false;
            }
            if (Build.VERSION.SDK_INT < 21) {
                List<ActivityManager.RunningTaskInfo> runningTasks = activityManager.getRunningTasks(1);
                if (runningTasks == null || runningTasks.isEmpty() || (componentName = runningTasks.get(0).topActivity) == null || !packageName.equals(componentName.getPackageName())) {
                    return false;
                }
                return true;
            }
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.importance == 100) {
                        return packageName.equals(runningAppProcessInfo.pkgList[0]);
                    }
                }
            }
            return false;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private static void m16330a(JSONObject jSONObject) throws JSONException {
        Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
        Debug.getMemoryInfo(memoryInfo);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("dalvikPrivateDirty", m16324a(memoryInfo.dalvikPrivateDirty));
        jSONObject2.put("dalvikPss", m16324a(memoryInfo.dalvikPss));
        jSONObject2.put("dalvikSharedDirty", m16324a(memoryInfo.dalvikSharedDirty));
        jSONObject2.put("nativePrivateDirty", m16324a(memoryInfo.nativePrivateDirty));
        jSONObject2.put("nativePss", m16324a(memoryInfo.nativePss));
        jSONObject2.put("nativeSharedDirty", m16324a(memoryInfo.nativeSharedDirty));
        jSONObject2.put("otherPrivateDirty", m16324a(memoryInfo.otherPrivateDirty));
        jSONObject2.put("otherPss", m16324a(memoryInfo.otherPss));
        jSONObject2.put("otherSharedDirty", memoryInfo.otherSharedDirty);
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                String memoryStat = memoryInfo.getMemoryStat("summary.graphics");
                if (!TextUtils.isEmpty(memoryStat)) {
                    jSONObject2.put("summary.graphics", m16324a(Integer.parseInt(memoryStat)));
                }
            } catch (Throwable unused) {
            }
        }
        jSONObject2.put("totalPrivateClean", C3938f.m16356a(memoryInfo));
        jSONObject2.put("totalPrivateDirty", memoryInfo.getTotalPrivateDirty());
        jSONObject2.put("totalPss", m16324a(memoryInfo.getTotalPss()));
        jSONObject2.put("totalSharedClean", C3938f.m16357b(memoryInfo));
        jSONObject2.put("totalSharedDirty", m16324a(memoryInfo.getTotalSharedDirty()));
        jSONObject2.put("totalSwappablePss", m16324a(C3938f.m16358c(memoryInfo)));
        jSONObject.put("memory_info", jSONObject2);
    }

    /* renamed from: b */
    public static boolean m16336b(Context context) {
        String c = m16337c(context);
        if (c != null && c.contains(":")) {
            return false;
        }
        if (c != null && c.equals(context.getPackageName())) {
            return true;
        }
        if (c == null || !c.equals(context.getApplicationInfo().processName)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m16332a(Context context) {
        if (context == null) {
            return !C3824a.m15819d().mo15401f();
        }
        if (C3824a.m15819d().mo15401f() || m16340f(context)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m16328a(Context context, JSONObject jSONObject) {
        try {
            m16330a(jSONObject);
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                m16335b(jSONObject, activityManager);
            }
            m16331a(jSONObject, activityManager);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    private static void m16335b(JSONObject jSONObject, ActivityManager activityManager) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        jSONObject2.put("availMem", m16325a(memoryInfo.availMem));
        jSONObject2.put("lowMemory", memoryInfo.lowMemory);
        jSONObject2.put("threshold", memoryInfo.threshold);
        jSONObject2.put("totalMem", m16325a(C3958s.m16477a(memoryInfo)));
        jSONObject.put("sys_memory_info", jSONObject2);
    }

    /* renamed from: a */
    public static ActivityManager.ProcessErrorStateInfo m16326a(Context context, int i) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return null;
        }
        Process.myPid();
        int i2 = 0;
        while (i2 < i) {
            List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
            if (processesInErrorState != null) {
                for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                    if (processErrorStateInfo.condition == 2) {
                        return processErrorStateInfo;
                    }
                }
            }
            i2++;
            if (i == i2 || C3696c.m15234a()) {
                break;
            }
            SystemClock.sleep(200);
        }
        return null;
    }

    /* renamed from: a */
    private static void m16331a(JSONObject jSONObject, ActivityManager activityManager) throws JSONException {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        String str;
        JSONObject jSONObject2 = new JSONObject();
        long nativeHeapAllocatedSize = Debug.getNativeHeapAllocatedSize() / 1048576;
        boolean z5 = true;
        if (nativeHeapAllocatedSize > 200) {
            z = true;
        } else {
            z = false;
        }
        C3742b.m15432a(jSONObject, "filters", "native_heap_leak", String.valueOf(z));
        if (nativeHeapAllocatedSize > 300) {
            z2 = true;
        } else {
            z2 = false;
        }
        C3742b.m15432a(jSONObject, "filters", "native_heap_leak_300M", String.valueOf(z2));
        if (nativeHeapAllocatedSize > 500) {
            z3 = true;
        } else {
            z3 = false;
        }
        C3742b.m15432a(jSONObject, "filters", "native_heap_leak_500M", String.valueOf(z3));
        if (nativeHeapAllocatedSize > 800) {
            z4 = true;
        } else {
            z4 = false;
        }
        C3742b.m15432a(jSONObject, "filters", "native_heap_leak_800M", String.valueOf(z4));
        jSONObject2.put("native_heap_size", Debug.getNativeHeapSize());
        jSONObject2.put("native_heap_alloc_size", Debug.getNativeHeapAllocatedSize());
        jSONObject2.put("native_heap_free_size", Debug.getNativeHeapFreeSize());
        Runtime runtime = Runtime.getRuntime();
        long maxMemory = runtime.maxMemory();
        long freeMemory = runtime.freeMemory();
        long j = runtime.totalMemory();
        jSONObject2.put("max_memory", maxMemory);
        jSONObject2.put("free_memory", freeMemory);
        jSONObject2.put("total_memory", j);
        float f = (float) (j - freeMemory);
        float f2 = (float) maxMemory;
        int i = (f > (0.95f * f2) ? 1 : (f == (0.95f * f2) ? 0 : -1));
        if (i > 0) {
            str = ">95%";
        } else if (f > 0.85f * f2) {
            str = "(85%-95%]";
        } else if (f > 0.75f * f2) {
            str = "(75%-85%]";
        } else if (f > 0.65f * f2) {
            str = "(65%-75%]";
        } else if (f > f2 * 0.5f) {
            str = "(50%-65%]";
        } else {
            str = "<=50%";
        }
        if (i <= 0) {
            z5 = false;
        }
        C3742b.m15432a(jSONObject, "filters", "java_heap_leak", String.valueOf(z5));
        C3742b.m15432a(jSONObject, "filters", "java_heap_usage", str);
        if (activityManager != null) {
            jSONObject2.put("memory_class", activityManager.getMemoryClass());
            jSONObject2.put("large_memory_class", activityManager.getLargeMemoryClass());
        }
        jSONObject.put("app_memory_info", jSONObject2);
    }

    /* renamed from: a */
    public static boolean m16333a(Context context, String str) {
        if (str != null && str.equals(context.getPackageName())) {
            return true;
        }
        if (str == null || !str.equals(context.getApplicationInfo().processName)) {
            return false;
        }
        return true;
    }
}
