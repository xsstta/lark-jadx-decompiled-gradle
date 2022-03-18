package com.ss.ttm.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Environment;
import android.os.StatFs;

public class MemoryInfo {
    private static long[] mRomMemroy;
    private static long mTotalMemorySize;

    public static long[] getRomMemroy() {
        if (mRomMemroy == null) {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            mRomMemroy = new long[]{getTotalInternalMemorySize(), ((long) statFs.getBlockSize()) * ((long) statFs.getAvailableBlocks())};
        }
        return mRomMemroy;
    }

    public static long getTotalInternalMemorySize() {
        if (mTotalMemorySize == 0) {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            mTotalMemorySize = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        }
        return mTotalMemorySize;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004d A[SYNTHETIC, Splitter:B:24:0x004d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long getTolalMemory() {
        /*
            java.lang.String r0 = "/proc/meminfo"
            r1 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0023, all -> 0x0021 }
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ Exception -> 0x0023, all -> 0x0021 }
            r3.<init>(r0)     // Catch:{ Exception -> 0x0023, all -> 0x0021 }
            r0 = 8
            r2.<init>(r3, r0)     // Catch:{ Exception -> 0x0023, all -> 0x0021 }
            java.lang.String r0 = r2.readLine()     // Catch:{ Exception -> 0x001f }
            if (r0 == 0) goto L_0x0016
            r1 = r0
        L_0x0016:
            r2.close()     // Catch:{ Exception -> 0x001a }
            goto L_0x002d
        L_0x001a:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x002d
        L_0x001f:
            r0 = move-exception
            goto L_0x0025
        L_0x0021:
            r0 = move-exception
            goto L_0x004b
        L_0x0023:
            r0 = move-exception
            r2 = r1
        L_0x0025:
            r0.printStackTrace()     // Catch:{ all -> 0x0049 }
            if (r2 == 0) goto L_0x002d
            r2.close()
        L_0x002d:
            r0 = 58
            int r0 = r1.indexOf(r0)
            r2 = 107(0x6b, float:1.5E-43)
            int r2 = r1.indexOf(r2)
            int r0 = r0 + 1
            java.lang.String r0 = r1.substring(r0, r2)
            java.lang.String r0 = r0.trim()
            int r0 = java.lang.Integer.parseInt(r0)
            long r0 = (long) r0
            return r0
        L_0x0049:
            r0 = move-exception
            r1 = r2
        L_0x004b:
            if (r1 == 0) goto L_0x0055
            r1.close()     // Catch:{ Exception -> 0x0051 }
            goto L_0x0055
        L_0x0051:
            r1 = move-exception
            r1.printStackTrace()
        L_0x0055:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.utils.MemoryInfo.getTolalMemory():long");
    }

    public static long getAvailMemory(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem / 1024;
    }
}
