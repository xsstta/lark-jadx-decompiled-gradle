package com.huawei.updatesdk.p1046b.p1053e.p1054a;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.updatesdk.p1029a.p1030a.p1032b.p1033a.p1034a.C23834a;
import com.huawei.updatesdk.p1029a.p1039b.p1040a.C23854a;

/* renamed from: com.huawei.updatesdk.b.e.a.a */
public final class C23887a {

    /* renamed from: a */
    private static final String f59129a = "a";

    /* renamed from: b */
    private static String f59130b;

    /* renamed from: a */
    public static String m87344a() {
        String str = f59130b;
        if (str != null) {
            return str;
        }
        try {
            String packageName = C23854a.m87210c().mo85582a().getPackageName();
            PackageInfo packageInfo = C23854a.m87210c().mo85582a().getPackageManager().getPackageInfo(C23854a.m87210c().mo85582a().getPackageName(), 0);
            if (packageInfo != null) {
                packageName = packageName + packageInfo.versionName;
            }
            String str2 = Build.BRAND;
            if (TextUtils.isEmpty(str2)) {
                str2 = "other";
            }
            m87345a(packageName + "_" + str2);
            return f59130b;
        } catch (Exception e) {
            C23834a.m87118b(f59129a, "getUserAgent() " + e.toString());
            return null;
        }
    }

    /* renamed from: a */
    private static void m87345a(String str) {
        f59130b = str;
    }
}
