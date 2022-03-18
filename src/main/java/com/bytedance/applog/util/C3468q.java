package com.bytedance.applog.util;

import android.text.TextUtils;
import android.util.Base64;

/* renamed from: com.bytedance.applog.util.q */
public class C3468q {

    /* renamed from: a */
    private static String f10989a;

    /* renamed from: a */
    public static String m14662a() {
        if (TextUtils.isEmpty(f10989a)) {
            f10989a = m14663a("Ynl0ZWRhbmNl");
        }
        return f10989a;
    }

    /* renamed from: a */
    public static String m14663a(String str) {
        try {
            return new String(Base64.decode(str.getBytes("UTF-8"), 2));
        } catch (Exception unused) {
            return "";
        }
    }
}
