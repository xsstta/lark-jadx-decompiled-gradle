package com.bytedance.tailor;

import android.os.Debug;
import com.C1711a;
import java.io.IOException;

public class Tailor {
    static native void nCloseProxy();

    static native void nCropHprof(String str, String str2, boolean z);

    static native void nDumpAsync(String str, boolean z);

    static native void nOpenProxy(String str, boolean z);

    static {
        C1711a.m7628a("tailor");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x002d A[SYNTHETIC, Splitter:B:19:0x002d] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0039 A[SYNTHETIC, Splitter:B:26:0x0039] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean isHprofValid(java.lang.String r7) {
        /*
            r0 = 0
            r1 = 0
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x0036, all -> 0x002a }
            java.lang.String r3 = "r"
            r2.<init>(r7, r3)     // Catch:{ IOException -> 0x0036, all -> 0x002a }
            long r3 = r2.length()     // Catch:{ IOException -> 0x0028, all -> 0x0025 }
            r5 = 9
            long r3 = r3 - r5
            r2.seek(r3)     // Catch:{ IOException -> 0x0028, all -> 0x0025 }
            byte r7 = r2.readByte()     // Catch:{ IOException -> 0x0028, all -> 0x0025 }
            r1 = 44
            if (r7 != r1) goto L_0x001c
            r0 = 1
        L_0x001c:
            r2.close()     // Catch:{ all -> 0x0020 }
            goto L_0x0024
        L_0x0020:
            r7 = move-exception
            r7.printStackTrace()
        L_0x0024:
            return r0
        L_0x0025:
            r7 = move-exception
            r1 = r2
            goto L_0x002b
        L_0x0028:
            r1 = r2
            goto L_0x0037
        L_0x002a:
            r7 = move-exception
        L_0x002b:
            if (r1 == 0) goto L_0x0035
            r1.close()     // Catch:{ all -> 0x0031 }
            goto L_0x0035
        L_0x0031:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0035:
            throw r7
        L_0x0036:
        L_0x0037:
            if (r1 == 0) goto L_0x0041
            r1.close()     // Catch:{ all -> 0x003d }
            goto L_0x0041
        L_0x003d:
            r7 = move-exception
            r7.printStackTrace()
        L_0x0041:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tailor.Tailor.isHprofValid(java.lang.String):boolean");
    }

    public static void dumpHprofDataAsync(String str, boolean z) {
        nDumpAsync(str, z);
    }

    public static synchronized void dumpHprofData(String str, boolean z) throws IOException {
        synchronized (Tailor.class) {
            nOpenProxy(str, z);
            Debug.dumpHprofData(str);
            nCloseProxy();
        }
    }

    public static void cropHprofData(String str, String str2, boolean z) throws IOException {
        if (isHprofValid(str)) {
            nCropHprof(str, str2, z);
            return;
        }
        throw new IOException("Bad hprof file " + str);
    }
}
