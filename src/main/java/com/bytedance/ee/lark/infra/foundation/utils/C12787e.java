package com.bytedance.ee.lark.infra.foundation.utils;

import android.content.Context;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;

/* renamed from: com.bytedance.ee.lark.infra.foundation.utils.e */
public class C12787e {
    /* renamed from: a */
    public static String m52853a(Context context) {
        String str;
        Exception e;
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            if (str != null) {
                try {
                    if (str.length() <= 0) {
                        return "";
                    }
                    return str;
                } catch (Exception e2) {
                    e = e2;
                    AppBrandLogger.m52829e("VersionInfo", "Exception", e);
                    return str;
                }
            }
            return "";
        } catch (Exception e3) {
            e = e3;
            str = "";
            AppBrandLogger.m52829e("VersionInfo", "Exception", e);
            return str;
        }
    }
}
