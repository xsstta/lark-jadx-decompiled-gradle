package com.ss.android.lark.passport.infra.util;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.ss.android.lark.passport.infra.log.PassportLog;

/* renamed from: com.ss.android.lark.passport.infra.util.d */
public class C49185d {

    /* renamed from: a */
    private static final PassportLog f123470a = PassportLog.f123351c.mo171474a();

    /* renamed from: a */
    public static String m193925a() {
        return Build.MODEL;
    }

    /* renamed from: b */
    public static String m193927b() {
        return Build.VERSION.RELEASE;
    }

    /* renamed from: a */
    public static String m193926a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception e) {
            f123470a.mo171462a("AppUtils", "getAppVersion error", e);
            return "";
        }
    }

    /* renamed from: c */
    public static float m193929c(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.density;
    }

    /* renamed from: b */
    public static synchronized String m193928b(Context context) {
        String string;
        synchronized (C49185d.class) {
            try {
                string = context.getResources().getString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.labelRes);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        return string;
    }
}
