package com.ss.android.vc.p3069b.p3073d;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.os.Process;
import com.ss.android.vc.common.p3077b.C60700b;

/* renamed from: com.ss.android.vc.b.d.a */
public final class C60681a {
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x009d, code lost:
        if (r6 == null) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009f, code lost:
        r6.destroy();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e1, code lost:
        if (r6 != null) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e4, code lost:
        return r4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c6 A[SYNTHETIC, Splitter:B:34:0x00c6] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e8 A[SYNTHETIC, Splitter:B:42:0x00e8] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0105  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m235781a() {
        /*
        // Method dump skipped, instructions count: 265
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.p3069b.p3073d.C60681a.m235781a():long");
    }

    /* renamed from: b */
    public static long m235783b(Context context) {
        if (context == null) {
            return 0;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        C60700b.m235851b("OfflineApmCollector-SystemUsage", "[getSysFreeMemory]", "sys free memory: " + memoryInfo.availMem);
        return memoryInfo.availMem;
    }

    /* renamed from: a */
    public static long m235782a(Context context) {
        Debug.MemoryInfo memoryInfo;
        int myPid = Process.myPid();
        if (context == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT > 28) {
            memoryInfo = new Debug.MemoryInfo();
            Debug.getMemoryInfo(memoryInfo);
        } else {
            Debug.MemoryInfo[] processMemoryInfo = ((ActivityManager) context.getSystemService("activity")).getProcessMemoryInfo(new int[]{myPid});
            if (processMemoryInfo == null || processMemoryInfo.length == 0) {
                return 0;
            }
            memoryInfo = processMemoryInfo[0];
        }
        if (memoryInfo == null) {
            return 0;
        }
        long totalPss = (long) (memoryInfo.getTotalPss() * 1024);
        C60700b.m235851b("OfflineApmCollector-SystemUsage", "[getPidMemorySize]", "pid memory: " + totalPss);
        return totalPss;
    }
}
