package com.ss.android.lark.platform.statistics;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.platform.statistics.b */
public class C51957b {

    /* renamed from: a */
    private static final FileFilter f129014a = new FileFilter() {
        /* class com.ss.android.lark.platform.statistics.C51957b.C519581 */

        public boolean accept(File file) {
            String name = file.getName();
            if (!name.startsWith("cpu")) {
                return false;
            }
            for (int i = 3; i < name.length(); i++) {
                if (!Character.isDigit(name.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
    };

    /* renamed from: c */
    public static long m201524c() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
    }

    /* renamed from: b */
    public static long m201522b() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
    }

    /* renamed from: e */
    public static int m201526e() {
        try {
            int a = m201516a("/sys/devices/system/cpu/possible");
            if (a == -1) {
                a = m201516a("/sys/devices/system/cpu/present");
            }
            if (a == -1) {
                return new File("/sys/devices/system/cpu/").listFiles(f129014a).length;
            }
            return a;
        } catch (NullPointerException | SecurityException unused) {
            return -1;
        }
    }

    /* renamed from: f */
    public static String m201527f() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/cpuinfo"));
            String str = "";
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                str = readLine;
            }
            if (str.contains("Hardware")) {
                return str.split(":\\s+", 2)[1];
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        return Build.HARDWARE;
    }

    /* renamed from: d */
    public static int m201525d() {
        int i = -1;
        for (int i2 = 0; i2 < m201526e(); i2++) {
            try {
                File file = new File("/sys/devices/system/cpu/cpu" + i2 + "/cpufreq/cpuinfo_max_freq");
                if (file.exists() && file.canRead()) {
                    byte[] bArr = new byte[SmActions.ACTION_ONTHECALL_EXIT];
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        fileInputStream.read(bArr);
                        int i3 = 0;
                        while (Character.isDigit(bArr[i3]) && i3 < 128) {
                            i3++;
                        }
                        Integer valueOf = Integer.valueOf(Integer.parseInt(new String(bArr, 0, i3)));
                        if (valueOf.intValue() > i) {
                            i = valueOf.intValue();
                        }
                    } catch (NumberFormatException e) {
                        Log.m165384e("DeviceInfoHitPoint", "getCPUMaxFreqKHz failed!", e);
                    } catch (Throwable th) {
                        fileInputStream.close();
                        throw th;
                    }
                    fileInputStream.close();
                }
            } catch (IOException unused) {
                return -1;
            }
        }
        if (i == -1) {
            FileInputStream fileInputStream2 = new FileInputStream("/proc/cpuinfo");
            try {
                int a = m201517a("cpu MHz", fileInputStream2) * 1000;
                if (a > i) {
                    i = a;
                }
            } finally {
                fileInputStream2.close();
            }
        }
        return i;
    }

    /* renamed from: a */
    public static void m201520a() {
        try {
            String f = m201527f();
            long d = (long) m201525d();
            long e = (long) m201526e();
            long a = m201519a(LarkContext.getApplication());
            long b = m201523b(LarkContext.getApplication());
            long b2 = m201522b();
            long c = m201524c();
            Log.m165389i("DeviceInfoHitPoint", "totalMem = " + a + ", availMemory = " + b + ", cpuCores = " + e + ", cpuMaxFreqKHz = " + d + ", cpuName =" + f + ", totalInternalMem =" + b2 + ", availInternalMen =" + c);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cpu_name", f);
            jSONObject.put("cpu_core_numbers", e);
            jSONObject.put("max_cpu_freq", d);
            jSONObject.put("total_ram", a);
            jSONObject.put("available_ram", b);
            jSONObject.put("total_rom", b2);
            jSONObject.put("available_rom", c);
            Statistics.sendEvent("performance_related_device_info", jSONObject);
        } catch (Exception e2) {
            Log.m165384e("DeviceInfoHitPoint", "reportDeviceInfo Failed!", e2);
        }
    }

    /* renamed from: a */
    public static long m201519a(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    /* renamed from: b */
    private static int m201521b(String str) {
        if (str == null || !str.matches("0-[\\d]+$")) {
            return -1;
        }
        return Integer.valueOf(str.substring(2)).intValue() + 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0027 A[SYNTHETIC, Splitter:B:15:0x0027] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x002f A[SYNTHETIC, Splitter:B:22:0x002f] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m201516a(java.lang.String r2) {
        /*
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x002b, all -> 0x0024 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x002b, all -> 0x0024 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0022, all -> 0x001f }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0022, all -> 0x001f }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0022, all -> 0x001f }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0022, all -> 0x001f }
            java.lang.String r0 = r2.readLine()     // Catch:{ IOException -> 0x0022, all -> 0x001f }
            r2.close()     // Catch:{ IOException -> 0x0022, all -> 0x001f }
            int r2 = m201521b(r0)     // Catch:{ IOException -> 0x0022, all -> 0x001f }
            r1.close()     // Catch:{ IOException -> 0x001e }
        L_0x001e:
            return r2
        L_0x001f:
            r2 = move-exception
            r0 = r1
            goto L_0x0025
        L_0x0022:
            r0 = r1
            goto L_0x002c
        L_0x0024:
            r2 = move-exception
        L_0x0025:
            if (r0 == 0) goto L_0x002a
            r0.close()     // Catch:{ IOException -> 0x002a }
        L_0x002a:
            throw r2
        L_0x002b:
        L_0x002c:
            r2 = -1
            if (r0 == 0) goto L_0x0032
            r0.close()     // Catch:{ IOException -> 0x0032 }
        L_0x0032:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.platform.statistics.C51957b.m201516a(java.lang.String):int");
    }

    /* renamed from: b */
    public static long m201523b(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    /* renamed from: a */
    private static int m201517a(String str, FileInputStream fileInputStream) {
        byte[] bArr = new byte[1024];
        try {
            int read = fileInputStream.read(bArr);
            int i = 0;
            while (i < read) {
                if (bArr[i] == 10 || i == 0) {
                    if (bArr[i] == 10) {
                        i++;
                    }
                    int i2 = i;
                    while (true) {
                        if (i2 >= read) {
                            continue;
                            break;
                        }
                        int i3 = i2 - i;
                        if (bArr[i2] != str.charAt(i3)) {
                            break;
                        } else if (i3 == str.length() - 1) {
                            return m201518a(bArr, i2);
                        } else {
                            i2++;
                        }
                    }
                }
                i++;
            }
            return -1;
        } catch (IOException | NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: a */
    private static int m201518a(byte[] bArr, int i) {
        while (i < bArr.length && bArr[i] != 10) {
            if (Character.isDigit(bArr[i])) {
                int i2 = i + 1;
                while (i2 < bArr.length && Character.isDigit(bArr[i2])) {
                    i2++;
                }
                return Integer.parseInt(new String(bArr, 0, i, i2 - i));
            }
            i++;
        }
        return -1;
    }
}
