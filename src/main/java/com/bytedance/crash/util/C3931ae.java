package com.bytedance.crash.util;

import android.content.Context;
import android.os.Build;
import android.os.StatFs;
import com.bytedance.crash.C3774m;
import java.io.File;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.util.ae */
public class C3931ae {
    /* renamed from: a */
    private static long m16317a(long j) {
        return j;
    }

    /* renamed from: a */
    public static long m16316a() {
        return m16321b(C3774m.m15609j().getFilesDir());
    }

    /* renamed from: b */
    private static long m16320b() {
        return m16318a(C3774m.m15609j().getFilesDir());
    }

    /* renamed from: a */
    public static JSONObject m16319a(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("inner_free_real", m16317a(m16316a()));
            jSONObject.put("inner_total_real", m16317a(m16320b()));
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    private static long m16318a(File file) {
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
    private static long m16321b(File file) {
        try {
            StatFs statFs = new StatFs(file.getPath());
            if (Build.VERSION.SDK_INT >= 18) {
                return statFs.getFreeBytes();
            }
            return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
        } catch (Throwable unused) {
            return 0;
        }
    }
}
