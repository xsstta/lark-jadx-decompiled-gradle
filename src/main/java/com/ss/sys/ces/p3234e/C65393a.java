package com.ss.sys.ces.p3234e;

import android.app.Application;
import android.content.Context;
import android.os.Environment;

/* renamed from: com.ss.sys.ces.e.a */
public class C65393a {
    /* renamed from: a */
    public static Application m256450a() {
        try {
            return (Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m256451a(Context context) {
        String str;
        try {
            str = context.getApplicationInfo().sourceDir;
        } catch (Throwable unused) {
            str = "";
        }
        return str == null ? "" : str.trim();
    }

    /* renamed from: b */
    public static String m256452b() {
        String str;
        try {
            str = Environment.getDataDirectory().getPath();
        } catch (Throwable unused) {
            str = null;
        }
        return str == null ? "" : str.trim();
    }

    /* renamed from: b */
    public static String m256453b(Context context) {
        String str;
        try {
            str = context.getFilesDir().getAbsolutePath();
        } catch (Throwable unused) {
            str = "";
        }
        return str == null ? "" : str.trim();
    }

    /* renamed from: c */
    public static String m256454c() {
        String str;
        try {
            str = Environment.getExternalStorageDirectory().getAbsolutePath();
        } catch (Throwable unused) {
            str = null;
        }
        return str == null ? "" : str.trim();
    }

    /* renamed from: c */
    public static String m256455c(Context context) {
        String str;
        try {
            str = context.getPackageName();
        } catch (Throwable unused) {
            str = "";
        }
        return str == null ? "" : str.trim();
    }

    /* renamed from: d */
    public static int m256456d(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: e */
    public static String m256457e(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return "";
        }
    }
}
