package com.bytedance.memory.p846b;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import java.io.File;
import java.math.BigDecimal;

/* renamed from: com.bytedance.memory.b.d */
public class C20066d {

    /* renamed from: a */
    private static long f49010a = -1;

    /* renamed from: b */
    private static long m73230b() {
        long j = f49010a;
        if (j != -1) {
            return j;
        }
        long maxMemory = Runtime.getRuntime().maxMemory();
        f49010a = maxMemory;
        return maxMemory;
    }

    /* renamed from: a */
    public static float m73226a() {
        float doubleValue = ((float) new BigDecimal(Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()).divide(new BigDecimal(m73230b()), 4, 4).doubleValue()) * 100.0f;
        C20063c.m73220a("currentRate %f", Float.valueOf(doubleValue));
        return doubleValue;
    }

    /* renamed from: a */
    public static boolean m73229a(Context context) {
        try {
            if ((context.getApplicationInfo().flags & 2) != 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static void m73228a(File file) {
        if (file != null && file.exists()) {
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                for (File file2 : listFiles) {
                    if (file2.isFile()) {
                        file2.delete();
                    } else if (file.isDirectory()) {
                        m73228a(file2);
                    }
                }
            }
            file.delete();
        }
    }

    /* renamed from: a */
    public static void m73227a(Context context, Class<?> cls, boolean z) {
        int i;
        if (cls != null) {
            ComponentName componentName = new ComponentName(context, cls);
            PackageManager packageManager = context.getPackageManager();
            if (z) {
                i = 1;
            } else {
                i = 2;
            }
            packageManager.setComponentEnabledSetting(componentName, i, 1);
        }
    }
}
