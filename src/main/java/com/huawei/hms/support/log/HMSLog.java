package com.huawei.hms.support.log;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.huawei.hms.base.log.C23504a;

public class HMSLog {

    /* renamed from: a */
    public static final C23504a f58925a = new C23504a();

    public static boolean isErrorEnable() {
        return f58925a.mo82204a(6);
    }

    public static boolean isInfoEnable() {
        return f58925a.mo82204a(4);
    }

    public static boolean isWarnEnable() {
        return f58925a.mo82204a(5);
    }

    /* renamed from: a */
    public static String m86960a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 16384);
                return "HMS-" + packageInfo.versionName + "(" + packageInfo.versionCode + ")";
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return "HMS-[unknown-version]";
    }

    /* renamed from: d */
    public static void m86961d(String str, String str2) {
        f58925a.mo82201a(3, str, str2);
    }

    /* renamed from: e */
    public static void m86964e(String str, String str2) {
        f58925a.mo82201a(6, str, str2);
    }

    /* renamed from: i */
    public static void m86966i(String str, String str2) {
        f58925a.mo82201a(4, str, str2);
    }

    /* renamed from: w */
    public static void m86967w(String str, String str2) {
        f58925a.mo82201a(5, str, str2);
    }

    /* renamed from: e */
    public static void m86965e(String str, String str2, Throwable th) {
        f58925a.mo82205b(6, str, str2, th);
    }

    /* renamed from: e */
    public static void m86962e(String str, long j, String str2) {
        C23504a aVar = f58925a;
        aVar.mo82201a(6, str, "[" + j + "] " + str2);
    }

    public static void init(Context context, int i, String str) {
        C23504a aVar = f58925a;
        aVar.mo82202a(context, i, str);
        aVar.mo82203a(str, "============================================================================" + '\n' + "====== " + m86960a(context) + '\n' + "============================================================================");
    }

    /* renamed from: e */
    public static void m86963e(String str, long j, String str2, Throwable th) {
        C23504a aVar = f58925a;
        aVar.mo82205b(6, str, "[" + j + "] " + str2, th);
    }
}
