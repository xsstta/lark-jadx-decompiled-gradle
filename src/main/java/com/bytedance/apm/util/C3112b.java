package com.bytedance.apm.util;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.system.Os;
import android.system.OsConstants;
import android.text.TextUtils;
import com.bytedance.apm.C2785b;
import com.bytedance.monitor.util.C20172c;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.bytedance.apm.util.b */
public class C3112b {

    /* renamed from: a */
    private static int f10014a = 0;

    /* renamed from: b */
    private static long f10015b = -1;

    /* renamed from: c */
    private static int f10016c = 0;

    /* renamed from: d */
    private static long f10017d = -1;

    /* renamed from: h */
    public static int m12954h() {
        return Process.myPid();
    }

    /* renamed from: j */
    public static long m12956j() {
        return m12957k() + m12940a(Environment.getRootDirectory());
    }

    /* renamed from: i */
    public static long m12955i() {
        if (f10017d == -1) {
            try {
                f10017d = Runtime.getRuntime().maxMemory();
            } catch (Exception unused) {
            }
        }
        return f10017d;
    }

    /* renamed from: k */
    protected static long m12957k() {
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                return m12940a(C3117e.m12979a(C2785b.m11735a()));
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: b */
    public static long m12945b() {
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

    /* JADX WARNING: Removed duplicated region for block: B:25:0x005c A[Catch:{ all -> 0x0056, all -> 0x0060 }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m12949c() {
        /*
            int r0 = m12950d()
            r1 = -1
            if (r0 > 0) goto L_0x0009
            return r1
        L_0x0009:
            r3 = 0
        L_0x000a:
            if (r3 >= r0) goto L_0x0060
            r4 = 0
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ all -> 0x0059 }
            java.io.FileReader r6 = new java.io.FileReader     // Catch:{ all -> 0x0059 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0059 }
            r7.<init>()     // Catch:{ all -> 0x0059 }
            java.lang.String r8 = "/sys/devices/system/cpu/cpu"
            r7.append(r8)     // Catch:{ all -> 0x0059 }
            r7.append(r3)     // Catch:{ all -> 0x0059 }
            java.lang.String r8 = "/cpufreq/stats/time_in_state"
            r7.append(r8)     // Catch:{ all -> 0x0059 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0059 }
            r6.<init>(r7)     // Catch:{ all -> 0x0059 }
            r7 = 50
            r5.<init>(r6, r7)     // Catch:{ all -> 0x0059 }
        L_0x002f:
            java.lang.String r4 = r5.readLine()     // Catch:{ all -> 0x0056 }
            if (r4 == 0) goto L_0x0050
            boolean r6 = r4.isEmpty()     // Catch:{ all -> 0x0056 }
            if (r6 == 0) goto L_0x003c
            goto L_0x0050
        L_0x003c:
            java.lang.String r6 = "\\s+"
            java.lang.String[] r4 = r4.split(r6)     // Catch:{ all -> 0x0056 }
            int r6 = r4.length     // Catch:{ all -> 0x0056 }
            r7 = 2
            if (r6 == r7) goto L_0x0047
            goto L_0x002f
        L_0x0047:
            r6 = 1
            r4 = r4[r6]     // Catch:{ all -> 0x0056 }
            long r6 = java.lang.Long.parseLong(r4)     // Catch:{ all -> 0x0056 }
            long r1 = r1 + r6
            goto L_0x002f
        L_0x0050:
            r5.close()     // Catch:{ all -> 0x0060 }
            int r3 = r3 + 1
            goto L_0x000a
        L_0x0056:
            r0 = move-exception
            r4 = r5
            goto L_0x005a
        L_0x0059:
            r0 = move-exception
        L_0x005a:
            if (r4 == 0) goto L_0x005f
            r4.close()     // Catch:{ all -> 0x0060 }
        L_0x005f:
            throw r0     // Catch:{ all -> 0x0060 }
        L_0x0060:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.util.C3112b.m12949c():long");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0037 A[Catch:{ all -> 0x0030, all -> 0x003b }] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized int m12950d() {
        /*
            java.lang.Class<com.bytedance.apm.util.b> r0 = com.bytedance.apm.util.C3112b.class
            monitor-enter(r0)
            int r1 = com.bytedance.apm.util.C3112b.f10014a     // Catch:{ all -> 0x003f }
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
            com.bytedance.apm.util.C3112b.f10014a = r2     // Catch:{ all -> 0x003b }
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
            int r1 = com.bytedance.apm.util.C3112b.f10014a
            monitor-exit(r0)
            return r1
        L_0x003f:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.util.C3112b.m12950d():int");
    }

    /* renamed from: e */
    public static long m12951e() {
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

    /* renamed from: f */
    public static long m12952f() {
        Throwable th;
        int myPid = Process.myPid();
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/" + myPid + "/stat")), 1000);
            try {
                String readLine = bufferedReader2.readLine();
                bufferedReader2.close();
                String[] split = readLine.split(" ");
                long parseLong = Long.parseLong(split[13]) + Long.parseLong(split[14]);
                C20172c.m73614a(bufferedReader2);
                return parseLong;
            } catch (Exception unused) {
                bufferedReader = bufferedReader2;
                C20172c.m73614a(bufferedReader);
                return -1;
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = bufferedReader2;
                C20172c.m73614a(bufferedReader);
                throw th;
            }
        } catch (Exception unused2) {
            C20172c.m73614a(bufferedReader);
            return -1;
        } catch (Throwable th3) {
            th = th3;
            C20172c.m73614a(bufferedReader);
            throw th;
        }
    }

    /* renamed from: g */
    public static long m12953g() {
        try {
            String[] split = m12943a(String.format("/proc/%s/status", Integer.valueOf(m12954h()))).trim().split("\n");
            for (String str : split) {
                if (str.startsWith("VmSize")) {
                    Matcher matcher = Pattern.compile("\\d+").matcher(str);
                    if (matcher.find()) {
                        return Long.parseLong(matcher.group());
                    }
                }
            }
            if (split.length > 12) {
                Matcher matcher2 = Pattern.compile("\\d+").matcher(split[12]);
                if (matcher2.find()) {
                    return Long.parseLong(matcher2.group());
                }
            }
        } catch (Exception unused) {
        }
        return -1;
    }

    /* renamed from: a */
    public static boolean m12944a() {
        int i = f10016c;
        if (i == 0) {
            File file = new File("/proc/stat");
            if (!file.exists() || !file.canRead()) {
                f10016c = 2;
                return false;
            }
            f10016c = 1;
            return true;
        } else if (i == 1) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public static long m12938a(long j) {
        long j2;
        if (f10015b == -1) {
            if (Build.VERSION.SDK_INT >= 21) {
                j2 = Os.sysconf(OsConstants._SC_CLK_TCK);
            } else if (Build.VERSION.SDK_INT >= 14) {
                j2 = m12946b(j);
            } else {
                j2 = j;
            }
            if (j2 > 0) {
                j = j2;
            }
            f10015b = j;
        }
        return f10015b;
    }

    /* renamed from: b */
    public static long m12947b(Context context) {
        long j;
        if (context == null) {
            return -1;
        }
        try {
            if (TextUtils.isEmpty(context.getPackageName())) {
                return -1;
            }
            File cacheDir = context.getCacheDir();
            long j2 = 0;
            if (cacheDir.exists()) {
                j = m12948b(cacheDir);
            } else {
                j = 0;
            }
            File externalCacheDir = C2785b.m11735a().getExternalCacheDir();
            if (externalCacheDir.exists()) {
                j2 = m12948b(externalCacheDir);
            }
            return j + j2;
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: a */
    public static long m12939a(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            File file = new File(context.getFilesDir().getParent());
            if (!file.exists()) {
                return -1;
            }
            long b = m12948b(file);
            File externalFilesDir = context.getExternalFilesDir(null);
            if (externalFilesDir != null) {
                File parentFile = externalFilesDir.getParentFile();
                long j = 0;
                if (parentFile.exists()) {
                    j = m12948b(parentFile);
                }
                return b + j;
            }
            return -1;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static long m12940a(File file) {
        try {
            StatFs statFs = new StatFs(file.getPath());
            if (Build.VERSION.SDK_INT >= 18) {
                return statFs.getTotalBytes();
            }
            return ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: b */
    private static long m12946b(long j) {
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

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m12942a(java.io.InputStream r4) throws java.lang.Exception {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x002a }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ all -> 0x002a }
            r3.<init>(r4)     // Catch:{ all -> 0x002a }
            r2.<init>(r3)     // Catch:{ all -> 0x002a }
        L_0x0010:
            java.lang.String r4 = r2.readLine()     // Catch:{ all -> 0x0027 }
            if (r4 == 0) goto L_0x001f
            r0.append(r4)     // Catch:{ all -> 0x0027 }
            r4 = 10
            r0.append(r4)     // Catch:{ all -> 0x0027 }
            goto L_0x0010
        L_0x001f:
            r2.close()
            java.lang.String r4 = r0.toString()
            return r4
        L_0x0027:
            r4 = move-exception
            r1 = r2
            goto L_0x002b
        L_0x002a:
            r4 = move-exception
        L_0x002b:
            if (r1 == 0) goto L_0x0030
            r1.close()
        L_0x0030:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.util.C3112b.m12942a(java.io.InputStream):java.lang.String");
    }

    /* renamed from: b */
    public static long m12948b(File file) {
        long j;
        File[] listFiles = file.listFiles();
        long j2 = 0;
        if (listFiles == null) {
            return 0;
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                j = m12948b(file2);
            } else {
                j = file2.length();
            }
            j2 += j;
        }
        return j2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m12943a(java.lang.String r2) throws java.lang.Exception {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            r2 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x0015 }
            r1.<init>(r0)     // Catch:{ all -> 0x0015 }
            java.lang.String r2 = m12942a(r1)     // Catch:{ all -> 0x0013 }
            r1.close()
            return r2
        L_0x0013:
            r2 = move-exception
            goto L_0x0018
        L_0x0015:
            r0 = move-exception
            r1 = r2
            r2 = r0
        L_0x0018:
            if (r1 == 0) goto L_0x001d
            r1.close()
        L_0x001d:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.util.C3112b.m12943a(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public static Debug.MemoryInfo m12941a(int i, Context context) {
        if (context == null) {
            return null;
        }
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null) {
                return null;
            }
            return activityManager.getProcessMemoryInfo(new int[]{i})[0];
        } catch (Exception unused) {
            return null;
        }
    }
}
