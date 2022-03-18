package com.huawei.updatesdk.service.otaupdate;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;

/* renamed from: com.huawei.updatesdk.service.otaupdate.g */
public final class C23935g {

    /* renamed from: a */
    private static String f59210a;

    /* renamed from: b */
    private static Resources f59211b;

    /* renamed from: a */
    public static int m87501a(Context context, String str) {
        return m87502a(context, str, "color");
    }

    /* renamed from: a */
    private static int m87502a(Context context, String str, String str2) {
        if (f59211b == null) {
            f59211b = context.getResources();
        }
        return f59211b.getIdentifier(str, str2, m87503a(context));
    }

    /* renamed from: a */
    private static String m87503a(Context context) {
        if (f59210a == null) {
            f59210a = context.getPackageName();
        }
        return f59210a;
    }

    /* renamed from: b */
    public static int m87504b(Context context, String str) {
        return m87502a(context, str, "drawable");
    }

    /* renamed from: c */
    public static int m87505c(Context context, String str) {
        return m87502a(context, str, "id");
    }

    /* renamed from: d */
    public static int m87506d(Context context, String str) {
        return m87502a(context, str, "layout");
    }

    /* renamed from: e */
    public static int m87507e(Context context, String str) {
        return m87502a(context, str, "string");
    }

    /* renamed from: f */
    public static String m87508f(Context context, String str) {
        try {
            return context.getResources().getString(m87502a(context, str, "string"));
        } catch (Resources.NotFoundException unused) {
            Log.e("UpdateSDK", "recource get error name: " + str);
            return "";
        }
    }
}
