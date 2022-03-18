package com.bytedance.monitor.util;

import com.bytedance.monitor.util.p853a.C20166a;
import java.io.Closeable;
import java.io.File;
import java.util.zip.ZipFile;

/* renamed from: com.bytedance.monitor.util.c */
public class C20172c {
    /* renamed from: a */
    public static void m73614a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m73616a(ZipFile zipFile) {
        if (zipFile != null) {
            try {
                zipFile.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m73617a(String str) {
        return new File(str).mkdirs();
    }

    /* renamed from: a */
    public static void m73615a(String str, int i) {
        C20166a.m73591a("android.os.FileUtils", "setPermissions", str, Integer.valueOf(i), -1, -1);
    }
}
