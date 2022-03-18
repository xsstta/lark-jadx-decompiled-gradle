package com.bytedance.ee.util.p701d;

import android.content.Context;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.util.d.f */
public class C13618f {
    /* renamed from: a */
    public static String m55265a(Context context) {
        String str;
        Exception e;
        String str2 = "";
        if (context != null) {
            try {
                str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                if (str != null) {
                    try {
                        if (str.length() > 0) {
                            str2 = str;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        C13479a.m54759a("VersionInfo", "Exception", e);
                        return str;
                    }
                }
                return str2;
            } catch (Exception e3) {
                e = e3;
                str = str2;
                C13479a.m54759a("VersionInfo", "Exception", e);
                return str;
            }
        }
        return str2;
    }
}
