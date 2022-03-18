package com.ss.android.lark.passport.infra.util;

import android.content.Context;
import android.content.pm.PackageManager;
import com.ss.android.lark.passport.infra.log.PassportLog;

/* renamed from: com.ss.android.lark.passport.infra.util.b */
public class C49159b {

    /* renamed from: a */
    private static final PassportLog f123442a = PassportLog.f123351c.mo171474a();

    /* renamed from: a */
    public static String m193851a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            f123442a.mo171462a("signinsdk_ApkUtils", "init error", e);
            return null;
        } catch (Exception e2) {
            f123442a.mo171462a("signinsdk_ApkUtils", "init error", e2);
            return null;
        }
    }

    /* renamed from: b */
    public static String m193852b(Context context) {
        try {
            return context.getResources().getString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.labelRes);
        } catch (Exception e) {
            f123442a.mo171471d("signinsdk_ApkUtils", e.getMessage());
            return "";
        }
    }
}
