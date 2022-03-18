package com.ttnet.org.chromium.base;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import com.ttnet.org.chromium.base.annotations.JNINamespace;
import com.ttnet.org.chromium.base.metrics.CachedMetrics;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@JNINamespace("base::android")
public class SysUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static Integer sAmountOfPhysicalMemoryKB;
    private static Boolean sHighEndDiskDevice;
    private static Boolean sLowEndDevice;
    private static CachedMetrics.BooleanHistogramSample sLowEndMatches = new CachedMetrics.BooleanHistogramSample("Android.SysUtilsLowEndMatches");

    private static native void nativeLogPageFaultCountToTracing();

    private SysUtils() {
    }

    public static void logPageFaultCountToTracing() {
        nativeLogPageFaultCountToTracing();
    }

    public static void resetForTesting() {
        sLowEndDevice = null;
        sAmountOfPhysicalMemoryKB = null;
    }

    public static int amountOfPhysicalMemoryKB() {
        if (sAmountOfPhysicalMemoryKB == null) {
            sAmountOfPhysicalMemoryKB = Integer.valueOf(detectAmountOfPhysicalMemoryKB());
        }
        return sAmountOfPhysicalMemoryKB.intValue();
    }

    public static boolean isCurrentlyLowMemory() {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) ContextUtils.getApplicationContext().getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.lowMemory;
    }

    public static boolean isHighEndDiskDevice() {
        if (sHighEndDiskDevice == null) {
            sHighEndDiskDevice = Boolean.valueOf(detectHighEndDiskDevice());
        }
        return sHighEndDiskDevice.booleanValue();
    }

    public static boolean isLowEndDevice() {
        if (sLowEndDevice == null) {
            sLowEndDevice = Boolean.valueOf(detectLowEndDevice());
        }
        return sLowEndDevice.booleanValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002b, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002c, code lost:
        if (r1 != null) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0032, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0033, code lost:
        r2.addSuppressed(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0036, code lost:
        throw r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean detectHighEndDiskDevice() {
        /*
            r0 = 0
            com.ttnet.org.chromium.base.StrictModeContext r1 = com.ttnet.org.chromium.base.StrictModeContext.allowDiskReads()     // Catch:{ IllegalArgumentException -> 0x0037 }
            android.os.StatFs r2 = new android.os.StatFs     // Catch:{ all -> 0x0029 }
            java.io.File r3 = android.os.Environment.getDataDirectory()     // Catch:{ all -> 0x0029 }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ all -> 0x0029 }
            r2.<init>(r3)     // Catch:{ all -> 0x0029 }
            long r2 = r2.getTotalBytes()     // Catch:{ all -> 0x0029 }
            r4 = 1073741824(0x40000000, double:5.304989477E-315)
            long r2 = r2 / r4
            r4 = 24
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x0022
            r2 = 1
            goto L_0x0023
        L_0x0022:
            r2 = 0
        L_0x0023:
            if (r1 == 0) goto L_0x0028
            r1.close()
        L_0x0028:
            return r2
        L_0x0029:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x002b }
        L_0x002b:
            r3 = move-exception
            if (r1 == 0) goto L_0x0036
            r1.close()     // Catch:{ all -> 0x0032 }
            goto L_0x0036
        L_0x0032:
            r1 = move-exception
            r2.addSuppressed(r1)
        L_0x0036:
            throw r3
        L_0x0037:
            r1 = move-exception
            java.lang.String r2 = "SysUtils"
            java.lang.String r3 = "Cannot get disk data capacity"
            android.util.Log.v(r2, r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.SysUtils.detectHighEndDiskDevice():boolean");
    }

    /* JADX INFO: finally extract failed */
    private static int detectAmountOfPhysicalMemoryKB() {
        Pattern compile = Pattern.compile("^MemTotal:\\s+([0-9]+) kB$");
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            FileReader fileReader = new FileReader("/proc/meminfo");
            try {
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            Log.w("SysUtils", "/proc/meminfo lacks a MemTotal entry?");
                            break;
                        }
                        Matcher matcher = compile.matcher(readLine);
                        if (matcher.find()) {
                            int parseInt = Integer.parseInt(matcher.group(1));
                            if (parseInt <= 1024) {
                                Log.w("SysUtils", "Invalid /proc/meminfo total size in kB: " + matcher.group(1));
                            } else {
                                bufferedReader.close();
                                fileReader.close();
                                StrictMode.setThreadPolicy(allowThreadDiskReads);
                                return parseInt;
                            }
                        }
                    } catch (Throwable th) {
                        bufferedReader.close();
                        throw th;
                    }
                }
                bufferedReader.close();
            } finally {
                fileReader.close();
            }
        } catch (Exception e) {
            Log.w("SysUtils", "Cannot get total physical size from /proc/meminfo", e);
        } catch (Throwable th2) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th2;
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        return 0;
    }

    private static boolean detectLowEndDevice() {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (CommandLine.getInstance().hasSwitch("enable-low-end-device-mode")) {
            return true;
        }
        if (CommandLine.getInstance().hasSwitch("disable-low-end-device-mode")) {
            return false;
        }
        Integer valueOf = Integer.valueOf(detectAmountOfPhysicalMemoryKB());
        sAmountOfPhysicalMemoryKB = valueOf;
        if (valueOf.intValue() > 0 && (Build.VERSION.SDK_INT < 26 ? sAmountOfPhysicalMemoryKB.intValue() / 1024 <= 512 : sAmountOfPhysicalMemoryKB.intValue() / 1024 <= 1024)) {
            z = true;
        } else {
            z = false;
        }
        if (ContextUtils.getApplicationContext() == null || Build.VERSION.SDK_INT < 19) {
            z2 = false;
        } else {
            z2 = ((ActivityManager) ContextUtils.getApplicationContext().getSystemService("activity")).isLowRamDevice();
        }
        CachedMetrics.BooleanHistogramSample booleanHistogramSample = sLowEndMatches;
        if (z != z2) {
            z3 = false;
        }
        booleanHistogramSample.record(z3);
        return z;
    }

    public static boolean hasCamera(Context context) {
        PackageManager packageManager = context.getPackageManager();
        boolean hasSystemFeature = packageManager.hasSystemFeature("android.hardware.camera");
        if (Build.VERSION.SDK_INT >= 17) {
            return hasSystemFeature | packageManager.hasSystemFeature("android.hardware.camera.any");
        }
        return hasSystemFeature;
    }
}
