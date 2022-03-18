package com.ss.android.vesdk;

import android.text.TextUtils;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.zip.ZipFile;

/* renamed from: com.ss.android.vesdk.r */
public class C64047r {
    /* renamed from: a */
    public static void m251367a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m251369a(ZipFile zipFile) {
        if (zipFile != null) {
            try {
                zipFile.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: b */
    public static boolean m251371b(String str) {
        return new File(str).mkdirs();
    }

    /* renamed from: c */
    public static boolean m251372c(String str) {
        if (str == null || (!str.startsWith("content:") && !str.startsWith("file:"))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m251370a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).exists();
    }

    /* renamed from: a */
    public static void m251368a(String str, int i) {
        C64084y.m251472a("android.os.FileUtils", "setPermissions", str, Integer.valueOf(i), -1, -1);
    }
}
