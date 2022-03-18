package com.bytedance.android.monitor.p112i;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.io.IOException;

/* renamed from: com.bytedance.android.monitor.i.d */
public class C2656d {
    /* renamed from: b */
    public static boolean m11165b() {
        try {
            return "mounted".equals(Environment.getExternalStorageState());
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m11162a() {
        String externalStorageState = Environment.getExternalStorageState();
        if ("mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m11163a(File file) {
        if (file == null) {
            return false;
        }
        return file.mkdirs();
    }

    /* renamed from: b */
    public static void m11164b(File file) {
        if (file != null && file.exists()) {
            file.delete();
        }
    }

    /* renamed from: d */
    public static void m11167d(File file) {
        if (file != null && !file.exists()) {
            file.mkdirs();
        }
    }

    /* renamed from: c */
    public static boolean m11166c(File file) {
        if (!m11168e(file)) {
            return false;
        }
        try {
            if (!file.exists()) {
                return file.createNewFile();
            }
            return true;
        } catch (IOException e) {
            C2655c.m11159a(e);
            return false;
        }
    }

    /* renamed from: e */
    private static boolean m11168e(File file) {
        File parentFile = file.getParentFile();
        if (parentFile == null || parentFile.exists()) {
            return true;
        }
        return m11163a(parentFile);
    }

    /* renamed from: a */
    public static File m11160a(Context context, String str) {
        if (context == null || !m11162a() || !m11165b()) {
            return null;
        }
        File externalFilesDir = context.getExternalFilesDir(str);
        m11167d(externalFilesDir);
        return externalFilesDir;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0036 A[SYNTHETIC, Splitter:B:28:0x0036] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0042 A[SYNTHETIC, Splitter:B:35:0x0042] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m11161a(java.lang.String r3, java.lang.String r4, boolean r5) {
        /*
            java.lang.Class<com.bytedance.android.monitor.i.d> r0 = com.bytedance.android.monitor.p112i.C2656d.class
            monitor-enter(r0)
            if (r3 != 0) goto L_0x0007
            monitor-exit(r0)
            return
        L_0x0007:
            if (r4 != 0) goto L_0x000b
            monitor-exit(r0)
            return
        L_0x000b:
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x004a }
            r1.<init>(r3)     // Catch:{ all -> 0x004a }
            r3 = 0
            boolean r2 = r1.exists()     // Catch:{ IOException -> 0x003f, all -> 0x0033 }
            if (r2 != 0) goto L_0x001a
            m11166c(r1)     // Catch:{ IOException -> 0x003f, all -> 0x0033 }
        L_0x001a:
            java.io.FileWriter r2 = new java.io.FileWriter     // Catch:{ IOException -> 0x003f, all -> 0x0033 }
            r2.<init>(r1, r5)     // Catch:{ IOException -> 0x003f, all -> 0x0033 }
            r2.write(r4)     // Catch:{ IOException -> 0x0031, all -> 0x002e }
            r2.flush()     // Catch:{ IOException -> 0x0031, all -> 0x002e }
            r2.close()     // Catch:{ IOException -> 0x0029 }
            goto L_0x0048
        L_0x0029:
            r3 = move-exception
        L_0x002a:
            r3.printStackTrace()
            goto L_0x0048
        L_0x002e:
            r4 = move-exception
            r3 = r2
            goto L_0x0034
        L_0x0031:
            r3 = r2
            goto L_0x0040
        L_0x0033:
            r4 = move-exception
        L_0x0034:
            if (r3 == 0) goto L_0x003e
            r3.close()     // Catch:{ IOException -> 0x003a }
            goto L_0x003e
        L_0x003a:
            r3 = move-exception
            r3.printStackTrace()
        L_0x003e:
            throw r4
        L_0x003f:
        L_0x0040:
            if (r3 == 0) goto L_0x0048
            r3.close()     // Catch:{ IOException -> 0x0046 }
            goto L_0x0048
        L_0x0046:
            r3 = move-exception
            goto L_0x002a
        L_0x0048:
            monitor-exit(r0)
            return
        L_0x004a:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.monitor.p112i.C2656d.m11161a(java.lang.String, java.lang.String, boolean):void");
    }
}
